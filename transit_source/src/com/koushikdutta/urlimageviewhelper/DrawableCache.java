// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;


// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            SoftReferenceHashTable

public final class DrawableCache extends SoftReferenceHashTable
{

    private static DrawableCache mInstance = new DrawableCache();

    private DrawableCache()
    {
    }

    public static DrawableCache getInstance()
    {
        return mInstance;
    }

}
