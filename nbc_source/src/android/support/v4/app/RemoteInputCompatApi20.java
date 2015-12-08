// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;

class RemoteInputCompatApi20
{

    static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        if (aremoteinput != null) goto _L2; else goto _L1
_L1:
        RemoteInput aremoteinput1[] = null;
_L4:
        return aremoteinput1;
_L2:
        RemoteInput aremoteinput2[] = new RemoteInput[aremoteinput.length];
        int i = 0;
        do
        {
            aremoteinput1 = aremoteinput2;
            if (i >= aremoteinput.length)
            {
                continue;
            }
            RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
            aremoteinput2[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
