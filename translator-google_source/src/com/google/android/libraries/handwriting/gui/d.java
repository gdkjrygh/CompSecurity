// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;

public final class d
{

    public static final d a;
    public final RecognitionResult b;
    public final String c;

    public d(RecognitionResult recognitionresult, String s)
    {
        b = recognitionresult;
        c = s;
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(s1).length())).append("RecognitionResult: ").append(s).append(" selectedWord: ").append(s1).toString();
    }

    static 
    {
        a = new d(RecognitionResult.i, "");
    }
}
