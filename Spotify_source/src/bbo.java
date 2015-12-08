// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer.drm.UnsupportedDrmException;
import java.util.UUID;

public class bbo
    implements bbm
{

    private static UUID e = new UUID(0xedef8ba979d64aceL, 0xa3c827dcd51d21edL);
    final bbr a;
    final bbn b;
    final bbt c;
    final UUID d;
    private final Handler f;
    private final bbp g;
    private final MediaDrm h;
    private HandlerThread i;
    private Handler j;
    private int k;
    private boolean l;
    private int m;
    private MediaCrypto n;
    private Exception o;
    private String p;
    private byte q[];
    private byte r[];

    public bbo(UUID uuid, Looper looper, bbn bbn, Handler handler, bbp bbp)
    {
        d = uuid;
        b = bbn;
        f = handler;
        g = bbp;
        try
        {
            h = new MediaDrm(uuid);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new UnsupportedDrmException(1, uuid);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new UnsupportedDrmException(2, uuid);
        }
        h.setOnEventListener(new bbq(this, (byte)0));
        a = new bbr(this, looper);
        c = new bbt(this, looper);
        m = 1;
    }

    static bbp a(bbo bbo1)
    {
        return bbo1.g;
    }

    static void a(bbo bbo1, Exception exception)
    {
        bbo1.b(exception);
    }

    static void a(bbo bbo1, Object obj)
    {
label0:
        {
            bbo1.l = false;
            if (bbo1.m == 2 || bbo1.m == 3 || bbo1.m == 4)
            {
                if (!(obj instanceof Exception))
                {
                    break label0;
                }
                bbo1.b((Exception)obj);
            }
            return;
        }
        try
        {
            bbo1.h.provideProvisionResponse((byte[])obj);
            if (bbo1.m == 2)
            {
                bbo1.a(false);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bbo1.b(((Exception) (obj)));
            return;
        }
        bbo1.f();
        return;
    }

    private void a(Exception exception)
    {
        if (exception instanceof NotProvisionedException)
        {
            e();
            return;
        } else
        {
            b(exception);
            return;
        }
    }

    private void a(boolean flag)
    {
        try
        {
            r = h.openSession();
            n = new MediaCrypto(d, r);
            m = 3;
            f();
            return;
        }
        catch (NotProvisionedException notprovisionedexception)
        {
            if (flag)
            {
                e();
                return;
            } else
            {
                b(notprovisionedexception);
                return;
            }
        }
        catch (Exception exception)
        {
            b(exception);
        }
    }

    static int b(bbo bbo1)
    {
        return bbo1.k;
    }

    static void b(bbo bbo1, Object obj)
    {
        if (bbo1.m == 3 || bbo1.m == 4)
        {
            if (obj instanceof Exception)
            {
                bbo1.a((Exception)obj);
            } else
            {
                try
                {
                    bbo1.h.provideKeyResponse(bbo1.r, (byte[])obj);
                    bbo1.m = 4;
                    if (bbo1.f != null && bbo1.g != null)
                    {
                        bbo1.f.post(bbo1. new Runnable() {

                            private bbo a;

                            public final void run()
                            {
                                bbo.a(a).b();
                            }

            
            {
                a = bbo.this;
                super();
            }
                        });
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    bbo1.a(((Exception) (obj)));
                    return;
                }
            }
        }
    }

    private void b(Exception exception)
    {
        o = exception;
        if (f != null && g != null)
        {
            f.post(new Runnable(exception) {

                private Exception a;
                private bbo b;

                public final void run()
                {
                    bbo.a(b).a(a);
                }

            
            {
                b = bbo.this;
                a = exception;
                super();
            }
            });
        }
        if (m != 4)
        {
            m = 0;
        }
    }

    static int c(bbo bbo1)
    {
        return bbo1.m;
    }

    static void d(bbo bbo1)
    {
        bbo1.f();
    }

    static int e(bbo bbo1)
    {
        bbo1.m = 3;
        return 3;
    }

    private void e()
    {
        if (l)
        {
            return;
        } else
        {
            l = true;
            android.media.MediaDrm.ProvisionRequest provisionrequest = h.getProvisionRequest();
            j.obtainMessage(0, provisionrequest).sendToTarget();
            return;
        }
    }

    private void f()
    {
        try
        {
            android.media.MediaDrm.KeyRequest keyrequest = h.getKeyRequest(r, q, p, 1, null);
            j.obtainMessage(1, keyrequest).sendToTarget();
            return;
        }
        catch (NotProvisionedException notprovisionedexception)
        {
            a(notprovisionedexception);
        }
    }

    static void f(bbo bbo1)
    {
        bbo1.e();
    }

    public void a()
    {
        int i1 = k - 1;
        k = i1;
        if (i1 == 0)
        {
            m = 1;
            l = false;
            a.removeCallbacksAndMessages(null);
            c.removeCallbacksAndMessages(null);
            j.removeCallbacksAndMessages(null);
            j = null;
            i.quit();
            i = null;
            q = null;
            n = null;
            o = null;
            if (r != null)
            {
                h.closeSession(r);
                r = null;
                return;
            }
        }
    }

    public void a(bbj bbj1)
    {
        int i1 = k + 1;
        k = i1;
        if (i1 != 1)
        {
            return;
        }
        if (j == null)
        {
            i = new HandlerThread("DrmRequestHandler");
            i.start();
            j = new bbs(this, i.getLooper());
        }
        if (q == null)
        {
            p = bbj1.a;
            q = bbj1.a(d);
            if (q == null)
            {
                b(new IllegalStateException((new StringBuilder("Media does not support uuid: ")).append(d).toString()));
                return;
            }
            if (bej.a < 21)
            {
                byte abyte0[] = q;
                bbj1 = e;
                bec bec1 = new bec(abyte0);
                if (!bcm.a(bec1, bbj1))
                {
                    bbj1 = null;
                } else
                {
                    bec1.a(28);
                    int j1 = bec1.f();
                    bbj1 = new byte[j1];
                    bec1.a(bbj1, 0, j1);
                }
                if (bbj1 != null)
                {
                    q = bbj1;
                }
            }
        }
        m = 2;
        a(true);
    }

    public final void a(String s, String s1)
    {
        h.setPropertyString(s, s1);
    }

    public final boolean a(String s)
    {
        if (m != 3 && m != 4)
        {
            throw new IllegalStateException();
        } else
        {
            return n.requiresSecureDecoderComponent(s);
        }
    }

    public final int b()
    {
        return m;
    }

    public final String b(String s)
    {
        return h.getPropertyString(s);
    }

    public final MediaCrypto c()
    {
        if (m != 3 && m != 4)
        {
            throw new IllegalStateException();
        } else
        {
            return n;
        }
    }

    public final Exception d()
    {
        if (m == 0)
        {
            return o;
        } else
        {
            return null;
        }
    }

    static 
    {
        new UUID(0x9a04f07998404286L, 0xab92e65be0885f95L);
    }
}
