// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.barcode;

import com.google.android.apps.unveil.env.v;
import com.google.zxing.b;

final class UnveilHybridBinarizer extends b
{

    static native void nativeBinarizeEntireImage(int i, int j, byte abyte0[], byte abyte1[], int ai[]);

    static native void nativeBinarizeRow(int i, byte abyte0[], int j, int k, boolean aflag[]);

    static 
    {
        v.c("zxing");
    }
}
