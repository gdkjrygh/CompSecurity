// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            cq

final class cs
{

    static Bundle[] a(cq acq[])
    {
        if (acq == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[acq.length];
        for (int i = 0; i < acq.length; i++)
        {
            cq cq1 = acq[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", cq1.a());
            bundle.putCharSequence("label", cq1.b());
            bundle.putCharSequenceArray("choices", cq1.c());
            bundle.putBoolean("allowFreeFormInput", cq1.d());
            bundle.putBundle("extras", cq1.e());
            abundle[i] = bundle;
        }

        return abundle;
    }
}
