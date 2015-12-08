// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tab;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.hmobile.tab:
//            Tab

public class TabView
{
    public static final class Orientation extends Enum
    {

        public static final Orientation BOTTOM;
        private static final Orientation ENUM$VALUES[];
        public static final Orientation TOP;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/hmobile/tab/TabView$Orientation, s);
        }

        public static Orientation[] values()
        {
            Orientation aorientation[] = ENUM$VALUES;
            int i = aorientation.length;
            Orientation aorientation1[] = new Orientation[i];
            System.arraycopy(aorientation, 0, aorientation1, 0, i);
            return aorientation1;
        }

        static 
        {
            TOP = new Orientation("TOP", 0);
            BOTTOM = new Orientation("BOTTOM", 1);
            ENUM$VALUES = (new Orientation[] {
                TOP, BOTTOM
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation[];
    private static final String TAG = com/hmobile/tab/TabView.getSimpleName();
    private int backgroundID;
    private Context context;
    private View currentView;
    private Bitmap iconSeparator;
    private Bitmap mHeader;
    private int mHeaderHeight;
    private int mHeaderWidth;
    private Orientation orientation;
    private int selectedTabId;
    private int separatorID;
    private List tabSet;

    static int[] $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation()
    {
        int ai[] = $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Orientation.values().length];
        try
        {
            ai[Orientation.BOTTOM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Orientation.TOP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation = ai;
        return ai;
    }

    public TabView(Context context1)
    {
        tabSet = new ArrayList();
        selectedTabId = 0;
        context = context1;
    }

    private View getSeparatorView()
    {
        if (iconSeparator == null)
        {
            iconSeparator = BitmapFactory.decodeResource(context.getResources(), separatorID);
        }
        int i = iconSeparator.getHeight();
        ImageView imageview = new ImageView(context);
        imageview.setMaxHeight(i);
        imageview.setMinimumHeight(i);
        imageview.setMaxWidth(10);
        if (mHeaderHeight > i)
        {
            i = (mHeaderHeight - i) / 2;
        }
        imageview.setBackgroundColor(0);
        imageview.setImageBitmap(iconSeparator);
        return imageview;
    }

    private void preapareViewResources()
    {
        mHeader = BitmapFactory.decodeResource(context.getResources(), backgroundID);
        mHeaderWidth = mHeader.getWidth();
        mHeaderHeight = mHeader.getHeight();
    }

    public void addTab(Tab tab)
    {
        tab.preferedHeight = mHeaderHeight;
        tabSet.add(tab);
    }

    public Tab getTab(String s)
    {
        int i = 0;
        do
        {
            if (i >= tabSet.size())
            {
                throw new IllegalArgumentException((new StringBuilder("Tab \"")).append(s).append("\" not found").toString());
            }
            Tab tab = (Tab)tabSet.get(i);
            if (s.equals(tab.getTag()))
            {
                return tab;
            }
            i++;
        } while (true);
    }

    public View render(int i)
    {
        selectedTabId = i;
        switch ($SWITCH_TABLE$com$hmobile$tab$TabView$Orientation()[orientation.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return renderTOP();

        case 2: // '\002'
            return renderBOTTOM();
        }
    }

    public View renderBOTTOM()
    {
        preapareViewResources();
        int l = tabSet.size();
        Object obj = new android.widget.FrameLayout.LayoutParams(-1, -1);
        TableLayout tablelayout = new TableLayout(context);
        tablelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new TableRow(context);
        android.widget.TableLayout.LayoutParams layoutparams = new android.widget.TableLayout.LayoutParams(-1, -1);
        layoutparams.weight = 1.0F;
        android.widget.TableRow.LayoutParams layoutparams1 = new android.widget.TableRow.LayoutParams(-1, -1);
        layoutparams1.span = l;
        layoutparams1.weight = 1.0F;
        ((TableRow) (obj)).addView(currentView, layoutparams1);
        TableRow tablerow = new TableRow(context);
        tablerow.setBackgroundResource(backgroundID);
        android.widget.TableLayout.LayoutParams layoutparams2 = new android.widget.TableLayout.LayoutParams(-1, -1);
        int i = 0;
        int j = 0;
        do
        {
            if (j >= l)
            {
                tablelayout.addView(((View) (obj)), layoutparams);
                tablelayout.addView(tablerow, layoutparams2);
                return tablelayout;
            }
            Tab tab = (Tab)tabSet.get(j);
            if (j == selectedTabId)
            {
                tab.setSelected(true);
            }
            tablerow.addView(tab.getView(), new android.widget.TableRow.LayoutParams());
            int k = i;
            if (i % 2 == 0)
            {
                k = i;
                if (j < l - 1)
                {
                    android.widget.TableRow.LayoutParams layoutparams3 = new android.widget.TableRow.LayoutParams();
                    layoutparams1.weight = 1.0F;
                    tablerow.addView(getSeparatorView(), layoutparams3);
                    k = i + 1;
                }
            }
            i = k + 1;
            j++;
        } while (true);
    }

    public View renderTOP()
    {
        int j = tabSet.size();
        Object obj = new android.widget.FrameLayout.LayoutParams(-1, -1);
        TableLayout tablelayout = new TableLayout(context);
        tablelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new TableRow(context);
        Object obj1 = new android.widget.TableRow.LayoutParams();
        obj1.span = j;
        obj1.width = -1;
        obj1.height = -2;
        obj1.weight = 1.0F;
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        ScrollView scrollview = new ScrollView(context);
        scrollview.setLayoutParams(layoutparams);
        scrollview.addView(currentView, layoutparams);
        ((TableRow) (obj)).addView(scrollview, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = new TableRow(context);
        ((TableRow) (obj1)).setBackgroundResource(backgroundID);
        int i = 0;
        do
        {
            if (i >= j)
            {
                android.widget.TableRow.LayoutParams layoutparams1 = new android.widget.TableRow.LayoutParams();
                layoutparams1.height = -2;
                layoutparams1.weight = -1F;
                tablelayout.addView(((View) (obj1)), layoutparams1);
                tablelayout.addView(((View) (obj)));
                return tablelayout;
            }
            Tab tab = (Tab)tabSet.get(i);
            if (i == selectedTabId)
            {
                tab.setSelected(true);
            }
            ((TableRow) (obj1)).addView(tab.getView(), new android.widget.TableRow.LayoutParams());
            i++;
        } while (true);
    }

    public void setBackgroundID(int i)
    {
        backgroundID = i;
    }

    public void setCurrentView(int i)
    {
        setCurrentView(((LayoutInflater)context.getSystemService("layout_inflater")).inflate(i, null));
    }

    public void setCurrentView(View view)
    {
        currentView = view;
    }

    public void setOrientation(Orientation orientation1)
    {
        orientation = orientation1;
    }

    public void setSeparatorID(int i)
    {
        separatorID = i;
    }

}
