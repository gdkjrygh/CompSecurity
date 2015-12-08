// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.userfeedback.android.api:
//            y, l

public final class ah
{

    final Context a;
    final Activity b;
    final View c;
    final String d;
    final String e;
    List f;
    boolean g;
    boolean h;
    boolean i;
    String j;
    boolean k;
    boolean l;
    y m;
    String n;
    l o;
    String p;
    private Bitmap q;
    private boolean r;

    public ah(Activity activity, Context context, View view, String s, String s1, String s2, boolean flag)
    {
        h = true;
        i = true;
        b = activity;
        a = context;
        if (view != null)
        {
            c = view.getRootView();
            c.setDrawingCacheEnabled(true);
        } else
        {
            c = null;
        }
        d = s;
        e = s1;
        f = new LinkedList();
        g = flag;
        q = null;
        k = false;
        l = false;
        m = null;
        n = s2;
        o = null;
        p = null;
        r = false;
    }

    public ah(Activity activity, View view, String s, String s1)
    {
        this(activity, view, s, s1, (byte)0);
    }

    private ah(Activity activity, View view, String s, String s1, byte byte0)
    {
        this(activity, activity.getApplicationContext(), view, s, s1, null, true);
    }

    public final Bitmap a()
    {
        Object obj = null;
        Bitmap bitmap = obj;
        if (g)
        {
            if (q != null)
            {
                bitmap = q;
            } else
            {
                bitmap = obj;
                if (c != null)
                {
                    Bitmap bitmap1;
                    try
                    {
                        bitmap1 = c.getDrawingCache(r);
                    }
                    catch (Exception exception)
                    {
                        String s = String.valueOf(exception.getMessage());
                        if (s.length() != 0)
                        {
                            "Error generating screenshot: ".concat(s);
                            return null;
                        } else
                        {
                            new String("Error generating screenshot: ");
                            return null;
                        }
                    }
                    return bitmap1;
                }
            }
        }
        return bitmap;
    }

    public final void a(Bitmap bitmap)
    {
        g = true;
        q = bitmap;
    }
}
