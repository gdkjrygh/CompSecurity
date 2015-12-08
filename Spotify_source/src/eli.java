// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonObjectCallbackReceiver;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class eli
{

    public static String a = "shuffle";
    public final String b;
    final WeakReference c;
    public final WeakReference d;
    final RequestType e;
    public Resolver f;
    public Handler g;
    public fyx h;
    public HandlerThread i;
    public Handler j;

    public eli(elg elg, elb elb, String s, RequestType requesttype, fyx fyx)
    {
        h = fyx;
        c = new WeakReference(elb);
        d = new WeakReference(elg);
        b = s;
        e = requesttype;
    }

    public static String a(String s, Map map)
    {
        s = (new StringBuilder("hm://apollo-browse")).append(s).append('?');
        int k = s.length();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.append((String)entry.getKey()).append('=').append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
            if (s.length() > k)
            {
                s.append('&');
            }
        }

        return s.toString();
    }

    public final void a()
    {
        ctz.a(f);
        f.destroy();
        i.quit();
    }

    // Unreferenced inner class eli$1

/* anonymous class */
    public final class _cls1 extends JsonObjectCallbackReceiver
    {

        private int a;
        private int b;
        private eli c;

        private void a(elb elb1, List list, Map map, int k, boolean flag)
        {
            elb1.a(list, map, k, flag, c.e);
        }

        static void a(_cls1 _pcls1, elb elb1)
        {
            elb1.a(null, null, -1, true, _pcls1.c.e);
        }

        static void a(_cls1 _pcls1, elb elb1, List list, int k, boolean flag)
        {
            _pcls1.a(elb1, list, ((Map) (null)), k, flag);
        }

        static void a(_cls1 _pcls1, elb elb1, List list, Map map, int k, boolean flag)
        {
            _pcls1.a(elb1, list, map, k, flag);
        }

        static void b(_cls1 _pcls1, elb elb1, List list, int k, boolean flag)
        {
            _pcls1.a(elb1, list, ((Map) (null)), k, flag);
        }

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
                errorcause.name()
            });
            throwable = (elb)c.c.get();
            if (throwable != null)
            {
                c.j.post(elm.a(this, throwable));
            }
        }

        protected final void onResolved(Response response, Object obj)
        {
            Object obj1;
            Object obj2;
            Object obj3;
            elb elb1;
            elg elg1;
            boolean flag;
            boolean flag2;
            boolean flag3;
            obj3 = null;
            obj2 = null;
            obj1 = null;
            flag = true;
            flag3 = false;
            flag2 = false;
            obj = (JSONObject)obj;
            elg1 = (elg)c.d.get();
            elb1 = (elb)c.c.get();
            if (elg1 == null || elb1 == null) goto _L2; else goto _L1
_L1:
            int l;
            boolean flag1;
            l = a * b;
            flag1 = flag3;
            response = obj3;
            if (!((JSONObject) (obj)).has("numItems")) goto _L4; else goto _L3
_L3:
            flag1 = flag3;
            response = obj3;
            int k = ((JSONObject) (obj)).getInt("numItems");
_L9:
            flag1 = flag3;
            response = obj3;
            if (!((JSONObject) (obj)).has("totalItems")) goto _L6; else goto _L5
_L5:
            flag1 = flag3;
            response = obj3;
            int i1 = ((JSONObject) (obj)).getInt("totalItems");
            flag1 = flag3;
            response = obj3;
            int j1 = a;
            flag1 = flag3;
            response = obj3;
            int k1 = b;
            if (i1 > (j1 + 1) * k1)
            {
                flag = false;
            }
_L10:
            if (k == 0) goto _L8; else goto _L7
_L7:
            Exception exception;
            try
            {
                response = elg1.a(((JSONObject) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                flag1 = flag;
                obj = obj2;
                continue; /* Loop/switch isn't completed */
            }
            obj = elg1.b(((JSONObject) (obj)));
_L14:
            c.j.post(elj.a(this, elb1, response, ((Map) (obj)), l, flag));
_L2:
            return;
_L4:
            k = -1;
              goto _L9
_L6:
            if (k == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
              goto _L10
            obj;
            flag = flag2;
_L13:
            flag1 = flag;
            response = ((Response) (obj1));
            Logger.b(((Throwable) (obj)), "Exception when fetching JSON: %s", new Object[] {
                ((JSONException) (obj)).getMessage()
            });
            c.j.post(elk.a(this, elb1, ((List) (obj1)), l, flag));
            return;
            exception;
            obj = response;
            response = exception;
_L12:
            c.j.post(ell.a(this, elb1, ((List) (obj)), l, flag1));
            throw response;
            exception;
            obj = response;
            response = exception;
            flag1 = flag;
            if (true) goto _L12; else goto _L11
_L11:
            break MISSING_BLOCK_LABEL_185;
            obj;
            exception = response;
            if (true) goto _L13; else goto _L8
_L8:
            obj = null;
            response = null;
              goto _L14
        }

            public 
            {
                c = eli.this;
                a = k;
                b = l;
                super(handler);
            }
    }

}
