// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import org.chromium.base.ApplicationStatus;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy
    implements org.chromium.base.ApplicationStatus.b
{

    private boolean c;

    public RegistrationPolicyApplicationStatus()
    {
        c = false;
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            a();
        } else
        if (i == 2)
        {
            if (!NetworkChangeNotifierAutoDetect.RegistrationPolicy.b && super.a == null)
            {
                throw new AssertionError();
            } else
            {
                super.a.c();
                return;
            }
        }
    }

    protected final void a(NetworkChangeNotifierAutoDetect networkchangenotifierautodetect)
    {
        super.a(networkchangenotifierautodetect);
        ApplicationStatus.a(this);
        a(ApplicationStatus.c());
    }

    protected final void b()
    {
        if (c)
        {
            return;
        } else
        {
            ApplicationStatus.b(this);
            c = true;
            return;
        }
    }
}
