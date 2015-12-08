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
//            i, e, p, m, 
//            n

public class j extends i
{
    class a
    {

        private String kO;
        private boolean kP;
        final j kQ;

        public String getId()
        {
            return kO;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return kP;
        }

        public a(String s, boolean flag)
        {
            kQ = j.this;
            super();
            kO = s;
            kP = flag;
        }
    }


    protected j(Context context, m m1, n n)
    {
        super(context, m1, n);
    }

    public static j a(String s, Context context)
    {
        e e1 = new e();
        a(s, context, ((m) (e1)));
        return new j(context, e1, new p(239));
    }

    protected void b(Context context)
    {
        super.b(context);
        Object obj = h(context);
        long l;
        if (((a) (obj)).isLimitAdTrackingEnabled())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        a(28, l);
        obj = ((a) (obj)).getId();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        a(26, 5L);
        a(24, ((String) (obj)));
        return;
        GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception;
        googleplayservicesnotavailableexception;
        try
        {
            a(24, d(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    a h(Context context)
        throws IOException, GooglePlayServicesNotAvailableException
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
label0:
        {
            int k = 0;
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
            for (; k < context.length(); k = i1 + 2)
            {
label1:
                {
                    if (k != 8 && k != 13 && k != 18)
                    {
                        i1 = k;
                        if (k != 23)
                        {
                            break label1;
                        }
                    }
                    i1 = k + 1;
                }
                abyte0[l] = (byte)((Character.digit(context.charAt(i1), 16) << 4) + Character.digit(context.charAt(i1 + 1), 16));
                l++;
            }

            context = ky.a(abyte0, true);
        }
        return new a(context, info.isLimitAdTrackingEnabled());
    }
}
