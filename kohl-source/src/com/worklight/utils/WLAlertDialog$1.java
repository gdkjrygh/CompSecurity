// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import android.content.DialogInterface;
import android.os.Process;

// Referenced classes of package com.worklight.utils:
//            WLAlertDialog

static final class ickListener
    implements android.content.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Process.killProcess(Process.myPid());
    }

    ickListener()
    {
    }
}
