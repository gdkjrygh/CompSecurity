// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;

// Referenced classes of package in.srain.cube.views:
//            b

public class GridViewWithHeaderAndFooter extends GridView
{

    public static boolean a = false;
    private int b;
    private View c;
    private int d;
    private ArrayList e;
    private ArrayList f;

    public GridViewWithHeaderAndFooter(Context context)
    {
        super(context);
        b = -1;
        c = null;
        d = -1;
        e = new ArrayList();
        f = new ArrayList();
        a();
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        c = null;
        d = -1;
        e = new ArrayList();
        f = new ArrayList();
        a();
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = -1;
        c = null;
        d = -1;
        e = new ArrayList();
        f = new ArrayList();
        a();
    }

    private void a()
    {
    }

    private int getColumnWidthCompatible()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return super.getColumnWidth();
        }
        int i;
        try
        {
            Field field = android/widget/GridView.getDeclaredField("mColumnWidth");
            field.setAccessible(true);
            i = field.getInt(this);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        return i;
    }

    private int getNumColumnsCompatible()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return super.getNumColumns();
        }
        int i;
        try
        {
            Field field = android/widget/GridView.getDeclaredField("mNumColumns");
            field.setAccessible(true);
            i = field.getInt(this);
        }
        catch (Exception exception)
        {
            if (b != -1)
            {
                return b;
            } else
            {
                throw new RuntimeException("Can not determine the mNumColumns for this API platform, please call setNumColumns to set it.");
            }
        }
        return i;
    }

    public int getFooterViewCount()
    {
        return f.size();
    }

    public int getHeaderViewCount()
    {
        return e.size();
    }

    public int getHorizontalSpacing()
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                Field field = android/widget/GridView.getDeclaredField("mHorizontalSpacing");
                field.setAccessible(true);
                return field.getInt(this);
            }
            i = super.getHorizontalSpacing();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    public int getRowHeight()
    {
        if (d > 0)
        {
            return d;
        }
        Object obj = getAdapter();
        int j = getNumColumnsCompatible();
        if (obj == null || ((ListAdapter) (obj)).getCount() <= (e.size() + f.size()) * j)
        {
            return -1;
        }
        int i = getColumnWidthCompatible();
        View view = getAdapter().getView(j * e.size(), c, this);
        android.widget.AbsListView.LayoutParams layoutparams = (android.widget.AbsListView.LayoutParams)view.getLayoutParams();
        obj = layoutparams;
        if (layoutparams == null)
        {
            obj = new android.widget.AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        j = getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 0, ((android.widget.AbsListView.LayoutParams) (obj)).height);
        view.measure(getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), 0, ((android.widget.AbsListView.LayoutParams) (obj)).width), j);
        c = view;
        d = view.getMeasuredHeight();
        return d;
    }

    public int getVerticalSpacing()
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                Field field = android/widget/GridView.getDeclaredField("mVerticalSpacing");
                field.setAccessible(true);
                return field.getInt(this);
            }
            i = super.getVerticalSpacing();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c = null;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof b))
        {
            ((b)listadapter).a(getNumColumnsCompatible());
            ((b)listadapter).b(getRowHeight());
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (e.size() > 0 || f.size() > 0)
        {
            listadapter = new b(e, f, listadapter);
            int i = getNumColumnsCompatible();
            if (i > 1)
            {
                listadapter.a(i);
            }
            listadapter.b(getRowHeight());
            super.setAdapter(listadapter);
            return;
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setClipChildren(boolean flag)
    {
    }

    public void setClipChildrenSupper(boolean flag)
    {
        super.setClipChildren(false);
    }

    public void setNumColumns(int i)
    {
        super.setNumColumns(i);
        b = i;
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && (listadapter instanceof b))
        {
            ((b)listadapter).a(i);
        }
    }

}
