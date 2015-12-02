// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.Activity;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threadlist.s;
import com.facebook.orca.threadlist.t;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewActivity

public class do
{

    public do()
    {
    }

    public String a(Activity activity)
    {
        ThreadViewSpec threadviewspec = null;
        if (!(activity instanceof ThreadViewActivity)) goto _L2; else goto _L1
_L1:
        threadviewspec = ((ThreadViewActivity)activity).j();
_L4:
        return threadviewspec.d();
_L2:
        if (activity instanceof s)
        {
            threadviewspec = ((s)activity).a().v();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b(Activity activity)
    {
        return (activity instanceof ThreadViewActivity) || (activity instanceof s) && ((s)activity).a().w();
    }
}
