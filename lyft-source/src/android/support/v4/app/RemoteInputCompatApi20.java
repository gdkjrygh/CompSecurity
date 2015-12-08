// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

class RemoteInputCompatApi20
{

    RemoteInputCompatApi20()
    {
    }

    static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
    {
        RemoteInput.addResultsToIntent(fromCompat(aremoteinput), intent, bundle);
    }

    static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        if (aremoteinput == null)
        {
            return null;
        }
        RemoteInput aremoteinput1[] = new RemoteInput[aremoteinput.length];
        for (int i = 0; i < aremoteinput.length; i++)
        {
            RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
            aremoteinput1[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
        }

        return aremoteinput1;
    }

    static Bundle getResultsFromIntent(Intent intent)
    {
        return RemoteInput.getResultsFromIntent(intent);
    }

    static RemoteInputCompatBase.RemoteInput[] toCompat(RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput.Factory factory)
    {
        if (aremoteinput == null)
        {
            return null;
        }
        RemoteInputCompatBase.RemoteInput aremoteinput1[] = factory.newArray(aremoteinput.length);
        for (int i = 0; i < aremoteinput.length; i++)
        {
            RemoteInput remoteinput = aremoteinput[i];
            aremoteinput1[i] = factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
        }

        return aremoteinput1;
    }
}
