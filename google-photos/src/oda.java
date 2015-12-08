// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;

final class oda
    implements msc
{

    private final ocw a = new ocw();
    private final lyy b;

    oda(Context context)
    {
        b = (lyy)olm.a(context, lyy);
    }

    public final void a(Context context, mru mru, Bundle bundle)
    {
        if (!(mru instanceof obv))
        {
            return;
        } else
        {
            ocw.a(context, mru, bundle);
            return;
        }
    }

    public final boolean a(mru mru, Bundle bundle)
    {
        if (!(mru instanceof obv))
        {
            return false;
        }
        bundle = ocw.a(bundle);
        b.a("CRONET_SOCIAL", bundle, 0, ((obv)mru).a);
        if (Log.isLoggable("CronetHistogramHandler", 3))
        {
            String.format(Locale.US, "Handled event: %s", new Object[] {
                mru.toString()
            });
        }
        return true;
    }
}
