// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import org.json.JSONException;
import p.bx.e;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.y;
import p.df.a;

public class ag extends d
{

    public ag()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        boolean flag = false;
        int i = ((Integer)aobj[0]).intValue();
        aa aa1 = (aa)aobj[1];
        String s1 = (String)aobj[2];
        Object obj = (String)aobj[3];
        if (aobj.length > 4)
        {
            flag = ((Boolean)aobj[4]).booleanValue();
        }
        while (i == 1 && s.a(s1) || i == 2 && aa1 == null) 
        {
            return null;
        }
        aobj = b.a.d().j();
        if (i == 2)
        {
            aobj = p.cp.b.a(((String) (aobj)), aa1, s1, flag);
        } else
        {
            aobj = p.cp.b.b(((String) (aobj)), s1);
        }
        a.a("SendShareToTwitterAsyncTask", (new StringBuilder()).append("SHARE: short 'smart' url: ").append(((String) (aobj))).toString());
        obj = (new StringBuilder()).append(((String) (obj)));
        if (aobj != null)
        {
            aobj = (new StringBuilder()).append(" ").append(((String) (aobj))).toString();
        } else
        {
            aobj = "";
        }
        aobj = ((StringBuilder) (obj)).append(((String) (aobj))).toString();
        p.bx.d.b().a(((String) (aobj)));
        return null;
    }
}
