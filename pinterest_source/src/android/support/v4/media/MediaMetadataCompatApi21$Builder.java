// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.Rating;

public class 
{

    public static Object build(Object obj)
    {
        return ((android.media._cls21.Builder)obj).Builder();
    }

    public static Object newInstance()
    {
        return new android.media._cls21.Builder();
    }

    public static void putBitmap(Object obj, String s, Bitmap bitmap)
    {
        ((android.media._cls21.Builder)obj).Builder(s, bitmap);
    }

    public static void putLong(Object obj, String s, long l)
    {
        ((android.media._cls21.Builder)obj).Builder(s, l);
    }

    public static void putRating(Object obj, String s, Object obj1)
    {
        ((android.media._cls21.Builder)obj).Builder(s, (Rating)obj1);
    }

    public static void putString(Object obj, String s, String s1)
    {
        ((android.media._cls21.Builder)obj).Builder(s, s1);
    }

    public static void putText(Object obj, String s, CharSequence charsequence)
    {
        ((android.media._cls21.Builder)obj).Builder(s, charsequence);
    }

    public ()
    {
    }
}
