// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.ford.syncV4.proxy.rpc.enums.FileType;
import com.ford.syncV4.proxy.rpc.enums.ImageType;
import com.spotify.mobile.android.service.media.image.ImageFormat;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Hashtable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class egi
{

    final egn a;
    egc b;
    public Uri c;
    public boolean d;
    private final ebz e;
    private final ScheduledExecutorService f;

    public egi(ScheduledExecutorService scheduledexecutorservice, egn egn1)
    {
        f = scheduledexecutorservice;
        a = egn1;
        e = eca.a(ImageFormat.a, 185, 185);
    }

    static String a(Uri uri)
    {
        return (new StringBuilder("CoverArt")).append(uri.hashCode()).toString();
    }

    private void a(String s, egc egc1)
    {
        auj auj1 = new auj();
        if (s != null)
        {
            auj1.b.put("syncFileName", s);
        } else
        {
            auj1.b.remove("syncFileName");
        }
        a.a(auj1, egc1);
    }

    public final void a(Uri uri, egc egc1)
    {
        if (uri.equals(c))
        {
            egc1.a(true);
            return;
        }
        if (d)
        {
            uri.toString();
            b = new egc(uri, egc1) {

                private Uri a;
                private egc b;
                private egi c;

                public final void a(boolean flag)
                {
                    c.a(a, b);
                }

            
            {
                c = egi.this;
                a = uri;
                b = egc1;
                super();
            }
            };
            return;
        }
        d = true;
        egc1 = new egc(egc1) {

            private egc a;
            private egi b;

            public final void a(boolean flag)
            {
                b.d = false;
                if (b.b != null)
                {
                    b.b.a(true);
                    b.b = null;
                }
                a.a(flag);
            }

            
            {
                b = egi.this;
                a = egc1;
                super();
            }
        };
        egc1 = new egc(f.schedule(new Runnable(egc1) {

            private egc a;

            public final void run()
            {
                Logger.b("Cover upload has timed out", new Object[0]);
                a.a(false);
            }

            
            {
                a = egc1;
                super();
            }
        }, 30L, TimeUnit.SECONDS), egc1) {

            private ScheduledFuture a;
            private egc b;

            public final void a(boolean flag)
            {
                if (!a.isCancelled() && !a.isDone() && a.cancel(false))
                {
                    b.a(flag);
                }
            }

            
            {
                a = scheduledfuture;
                b = egc1;
                super();
            }
        };
        Uri uri1 = c;
        c = uri;
        if (uri1 == null)
        {
            b(uri, egc1);
            return;
        } else
        {
            a(a(uri1), new egc(uri, egc1) {

                private Uri a;
                private egc b;
                private egi c;

                public final void a(boolean flag)
                {
                    c.b(a, b);
                }

            
            {
                c = egi.this;
                a = uri;
                b = egc1;
                super();
            }
            });
            return;
        }
    }

    public final void a(egc egc1)
    {
        if (c == null)
        {
            egc1.a(true);
            return;
        }
        if (d)
        {
            b = new egc(egc1) {

                private egc a;
                private egi b;

                public final void a(boolean flag)
                {
                    b.a(a);
                }

            
            {
                b = egi.this;
                a = egc1;
                super();
            }
            };
            return;
        } else
        {
            a(a(c), new egc(egc1) {

                private egc a;
                private egi b;

                public final void a(boolean flag)
                {
                    b.c = null;
                    a.a(flag);
                }

            
            {
                b = egi.this;
                a = egc1;
                super();
            }
            });
            return;
        }
    }

    public final void a(String s, FileType filetype, byte abyte0[], egc egc1)
    {
        int i = abyte0.length;
        avr avr1 = new avr();
        if (s != null)
        {
            avr1.b.put("syncFileName", s);
        } else
        {
            avr1.b.remove("syncFileName");
        }
        if (filetype != null)
        {
            avr1.b.put("fileType", filetype);
        } else
        {
            avr1.b.remove("fileType");
        }
        avr1.a(abyte0);
        a.a(avr1, egc1);
    }

    final void b(Uri uri, egc egc1)
    {
        e.a(uri, new eby(egc1) {

            private egc a;
            private egi b;

            public final void a(Uri uri1)
            {
                a.a(false);
            }

            public final void a(Uri uri1, byte abyte0[])
            {
                egi egi1 = b;
                egc egc2 = a;
                uri1 = egi.a(uri1);
                egi1.a(uri1, FileType.a, abyte0, egi1. new egc(egc2, uri1) {

                    private egc a;
                    private String b;
                    private egi c;

                    public final void a(boolean flag)
                    {
                        if (!flag)
                        {
                            a.a(false);
                        }
                        awf awf1 = new awf();
                        auu auu1 = new auu();
                        auu1.a(b);
                        auu1.a(ImageType.b);
                        awf1.b.put("graphic", auu1);
                        c.a.a(awf1, a);
                    }

            
            {
                c = egi.this;
                a = egc1;
                b = s;
                super();
            }
                });
            }

            
            {
                b = egi.this;
                a = egc1;
                super();
            }
        });
    }

    // Unreferenced inner class egi$1

/* anonymous class */
    public final class _cls1
        implements egc
    {

        private egi a;

        public final void a(boolean flag)
        {
            avz avz1 = new avz();
            avz1.b.put("syncFileName", "AppIcon.png");
            a.a.a(avz1, null);
        }

            public 
            {
                a = egi.this;
                super();
            }
    }

}
