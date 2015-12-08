// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.pandora.radio.data.ag;
import java.io.IOException;
import java.util.Date;
import org.json.JSONObject;
import p.df.a;

// Referenced classes of package p.by:
//            f, e, c, g, 
//            h, b

public class d
    implements com.google.android.gms.cast.RemoteMediaPlayer.OnMetadataUpdatedListener, f
{

    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private CastDevice f;
    private GoogleApiClient g;
    private com.pandora.android.eureka.d h;
    private f.b i;
    private h j;
    private e k;
    private c l;
    private com.google.android.gms.cast.Cast.CastApi m;
    private Context n;
    private int o;
    private int p;
    private ResultCallback q;
    private com.google.android.gms.cast.Cast.Listener r;
    private h s;
    private com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks t;
    private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener u;
    private b v;

    public d(h h1, ag ag, Context context)
    {
        c = true;
        e = false;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = Cast.CastApi;
        o = 0;
        p = 0;
        j = h1;
        n = context;
        k = new e(ag);
        l = new c(m(), k);
        h = new com.pandora.android.eureka.d();
        h.setOnMetadataUpdatedListener(this);
    }

    static int a(d d1, int i1)
    {
        d1.p = i1;
        return i1;
    }

    static GoogleApiClient a(d d1)
    {
        return d1.g;
    }

    static void a(String s1)
    {
        b(s1);
    }

    static void a(d d1, boolean flag)
    {
        d1.f(flag);
    }

    static int b(d d1, int i1)
    {
        d1.o = i1;
        return i1;
    }

    static c b(d d1)
    {
        return d1.l;
    }

    private static void b(String s1)
    {
        p.df.a.c("EurekaConnection", (new StringBuilder()).append("PANDCAST CONNECTION: ").append(s1).toString());
    }

    static void b(d d1, boolean flag)
    {
        d1.h(flag);
    }

    static int c(d d1)
    {
        int i1 = d1.p;
        d1.p = i1 + 1;
        return i1;
    }

    static void c(d d1, boolean flag)
    {
        d1.i(flag);
    }

    static com.google.android.gms.cast.Cast.CastApi d(d d1)
    {
        return d1.m;
    }

    static boolean e(d d1)
    {
        return d1.e;
    }

    static f.b f(d d1)
    {
        return d1.i;
    }

    private void f(boolean flag)
    {
        b("Disconnect");
        if (h() || o())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        p/by/d;
        JVM INSTR monitorenter ;
        if (h() || o())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        e(true);
        d(false);
        b(false);
        c(false);
        g(flag);
_L2:
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        b("Already Disconnected/Disconnecting - returning");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
        b("Already Disconnected/Disconnecting - returning");
        return;
    }

    static int g(d d1)
    {
        int i1 = d1.o;
        d1.o = i1 + 1;
        return i1;
    }

    private void g(boolean flag)
    {
        b("doDisconnect");
        e = false;
        l.a(flag);
        a(((GoogleApiClient) (null)));
        a(((CastDevice) (null)));
    }

    private void h(boolean flag)
    {
        b("connection opened");
        b(true);
        c(false);
        e(false);
        d(false);
        k.a(p());
        k.a(false);
        if (j != null)
        {
            j.a(new g(flag));
        }
    }

    private void i(boolean flag)
    {
        b("connection closed");
        b(false);
        c(false);
        e(false);
        d(true);
        if (j != null)
        {
            j.b(new g(flag));
        }
    }

    private void q()
    {
        b("doConnect");
        if (g != null)
        {
            g.connect();
            return;
        } else
        {
            f(false);
            b("client is null not connecting");
            return;
        }
    }

    private GoogleApiClient r()
    {
        b("INITIALIZING CAST");
        return s().a(f, n, n(), k(), l());
    }

    private b s()
    {
        if (v == null)
        {
            v = new b();
        }
        return v;
    }

    protected ResultCallback a(String s1, JSONObject jsonobject)
    {
        if (q == null)
        {
            q = new ResultCallback(jsonobject) {

                final JSONObject a;
                final d b;

                public void a(Status status)
                {
                    if (status == null || status.getStatus() == null || !status.getStatus().isSuccess())
                    {
                        p.by.d.a("Sending message failed");
                        if (d.g(b) < 3)
                        {
                            p.by.d.a("retrying send");
                            b.a(a);
                            return;
                        } else
                        {
                            d.b(b, 0);
                            return;
                        }
                    } else
                    {
                        d.b(b, 0);
                        p.by.d.a("Sending message succeeded");
                        return;
                    }
                }

                public void onResult(Result result)
                {
                    a((Status)result);
                }

            
            {
                b = d.this;
                a = jsonobject;
                super();
            }
            };
        }
        return q;
    }

    public void a()
    {
        a(((com.google.android.gms.cast.Cast.MessageReceivedCallback) (h)));
        b("Connect");
        if (b() || c())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        p/by/d;
        JVM INSTR monitorenter ;
        if (b() || c())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        c(true);
        b(false);
        d(false);
        e(false);
        q();
_L2:
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        b("Already Connected/Connecting - returning");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
        b("Already Connected/Connecting - returning");
        return;
    }

    public void a(double d1)
    {
        if (g != null)
        {
            b((new StringBuilder()).append("setVolume - sessionId: ").append(g.getSessionId()).toString());
        }
        if (!b() || g == null || !g.isConnected() || !e)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        m.setVolume(g, d1);
        return;
        Exception exception;
        exception;
        p.df.a.c("EurekaConnection", "Exception while sending volume", exception);
        return;
    }

    public void a(com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
    {
        b("Setting message listener");
        if (b() && g != null && g.isConnected())
        {
            try
            {
                m.setMessageReceivedCallbacks(g, h.getNamespace(), messagereceivedcallback);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.cast.Cast.MessageReceivedCallback messagereceivedcallback)
            {
                p.df.a.c("EurekaConnection", "Could not set message received callbacks", messagereceivedcallback);
            }
            return;
        } else
        {
            b("No Client - NOT setting message listener");
            return;
        }
    }

    protected void a(CastDevice castdevice)
    {
        if (f != castdevice)
        {
            f = castdevice;
            if (f != null)
            {
                a(r());
            }
        }
    }

    protected void a(GoogleApiClient googleapiclient)
    {
        g = googleapiclient;
    }

    public void a(String s1, String s2, Bundle bundle)
    {
        if (k != null)
        {
            k.a(s1, s2);
        }
        a(CastDevice.getFromBundle(bundle));
    }

    public void a(String s1, JSONObject jsonobject, MediaMetadata mediametadata, boolean flag)
    {
        s1 = (new com.google.android.gms.cast.MediaInfo.Builder(s1)).setContentType("track").setStreamType(1).setCustomData(jsonobject).setMetadata(mediametadata).build();
        try
        {
            h.load(g, s1, true).setResultCallback(new ResultCallback() {

                final d a;

                public void a(com.google.android.gms.cast.RemoteMediaPlayer.MediaChannelResult mediachannelresult)
                {
                    if (mediachannelresult.getStatus().isSuccess())
                    {
                        p.by.d.a("Media loaded successfully");
                        return;
                    } else
                    {
                        p.by.d.a("bad media load?");
                        return;
                    }
                }

                public void onResult(Result result)
                {
                    a((com.google.android.gms.cast.RemoteMediaPlayer.MediaChannelResult)result);
                }

            
            {
                a = d.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.b("PANDCAST", "Problem occurred with media during loading", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.b("PANDCAST", "Problem opening media during loading", s1);
        }
    }

    public void a(JSONObject jsonobject)
    {
        b((new StringBuilder()).append("sending: ").append(jsonobject.toString()).toString());
        if (b() && g != null && g.isConnected() && e)
        {
            try
            {
                m.sendMessage(g, h.getNamespace(), jsonobject.toString()).setResultCallback(a(h.getNamespace(), jsonobject));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                p.df.a.c("EurekaConnection", "Exception while sending message", jsonobject);
            }
            o = 0;
            return;
        } else
        {
            o = 0;
            return;
        }
    }

    public void a(f.a a1)
    {
        h.a(a1);
    }

    public void a(f.b b1)
    {
        i = b1;
    }

    public void a(boolean flag)
    {
        if (k != null)
        {
            k.b();
        }
        if (flag)
        {
            k.a(0L);
            k.a(false);
        }
    }

    protected void b(boolean flag)
    {
        p/by/d;
        JVM INSTR monitorenter ;
        a = flag;
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b()
    {
        p/by/d;
        JVM INSTR monitorenter ;
        boolean flag = a;
        p/by/d;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void c(boolean flag)
    {
        p/by/d;
        JVM INSTR monitorenter ;
        b = flag;
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
        p/by/d;
        JVM INSTR monitorenter ;
        boolean flag = b;
        p/by/d;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        f(true);
    }

    protected void d(boolean flag)
    {
        p/by/d;
        JVM INSTR monitorenter ;
        c = flag;
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
    {
        f(true);
    }

    protected void e(boolean flag)
    {
        p/by/d;
        JVM INSTR monitorenter ;
        d = flag;
        p/by/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public e f()
    {
        return k;
    }

    public String g()
    {
        if (k != null)
        {
            return k.d();
        } else
        {
            return null;
        }
    }

    public boolean h()
    {
        p/by/d;
        JVM INSTR monitorenter ;
        boolean flag = c;
        p/by/d;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void i()
    {
        if (g != null)
        {
            b((new StringBuilder()).append("sendPlay - sessionId: ").append(g.getSessionId()).toString());
        }
        if (b() && g != null && g.isConnected() && e)
        {
            h.play(g);
        }
    }

    public void j()
    {
        if (g != null)
        {
            b((new StringBuilder()).append("sendPause - sessionId: ").append(g.getSessionId()).toString());
        }
        if (b() && g != null && g.isConnected() && e)
        {
            h.stop(g);
        }
    }

    protected com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener k()
    {
        if (u == null)
        {
            u = new com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener() {

                final d a;

                public void onConnectionFailed(ConnectionResult connectionresult)
                {
                    p.by.d.a("Connection Failed");
                    p.by.d.a(a, 0);
                    p.by.d.a(a, false);
                }

            
            {
                a = d.this;
                super();
            }
            };
        }
        return u;
    }

    protected com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks l()
    {
        if (t == null)
        {
            t = new com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks() {

                final d a;

                public void onConnected(Bundle bundle)
                {
                    p.by.d.a("onConnected");
                    if (p.by.d.a(a) != null && p.by.d.a(a).isConnected())
                    {
                        p.by.d.a("Connected to Client - creating cast connection");
                        d.b(a).a(p.by.d.a(a));
                        p.by.d.a(a, 0);
                        return;
                    }
                    p.by.d.a("Not connected to Client");
                    StringBuilder stringbuilder = (new StringBuilder()).append("Client is NULL: ");
                    if (p.by.d.a(a) == null)
                    {
                        bundle = "TRUE";
                    } else
                    {
                        bundle = "FALSE";
                    }
                    p.by.d.a(stringbuilder.append(bundle).toString());
                    p.by.d.a("onConnected");
                    if (p.by.d.a(a) != null && d.c(a) < 3)
                    {
                        p.by.d.a(a).connect();
                        return;
                    } else
                    {
                        p.by.d.a(a, false);
                        p.by.d.a(a, 0);
                        return;
                    }
                }

                public void onConnectionSuspended(int i1)
                {
                    p.by.d.a((new StringBuilder()).append("onConnectionSuspended ").append(i1).toString());
                }

            
            {
                a = d.this;
                super();
            }
            };
        }
        return t;
    }

    protected h m()
    {
        if (s == null)
        {
            s = new h() {

                final d a;

                public void a(g g1)
                {
                    p.by.d.a((new StringBuilder()).append("Connection made.  Was Reconnect: ").append(g1.a).toString());
                    d.b(a, g1.a);
                }

                public void b(g g1)
                {
                    p.by.d.a("Connection closed");
                    if (a.o() && p.by.d.a(a) != null && p.by.d.a(a).isConnected())
                    {
                        p.by.d.a(a).disconnect();
                    }
                    d.c(a, g1.a);
                }

            
            {
                a = d.this;
                super();
            }
            };
        }
        return s;
    }

    protected com.google.android.gms.cast.Cast.Listener n()
    {
        if (r == null)
        {
            r = new com.google.android.gms.cast.Cast.Listener() {

                final d a;

                public void onApplicationDisconnected(int i1)
                {
                    p.by.d.a("Application Disconnected");
                    p.by.d.a((new StringBuilder()).append("error code: ").append(i1).toString());
                    p.by.d.a(a, false);
                }

                public void onApplicationStatusChanged()
                {
                    if (p.by.d.a(a) != null && p.by.d.a(a).isConnected())
                    {
                        p.by.d.a((new StringBuilder()).append("onApplicationStatusChanged: ").append(d.d(a).getApplicationStatus(p.by.d.a(a))).toString());
                    }
                }

                public void onVolumeChanged()
                {
                    if (p.by.d.a(a) != null && p.by.d.a(a).isConnected() && d.e(a))
                    {
                        p.by.d.a((new StringBuilder()).append("onVolumeChanged: ").append(d.d(a).getVolume(p.by.d.a(a))).toString());
                        if (d.f(a) != null)
                        {
                            d.f(a).a(d.d(a).getVolume(p.by.d.a(a)));
                        }
                    }
                }

            
            {
                a = d.this;
                super();
            }
            };
        }
        return r;
    }

    protected boolean o()
    {
        p/by/d;
        JVM INSTR monitorenter ;
        boolean flag = d;
        p/by/d;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        p/by/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onMetadataUpdated()
    {
        if (!e)
        {
            e = true;
        }
        b("Metadata updated");
    }

    protected long p()
    {
        return (new Date()).getTime();
    }
}
