// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import bb;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.collection.receiver.ConnectionStateChangedReceiver;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import de;
import dmz;
import eda;
import edb;
import eob;
import eof;
import eog;
import eoj;
import fcv;
import fop;
import gcf;
import ggh;
import gjm;
import gng;
import gni;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            Annotation, AnnotateServiceHelperImpl

public class AnnotateService extends Service
{

    Map a;
    eoj b;
    boolean c;
    boolean d;
    boolean e;
    private final eob f = new eob(this);
    private edb g;
    private de h;
    private Thread i;
    private String j;
    private ObjectMapper k;
    private final eda l = new eda() {

        private AnnotateService a;

        public final void a(SessionState sessionstate)
        {
            boolean flag;
            flag = AnnotateService.a(a);
            AnnotateService.a(a, sessionstate.j);
            boolean flag1 = sessionstate.j;
            AnnotateService.b(a).removeMessages(0);
            if (!AnnotateService.a(a) || flag) goto _L2; else goto _L1
_L1:
            AnnotateService.b(a).sendEmptyMessageDelayed(0, 15000L);
            AnnotateService.c(a).removeMessages(0);
_L4:
            AnnotateService.a(a, sessionstate.b);
            if (!AnnotateService.d(a))
            {
                AnnotateService.e(a);
                AnnotateService.f(a);
                a.b();
            }
            if (sessionstate.g || !sessionstate.e)
            {
                a.stopSelf();
            }
            return;
_L2:
            if (!AnnotateService.a(a) && flag)
            {
                AnnotateService.c(a).sendEmptyMessageDelayed(0, 0x2bf20L);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                a = AnnotateService.this;
                super();
            }
    };
    private Handler m;
    private final Handler n = new eog(this);

    public AnnotateService()
    {
        a = Collections.synchronizedMap(new LinkedHashMap());
        k = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        m = new eof(this, (byte)0);
    }

    public static Status a(Intent intent)
    {
        int i1 = intent.getIntExtra("status", Status.a.ordinal());
        if (i1 >= 0 && i1 < Status.values().length)
        {
            return Status.values()[i1];
        } else
        {
            return Status.a;
        }
    }

    static String a(AnnotateService annotateservice, String s)
    {
        annotateservice.j = s;
        return s;
    }

    public static void a(Context context)
    {
        context.startService(new Intent(context, com/spotify/mobile/android/spotlets/collection/service/AnnotateService));
    }

    public static void a(AnnotateService annotateservice, String s, Status status)
    {
        annotateservice.a(s, status);
    }

    public static void a(AnnotateService annotateservice, String s, Annotation annotation, Status status)
    {
        annotateservice.a(s, annotation, status);
    }

    public static void a(AnnotateService annotateservice, String s, String s1)
    {
        annotateservice.b(s, s1);
    }

    static boolean a(AnnotateService annotateservice)
    {
        return annotateservice.c;
    }

    static boolean a(AnnotateService annotateservice, boolean flag)
    {
        annotateservice.c = flag;
        return flag;
    }

    static Handler b(AnnotateService annotateservice)
    {
        return annotateservice.m;
    }

    static Handler c(AnnotateService annotateservice)
    {
        return annotateservice.n;
    }

    private File c()
    {
        return new File(getFilesDir(), (new StringBuilder()).append(j.hashCode()).append("annotation_jobs.json").toString());
    }

    static boolean d(AnnotateService annotateservice)
    {
        return annotateservice.d;
    }

    static boolean e(AnnotateService annotateservice)
    {
        annotateservice.d = true;
        return true;
    }

    static void f(AnnotateService annotateservice)
    {
        if (!TextUtils.isEmpty(annotateservice.j))
        {
            Object obj = new TypeReference() {

            };
            try
            {
                java.util.Map.Entry entry;
                for (obj = ((HashMap)annotateservice.k.readValue(annotateservice.c(), ((TypeReference) (obj)))).entrySet().iterator(); ((Iterator) (obj)).hasNext(); annotateservice.a.put(entry.getKey(), entry.getValue()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (AnnotateService annotateservice) { }
        }
    }

    static eoj g(AnnotateService annotateservice)
    {
        return annotateservice.b;
    }

    public static Map h(AnnotateService annotateservice)
    {
        return annotateservice.a;
    }

    static boolean i(AnnotateService annotateservice)
    {
        annotateservice.e = false;
        return false;
    }

    final void a()
    {
        if (TextUtils.isEmpty(j))
        {
            return;
        }
        a.size();
        try
        {
            k.writeValue(c(), a);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    final void a(String s, Status status)
    {
        Intent intent = new Intent("com.spotify.mobile.android.spotlets.collection.service.AnnotateService.action.JOB_CHANGED");
        intent.putExtra("playlist_uri", s);
        intent.putExtra("status", status.ordinal());
        h.a(intent);
    }

    final void a(String s, Annotation annotation, Status status)
    {
        annotation.setStatus(status);
        a.put(s, annotation);
        a(s, annotation.getStatus());
    }

    final boolean a(String s, String s1)
    {
        if (((Annotation)a.get(s)).getStatus() == Status.f)
        {
            b(s, s1);
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        if (i != null && i.isAlive())
        {
            return;
        } else
        {
            i = new Thread(new Runnable() {

                private AnnotateService a;

                public final void run()
                {
                    AnnotateService annotateservice = a;
_L8:
                    annotateservice.a.size();
                    if (!annotateservice.a.isEmpty()) goto _L2; else goto _L1
_L1:
                    if (!annotateservice.d || annotateservice.e) goto _L4; else goto _L3
_L3:
                    annotateservice.stopSelf();
_L6:
                    return;
_L4:
                    if (annotateservice.e) goto _L6; else goto _L5
_L5:
                    return;
_L2:
                    Object obj;
                    Object obj4;
                    Iterator iterator;
                    if (!annotateservice.c)
                    {
                        annotateservice.a();
                        return;
                    }
                    obj = null;
                    obj4 = null;
                    iterator = annotateservice.a.entrySet().iterator();
_L9:
                    Object obj2;
                    Object obj3;
                    obj3 = obj4;
                    obj2 = obj;
                    if (!iterator.hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    obj3 = (java.util.Map.Entry)iterator.next();
                    obj2 = ((Annotation)((java.util.Map.Entry) (obj3)).getValue()).getStatus();
                    if (obj2 != Status.b && obj2 != Status.c && obj2 != Status.f)
                    {
                        break MISSING_BLOCK_LABEL_710;
                    }
                    obj2 = (String)((java.util.Map.Entry) (obj3)).getKey();
                    obj3 = (Annotation)((java.util.Map.Entry) (obj3)).getValue();
                    if (obj2 == null) goto _L6; else goto _L7
_L7:
                    Object obj5 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ah);
                    if (!annotateservice.a(((String) (obj2)), ((Annotation) (obj3)).getImageUri()))
                    {
                        annotateservice.a(((String) (obj2)), ((Annotation) (obj3)), Status.c);
                        ((Annotation) (obj3)).getImageUri();
                        ((Annotation) (obj3)).getDescription();
                        Object obj1 = new SpotifyLink(((String) (obj2)));
                        String s = ((SpotifyLink) (obj1)).a();
                        String s1 = ((SpotifyLink) (obj1)).b();
                        obj1 = ((Annotation) (obj3)).getImageUri();
                        boolean flag;
                        if (obj1 != null)
                        {
                            if (((String) (obj1)).length() > 0)
                            {
                                ggh ggh1 = new ggh();
                                String s2 = annotateservice.b.b();
                                boolean flag1;
                                if (s2 == null)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                ((ClientEvent) (obj5)).a("token_request_error", String.valueOf(flag));
                                ((ClientEvent) (obj5)).a("token_fetch_time", String.valueOf(ggh1.a()));
                                if (s2 != null)
                                {
                                    ggh ggh2 = new ggh();
                                    obj1 = annotateservice.b.b(((String) (obj1)), s2);
                                    long l1;
                                    long l2;
                                    if (obj1 == null)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                    ((ClientEvent) (obj5)).a("image_upload_request_error", String.valueOf(flag));
                                    ((ClientEvent) (obj5)).a("image_upload_time", String.valueOf(ggh2.a()));
                                } else
                                {
                                    obj1 = null;
                                }
                            } else
                            if (((String) (obj1)).length() == 0)
                            {
                                obj1 = "";
                            } else
                            {
                                obj1 = null;
                            }
                            if (obj1 == null)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        } else
                        {
                            flag = false;
                            obj1 = null;
                        }
                        flag1 = flag;
                        if (!flag)
                        {
                            s2 = ((Annotation) (obj3)).getDescription();
                            String.format("setImageIdAndDescription(%s, %s, %s, %s)", new Object[] {
                                s, s1, obj1, s2
                            });
                            flag1 = false;
                            if (obj1 != null || s2 != null)
                            {
                                ggh2 = new ggh();
                                if (!annotateservice.b.a(s, s1, ((String) (obj1)), s2))
                                {
                                    flag1 = true;
                                } else
                                {
                                    flag1 = false;
                                }
                                ((ClientEvent) (obj5)).a("annotation_request_error", String.valueOf(flag1));
                                ((ClientEvent) (obj5)).a("annotate_upload_time", String.valueOf(ggh2.a()));
                            }
                        }
                        dmz.a(fop);
                        fop.a(annotateservice, ViewUri.aj.a(((String) (obj2))), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.N, ((ClientEvent) (obj5)));
                        if (!annotateservice.a(((String) (obj2)), ((Annotation) (obj3)).getImageUri()))
                        {
                            if (flag1)
                            {
                                annotateservice.a(((String) (obj2)), ((Annotation) (obj3)), Status.d);
                                obj1 = ((Annotation) (obj3)).getName();
                                obj3 = new fcv(annotateservice);
                                ((fcv) (obj3)).a(((String) (obj2)));
                                obj3 = PendingIntent.getActivity(annotateservice, ((String) (obj2)).hashCode(), ((fcv) (obj3)).a, 0x10000000);
                                obj5 = new bb(annotateservice);
                                ((bb) (obj5)).a(annotateservice.getString(0x7f080089)).b(annotateservice.getString(0x7f080087)).a(BitmapFactory.decodeResource(annotateservice.getResources(), 0x7f0201e6)).a(0x7f020203).c(annotateservice.getString(0x7f080088, new Object[] {
                                    obj1
                                })).a(System.currentTimeMillis()).d().a(((PendingIntent) (obj3)));
                                obj1 = ((bb) (obj5)).g();
                                ((NotificationManager)annotateservice.getSystemService("notification")).notify(((String) (obj2)).hashCode(), ((android.app.Notification) (obj1)));
                            } else
                            {
                                annotateservice.b.a(((String) (obj2)));
                                annotateservice.b(((String) (obj2)), ((Annotation) (obj3)).getImageUri());
                                annotateservice.a(((String) (obj2)), Status.e);
                            }
                        }
                    }
                      goto _L8
                    if (obj2 == Status.d)
                    {
                        l1 = ((Annotation)((java.util.Map.Entry) (obj3)).getValue()).getTimestamp();
                        l2 = gcf.a() - l1;
                        if (l1 > 0L && l2 > 0x9a7ec800L)
                        {
                            annotateservice.b((String)((java.util.Map.Entry) (obj3)).getKey(), ((Annotation)((java.util.Map.Entry) (obj3)).getValue()).getImageUri());
                        }
                    } else
                    {
                        ((java.util.Map.Entry) (obj3)).getKey();
                    }
                      goto _L9
                }

            
            {
                a = AnnotateService.this;
                super();
            }
            });
            i.start();
            return;
        }
    }

    final void b(String s, String s1)
    {
        if (s1 != null)
        {
            if ((new File(Uri.parse(s1).getPath())).delete());
        }
        a.remove(s);
    }

    public IBinder onBind(Intent intent)
    {
        return f;
    }

    public void onCreate()
    {
        super.onCreate();
        n.sendEmptyMessageDelayed(0, 0x2bf20L);
        gcf gcf1 = gcf.a;
        b = new AnnotateServiceHelperImpl(this, k);
        g = new edb(this);
        g.a(l);
        g.a();
        h = de.a(getApplicationContext());
    }

    public void onDestroy()
    {
        super.onDestroy();
        b.a();
        g.b();
        m.removeMessages(0);
        n.removeMessages(0);
        PackageManager packagemanager;
        ComponentName componentname;
        int i1;
        if (!a.isEmpty())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        packagemanager = getPackageManager();
        componentname = new ComponentName(this, com/spotify/mobile/android/spotlets/collection/receiver/ConnectionStateChangedReceiver);
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        packagemanager.setComponentEnabledSetting(componentname, i1, 1);
        a();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        intent.getAction();
        String s = intent.getAction();
        if (!TextUtils.isEmpty(s))
        {
            if (!"com.spotify.mobile.android.spotlets.collection.service.AnnotateService.action.ANNOTATE".equals(s))
            {
                throw new IllegalArgumentException((new StringBuilder("AnnotateService does not know the action ")).append(s).toString());
            }
            e = true;
            String s1 = intent.getStringExtra("playlist_uri");
            String s2 = intent.getStringExtra("image_uri");
            String s3 = intent.getStringExtra("name");
            String s4 = intent.getStringExtra("folder_uri");
            String s5 = intent.getStringExtra("add_uri");
            s = intent.getStringExtra("description");
            intent = s;
            if (!TextUtils.isEmpty(s))
            {
                intent = s.trim().replace("\n", "").replace("\r", "");
            }
            if (!TextUtils.isEmpty(s1) && s3 != null)
            {
                b.a(s1, s3);
            }
            (new Thread(new Runnable(s1, s3, s4, s5, s2, intent) {

                private String a;
                private String b;
                private String c;
                private String d;
                private String e;
                private String f;
                private AnnotateService g;

                public final void run()
                {
                    String s7 = a;
                    String s6 = s7;
                    if (TextUtils.isEmpty(s7))
                    {
                        s6 = AnnotateService.g(g).a(b, c, d);
                        if (s6 == null)
                        {
                            Assertion.b("playlistUri is null which should never happen.");
                            return;
                        }
                    }
                    if (e != null || f != null)
                    {
                        String s8 = e;
                        s8 = f;
                        if (!AnnotateService.h(g).containsKey(s6))
                        {
                            Annotation annotation = new Annotation(b, f, e, Status.b, gcf.a());
                            AnnotateService.a(g, s6, annotation, Status.b);
                        }
                        AnnotateService.i(g);
                        g.b();
                        return;
                    } else
                    {
                        AnnotateService.i(g);
                        return;
                    }
                }

            
            {
                g = AnnotateService.this;
                a = s;
                b = s1;
                c = s2;
                d = s3;
                e = s4;
                f = s5;
                super();
            }
            })).start();
            if (!c)
            {
                n.sendEmptyMessageDelayed(0, 0x2bf20L);
                return 2;
            }
        }
        return 2;
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/collection/service/AnnotateService$5

/* anonymous class */
    public final class _cls5
    {

        public static final int a[];

        static 
        {
            a = new int[Status.values().length];
            try
            {
                a[Status.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Status.d.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[Status.a.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Status.f.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Status.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Status.c.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        public static final Status d;
        public static final Status e;
        public static final Status f;
        private static final Status g[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/service/AnnotateService$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])g.clone();
        }

        static 
        {
            a = new Status("INVALID", 0);
            b = new Status("PENDING", 1);
            c = new Status("IN_PROGRESS", 2);
            d = new Status("FAILED", 3);
            e = new Status("DONE", 4);
            f = new Status("CANCELED", 5);
            g = (new Status[] {
                a, b, c, d, e, f
            });
        }

        private Status(String s, int i1)
        {
            super(s, i1);
        }
    }

}
