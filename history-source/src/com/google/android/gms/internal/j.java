// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            i, e, p, m, 
//            n

public class j extends i
{
    class a
    {

        private String kR;
        private boolean kS;
        final j kT;

        public String getId()
        {
            return kR;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return kS;
        }

        public a(String s, boolean flag)
        {
            kT = j.this;
            super();
            kR = s;
            kS = flag;
        }
    }


    private static AdvertisingIdClient kO;
    private static CountDownLatch kP = new CountDownLatch(1);
    private static boolean kQ;

    protected j(Context context, m m1, n n)
    {
        super(context, m1, n);
    }

    static AdvertisingIdClient A()
    {
        return kO;
    }

    static CountDownLatch B()
    {
        return kP;
    }

    static AdvertisingIdClient a(AdvertisingIdClient advertisingidclient)
    {
        kO = advertisingidclient;
        return advertisingidclient;
    }

    public static j a(String s, Context context)
    {
        e e1;
        e1 = new e();
        a(s, context, ((m) (e1)));
        com/google/android/gms/internal/j;
        JVM INSTR monitorenter ;
        if (kO == null)
        {
            kO = new AdvertisingIdClient(context);
            (new AsyncTask() {

                protected transient Void a(Void avoid[])
                {
                    try
                    {
                        j.A().start();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        j.a(true);
                        j.a(null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        j.a(null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        j.a(null);
                    }
                    j.B().countDown();
                    return null;
                }

                protected Object doInBackground(Object aobj[])
                {
                    return a((Void[])aobj);
                }

            }).execute(new Void[0]);
        }
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        return new j(context, e1, new p(239));
        s;
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean a(boolean flag)
    {
        kQ = flag;
        return flag;
    }

    protected void b(Context context)
    {
        super.b(context);
        if (kQ)
        {
            a(24, d(context));
            return;
        }
        context = z();
        long l;
        if (context.isLimitAdTrackingEnabled())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        a(28, l);
        context = context.getId();
        if (context != null)
        {
            try
            {
                a(26, 5L);
                a(24, context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return;
    }

    a z()
        throws IOException
    {
        int k = 0;
        com/google/android/gms/internal/j;
        JVM INSTR monitorenter ;
        a a1;
        if (kP.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_60;
        }
        a1 = new a(null, false);
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        return a1;
        Object obj;
        obj;
        obj = new a(null, false);
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        obj;
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        throw obj;
        if (kO != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new a(null, false);
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = kO.getInfo();
        com/google/android/gms/internal/j;
        JVM INSTR monitorexit ;
        String s;
label0:
        {
            s = info.getId();
            if (s == null || !s.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"))
            {
                break label0;
            }
            byte abyte0[] = new byte[16];
            int l = 0;
            int i1;
            for (; k < s.length(); k = i1 + 2)
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
                abyte0[l] = (byte)((Character.digit(s.charAt(i1), 16) << 4) + Character.digit(s.charAt(i1 + 1), 16));
                l++;
            }

            s = ky.a(abyte0, true);
        }
        return new a(s, info.isLimitAdTrackingEnabled());
    }

}
