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
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.model.GraphObject;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.facebook.widget:
//            GraphObjectCursor

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

        public static final SectionAndItem.Type ACTIVITY_CIRCLE;
        private static final SectionAndItem.Type ENUM$VALUES[];
        public static final SectionAndItem.Type GRAPH_OBJECT;
        public static final SectionAndItem.Type SECTION_HEADER;

        public static SectionAndItem.Type valueOf(String s)
        {
            return (SectionAndItem.Type)Enum.valueOf(com/facebook/widget/GraphObjectAdapter$SectionAndItem$Type, s);
        }

        public static SectionAndItem.Type[] values()
        {
            SectionAndItem.Type atype[] = ENUM$VALUES;
            int i = atype.length;
            SectionAndItem.Type atype1[] = new SectionAndItem.Type[i];
            System.arraycopy(atype, 0, atype1, 0, i);
            return atype1;
        }

        static 
        {
            GRAPH_OBJECT = new SectionAndItem.Type("GRAPH_OBJECT", 0);
            SECTION_HEADER = new SectionAndItem.Type("SECTION_HEADER", 1);
            ACTIVITY_CIRCLE = new SectionAndItem.Type("ACTIVITY_CIRCLE", 2);
            ENUM$VALUES = (new SectionAndItem.Type[] {
                GRAPH_OBJECT, SECTION_HEADER, ACTIVITY_CIRCLE
            });
        }

        private SectionAndItem.Type(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type[];
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

    static int[] $SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type()
    {
        int ai[] = $SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[SectionAndItem.Type.values().length];
        try
        {
            ai[SectionAndItem.Type.ACTIVITY_CIRCLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[SectionAndItem.Type.GRAPH_OBJECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[SectionAndItem.Type.SECTION_HEADER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type = ai;
        return ai;
    }

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
        collection = collection.iterator();
        String s;
        String s1;
label0:
        do
        {
            int i;
            do
            {
                if (!collection.hasNext())
                {
                    return 0;
                }
                s1 = (String)collection.next();
                s = (String)graphobject.getProperty(s1);
                s1 = (String)graphobject1.getProperty(s1);
                if (s == null || s1 == null)
                {
                    continue label0;
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

    private void downloadProfilePicture(final String profileId, URI uri, final ImageView imageView)
    {
        if (uri != null)
        {
            boolean flag;
            if (imageView == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || !uri.equals(imageView.getTag()))
            {
                if (!flag)
                {
                    imageView.setTag(profileId);
                    imageView.setImageResource(getDefaultPicture());
                }
                uri = (new com.facebook.internal.ImageRequest.Builder(context.getApplicationContext(), uri)).setCallerTag(this).setCallback(new com.facebook.internal.ImageRequest.Callback() {

                    final GraphObjectAdapter this$0;
                    private final ImageView val$imageView;
                    private final String val$profileId;

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
                pendingRequests.put(profileId, uri);
                ImageDownloader.downloadAsync(uri);
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
        if (s.equals(imageview.getTag()))
        {
            s = imageresponse.getError();
            android.graphics.Bitmap bitmap = imageresponse.getBitmap();
            if (s == null && bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                imageview.setTag(imageresponse.getRequest().getImageUri());
                return;
            }
        }
    }

    private void rebuildSections()
    {
        final Object collator;
        Object obj;
        boolean flag;
        flag = true;
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
        do
        {
            collator = cursor.getGraphObject();
            int j;
            if (!filterIncludesItem(((GraphObject) (collator))))
            {
                j = i;
            } else
            {
                j = i + 1;
                obj = getSectionKeyOfGraphObject(((GraphObject) (collator)));
                if (!graphObjectsBySection.containsKey(obj))
                {
                    sectionKeys.add(obj);
                    graphObjectsBySection.put(obj, new ArrayList());
                }
                ((List)graphObjectsBySection.get(obj)).add(collator);
                graphObjectsById.put(getIdOfGraphObject(((GraphObject) (collator))), collator);
            }
            i = j;
        } while (cursor.moveToNext());
        if (sortFields == null) goto _L2; else goto _L1
_L1:
        collator = Collator.getInstance();
        obj = graphObjectsBySection.values().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        Collections.sort(sectionKeys, Collator.getInstance());
        if (sectionKeys.size() <= 1 || j <= 1)
        {
            flag = false;
        }
        displaySections = flag;
        return;
_L3:
        Collections.sort((List)((Iterator) (obj)).next(), new Comparator() {

            final GraphObjectAdapter this$0;
            private final Collator val$collator;

            public int compare(GraphObject graphobject, GraphObject graphobject1)
            {
                return GraphObjectAdapter.compareGraphObjects(graphobject, graphobject1, sortFields, collator);
            }

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((GraphObject)obj1, (GraphObject)obj2);
            }

            
            {
                this$0 = GraphObjectAdapter.this;
                collator = collator1;
                super();
            }
        });
        if (true) goto _L5; else goto _L4
_L4:
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

    protected View createGraphObjectView(GraphObject graphobject)
    {
        graphobject = inflater.inflate(getGraphObjectRowLayoutId(graphobject), null);
        ViewStub viewstub = (ViewStub)graphobject.findViewById(com.facebook.android.R.id.com_facebook_picker_checkbox_stub);
        if (viewstub != null)
        {
            if (!getShowCheckbox())
            {
                viewstub.setVisibility(8);
            } else
            {
                updateCheckboxState((CheckBox)viewstub.inflate(), false);
            }
        }
        viewstub = (ViewStub)graphobject.findViewById(com.facebook.android.R.id.com_facebook_picker_profile_pic_stub);
        if (!getShowPicture())
        {
            viewstub.setVisibility(8);
            return graphobject;
        } else
        {
            ((ImageView)viewstub.inflate()).setVisibility(0);
            return graphobject;
        }
    }

    boolean filterIncludesItem(GraphObject graphobject)
    {
        return filter == null || filter.includeItem(graphobject);
    }

    public int getCount()
    {
        int i;
        int j;
        i = 0;
        j = 0;
        if (sectionKeys.size() != 0) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        if (displaySections)
        {
            i = sectionKeys.size();
        }
        do
        {
            Iterator iterator;
label0:
            {
                for (iterator = graphObjectsBySection.values().iterator(); iterator.hasNext();)
                {
                    break label0;
                }

                j = i;
                if (shouldShowActivityCircleCell())
                {
                    return i + 1;
                }
            }
            if (true)
            {
                continue;
            }
            i += ((List)iterator.next()).size();
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
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
        if (view == null)
        {
            viewgroup = createGraphObjectView(graphobject);
        }
        populateGraphObjectView(viewgroup, graphobject);
        return viewgroup;
    }

    public List getGraphObjectsById(Collection collection)
    {
        Object obj = new HashSet();
        ((Set) (obj)).addAll(collection);
        collection = new ArrayList(((Set) (obj)).size());
        obj = ((Set) (obj)).iterator();
        do
        {
            Object obj1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return collection;
                }
                obj1 = (String)((Iterator) (obj)).next();
                obj1 = (GraphObject)graphObjectsById.get(obj1);
            } while (obj1 == null);
            collection.add(obj1);
        } while (true);
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
        Object obj;
        obj = getSectionAndItem(i);
        if (obj == null || ((SectionAndItem) (obj)).graphObject == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = getIdOfGraphObject(((SectionAndItem) (obj)).graphObject);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        long l = Long.parseLong(((String) (obj)));
        return l;
        NumberFormatException numberformatexception;
        numberformatexception;
        return 0L;
    }

    public int getItemViewType(int i)
    {
        SectionAndItem sectionanditem = getSectionAndItem(i);
        switch ($SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type()[sectionanditem.getType().ordinal()])
        {
        default:
            throw new FacebookException("Unexpected type of section and item.");

        case 2: // '\002'
            return 0;

        case 1: // '\001'
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
        Object obj = (ImageView)createGraphObjectView(null).findViewById(com.facebook.android.R.id.com_facebook_picker_image);
        if (obj == null)
        {
            return null;
        } else
        {
            obj = ((ImageView) (obj)).getLayoutParams();
            return String.format(Locale.US, "picture.height(%d).width(%d)", new Object[] {
                Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).height), Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).width)
            });
        }
    }

    protected URI getPictureUriOfGraphObject(GraphObject graphobject)
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
            graphobject = new URI(graphobject);
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
        Iterator iterator;
        int i;
        boolean flag;
        i = 0;
        flag = false;
        iterator = sectionKeys.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        String s1;
        int j;
        s1 = (String)iterator.next();
        j = i;
        if (displaySections)
        {
            j = i + 1;
        }
        if (!s1.equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        i = j;
        if (true) goto _L1; else goto _L3
_L3:
        i = j + ((ArrayList)graphObjectsBySection.get(s1)).size();
        if (true) goto _L5; else goto _L4
_L4:
        if (graphobject == null)
        {
            int k;
            if (displaySections)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            return i - k;
        }
        s = ((ArrayList)graphObjectsBySection.get(s)).iterator();
        do
        {
            if (!s.hasNext())
            {
                return -1;
            }
            if (com.facebook.model.GraphObject.Factory.hasSameId((GraphObject)s.next(), graphobject))
            {
                return i;
            }
            i++;
        } while (true);
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
        switch ($SWITCH_TABLE$com$facebook$widget$GraphObjectAdapter$SectionAndItem$Type()[sectionanditem.getType().ordinal()])
        {
        default:
            throw new FacebookException("Unexpected type of section and item.");

        case 2: // '\002'
            return getSectionHeaderView(sectionanditem.sectionKey, view, viewgroup);

        case 1: // '\001'
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
                graphobject = getPictureUriOfGraphObject(graphobject);
                if (graphobject != null)
                {
                    view = (ImageView)view.findViewById(com.facebook.android.R.id.com_facebook_picker_image);
                    if (!prefetchedPictureCache.containsKey(s))
                    {
                        break label0;
                    }
                    graphobject = (ImageResponse)prefetchedPictureCache.get(s);
                    view.setImageBitmap(graphobject.getBitmap());
                    view.setTag(graphobject.getRequest().getImageUri());
                }
            }
            return;
        }
        downloadProfilePicture(s, graphobject, view);
    }

    public void prioritizeViewRange(int i, int j, int k)
    {
        if (j >= i && sectionKeys.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l = j;
_L7:
        if (l >= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        int i1;
        l = Math.max(0, i - k);
        i1 = Math.min(j + k, getCount() - 1);
        obj = new ArrayList();
        k = l;
_L8:
        if (k < i) goto _L6; else goto _L5
_L5:
        i = j + 1;
_L9:
        if (i <= i1)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        obj = ((ArrayList) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Object obj1 = (GraphObject)((Iterator) (obj)).next();
            URI uri = getPictureUriOfGraphObject(((GraphObject) (obj1)));
            obj1 = getIdOfGraphObject(((GraphObject) (obj1)));
            boolean flag = prefetchedProfilePictureIds.remove(obj1);
            prefetchedProfilePictureIds.add(obj1);
            if (!flag)
            {
                downloadProfilePicture(((String) (obj1)), uri, null);
            }
        }
          goto _L1
_L4:
        obj = getSectionAndItem(l);
        if (((SectionAndItem) (obj)).graphObject != null)
        {
            obj = getIdOfGraphObject(((SectionAndItem) (obj)).graphObject);
            obj = (ImageRequest)pendingRequests.get(obj);
            if (obj != null)
            {
                ImageDownloader.prioritizeRequest(((ImageRequest) (obj)));
            }
        }
        l--;
          goto _L7
_L6:
        SectionAndItem sectionanditem = getSectionAndItem(k);
        if (sectionanditem.graphObject != null)
        {
            ((ArrayList) (obj)).add(sectionanditem.graphObject);
        }
        k++;
          goto _L8
        SectionAndItem sectionanditem1 = getSectionAndItem(i);
        if (sectionanditem1.graphObject != null)
        {
            ((ArrayList) (obj)).add(sectionanditem1.graphObject);
        }
        i++;
          goto _L9
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
