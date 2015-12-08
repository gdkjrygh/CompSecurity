// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class cdz
    implements brb
{

    protected ckw a;

    public cdz(ckw ckw)
    {
        a = ckw;
    }

    public final void a()
    {
    }

    protected final void a(String s, String s1, int i)
    {
        bjz.a.post(new Runnable(s, s1, i) {

            private String a;
            private String b;
            private int c;
            private cdz d;

            public final void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheComplete");
                hashmap.put("src", a);
                hashmap.put("cachedSrc", b);
                hashmap.put("totalBytes", Integer.toString(c));
                d.a.a("onPrecacheEvent", hashmap);
            }

            
            {
                d = cdz.this;
                a = s;
                b = s1;
                c = i;
                super();
            }
        });
    }

    protected final void a(String s, String s1, String s2, String s3)
    {
        bjz.a.post(new Runnable(s, s1, s2, s3) {

            private String a;
            private String b;
            private String c;
            private String d;
            private cdz e;

            public final void run()
            {
                String s4;
                HashMap hashmap;
                String s5;
                byte byte0;
                hashmap = new HashMap();
                hashmap.put("event", "precacheCanceled");
                hashmap.put("src", a);
                if (!TextUtils.isEmpty(b))
                {
                    hashmap.put("cachedSrc", b);
                }
                s5 = c;
                s4 = "internal";
                byte0 = -1;
                s5.hashCode();
                JVM INSTR lookupswitch 10: default 160
            //                           -1396664534: 368
            //                           -1347010958: 308
            //                           -918817863: 384
            //                           -659376217: 323
            //                           -642208130: 293
            //                           -354048396: 400
            //                           -32082395: 416
            //                           96784904: 278
            //                           580119100: 353
            //                           725497484: 338;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
                byte0;
                JVM INSTR tableswitch 0 9: default 216
            //                           0 432
            //                           1 432
            //                           2 432
            //                           3 432
            //                           4 438
            //                           5 438
            //                           6 444
            //                           7 444
            //                           8 450
            //                           9 450;
                   goto _L12 _L13 _L13 _L13 _L13 _L14 _L14 _L15 _L15 _L16 _L16
_L12:
                hashmap.put("type", s4);
                hashmap.put("reason", c);
                if (!TextUtils.isEmpty(d))
                {
                    hashmap.put("message", d);
                }
                e.a.a("onPrecacheEvent", hashmap);
                return;
_L9:
                if (s5.equals("error"))
                {
                    byte0 = 0;
                }
                  goto _L1
_L6:
                if (s5.equals("playerFailed"))
                {
                    byte0 = 1;
                }
                  goto _L1
_L3:
                if (s5.equals("inProgress"))
                {
                    byte0 = 2;
                }
                  goto _L1
_L5:
                if (s5.equals("contentLengthMissing"))
                {
                    byte0 = 3;
                }
                  goto _L1
_L11:
                if (s5.equals("noCacheDir"))
                {
                    byte0 = 4;
                }
                  goto _L1
_L10:
                if (s5.equals("expireFailed"))
                {
                    byte0 = 5;
                }
                  goto _L1
_L2:
                if (s5.equals("badUrl"))
                {
                    byte0 = 6;
                }
                  goto _L1
_L4:
                if (s5.equals("downloadTimeout"))
                {
                    byte0 = 7;
                }
                  goto _L1
_L7:
                if (s5.equals("sizeExceeded"))
                {
                    byte0 = 8;
                }
                  goto _L1
_L8:
                if (s5.equals("externalAbort"))
                {
                    byte0 = 9;
                }
                  goto _L1
_L13:
                s4 = "internal";
                  goto _L12
_L14:
                s4 = "io";
                  goto _L12
_L15:
                s4 = "network";
                  goto _L12
_L16:
                s4 = "policy";
                  goto _L12
            }

            
            {
                e = cdz.this;
                a = s;
                b = s1;
                c = s2;
                d = s3;
                super();
            }
        });
    }

    public abstract boolean a(String s);

    public abstract void b();

    // Unreferenced inner class cdz$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private String a;
        private String b;
        private int c;
        private int d;
        private cdz e;

        public final void run()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("event", "precacheProgress");
            hashmap.put("src", a);
            hashmap.put("cachedSrc", b);
            hashmap.put("bytesLoaded", Integer.toString(c));
            hashmap.put("totalBytes", Integer.toString(d));
            hashmap.put("cacheReady", "0");
            e.a.a("onPrecacheEvent", hashmap);
        }

            
            {
                e = cdz.this;
                a = s;
                b = s1;
                c = i;
                d = j;
                super();
            }
    }

}
