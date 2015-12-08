// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.branch.referral:
//            PrefHelper, BranchRemoteInterface, SystemObserver, ServerRequestQueue, 
//            BranchApp, Base64, ServerRequest, BranchError, 
//            ServerRequestRegisterOpen, ServerRequestRegisterInstall, InstallListener, ServerRequestLogout, 
//            ServerRequestRegisterClose, BranchUtil, ShareLinkManager

public class Branch
{

    private static Branch b;
    private static boolean u = false;
    private static boolean v = false;
    private final int A = 1501;
    final Object a = new Object();
    private BranchRemoteInterface c;
    private PrefHelper d;
    private SystemObserver e;
    private Context f;
    private Timer g;
    private Timer h;
    private boolean i;
    private Semaphore j;
    private ServerRequestQueue k;
    private int l;
    private boolean m;
    private SparseArray n;
    private android.view.View.OnTouchListener o;
    private Handler p;
    private boolean q;
    private Map r;
    private ScheduledFuture s;
    private BranchActivityLifeCycleObserver t;
    private SESSION_STATE w;
    private ShareLinkManager x;
    private Activity y;
    private final String z = "io.branch.sdk.auto_link_request_code";

    private Branch(Context context)
    {
        w = SESSION_STATE.c;
        d = PrefHelper.a(context);
        c = new BranchRemoteInterface(context);
        e = new SystemObserver(context);
        k = ServerRequestQueue.a(context);
        j = new Semaphore(1);
        g = new Timer();
        h = new Timer();
        i = false;
        l = 0;
        m = true;
        n = new SparseArray();
        if (o == null)
        {
            o = new _cls1();
        }
        o = o;
        p = new Handler();
        q = false;
        r = new HashMap();
    }

    static Activity a(Branch branch, Activity activity)
    {
        branch.y = activity;
        return activity;
    }

    static SESSION_STATE a(Branch branch, SESSION_STATE session_state)
    {
        branch.w = session_state;
        return session_state;
    }

