// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;

final class aj
{

    static RemoteInput[] a(ak.a aa[])
    {
        if (aa == null)
        {
            return null;
        }
        RemoteInput aremoteinput[] = new RemoteInput[aa.length];
        for (int i = 0; i < aa.length; i++)
        {
            ak.a a1 = aa[i];
            aremoteinput[i] = (new android.app.RemoteInput.Builder(a1.a())).setLabel(a1.b()).setChoices(a1.c()).setAllowFreeFormInput(a1.d()).addExtras(a1.e()).build();
        }

        return aremoteinput;
    }
}
