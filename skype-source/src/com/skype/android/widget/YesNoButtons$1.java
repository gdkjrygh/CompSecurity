// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;


// Referenced classes of package com.skype.android.widget:
//            YesNoButtons

final class a
    implements Runnable
{

    final YesNoButtons a;

    public final void run()
    {
        android.view.tParams tparams = a.getLayoutParams();
        tparams.width = -1;
        a.setLayoutParams(tparams);
        a.invalidate();
    }

    (YesNoButtons yesnobuttons)
    {
        a = yesnobuttons;
        super();
    }
}
