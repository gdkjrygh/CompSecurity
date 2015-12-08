// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.snapchat.android.api2.IpRoutingErrorTask;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class ms extends oD
{

    public static final String PATH = "/bq/ip_routing";
    private final Gson mGson;
    private final Pk mUrlRoutingManager;
    private final Bt mUserPrefs;

    public ms()
    {
        this(Pk.a(), Bt.a(), It.a());
    }

    private ms(Pk pk, Bt bt, Gson gson)
    {
        mUrlRoutingManager = pk;
        mUserPrefs = bt;
        mGson = gson;
    }

    private static void a(com.snapchat.android.api2.IpRoutingErrorTask.ErrorType errortype, String s)
    {
        (new IpRoutingErrorTask(errortype, s)).execute();
    }

    public final String getPath()
    {
        return "/bq/ip_routing";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Rp()).a(Bt.q()).b(mUrlRoutingManager.c())));
    }

    public final void onResult(pi pi1)
    {
        if (!pi1.c())
        {
            if (pi1.mCaughtException == null)
            {
                pi1 = Integer.toString(pi1.mResponseCode);
            } else
            {
                pi1 = pi1.mCaughtException.toString();
            }
            a(com.snapchat.android.api2.IpRoutingErrorTask.ErrorType.NETWORK_ERROR, pi1);
            return;
        }
        Object obj;
        pi1 = pi1.d();
        obj = (Rq)mGson.fromJson(pi1, Rq);
        pi1 = mUrlRoutingManager;
        obj = ((Rq) (obj)).a();
        ((Pk) (pi1)).mUrlRoutingRWLock.writeLock().lock();
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        obj = pi1.b(((String) (obj)));
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((Map) (obj)).entrySet().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
_L4:
        String s;
        Object obj1;
        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        s = (String)((java.util.Map.Entry) (obj1)).getKey();
        obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
        if (s == null || obj1 == null) goto _L7; else goto _L6
_L6:
        ((Pk) (pi1)).mUrlRoutingMap.put(s, obj1);
          goto _L7
        Exception exception;
        exception;
        ((Pk) (pi1)).mUrlRoutingRWLock.writeLock().unlock();
        throw exception;
        pi1;
_L9:
        a(com.snapchat.android.api2.IpRoutingErrorTask.ErrorType.JSON_ERROR, pi1.toString());
        return;
_L5:
        pi1.mSerializedUrlRoutingMap = ID.a(((Pk) (pi1)).mUrlRoutingMap);
        Bt.v(((Pk) (pi1)).mSerializedUrlRoutingMap);
_L2:
        ((Pk) (pi1)).mUrlRoutingRWLock.writeLock().unlock();
        return;
        pi1;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
