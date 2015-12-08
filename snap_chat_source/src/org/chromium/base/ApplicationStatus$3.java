// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            ApplicationStatus

static final class _cls1
    implements Runnable
{

    public final void run()
    {
        if (ApplicationStatus.e() != null)
        {
            return;
        } else
        {
            ApplicationStatus.c(new ApplicationStatus.b() {

                public final void a(int i)
                {
                    ApplicationStatus.a(i);
                }

            });
            ApplicationStatus.a(ApplicationStatus.e());
            return;
        }
    }

    _cls1()
    {
    }
}
