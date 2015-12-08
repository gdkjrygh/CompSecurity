// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.android.util.ViewUtil;
import java.util.ArrayList;

public class ActionSpinner extends Spinner
{
    public static class Item
    {

        private String a;
        private String b;
        private Object c;

        public final String a()
        {
            return a;
        }

        public final String b()
        {
            return b;
        }

        public final Object c()
        {
            return c;
        }

        public Item(String s, String s1, Object obj)
        {
            a = s;
            b = s1;
            c = obj;
        }
    }

    public class SpinnerAdapter extends ArrayAdapter
    {

        final ActionSpinner a;
        private ArrayList b;
        private LayoutInflater c;

        public int getCount()
        {
            return b.size();
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            if (viewgroup instanceof ListView)
            {
                ListView listview = (ListView)viewgroup;
                if (!(listview.getOnItemClickListener() instanceof a))
                {
                    listview.setOnItemClickListener(a. new a(listview.getOnItemClickListener()));
                }
            }
            return a.a(i, view, c, viewgroup);
        }

        public Object getItem(int i)
        {
            return (Item)b.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Object obj;
label0:
            {
                if (view != null)
                {
                    obj = view;
                    if (view instanceof ImageView)
                    {
                        break label0;
                    }
                }
                obj = new ImageView(getContext());
            }
            viewgroup.setPadding(0, 0, 0, 0);
            view = (ImageView)obj;
            view.setImageDrawable(a.a());
            view.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            view.setPadding(5, 5, 5, 5);
            view.setContentDescription(a.c);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, a.getResources().getDimensionPixelSize(0x7f0c0002)));
            return view;
        }

        public SpinnerAdapter(Context context, int i, ArrayList arraylist)
        {
            a = ActionSpinner.this;
            super(context, i, arraylist);
            setDropDownViewResource(i);
            b = arraylist;
            c = LayoutInflater.from(context);
        }
    }

    private final class a
        implements android.widget.AdapterView.OnItemClickListener
    {

        android.widget.AdapterView.OnItemClickListener a;
        final ActionSpinner b;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (b.b != null)
            {
                b.b.onItemSelected(adapterview, view, i, l);
            }
            a.onItemClick(adapterview, view, i, l);
        }

        a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
        {
            b = ActionSpinner.this;
            super();
            a = onitemclicklistener;
        }
    }


    protected ArrayList a;
    protected android.widget.AdapterView.OnItemSelectedListener b;
    protected String c;

    public ActionSpinner(Context context)
    {
        super(context, null);
        c = null;
        a(context, null);
    }

    public ActionSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = null;
        a(context, attributeset);
    }

    public ActionSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = null;
        a(context, attributeset);
    }

    public Drawable a()
    {
        Object obj = getResources().getDrawable(0x7f0201f7);
        BitmapDrawable bitmapdrawable = (BitmapDrawable)getResources().getDrawable(0x7f020206);
        bitmapdrawable.setGravity(85);
        obj = new LayerDrawable(new Drawable[] {
            obj, bitmapdrawable
        });
        ((LayerDrawable) (obj)).setLayerInset(1, 0, 0, -5, -5);
        return ((Drawable) (obj));
    }

    protected View a(int i, View view, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        Item item = (Item)a.get(i);
        viewgroup = view;
        if (view == null)
        {
            viewgroup = layoutinflater.inflate(b(), null);
        }
        view = (TextView)viewgroup.findViewById(0x1020014);
        i = (int)getResources().getDimension(0x7f0c00c2);
        view.setPadding(i, i, (int)getResources().getDimension(0x7f0c00c7), i);
        view.setText(item.a());
        return viewgroup;
    }

    protected final void a(Context context, AttributeSet attributeset)
    {
        if (attributeset != null)
        {
            c = attributeset.getAttributeValue("android", "title");
        }
        ViewUtil.a(this, getResources().getDrawable(0x7f020173));
        ViewUtil.a(this, getResources().getDrawable(0x7f0201ca));
        c();
        setAdapter(new SpinnerAdapter(getContext(), b(), a));
        if (!(getParent() instanceof LinearLayout))
        {
            context = new android.support.v7.widget.ActionMenuView.c(-1, context.getResources().getDimensionPixelSize(0x7f0c0002));
            context.h = 17;
            setLayoutParams(context);
        }
        setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final ActionSpinner a;

            public final boolean onLongClick(View view)
            {
                if (a.a.size() == 1)
                {
                    if (a.c != null)
                    {
                        Toast.makeText(a.getContext(), a.c, 1).show();
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = ActionSpinner.this;
                super();
            }
        });
    }

    protected int b()
    {
        return 0x1090009;
    }

    protected void c()
    {
        a = new ArrayList();
    }

    public boolean performClick()
    {
        if (a.size() == 1)
        {
            if (b != null)
            {
                b.onItemSelected(this, null, 0, 0L);
            }
            return true;
        } else
        {
            return super.performClick();
        }
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        b = onitemselectedlistener;
    }

    public void setSelection(int i)
    {
    }
}
