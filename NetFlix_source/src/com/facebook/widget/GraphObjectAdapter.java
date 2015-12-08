// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.model.GraphObject;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.facebook.widget:
//            ImageDownloader, ImageResponse, ImageRequest, GraphObjectCursor

class GraphObjectAdapter extends BaseAdapter
    implements SectionIndexer
{
    public static interface DataNeededListener
    {

        public abstract void onDataNeeded();
    }

    static interface Filter
    {

        public abstract boolean includeItem(Object obj);
    }

    private static interface ItemPicture
        extends GraphObject
    {

        public abstract ItemPictureData getData();
    }

    private static interface ItemPictureData
        extends GraphObject
    {

        public abstract String getUrl();
    }

    public static interface OnErrorListener
    {

        public abstract void onError(GraphObjectAdapter graphobjectadapter, FacebookException facebookexception);
    }

    public static class SectionAndItem
    {

        public GraphObject graphObject;
        public String sectionKey;

        public Type getType()
        {
            if (sectionKey == null)
            {
                return Type.ACTIVITY_CIRCLE;
            }
            if (graphObject == null)
            {
                return Type.SECTION_HEADER;
            } else
            {
                return Type.GRAPH_OBJECT;
            }
        }

        public SectionAndItem(String s, GraphObject graphobject)
        {
            sectionKey = s;
            graphObject = graphobject;
        }
    }

    public static final class SectionAndItem.Type extends Enum
    {

        private static final SectionAndItem.Type $VALUES[];
        public static final SectionAndItem.Type ACTIVITY_CIRCLE;
        public static final SectionAndItem.Type GRAPH_OBJECT;
        public static final SectionAndItem.Type SECTION_HEADER;

        public static SectionAndItem.Type valueOf(String s)
        {
            return (SectionAndItem.Type)Enum.valueOf(com/facebook/widget/GraphObjectAdapter$SectionAndItem$Type, s);
        }

        public static SectionAndItem.Type[] values()
        {
            return (SectionAndItem.Type[])$VALUES.clone();
        }

        static 
        {
            GRAPH_OBJECT = new SectionAndItem.Type("GRAPH_OBJECT", 0);
            SECTION_HEADER = new SectionAndItem.Type("SECTION_HEADER", 1);
            ACTIVITY_CIRCLE = new SectionAndItem.Type("ACTIVITY_CIRCLE", 2);
            $VALUES = (new SectionAndItem.Type[] {
                GRAPH_OBJECT, SECTION_HEADER, ACTIVITY_CIRCLE
            });
        }

        private SectionAndItem.Type(String s, int i)
        {
            super(s, i);
        }
    }


    static final boolean $assertionsDisabled;
    private static final int ACTIVITY_CIRCLE_VIEW_TYPE = 2;
    private static final int DISPLAY_SECTIONS_THRESHOLD = 1;
    private static final int GRAPH_OBJECT_VIEW_TYPE = 1;
    private static final int HEADER_VIEW_TYPE = 0;
    private static final String ID = "id";
    private static final int MAX_PREFETCHED_PICTURES = 20;
    private static final String NAME = "name";
    private static final String PICTURE = "picture";
    private Context context;
    private GraphObjectCursor cursor;
    private DataNeededListener dataNeededListener;
    private boolean displaySections;
    private Filter filter;
    private Map graphObjectsById;
    private Map graphObjectsBySection;
    private String groupByField;
    private final LayoutInflater inflater;
    private OnErrorListener onErrorListener;
    private final Map pendingRequests = new HashMap();
    private Map prefetchedPictureCache;
    private ArrayList prefetchedProfilePictureIds;
    private List sectionKeys;
    private boolean showCheckbox;
    private boolean showPicture;
    private List sortFields;

    public GraphObjectAdapter(Context context1)
    {
        sectionKeys = new ArrayList();
        graphObjectsBySection = new HashMap();
        graphObjectsById = new HashMap();
        prefetchedPictureCache = new HashMap();
        prefetchedProfilePictureIds = new ArrayList();
        context = context1;
        inflater = LayoutInflater.from(context1);
    }

    private void callOnErrorListener(Exception exception)
    {
        if (onErrorListener != null)
        {
            Object obj = exception;
            if (!(exception instanceof FacebookException))
            {
                obj = new FacebookException(exception);
            }
            onErrorListener.onError(this, (FacebookException)obj);
        }
    }

    private static int compareGraphObjects(GraphObject graphobject, GraphObject graphobject1, Collection collection, Collator collator)
    {
label0:
        {
            collection = collection.iterator();
            String s;
            String s1;
label1:
            do
            {
                int i;
                do
                {
                    if (!collection.hasNext())
                    {
                        break label0;
                    }
                    s1 = (String)collection.next();
                    s = (String)graphobject.getProperty(s1);
                    s1 = (String)graphobject1.getProperty(s1);
                    if (s == null || s1 == null)
                    {
                        continue label1;
                    }
                    i = collator.compare(s, s1);
                } while (i == 0);
                return i;
            } while (s == null && s1 == null);
            byte byte0;
            if (s == null)
            {
                byte0 = -1;
            } else
            {
                byte0 = 1;
            }
            return byte0;
        }
        return 0;
    }

    private void downloadProfilePicture(final String profileId, URL url, final ImageView imageView)
    {
        if (url != null)
        {
            boolean flag;
            if (imageView == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || !url.equals(imageView.getTag()))
            {
                if (!flag)
                {
                    imageView.setTag(profileId);
                    imageView.setImageResource(getDefaultPicture());
                }
                url = (new ImageRequest.Builder(context.getApplicationContext(), url)).setCallerTag(this).setCallback(new ImageRequest.Callback() {

                    final GraphObjectAdapter this$0;
                    final ImageView val$imageView;
                    final String val$profileId;

                    public void onCompleted(ImageResponse imageresponse)
                    {
                        processImageResponse(imageresponse, profileId, imageView);
                    }

            
            {
                this$0 = GraphObjectAdapter.this;
                profileId = s;
                imageView = imageview;
                super();
            }
                }).build();
                pendingRequests.put(profileId, url);
                ImageDownloader.downloadAsync(url);
                return;
            }
        }
    }

    private View getActivityCircleView(View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = inflater.inflate(com.facebook.android.R.layout.com_facebook_picker_activity_circle_row, null);
        }
        ((ProgressBar)viewgroup.findViewById(com.facebook.android.R.id.com_facebook_picker_row_activity_circle)).setVisibility(0);
        return viewgroup;
    }

    private void processImageResponse(ImageResponse imageresponse, String s, ImageView imageview)
    {
        pendingRequests.remove(s);
        if (imageresponse.getError() != null)
        {
            callOnErrorListener(imageresponse.getError());
        }
        if (imageview == null)
        {
            if (imageresponse.getBitmap() != null)
            {
                if (prefetchedPictureCache.size() >= 20)
                {
                    imageview = (String)prefetchedProfilePictureIds.remove(0);
                    prefetchedPictureCache.remove(imageview);
                }
                prefetchedPictureCache.put(s, imageresponse);
            }
        } else
        if (imageview != null && s.equals(imageview.getTag()))
        {
            s = imageresponse.getError();
            android.graphics.Bitmap bitmap = imageresponse.getBitmap();
            if (s == null && bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                imageview.setTag(imageresponse.getRequest().getImageUrl());
                return;
            }
        }
    }

    private void rebuildSections()
    {
        boolean flag = true;
        sectionKeys = new ArrayList();
        graphObjectsBySection = new HashMap();
        graphObjectsById = new HashMap();
        displaySections = false;
        if (cursor == null || cursor.getCount() == 0)
        {
            return;
        }
        int i = 0;
        cursor.moveToFirst();
        int j;
        do
        {
            final Object collator = cursor.getGraphObject();
            Iterator iterator;
            if (!filterIncludesItem(((GraphObject) (collator))))
            {
                j = i;
            } else
            {
                j = i + 1;
                String s = getSectionKeyOfGraphObject(((GraphObject) (collator)));
                if (!graphObjectsBySection.containsKey(s))
                {
                    sectionKeys.add(s);
                    graphObjectsBySection.put(s, new ArrayList());
                }
                ((List)graphObjectsBySection.get(s)).add(collator);
                graphObjectsById.put(getIdOfGraphObject(((GraphObject) (collator))), collator);
            }
            i = j;
        } while (cursor.moveToNext());
        if (sortFields != null)
        {
            collator = Collator.getInstance();
            for (iterator = graphObjectsBySection.values().iterator(); iterator.hasNext(); Collections.sort((ArrayList)iterator.next(), new Comparator() {

        final GraphObjectAdapter this$0;
        final Collator val$collator;

        public int compare(GraphObject graphobject, GraphObject graphobject1)
        {
            return GraphObjectAdapter.compareGraphObjects(graphobject, graphobject1, sortFields, collator);
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((GraphObject)obj, (GraphObject)obj1);
        }

            
            {
                this$0 = GraphObjectAdapter.this;
                collator = collator1;
                super();
            }
    })) { }
        }
        Collections.sort(sectionKeys, Collator.getInstance());
        if (sectionKeys.size() <= 1 || j <= 1)
        {
            flag = false;
        }
        displaySections = flag;
    }

    private boolean shouldShowActivityCircleCell()
    {
        return cursor != null && cursor.areMoreObjectsAvailable() && dataNeededListener != null && !isEmpty();
    }

    public boolean areAllItemsEnabled()
    {
        return displaySections;
    }

    public boolean changeCursor(GraphObjectCursor graphobjectcursor)
    {
        if (cursor == graphobjectcursor)
        {
            return false;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        cursor = graphobjectcursor;
        rebuildAndNotify();
        return true;
    }

    protected View createGraphObjectView(GraphObject graphobject, View view)
    {
        graphobject = inflater.inflate(getGraphObjectRowLayoutId(graphobject), null);
        view = (ViewStub)graphobject.findViewById(com.facebook.android.R.id.com_facebook_picker_checkbox_stub);
        if (view != null)
        {
            if (!getShowCheckbox())
            {
                view.setVisibility(8);
            } else
            {
                updateCheckboxState((CheckBox)view.inflate(), false);
            }
        }
        view = (ViewStub)graphobject.findViewById(com.facebook.android.R.id.com_facebook_picker_profile_pic_stub);
        if (!getShowPicture())
        {
            view.setVisibility(8);
            return graphobject;
        } else
        {
            ((ImageView)view.inflate()).setVisibility(0);
            return graphobject;
        }
    }

    boolean filterIncludesItem(GraphObject graphobject)
    {
        return filter == null || filter.includeItem(graphobject);
    }

    public int getCount()
    {
        int i = 0;
        int j = 0;
        if (sectionKeys.size() != 0)
        {
            if (displaySections)
            {
                i = sectionKeys.size();
            }
            for (Iterator iterator = graphObjectsBySection.values().iterator(); iterator.hasNext();)
            {
                i += ((ArrayList)iterator.next()).size();
            }

            j = i;
            if (shouldShowActivityCircleCell())
            {
                return i + 1;
            }
        }
        return j;
    }

    public GraphObjectCursor getCursor()
    {
        return cursor;
    }

    public DataNeededListener getDataNeededListener()
    {
        return dataNeededListener;
    }

    protected int getDefaultPicture()
    {
        return com.facebook.android.R.drawable.com_facebook_profile_default_icon;
    }

    Filter getFilter()
    {
        return filter;
    }

    protected int getGraphObjectRowLayoutId(GraphObject graphobject)
    {
        return com.facebook.android.R.layout.com_facebook_picker_list_row;
    }

    protected View getGraphObjectView(GraphObject graphobject, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        Object obj = viewgroup;
        if (viewgroup == null)
        {
            obj = createGraphObjectView(graphobject, view);
        }
        populateGraphObjectView(((View) (obj)), graphobject);
        return ((View) (obj));
    }

    public List getGraphObjectsById(Collection collection)
    {
        Object obj = new HashSet();
        ((Set) (obj)).addAll(collection);
        collection = new ArrayList(((Set) (obj)).size());
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (String)((Iterator) (obj)).next();
            obj1 = (GraphObject)graphObjectsById.get(obj1);
            if (obj1 != null)
            {
                collection.add(obj1);
            }
        } while (true);
        return collection;
    }

    public String getGroupByField()
    {
        return groupByField;
    }

    String getIdOfGraphObject(GraphObject graphobject)
    {
        if (graphobject.asMap().containsKey("id"))
        {
            graphobject = ((GraphObject) (graphobject.getProperty("id")));
            if (graphobject instanceof String)
            {
                return (String)graphobject;
            }
        }
        throw new FacebookException("Received an object without an ID.");
    }

    public Object getItem(int i)
    {
        SectionAndItem sectionanditem = getSectionAndItem(i);
        if (sectionanditem.getType() == SectionAndItem.Type.GRAPH_OBJECT)
        {
            return sectionanditem.graphObject;
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        Object obj = getSectionAndItem(i);
        if (obj != null && ((SectionAndItem) (obj)).graphObject != null)
        {
            obj = getIdOfGraphObject(((SectionAndItem) (obj)).graphObject);
            if (obj != null)
            {
                return Long.parseLong(((String) (obj)));
            }
        }
        return 0L;
    }

    public int getItemViewType(int i)
    {
        SectionAndItem sectionanditem = getSectionAndItem(i);
        static class _cls3
        {

            static final int $SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type[];

            static 
            {
                $SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type = new int[SectionAndItem.Type.values().length];
                try
                {
                    $SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type[SectionAndItem.Type.SECTION_HEADER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type[SectionAndItem.Type.GRAPH_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type[SectionAndItem.Type.ACTIVITY_CIRCLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.facebook.widget.GraphObjectAdapter.SectionAndItem.Type[sectionanditem.getType().ordinal()])
        {
        default:
            throw new FacebookException("Unexpected type of section and item.");

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;
        }
    }

    public OnErrorListener getOnErrorListener()
    {
        return onErrorListener;
    }

    String getPictureFieldSpecifier()
    {
        Object obj = (ImageView)createGraphObjectView(null, null).findViewById(com.facebook.android.R.id.com_facebook_picker_image);
        if (obj == null)
        {
            return null;
        } else
        {
            obj = ((ImageView) (obj)).getLayoutParams();
            return String.format("picture.height(%d).width(%d)", new Object[] {
                Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).height), Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).width)
            });
        }
    }

    protected URL getPictureUrlOfGraphObject(GraphObject graphobject)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = graphobject.getProperty("picture");
        if (!(obj1 instanceof String)) goto _L2; else goto _L1
_L1:
        graphobject = (String)obj1;
_L4:
        if (graphobject == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            graphobject = new URL(graphobject);
        }
        // Misplaced declaration of an exception variable
        catch (GraphObject graphobject)
        {
            break; /* Loop/switch isn't completed */
        }
        return graphobject;
_L2:
        graphobject = obj;
        if (obj1 instanceof JSONObject)
        {
            obj1 = ((ItemPicture)com.facebook.model.GraphObject.Factory.create((JSONObject)obj1).cast(com/facebook/widget/GraphObjectAdapter$ItemPicture)).getData();
            graphobject = obj;
            if (obj1 != null)
            {
                graphobject = ((ItemPictureData) (obj1)).getUrl();
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    int getPosition(String s, GraphObject graphobject)
    {
        int i = 0;
        boolean flag1 = false;
        Iterator iterator = sectionKeys.iterator();
        int k;
label0:
        do
        {
            String s1;
label1:
            {
                boolean flag = flag1;
                k = i;
                if (iterator.hasNext())
                {
                    s1 = (String)iterator.next();
                    k = i;
                    if (displaySections)
                    {
                        k = i + 1;
                    }
                    if (!s1.equals(s))
                    {
                        break label1;
                    }
                    flag = true;
                }
                if (!flag)
                {
                    return -1;
                }
                break label0;
            }
            i = k + ((ArrayList)graphObjectsBySection.get(s1)).size();
        } while (true);
        if (graphobject == null)
        {
            int j;
            if (displaySections)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            return k - j;
        }
        for (s = ((ArrayList)graphObjectsBySection.get(s)).iterator(); s.hasNext();)
        {
            if (com.facebook.model.GraphObject.Factory.hasSameId((GraphObject)s.next(), graphobject))
            {
                return k;
            }
            k++;
        }

        return -1;
    }

    public int getPositionForSection(int i)
    {
        boolean flag = false;
        int j = ((flag) ? 1 : 0);
        if (displaySections)
        {
            i = Math.max(0, Math.min(i, sectionKeys.size() - 1));
            j = ((flag) ? 1 : 0);
            if (i < sectionKeys.size())
            {
                j = getPosition((String)sectionKeys.get(i), null);
            }
        }
        return j;
    }

    SectionAndItem getSectionAndItem(int i)
    {
        Object obj1;
        Object obj2;
        if (sectionKeys.size() == 0)
        {
            return null;
        }
        obj2 = null;
        obj1 = null;
        if (displaySections) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        s = (String)sectionKeys.get(0);
        obj = (List)graphObjectsBySection.get(s);
        if (i < 0 || i >= ((List) (obj)).size()) goto _L4; else goto _L3
_L3:
        obj = (GraphObject)((ArrayList)graphObjectsBySection.get(s)).get(i);
_L5:
        Iterator iterator;
        int j;
        if (s != null)
        {
            return new SectionAndItem(s, ((GraphObject) (obj)));
        } else
        {
            throw new IndexOutOfBoundsException("position");
        }
_L4:
        if (!$assertionsDisabled && (dataNeededListener == null || !cursor.areMoreObjectsAvailable()))
        {
            throw new AssertionError();
        } else
        {
            return new SectionAndItem(null, null);
        }
_L2:
        iterator = sectionKeys.iterator();
_L6:
        obj = obj1;
        s = obj2;
        if (iterator.hasNext())
        {
            s = (String)iterator.next();
            j = i - 1;
            if (i == 0)
            {
                obj = obj1;
            } else
            {
label0:
                {
                    obj = (List)graphObjectsBySection.get(s);
                    if (j >= ((List) (obj)).size())
                    {
                        break label0;
                    }
                    obj = (GraphObject)((List) (obj)).get(j);
                }
            }
        }
          goto _L5
        i = j - ((List) (obj)).size();
          goto _L6
    }

    public int getSectionForPosition(int i)
    {
        boolean flag = false;
        SectionAndItem sectionanditem = getSectionAndItem(i);
        i = ((flag) ? 1 : 0);
        if (sectionanditem != null)
        {
            i = ((flag) ? 1 : 0);
            if (sectionanditem.getType() != SectionAndItem.Type.ACTIVITY_CIRCLE)
            {
                i = Math.max(0, Math.min(sectionKeys.indexOf(sectionanditem.sectionKey), sectionKeys.size() - 1));
            }
        }
        return i;
    }

    protected View getSectionHeaderView(String s, View view, ViewGroup viewgroup)
    {
        viewgroup = (TextView)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = (TextView)inflater.inflate(com.facebook.android.R.layout.com_facebook_picker_list_section_header, null);
        }
        view.setText(s);
        return view;
    }

    protected String getSectionKeyOfGraphObject(GraphObject graphobject)
    {
        Object obj = null;
        if (groupByField != null)
        {
            graphobject = (String)graphobject.getProperty(groupByField);
            obj = graphobject;
            if (graphobject != null)
            {
                obj = graphobject;
                if (graphobject.length() > 0)
                {
                    obj = graphobject.substring(0, 1).toUpperCase();
                }
            }
        }
        if (obj != null)
        {
            return ((String) (obj));
        } else
        {
            return "";
        }
    }

    public Object[] getSections()
    {
        if (displaySections)
        {
            return sectionKeys.toArray();
        } else
        {
            return new Object[0];
        }
    }

    public boolean getShowCheckbox()
    {
        return showCheckbox;
    }

    public boolean getShowPicture()
    {
        return showPicture;
    }

    public List getSortFields()
    {
        return sortFields;
    }

    protected CharSequence getSubTitleOfGraphObject(GraphObject graphobject)
    {
        return null;
    }

    protected CharSequence getTitleOfGraphObject(GraphObject graphobject)
    {
        return (String)graphobject.getProperty("name");
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        SectionAndItem sectionanditem = getSectionAndItem(i);
        switch (_cls3..SwitchMap.com.facebook.widget.GraphObjectAdapter.SectionAndItem.Type[sectionanditem.getType().ordinal()])
        {
        default:
            throw new FacebookException("Unexpected type of section and item.");

        case 1: // '\001'
            return getSectionHeaderView(sectionanditem.sectionKey, view, viewgroup);

        case 2: // '\002'
            return getGraphObjectView(sectionanditem.graphObject, view, viewgroup);

        case 3: // '\003'
            break;
        }
        if (!$assertionsDisabled && (!cursor.areMoreObjectsAvailable() || dataNeededListener == null))
        {
            throw new AssertionError();
        } else
        {
            dataNeededListener.onDataNeeded();
            return getActivityCircleView(view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return sectionKeys.size() == 0;
    }

    public boolean isEnabled(int i)
    {
        return getSectionAndItem(i).getType() == SectionAndItem.Type.GRAPH_OBJECT;
    }

    boolean isGraphObjectSelected(String s)
    {
        return false;
    }

    protected void populateGraphObjectView(View view, GraphObject graphobject)
    {
        String s;
label0:
        {
            s = getIdOfGraphObject(graphobject);
            view.setTag(s);
            CharSequence charsequence = getTitleOfGraphObject(graphobject);
            TextView textview = (TextView)view.findViewById(com.facebook.android.R.id.com_facebook_picker_title);
            if (textview != null)
            {
                textview.setText(charsequence, android.widget.TextView.BufferType.SPANNABLE);
            }
            charsequence = getSubTitleOfGraphObject(graphobject);
            textview = (TextView)view.findViewById(com.facebook.android.R.id.picker_subtitle);
            if (textview != null)
            {
                if (charsequence != null)
                {
                    textview.setText(charsequence, android.widget.TextView.BufferType.SPANNABLE);
                    textview.setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                }
            }
            if (getShowCheckbox())
            {
                updateCheckboxState((CheckBox)view.findViewById(com.facebook.android.R.id.com_facebook_picker_checkbox), isGraphObjectSelected(s));
            }
            if (getShowPicture())
            {
                graphobject = getPictureUrlOfGraphObject(graphobject);
                if (graphobject != null)
                {
                    view = (ImageView)view.findViewById(com.facebook.android.R.id.com_facebook_picker_image);
                    if (!prefetchedPictureCache.containsKey(s))
                    {
                        break label0;
                    }
                    graphobject = (ImageResponse)prefetchedPictureCache.get(s);
                    view.setImageBitmap(graphobject.getBitmap());
                    view.setTag(graphobject.getRequest().getImageUrl());
                }
            }
            return;
        }
        downloadProfilePicture(s, graphobject, view);
    }

    public void prioritizeViewRange(int i, int j, int k)
    {
        if (j >= i)
        {
            for (int l = j; l >= 0; l--)
            {
                Object obj = getSectionAndItem(l);
                if (((SectionAndItem) (obj)).graphObject == null)
                {
                    continue;
                }
                obj = getIdOfGraphObject(((SectionAndItem) (obj)).graphObject);
                obj = (ImageRequest)pendingRequests.get(obj);
                if (obj != null)
                {
                    ImageDownloader.prioritizeRequest(((ImageRequest) (obj)));
                }
            }

            int i1 = Math.max(0, i - k);
            int j1 = Math.min(j + k, getCount() - 1);
            Object obj1 = new ArrayList();
            for (k = i1; k < i; k++)
            {
                SectionAndItem sectionanditem = getSectionAndItem(k);
                if (sectionanditem.graphObject != null)
                {
                    ((ArrayList) (obj1)).add(sectionanditem.graphObject);
                }
            }

            for (i = j + 1; i <= j1; i++)
            {
                SectionAndItem sectionanditem1 = getSectionAndItem(i);
                if (sectionanditem1.graphObject != null)
                {
                    ((ArrayList) (obj1)).add(sectionanditem1.graphObject);
                }
            }

            obj1 = ((ArrayList) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Object obj2 = (GraphObject)((Iterator) (obj1)).next();
                URL url = getPictureUrlOfGraphObject(((GraphObject) (obj2)));
                obj2 = getIdOfGraphObject(((GraphObject) (obj2)));
                boolean flag = prefetchedProfilePictureIds.remove(obj2);
                prefetchedProfilePictureIds.add(obj2);
                if (!flag)
                {
                    downloadProfilePicture(((String) (obj2)), url, null);
                }
            }
        }
    }

    public void rebuildAndNotify()
    {
        rebuildSections();
        notifyDataSetChanged();
    }

    public void setDataNeededListener(DataNeededListener dataneededlistener)
    {
        dataNeededListener = dataneededlistener;
    }

    void setFilter(Filter filter1)
    {
        filter = filter1;
    }

    public void setGroupByField(String s)
    {
        groupByField = s;
    }

    public void setOnErrorListener(OnErrorListener onerrorlistener)
    {
        onErrorListener = onerrorlistener;
    }

    public void setShowCheckbox(boolean flag)
    {
        showCheckbox = flag;
    }

    public void setShowPicture(boolean flag)
    {
        showPicture = flag;
    }

    public void setSortFields(List list)
    {
        sortFields = list;
    }

    void updateCheckboxState(CheckBox checkbox, boolean flag)
    {
    }

    static 
    {
        boolean flag;
        if (!com/facebook/widget/GraphObjectAdapter.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



}
