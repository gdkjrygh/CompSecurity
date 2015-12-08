// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            f, a, m, j, 
//            k

public class g extends f
{
    class a
    {

        private String dt;
        private boolean du;
        final g dv;

        public String getId()
        {
            return dt;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return du;
        }

        public a(String s, boolean flag)
        {
            dv = g.this;
            super();
            dt = s;
            du = flag;
        }
    }


    private g(Context context, j j1, k k)
    {
        super(context, j1, k);
    }

    public static g a(String s, Context context)
    {
        com.google.android.gms.internal.a a1 = new com.google.android.gms.internal.a();
        a(s, context, ((j) (a1)));
        return new g(context, a1, new m(239));
    }

    protected void b(Context context)
    {
        long l;
        l = 1L;
        super.b(context);
        context = f(context);
        if (!context.isLimitAdTrackingEnabled())
        {
            l = 0L;
        }
        a(28, l);
        context = context.getId();
        if (context != null)
        {
            try
            {
                a(30, context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        break MISSING_BLOCK_LABEL_61;
        context;
        a(28, 1L);
        return;
        context;
    }

    a f(Context context)
        throws IOException, GooglePlayServicesNotAvailableException
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
label0:
        {
            int i = 0;
            byte abyte0[];
            int k;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new IOException(context);
            }
            context = info.getId();
            if (context == null || !context.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"))
            {
                break label0;
            }
            abyte0 = new byte[16];
            k = 0;
            int l;
            for (; i < context.length(); i = l + 2)
            {
label1:
                {
                    if (i != 8 && i != 13 && i != 18)
                    {
                        l = i;
                        if (i != 23)
                        {
                            break label1;
                        }
                    }
                    l = i + 1;
                }
                abyte0[k] = (byte)((Character.digit(context.charAt(l), 16) << 4) + Character.digit(context.charAt(l + 1), 16));
                k++;
            }

            context = di.a(abyte0, true);
        }
        return new a(context, info.isLimitAdTrackingEnabled());
    }
}
