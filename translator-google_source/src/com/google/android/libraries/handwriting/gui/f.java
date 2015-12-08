// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            HandwritingOverlayView

final class f
    implements Runnable
{

    final HandwritingOverlayView a;

    f(HandwritingOverlayView handwritingoverlayview)
    {
        a = handwritingoverlayview;
        super();
    }

    public final void run()
    {
        if (HandwritingOverlayView.a(a))
        {
            HandwritingOverlayView.b(a);
        }
    }
}
