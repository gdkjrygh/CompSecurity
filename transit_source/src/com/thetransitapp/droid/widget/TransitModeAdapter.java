// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.thetransitapp.droid.LegalScreen;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import com.thetransitapp.droid.ui.ShadowImageView;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.widget:
//            OptionItem

public class TransitModeAdapter extends BaseExpandableListAdapter
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType[];
    private SparseArray childs;
    private FragmentManager fragmentManager;
    private List groups;
    private LayoutInflater inflater;
    private ExpandableListView listView;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.Route.RouteType.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.BUS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.CABLE_CAR.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.FERRY.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.FUNICULAR.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.GONDOLA.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.SUBWAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.TRAIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.TRAMWAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType = ai;
        return ai;
    }

    public TransitModeAdapter(LayoutInflater layoutinflater, FragmentManager fragmentmanager, ExpandableListView expandablelistview)
    {
        groups = new ArrayList();
        childs = new SparseArray();
        inflater = layoutinflater;
        fragmentManager = fragmentmanager;
        listView = expandablelistview;
    }

    private void closeAllOtherBundle(int i)
    {
        int j = 0;
        do
        {
            if (j >= groups.size())
            {
                return;
            }
            if (j != i)
            {
                OptionItem optionitem = getGroup(i);
                if (optionitem != null && optionitem.getBundle() != null)
                {
                    listView.collapseGroup(j);
                }
            }
            j++;
        } while (true);
    }

    private String implode(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return stringbuilder.toString();
            }
            String s = (String)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s);
        } while (true);
    }

    private int indexOf(com.thetransitapp.droid.model.Route.RouteType routetype)
    {
        Iterator iterator = groups.iterator();
        OptionItem optionitem;
        do
        {
            if (!iterator.hasNext())
            {
                return -1;
            }
            optionitem = (OptionItem)iterator.next();
        } while (optionitem.getMode() == null || optionitem.getMode().getRouteTypes().isEmpty() || routetype != optionitem.getMode().getRouteTypes().get(0));
        return groups.indexOf(optionitem);
    }

    private void showCurrentRegion(OptionItem optionitem, View view)
    {
        TextView textview = (TextView)view.findViewById(0x7f05003b);
        TextView textview1 = (TextView)view.findViewById(0x7f05003c);
        ((Button)view.findViewById(0x7f05003e)).setOnClickListener(new android.view.View.OnClickListener() {

            final TransitModeAdapter this$0;

            public void onClick(View view1)
            {
                if (fragmentManager != null)
                {
                    view1 = new LegalScreen();
                    FragmentTransaction fragmenttransaction = fragmentManager.beginTransaction();
                    fragmenttransaction.replace(0x7f05003a, view1, com.thetransitapp.droid.TransitActivity.TransitScreen.LEGAL_SCREEN.name());
                    fragmenttransaction.addToBackStack(com.thetransitapp.droid.TransitActivity.TransitScreen.LEGAL_SCREEN.name());
                    fragmenttransaction.commit();
                }
            }

            
            {
                this$0 = TransitModeAdapter.this;
                super();
            }
        });
        if (optionitem.getCurrentRegion() == null)
        {
            textview.setText(view.getResources().getString(0x7f0a007e));
            textview1.setText(view.getResources().getString(0x7f0a007f));
            return;
        } else
        {
            textview.setText(optionitem.getCurrentRegion().getName());
            showAgencies(view, optionitem.getCurrentRegion());
            return;
        }
    }

    private void showGroup(final OptionItem item, View view, final int groupPosition, boolean flag)
    {
        ImageView imageview;
        ShadowImageView shadowimageview;
        boolean flag1;
        boolean flag2;
        TextView textview = (TextView)view.findViewById(0x7f050098);
        imageview = (ImageView)view.findViewById(0x7f050097);
        shadowimageview = (ShadowImageView)view.findViewById(0x7f05009b);
        if (groupPosition == 0)
        {
            view.findViewById(0x7f050099).setVisibility(0);
        } else
        {
            view.findViewById(0x7f050099).setVisibility(8);
        }
        textview.setText(item.getMode().getName());
        flag2 = true;
        flag1 = true;
        if (getChildrenCount(groupPosition) <= 0)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        view = ((List)childs.get(groupPosition)).iterator();
_L3:
        if (view.hasNext()) goto _L2; else goto _L1
_L1:
        shadowimageview.setVisibility(0);
        shadowimageview.setShadowLayer(0.1F, 0.0F, -2F, 0xff000000);
        OptionItem optionitem;
        int i;
        if (flag)
        {
            i = 0x7f0200c5;
        } else
        {
            i = 0x7f02008b;
        }
        shadowimageview.setImageResource(i);
_L4:
        if (flag2)
        {
            imageview.setImageResource(0x7f02008f);
        } else
        if (flag1)
        {
            imageview.setImageResource(0x7f02008e);
        } else
        {
            imageview.setImageResource(0x7f020090);
        }
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final TransitModeAdapter this$0;
            private final int val$groupPosition;
            private final OptionItem val$item;

            public void onClick(View view1)
            {
                view1 = item.getMode();
                boolean flag3;
                if (item.getMode().isSelected())
                {
                    flag3 = false;
                } else
                {
                    flag3 = true;
                }
                view1.setSelected(flag3);
                if (childs.get(groupPosition) == null) goto _L2; else goto _L1
_L1:
                view1 = ((List)childs.get(groupPosition)).iterator();
_L5:
                if (view1.hasNext()) goto _L3; else goto _L2
_L2:
                notifyDataSetChanged();
                return;
_L3:
                ((OptionItem)view1.next()).getMode().setSelected(item.getMode().isSelected());
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = TransitModeAdapter.this;
                item = optionitem;
                groupPosition = i;
                super();
            }
        });
        return;
