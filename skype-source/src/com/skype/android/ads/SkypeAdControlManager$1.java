// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import com.microsoft.advertising.android.AdControl;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdControlManager

final class a
    implements Runnable
{

    final AdControl a;
    final SkypeAdControlManager b;

    public final void run()
    {
        (new StringBuilder("cleanup ad control ")).append(a);
        a.q();
    }

    (SkypeAdControlManager skypeadcontrolmanager, AdControl adcontrol)
    {
        b = skypeadcontrolmanager;
        a = adcontrol;
        super();
    }
}