    public static Branch a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        Log.e("BranchSDK", "Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
_L4:
        return b;
_L2:
        if (u && !v)
        {
            Log.e("BranchSDK", "Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Branch a(Context context)
    {
        return a(context, true);
    }

    private static Branch a(Context context, boolean flag)
    {
        if (b == null)
        {
            Object obj = new Branch(context.getApplicationContext());
            b = ((Branch) (obj));
            obj = ((Branch) (obj)).d.a(flag);
            if (obj == null || ((String) (obj)).equalsIgnoreCase("bnc_no_value"))
            {
                Log.i("BranchSDK", "Branch Warning: Please enter your branch_key in your project's Manifest file!");
                flag = b.d.b("bnc_no_value");
            } else
            {
                flag = b.d.b(((String) (obj)));
            }
            if (flag)
            {
                b.r.clear();
                b.k.d();
            }
        }
        b.f = context;
        if (context instanceof BranchApp)
        {
            u = true;
            b.a((Application)context);
        }
        return b;
    }

    static PrefHelper a(Branch branch)
    {
        return branch.d;
    }

    private static JSONObject a(String s1)
    {
        if (s1.equals("bnc_no_value"))
        {
            return new JSONObject();
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s1);
        }
        catch (JSONException jsonexception)
        {
            s1 = Base64.a(s1.getBytes());
            try
            {
                s1 = new JSONObject(new String(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return new JSONObject();
            }
            return s1;
        }
        return jsonobject;
    }

    private void a(int i1, int j1)
    {
        ServerRequest serverrequest;
        if (i1 >= k.a())
        {
            serverrequest = k.a(k.a() - 1);
        } else
        {
            serverrequest = k.a(i1);
        }
        if (serverrequest != null)
        {
            serverrequest.a(j1);
        }
    }

    private void a(Application application)
    {
        try
        {
            t = new BranchActivityLifeCycleObserver((byte)0);
            application.unregisterActivityLifecycleCallbacks(t);
            application.registerActivityLifecycleCallbacks(t);
            v = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            v = false;
            u = false;
            Log.w("BranchSDK", (new BranchError("", -108)).a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            v = false;
        }
        u = false;
        Log.w("BranchSDK", (new BranchError("", -108)).a);
    }

    private void a(BranchReferralInitListener branchreferralinitlistener)
    {
        if ((PrefHelper.g() == null || PrefHelper.g().equalsIgnoreCase("bnc_no_value")) && (d.f() == null || d.f().equalsIgnoreCase("bnc_no_value")))
        {
            w = SESSION_STATE.c;
            if (branchreferralinitlistener != null)
            {
                branchreferralinitlistener.a(null, new BranchError("Trouble initializing Branch.", -1234));
            }
            Log.i("BranchSDK", "Branch Warning: Please enter your branch_key in your project's res/values/strings.xml!");
            return;
        }
        if (PrefHelper.g() != null && PrefHelper.g().startsWith("key_test_"))
        {
            Log.i("BranchSDK", "Branch Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        if (f())
        {
            a(((ServerRequest) (new ServerRequestRegisterOpen(f, branchreferralinitlistener, c.c()))), branchreferralinitlistener);
            return;
        } else
        {
            a(((ServerRequest) (new ServerRequestRegisterInstall(f, branchreferralinitlistener, c.c(), InstallListener.a()))), branchreferralinitlistener);
            return;
        }
    }

    static void a(Branch branch, int i1)
    {
        branch.a(0, i1);
    }

    static void a(Branch branch, ServerRequest serverrequest)
    {
        branch.a(serverrequest);
    }

    private void a(ServerRequest serverrequest)
    {
        if (w != SESSION_STATE.a && !serverrequest.d())
        {
            if (serverrequest instanceof ServerRequestLogout)
            {
                Log.i("BranchSDK", "Branch is not initialized, cannot logout");
                return;
            }
            if (serverrequest instanceof ServerRequestRegisterClose)
            {
                Log.i("BranchSDK", "Branch is not initialized, cannot close session");
                return;
            }
            a(((BranchReferralInitListener) (null)));
        }
        k.a(serverrequest);
        d();
    }

    private void a(ServerRequest serverrequest, BranchReferralInitListener branchreferralinitlistener)
    {
        if (!k.f())
        {
            if (l == 0)
            {
                k.a(serverrequest, 0);
            } else
            {
                k.a(serverrequest, 1);
            }
        } else
        {
            k.a(branchreferralinitlistener);
            k.b(serverrequest, l);
        }
        d();
    }

    private boolean a(BranchReferralInitListener branchreferralinitlistener, Activity activity)
    {
        PrefHelper.d("bnc_is_referrable", 1);
        y = activity;
        if (f() && e() && w == SESSION_STATE.a)
        {
            if (branchreferralinitlistener != null)
            {
                if (u)
                {
                    branchreferralinitlistener.a(c(), null);
                } else
                {
                    branchreferralinitlistener.a(new JSONObject(), null);
                }
            }
            if (h != null)
            {
                h.cancel();
                h.purge();
                h = new Timer();
            }
            i = true;
            synchronized (a)
            {
                if (g != null)
                {
                    g.cancel();
                    g.purge();
                    g = new Timer();
                }
                g.schedule(new _cls4(), 2000L);
            }
        } else
        if (w == SESSION_STATE.b)
        {
            k.a(branchreferralinitlistener);
        } else
        {
            w = SESSION_STATE.b;
            a(branchreferralinitlistener);
        }
        if (PrefHelper.u() && activity != null && n.get(System.identityHashCode(activity)) == null)
        {
            n.put(System.identityHashCode(activity), "init");
            branchreferralinitlistener = activity.getWindow().getDecorView().findViewById(0x1020002);
            if (branchreferralinitlistener != null)
            {
                branchreferralinitlistener.setOnTouchListener(o);
            }
        }
        return false;
        activity;
        branchreferralinitlistener;
        JVM INSTR monitorexit ;
        throw activity;
    }

    static boolean a(Branch branch, boolean flag)
    {
        branch.m = flag;
        return flag;
    }

    private static boolean a(JSONObject jsonobject, ActivityInfo activityinfo)
    {
        String as[] = null;
        if (!jsonobject.has(Defines.Jsonkey.Z.a())) goto _L2; else goto _L1
_L1:
        Object obj = jsonobject.getString(Defines.Jsonkey.Z.a());
_L7:
        if (activityinfo.metaData.getString("io.branch.sdk.auto_link_path") == null || obj == null) goto _L4; else goto _L3
_L3:
        int j1;
        int k1;
        jsonobject = activityinfo.metaData.getString("io.branch.sdk.auto_link_path").split(",");
        k1 = jsonobject.length;
        j1 = 0;
_L10:
        int i1;
        if (j1 >= k1) goto _L4; else goto _L5
_L2:
        obj = as;
        if (!jsonobject.has(Defines.Jsonkey.aa.a())) goto _L7; else goto _L6
_L6:
        obj = jsonobject.getString(Defines.Jsonkey.aa.a());
          goto _L7
_L5:
        activityinfo = jsonobject[j1].trim().split("\\?")[0].split("/");
        as = ((String) (obj)).split("\\?")[0].split("/");
        if (activityinfo.length != as.length)
        {
            i1 = 0;
            break MISSING_BLOCK_LABEL_122;
        }
        i1 = 0;
_L9:
label0:
        {
            if (i1 >= activityinfo.length || i1 >= as.length)
            {
                break MISSING_BLOCK_LABEL_236;
            }
            String s1 = activityinfo[i1];
            if (s1.equals(as[i1]) || s1.contains("*"))
            {
                break label0;
            }
            i1 = 0;
        }
          goto _L8
        i1++;
          goto _L9
_L8:
        if (i1 != 0)
        {
            return true;
        }
        j1++;
          goto _L10
_L4:
        return false;
        jsonobject;
        obj = as;
          goto _L7
        i1 = 1;
          goto _L8
    }

    static Handler b(Branch branch)
    {
        return branch.p;
    }

    public static Branch b(Context context)
    {
        return a(context, false);
    }

    public static JSONObject b()
    {
        return a(PrefHelper.n("bnc_install_params"));
    }

    static void b(Branch branch, Activity activity)
    {
        if (activity != null && branch.n.get(System.identityHashCode(activity)) == null)
        {
            branch.n.put(System.identityHashCode(activity), "init");
            activity.getWindow().setCallback(new BranchWindowCallback(branch, activity.getWindow().getCallback()));
        }
    }

    private static boolean b(Uri uri, Activity activity)
    {
        if (uri != null && uri.isHierarchical() && activity != null && uri.getQueryParameter(Defines.Jsonkey.e.a()) != null)
        {
            PrefHelper.h(uri.getQueryParameter(Defines.Jsonkey.e.a()));
            String s2 = (new StringBuilder("link_click_id=")).append(uri.getQueryParameter(Defines.Jsonkey.e.a())).toString();
            String s1 = activity.getIntent().getDataString();
            if (uri.getQuery().length() == s2.length())
            {
                uri = (new StringBuilder("\\?")).append(s2).toString();
            } else
            if (s1.length() - s2.length() == s1.indexOf(s2))
            {
                uri = (new StringBuilder("&")).append(s2).toString();
            } else
            {
                uri = (new StringBuilder()).append(s2).append("&").toString();
            }
            uri = Uri.parse(s1.replaceFirst(uri, ""));
            activity.getIntent().setData(uri);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean b(Branch branch, boolean flag)
    {
        branch.q = flag;
        return flag;
    }

    public static Branch c(Context context)
    {
        boolean flag = true;
        u = true;
        if (BranchUtil.a(context))
        {
            flag = false;
        }
        a(context, flag);
        b.a((Application)context);
        return b;
    }

    static SystemObserver c(Branch branch)
    {
        return branch.e;
    }

    public static JSONObject c()
    {
        return a(PrefHelper.n("bnc_session_params"));
    }

    static void c(Branch branch, Activity activity)
    {
        if (activity.getWindow().getCallback() instanceof BranchWindowCallback)
        {
            android.view.Window.Callback callback = BranchWindowCallback.a((BranchWindowCallback)activity.getWindow().getCallback());
            activity.getWindow().setCallback(callback);
            branch.n.remove(System.identityHashCode(activity));
            if (branch.p != null)
            {
                branch.p.removeCallbacksAndMessages(null);
            }
        }
    }

    static Context d(Branch branch)
    {
        return branch.f;
    }

    private void d()
    {
        boolean flag = true;
        j.acquire();
        if (l != 0 || k.a() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        l = 1;
        obj = k.c();
        j.release();
        if (!(obj instanceof ServerRequestRegisterInstall) && !f())
        {
            Log.i("BranchSDK", "Branch Error: User session has not been initialized!");
            l = 0;
            a(k.a() - 1, -101);
            return;
        }
        if (((ServerRequest) (obj)).d()) goto _L4; else goto _L3
_L3:
        if (!e()) goto _L6; else goto _L5
_L5:
        if (PrefHelper.h().equals("bnc_no_value"))
        {
            flag = false;
        }
          goto _L7
_L6:
        try
        {
            l = 0;
            a(k.a() - 1, -101);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        return;
_L4:
        (new BranchPostTask(((ServerRequest) (obj)))).execute(new Void[0]);
        return;
_L2:
        j.release();
        return;
_L7:
        if (flag) goto _L4; else goto _L6
    }

    private static boolean e()
    {
        return !PrefHelper.i().equals("bnc_no_value");
    }

    static boolean e(Branch branch)
    {
        branch.i = false;
        return false;
    }

    static ShareLinkManager f(Branch branch)
    {
        return branch.x;
    }

    private static boolean f()
    {
        return !PrefHelper.j().equals("bnc_no_value");
    }

    static void g(Branch branch)
    {
        int i1 = 7;
        if (branch.w == SESSION_STATE.c) goto _L2; else goto _L1
_L1:
        if (branch.m) goto _L4; else goto _L3
_L3:
        ServerRequest serverrequest = branch.k.c();
        if (serverrequest != null && (serverrequest instanceof ServerRequestRegisterInstall) || (serverrequest instanceof ServerRequestRegisterOpen))
        {
            branch.k.b();
        }
_L6:
        branch.w = SESSION_STATE.c;
_L2:
        if (PrefHelper.t() && branch.s == null)
        {
            ScheduledThreadPoolExecutor scheduledthreadpoolexecutor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
            _cls3 _lcls3 = new _cls3(branch);
            Date date = new Date();
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(date);
            int j1 = 7 - calendar.get(7);
            int k1 = 2 - calendar.get(11);
            if (j1 != 0 || k1 >= 0)
            {
                i1 = j1;
            }
            branch.s = scheduledthreadpoolexecutor.scheduleAtFixedRate(_lcls3, (i1 * 24 + k1) * 60 * 60, 0x93a80L, TimeUnit.SECONDS);
        }
        return;
_L4:
        if (!branch.k.e())
        {
            branch.a(new ServerRequestRegisterClose(branch.f));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Activity h(Branch branch)
    {
        return branch.y;
    }

    static BranchRemoteInterface i(Branch branch)
    {
        return branch.c;
    }

    static ServerRequestQueue j(Branch branch)
    {
        return branch.k;
    }

    static int k(Branch branch)
    {
        branch.l = 0;
        return 0;
    }

    static Map l(Branch branch)
    {
        return branch.r;
    }

    static void m(Branch branch)
    {
        int i1 = 0;
_L8:
        if (i1 >= branch.k.a()) goto _L2; else goto _L1
_L1:
        ServerRequest serverrequest;
        Iterator iterator;
        serverrequest = branch.k.a(i1);
        if (serverrequest.g() == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        iterator = serverrequest.g().keys();
_L5:
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s1 = (String)iterator.next();
        if (!s1.equals(Defines.Jsonkey.d.a())) goto _L4; else goto _L3
_L3:
        serverrequest.g().put(s1, PrefHelper.i());
          goto _L5
        branch;
        branch.printStackTrace();
_L2:
        return;
_L4:
        if (!s1.equals(Defines.Jsonkey.a.a())) goto _L5; else goto _L6
_L6:
        serverrequest.g().put(s1, PrefHelper.j());
          goto _L5
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void n(Branch branch)
    {
        String s1;
        Object obj;
        JSONObject jsonobject;
        jsonobject = c();
        obj = null;
        s1 = ((String) (obj));
        if (!jsonobject.has(Defines.Jsonkey.X.a()))
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s1 = ((String) (obj));
        if (!jsonobject.getBoolean(Defines.Jsonkey.X.a()))
        {
            return;
        }
        s1 = ((String) (obj));
        if (jsonobject.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s1 = ((String) (obj));
        Object obj1 = branch.f.getPackageManager().getApplicationInfo(branch.f.getPackageName(), 128);
        s1 = ((String) (obj));
        if (((ApplicationInfo) (obj1)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s1 = ((String) (obj));
        if (((ApplicationInfo) (obj1)).metaData.getBoolean("io.branch.sdk.auto_link_disable", false))
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s1 = ((String) (obj));
        ActivityInfo aactivityinfo[] = branch.f.getPackageManager().getPackageInfo(branch.f.getPackageName(), 129).activities;
        if (aactivityinfo == null) goto _L2; else goto _L1
_L1:
        s1 = ((String) (obj));
        int k1 = aactivityinfo.length;
        int i1 = 0;
_L19:
        if (i1 >= k1) goto _L2; else goto _L3
_L3:
        obj1 = aactivityinfo[i1];
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        s1 = ((String) (obj));
        if (((ActivityInfo) (obj1)).metaData == null) goto _L5; else goto _L6
_L6:
        s1 = ((String) (obj));
        if (((ActivityInfo) (obj1)).metaData.getString("io.branch.sdk.auto_link_keys") != null) goto _L8; else goto _L7
_L7:
        s1 = ((String) (obj));
        if (((ActivityInfo) (obj1)).metaData.getString("io.branch.sdk.auto_link_path") == null) goto _L5; else goto _L8
_L8:
        s1 = ((String) (obj));
        if (((ActivityInfo) (obj1)).metaData.getString("io.branch.sdk.auto_link_keys") == null) goto _L10; else goto _L9
_L9:
        s1 = ((String) (obj));
        String as[] = ((ActivityInfo) (obj1)).metaData.getString("io.branch.sdk.auto_link_keys").split(",");
        s1 = ((String) (obj));
        int l1 = as.length;
        int j1 = 0;
_L17:
        if (j1 >= l1) goto _L10; else goto _L11
_L11:
        s1 = ((String) (obj));
        if (!jsonobject.has(as[j1])) goto _L13; else goto _L12
_L12:
        j1 = 1;
_L18:
        if (j1 != 0) goto _L15; else goto _L14
_L14:
        s1 = ((String) (obj));
        if (!a(jsonobject, ((ActivityInfo) (obj1)))) goto _L5; else goto _L15
_L15:
        s1 = ((String) (obj));
        obj = ((ActivityInfo) (obj1)).name;
        s1 = ((String) (obj));
        i1 = ((ActivityInfo) (obj1)).metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
        s1 = ((String) (obj));
_L21:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        if (branch.y == null)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        obj = new Intent(branch.y, Class.forName(s1));
        ((Intent) (obj)).putExtra("io.branch.sdk.auto_linked", "true");
        ((Intent) (obj)).putExtra(Defines.Jsonkey.x.a(), jsonobject.toString());
        String s2;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((Intent) (obj)).putExtra(s2, jsonobject.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

          goto _L16
_L13:
        j1++;
          goto _L17
_L10:
        j1 = 0;
          goto _L18
_L5:
        i1++;
          goto _L19
_L16:
        try
        {
            branch.y.startActivityForResult(((Intent) (obj)), i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Branch branch)
        {
            Log.i("BranchSDK", "Branch Warning: Please make sure Activity names set for auto deep link are correct!");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Branch branch) { }
        // Misplaced declaration of an exception variable
        catch (Branch branch)
        {
            return;
        }
_L20:
        Log.i("BranchSDK", (new StringBuilder("Branch Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity ")).append(s1).toString());
        return;
        branch;
        if (true) goto _L20; else goto _L2
_L2:
        i1 = 0;
        s1 = null;
          goto _L21
          goto _L18
    }

    static boolean o(Branch branch)
    {
        return branch.m;
    }

    static SESSION_STATE p(Branch branch)
    {
        return branch.w;
    }

    static void q(Branch branch)
    {
        branch.d();
    }

    static boolean r(Branch branch)
    {
        return branch.q;
    }

    public final boolean a(Uri uri, Activity activity)
    {
        boolean flag = b(uri, activity);
        a(((BranchReferralInitListener) (null)), activity);
        return flag;
    }

    public final boolean a(BranchReferralInitListener branchreferralinitlistener, Uri uri, Activity activity)
    {
        boolean flag = b(uri, activity);
        a(branchreferralinitlistener, activity);
        return flag;
    }


    /* member class not found */
    class SESSION_STATE {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class BranchActivityLifeCycleObserver {}


    /* member class not found */
    class BranchReferralInitListener {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class BranchWindowCallback {}


    /* member class not found */
    class BranchPostTask {}


    /* member class not found */
    class _cls3 {}

}
