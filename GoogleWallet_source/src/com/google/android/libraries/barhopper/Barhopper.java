// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.barhopper;


// Referenced classes of package com.google.android.libraries.barhopper:
//            RecognitionOptions, Barcode

public class Barhopper
{

    public Barhopper()
    {
    }

    public static Barcode[] recognize(int i, int j, byte abyte0[], RecognitionOptions recognitionoptions)
    {
        return recognizeWithOptionsNative(i, j, abyte0, recognitionoptions);
    }

    private static native Barcode[] recognizeWithOptionsNative(int i, int j, byte abyte0[], RecognitionOptions recognitionoptions);

    static 
    {
        System.loadLibrary("barhopper");
    }
}
