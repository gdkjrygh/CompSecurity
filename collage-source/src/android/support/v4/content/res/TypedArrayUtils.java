// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content.res;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public class TypedArrayUtils
{

    public TypedArrayUtils()
    {
    }

    public static boolean getBoolean(TypedArray typedarray, int i, int j, boolean flag)
    {
        return typedarray.getBoolean(i, typedarray.getBoolean(j, flag));
    }

    public static Drawable getDrawable(TypedArray typedarray, int i, int j)
    {
        Drawable drawable1 = typedarray.getDrawable(i);
        Drawable drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = typedarray.getDrawable(j);
        }
        return drawable;
    }

    public static int getInt(TypedArray typedarray, int i, int j, int k)
    {
        return typedarray.getInt(i, typedarray.getInt(j, k));
    }

    public static int getResourceId(TypedArray typedarray, int i, int j, int k)
    {
        return typedarray.getResourceId(i, typedarray.getResourceId(j, k));
    }

    public static String getString(TypedArray typedarray, int i, int j)
    {
        String s1 = typedarray.getString(i);
        String s = s1;
        if (s1 == null)
        {
            s = typedarray.getString(j);
        }
        return s;
    }

    public static CharSequence[] getTextArray(TypedArray typedarray, int i, int j)
    {
        CharSequence acharsequence1[] = typedarray.getTextArray(i);
        CharSequence acharsequence[] = acharsequence1;
        if (acharsequence1 == null)
        {
            acharsequence = typedarray.getTextArray(j);
        }
        return acharsequence;
    }
}
