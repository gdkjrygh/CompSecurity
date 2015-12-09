// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.ads.internal.util:
//            l, k

public class m
{

    static Bitmap a(Context context, String s)
    {
        return BitmapFactory.decodeFile((new File(context.getCacheDir(), String.format("%d.png", new Object[] {
            Integer.valueOf(s.hashCode())
        }))).getAbsolutePath());
    }

    static void a(Context context, String s, Bitmap bitmap)
    {
        context = new File(context.getCacheDir(), String.format("%d.png", new Object[] {
            Integer.valueOf(s.hashCode())
        }));
        try
        {
            context = new FileOutputStream(context);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, context);
            context.flush();
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, List list, l l1)
    {
        int ai[] = new int[1];
        ai[0] = list.size();
        if (ai[0] == 0)
        {
            if (l1 != null)
            {
                l1.a();
            }
        } else
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s = (String)list.next();
                (new k(context)).a(new l(ai, l1) {

                    final int a[];
                    final l b;

                    public void a()
                    {
                        int ai1[] = a;
                        ai1[0] = ai1[0] - 1;
                        if (a[0] == 0 && b != null)
                        {
                            b.a();
                        }
                    }

            
            {
                a = ai;
                b = l1;
                super();
            }
                }).execute(new String[] {
                    s
                });
            }
        }
    }
}
