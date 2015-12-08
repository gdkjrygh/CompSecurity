// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            ChildProcessLauncher, ChildProcessConnection

static final class DeathCallback
    implements DeathCallback
{

    public void onChildProcessDied(ChildProcessConnection childprocessconnection)
    {
        if (childprocessconnection.getPid() != 0)
        {
            ChildProcessLauncher.stop(childprocessconnection.getPid());
            return;
        } else
        {
            ChildProcessLauncher.access$000(childprocessconnection);
            return;
        }
    }

    DeathCallback()
    {
    }
}
