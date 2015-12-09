// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;

// Referenced classes of package android.support.v4.app:
//            cq

final class co
{

    static RemoteInput[] a(cq acq[])
    {
        if (acq == null)
        {
            return null;
        }
        RemoteInput aremoteinput[] = new RemoteInput[acq.length];
        for (int i = 0; i < acq.length; i++)
        {
            cq cq1 = acq[i];
            aremoteinput[i] = (new android.app.RemoteInput.Builder(cq1.a())).setLabel(cq1.b()).setChoices(cq1.c()).setAllowFreeFormInput(cq1.d()).addExtras(cq1.e()).build();
        }

        return aremoteinput;
    }
}
