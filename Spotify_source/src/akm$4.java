// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.List;
import java.util.Map;
import java.util.UUID;

final class ang.Object
    implements Runnable
{

    private akm a;

    public final void run()
    {
        Object obj;
        Object obj1;
        alf alf1;
        String s;
        String s1;
        String s2;
        String s3;
        Object obj4;
        Object obj5;
        String s4;
        try
        {
            alf1 = a.d;
            obj4 = alf1.b.d();
            s = alf1.a.getPackageName();
            s1 = alf1.b.a();
            s2 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.ger.DeviceIdentifierType.d);
            s3 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.ger.DeviceIdentifierType.g);
            obj5 = alf1.b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gya.a().c("Answers", "Failed to enable events", ((Throwable) (obj)));
            return;
        }
        obj1 = null;
        obj = obj1;
        if (!((IdManager) (obj5)).a)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj5 = ((IdManager) (obj5)).f();
        obj = obj1;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = Boolean.valueOf(((gyq) (obj5)).b);
        obj1 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.ger.DeviceIdentifierType.c);
        obj4 = CommonUtils.k(alf1.a);
        obj5 = IdManager.b();
        s4 = IdManager.c();
        obj = new ald(s, UUID.randomUUID().toString(), s1, s2, s3, ((Boolean) (obj)), ((String) (obj1)), ((String) (obj4)), ((String) (obj5)), s4, alf1.c, alf1.d);
        obj1 = a.c;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        Object obj2;
        obj2 = new ale();
        gzl gzl1 = new gzl();
        Object obj3 = ((akn) (obj1)).b.a();
        obj3 = new has(((akn) (obj1)).a, ((java.io.File) (obj3)), "session_analytics.tap", "session_analytics_to_send");
        obj1 = new aky(((akn) (obj1)).a, ((ale) (obj2)), gzl1, ((han) (obj3)));
        obj2 = a;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        ((hak) (obj1)).f.add(obj2);
        a.g = new aks(a.a, a.b, a.f, ((aky) (obj1)), a.e, ((ald) (obj)));
        return;
    }

    (akm akm1)
    {
        a = akm1;
        super();
    }
}
