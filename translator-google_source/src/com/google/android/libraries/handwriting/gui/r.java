// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            n, o

final class r
    implements Runnable
{

    final n a;
    private final n b;
    private final StrokeList c;
    private final com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException d;

    r(n n1, n n2, StrokeList strokelist, com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException recognitionfailedexception)
    {
        a = n1;
        super();
        b = n2;
        c = strokelist;
        d = recognitionfailedexception;
    }

    public final void run()
    {
        a.a.a(b, d);
    }
}
