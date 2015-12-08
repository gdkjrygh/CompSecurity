// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class m extends d
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    private a a;

    public m()
    {
    }

    public void a(Boolean boolean1)
    {
label0:
        {
            super.onPostExecute(boolean1);
            if (boolean1 != null)
            {
                if (!boolean1.booleanValue())
                {
                    break label0;
                }
                a.a();
            }
            return;
        }
        a.b();
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Boolean c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        a = (a)aobj[0];
        b.a.b().e().t();
        return Boolean.valueOf(true);
        aobj;
        p.df.a.c("GetFacebookInfoAsyncTask", (new StringBuilder()).append("GetFacebookInfoAsyncTask : ").append(((JSONException) (aobj)).getMessage()).toString());
_L2:
        return Boolean.valueOf(false);
        aobj;
        p.df.a.c("GetFacebookInfoAsyncTask", (new StringBuilder()).append("GetFacebookInfoAsyncTask : ").append(((q) (aobj)).getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        aobj;
        p.df.a.c("GetFacebookInfoAsyncTask", (new StringBuilder()).append("GetFacebookInfoAsyncTask : ").append(((n) (aobj)).getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        aobj;
        if (p.cx.m.a(((y) (aobj)).a()))
        {
            throw aobj;
        }
        p.df.a.c("GetFacebookInfoAsyncTask", (new StringBuilder()).append("GetFacebookInfoAsyncTask : ").append(((y) (aobj)).getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        aobj;
        p.df.a.c("GetFacebookInfoAsyncTask", (new StringBuilder()).append("GetFacebookInfoAsyncTask : ").append(((RuntimeException) (aobj)).getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
