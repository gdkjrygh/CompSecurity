// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.i;

import android.content.Context;
import android.widget.Toast;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.ui.i:
//            b, a

public class g
{

    private b a;
    private Context b;

    public g(Context context, b b1)
    {
        a = b1;
        b = context;
    }

    private static String a()
    {
        return (new Throwable()).getStackTrace()[2].getClassName();
    }

    public static void a(Context context, int i)
    {
        a(context, ((CharSequence) (context.getString(i))), 0, null, null, a());
    }

    public static void a(Context context, CharSequence charsequence, int i, String s, String s1, String s2)
    {
        b b1;
        int j;
        if (charsequence.length() > 60)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        b1 = (b)t.a(context).a(com/facebook/ui/i/b);
        context = Toast.makeText(context, charsequence, j);
        if (i != 0)
        {
            context.setGravity(i, 0, 0);
        }
        context.show();
        b1.a(charsequence, s1, s, s2);
    }

    public void a(a a1)
    {
        Object obj;
        Object obj1;
        String s;
        String s1;
        int i;
        if (a1.a() == null)
        {
            obj = b.getString(a1.b());
        } else
        {
            obj = a1.a();
        }
        if (((CharSequence) (obj)).length() > 60)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = Toast.makeText(b, ((CharSequence) (obj)), i);
        if (a1.c() != 0)
        {
            ((Toast) (obj1)).setGravity(a1.c(), 0, 0);
        }
        ((Toast) (obj1)).show();
        obj1 = a;
        s = a1.e();
        s1 = a1.d();
        if (a1.f() == null)
        {
            a1 = a();
        } else
        {
            a1 = a1.f();
        }
        ((b) (obj1)).a(((CharSequence) (obj)), s, s1, a1);
    }
}
