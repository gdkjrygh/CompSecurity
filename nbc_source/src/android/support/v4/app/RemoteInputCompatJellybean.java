// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

class RemoteInputCompatJellybean
{

    static Bundle toBundle(RemoteInputCompatBase.RemoteInput remoteinput)
    {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteinput.getResultKey());
        bundle.putCharSequence("label", remoteinput.getLabel());
        bundle.putCharSequenceArray("choices", remoteinput.getChoices());
        bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
        bundle.putBundle("extras", remoteinput.getExtras());
        return bundle;
    }

    static Bundle[] toBundleArray(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        if (aremoteinput != null) goto _L2; else goto _L1
_L1:
        Bundle abundle[] = null;
_L4:
        return abundle;
_L2:
        Bundle abundle1[] = new Bundle[aremoteinput.length];
        int i = 0;
        do
        {
            abundle = abundle1;
            if (i >= aremoteinput.length)
            {
                continue;
            }
            abundle1[i] = toBundle(aremoteinput[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
