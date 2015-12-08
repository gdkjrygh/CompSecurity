// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kik.android.chat.b.b;

// Referenced classes of package kik.android.chat.fragment:
//            ChatBubbleSelectionFragment

private static final class b extends BaseAdapter
{
    private static final class a
    {

        public TextView a;
        public ImageView b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private List a;
    private final LayoutInflater b;
    private b c;

    private b a(int i)
    {
        if (i >= 0 && i < a.size())
        {
            return (b)a.get(i);
        } else
        {
            return null;
        }
    }

    static void a(a a1, b b1)
    {
        a1.c = b1;
        a1.notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        b b1;
        if (view == null)
        {
            view = b.inflate(0x7f030064, viewgroup, false);
            viewgroup = new a((byte)0);
            viewgroup.a = (TextView)view.findViewById(0x7f0e0150);
            viewgroup.b = (ImageView)view.findViewById(0x7f0e013b);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        b1 = a(i);
        if (b1 != null)
        {
            ((a) (viewgroup)).a.setText(b1.a());
            ImageView imageview = ((a) (viewgroup)).b;
            i = b1.c();
            GradientDrawable gradientdrawable = new GradientDrawable();
            gradientdrawable.setShape(1);
            gradientdrawable.setColor(i);
            imageview.setBackgroundDrawable(gradientdrawable);
            if (b1.b() == 0xff000000)
            {
                ((a) (viewgroup)).b.setImageResource(0x7f020071);
            } else
            {
                ((a) (viewgroup)).b.setImageResource(0x7f020072);
            }
            if (c == b1)
            {
                if (b1.b() == 0xff000000)
                {
                    ((a) (viewgroup)).b.setImageResource(0x7f020074);
                } else
                {
                    ((a) (viewgroup)).b.setImageResource(0x7f020076);
                }
            }
        }
        view.setTag(viewgroup);
        return view;
    }

    public a(Context context, List list)
    {
        a = list;
        b = LayoutInflater.from(context);
    }
}
