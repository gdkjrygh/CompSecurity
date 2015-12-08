// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            x, ae

public static final class d
{

    private final int a;
    private final CharSequence b;
    private final PendingIntent c;
    private final Bundle d;
    private ArrayList e;

    public final d a(ae ae1)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(ae1);
        return this;
    }

    public final e a()
    {
        ae aae[];
        if (e != null)
        {
            aae = (ae[])e.toArray(new ae[e.size()]);
        } else
        {
            aae = null;
        }
        return new nit>(a, b, c, d, aae, (byte)0);
    }

    public (int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle());
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        a = i;
        b = b(charsequence);
        c = pendingintent;
        d = bundle;
    }
}
