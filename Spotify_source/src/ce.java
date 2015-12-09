// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.RemoteInput;

final class ce
{

    static RemoteInput[] a(cg acg[])
    {
        if (acg == null)
        {
            return null;
        }
        RemoteInput aremoteinput[] = new RemoteInput[acg.length];
        for (int i = 0; i < acg.length; i++)
        {
            cg cg1 = acg[i];
            aremoteinput[i] = (new android.app.RemoteInput.Builder(cg1.a())).setLabel(cg1.b()).setChoices(cg1.c()).setAllowFreeFormInput(cg1.d()).addExtras(cg1.e()).build();
        }

        return aremoteinput;
    }
}
