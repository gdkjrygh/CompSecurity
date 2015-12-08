// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.advanced;

import android.graphics.Bitmap;
import com.moodstocks.android.Scanner;
import com.moodstocks.android.core.Loader;

public class Image
{

    private long ptr;
    private int refCount;

    public Image(Bitmap bitmap)
    {
        ptr = 0L;
        refCount = 1;
        if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
        {
            throw new IllegalArgumentException("Input Bitmap must be of type ARGB_8888");
        } else
        {
            initializeFromBitmap(bitmap);
            return;
        }
    }

    public Image(byte abyte0[], int i, int j, int k)
    {
        int l;
        l = 1;
        super();
        ptr = 0L;
        refCount = 1;
        k;
        JVM INSTR lookupswitch 4: default 60
    //                   0: 63
    //                   90: 74
    //                   180: 81
    //                   270: 87;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l = 0;
_L7:
        initializeFromNV21(abyte0, i, j, i, l);
        return;
_L3:
        l = 8;
        continue; /* Loop/switch isn't completed */
_L4:
        l = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        l = 6;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private native void destruct();

    private static native void init();

    private native void initializeFromBitmap(Bitmap bitmap);

    private native void initializeFromNV21(byte abyte0[], int i, int j, int k, int l);

    public void release()
    {
        refCount = refCount - 1;
        if (refCount <= 0)
        {
            destruct();
        }
    }

    public Image retain()
    {
        refCount = refCount + 1;
        return this;
    }

    static 
    {
        Loader.load();
        if (Scanner.isCompatible())
        {
            init();
        }
    }
}
