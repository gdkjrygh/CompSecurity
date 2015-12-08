// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.widget.TextView;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            UIHandler

final class ad
    implements Runnable
{

    final String a;
    final int b;
    final UIHandler c;

    ad(UIHandler uihandler, String s, int i)
    {
        c = uihandler;
        a = s;
        b = i;
        super();
    }

    public final void run()
    {
        UIHandler.a(c).setText(a.subSequence(0, b));
        UIHandler.a(c).setContentDescription(a);
    }
}
