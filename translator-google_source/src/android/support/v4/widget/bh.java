// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//            bb, bj, bi

public final class bh extends bb
{

    public int j[];
    public int k[];
    public bj l;
    String m[];
    private int n;
    private bi o;

    public bh(Context context, int i, String as[], int ai[])
    {
        super(context, i, (byte)0);
        n = -1;
        k = ai;
        m = as;
        a(as);
    }

    private void a(String as[])
    {
        if (c != null)
        {
            int i1 = as.length;
            if (j == null || j.length != i1)
            {
                j = new int[i1];
            }
            for (int i = 0; i < i1; i++)
            {
                j[i] = c.getColumnIndexOrThrow(as[i]);
            }

        } else
        {
            j = null;
        }
    }

    public final void a(View view, Cursor cursor)
    {
        bj bj1 = l;
        int i1 = k.length;
        int ai[] = j;
        int ai1[] = k;
        int i = 0;
        while (i < i1) 
        {
            Object obj = view.findViewById(ai1[i]);
            if (obj == null)
            {
                continue;
            }
            boolean flag;
            if (bj1 != null)
            {
                flag = bj1.a(((View) (obj)), cursor, ai[i]);
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                String s1 = cursor.getString(ai[i]);
                String s = s1;
                if (s1 == null)
                {
                    s = "";
                }
                if (obj instanceof TextView)
                {
                    ((TextView)obj).setText(s);
                } else
                if (obj instanceof ImageView)
                {
                    ImageView imageview = (ImageView)obj;
                    try
                    {
                        imageview.setImageResource(Integer.parseInt(s));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        imageview.setImageURI(Uri.parse(s));
                    }
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append(obj.getClass().getName()).append(" is not a  view that can be bounds by this SimpleCursorAdapter").toString());
                }
            }
            i++;
        }
    }

    public final Cursor b(Cursor cursor)
    {
        cursor = super.b(cursor);
        a(m);
        return cursor;
    }

    public final CharSequence c(Cursor cursor)
    {
        if (o != null)
        {
            return o.a();
        }
        if (n >= 0)
        {
            return cursor.getString(n);
        } else
        {
            return super.c(cursor);
        }
    }
}
