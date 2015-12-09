// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.protocol.enums.MessageType;
import com.ford.syncV4.proxy.rpc.enums.ButtonName;
import com.ford.syncV4.proxy.rpc.enums.DriverDistractionState;
import com.ford.syncV4.proxy.rpc.enums.FileType;
import com.ford.syncV4.proxy.rpc.enums.HMILevel;
import com.ford.syncV4.proxy.rpc.enums.Language;
import com.ford.syncV4.proxy.rpc.enums.RequestType;
import com.ford.syncV4.proxy.rpc.enums.Result;
import com.ford.syncV4.proxy.rpc.enums.SyncConnectionState;
import com.ford.syncV4.proxy.rpc.enums.SyncDisconnectedReason;
import com.ford.syncV4.proxy.rpc.enums.SyncInterfaceAvailability;
import com.ford.syncV4.proxy.rpc.enums.TextAlignment;
import com.ford.syncV4.proxy.rpc.enums.UpdateMode;
import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class atp
{

    private static Object G = new Object();
    private static final Object m = new Object();
    private static final Object n = new Object();
    private static final Object o = new Object();
    private static final Object p = new Object();
    private Vector A;
    private axl B;
    private Boolean C;
    private Boolean D;
    private String E;
    private atq F;
    private boolean H;
    atw a;
    Boolean b;
    Handler c;
    protected Boolean d;
    protected Boolean e;
    protected Boolean f;
    protected awq g;
    protected Language h;
    protected auo i;
    protected awy j;
    protected byte k;
    private axc l;
    private Object q;
    private asr r;
    private asr s;
    private asr t;
    private String u;
    private Vector v;
    private Boolean w;
    private Language x;
    private Language y;
    private String z;

    protected atp(atw atw1, String s1, Vector vector, Vector vector1, Boolean boolean1, Language language, Language language1, 
            String s2, axl axl1)
    {
        l = null;
        a = null;
        q = new Object();
        b = Boolean.valueOf(false);
        c = null;
        d = Boolean.valueOf(false);
        u = null;
        System.currentTimeMillis();
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        e = Boolean.valueOf(false);
        C = Boolean.valueOf(false);
        f = Boolean.valueOf(false);
        g = null;
        h = null;
        i = null;
        j = null;
        D = Boolean.valueOf(true);
        E = null;
        k = 1;
        F = null;
        H = false;
        Boolean boolean2 = Boolean.valueOf(false);
        k = 1;
        if (boolean2 != null && boolean2.booleanValue())
        {
            e = boolean2;
            C = boolean2;
        }
        F = new atq(this, (byte)0);
        b = Boolean.valueOf(false);
        if (b.booleanValue())
        {
            c = new Handler(Looper.getMainLooper());
        }
        d = Boolean.valueOf(true);
        u = s1;
        v = vector;
        w = boolean1;
        A = vector1;
        x = language;
        y = language1;
        z = s2;
        B = axl1;
        if (atw1 == null)
        {
            throw new IllegalArgumentException("IProxyListener listener must be provided to instantiate SyncProxy object.");
        }
        if (d.booleanValue() && w == null)
        {
            throw new IllegalArgumentException("isMediaApp must not be null when using SyncProxyALM.");
        }
        a = atw1;
        synchronized (p)
        {
            if (t != null)
            {
                t.a();
                t = null;
            }
            t = new asr("INTERNAL_MESSAGE_DISPATCHER", new asp(), new asn() {

                private atp a;

                public final void a(Object obj)
                {
                    Object obj1;
                    obj1 = (ats)obj;
                    obj = a;
                    if (!((ats) (obj1)).a.equals("OnProxyError")) goto _L2; else goto _L1
_L1:
                    if (((atp) (obj)).b.booleanValue())
                    {
                        ((atp) (obj)).c.post(((_cls34) (obj)). new Runnable() {

                            private atp a;

                            public final void run()
                            {
                                atp.h(a);
                            }

            
            {
                a = atp.this;
                super();
            }
                        });
                    }
_L3:
                    axg.a((new StringBuilder("Proxy fired callback: ")).append(((ats) (obj1)).a).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
                    return;
_L2:
                    final class _cls62
                        implements Runnable
                    {

                        private atp a;

                        public final void run()
                        {
                            atp.h(a);
                        }

            
            {
                a = atp.this;
                super();
            }
                    }

label0:
                    {
                        if (!((ats) (obj1)).a.equals("OnProxyOpened"))
                        {
                            break label0;
                        }
                        if (((atp) (obj)).b.booleanValue())
                        {
                            ((atp) (obj)).c.post(((_cls45) (obj)). new Runnable() {

                                private atp a;

                                public final void run()
                                {
                                    atp.h(a);
                                }

            
            {
                a = atp.this;
                super();
            }
                            });
                        }
                    }
                      goto _L3
                    atu atu1;
label1:
                    {
                        if (!((ats) (obj1)).a.equals("OnProxyClosed"))
                        {
                            break MISSING_BLOCK_LABEL_211;
                        }
                        atu1 = (atu)obj1;
                        if (!((atp) (obj)).b.booleanValue())
                        {
                            break label1;
                        }
                        ((atp) (obj)).c.post(((_cls56) (obj)). new Runnable(atu1) {

                            private atu a;
                            private atp b;

                            public final void run()
                            {
                                atp.h(b).a(a.b);
                            }

            
            {
                b = atp.this;
                a = atu1;
                super();
            }
                        });
                    }
                      goto _L3
                    try
                    {
                        ((atp) (obj)).a.a(atu1.b);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        axt.a("Error handing proxy event.", ((Throwable) (obj1)));
                        if (((atp) (obj)).b.booleanValue())
                        {
                            ((atp) (obj)).c.post(((_cls62) (obj)). new _cls62());
                            return;
                        } else
                        {
                            return;
                        }
                    }
                      goto _L3
                    axg.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.", "42baba60-eb57-11df-98cf-0800200c9a66");
                    axt.a("Unknown RPC Message encountered. Check for an updated version of the SYNC Proxy.");
                      goto _L3
                }

                public final void a(String s3, Exception exception)
                {
                    atp.a(a, s3, exception);
                }

                public final void b(String s3, Exception exception)
                {
                    atp.a(a, s3, exception);
                }

            
            {
                a = atp.this;
                super();
            }
            });
        }
        synchronized (n)
        {
            if (r != null)
            {
                r.a();
                r = null;
            }
            r = new asr("INCOMING_MESSAGE_DISPATCHER", new aso(), new asn() {

                private atp a;

                public final void a(Object obj)
                {
                    obj = (asw)obj;
                    atp.b(a, ((asw) (obj)));
                }

                public final void a(String s3, Exception exception)
                {
                    atp.f(a);
                }

                public final void b(String s3, Exception exception)
                {
                    atp.f(a);
                }

            
            {
                a = atp.this;
                super();
            }
            });
        }
        synchronized (o)
        {
            if (s != null)
            {
                s.a();
                s = null;
            }
            s = new asr("OUTGOING_MESSAGE_DISPATCHER", new asq(), new asn() {

                private atp a;

                public final void a(Object obj)
                {
                    obj = (asw)obj;
                    atp.c(a, ((asw) (obj)));
                }

                public final void a(String s3, Exception exception)
                {
                    atp.g(a);
                }

                public final void b(String s3, Exception exception)
                {
                    atp.g(a);
                }

            
            {
                a = atp.this;
                super();
            }
            });
        }
        try
        {
            b();
        }
        // Misplaced declaration of an exception variable
        catch (atw atw1)
        {
            if (t != null)
            {
                t.a();
                t = null;
            }
            if (r != null)
            {
                r.a();
                r = null;
            }
            if (s != null)
            {
                s.a();
                s = null;
            }
            throw atw1;
        }
        axg.a((new StringBuilder("SyncProxy Created, instanceID=")).append(toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        s1;
        atw1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        atw1;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        atw1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private Intent a()
    {
        Intent intent = new Intent();
        intent.setAction("com.ford.syncV4.broadcast");
        intent.putExtra("APP_NAME", u);
        intent.putExtra("APP_ID", z);
        intent.putExtra("RPC_NAME", "");
        intent.putExtra("TYPE", "");
        intent.putExtra("SUCCESS", true);
        intent.putExtra("CORRID", 0);
        intent.putExtra("FUNCTION_NAME", "");
        intent.putExtra("COMMENT1", "");
        intent.putExtra("COMMENT2", "");
        intent.putExtra("COMMENT3", "");
        intent.putExtra("COMMENT4", "");
        intent.putExtra("COMMENT5", "");
        intent.putExtra("COMMENT6", "");
        intent.putExtra("COMMENT7", "");
        intent.putExtra("COMMENT8", "");
        intent.putExtra("COMMENT9", "");
        intent.putExtra("COMMENT10", "");
        intent.putExtra("DATA", "");
        intent.putExtra("SHOW_ON_UI", true);
        return intent;
    }

    static Intent a(atp atp1)
    {
        return atp1.a();
    }

    public static aue a(Integer integer, String s1, Vector vector)
    {
        aue aue1 = new aue();
        if (integer != null)
        {
            aue1.e.put("choiceID", integer);
        }
        if (s1 != null)
        {
            aue1.e.put("menuName", s1);
        }
        if (vector != null)
        {
            aue1.e.put("vrCommands", vector);
        }
        return aue1;
    }

    private String a(ati ati1)
    {
        try
        {
            ati1 = ati1.a(k).toString(2);
        }
        // Misplaced declaration of an exception variable
        catch (ati ati1)
        {
            axt.a("Error handing proxy event.", ati1);
            c();
            return null;
        }
        return ati1;
    }

    private static HttpURLConnection a(aut aut1, String s1, int i1, int j1)
    {
        String s2 = "utf-8";
        String s3;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (aut1 != null)
        {
            s3 = (String)aut1.e.get("ContentType");
            i1 = ((Integer)aut1.e.get("ConnectTimeout")).intValue();
            flag3 = ((Boolean)aut1.e.get("DoOutput")).booleanValue();
            flag = ((Boolean)aut1.e.get("DoInput")).booleanValue();
            boolean flag4 = ((Boolean)aut1.e.get("UseCaches")).booleanValue();
            s2 = (String)aut1.e.get("RequestMethod");
            k1 = ((Integer)aut1.e.get("ReadTimeout")).intValue();
            flag1 = ((Boolean)aut1.e.get("InstanceFollowRedirects")).booleanValue();
            String s4 = (String)aut1.e.get("charset");
            j1 = ((Integer)aut1.e.get("Content-Length")).intValue();
            k1 *= 1000;
            i1 *= 1000;
            flag2 = flag;
            flag = flag4;
            aut1 = s4;
        } else
        {
            k1 = i1 * 1000;
            s3 = "application/json";
            int l1 = i1 * 1000;
            flag2 = true;
            flag3 = true;
            flag = false;
            String s5 = "POST";
            flag1 = false;
            aut1 = s2;
            s2 = s5;
            i1 = k1;
            k1 = l1;
        }
        try
        {
            s1 = (HttpURLConnection)(new URL(s1)).openConnection();
            s1.setConnectTimeout(i1);
            s1.setDoOutput(flag3);
            s1.setDoInput(flag2);
            s1.setRequestMethod(s2);
            s1.setReadTimeout(k1);
            s1.setInstanceFollowRedirects(flag1);
            s1.setRequestProperty("Content-Type", s3);
            s1.setRequestProperty("charset", aut1);
            s1.setRequestProperty("Content-Length", (new StringBuilder()).append(Integer.toString(j1)).toString());
            s1.setUseCaches(flag);
        }
        // Misplaced declaration of an exception variable
        catch (aut aut1)
        {
            return null;
        }
        finally
        {
            throw aut1;
        }
        return s1;
    }

    private void a(Intent intent)
    {
        if (a != null && (a instanceof Service))
        {
            Context context = ((Service)a).getApplicationContext();
            if (context != null)
            {
                context.sendBroadcast(intent);
            }
        }
    }

    static void a(Intent intent, String s1, String s2)
    {
        b(intent, s1, s2);
    }

    static void a(atp atp1, byte byte0)
    {
        atp1.k = byte0;
    }

    static void a(atp atp1, Intent intent)
    {
        atp1.a(intent);
    }

    static void a(atp atp1, asw asw1)
    {
        synchronized (n)
        {
            if (atp1.r != null)
            {
                atp1.r.a(asw1);
            }
        }
        return;
        atp1;
        obj;
        JVM INSTR monitorexit ;
        throw atp1;
    }

    static void a(atp atp1, avj avj1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = avj1.f();
        obj1 = avj1.b.get("timeout");
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = avj1.b.get("Timeout");
        if (obj == null) goto _L3; else goto _L2
_L2:
        if (!(obj instanceof Integer)) goto _L3; else goto _L4
_L4:
        obj = (Integer)obj;
_L13:
        Object obj4;
        if (obj == null)
        {
            obj = Integer.valueOf(2000);
        }
        obj4 = avj1.d();
        obj1 = avj1.c();
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        if (!(avj1.b.get("data") instanceof Vector)) goto _L8; else goto _L7
_L7:
        avj1 = (Vector)avj1.b.get("data");
        if (avj1 == null) goto _L8; else goto _L9
_L9:
        if (avj1.size() <= 0 || !(avj1.get(0) instanceof String)) goto _L8; else goto _L10
_L10:
        avj1 = new JSONArray(avj1);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("data", avj1);
        obj1 = ((JSONObject) (obj1)).toString().replace("\\", "");
        boolean flag = true;
_L14:
        obj = a(((aut) (obj4)), ((String) (obj3)), ((Integer) (obj)).intValue(), ((String) (obj1)).getBytes("UTF-8").length);
        if (obj != null) goto _L12; else goto _L11
_L11:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
_L15:
        return;
_L3:
        obj = null;
          goto _L13
_L8:
        avj1 = null;
          goto _L10
_L6:
        obj1 = ((String) (obj1)).replace("\\", "");
        flag = false;
          goto _L14
_L12:
        avj1 = ((avj) (obj));
        obj3 = new DataOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        avj1 = ((avj) (obj));
        ((DataOutputStream) (obj3)).writeBytes(((String) (obj1)));
        avj1 = ((avj) (obj));
        ((DataOutputStream) (obj3)).flush();
        avj1 = ((avj) (obj));
        ((DataOutputStream) (obj3)).close();
        avj1 = ((avj) (obj));
        System.currentTimeMillis();
        avj1 = ((avj) (obj));
        ((HttpURLConnection) (obj)).getResponseMessage();
        avj1 = ((avj) (obj));
        System.currentTimeMillis();
        avj1 = ((avj) (obj));
        int i1 = ((HttpURLConnection) (obj)).getResponseCode();
label0:
        {
            if (i1 == 200)
            {
                break label0;
            }
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
                return;
            }
        }
          goto _L15
        avj1 = ((avj) (obj));
        obj3 = new BufferedReader(new InputStreamReader(((HttpURLConnection) (obj)).getInputStream()));
        avj1 = ((avj) (obj));
        obj1 = new StringBuffer();
_L17:
        avj1 = ((avj) (obj));
        obj4 = ((BufferedReader) (obj3)).readLine();
        if (obj4 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        avj1 = ((avj) (obj));
        ((StringBuffer) (obj1)).append(((String) (obj4)));
        avj1 = ((avj) (obj));
        ((StringBuffer) (obj1)).append('\r');
        if (true) goto _L17; else goto _L16
        atp1;
_L41:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: Could not get data from JSONObject received.", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
_L16:
        avj1 = ((avj) (obj));
        ((BufferedReader) (obj3)).close();
        avj1 = ((avj) (obj));
        obj3 = new Vector();
        avj1 = ((avj) (obj));
        obj4 = new JSONObject(((StringBuffer) (obj1)).toString());
        avj1 = ((avj) (obj));
        if (!(((JSONObject) (obj4)).get("data") instanceof JSONArray)) goto _L19; else goto _L18
_L18:
        avj1 = ((avj) (obj));
        obj4 = ((JSONObject) (obj4)).getJSONArray("data");
        i1 = 0;
_L42:
        avj1 = ((avj) (obj));
        if (i1 >= ((JSONArray) (obj4)).length()) goto _L21; else goto _L20
_L20:
        avj1 = ((avj) (obj));
        if (!(((JSONArray) (obj4)).get(i1) instanceof String))
        {
            break MISSING_BLOCK_LABEL_962;
        }
        avj1 = ((avj) (obj));
        ((Vector) (obj3)).add(((JSONArray) (obj4)).getString(i1));
        break MISSING_BLOCK_LABEL_962;
_L19:
        avj1 = ((avj) (obj));
        if (!(((JSONObject) (obj4)).get("data") instanceof String)) goto _L23; else goto _L22
_L22:
        avj1 = ((avj) (obj));
        ((Vector) (obj3)).add(((JSONObject) (obj4)).getString("data"));
_L21:
        avj1 = ((avj) (obj));
        obj4 = ((Vector) (obj3)).toString();
        avj1 = ((avj) (obj));
        if (((String) (obj4)).length() <= 512)
        {
            break MISSING_BLOCK_LABEL_576;
        }
        avj1 = ((avj) (obj));
        ((String) (obj4)).substring(0, 511);
        if (!flag) goto _L25; else goto _L24
_L24:
        avj1 = ((avj) (obj));
        obj1 = new awr((byte)0);
        avj1 = ((avj) (obj));
        ((awr) (obj1)).a(Integer.valueOf(65535));
        avj1 = ((avj) (obj));
        ((awr) (obj1)).b.put("data", obj3);
_L30:
        avj1 = ((avj) (obj));
        if (atp1.l != null) goto _L27; else goto _L26
_L26:
        avj1 = ((avj) (obj));
        obj2 = Boolean.valueOf(false);
_L31:
        avj1 = ((avj) (obj));
        if (!((Boolean) (obj2)).booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        avj1 = ((avj) (obj));
        atp1.b(((atk) (obj1)));
        avj1 = ((avj) (obj));
        Log.i("sendOnSystemRequestToUrl", "sent to sync");
        if (obj == null) goto _L15; else goto _L28
_L28:
        ((HttpURLConnection) (obj)).disconnect();
        return;
_L23:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: Data in JSON Object neither an array nor a string.");
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
_L25:
        avj1 = ((avj) (obj));
        obj3 = ((StringBuffer) (obj1)).toString();
        obj1 = obj2;
        if (obj3 == null) goto _L30; else goto _L29
_L29:
        avj1 = ((avj) (obj));
        obj1 = new awr();
        avj1 = ((avj) (obj));
        obj2 = RequestType.a;
        avj1 = ((avj) (obj));
        ((awr) (obj1)).b.put("requestType", obj2);
        avj1 = ((avj) (obj));
        ((awr) (obj1)).a(Integer.valueOf(65535));
        avj1 = ((avj) (obj));
        ((awr) (obj1)).a(((String) (obj3)).getBytes());
          goto _L30
        atp1;
_L40:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: JSONException: ", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
_L27:
        avj1 = ((avj) (obj));
        boolean flag1 = atp1.l.d();
        obj2 = Boolean.valueOf(flag1);
          goto _L31
        atp1;
        obj = null;
_L39:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: Could not encode string.", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
        atp1;
        obj = null;
_L38:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: Could not set request method to post.", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
        atp1;
        obj = null;
_L37:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: URL Exception when sending SystemRequest to an external server.", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
        atp1;
        obj = null;
_L36:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: IOException: ", atp1);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
            return;
        }
          goto _L15
        atp1;
        obj = null;
_L35:
        avj1 = ((avj) (obj));
        axt.a("sendOnSystemRequestToUrl: Unexpected Exception: ", atp1);
        if (obj == null) goto _L15; else goto _L32
_L32:
        ((HttpURLConnection) (obj)).disconnect();
        return;
        atp1;
        avj1 = null;
_L34:
        if (avj1 != null)
        {
            avj1.disconnect();
        }
        throw atp1;
        atp1;
        if (true) goto _L34; else goto _L33
_L33:
        atp1;
          goto _L35
        atp1;
          goto _L36
        atp1;
          goto _L37
        atp1;
          goto _L38
        atp1;
          goto _L39
        atp1;
        obj = null;
          goto _L40
        atp1;
        obj = null;
          goto _L41
        i1++;
          goto _L42
    }

    static void a(atp atp1, String s1, Exception exception)
    {
        axt.a(s1, exception);
        axt.a("InternalMessageDispatcher failed.", exception);
        s1 = SyncDisconnectedReason.i;
        atp1.a(exception);
    }

    private void a(ats ats1)
    {
        synchronized (p)
        {
            if (t != null)
            {
                t.a(ats1);
            }
        }
        return;
        ats1;
        obj;
        JVM INSTR monitorexit ;
        throw ats1;
    }

    static axl b(atp atp1)
    {
        return atp1.B;
    }

    private void b()
    {
        Object obj3;
        axc axc1;
        SyncInterfaceAvailability syncinterfaceavailability;
        axa axa1;
        if (C.booleanValue())
        {
            e = Boolean.valueOf(true);
        } else
        {
            e = Boolean.valueOf(false);
        }
        syncinterfaceavailability = SyncInterfaceAvailability.a;
        synchronized (m)
        {
            l = axc.a(F, B);
        }
        obj3 = m;
        obj3;
        JVM INSTR monitorenter ;
        axc1 = l;
        if (!axc1.d.b()) goto _L2; else goto _L1
_L1:
        axa1 = axc.a(axc1.d);
        obj = axa1;
        if (axa1 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        obj = new axa(axc1.d);
        axc.a.add(obj);
_L7:
        axc1.b = ((axa) (obj));
        synchronized (((axa) (obj)).f)
        {
            if (!((axa) (obj)).g.contains(axc1))
            {
                ((axa) (obj)).g.add(axc1);
            }
        }
        if (((axa) (obj)).a().booleanValue()) goto _L4; else goto _L3
_L3:
        ((axa) (obj)).a.a();
_L8:
        if (l != null && B != null) goto _L6; else goto _L5
_L5:
        obj3;
        JVM INSTR monitorexit ;
        return;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L2:
        obj = new axa(axc1.d);
          goto _L7
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        ((axa) (obj)).b();
          goto _L8
_L6:
        Object obj1;
        axl axl1;
        obj1 = l;
        axl1 = B;
        if (!axl1.b()) goto _L10; else goto _L9
_L9:
        obj1 = axc.a(axl1);
_L13:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        if (((axa) (obj1)).a == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        obj1 = ((axa) (obj1)).a.d();
_L14:
        if (obj1 == null) goto _L5; else goto _L11
_L11:
        if (((String) (obj1)).equals("")) goto _L5; else goto _L12
_L12:
        Intent intent = a();
        b(intent, "FUNCTION_NAME", "initializeProxy");
        b(intent, "COMMENT1", ((String) (obj1)));
        a(intent);
          goto _L5
_L10:
        obj1 = ((axc) (obj1)).b;
          goto _L13
        obj1 = "";
          goto _L14
    }

    private static void b(Intent intent, String s1, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "";
        }
        intent.putExtra(s1, s3);
    }

    private void b(atk atk1)
    {
        Object obj;
        try
        {
            axg.a(InterfaceActivityDirection.a, atk1, "42baba60-eb57-11df-98cf-0800200c9a66");
            byte abyte0[] = asm.a(atk1, k);
            obj = new asw();
            ((asw) (obj)).a(abyte0);
            if (l != null)
            {
                obj.c = l.c;
            }
            MessageType messagetype = MessageType.c;
            obj.b = atc.b;
            obj.e = atb.a(atk1.a());
            if (atk1.c() == null)
            {
                throw new SyncException((new StringBuilder("CorrelationID cannot be null. RPC: ")).append(atk1.a()).toString(), SyncExceptionCause.f);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            axg.a((new StringBuilder("OutOfMemory exception while sending request ")).append(atk1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new SyncException((new StringBuilder("OutOfMemory exception while sending request ")).append(atk1.a()).toString(), ((Throwable) (obj)), SyncExceptionCause.f);
        }
        obj.f = atk1.c().intValue();
        if (((atn) (atk1)).d != null)
        {
            ((asw) (obj)).b(((atn) (atk1)).d);
        }
        synchronized (o)
        {
            if (s != null)
            {
                s.a(obj);
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(atp atp1, asw asw1)
    {
        boolean flag = true;
        boolean flag1 = asw1.b.a(atc.b);
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (atp1.k == 1 && asw1.a > 1)
        {
            atp1.k = asw1.a;
        }
        obj1 = new Hashtable();
        if (atp1.k <= 1) goto _L4; else goto _L3
_L3:
        String s1;
        obj = new Hashtable();
        ((Hashtable) (obj)).put("correlationID", Integer.valueOf(asw1.f));
        if (asw1.g > 0)
        {
            ((Hashtable) (obj)).put("parameters", asm.a(asw1.h));
        }
        new atb();
        s1 = atb.a(asw1.e);
        if (s1 == null) goto _L6; else goto _L5
_L5:
        ((Hashtable) (obj)).put("name", s1);
        if (asw1.d != 0) goto _L8; else goto _L7
_L7:
        ((Hashtable) (obj1)).put("request", obj);
_L33:
        obj = obj1;
        if (asw1.i == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        ((Hashtable) (obj1)).put("bulkData", asw1.i);
        obj = obj1;
_L17:
        obj1 = new ati(((Hashtable) (obj)));
        asw1 = ((ati) (obj1)).a();
        s1 = ((ati) (obj1)).b();
        if (!s1.equals("response")) goto _L10; else goto _L9
_L9:
        axg.a(InterfaceActivityDirection.b, new atm(((ati) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
        if (!b((new atm(((Hashtable) (obj)))).c())) goto _L12; else goto _L11
_L11:
        if ((new atm(((Hashtable) (obj)))).c().intValue() != 65529 || !atp1.d.booleanValue() || !asw1.equals("RegisterAppInterface")) goto _L14; else goto _L13
_L13:
        asw1 = new avv(((Hashtable) (obj)));
        if (asw1.d().booleanValue())
        {
            atp1.e = Boolean.valueOf(true);
        }
        obj = atp1.a();
        b(((Intent) (obj)), "RPC_NAME", "RegisterAppInterface");
        b(((Intent) (obj)), "TYPE", "response");
        ((Intent) (obj)).putExtra("SUCCESS", asw1.d().booleanValue());
        b(((Intent) (obj)), "COMMENT1", asw1.f());
        b(((Intent) (obj)), "COMMENT2", asw1.e().toString());
        b(((Intent) (obj)), "DATA", atp1.a(asw1));
        ((Intent) (obj)).putExtra("CORRID", asw1.c().intValue());
        atp1.a(((Intent) (obj)));
        asw1.l();
        atp1.i = asw1.k();
        asw1.m();
        asw1.n();
        asw1.o();
        asw1.p();
        asw1.q();
        atp1.h = asw1.i();
        asw1.j();
        atp1.g = asw1.h();
        asw1.r();
        atp1.j = asw1.s();
        atp1.E = "2.3";
        asw1.t();
        obj = (new StringBuilder("SYNC Proxy Version: ")).append(atp1.E).toString();
        if (axt.c()) goto _L16; else goto _L15
_L15:
        axt.a();
        axt.d(((String) (obj)));
        axt.b();
_L18:
        obj1 = atp1.a();
        b(((Intent) (obj1)), "FUNCTION_NAME", "RAI_RESPONSE");
        b(((Intent) (obj1)), "COMMENT1", ((String) (obj)));
        atp1.a(((Intent) (obj1)));
        obj = SyncConnectionState.a;
        if (!asw1.d().booleanValue())
        {
            asw1 = new SyncException((new StringBuilder("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ")).append(asw1.e()).toString(), SyncExceptionCause.l);
            obj = SyncDisconnectedReason.g;
            atp1.a(asw1);
        }
        if (atp1.b.booleanValue())
        {
            atp1.c.post(atp1. new Runnable() {

                private atp a;

                public final void run()
                {
                    if (atp.h(a) instanceof atg)
                    {
                        atp.h(a);
                        return;
                    } else
                    {
                        atp.h(a);
                        return;
                    }
                }

            
            {
                a = atp.this;
                super();
            }
            });
            return;
        }
          goto _L2
_L6:
        try
        {
            axt.b((new StringBuilder("Dispatch Incoming Message - function name is null unknown RPC.  FunctionID: ")).append(asw1.e).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (asw asw1) { }
        try
        {
            axt.a((new StringBuilder("Failure handling protocol message: ")).append(asw1.toString()).toString(), asw1);
            atp1.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (asw asw1)
        {
            axt.a("Error handing proxy event.", asw1);
        }
        atp1.c();
        return;
_L8:
        if (asw1.d == 1)
        {
            ((Hashtable) (obj1)).put("response", obj);
            continue; /* Loop/switch isn't completed */
        }
        if (asw1.d == 2)
        {
            ((Hashtable) (obj1)).put("notification", obj);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = asm.a(asw1.h);
          goto _L17
_L16:
        axt.d(((String) (obj)));
          goto _L18
_L14:
        if ((new atm(((Hashtable) (obj)))).c().intValue() != 65535 || !asw1.equals("OnEncodedSyncPData")) goto _L20; else goto _L19
_L19:
        asw1 = new avj(((Hashtable) (obj)));
        if (asw1.f() != null)
        {
            (atp1. new Thread(asw1) {

                private avj a;
                private atp b;

                public final void run()
                {
                    atp.a(b, a);
                }

            
            {
                b = atp.this;
                a = avj1;
                super();
            }
            }).start();
            return;
        }
          goto _L2
_L20:
        if ((new atm(((Hashtable) (obj)))).c().intValue() == 65535 && asw1.equals("EncodedSyncPData"))
        {
            asw1 = new aws(((Hashtable) (obj)));
            obj = atp1.a();
            b(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj)), "TYPE", "response");
            ((Intent) (obj)).putExtra("SUCCESS", asw1.d().booleanValue());
            b(((Intent) (obj)), "COMMENT1", asw1.f());
            b(((Intent) (obj)), "COMMENT2", asw1.e().toString());
            ((Intent) (obj)).putExtra("CORRID", asw1.c().intValue());
            atp1.a(((Intent) (obj)));
            return;
        }
        if ((new atm(((Hashtable) (obj)))).c().intValue() == 65535 && asw1.equals("SystemRequest"))
        {
            asw1 = new aws(((Hashtable) (obj)));
            obj = atp1.a();
            b(((Intent) (obj)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj)), "TYPE", "response");
            ((Intent) (obj)).putExtra("SUCCESS", asw1.d().booleanValue());
            b(((Intent) (obj)), "COMMENT1", asw1.f());
            b(((Intent) (obj)), "COMMENT2", asw1.e().toString());
            ((Intent) (obj)).putExtra("CORRID", asw1.c().intValue());
            b(((Intent) (obj)), "DATA", atp1.a(asw1));
            atp1.a(((Intent) (obj)));
            return;
        }
        if (!asw1.equals("UnregisterAppInterface")) goto _L2; else goto _L21
_L21:
        atp1.e = Boolean.valueOf(false);
        synchronized (atp1.q)
        {
            atp1.q.notify();
        }
        asw1 = new awv(((Hashtable) (obj)));
        obj = atp1.a();
        b(((Intent) (obj)), "RPC_NAME", "UnregisterAppInterface");
        b(((Intent) (obj)), "TYPE", "response");
        ((Intent) (obj)).putExtra("SUCCESS", asw1.d().booleanValue());
        b(((Intent) (obj)), "COMMENT1", asw1.f());
        b(((Intent) (obj)), "COMMENT2", asw1.e().toString());
        b(((Intent) (obj)), "DATA", atp1.a(asw1));
        ((Intent) (obj)).putExtra("CORRID", asw1.c().intValue());
        atp1.a(((Intent) (obj)));
        return;
        obj;
        asw1;
        JVM INSTR monitorexit ;
        throw obj;
_L12:
        if (!asw1.equals("RegisterAppInterface")) goto _L23; else goto _L22
_L22:
        obj = new avv(((Hashtable) (obj)));
        if (((avv) (obj)).d().booleanValue())
        {
            atp1.e = Boolean.valueOf(true);
        }
        ((avv) (obj)).l();
        atp1.i = ((avv) (obj)).k();
        ((avv) (obj)).m();
        ((avv) (obj)).n();
        ((avv) (obj)).o();
        ((avv) (obj)).p();
        ((avv) (obj)).q();
        atp1.h = ((avv) (obj)).i();
        ((avv) (obj)).j();
        atp1.g = ((avv) (obj)).h();
        ((avv) (obj)).r();
        atp1.j = ((avv) (obj)).s();
        atp1.E = "2.3";
        ((avv) (obj)).t();
        if (axt.c()) goto _L25; else goto _L24
_L24:
        axt.a();
        axt.c((new StringBuilder("SYNC Proxy Version: ")).append(atp1.E).toString());
        axt.b();
_L28:
        if (!atp1.d.booleanValue()) goto _L27; else goto _L26
_L26:
        obj1 = SyncConnectionState.a;
        if (!((avv) (obj)).d().booleanValue())
        {
            obj = new SyncException((new StringBuilder("Unable to register app interface. Review values passed to the SyncProxy constructor. RegisterAppInterface result code: ")).append(((avv) (obj)).e()).toString(), SyncExceptionCause.l);
            obj1 = SyncDisconnectedReason.g;
            atp1.a(((Exception) (obj)));
        }
_L30:
        axg.a((new StringBuilder("Proxy received RPC Message: ")).append(asw1).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
_L25:
        axt.c((new StringBuilder("SYNC Proxy Version: ")).append(atp1.E).toString());
          goto _L28
_L27:
        if (!atp1.b.booleanValue()) goto _L30; else goto _L29
_L29:
        atp1.c.post(atp1. new Runnable() {

            private atp a;

            public final void run()
            {
                if (atp.h(a) instanceof atg)
                {
                    atp.h(a);
                    return;
                } else
                {
                    atp.h(a);
                    return;
                }
            }

            
            {
                a = atp.this;
                super();
            }
        });
          goto _L30
_L23:
label0:
        {
            if (!asw1.equals("Speak"))
            {
                break MISSING_BLOCK_LABEL_1588;
            }
            obj = new awl(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label0;
            }
            atp1.c.post(atp1. new Runnable(((awl) (obj))) {

                private awl a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awl1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awl) (obj)));
          goto _L30
label1:
        {
            if (!asw1.equals("Alert"))
            {
                break MISSING_BLOCK_LABEL_1650;
            }
            obj = new aua(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label1;
            }
            atp1.c.post(atp1. new Runnable(((aua) (obj))) {

                private aua a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aua1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aua) (obj)));
          goto _L30
label2:
        {
            if (!asw1.equals("Show"))
            {
                break MISSING_BLOCK_LABEL_1712;
            }
            obj = new awg(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label2;
            }
            atp1.c.post(atp1. new Runnable(((awg) (obj))) {

                private awg a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awg1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awg) (obj)));
          goto _L30
label3:
        {
            if (!asw1.equals("AddCommand"))
            {
                break MISSING_BLOCK_LABEL_1774;
            }
            obj = new aty(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label3;
            }
            atp1.c.post(atp1. new Runnable(((aty) (obj))) {

                private aty a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aty1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aty) (obj)));
          goto _L30
label4:
        {
            if (!asw1.equals("DeleteCommand"))
            {
                break MISSING_BLOCK_LABEL_1836;
            }
            obj = new aui(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label4;
            }
            atp1.c.post(atp1. new Runnable(((aui) (obj))) {

                private aui a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aui1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aui) (obj)));
          goto _L30
label5:
        {
            if (!asw1.equals("AddSubMenu"))
            {
                break MISSING_BLOCK_LABEL_1898;
            }
            obj = new atz(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label5;
            }
            atp1.c.post(atp1. new Runnable(((atz) (obj))) {

                private atz a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = atz1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((atz) (obj)));
          goto _L30
label6:
        {
            if (!asw1.equals("DeleteSubMenu"))
            {
                break MISSING_BLOCK_LABEL_1960;
            }
            obj = new aum(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label6;
            }
            atp1.c.post(atp1. new Runnable(((aum) (obj))) {

                private aum a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aum1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aum) (obj)));
          goto _L30
label7:
        {
            if (!asw1.equals("SubscribeButton"))
            {
                break MISSING_BLOCK_LABEL_2022;
            }
            obj = new awo(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label7;
            }
            atp1.c.post(atp1. new Runnable(((awo) (obj))) {

                private awo a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awo1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awo) (obj)));
          goto _L30
label8:
        {
            if (!asw1.equals("UnsubscribeButton"))
            {
                break MISSING_BLOCK_LABEL_2084;
            }
            obj = new aww(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label8;
            }
            atp1.c.post(atp1. new Runnable(((aww) (obj))) {

                private aww a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aww1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aww) (obj)));
          goto _L30
label9:
        {
            if (!asw1.equals("SetMediaClockTimer"))
            {
                break MISSING_BLOCK_LABEL_2146;
            }
            obj = new awe(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label9;
            }
            atp1.c.post(atp1. new Runnable(((awe) (obj))) {

                private awe a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awe1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awe) (obj)));
          goto _L30
label10:
        {
            if (!asw1.equals("EncodedSyncPData"))
            {
                break label10;
            }
            obj = new aws(((Hashtable) (obj)));
            obj1 = atp1.a();
            b(((Intent) (obj1)), "RPC_NAME", "SystemRequest");
            b(((Intent) (obj1)), "TYPE", "response");
            ((Intent) (obj1)).putExtra("SUCCESS", ((aws) (obj)).d().booleanValue());
            b(((Intent) (obj1)), "COMMENT1", ((aws) (obj)).f());
            b(((Intent) (obj1)), "COMMENT2", ((aws) (obj)).e().toString());
            ((Intent) (obj1)).putExtra("CORRID", ((aws) (obj)).c().intValue());
            atp1.a(((Intent) (obj1)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label11:
        {
            if (!asw1.equals("CreateInteractionChoiceSet"))
            {
                break MISSING_BLOCK_LABEL_2341;
            }
            obj = new aug(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label11;
            }
            atp1.c.post(atp1. new Runnable(((aug) (obj))) {

                private aug a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aug1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aug) (obj)));
          goto _L30
label12:
        {
            if (!asw1.equals("DeleteInteractionChoiceSet"))
            {
                break MISSING_BLOCK_LABEL_2403;
            }
            obj = new aul(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label12;
            }
            atp1.c.post(atp1. new Runnable(((aul) (obj))) {

                private aul a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aul1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aul) (obj)));
          goto _L30
label13:
        {
            if (!asw1.equals("PerformInteraction"))
            {
                break MISSING_BLOCK_LABEL_2465;
            }
            obj = new avp(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label13;
            }
            atp1.c.post(atp1. new Runnable(((avp) (obj))) {

                private avp a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avp1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avp) (obj)));
          goto _L30
label14:
        {
            if (!asw1.equals("SetGlobalProperties"))
            {
                break MISSING_BLOCK_LABEL_2527;
            }
            obj = new awc(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label14;
            }
            atp1.c.post(atp1. new Runnable(((awc) (obj))) {

                private awc a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awc1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awc) (obj)));
          goto _L30
label15:
        {
            if (!asw1.equals("ResetGlobalProperties"))
            {
                break MISSING_BLOCK_LABEL_2589;
            }
            obj = new avw(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label15;
            }
            atp1.c.post(atp1. new Runnable(((avw) (obj))) {

                private avw a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avw1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avw) (obj)));
          goto _L30
        if (!asw1.equals("UnregisterAppInterface"))
        {
            break MISSING_BLOCK_LABEL_2772;
        }
        atp1.e = Boolean.valueOf(false);
        synchronized (atp1.q)
        {
            atp1.q.notify();
        }
        obj = new awv(((Hashtable) (obj)));
        obj1 = atp1.a();
        b(((Intent) (obj1)), "RPC_NAME", "UnregisterAppInterface");
        b(((Intent) (obj1)), "TYPE", "response");
        ((Intent) (obj1)).putExtra("SUCCESS", ((awv) (obj)).d().booleanValue());
        b(((Intent) (obj1)), "COMMENT1", ((awv) (obj)).f());
        b(((Intent) (obj1)), "COMMENT2", ((awv) (obj)).e().toString());
        b(((Intent) (obj1)), "DATA", atp1.a(((ati) (obj))));
        ((Intent) (obj1)).putExtra("CORRID", ((awv) (obj)).c().intValue());
        atp1.a(((Intent) (obj1)));
        if (atp1.b.booleanValue())
        {
            atp1.c.post(atp1. new Runnable() {

                private atp a;

                public final void run()
                {
                    if (atp.h(a) instanceof atg)
                    {
                        atp.h(a);
                        return;
                    } else
                    {
                        atp.h(a);
                        return;
                    }
                }

            
            {
                a = atp.this;
                super();
            }
            });
        }
        obj = SyncDisconnectedReason.h;
        atp1.a(((Exception) (null)));
          goto _L30
        asw1;
        obj1;
        JVM INSTR monitorexit ;
        throw asw1;
        if (!asw1.equals("GenericResponse"))
        {
            break MISSING_BLOCK_LABEL_2834;
        }
        obj = new auq(((Hashtable) (obj)));
        if (!atp1.b.booleanValue())
        {
            break MISSING_BLOCK_LABEL_2821;
        }
        atp1.c.post(atp1. new Runnable(((auq) (obj))) {

            private auq a;
            private atp b;

            public final void run()
            {
                atp.h(b).a(a);
            }

            
            {
                b = atp.this;
                a = auq1;
                super();
            }
        });
          goto _L30
        atp1.a.a(((auq) (obj)));
          goto _L30
label16:
        {
            if (!asw1.equals("Slider"))
            {
                break MISSING_BLOCK_LABEL_2896;
            }
            obj = new awh(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label16;
            }
            atp1.c.post(atp1. new Runnable(((awh) (obj))) {

                private awh a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awh1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awh) (obj)));
          goto _L30
label17:
        {
            if (!asw1.equals("PutFile"))
            {
                break MISSING_BLOCK_LABEL_2958;
            }
            obj = new avs(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label17;
            }
            atp1.c.post(atp1. new Runnable(((avs) (obj))) {

                private avs a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avs1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avs) (obj)));
          goto _L30
label18:
        {
            if (!asw1.equals("DeleteFile"))
            {
                break MISSING_BLOCK_LABEL_3020;
            }
            obj = new auk(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label18;
            }
            atp1.c.post(atp1. new Runnable(((auk) (obj))) {

                private auk a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = auk1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((auk) (obj)));
          goto _L30
label19:
        {
            if (!asw1.equals("ListFiles"))
            {
                break MISSING_BLOCK_LABEL_3082;
            }
            obj = new auv(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label19;
            }
            atp1.c.post(atp1. new Runnable(((auv) (obj))) {

                private auv a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = auv1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((auv) (obj)));
          goto _L30
label20:
        {
            if (!asw1.equals("SetAppIcon"))
            {
                break MISSING_BLOCK_LABEL_3144;
            }
            obj = new awa(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label20;
            }
            atp1.c.post(atp1. new Runnable(((awa) (obj))) {

                private awa a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awa1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awa) (obj)));
          goto _L30
label21:
        {
            if (!asw1.equals("ScrollableMessage"))
            {
                break MISSING_BLOCK_LABEL_3206;
            }
            obj = new avy(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label21;
            }
            atp1.c.post(atp1. new Runnable(((avy) (obj))) {

                private avy a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avy1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avy) (obj)));
          goto _L30
label22:
        {
            if (!asw1.equals("ChangeRegistration"))
            {
                break MISSING_BLOCK_LABEL_3268;
            }
            obj = new aud(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label22;
            }
            atp1.c.post(atp1. new Runnable(((aud) (obj))) {

                private aud a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aud1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aud) (obj)));
          goto _L30
label23:
        {
            if (!asw1.equals("SetDisplayLayout"))
            {
                break MISSING_BLOCK_LABEL_3330;
            }
            obj = new awb(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label23;
            }
            atp1.c.post(atp1. new Runnable(((awb) (obj))) {

                private awb a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awb1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awb) (obj)));
          goto _L30
label24:
        {
            if (!asw1.equals("PerformAudioPassThru"))
            {
                break MISSING_BLOCK_LABEL_3392;
            }
            obj = new avn(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label24;
            }
            atp1.c.post(atp1. new Runnable(((avn) (obj))) {

                private avn a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avn1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avn) (obj)));
          goto _L30
label25:
        {
            if (!asw1.equals("EndAudioPassThru"))
            {
                break MISSING_BLOCK_LABEL_3454;
            }
            obj = new aup(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label25;
            }
            atp1.c.post(atp1. new Runnable(((aup) (obj))) {

                private aup a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aup1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aup) (obj)));
          goto _L30
label26:
        {
            if (!asw1.equals("SubscribeVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3516;
            }
            obj = new awp(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label26;
            }
            atp1.c.post(atp1. new Runnable(((awp) (obj))) {

                private awp a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awp1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awp) (obj)));
          goto _L30
label27:
        {
            if (!asw1.equals("UnsubscribeVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3578;
            }
            obj = new awx(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label27;
            }
            atp1.c.post(atp1. new Runnable(((awx) (obj))) {

                private awx a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = awx1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((awx) (obj)));
          goto _L30
label28:
        {
            if (!asw1.equals("GetVehicleData"))
            {
                break MISSING_BLOCK_LABEL_3640;
            }
            obj = new aus(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label28;
            }
            atp1.c.post(atp1. new Runnable(((aus) (obj))) {

                private aus a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aus1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aus) (obj)));
          goto _L30
label29:
        {
            if (!asw1.equals("ReadDID"))
            {
                break MISSING_BLOCK_LABEL_3702;
            }
            obj = new avt(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label29;
            }
            atp1.c.post(atp1. new Runnable(((avt) (obj))) {

                private avt a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avt1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avt) (obj)));
          goto _L30
label30:
        {
            if (!asw1.equals("GetDTCs"))
            {
                break MISSING_BLOCK_LABEL_3764;
            }
            obj = new aur(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label30;
            }
            atp1.c.post(atp1. new Runnable(((aur) (obj))) {

                private aur a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = aur1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((aur) (obj)));
          goto _L30
label31:
        {
            if (!asw1.equals("DiagnosticMessage"))
            {
                break label31;
            }
            new aun(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label32:
        {
            if (!asw1.equals("SystemRequest"))
            {
                break label32;
            }
            new aws(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label33:
        {
            if (atp1.g == null)
            {
                break label33;
            }
            axt.a((new StringBuilder("Unrecognized response Message: ")).append(asw1.toString()).append("SYNC Message Version = ").append(atp1.g).toString());
        }
          goto _L30
        axt.a((new StringBuilder("Unrecognized response Message: ")).append(asw1.toString()).toString());
          goto _L30
_L10:
        if (!s1.equals("notification")) goto _L30; else goto _L31
_L31:
        axg.a(InterfaceActivityDirection.b, new atj(((ati) (obj1))), "42baba60-eb57-11df-98cf-0800200c9a66");
        if (!asw1.equals("OnHMIStatus"))
        {
            break MISSING_BLOCK_LABEL_4104;
        }
        obj = new avd(((Hashtable) (obj)));
        if (atp1.l != null)
        {
            atp1.l.f.a(((avd) (obj)).c());
        }
        obj.f = new Boolean(atp1.D.booleanValue());
        if (((avd) (obj)).c() == HMILevel.a)
        {
            atp1.D = Boolean.valueOf(false);
        }
        if (((avd) (obj)).c() != null && ((avd) (obj)).d() != null)
        {
            if (!atp1.b.booleanValue())
            {
                break MISSING_BLOCK_LABEL_4080;
            }
            atp1.c.post(atp1. new Runnable(((avd) (obj))) {

                private avd a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                    atp.h(b);
                    atp.c(b).f.b();
                }

            
            {
                b = atp.this;
                a = avd1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avd) (obj)));
        atp1.l.f.b();
          goto _L30
label34:
        {
            if (!asw1.equals("OnCommand"))
            {
                break MISSING_BLOCK_LABEL_4166;
            }
            obj = new avb(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label34;
            }
            atp1.c.post(atp1. new Runnable(((avb) (obj))) {

                private avb a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = avb1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((avb) (obj)));
          goto _L30
        if (!asw1.equals("OnDriverDistraction"))
        {
            break MISSING_BLOCK_LABEL_4257;
        }
        obj = new avc(((Hashtable) (obj)));
        if (atp1.l == null)
        {
            break MISSING_BLOCK_LABEL_4214;
        }
        Intent intent;
        if (((avc) (obj)).c() != DriverDistractionState.a)
        {
            flag = false;
        }
        atp1.l.f.a(flag);
        if (!atp1.b.booleanValue())
        {
            break MISSING_BLOCK_LABEL_4243;
        }
        atp1.c.post(atp1. new Runnable() {

            private atp a;

            public final void run()
            {
                atp.h(a);
                atp.h(a);
                atp.c(a).f.b();
            }

            
            {
                a = atp.this;
                super();
            }
        });
          goto _L30
        atp1.l.f.b();
          goto _L30
label35:
        {
            if (!asw1.equals("OnEncodedSyncPData"))
            {
                break MISSING_BLOCK_LABEL_4416;
            }
            obj = new avj(((Hashtable) (obj)));
            intent = atp1.a();
            b(intent, "RPC_NAME", "OnSystemRequest");
            b(intent, "TYPE", "notification");
            if (((avj) (obj)).f() != null)
            {
                break label35;
            }
            b(intent, "COMMENT1", "URL is a null value (received)");
            atp1.a(intent);
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
        b(intent, "COMMENT1", (new StringBuilder("Sending to cloud: ")).append(((avj) (obj)).f()).toString());
        atp1.a(intent);
        Log.i("pt", "send to url");
        if (((avj) (obj)).f() != null)
        {
            (atp1. new Thread(((avj) (obj))) {

                private avj a;
                private atp b;

                public final void run()
                {
                    atp.a(b, a);
                }

            
            {
                b = atp.this;
                a = avj1;
                super();
            }
            }).start();
        }
          goto _L30
label36:
        {
            if (!asw1.equals("OnPermissionsChange"))
            {
                break label36;
            }
            new avi(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label37:
        {
            if (!asw1.equals("OnTBTClientState"))
            {
                break label37;
            }
            new avk(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label38:
        {
            if (!asw1.equals("OnButtonPress"))
            {
                break MISSING_BLOCK_LABEL_4574;
            }
            obj = new ava(((Hashtable) (obj)));
            if (!atp1.b.booleanValue())
            {
                break label38;
            }
            atp1.c.post(atp1. new Runnable(((ava) (obj))) {

                private ava a;
                private atp b;

                public final void run()
                {
                    atp.h(b).a(a);
                }

            
            {
                b = atp.this;
                a = ava1;
                super();
            }
            });
        }
          goto _L30
        atp1.a.a(((ava) (obj)));
          goto _L30
label39:
        {
            if (!asw1.equals("OnButtonEvent"))
            {
                break label39;
            }
            new auz(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label40:
        {
            if (!asw1.equals("OnLanguageChange"))
            {
                break label40;
            }
            new avg(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label41:
        {
            if (!asw1.equals("OnHashChange"))
            {
                break label41;
            }
            new ave(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                        atp.h();
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label42:
        {
            if (!asw1.equals("OnSystemRequest"))
            {
                break label42;
            }
            obj = new avj(((Hashtable) (obj)));
            if (((avj) (obj)).f() != null && ((avj) (obj)).e() == RequestType.a && ((avj) (obj)).h() == FileType.b)
            {
                (atp1. new Thread(((avj) (obj))) {

                    private avj a;
                    private atp b;

                    public final void run()
                    {
                        atp.a(b, a);
                    }

            
            {
                b = atp.this;
                a = avj1;
                super();
            }
                }).start();
            }
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label43:
        {
            if (!asw1.equals("OnAudioPassThru"))
            {
                break label43;
            }
            new auy(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label44:
        {
            if (!asw1.equals("OnVehicleData"))
            {
                break label44;
            }
            new avm(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
        if (!asw1.equals("OnAppInterfaceUnregistered"))
        {
            break MISSING_BLOCK_LABEL_5054;
        }
        atp1.e = Boolean.valueOf(false);
        synchronized (atp1.q)
        {
            atp1.q.notify();
        }
        obj = new aux(((Hashtable) (obj)));
        obj2 = atp1.a();
        b(((Intent) (obj2)), "RPC_NAME", "OnAppInterfaceUnregistered");
        b(((Intent) (obj2)), "TYPE", "notification");
        b(((Intent) (obj2)), "DATA", atp1.a(((ati) (obj))));
        atp1.a(((Intent) (obj2)));
        if (!atp1.d.booleanValue())
        {
            break MISSING_BLOCK_LABEL_5016;
        }
        SyncDisconnectedReason.a(((aux) (obj)).c());
        atp1.g();
          goto _L30
        asw1;
        obj2;
        JVM INSTR monitorexit ;
        throw asw1;
        if (atp1.b.booleanValue())
        {
            atp1.c.post(atp1. new Runnable() {

                private atp a;

                public final void run()
                {
                    atp.h(a);
                }

            
            {
                a = atp.this;
                super();
            }
            });
        }
        obj = SyncDisconnectedReason.h;
        atp1.a(((Exception) (null)));
          goto _L30
label45:
        {
            if (!asw1.equals("OnKeyboardInput"))
            {
                break label45;
            }
            new avf(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label46:
        {
            if (!asw1.equals("OnTouchEvent"))
            {
                break label46;
            }
            new avl(((Hashtable) (obj)));
            if (atp1.b.booleanValue())
            {
                atp1.c.post(atp1. new Runnable() {

                    private atp a;

                    public final void run()
                    {
                        atp.h(a);
                    }

            
            {
                a = atp.this;
                super();
            }
                });
            }
        }
          goto _L30
label47:
        {
            if (atp1.g == null)
            {
                break label47;
            }
            axt.c((new StringBuilder("Unrecognized notification Message: ")).append(asw1.toString()).append(" connected to SYNC using message version: ").append(atp1.g.a()).append(".").append(atp1.g.b()).toString());
        }
          goto _L30
        axt.c((new StringBuilder("Unrecognized notification Message: ")).append(asw1.toString()).toString());
          goto _L30
_L2:
        return;
        if (true) goto _L33; else goto _L32
_L32:
    }

    private static boolean b(Integer integer)
    {
        return integer != null && (65531 == integer.intValue() || 65529 == integer.intValue() || 65530 == integer.intValue() || 65535 == integer.intValue());
    }

    static axc c(atp atp1)
    {
        return atp1.l;
    }

    private void c()
    {
        a(new att((byte)0));
    }

    static void c(atp atp1, asw asw1)
    {
        synchronized (m)
        {
            if (atp1.l != null)
            {
                atp1 = atp1.l;
                if (((axc) (atp1)).b != null)
                {
                    atp1 = ((axc) (atp1)).b;
                    if (((axa) (atp1)).b != null)
                    {
                        ((axa) (atp1)).b.a(asw1);
                    }
                }
            }
        }
        axg.a((new StringBuilder("SyncProxy sending Protocol Message: ")).append(asw1.toString()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        return;
        atp1;
        obj;
        JVM INSTR monitorexit ;
        throw atp1;
    }

    static void d(atp atp1)
    {
        if (!atp1.d.booleanValue()) goto _L2; else goto _L1
_L1:
        avu avu1;
        Object obj;
        Language language;
        Language language1;
        Vector vector;
        Integer integer;
        String s1;
        String s2;
        Boolean boolean1;
        Vector vector1;
        try
        {
            s2 = atp1.u;
            vector1 = atp1.v;
            vector = atp1.A;
            boolean1 = atp1.w;
            language1 = atp1.x;
            language = atp1.y;
            s1 = atp1.z;
            integer = Integer.valueOf(65529);
            avu1 = new avu();
        }
        catch (Exception exception)
        {
            SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.g;
            atp1.a(exception);
            return;
        }
        obj = integer;
        if (integer != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = Integer.valueOf(1);
        avu1.a(((Integer) (obj)));
        obj = new awq();
        integer = new Integer(1);
        ((awq) (obj)).e.put("majorVersion", integer);
        integer = new Integer(0);
        ((awq) (obj)).e.put("minorVersion", integer);
        avu1.b.put("syncMsgVersion", obj);
        if (s2 == null) goto _L4; else goto _L3
_L3:
        avu1.b.put("appName", s2);
_L27:
        if (vector1 == null) goto _L6; else goto _L5
_L5:
        avu1.b.put("ttsName", vector1);
_L19:
        if (s2 == null) goto _L8; else goto _L7
_L7:
        avu1.b.put("ngnMediaScreenAppName", s2);
_L20:
        obj = vector;
        if (vector != null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = new Vector();
        ((Vector) (obj)).add(s2);
        if (obj == null) goto _L10; else goto _L9
_L9:
        avu1.b.put("vrSynonyms", obj);
_L21:
        if (boolean1 == null) goto _L12; else goto _L11
_L11:
        avu1.b.put("isMediaApplication", boolean1);
_L22:
        obj = language1;
        if (language1 != null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj = Language.a;
        if (obj == null) goto _L14; else goto _L13
_L13:
        avu1.b.put("languageDesired", obj);
_L23:
        obj = language;
        if (language != null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        obj = Language.a;
        if (obj == null) goto _L16; else goto _L15
_L15:
        avu1.b.put("hmiDisplayLanguageDesired", obj);
_L24:
        avu1.b.remove("appHMIType");
        if (s1 == null) goto _L18; else goto _L17
_L17:
        avu1.b.put("appID", s1);
_L25:
        obj = atp1.a();
        b(((Intent) (obj)), "RPC_NAME", "RegisterAppInterface");
        b(((Intent) (obj)), "TYPE", "request");
        ((Intent) (obj)).putExtra("CORRID", avu1.c().intValue());
        b(((Intent) (obj)), "DATA", atp1.a(avu1));
        atp1.a(((Intent) (obj)));
        atp1.b(avu1);
        return;
_L4:
        avu1.b.remove("appName");
        continue; /* Loop/switch isn't completed */
_L6:
        avu1.b.remove("ttsName");
          goto _L19
_L8:
        avu1.b.remove("ngnMediaScreenAppName");
          goto _L20
_L10:
        avu1.b.remove("vrSynonyms");
          goto _L21
_L12:
        avu1.b.remove("isMediaApplication");
          goto _L22
_L14:
        avu1.b.remove("languageDesired");
          goto _L23
_L16:
        avu1.b.remove("hmiDisplayLanguageDesired");
          goto _L24
_L18:
        avu1.b.remove("appID");
          goto _L25
_L2:
        atp1.a(new ats("OnProxyOpened"));
        return;
        if (true) goto _L27; else goto _L26
_L26:
    }

    static void e(atp atp1)
    {
        atp1.c();
    }

    static void f(atp atp1)
    {
        atp1.c();
    }

    static void g(atp atp1)
    {
        atp1.c();
    }

    static atw h(atp atp1)
    {
        return atp1.a;
    }

    static boolean h()
    {
        return false;
    }

    public final void a(atk atk1)
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        }
        if (atk1 == null)
        {
            axg.a("Application called sendRPCRequest method with a null RPCRequest.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new IllegalArgumentException("sendRPCRequest cannot be called with a null request.");
        }
        axg.a((new StringBuilder("Application called sendRPCRequest method for RPCRequest: .")).append(atk1.a()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (l == null || !l.d())
        {
            axg.a("Application attempted to send and RPCRequest without a connected transport.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new SyncException("There is no valid connection to SYNC. sendRPCRequest cannot be called until SYNC has been connected.", SyncExceptionCause.m);
        }
        break MISSING_BLOCK_LABEL_125;
        atk1;
        obj;
        JVM INSTR monitorexit ;
        throw atk1;
        obj;
        JVM INSTR monitorexit ;
        if (b(atk1.c()))
        {
            axg.a((new StringBuilder("Application attempted to use the reserved correlation ID, ")).append(atk1.c()).toString(), "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new SyncException((new StringBuilder("Invalid correlation ID. The correlation ID, ")).append(atk1.c()).append(" , is a reserved correlation ID.").toString(), SyncExceptionCause.h);
        }
        if (!e.booleanValue() && !atk1.a().equals("RegisterAppInterface"))
        {
            axg.a("Application attempted to send an RPCRequest (non-registerAppInterface), before the interface was registerd.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new SyncException("SYNC is currently unavailable. RPC Requests cannot be sent.", SyncExceptionCause.m);
        }
        if (d.booleanValue() && (atk1.a().equals("RegisterAppInterface") || atk1.a().equals("UnregisterAppInterface")))
        {
            axg.a("Application attempted to send a RegisterAppInterface or UnregisterAppInterface while using ALM.", "42baba60-eb57-11df-98cf-0800200c9a66");
            throw new SyncException((new StringBuilder("The RPCRequest, ")).append(atk1.a()).append(", is unallowed using the Advanced Lifecycle Management Model.").toString(), SyncExceptionCause.e);
        } else
        {
            b(atk1);
            return;
        }
    }

    public final void a(ButtonName buttonname, Integer integer)
    {
        awn awn1 = new awn();
        awn1.a(integer);
        if (buttonname != null)
        {
            awn1.b.put("buttonName", buttonname);
        }
        a(((atk) (awn1)));
    }

    public final void a(Language language, Language language1, Integer integer)
    {
        auc auc1 = new auc();
        auc1.a(integer);
        if (language != null)
        {
            auc1.b.put("language", language);
        } else
        {
            auc1.b.remove("language");
        }
        if (language1 != null)
        {
            auc1.b.put("hmiDisplayLanguage", language1);
        } else
        {
            auc1.b.remove("hmiDisplayLanguage");
        }
        a(((atk) (auc1)));
    }

    protected final void a(Exception exception)
    {
        axg.a("NotifyProxyClose", "42baba60-eb57-11df-98cf-0800200c9a66");
        a(((ats) (new atu(exception))));
    }

    public final void a(Integer integer)
    {
        a(((atk) (atl.a(null, null, "     ", null, integer))));
    }

    public final void a(Integer integer, Integer integer1)
    {
        auh auh1 = new auh();
        if (integer != null)
        {
            auh1.b.put("cmdID", integer);
        }
        auh1.a(integer1);
        a(((atk) (auh1)));
    }

    public final void a(Integer integer, Integer integer1, Integer integer2, UpdateMode updatemode, Integer integer3)
    {
        awd awd1 = new awd();
        if (integer != null || integer1 != null || integer2 != null)
        {
            awm awm1 = new awm();
            awd1.b.put("startTime", awm1);
            if (integer != null)
            {
                awm1.e.put("hours", integer);
            }
            if (integer1 != null)
            {
                awm1.e.put("minutes", integer1);
            }
            if (integer2 != null)
            {
                awm1.e.put("seconds", integer2);
            }
        }
        if (updatemode != null)
        {
            awd1.b.put("updateMode", updatemode);
        }
        awd1.a(integer3);
        a(((atk) (awd1)));
    }

    public final void a(Integer integer, String s1, Integer integer1, Vector vector, Integer integer2)
    {
        atx atx1 = new atx();
        atx1.a(integer2);
        atx1.b(integer);
        atx1.a(vector);
        if (s1 != null || integer1 != null)
        {
            integer = new auw();
            if (s1 != null)
            {
                ((auw) (integer)).e.put("menuName", s1);
            }
            if (integer1 != null)
            {
                ((auw) (integer)).e.put("position", integer1);
            }
            atx1.b.put("menuParams", integer);
        }
        a(((atk) (atx1)));
    }

    public final void a(Integer integer, Vector vector, Integer integer1)
    {
        atx atx1 = new atx();
        atx1.a(integer1);
        atx1.b(integer);
        if (vector != null)
        {
            atx1.a(vector);
        }
        a(((atk) (atx1)));
    }

    public final void a(String s1, Integer integer)
    {
        s1 = atr.a(s1);
        awk awk1 = new awk();
        awk1.a(integer);
        if (s1 != null)
        {
            awk1.b.put("ttsChunks", s1);
        }
        a(((atk) (awk1)));
    }

    public final void a(String s1, Integer integer, Vector vector, Integer integer1)
    {
        avx avx1 = new avx();
        avx1.a(integer1);
        if (s1 != null)
        {
            avx1.b.put("scrollableMessageBody", s1);
        } else
        {
            avx1.b.remove("scrollableMessageBody");
        }
        if (integer != null)
        {
            avx1.b.put("timeout", integer);
        } else
        {
            avx1.b.remove("timeout");
        }
        if (vector != null)
        {
            avx1.b.put("softButtons", vector);
        } else
        {
            avx1.b.remove("softButtons");
        }
        a(((atk) (avx1)));
    }

    public final void a(String s1, String s2, TextAlignment textalignment, Integer integer)
    {
        a(((atk) (atl.a(s1, s2, null, textalignment, integer))));
    }

    public final void a(Vector vector, Integer integer, Integer integer1)
    {
        auf auf1 = new auf();
        auf1.b.put("choiceSet", vector);
        if (integer != null)
        {
            auf1.b.put("interactionChoiceSetID", integer);
        }
        auf1.a(integer1);
        a(((atk) (auf1)));
    }

    protected final void g()
    {
        if (H)
        {
            return;
        }
        Object obj1 = G;
        obj1;
        JVM INSTR monitorenter ;
        H = true;
        Boolean boolean2;
        if (!d.booleanValue())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        SyncConnectionState syncconnectionstate = SyncConnectionState.b;
        D = Boolean.valueOf(true);
        boolean2 = Boolean.valueOf(false);
        Object obj2 = m;
        obj2;
        JVM INSTR monitorenter ;
        Boolean boolean1 = boolean2;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        boolean1 = boolean2;
        if (!l.d())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        boolean1 = boolean2;
        if (e.booleanValue())
        {
            boolean1 = Boolean.valueOf(true);
            awu awu1 = new awu();
            awu1.a(Integer.valueOf(65530));
            Intent intent1 = a();
            b(intent1, "RPC_NAME", "UnregisterAppInterface");
            b(intent1, "TYPE", "request");
            intent1.putExtra("CORRID", awu1.c().intValue());
            b(intent1, "DATA", a(awu1));
            a(intent1);
            b(awu1);
        }
        obj2;
        JVM INSTR monitorexit ;
        if (boolean1.booleanValue())
        {
            synchronized (q)
            {
                try
                {
                    q.wait(3000L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception) { }
            }
        }
        synchronized (m)
        {
            if (l != null)
            {
                l.c();
            }
        }
        axg.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        b();
        a(new SyncException("Sync Proxy Cycled", SyncExceptionCause.j));
_L5:
        H = false;
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        throw obj;
        axg.a("SyncProxy cleaned.", "42baba60-eb57-11df-98cf-0800200c9a66");
        throw obj;
        obj;
        Intent intent = a();
        b(intent, "FUNCTION_NAME", "cycleProxy");
        b(intent, "COMMENT1", (new StringBuilder("Proxy cycled, exception cause: ")).append(((SyncException) (obj))._syncExceptionCause).toString());
        a(intent);
        final class _cls61
        {

            static final int a[];

            static 
            {
                a = new int[SyncExceptionCause.values().length];
                try
                {
                    a[SyncExceptionCause.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncExceptionCause.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls61.a[((SyncException) (obj))._syncExceptionCause.ordinal()];
        JVM INSTR tableswitch 1 2: default 467
    //                   1 398
    //                   2 424;
           goto _L1 _L2 _L3
_L7:
        if (true) goto _L5; else goto _L4
_L4:
_L9:
        if (true) goto _L7; else goto _L6
_L6:
_L11:
        if (true) goto _L9; else goto _L8
_L8:
_L13:
        if (true) goto _L11; else goto _L10
_L10:
_L15:
        if (true) goto _L13; else goto _L12
_L12:
_L17:
        if (true) goto _L15; else goto _L14
_L14:
_L19:
        if (true) goto _L17; else goto _L16
_L16:
_L21:
        if (true) goto _L19; else goto _L18
_L18:
_L23:
        if (true) goto _L21; else goto _L20
_L20:
_L25:
        if (true) goto _L23; else goto _L22
_L22:
_L27:
        if (true) goto _L25; else goto _L24
_L24:
_L29:
        if (true) goto _L27; else goto _L26
_L26:
_L31:
        if (true) goto _L29; else goto _L28
_L28:
_L33:
        if (true) goto _L31; else goto _L30
_L30:
_L35:
        if (true) goto _L33; else goto _L32
_L32:
_L37:
        if (true) goto _L35; else goto _L34
_L34:
_L39:
        if (true) goto _L37; else goto _L36
_L36:
_L41:
        if (true) goto _L39; else goto _L38
_L38:
_L43:
        if (true) goto _L41; else goto _L40
_L40:
_L45:
        if (true) goto _L43; else goto _L42
_L42:
_L47:
        if (true) goto _L45; else goto _L44
_L44:
_L49:
        if (true) goto _L47; else goto _L46
_L46:
_L51:
        if (true) goto _L49; else goto _L48
_L48:
_L53:
        if (true) goto _L51; else goto _L50
_L50:
_L55:
        if (true) goto _L53; else goto _L52
_L52:
_L57:
        if (true) goto _L55; else goto _L54
_L54:
_L56:
_L1:
        SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.i;
        a(((Exception) (obj)));
          goto _L5
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
_L2:
        SyncException syncexception = new SyncException("Bluetooth is disabled. Bluetooth must be enabled to connect to SYNC. Reattempt a connection once Bluetooth is enabled.", SyncExceptionCause.b);
        SyncDisconnectedReason syncdisconnectedreason1 = SyncDisconnectedReason.e;
        a(syncexception);
          goto _L5
_L3:
        SyncException syncexception1 = new SyncException("Cannot locate a Bluetooth adapater. A SYNC connection is impossible on this device until a Bluetooth adapter is added.", SyncExceptionCause.a);
        SyncDisconnectedReason syncdisconnectedreason2 = SyncDisconnectedReason.f;
        a(syncexception1);
          goto _L5
        Exception exception;
        exception;
        InterruptedException interruptedexception;
        SyncDisconnectedReason syncdisconnectedreason3 = SyncDisconnectedReason.i;
        a(exception);
          goto _L5
    }

}
