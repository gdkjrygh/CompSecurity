// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class bd
    implements Runnable
{

    final KeyboardHandwritingPopup a;

    bd(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void run()
    {
        KeyboardHandwritingPopup.e(a);
    }
}
