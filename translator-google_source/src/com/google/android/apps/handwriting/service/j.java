// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import com.google.android.libraries.handwriting.base.RecognitionResult;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            m, a, HandwritingRecognizer

final class j extends m
{

    final HandwritingRecognizer a;
    private final a b;

    j(HandwritingRecognizer handwritingrecognizer, a a1)
    {
        a = handwritingrecognizer;
        super();
        b = a1;
    }

    public final void a(int i, int k, Intent intent)
    {
        b.a(i, k);
    }

    public final void a(int i, Intent intent)
    {
        b.a(i, intent);
    }

    public final void a(int i, RecognitionResult recognitionresult)
    {
        b.a(i, recognitionresult);
    }

    public final void a(String s)
    {
        a.e = s;
    }
}
