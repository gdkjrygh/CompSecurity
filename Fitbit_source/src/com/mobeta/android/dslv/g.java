// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.mobeta.android.dslv:
//            f

public class g extends f
{

    protected int b[];
    protected int c[];
    String d[];
    private int e;
    private a f;
    private b g;

    public g(Context context, int i, Cursor cursor, String as[], int ai[])
    {
        super(context, i, cursor);
        e = -1;
        c = ai;
        d = as;
        a(cursor, as);
    }

    public g(Context context, int i, Cursor cursor, String as[], int ai[], int j)
    {
        super(context, i, cursor, j);
        e = -1;
        c = ai;
        d = as;
        a(cursor, as);
    }

    private void a(Cursor cursor, String as[])
    {
        if (cursor != null)
        {
            int j = as.length;
            if (b == null || b.length != j)
            {
                b = new int[j];
            }
            for (int i = 0; i < j; i++)
            {
                b[i] = cursor.getColumnIndexOrThrow(as[i]);
            }

        } else
        {
            b = null;
        }
    }

    public void a(Cursor cursor, String as[], int ai[])
    {
        d = as;
        c = ai;
        a(cursor, d);
        super.changeCursor(cursor);
    }

    public void a(ImageView imageview, String s)
    {
        try
        {
            imageview.setImageResource(Integer.parseInt(s));
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            imageview.setImageURI(Uri.parse(s));
        }
    }

    public void a(TextView textview, String s)
    {
        textview.setText(s);
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(b b1)
    {
        g = b1;
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        b b1 = g;
        int j = c.length;
        int ai[] = b;
        int ai1[] = c;
        int i = 0;
        while (i < j) 
        {
            View view1 = view.findViewById(ai1[i]);
            if (view1 == null)
            {
                continue;
            }
    /* block-local class not found */
    class b {}

            boolean flag;
            if (b1 != null)
            {
                flag = b1.a(view1, cursor, ai[i]);
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                String s = cursor.getString(ai[i]);
                context = s;
                if (s == null)
                {
                    context = "";
                }
                if (view1 instanceof TextView)
                {
                    a((TextView)view1, context);
                } else
                if (view1 instanceof ImageView)
                {
                    a((ImageView)view1, context);
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append(view1.getClass().getName()).append(" is not a ").append(" view that can be bounds by this SimpleCursorAdapter").toString());
                }
            }
            i++;
        }
    }

    public b c()
    {
        return g;
    }

    public CharSequence convertToString(Cursor cursor)
    {
    /* block-local class not found */
    class a {}

        if (f != null)
        {
            return f.a(cursor);
        }
        if (e > -1)
        {
            return cursor.getString(e);
        } else
        {
            return super.convertToString(cursor);
        }
    }

    public int d()
    {
        return e;
    }

    public a e()
    {
        return f;
    }

    public void f(int i)
    {
        e = i;
    }

    public Cursor swapCursor(Cursor cursor)
    {
        a(cursor, d);
        return super.swapCursor(cursor);
    }
}
