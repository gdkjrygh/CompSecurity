// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import com.microsoft.advertising.android.AdControl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdControlManager, ConfigManager

final class a
    implements Runnable
{

    final SkypeAdControlManager a;

    public final void run()
    {
        String s;
        for (Iterator iterator = SkypeAdControlManager.b(a).keySet().iterator(); iterator.hasNext(); ConfigManager.a((AdControl)SkypeAdControlManager.b(a).get(s)))
        {
            s = (String)iterator.next();
        }

    }

    (SkypeAdControlManager skypeadcontrolmanager)
    {
        a = skypeadcontrolmanager;
        super();
    }
}
