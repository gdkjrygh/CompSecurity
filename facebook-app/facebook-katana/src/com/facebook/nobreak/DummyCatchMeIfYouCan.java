// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.Intent;
import com.facebook.common.process.ProcessName;

// Referenced classes of package com.facebook.nobreak:
//            CatchMeIfYouCan, ResetHandler

public class DummyCatchMeIfYouCan
    implements CatchMeIfYouCan
{

    DummyCatchMeIfYouCan()
    {
    }

    public final void a(Intent intent)
    {
    }

    public final void a(ResetHandler resethandler)
    {
    }

    public final boolean a(ProcessName processname)
    {
        return false;
    }

    public final void b(ProcessName processname)
    {
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
    }
}
