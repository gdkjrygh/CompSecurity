// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            ApplicationStatus

final class 
    implements 
{

    public final void a(int i)
    {
        ApplicationStatus.a(i);
    }

    ()
    {
    }

    // Unreferenced inner class org/chromium/base/ApplicationStatus$3

/* anonymous class */
    static final class ApplicationStatus._cls3
        implements Runnable
    {

        public final void run()
        {
            if (ApplicationStatus.e() != null)
            {
                return;
            } else
            {
                ApplicationStatus.c(new ApplicationStatus._cls3._cls1());
                ApplicationStatus.a(ApplicationStatus.e());
                return;
            }
        }

    }

}
