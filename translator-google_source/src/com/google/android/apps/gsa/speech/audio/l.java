// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.shared.util.g;
import com.google.common.base.p;

public final class l
{

    private final f a;
    private float b;
    private boolean c;

    public l(f f1)
    {
        a = f1;
        b = 75F;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        long l2 = 0L;
        long l1 = 0L;
        int k = j / 2;
        for (j = i + j; j >= i + 2; j -= 2)
        {
            int i1 = (short)((abyte0[j - 1] << 8) + (abyte0[j - 2] & 0xff));
            l2 += i1;
            l1 += i1 * i1;
        }

        float f3 = (float)Math.sqrt((l1 * (long)k - l2 * l2) / (long)(k * k));
        if (!c && f3 == 0.0F)
        {
            L.a(5, "SpeechLevelGenerator", "Really low audio levels detected. The audio input may have issues.", new Object[0]);
            c = true;
        }
        float f1;
        float f2;
        g g1;
        boolean flag;
        if (b < f3)
        {
            b = 0.999F * b + 0.001F * f3;
        } else
        {
            b = 0.95F * b + 0.05F * f3;
        }
        f2 = -120F;
        f1 = f2;
        if ((double)b > 0.0D)
        {
            f1 = f2;
            if ((double)(f3 / b) > 9.9999999999999995E-07D)
            {
                f1 = 10F * (float)Math.log10(f3 / b);
            }
        }
        abyte0 = a;
        i = (int)(((Math.min(Math.max(f1, -2F), 10F) + 2.0F) * 100F) / 12F);
        if (i < 30)
        {
            i = 0;
        } else
        {
            i = (i / 10) * 10;
        }
        if (i >= 0 && i <= 100 || i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        abyte0.a = i;
        g1 = ((f) (abyte0)).b;
        if (g1 != null)
        {
            g1.a(((f) (abyte0)).a);
        }
    }
}
