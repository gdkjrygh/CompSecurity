// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.pandora.android.util.Switch;
import com.pandora.radio.data.y;

// Referenced classes of package com.pandora.android.artist:
//            f

public class d extends CursorAdapter
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/artist/d$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("STATION", 0);
            b = new a("HEADER", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private LayoutInflater a;
    private volatile boolean b;

    public d(Context context, Cursor cursor, boolean flag)
    {
        super(context, cursor, false);
        b = flag;
        a = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public void a(boolean flag)
    {
        b = flag;
        notifyDataSetChanged();
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int i = cursor.getPosition();
        context = new y(cursor);
        cursor = (f)cursor;
        ((TextView)view.findViewById(0x7f10011b)).setText(context.d());
        view = (Switch)view.findViewById(0x7f1002a9);
        view.setEnabled(b);
        view.setOnCheckedChangeListener(null);
        view.setChecked(cursor.a(i, context.J()));
        view.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(cursor, i, context) {

            final f a;
            final int b;
            final y c;
            final d d;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                a.a(b, c.c(), c.J(), flag);
            }

            
            {
                d = d.this;
                a = f1;
                b = i;
                c = y1;
                super();
            }
        });
    }

    public int getItemViewType(int i)
    {
        if (i < 0 || i >= getCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("size: ").append(getCount()).append(", index: ").append(i).toString());
        } else
        {
            return a.a.ordinal();
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a.inflate(0x7f0400a1, viewgroup, false);
    }
}