_L2:
        optionitem = (OptionItem)view.next();
        flag2 &= optionitem.getMode().isSelected();
        if (optionitem.getMode().isSelected())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        flag1 &= i;
          goto _L3
        flag2 = item.getMode().isSelected();
        if (item.getMode().isSelected())
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        shadowimageview.setVisibility(8);
          goto _L4
    }

    private void showSupportedRegion(OptionItem optionitem, View view)
    {
        TextView textview1 = (TextView)view.findViewById(0x7f050094);
        TextView textview = (TextView)view.findViewById(0x7f050095);
        textview1.setText(optionitem.getBundle().getName());
        int i = optionitem.getBundle().getFeeds().size();
        optionitem = MessageFormat.format(view.getContext().getString(0x7f0a009e), new Object[] {
            Integer.valueOf(i)
        });
        textview.setText((new StringBuilder(String.valueOf(i))).append(" ").append(optionitem).toString());
    }

    public void addMode(TransitMode transitmode)
    {
        if (transitmode.getRouteTypes().size() > 0)
        {
            int i = indexOf((com.thetransitapp.droid.model.Route.RouteType)transitmode.getRouteTypes().get(0));
            if (i == -1)
            {
                groups.add(new OptionItem(transitmode));
                return;
            }
            if (childs.get(i) == null)
            {
                childs.put(i, new ArrayList());
            }
            ((List)childs.get(i)).add(new OptionItem(transitmode));
            return;
        } else
        {
            groups.add(new OptionItem(transitmode));
            return;
        }
    }

    public void addSupportedRegion(TransitBundle transitbundle)
    {
        groups.add(new OptionItem(transitbundle, false));
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new OptionItem(transitbundle, false));
        childs.put(groups.size() - 1, arraylist);
    }

    public void clear()
    {
        childs.clear();
        groups.clear();
    }

    public OptionItem getChild(int i, int j)
    {
        List list = (List)childs.get(i);
        if (list != null)
        {
            return (OptionItem)list.get(j);
        } else
        {
            return null;
        }
    }

    public volatile Object getChild(int i, int j)
    {
        return getChild(i, j);
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        Object obj;
        OptionItem optionitem;
        ImageView imageview;
label0:
        {
            obj = view;
            optionitem = getChild(i, j);
            if (obj != null && (optionitem.getMode() == null || ((View) (obj)).findViewById(0x7f050098) != null))
            {
                view = ((View) (obj));
                if (optionitem.getBundle() == null)
                {
                    break label0;
                }
                view = ((View) (obj));
                if (((View) (obj)).findViewById(0x7f05003c) != null)
                {
                    break label0;
                }
            }
            if (optionitem.getMode() != null)
            {
                view = inflater.inflate(0x7f030035, viewgroup, false);
            } else
            {
                view = inflater.inflate(0x7f03001e, viewgroup, false);
            }
        }
        if (optionitem.getMode() == null) goto _L2; else goto _L1
_L1:
        viewgroup = (TextView)view.findViewById(0x7f050098);
        obj = (ImageView)view.findViewById(0x7f050096);
        imageview = (ImageView)view.findViewById(0x7f050097);
        viewgroup.setText(optionitem.getMode().getName());
        if (optionitem.getMode().getRouteTypes().size() <= 0) goto _L4; else goto _L3
_L3:
        $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[((com.thetransitapp.droid.model.Route.RouteType)optionitem.getMode().getRouteTypes().get(0)).ordinal()];
        JVM INSTR tableswitch 3 4: default 204
    //                   3 267
    //                   4 250;
           goto _L5 _L6 _L7
_L5:
        ((ImageView) (obj)).setVisibility(8);
_L13:
        if (!optionitem.getMode().isSelected()) goto _L9; else goto _L8
_L8:
        imageview.setImageResource(0x7f02008f);
_L11:
        return view;
_L7:
        ((ImageView) (obj)).setVisibility(0);
        ((ImageView) (obj)).setImageResource(0x7f0200bf);
        continue; /* Loop/switch isn't completed */
_L6:
        ((ImageView) (obj)).setVisibility(0);
        ((ImageView) (obj)).setImageResource(0x7f0200bc);
        continue; /* Loop/switch isn't completed */
_L4:
        ((ImageView) (obj)).setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L9:
        imageview.setImageResource(0x7f02008e);
        return view;
_L2:
        if (optionitem.getBundle() == null) goto _L11; else goto _L10
_L10:
        showAgencies(view, optionitem.getBundle());
        return view;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public int getChildrenCount(int i)
    {
        List list = (List)childs.get(i);
        if (list == null)
        {
            return 0;
        } else
        {
            return list.size();
        }
    }

    public OptionItem getGroup(int i)
    {
        return (OptionItem)groups.get(i);
    }

    public volatile Object getGroup(int i)
    {
        return getGroup(i);
    }

    public int getGroupCount()
    {
        return groups.size();
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        OptionItem optionitem;
label0:
        {
            View view1 = view;
            optionitem = getGroup(i);
            if (view1 != null && (optionitem.getMode() == null || view1.findViewById(0x7f050096) != null) && (optionitem.getBundle() == null || view1.findViewById(0x7f050094) != null))
            {
                view = view1;
                if (view1.findViewById(0x7f05003b) != null)
                {
                    break label0;
                }
            }
            if (optionitem.getMode() != null)
            {
                view = inflater.inflate(0x7f030036, viewgroup, false);
            } else
            if (optionitem.getBundle() != null)
            {
                view = inflater.inflate(0x7f030034, viewgroup, false);
            } else
            {
                view = inflater.inflate(0x7f030018, viewgroup, false);
            }
        }
        if (optionitem.getMode() != null)
        {
            showGroup(optionitem, view, i, flag);
            return view;
        }
        if (optionitem.getBundle() != null)
        {
            showSupportedRegion(optionitem, view);
            return view;
        } else
        {
            showCurrentRegion(optionitem, view);
            return view;
        }
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return getGroup(i).getMode() != null;
    }

    public void onGroupExpanded(int i)
    {
        super.onGroupExpanded(i);
        if (getGroup(i).getBundle() != null)
        {
            closeAllOtherBundle(i);
        }
    }

    public void setCurrentRegion(TransitBundle transitbundle)
    {
        groups.add(new OptionItem(transitbundle, true));
    }

    public void showAgencies(View view, TransitBundle transitbundle)
    {
        TextView textview;
        SparseArray sparsearray;
        textview = (TextView)view.findViewById(0x7f05003c);
        view = (TextView)view.findViewById(0x7f05003d);
        sparsearray = new SparseArray();
        transitbundle = transitbundle.getFeeds().iterator();
_L14:
        if (transitbundle.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        transitbundle = new StringBuilder();
        obj = new StringBuilder();
        i = 0;
_L9:
        if (i < sparsearray.size()) goto _L4; else goto _L3
_L3:
        if (transitbundle.length() <= 0) goto _L6; else goto _L5
_L5:
        textview.setText(transitbundle);
        if (((StringBuilder) (obj)).length() <= 0) goto _L8; else goto _L7
_L7:
        view.setText(((CharSequence) (obj)));
        view.setVisibility(0);
_L12:
        return;
_L2:
        obj = (Feed)transitbundle.next();
        if (sparsearray.get(((Feed) (obj)).getLevel()) == null)
        {
            sparsearray.put(((Feed) (obj)).getLevel(), new ArrayList());
        }
        ((List)sparsearray.get(((Feed) (obj)).getLevel())).add(((Feed) (obj)).getName());
        continue; /* Loop/switch isn't completed */
_L4:
        List list;
        list = (List)sparsearray.valueAt(i);
        Collections.sort(list);
        switch (i)
        {
        default:
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append(", ");
            }
            ((StringBuilder) (obj)).append(implode(list));
            break;

        case 0: // '\0'
        case 1: // '\001'
            break MISSING_BLOCK_LABEL_257;
        }
_L10:
        i++;
          goto _L9
        if (transitbundle.length() > 0)
        {
            transitbundle.append(", ");
        }
        transitbundle.append(implode(list));
          goto _L10
_L8:
        view.setVisibility(8);
        return;
          goto _L9
_L6:
        if (transitbundle.length() != 0 || ((StringBuilder) (obj)).length() <= 0) goto _L12; else goto _L11
_L11:
        textview.setText(((CharSequence) (obj)));
        view.setVisibility(8);
        return;
        if (true) goto _L14; else goto _L13
_L13:
    }


}
