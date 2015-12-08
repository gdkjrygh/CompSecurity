// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            ab, HandwritingOverlayView

final class ac
    implements Runnable
{

    final RecognitionResult a;
    final ab b;

    ac(ab ab1, RecognitionResult recognitionresult)
    {
        b = ab1;
        a = recognitionresult;
        super();
    }

    public final void run()
    {
        b.c.a(a.j, true);
    }
}
