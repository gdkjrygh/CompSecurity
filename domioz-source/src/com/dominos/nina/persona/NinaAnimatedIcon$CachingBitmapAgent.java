// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Bitmap;
import android.util.SparseArray;

class decoderBitmapCache extends decoderBitmapCache
{

    final SparseArray decoderBitmapCache;
    final int sheetId;

    Bitmap getBitmap(int i)
    {
        Object obj = (decoderBitmapCache)decoderBitmapCache.get(i);
        if (obj != null)
        {
            if (sheetId == ((sheetId) (obj)).eetId)
            {
                return ((eetId) (obj)).tmap;
            }
            ((tmap) (obj)).tmap.recycle();
        }
        obj = glob.p(i, null);
        decoderBitmapCache decoderbitmapcache = new nit>(sheetId, ((Bitmap) (obj)));
        decoderBitmapCache.put(i, decoderbitmapcache);
        return ((Bitmap) (obj));
    }

    ( , SparseArray sparsearray, int i)
    {
        super();
        sheetId = i;
        decoderBitmapCache = sparsearray;
    }
}
