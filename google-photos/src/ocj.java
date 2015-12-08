// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public class ocj
    implements mru
{

    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public String e;

    public ocj(int i, float f, int j, float f1)
    {
        a = i;
        b = f;
        c = j;
        d = f1;
    }

    public final String a(Context context, mrw mrw1)
    {
        if (e != null)
        {
            return e;
        } else
        {
            return mrw1.a(context);
        }
    }

    public final void a(Context context)
    {
    }

    public void b(Context context)
    {
        ((mrv)olm.a(context, mrv)).a(context, this);
    }

    public String toString()
    {
        return String.format(Locale.US, "NetworkSamplingEvent networkType=%d, networkSpeedMbps=%f, initialNetworkSpeedMbps=%f, networkSpeedBucket=%d", new Object[] {
            Integer.valueOf(a), Float.valueOf(b), Float.valueOf(d), Integer.valueOf(c)
        });
    }
}
