// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.provider.k;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.av;

public class h extends d
{

    public h()
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
        c c1 = (c)aobj[0];
        StationRecommendations stationrecommendations = (StationRecommendations)aobj[1];
        aobj = (StationRecommendation)aobj[2];
        c1.w().f().a(((StationRecommendation) (aobj)));
        c1.e().d(((StationRecommendation) (aobj)).n());
        boolean flag;
        if (stationrecommendations == null || stationrecommendations.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.a(new av(flag));
        return null;
    }
}
