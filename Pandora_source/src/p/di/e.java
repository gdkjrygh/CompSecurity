// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.ag;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.bn;

public class e extends d
{

    public e()
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
        String s = (String)aobj[0];
        String s1 = (String)aobj[1];
        Integer integer = (Integer)aobj[2];
        String s2 = (String)aobj[3];
        String s3 = (String)aobj[4];
        Boolean boolean1 = (Boolean)aobj[5];
        boolean flag = ((Boolean)aobj[6]).booleanValue();
        aobj = c.z;
        x x1 = ((c) (aobj)).e();
        x1.a(s, s1, s3, integer.intValue(), s2, boolean1.booleanValue());
        if (flag)
        {
            x1.c(false);
        }
        x1.f();
        x1.i();
        x1.n();
        ((c) (aobj)).k().b(System.currentTimeMillis());
        ((c) (aobj)).a(new bn());
        return null;
    }
}
