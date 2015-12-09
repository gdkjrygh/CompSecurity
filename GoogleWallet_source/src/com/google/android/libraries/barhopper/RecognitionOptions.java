// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.barhopper;


public final class RecognitionOptions
{

    private int barcodeFormats;

    public RecognitionOptions()
    {
        barcodeFormats = 0;
    }

    public final void setBarcodeFormats(int i)
    {
        barcodeFormats = i;
    }
}
