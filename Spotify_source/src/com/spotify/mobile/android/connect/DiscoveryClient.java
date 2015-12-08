// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.connect.model.Message;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import cuq;
import dkx;
import dky;
import dla;
import dlg;
import dlh;
import dli;
import dlj;
import dlk;
import dll;
import dlm;
import dlq;
import dlr;
import dls;
import dlx;
import dly;
import dmz;
import dtx;
import dvq;
import gfi;
import ghf;
import gng;
import gni;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class DiscoveryClient
    implements dkx, dky, dla
{

    public static final ImmutableList a = (new cuq()).c(new dli("CC32E753", "Spotify Production")).c(new dli("327CF04F", "Spotify Staging")).a();
    public Set b;
    public boolean c;
    public DiscoveryConfiguration d;
    private ObjectMapper e;
    private Context f;
    private final dvq g;
    private dlq h;
    private dlx i;
    private boolean j;
    private DiscoveredDevice k;
    private ConnectDevice l;
    private boolean m;
    private gfi n;
    private dll o;
    private dlk p;
    private dlm q;
    private dlg r;

    public DiscoveryClient(Context context, dll dll1, dvq dvq)
    {
        e = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        b = new CopyOnWriteArraySet();
        p = new dlk() {

            private DiscoveryClient a;

            public final void a(DiscoveredDevice discovereddevice)
            {
                DiscoveryClient.a(a).a("DELETE", dlx.a(discovereddevice.getDeviceId()), discovereddevice);
            }

            public final void b(DiscoveredDevice discovereddevice)
            {
                DiscoveryClient.a(a).a("PUT", dlx.a(discovereddevice.getDeviceId()), discovereddevice);
                DiscoveryClient.b(a);
            }

            
            {
                a = DiscoveryClient.this;
                super();
            }
        };
        q = new dlm() {

            private DiscoveryClient a;

            public final void a(float f1)
            {
                if (DiscoveryClient.f(a) != null)
                {
                    DiscoveryClient.f(a).a(f1);
                }
            }

            public final void a(DiscoveredDevice discovereddevice)
            {
                DiscoveryClient.a(a, null);
                DiscoveryClient.c(a).c.e();
                if (discovereddevice != null && !DiscoveryClient.e(a))
                {
                    discovereddevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                    DiscoveryClient.a(a).a(discovereddevice);
                }
                DiscoveryClient.a(a, "Cast Receiver app disconnected", discovereddevice);
                if (DiscoveryClient.f(a) != null)
                {
                    DiscoveryClient.f(a).a();
                }
            }

            public final void a(DiscoveredDevice discovereddevice, boolean flag)
            {
                DiscoveryClient.a(a, "Cast Receiver app started", discovereddevice);
                DiscoveryClient.a(a, discovereddevice);
                DiscoveryClient.a(a, false);
                DiscoveryClient.c(a).c.f();
                if (flag)
                {
                    DiscoveryClient.d(a).c(dlr.a(discovereddevice));
                }
            }

            public final void a(String s, String s1)
            {
                s1 = dlr.a(s1);
                final class _cls4
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.spotify.mobile.android.connect.model.Message.Type.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.connect.model.Message.Type.GET_INFO_RESPONSE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.connect.model.Message.Type.ADD_USER_RESPONSE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.connect.model.Message.Type.ADD_USER_ERROR.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                Object obj;
                switch (_cls4.a[((Message) (s1)).type.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    com.fasterxml.jackson.databind.JsonNode jsonnode = ((Message) (s1)).payload;
                    s1 = (DiscoveredDevice)dlr.a(((Message) (s1)).payload, com/spotify/mobile/android/connect/model/DiscoveredDevice);
                    if (s1 != null)
                    {
                        s1.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY);
                        s = s1;
                    } else
                    {
                        s = DiscoveryClient.a(s);
                    }
                    DiscoveryClient.a(a).a(s);
                    return;

                case 2: // '\002'
                    s1 = ((Message) (s1)).payload;
                    DiscoveryClient.a(a, s);
                    return;

                case 3: // '\003'
                    obj = ((Message) (s1)).payload;
                    obj = (DiscoveredDevice)dlr.a(((Message) (s1)).payload, com/spotify/mobile/android/connect/model/DiscoveredDevice);
                    s1 = ((String) (obj));
                    break;
                }
                if (obj == null)
                {
                    s1 = DiscoveryClient.a(s);
                }
                DiscoveryClient.a(a, s1.getErrorCode());
                DiscoveryClient.a(a).a(s1);
            }

            public final void b(DiscoveredDevice discovereddevice)
            {
                DiscoveryClient.a(a, null);
                if (discovereddevice != null)
                {
                    discovereddevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                    DiscoveryClient.a(a).a(discovereddevice);
                }
                DiscoveryClient.a(a, "Cast Receiver app startup failed", discovereddevice);
                DiscoveryClient.a(a, false);
            }

            
            {
                a = DiscoveryClient.this;
                super();
            }
        };
        r = new dlg() {

            private DiscoveryClient a;

            public final void a(String s, String s1, String s2, String s3)
            {
                if (DiscoveryClient.d(a).b(s))
                {
                    if (!DiscoveryClient.e(a))
                    {
                        DiscoveryClient.d(a).c(dlr.a(s1, s2, s3));
                    }
                    return;
                } else
                {
                    DiscoveryClient.a(a, true);
                    s1 = DiscoveryClient.d(a);
                    s2 = DiscoveryClient.g(a);
                    s1.g = true;
                    s1.a(s, s2);
                    return;
                }
            }

            
            {
                a = DiscoveryClient.this;
                super();
            }
        };
        f = context;
        g = dvq;
        d = DiscoveryConfiguration.a();
        o = dll1;
    }

    static DiscoveredDevice a(String s)
    {
        s = new DiscoveredDevice(s);
        s.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
        return s;
    }

    static dlx a(DiscoveryClient discoveryclient)
    {
        return discoveryclient.i;
    }

    static void a(DiscoveryClient discoveryclient, int i1)
    {
        if (i1 == 9)
        {
            Toast.makeText(discoveryclient.f, 0x7f0801ba, 1).show();
        }
    }

    static void a(DiscoveryClient discoveryclient, DiscoveredDevice discovereddevice)
    {
        discoveryclient.a(discovereddevice);
    }

    static void a(DiscoveryClient discoveryclient, String s)
    {
        if (discoveryclient.k != null && discoveryclient.k.getDeviceId().equals(s) && discoveryclient.o.b() != ConnectManager.ConnectState.e && discoveryclient.h.a(s))
        {
            discoveryclient.o.a(s);
        }
    }

    static void a(DiscoveryClient discoveryclient, String s, DiscoveredDevice discovereddevice)
    {
        if ("debug".equals("release") || "partners".equals("release"))
        {
            if (discovereddevice == null)
            {
                discoveryclient = "No device.";
            } else
            {
                try
                {
                    discoveryclient = discoveryclient.e.writeValueAsString(discovereddevice);
                }
                // Misplaced declaration of an exception variable
                catch (DiscoveryClient discoveryclient)
                {
                    discoveryclient = "Invalid device.";
                }
            }
        }
    }

    private void a(DiscoveredDevice discovereddevice)
    {
        if (k != discovereddevice)
        {
            k = discovereddevice;
            h();
        }
    }

    static boolean a(DiscoveryClient discoveryclient, boolean flag)
    {
        discoveryclient.m = flag;
        return flag;
    }

    static void b(DiscoveryClient discoveryclient)
    {
        discoveryclient.j();
    }

    public static void b(DiscoveryClient discoveryclient, boolean flag)
    {
label0:
        {
            if (discoveryclient.i() && discoveryclient.h != null)
            {
                if (!flag)
                {
                    break label0;
                }
                discoveryclient.h.b();
            }
            return;
        }
        discoveryclient.h.a();
    }

    static dvq c(DiscoveryClient discoveryclient)
    {
        return discoveryclient.g;
    }

    static dlq d(DiscoveryClient discoveryclient)
    {
        return discoveryclient.h;
    }

    static boolean e(DiscoveryClient discoveryclient)
    {
        return discoveryclient.l != null && discoveryclient.k != null && discoveryclient.l.a(discoveryclient.k.getDeviceId());
    }

    static dll f(DiscoveryClient discoveryclient)
    {
        return discoveryclient.o;
    }

    static dlm g(DiscoveryClient discoveryclient)
    {
        return discoveryclient.q;
    }

    private void h()
    {
        Iterator iterator = b.iterator();
        while (iterator.hasNext()) 
        {
            dlh dlh1 = (dlh)iterator.next();
            boolean flag;
            if (k != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dlh1.a(flag);
        }
    }

    private boolean i()
    {
        class DiscoveryConfiguration.FeatureFlagOverrideValue extends Enum
        {

            public static final DiscoveryConfiguration.FeatureFlagOverrideValue a;
            public static final DiscoveryConfiguration.FeatureFlagOverrideValue b;
            private static DiscoveryConfiguration.FeatureFlagOverrideValue c;
            private static final DiscoveryConfiguration.FeatureFlagOverrideValue d[];
            private final String mValue;

            public static DiscoveryConfiguration.FeatureFlagOverrideValue valueOf(String s)
            {
                return (DiscoveryConfiguration.FeatureFlagOverrideValue)Enum.valueOf(com/spotify/mobile/android/connect/DiscoveryClient$DiscoveryConfiguration$FeatureFlagOverrideValue, s);
            }

            public static DiscoveryConfiguration.FeatureFlagOverrideValue[] values()
            {
                return (DiscoveryConfiguration.FeatureFlagOverrideValue[])d.clone();
            }

            static 
            {
                a = new DiscoveryConfiguration.FeatureFlagOverrideValue("NONE", 0, "NONE");
                c = new DiscoveryConfiguration.FeatureFlagOverrideValue("ENABLED", 1, "ENABLED");
                b = new DiscoveryConfiguration.FeatureFlagOverrideValue("DISABLED", 2, "DISABLED");
                d = (new DiscoveryConfiguration.FeatureFlagOverrideValue[] {
                    a, c, b
                });
            }

            private DiscoveryConfiguration.FeatureFlagOverrideValue(String s, int i1, String s1)
            {
                super(s, i1);
                mValue = s1;
            }
        }

        while (d.a == DiscoveryConfiguration.FeatureFlagOverrideValue.b || d.a == DiscoveryConfiguration.FeatureFlagOverrideValue.a && !c) 
        {
            return false;
        }
        return true;
    }

    private void j()
    {
        if (!j || l == null || m) goto _L2; else goto _L1
_L1:
        String s = l.b;
        if (h.b(s)) goto _L2; else goto _L3
_L3:
        Iterator iterator = h.e.iterator();
_L7:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if (!((DiscoveredDevice)iterator.next()).getDeviceId().equals(s)) goto _L7; else goto _L6
_L6:
        boolean flag = true;
_L9:
        if (flag)
        {
            dlq dlq1 = h;
            dlm dlm = q;
            dlq1.g = false;
            dlq1.a(s, dlm);
        }
_L2:
        return;
_L5:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(ConnectDevice connectdevice)
    {
        l = connectdevice;
        if (!j)
        {
            return;
        }
        if (k != null && !connectdevice.a(k.getDeviceId()))
        {
            h.c();
        }
        j();
    }

    public final boolean a()
    {
        if (d())
        {
            return h.b.b();
        } else
        {
            return false;
        }
    }

    public final boolean a(float f1)
    {
        if (d())
        {
            return h.b.a(f1);
        } else
        {
            return false;
        }
    }

    public final SpotifyIcon b(ConnectDevice connectdevice)
    {
        String s = connectdevice.b;
        if (Tech.a(connectdevice) == Tech.b && s.startsWith("cast:"))
        {
            dlq dlq1 = h;
            connectdevice = s;
            if (s.startsWith("cast:"))
            {
                connectdevice = s.substring(5, s.length());
            }
            if (dlq1.a(connectdevice))
            {
                return SpotifyIcon.bw;
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    public final boolean b()
    {
        if (d())
        {
            return h.b.c();
        } else
        {
            return false;
        }
    }

    public final float c()
    {
        if (d())
        {
            return h.b.d();
        } else
        {
            return 0.0F;
        }
    }

    public final boolean d()
    {
        return h != null && k != null;
    }

    public final void e()
    {
        if (!j)
        {
            d = dly.a(f);
            if (i())
            {
                j = true;
                h = new dlq(f, d.b.a);
                i = new dlx(Cosmos.getResolver(f), new Handler(), r);
                Object obj = h;
                dlk dlk = p;
                ((dlq) (obj)).c.add(dlk);
                h.a();
                if (l != null)
                {
                    a(l);
                }
                h();
                obj = new dlj(this, (byte)0);
                n = new gfi(f, ((gfk) (obj)));
                n.a(dtx.a, ((dlj) (obj)).a);
                return;
            }
        }
    }

    public final void f()
    {
        if (!j)
        {
            return;
        } else
        {
            m = false;
            n.b();
            a(((DiscoveredDevice) (null)));
            h.b();
            dlq dlq1 = h;
            dlk dlk = p;
            dlq1.c.remove(dlk);
            h = null;
            i.a.destroy();
            j = false;
            return;
        }
    }

    public final void g()
    {
        f();
        e();
    }


    private class DiscoveryConfiguration
    {

        public FeatureFlagOverrideValue a;
        public dli b;

        public static DiscoveryConfiguration a()
        {
            DiscoveryConfiguration discoveryconfiguration = new DiscoveryConfiguration();
            discoveryconfiguration.a = FeatureFlagOverrideValue.a;
            dli dli1;
            if ("debug".equals("release") || "partners".equals("release"))
            {
                dli1 = (dli)DiscoveryClient.a.get(1);
            } else
            {
                dli1 = (dli)DiscoveryClient.a.get(0);
            }
            discoveryconfiguration.b = dli1;
            return discoveryconfiguration;
        }

        public DiscoveryConfiguration()
        {
        }
    }

}
