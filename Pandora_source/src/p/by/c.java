// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.pandora.android.data.d;
import java.io.IOException;
import p.df.a;

// Referenced classes of package p.by:
//            g, h, e

public class c
{

    private GoogleApiClient a;
    private e b;
    private h c;
    private com.google.android.gms.cast.Cast.CastApi d;
    private ResultCallback e;
    private ResultCallback f;
    private int g;

    public c(h h1, e e1)
    {
        b = null;
        c = null;
        d = Cast.CastApi;
        g = 0;
        b = e1;
        c = h1;
    }

    static int a(c c1, int i)
    {
        c1.g = i;
        return i;
    }

    static e a(c c1)
    {
        return c1.b;
    }

    static void a(String s)
    {
        b(s);
    }

    static void a(c c1, boolean flag)
    {
        c1.b(flag);
    }

    static GoogleApiClient b(c c1)
    {
        return c1.a;
    }

    private static void b(String s)
    {
        p.df.a.c("EurekaCast", (new StringBuilder()).append("PANDCAST CAST: ").append(s).toString());
    }

    static void b(c c1, boolean flag)
    {
        c1.c(flag);
    }

    private void b(boolean flag)
    {
        if (c != null)
        {
            c.a(new g(flag));
        }
    }

    static com.google.android.gms.cast.Cast.CastApi c(c c1)
    {
        return c1.d;
    }

    private void c(boolean flag)
    {
        if (!flag && c != null)
        {
            c.b(new g(false));
        }
    }

    static int d(c c1)
    {
        int i = c1.g;
        c1.g = i + 1;
        return i;
    }

    protected ResultCallback a()
    {
        if (e == null)
        {
            e = new ResultCallback() {

                final c a;

                public void a(com.google.android.gms.cast.Cast.ApplicationConnectionResult applicationconnectionresult)
                {
                    Status status = applicationconnectionresult.getStatus();
                    StringBuilder stringbuilder = (new StringBuilder()).append("Application Connected: ");
                    String s;
                    if (status != null && status.isSuccess())
                    {
                        s = "SUCCESS";
                    } else
                    {
                        s = "FAILURE";
                    }
                    p.by.c.a(stringbuilder.append(s).toString());
                    if (status == null || !status.isSuccess() || !d.h.equals(applicationconnectionresult.getApplicationMetadata().getApplicationId()))
                    {
                        p.by.c.a("Application Cast Failed");
                        if (p.by.c.a(a).e() != null && !p.by.c.a(a).e().isEmpty() && !p.by.c.a(a).f())
                        {
                            p.by.c.a("join failed - trying launch");
                            p.by.c.a(a).b(null);
                            a.a(c.b(a));
                            return;
                        } else
                        {
                            a.a(false);
                            return;
                        }
                    }
                    p.by.c.a("saving session ID");
                    applicationconnectionresult = applicationconnectionresult.getSessionId();
                    boolean flag;
                    if (p.by.c.a(a) != null)
                    {
                        if (p.by.c.a(a).e() != null && p.by.c.a(a).e().equalsIgnoreCase(applicationconnectionresult))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        p.by.c.a(a).a(applicationconnectionresult);
                        p.by.c.a((new StringBuilder()).append("wasReconnect: ").append(flag).toString());
                    } else
                    {
                        flag = false;
                    }
                    p.by.c.a(a, flag);
                }

                public void onResult(Result result)
                {
                    a((com.google.android.gms.cast.Cast.ApplicationConnectionResult)result);
                }

            
            {
                a = c.this;
                super();
            }
            };
        }
        return e;
    }

    public void a(GoogleApiClient googleapiclient)
    {
        b("Cast");
        b(googleapiclient);
        if (b.e() != null && !b.e().isEmpty())
        {
            b("Session ID Found.  Rejoining Application");
            d.joinApplication(c(), d.h, b.e()).setResultCallback(a());
            return;
        } else
        {
            b("Launching Application");
            d.launchApplication(c(), d.h, true).setResultCallback(a());
            return;
        }
    }

    public void a(boolean flag)
    {
        b("Disconnect");
        if (flag && a != null && a.isConnected())
        {
            d.stopApplication(a).setResultCallback(b());
            return;
        } else
        {
            c(false);
            return;
        }
    }

    protected ResultCallback b()
    {
        if (f == null)
        {
            f = new ResultCallback() {

                final c a;

                private void a()
                {
                    p.by.c.a(a, 0);
                    c.b(a, false);
                }

                public void a(Status status)
                {
                    if (status.isSuccess())
                    {
                        try
                        {
                            p.by.c.a("stop application");
                            c.c(a).removeMessageReceivedCallbacks(a.c(), "urn:x-cast:com.google.cast.media");
                        }
                        // Misplaced declaration of an exception variable
                        catch (Status status)
                        {
                            p.df.a.e("EurekaCast", "Exception while removing application", status);
                        }
                        a();
                        return;
                    }
                    if (p.by.c.d(a) < 3)
                    {
                        if (a.c() != null && a.c().isConnected())
                        {
                            c.c(a).stopApplication(a.c()).setResultCallback(a.b());
                            return;
                        } else
                        {
                            p.by.c.a(a, 0);
                            c.b(a, false);
                            return;
                        }
                    } else
                    {
                        a();
                        return;
                    }
                }

                public void onResult(Result result)
                {
                    a((Status)result);
                }

            
            {
                a = c.this;
                super();
            }
            };
        }
        return f;
    }

    protected void b(GoogleApiClient googleapiclient)
    {
        a = googleapiclient;
    }

    protected GoogleApiClient c()
    {
        return a;
    }
}
