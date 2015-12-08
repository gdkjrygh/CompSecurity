// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

public class EmojiLruCache extends LruCache
    implements com.android.volley.toolbox.i.b
{

    private static EmojiLruCache a = null;

    private EmojiLruCache(int i)
    {
        super(i);
    }

    private EmojiLruCache(Context context)
    {
        this((((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 1024 * 1024) / 50);
    }

    public static EmojiLruCache a(Context context)
    {
        if (a == null)
        {
            a = new EmojiLruCache(context);
        }
        return a;
    }

    public final Bitmap a(String s)
    {
        return (Bitmap)get(s);
    }

    public final void a(String s, Bitmap bitmap)
    {
        put(s, bitmap);
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        return ((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight();
    }

}
