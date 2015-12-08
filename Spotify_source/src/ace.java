// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.LogLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class ace extends HandlerThread
    implements acr
{

    private static long d;
    private static long e;
    private static long f;
    private static long g;
    public acg a;
    public ActivityState b;
    public boolean c;
    private acu h;
    private act i;
    private add j;
    private boolean k;
    private acq l;
    private acj m;
    private AdjustAttribution n;
    private acs o;

    private ace(acj acj1)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        i = acl.a();
        a = new acg(getLooper(), this);
        k = true;
        m = acj1;
        acj1 = Message.obtain();
        acj1.arg1 = 0x11bb7;
        a.sendMessage(acj1);
    }

    public static ace a(acj acj1)
    {
        boolean flag;
        if (acj1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            acl.a().e("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        } else
        {
            return new ace(acj1);
        }
    }

    private ActivityPackage a(String s, String s1, long l1)
    {
        LinkedHashMap linkedhashmap;
        AdjustAttribution adjustattribution;
        String as[];
        int i1;
        boolean flag1;
        int j1;
        if (s == null)
        {
            return null;
        }
        linkedhashmap = new LinkedHashMap();
        adjustattribution = new AdjustAttribution();
        i.a("Reading query string (%s) from %s", new Object[] {
            s, s1
        });
        as = s.split("&");
        j1 = as.length;
        i1 = 0;
        flag1 = false;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        String as1[] = as[i1].split("=");
        boolean flag;
        if (as1.length != 2)
        {
            flag = false;
        } else
        {
            String s2 = as1[0];
            if (!s2.startsWith("adjust_"))
            {
                flag = false;
            } else
            {
                String s4 = as1[1];
                if (s4.length() == 0)
                {
                    flag = false;
                } else
                {
                    s2 = s2.substring(7);
                    if (s2.length() == 0)
                    {
                        flag = false;
                    } else
                    {
                        if (s2.equals("tracker"))
                        {
                            adjustattribution.trackerName = s4;
                            flag = true;
                        } else
                        if (s2.equals("campaign"))
                        {
                            adjustattribution.campaign = s4;
                            flag = true;
                        } else
                        if (s2.equals("adgroup"))
                        {
                            adjustattribution.adgroup = s4;
                            flag = true;
                        } else
                        if (s2.equals("creative"))
                        {
                            adjustattribution.creative = s4;
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            linkedhashmap.put(s2, s4);
                        }
                        flag = true;
                    }
                }
            }
        }
_L3:
        if (flag)
        {
            flag1 = true;
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!flag1)
        {
            return null;
        }
        String s3 = (String)linkedhashmap.remove("reftag");
        long l2 = System.currentTimeMillis();
        acx acx1 = new acx(m, l, b, l2);
        acx1.a = linkedhashmap;
        acx1.b = adjustattribution;
        acx1.c = s3;
        if (s1 == "reftag")
        {
            acx1.d = s;
        }
        s = acx1.b();
        acx.a(s, "source", s1);
        acx.a(s, "click_time", l1);
        acx.a(s, "reftag", acx1.c);
        acx.a(s, "params", acx1.a);
        acx.a(s, "referrer", acx1.d);
        if (acx1.b != null)
        {
            acx.a(s, "tracker", acx1.b.trackerName);
            acx.a(s, "campaign", acx1.b.campaign);
            acx.a(s, "adgroup", acx1.b.adgroup);
            acx.a(s, "creative", acx1.b.creative);
        }
        s1 = acx1.a(ActivityKind.d);
        s1.path = "/sdk_click";
        s1.suffix = "";
        s1.parameters = s;
        return s1;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    static void a(ace ace1)
    {
        d = acl.b();
        e = acl.c();
        f = acl.d();
        g = acl.e();
        ace1.l = new acq(ace1.m.a);
        Map map;
        Object obj;
        long l1;
        if ("production".equals(ace1.m.c))
        {
            ace1.i.a(LogLevel.b);
        } else
        {
            ace1.i.a(ace1.m.d);
        }
        if (ace1.m.e.booleanValue())
        {
            ace1.i.c("Event buffering is enabled", new Object[0]);
        }
        if (ada.a(ace1.m.a) == null)
        {
            ace1.i.c("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
        }
        if (ace1.m.f != null)
        {
            ace1.a(ace1.m.f, ace1.m.g);
        }
        try
        {
            ace1.n = (AdjustAttribution)adf.a(ace1.m.a, "AdjustAttribution", "Attribution");
        }
        catch (Exception exception)
        {
            ace1.i.e("Failed to read %s file (%s)", new Object[] {
                "Attribution", exception.getMessage()
            });
            ace1.n = null;
        }
        try
        {
            ace1.b = (ActivityState)adf.a(ace1.m.a, "AdjustIoActivityState", "Activity state");
        }
        catch (Exception exception1)
        {
            ace1.i.e("Failed to read %s file (%s)", new Object[] {
                "Activity state", exception1.getMessage()
            });
            ace1.b = null;
        }
        ace1.h = acl.a(ace1, ace1.m.a, ace1.g());
        l1 = System.currentTimeMillis();
        obj = new acx(ace1.m, ace1.l, ace1.b, l1);
        map = ((acx) (obj)).b();
        obj = ((acx) (obj)).a(ActivityKind.e);
        obj.path = "attribution";
        obj.suffix = "";
        obj.parameters = map;
        ace1.o = acl.a(ace1, ((ActivityPackage) (obj)), ace1.g());
        ace1.j = new add(ace1. new Runnable() {

            private ace a;

            public final void run()
            {
                ace.f(a);
            }

            
            {
                a = ace.this;
                super();
            }
        }, e, d);
    }

    static void a(ace ace1, ack ack1)
    {
        if (ace1.a(ace1.b) && ace1.c())
        {
            boolean flag;
            if (ack1 == null)
            {
                ace1.i.e("Event missing", new Object[0]);
                flag = false;
            } else
            {
                if (ack1.a != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    ace1.i.e("Event not initialized correctly", new Object[0]);
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
            if (flag)
            {
                long l1 = System.currentTimeMillis();
                ActivityState activitystate = ace1.b;
                activitystate.eventCount = activitystate.eventCount + 1;
                ace1.a(l1);
                ack1 = (new acx(ace1.m, ace1.l, ace1.b, l1)).a(ack1);
                ace1.h.a(ack1);
                if (ace1.m.e.booleanValue())
                {
                    ace1.i.c("Buffered event %s", new Object[] {
                        ((ActivityPackage) (ack1)).suffix
                    });
                } else
                {
                    ace1.h.a();
                }
                ace1.f();
            }
        }
    }

    static void a(ace ace1, Uri uri, long l1)
    {
        if (uri != null)
        {
            uri = ace1.a(uri.getQuery(), "deeplink", l1);
            if (uri != null)
            {
                ace1.h.a(uri);
            }
        }
    }

    static void a(ace ace1, String s, long l1)
    {
        s = ace1.a(s, "reftag", l1);
        if (s != null)
        {
            ace1.h.a(s);
        }
    }

    static void a(ace ace1, JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            String s = jsonobject.optString("deeplink", null);
            if (s != null)
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent.setFlags(0x10000000);
                boolean flag;
                if (ace1.m.a.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    ace1.i.e("Unable to open deep link (%s)", new Object[] {
                        s
                    });
                } else
                {
                    ace1.i.c("Open deep link (%s)", new Object[] {
                        s
                    });
                    ace1.m.a.startActivity(intent);
                }
            }
            ace1.o.a(jsonobject);
        }
    }

    private boolean a(long l1)
    {
        long l2;
        if (a(b))
        {
            if ((l2 = l1 - b.lastActivity) <= f)
            {
                b.lastActivity = l1;
                if (l2 < 0L)
                {
                    i.e("Time travel!", new Object[0]);
                } else
                {
                    ActivityState activitystate = b;
                    activitystate.sessionLength = activitystate.sessionLength + l2;
                    activitystate = b;
                    activitystate.timeSpent = l2 + activitystate.timeSpent;
                }
                return true;
            }
        }
        return false;
    }

    private boolean a(ActivityState activitystate)
    {
        if (activitystate == null)
        {
            i.e("Missing activity state.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    private void b(long l1)
    {
        ActivityPackage activitypackage = (new acx(m, l, b, l1)).a();
        h.a(activitypackage);
        h.a();
    }

    static void b(ace ace1)
    {
        if (ace1.b != null && !ace1.b.enabled) goto _L2; else goto _L1
_L1:
        long l1;
        ace1.d();
        l1 = System.currentTimeMillis();
        if (ace1.b != null) goto _L4; else goto _L3
_L3:
        ace1.b = new ActivityState();
        ace1.b.sessionCount = 1;
        ace1.b(l1);
        ace1.b.a(l1);
        ace1.b.enabled = ace1.k;
        ace1.f();
_L6:
        if (ace1.a(ace1.b) && ace1.b.subsessionCount > 1 && (ace1.n == null || ace1.b.askingAttribution))
        {
            ace1.o.a();
        }
        if (!ace1.g())
        {
            ace1 = ace1.j;
            if (((add) (ace1)).f)
            {
                ace1.b = ((add) (ace1)).a.scheduleWithFixedDelay(((add) (ace1)).c, ((add) (ace1)).d, ((add) (ace1)).e, TimeUnit.MILLISECONDS);
                ace1.f = false;
            }
        }
_L2:
        return;
_L4:
        long l2 = l1 - ace1.b.lastActivity;
        if (l2 < 0L)
        {
            ace1.i.e("Time travel!", new Object[0]);
            ace1.b.lastActivity = l1;
            ace1.f();
        } else
        if (l2 > f)
        {
            ActivityState activitystate = ace1.b;
            activitystate.sessionCount = activitystate.sessionCount + 1;
            ace1.b.lastInterval = l2;
            ace1.b(l1);
            ace1.b.a(l1);
            ace1.f();
        } else
        if (l2 > g)
        {
            ActivityState activitystate1 = ace1.b;
            activitystate1.subsessionCount = activitystate1.subsessionCount + 1;
            activitystate1 = ace1.b;
            activitystate1.sessionLength = l2 + activitystate1.sessionLength;
            ace1.b.lastActivity = l1;
            ace1.f();
            ace1.i.c("Started subsession %d of session %d", new Object[] {
                Integer.valueOf(ace1.b.subsessionCount), Integer.valueOf(ace1.b.sessionCount)
            });
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void c(ace ace1)
    {
        ace1.h.d();
        ace1.e();
        if (ace1.a(System.currentTimeMillis()))
        {
            ace1.f();
        }
    }

    private boolean c()
    {
        if (b != null)
        {
            return b.enabled;
        } else
        {
            return k;
        }
    }

    private void d()
    {
        g();
        if (g())
        {
            h.d();
            return;
        } else
        {
            h.e();
            return;
        }
    }

    static void d(ace ace1)
    {
        ace1.d();
    }

    private void e()
    {
        add add1 = j;
        if (!add1.f)
        {
            add1.d = add1.b.getDelay(TimeUnit.MILLISECONDS);
            add1.b.cancel(false);
            add1.f = true;
        }
    }

    static void e(ace ace1)
    {
        if (ace1.g())
        {
            ace1.e();
        } else
        {
            ace1.i.b("Session timer fired", new Object[0]);
            ace1.h.a();
            if (ace1.a(System.currentTimeMillis()))
            {
                ace1.f();
                return;
            }
        }
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        adf.a(b, m.a, "AdjustIoActivityState", "Activity state");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void f(ace ace1)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbf;
        ace1.a.sendMessage(message);
    }

    private boolean g()
    {
        return c || !c();
    }

    public final void a()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bb8;
        a.sendMessage(message);
    }

    public final void a(String s, long l1)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbd;
        message.obj = new acf(s, l1);
        a.sendMessage(message);
    }

    public final void a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            Message message = Message.obtain();
            message.arg1 = 0x11bbb;
            message.obj = jsonobject;
            a.sendMessage(message);
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (!a(c(), flag, "Adjust already enabled", "Adjust already disabled"))
        {
            return;
        }
        k = flag;
        if (b == null)
        {
            a();
        } else
        {
            b.enabled = flag;
            f();
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, "Pausing package handler and attribution handler to disable the SDK", "Package and attribution handler remain paused due to the SDK is offline", "Resuming package handler and attribution handler to enabled the SDK");
    }

    public final void a(boolean flag, String s, String s1, String s2)
    {
        if (flag)
        {
            i.c(s, new Object[0]);
            b();
            return;
        }
        if (g())
        {
            i.c(s1, new Object[0]);
            return;
        } else
        {
            i.c(s2, new Object[0]);
            a();
            return;
        }
    }

    public final boolean a(AdjustAttribution adjustattribution)
    {
        while (adjustattribution == null || adjustattribution.equals(n)) 
        {
            return false;
        }
        n = adjustattribution;
        adf.a(n, m.a, "AdjustAttribution", "Attribution");
        return true;
    }

    public final boolean a(boolean flag, boolean flag1, String s, String s1)
    {
        if (flag != flag1)
        {
            return true;
        }
        if (flag)
        {
            i.b(s, new Object[0]);
            return false;
        } else
        {
            i.b(s1, new Object[0]);
            return false;
        }
    }

    public final void b()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bb9;
        a.sendMessage(message);
    }

    public final void b(boolean flag)
    {
        b.askingAttribution = flag;
        f();
    }
}
