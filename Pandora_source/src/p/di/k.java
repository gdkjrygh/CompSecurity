// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.PromotedStation;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ah;

public class k extends h
{

    private c a;
    private Hashtable c;

    public k(Map map)
    {
        if (map != null)
        {
            c = new Hashtable(map);
        }
    }

    public k a()
    {
        return new k(c);
    }

    public void a(PromotedStation promotedstation)
    {
        if (promotedstation != null)
        {
            c c1 = a;
            PromotedStation promotedstation1;
            if (promotedstation.g())
            {
                promotedstation1 = promotedstation;
            } else
            {
                promotedstation1 = null;
            }
            c1.a(new ah(promotedstation1));
            a.o().b(promotedstation.n(), g());
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public h b()
    {
        return a();
    }

    public transient PromotedStation c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        a = (c)aobj[0];
        return a.e().b(c);
    }

    public void onPostExecute(Object obj)
    {
        a((PromotedStation)obj);
    }
}
