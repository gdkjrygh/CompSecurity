// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class Utils
{

    public static Bitmap drawableToBitmap(Drawable drawable, int i, int j)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
    }

    public static boolean isJellybeanMR1OrLater()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean isJellybeanMR2OrLater()
    {
        return android.os.Build.VERSION.SDK_INT >= 18;
    }

    public static boolean isJellybeanOrLater()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isLollipopOrLater()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static String listStringConcat(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            if (!TextUtils.isEmpty(s1))
            {
                if (!flag)
                {
                    stringbuilder.append(s);
                }
                stringbuilder.append(s1);
                flag = false;
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static void openImdbForMovie(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s))
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("imdb:///title/%s/", new Object[] {
                s
            })));
            intent.addFlags(0x80000);
            if (!tryStartActivity(context, intent))
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://m.imdb.com/title/%s/", new Object[] {
                    s
                })));
                s.addFlags(0x80000);
                context.startActivity(s);
                return;
            }
        }
    }

    public static void openImdbForPerson(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s))
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("imdb:///find?q=%s&s=nm", new Object[] {
                s
            })));
            intent.addFlags(0x80000);
            if (!tryStartActivity(context, intent))
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://m.imdb.com/find?q=%s&s=nm", new Object[] {
                    s
                })));
                s.addFlags(0x80000);
                context.startActivity(s);
                return;
            }
        }
    }

    public static boolean tryStartActivity(Context context, Intent intent)
    {
        if (intent.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(intent);
            return true;
        } else
        {
            return false;
        }
    }
}
