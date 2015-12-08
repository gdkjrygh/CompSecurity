// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aa, ai

public static final class a
{

    public final Bundle a;
    private final int b;
    private final CharSequence c;
    private final PendingIntent d;
    private ArrayList e;

    public final a a(ai ai1)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(ai1);
        return this;
    }

    public final e a()
    {
        ai aai[];
        if (e != null)
        {
            aai = (ai[])e.toArray(new ai[e.size()]);
        } else
        {
            aai = null;
        }
        return new nit>(b, c, d, a, aai, (byte)0);
    }

    public (int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle());
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        b = i;
        c = mitCharSequenceLength(charsequence);
        d = pendingintent;
        a = bundle;
    }
}
