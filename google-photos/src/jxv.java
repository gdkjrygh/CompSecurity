// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

final class jxv extends jxu
{

    private final LogEventParcelable g;

    jxv(jxq jxq1, LogEventParcelable logeventparcelable, jyn jyn)
    {
        super(jyn);
        g = logeventparcelable;
    }

    protected final jyw a(Status status)
    {
        return status;
    }

    protected final void a(jyl jyl)
    {
        jyl = (jxj)jyl;
        jxw jxw1 = new jxw(this);
        LogEventParcelable logeventparcelable;
        try
        {
            jxq.a(g);
        }
        // Misplaced declaration of an exception variable
        catch (jyl jyl)
        {
            Log.e("ClearcutLoggerApiImpl", (new StringBuilder("MessageNanoProducer ")).append(g.f.toString()).append(" threw: ").append(jyl.toString()).toString());
            return;
        }
        logeventparcelable = g;
        ((jxn)jyl.o()).a(jxw1, logeventparcelable);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof jxv))
        {
            return false;
        } else
        {
            obj = (jxv)obj;
            return g.equals(((jxv) (obj)).g);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("MethodImpl(")).append(g).append(")").toString();
    }
}
