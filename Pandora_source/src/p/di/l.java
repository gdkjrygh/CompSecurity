// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.provider.k;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class l extends d
{

    private static AtomicBoolean a = new AtomicBoolean();
    private boolean c;
    private int d;
    private boolean e;

    public l()
    {
        d = 0;
        e = false;
    }

    public void a(Void void1)
    {
        a.set(false);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        aobj = (c)aobj[0];
        if (c)
        {
            return null;
        }
          goto _L1
        Object obj;
        obj;
        ((y) (obj)).a();
        JVM INSTR lookupswitch 2: default 48
    //                   13: 214
    //                   1001: 214;
           goto _L2 _L3 _L3
_L2:
        p.df.a.e("GetSearchRecommendationsAsyncTask", "handled exception", ((Throwable) (obj)));
_L5:
        Thread.sleep(250L);
_L9:
        d = d + 1;
_L1:
        if (d >= 4)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        Object obj1;
        obj1 = ((c) (aobj)).e();
        StationRecommendations stationrecommendations = ((x) (obj1)).k();
        obj = ((c) (aobj)).w().f();
        if (stationrecommendations.e())
        {
            continue; /* Loop/switch isn't completed */
        }
        ((k) (obj)).a(stationrecommendations);
        e = true;
_L8:
        InterruptedException interruptedexception;
        org.json.JSONObject jsonobject;
        if (!e)
        {
            ((c) (aobj)).w().f().c();
            p.df.a.c("GetSearchRecommendationsAsyncTask", (new StringBuilder()).append("did not get station recommendation after ").append(d).append(" attempts.").toString());
            return null;
        } else
        {
            p.df.a.c("GetSearchRecommendationsAsyncTask", (new StringBuilder()).append("got station recommendations after ").append(d + 1).append(" attempt(s).").toString());
            return null;
        }
        if (d != 0) goto _L5; else goto _L4
_L4:
        jsonobject = ((x) (obj1)).j();
        if (jsonobject == null) goto _L5; else goto _L6
_L6:
        obj1 = ((x) (obj1)).a(jsonobject);
        if (((StationRecommendations) (obj1)).e()) goto _L5; else goto _L7
_L7:
        ((k) (obj)).a(((StationRecommendations) (obj1)));
        e = true;
          goto _L8
_L3:
        if (!isCancelled())
        {
            throw obj;
        }
          goto _L2
        interruptedexception;
        if (!isCancelled()) goto _L9; else goto _L8
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        if (a.get())
        {
            c = true;
            return;
        } else
        {
            a.set(true);
            return;
        }
    }

}
