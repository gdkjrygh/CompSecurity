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
//            j, e, q, n, 
//            o

public class k extends j
{
    class a
    {

        private String ka;
        private boolean kb;
        final k kc;

        public String getId()
        {
            return ka;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return kb;
        }

        public a(String s, boolean flag)
        {
            kc = k.this;
            super();
            ka = s;
            kb = flag;
        }
    }


    private k(Context context, n n1, o o)
    {
        super(context, n1, o);
    }

    public static k a(String s, Context context)
    {
        e e1 = new e();
        a(s, context, ((n) (e1)));
        return new k(context, e1, new q(239));
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
            int l;
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
            l = 0;
            int i1;
            for (; i < context.length(); i = i1 + 2)
            {
label1:
                {
                    if (i != 8 && i != 13 && i != 18)
                    {
                        i1 = i;
                        if (i != 23)
                        {
                            break label1;
                        }
                    }
                    i1 = i + 1;
                }
                abyte0[l] = (byte)((Character.digit(context.charAt(i1), 16) << 4) + Character.digit(context.charAt(i1 + 1), 16));
                l++;
            }

            context = jP.a(abyte0, true);
        }
        return new a(context, info.isLimitAdTrackingEnabled());
    }
}
