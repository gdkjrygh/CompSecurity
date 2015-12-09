// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import aou;
import aov;
import aph;
import app;
import aps;
import apt;
import apx;
import aqn;
import aqo;
import aqp;
import aqq;
import aqr;
import aqs;
import aqt;
import aqu;
import aqv;
import aqw;
import aqx;
import aqy;
import ara;
import arb;
import arc;
import arh;
import ari;
import arj;
import ark;
import arp;
import arq;
import art;
import arw;
import arx;
import ary;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.widget.FacebookDialog;
import de;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class LikeActionController
{

    private static final String i = com/facebook/internal/LikeActionController.getSimpleName();
    private static apt j;
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    private static art l = new art(1);
    private static art m = new art(1);
    private static Handler n;
    private static String o;
    private static boolean p;
    private static boolean q;
    private static volatile int r;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public AppEventsLogger h;
    private Session s;
    private Context t;
    private String u;
    private String v;
    private boolean w;
    private boolean x;
    private UUID y;
    private Bundle z;

    private LikeActionController(Context context, Session session, String s1)
    {
        t = context;
        s = session;
        u = s1;
        h = AppEventsLogger.a(context, session);
    }

    static int a(int i1)
    {
        r = i1;
        return i1;
    }

    private arx a(Bundle bundle)
    {
        return new arx(bundle) {

            private Bundle a;
            private LikeActionController b;

            public final void a(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Bundle bundle1)
            {
                if (!bundle1.containsKey("object_is_liked"))
                {
                    return;
                }
                boolean flag = bundle1.getBoolean("object_is_liked");
                String s1 = bundle1.getString("like_count_string");
                String s2 = bundle1.getString("social_sentence");
                String s3 = bundle1.getString("unlike_token");
                if (a == null)
                {
                    bundle1 = new Bundle();
                } else
                {
                    bundle1 = a;
                }
                bundle1.putString("call_id", pendingcall.a.toString());
                LikeActionController.b(b).b("fb_like_control_dialog_did_succeed", bundle1);
                LikeActionController.a(b, flag, s1, s1, s2, s2, s3);
            }

            public final void a(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Exception exception, Bundle bundle1)
            {
                exception = LoggingBehavior.a;
                LikeActionController.h();
                arb.b();
                if (a == null)
                {
                    exception = new Bundle();
                } else
                {
                    exception = a;
                }
                exception.putString("call_id", pendingcall.a.toString());
                LikeActionController.a(b, "present_dialog", exception);
                LikeActionController.a(LikeActionController.c(b), b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle1);
            }

            
            {
                b = LikeActionController.this;
                a = bundle;
                super();
            }
        };
    }

    private static LikeActionController a(String s1)
    {
        s1 = b(s1);
        LikeActionController likeactioncontroller = (LikeActionController)k.get(s1);
        if (likeactioncontroller != null)
        {
            l.a(new aqu(s1, false));
        }
        return likeactioncontroller;
    }

    static String a(LikeActionController likeactioncontroller, String s1)
    {
        likeactioncontroller.f = s1;
        return s1;
    }

    private void a(Activity activity, Bundle bundle)
    {
        Object obj2;
        aqt aqt1;
        obj2 = null;
        aqt1 = new aqt(activity, u);
        Activity activity1 = ((arw) (aqt1)).a;
        java.util.EnumSet enumset = aqt1.a();
        String s3 = FacebookDialog.a(enumset);
        String s2 = aph.i();
        String s1 = s2;
        if (arp.a(s2))
        {
            s1 = arp.a(activity1);
        }
        int i1;
        if (arc.a(activity1, s3, FacebookDialog.a(s1, s3, enumset)) != -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        s1 = FacebookDialog.a(aqt1.a());
        i1 = arc.a(((arw) (aqt1)).a, s1, FacebookDialog.a(((arw) (aqt1)).b, s1, aqt1.a()));
        Intent intent;
        if (arc.a(i1))
        {
            activity = aqt1.b();
        } else
        {
            activity = new Bundle();
        }
        intent = arc.a(((arw) (aqt1)).a, ((arw) (aqt1)).c.a.toString(), s1, i1, activity);
        if (intent == null)
        {
            FacebookDialog.a(((arw) (aqt1)).a, null, FacebookDialog.a(s1, activity.containsKey("com.facebook.platform.extra.PHOTOS")), "Failed");
            throw new FacebookException("Unable to create Intent; this likely means the Facebook app is not installed.");
        }
        com.facebook.widget.FacebookDialog.PendingCall.a(((arw) (aqt1)).c, intent);
        activity = (new FacebookDialog(((arw) (aqt1)).a, ((arw) (aqt1)).c, new arw._cls1(aqt1), (byte)0)).a();
        arh arh1 = arh.a();
        if (activity != null)
        {
            arh1.a.put(((com.facebook.widget.FacebookDialog.PendingCall) (activity)).a.toString(), activity);
        }
        y = ((com.facebook.widget.FacebookDialog.PendingCall) (activity)).a;
        c(u);
        z = bundle;
        m(this);
        h.b("fb_like_control_did_present_dialog", bundle);
_L4:
        return;
_L2:
        Object obj = aqt1.a().iterator();
        Object obj1;
        Bundle bundle1;
        int j1;
        if (((Iterator) (obj)).hasNext())
        {
            obj1 = (ary)((Iterator) (obj)).next();
            obj = ((ary) (obj1)).name();
            obj1 = ((ary) (obj1)).a();
        } else
        {
            obj = null;
            obj1 = null;
        }
        obj1 = arp.a(((arw) (aqt1)).b, ((String) (obj1)), ((String) (obj)));
        obj = obj2;
        if (obj1 != null)
        {
            obj1 = ((arq) (obj1)).c;
            if (obj1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = obj2;
        }
        if (!arp.a(((String) (obj))) && aps.a(activity, ((String) (obj)), aqt1.b, aqt1.c, a(bundle)))
        {
            h.b("fb_like_control_did_present_fallback_dialog", bundle);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = aqt1.b();
        j1 = arc.a();
        bundle1 = ark.a(((arw) (aqt1)).a, ((arw) (aqt1)).c.a.toString(), j1, ((Bundle) (obj)));
        obj = obj2;
        if (bundle1 != null)
        {
            obj = obj1;
            if (((Uri) (obj1)).isRelative())
            {
                obj = arp.a(ark.a(), ((Uri) (obj1)).toString(), bundle1);
            }
            obj = ((Uri) (obj)).toString();
        }
        break MISSING_BLOCK_LABEL_401;
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static void a(Context context)
    {
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorenter ;
        boolean flag = q;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/internal/LikeActionController;
        JVM INSTR monitorexit ;
        return;
_L2:
        n = new Handler(Looper.getMainLooper());
        r = context.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        j = new apt(context, i, new apx());
        context = de.a(context);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
        intentfilter.addAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        context.a(new BroadcastReceiver() {

            public final void onReceive(Context context1, Intent intent)
            {
                if (LikeActionController.c())
                {
                    return;
                }
                intent = intent.getAction();
                boolean flag1;
                if (arp.a("com.facebook.sdk.ACTIVE_SESSION_UNSET", intent) || arp.a("com.facebook.sdk.ACTIVE_SESSION_CLOSED", intent))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                LikeActionController.b(true);
                LikeActionController.g().postDelayed(new Runnable(flag1, context1) {

                    private boolean a;
                    private Context b;

                    public final void run()
                    {
                        if (a)
                        {
                            LikeActionController.a((LikeActionController.d() + 1) % 1000);
                            b.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.d()).apply();
                            LikeActionController.e().clear();
                            LikeActionController.f().a();
                        }
                        LikeActionController.a(b, "com.facebook.sdk.LikeActionController.DID_RESET");
                        LikeActionController.b(false);
                    }

            
            {
                a = flag;
                b = context;
                super();
            }
                }, 100L);
            }

        }, intentfilter);
        q = true;
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    static void a(Context context, LikeActionController likeactioncontroller, String s1, Bundle bundle)
    {
        b(context, likeactioncontroller, s1, bundle);
    }

    static void a(Context context, String s1)
    {
        b(context, null, s1, null);
    }

    public static void a(Context context, String s1, aqo aqo)
    {
        if (!q)
        {
            a(context);
        }
        LikeActionController likeactioncontroller = a(s1);
        if (likeactioncontroller != null)
        {
            a(aqo, likeactioncontroller);
            return;
        } else
        {
            m.a(new aqn(context, s1, aqo));
            return;
        }
    }

    private static void a(aqo aqo, LikeActionController likeactioncontroller)
    {
        if (aqo == null)
        {
            return;
        } else
        {
            n.post(new Runnable(aqo, likeactioncontroller) {

                private aqo a;
                private LikeActionController b;

                public final void run()
                {
                    a.a(b);
                }

            
            {
                a = aqo1;
                b = likeactioncontroller;
                super();
            }
            });
            return;
        }
    }

    private void a(aqx aqx1)
    {
        if (!arp.a(v))
        {
            aqx1.a();
            return;
        } else
        {
            aqq aqq1 = new aqq(this, u);
            aqs aqs1 = new aqs(this, u);
            aou aou1 = new aou();
            aqq1.a(aou1);
            aqs1.a(aou1);
            aou1.a(new aov(aqq1, aqs1, aqx1) {

                private aqq a;
                private aqs b;
                private aqx c;
                private LikeActionController d;

                public final void a()
                {
                    LikeActionController.b(d, a.c);
                    if (arp.a(LikeActionController.d(d)))
                    {
                        LikeActionController.b(d, b.c);
                        LikeActionController.b(d, b.d);
                    }
                    if (arp.a(LikeActionController.d(d)))
                    {
                        Object obj = LoggingBehavior.f;
                        LikeActionController.h();
                        LikeActionController.k(d);
                        arb.b();
                        LikeActionController likeactioncontroller = d;
                        if (b.b != null)
                        {
                            obj = b.b;
                        } else
                        {
                            obj = a.b;
                        }
                        LikeActionController.a(likeactioncontroller, "get_verified_id", ((FacebookRequestError) (obj)));
                    }
                    if (c != null)
                    {
                        c.a();
                    }
                }

            
            {
                d = LikeActionController.this;
                a = aqq1;
                b = aqs1;
                c = aqx1;
                super();
            }
            });
            Request.b(aou1);
            return;
        }
    }

    static void a(LikeActionController likeactioncontroller)
    {
        if (likeactioncontroller.s == null || likeactioncontroller.s.b() || SessionState.a.equals(likeactioncontroller.s.c()))
        {
            ara ara1 = new ara(likeactioncontroller.t, aph.i(), likeactioncontroller.u);
            if (ara1.a())
            {
                ara1.b = likeactioncontroller. new arj() {

                    private LikeActionController a;

                    public final void a(Bundle bundle)
                    {
                        if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
                        {
                            return;
                        } else
                        {
                            boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                            String s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                            String s2 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                            String s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                            String s4 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                            bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                            LikeActionController.a(a, flag, s1, s2, s3, s4, bundle);
                            return;
                        }
                    }

            
            {
                a = LikeActionController.this;
                super();
            }
                };
            }
            return;
        } else
        {
            likeactioncontroller.a(likeactioncontroller. new aqx() {

                final LikeActionController a;

                public final void a()
                {
                    aqr aqr1 = new aqr(a, LikeActionController.d(a));
                    aqp aqp1 = new aqp(a, LikeActionController.d(a));
                    aou aou1 = new aou();
                    aqr1.a(aou1);
                    aqp1.a(aou1);
                    aou1.a(new aov(this, aqr1, aqp1) {

                        private aqr a;
                        private aqp b;
                        private _cls9 c;

                        public final void a()
                        {
                            if (a.b != null || b.b != null)
                            {
                                LoggingBehavior loggingbehavior = LoggingBehavior.a;
                                LikeActionController.h();
                                LikeActionController.k(c.a);
                                arb.b();
                                return;
                            } else
                            {
                                LikeActionController.a(c.a, a.c, b.c, b.d, b.e, b.f, a.d);
                                return;
                            }
                        }

            
            {
                c = _pcls9;
                a = aqr1;
                b = aqp1;
                super();
            }
                    });
                    Request.b(aou1);
                }

            
            {
                a = LikeActionController.this;
                super();
            }
            });
            return;
        }
    }

    static void a(LikeActionController likeactioncontroller, Activity activity, Bundle bundle)
    {
        likeactioncontroller.a(activity, bundle);
    }

    static void a(LikeActionController likeactioncontroller, String s1, Bundle bundle)
    {
        likeactioncontroller.a(s1, bundle);
    }

    public static void a(LikeActionController likeactioncontroller, String s1, FacebookRequestError facebookrequesterror)
    {
        Bundle bundle = new Bundle();
        if (facebookrequesterror != null)
        {
            facebookrequesterror = facebookrequesterror.d;
            if (facebookrequesterror != null)
            {
                bundle.putString("error", facebookrequesterror.toString());
            }
        }
        likeactioncontroller.a(s1, bundle);
    }

    static void a(LikeActionController likeactioncontroller, boolean flag, String s1, String s2, String s3, String s4, String s5)
    {
        likeactioncontroller.a(flag, s1, s2, s3, s4, s5);
    }

    private void a(String s1, Bundle bundle)
    {
        bundle = new Bundle(bundle);
        bundle.putString("object_id", u);
        bundle.putString("current_action", s1);
        h.b("fb_like_control_error", bundle);
    }

    public static void a(String s1, String s2)
    {
        String s3;
        String s4;
        s4 = null;
        s3 = null;
        s1 = j.b(s1, null);
        s3 = s1;
        s4 = s1;
        s1.write(s2.getBytes());
        arp.a(s1);
_L2:
        return;
        s1;
        s4 = s3;
        Log.e(i, "Unable to serialize controller to disk", s1);
        if (s3 == null) goto _L2; else goto _L1
_L1:
        arp.a(s3);
        return;
        s1;
        if (s4 != null)
        {
            arp.a(s4);
        }
        throw s1;
    }

    public static boolean a(Context context, int i1, Intent intent)
    {
        UUID uuid = arc.a(intent);
        if (uuid != null)
        {
            if (arp.a(o))
            {
                o = context.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
            }
            if (!arp.a(o))
            {
                a(context, o, new aqo(i1, intent, uuid) {

                    private int a;
                    private Intent b;
                    private UUID c;

                    public final void a(LikeActionController likeactioncontroller)
                    {
                        LikeActionController.a(likeactioncontroller, a, b, c);
                    }

            
            {
                a = i1;
                b = intent;
                c = uuid;
                super();
            }
                });
                return true;
            }
        }
        return false;
    }

    static boolean a(LikeActionController likeactioncontroller, int i1, Intent intent, UUID uuid)
    {
        if (likeactioncontroller.y != null && likeactioncontroller.y.equals(uuid))
        {
            if ((uuid = arh.a().b(likeactioncontroller.y)) != null)
            {
                FacebookDialog.a(uuid, i1, intent, likeactioncontroller.a(likeactioncontroller.z));
                arh.a().a(likeactioncontroller.y);
                likeactioncontroller.y = null;
                likeactioncontroller.z = null;
                likeactioncontroller.c(((String) (null)));
                return true;
            }
        }
        return false;
    }

    static boolean a(LikeActionController likeactioncontroller, boolean flag)
    {
        likeactioncontroller.x = flag;
        return flag;
    }

    static AppEventsLogger b(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.h;
    }

    private static LikeActionController b(Context context, String s1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s1 = b(s1);
        s1 = j.a(s1, null);
        String s2;
        LikeActionController likeactioncontroller;
        likeactioncontroller = obj1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s2 = s1;
        String s3 = arp.a(s1);
        likeactioncontroller = obj1;
        s2 = s1;
        if (arp.a(s3))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s2 = s1;
        likeactioncontroller = c(context, s3);
        context = likeactioncontroller;
        if (s1 != null)
        {
            arp.a(s1);
            context = likeactioncontroller;
        }
_L2:
        return context;
        context;
        s1 = null;
_L5:
        s2 = s1;
        Log.e(i, "Unable to deserialize controller from disk", context);
        context = obj;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        arp.a(s1);
        return null;
        context;
        s2 = null;
_L4:
        if (s2 != null)
        {
            arp.a(s2);
        }
        throw context;
        context;
        if (true) goto _L4; else goto _L3
_L3:
        context;
          goto _L5
    }

    static String b(LikeActionController likeactioncontroller, String s1)
    {
        likeactioncontroller.v = s1;
        return s1;
    }

    private static String b(String s1)
    {
        String s3 = null;
        Session session = Session.g();
        String s2 = s3;
        if (session != null)
        {
            s2 = s3;
            if (session.a())
            {
                s2 = session.d();
            }
        }
        s3 = s2;
        if (s2 != null)
        {
            s3 = arp.b(s2);
        }
        return String.format("%s|%s|com.fb.sdk.like|%d", new Object[] {
            s1, arp.a(s3, ""), Integer.valueOf(r)
        });
    }

    private static void b(Context context, LikeActionController likeactioncontroller, String s1, Bundle bundle)
    {
        Intent intent = new Intent(s1);
        s1 = bundle;
        if (likeactioncontroller != null)
        {
            s1 = bundle;
            if (bundle == null)
            {
                s1 = new Bundle();
            }
            s1.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeactioncontroller.u);
        }
        if (s1 != null)
        {
            intent.putExtras(s1);
        }
        de.a(context.getApplicationContext()).a(intent);
    }

    public static void b(Context context, String s1, aqo aqo)
    {
        LikeActionController likeactioncontroller = a(s1);
        if (likeactioncontroller != null)
        {
            a(aqo, likeactioncontroller);
            return;
        }
        LikeActionController likeactioncontroller1 = b(context, s1);
        likeactioncontroller = likeactioncontroller1;
        if (likeactioncontroller1 == null)
        {
            likeactioncontroller = new LikeActionController(context, Session.g(), s1);
            m(likeactioncontroller);
        }
        context = b(s1);
        l.a(new aqu(context, true));
        k.put(context, likeactioncontroller);
        n.post(likeactioncontroller. new Runnable() {

            private LikeActionController a;

            public final void run()
            {
                LikeActionController.a(a);
            }

            
            {
                a = LikeActionController.this;
                super();
            }
        });
        a(aqo, likeactioncontroller);
    }

    static void b(LikeActionController likeactioncontroller, Activity activity, Bundle bundle)
    {
        if (likeactioncontroller.a != likeactioncontroller.x)
        {
            likeactioncontroller.a(activity, likeactioncontroller.a, bundle);
        }
    }

    static boolean b(LikeActionController likeactioncontroller, boolean flag)
    {
        likeactioncontroller.w = flag;
        return flag;
    }

    static boolean b(boolean flag)
    {
        p = flag;
        return flag;
    }

    static Context c(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.t;
    }

    private static LikeActionController c(Context context, String s1)
    {
        JSONObject jsonobject = new JSONObject(s1);
        if (jsonobject.optInt("com.facebook.internal.LikeActionController.version", -1) != 2)
        {
            return null;
        }
        s1 = new LikeActionController(context, Session.g(), jsonobject.getString("object_id"));
        s1.b = jsonobject.optString("like_count_string_with_like", null);
        s1.c = jsonobject.optString("like_count_string_without_like", null);
        s1.d = jsonobject.optString("social_sentence_with_like", null);
        s1.e = jsonobject.optString("social_sentence_without_like", null);
        s1.a = jsonobject.optBoolean("is_object_liked");
        s1.f = jsonobject.optString("unlike_token", null);
        context = jsonobject.optString("pending_call_id", null);
        if (!arp.a(context))
        {
            s1.y = UUID.fromString(context);
        }
        jsonobject = jsonobject.optJSONObject("pending_call_analytics_bundle");
        context = s1;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        s1.z = app.a(jsonobject);
        context = s1;
_L2:
        return context;
        context;
        Log.e(i, "Unable to deserialize controller from JSON", context);
        context = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void c(String s1)
    {
        o = s1;
        t.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", o).apply();
    }

    static boolean c()
    {
        return p;
    }

    static int d()
    {
        return r;
    }

    static String d(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.v;
    }

    public static ConcurrentHashMap e()
    {
        return k;
    }

    static boolean e(LikeActionController likeactioncontroller)
    {
        likeactioncontroller.g = false;
        return false;
    }

    static apt f()
    {
        return j;
    }

    static String f(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.b;
    }

    static Handler g()
    {
        return n;
    }

    static String g(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.c;
    }

    public static String h()
    {
        return i;
    }

    static String h(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.d;
    }

    static String i(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.e;
    }

    static String j(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.f;
    }

    static String k(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.u;
    }

    public static Session l(LikeActionController likeactioncontroller)
    {
        return likeactioncontroller.s;
    }

    private static void m(LikeActionController likeactioncontroller)
    {
        String s1 = n(likeactioncontroller);
        likeactioncontroller = b(likeactioncontroller.u);
        if (!arp.a(s1) && !arp.a(likeactioncontroller))
        {
            m.a(new aqy(likeactioncontroller, s1));
        }
    }

    private static String n(LikeActionController likeactioncontroller)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("com.facebook.internal.LikeActionController.version", 2);
            jsonobject.put("object_id", likeactioncontroller.u);
            jsonobject.put("like_count_string_with_like", likeactioncontroller.b);
            jsonobject.put("like_count_string_without_like", likeactioncontroller.c);
            jsonobject.put("social_sentence_with_like", likeactioncontroller.d);
            jsonobject.put("social_sentence_without_like", likeactioncontroller.e);
            jsonobject.put("is_object_liked", likeactioncontroller.a);
            jsonobject.put("unlike_token", likeactioncontroller.f);
            if (likeactioncontroller.y != null)
            {
                jsonobject.put("pending_call_id", likeactioncontroller.y.toString());
            }
            if (likeactioncontroller.z != null)
            {
                jsonobject.put("pending_call_analytics_bundle", app.a(likeactioncontroller.z));
            }
        }
        // Misplaced declaration of an exception variable
        catch (LikeActionController likeactioncontroller)
        {
            Log.e(i, "Unable to serialize controller to JSON", likeactioncontroller);
            return null;
        }
        return jsonobject.toString();
    }

    public final String a()
    {
        if (a)
        {
            return b;
        } else
        {
            return c;
        }
    }

    public final void a(Activity activity, boolean flag, Bundle bundle)
    {
        if (a(flag))
        {
            if (flag)
            {
                g = true;
                a(new aqx(activity, bundle) {

                    final Activity a;
                    final Bundle b;
                    final LikeActionController c;

                    public final void a()
                    {
                        if (arp.a(LikeActionController.d(c)))
                        {
                            Bundle bundle1 = new Bundle();
                            bundle1.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                            LikeActionController.a(LikeActionController.c(c), c, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle1);
                            return;
                        } else
                        {
                            aou aou2 = new aou();
                            aqv aqv1 = new aqv(c, LikeActionController.d(c));
                            aqv1.a(aou2);
                            aou2.a(new aov(this, aqv1) {

                                private aqv a;
                                private _cls7 b;

                                public final void a()
                                {
                                    LikeActionController.e(b.c);
                                    if (a.b != null)
                                    {
                                        LikeActionController.a(b.c, false, LikeActionController.f(b.c), LikeActionController.g(b.c), LikeActionController.h(b.c), LikeActionController.i(b.c), LikeActionController.j(b.c));
                                        LikeActionController.a(b.c, b.a, b.b);
                                        return;
                                    } else
                                    {
                                        LikeActionController.a(b.c, arp.a(a.c, null));
                                        LikeActionController.a(b.c, true);
                                        LikeActionController.b(b.c).b("fb_like_control_did_like", b.b);
                                        LikeActionController.b(b.c, b.a, b.b);
                                        return;
                                    }
                                }

            
            {
                b = _pcls7;
                a = aqv1;
                super();
            }
                            });
                            Request.b(aou2);
                            return;
                        }
                    }

            
            {
                c = LikeActionController.this;
                a = activity;
                b = bundle;
                super();
            }
                });
                return;
            } else
            {
                g = true;
                aou aou1 = new aou();
                aqw aqw1 = new aqw(this, f);
                aqw1.a(aou1);
                aou1.a(new aov(aqw1, activity, bundle) {

                    private aqw a;
                    private Activity b;
                    private Bundle c;
                    private LikeActionController d;

                    public final void a()
                    {
                        LikeActionController.e(d);
                        if (a.b != null)
                        {
                            LikeActionController.a(d, true, LikeActionController.f(d), LikeActionController.g(d), LikeActionController.h(d), LikeActionController.i(d), LikeActionController.j(d));
                            LikeActionController.a(d, b, c);
                            return;
                        } else
                        {
                            LikeActionController.a(d, null);
                            LikeActionController.a(d, false);
                            LikeActionController.b(d).b("fb_like_control_did_unlike", c);
                            LikeActionController.b(d, b, c);
                            return;
                        }
                    }

            
            {
                d = LikeActionController.this;
                a = aqw1;
                b = activity;
                c = bundle;
                super();
            }
                });
                Request.b(aou1);
                return;
            }
        } else
        {
            a(activity, bundle);
            return;
        }
    }

    public final void a(boolean flag, String s1, String s2, String s3, String s4, String s5)
    {
        s1 = arp.a(s1, null);
        s2 = arp.a(s2, null);
        s3 = arp.a(s3, null);
        s4 = arp.a(s4, null);
        s5 = arp.a(s5, null);
        boolean flag1;
        if (flag != a || !arp.a(s1, b) || !arp.a(s2, c) || !arp.a(s3, d) || !arp.a(s4, e) || !arp.a(s5, f))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return;
        } else
        {
            a = flag;
            b = s1;
            c = s2;
            d = s3;
            e = s4;
            f = s5;
            m(this);
            b(t, this, "com.facebook.sdk.LikeActionController.UPDATED", null);
            return;
        }
    }

    public final boolean a(boolean flag)
    {
        return !w && v != null && s != null && s.e() != null && s.e().contains("publish_actions") && (flag || !arp.a(f));
    }

    public final String b()
    {
        if (a)
        {
            return d;
        } else
        {
            return e;
        }
    }

}
