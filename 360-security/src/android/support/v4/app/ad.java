// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

class ad
{

    static Bundle a(ac.a a1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", a1.a());
        bundle.putCharSequence("label", a1.b());
        bundle.putCharSequenceArray("choices", a1.c());
        bundle.putBoolean("allowFreeFormInput", a1.d());
        bundle.putBundle("extras", a1.e());
        return bundle;
    }

    static Bundle[] a(ac.a aa[])
    {
        if (aa == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[aa.length];
        for (int i = 0; i < aa.length; i++)
        {
            abundle[i] = a(aa[i]);
        }

        return abundle;
    }
}
