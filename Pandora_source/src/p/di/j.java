// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.provider.i;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.au;
import p.df.a;

public class j extends d
{

    public j()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        c c1 = (c)aobj[0];
        Object obj = (String)aobj[1];
        aobj = c1.e().a(((String) (obj)), true);
        obj = c1.y().a(c1.s(), ((String) (obj)));
        if (obj != null)
        {
            ((com.pandora.radio.data.y) (aobj)).a(((com.pandora.radio.data.y) (obj)).b());
        }
        a.a("GetExtendedStationAsyncTask", (new StringBuilder()).append(" post StationPersonalizationChangeRadioEvent ").append(((com.pandora.radio.data.y) (aobj)).E()).toString());
        c1.a(new au(((com.pandora.radio.data.y) (aobj)), p.dd.au.a.a));
        return null;
    }
}
