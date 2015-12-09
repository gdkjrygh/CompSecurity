// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class ch
{

    static Bundle[] a(cg acg[])
    {
        if (acg == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[acg.length];
        for (int i = 0; i < acg.length; i++)
        {
            cg cg1 = acg[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", cg1.a());
            bundle.putCharSequence("label", cg1.b());
            bundle.putCharSequenceArray("choices", cg1.c());
            bundle.putBoolean("allowFreeFormInput", cg1.d());
            bundle.putBundle("extras", cg1.e());
            abundle[i] = bundle;
        }

        return abundle;
    }
}
