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
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public final class akm
    implements hao
{

    final gyh a;
    final Context b;
    final akn c;
    final alf d;
    final hba e;
    final ScheduledExecutorService f;
    alb g;

    public akm(gyh gyh, Context context, akn akn, alf alf, hba hba)
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor(gze.a("Answers Events Handler"));
        gze.a("Answers Events Handler", scheduledexecutorservice);
        this(gyh, context, akn, alf, hba, scheduledexecutorservice);
    }

    private akm(gyh gyh, Context context, akn akn, alf alf, hba hba, ScheduledExecutorService scheduledexecutorservice)
    {
        g = new akr();
        a = gyh;
        b = context;
        c = akn;
        d = alf;
        e = hba;
        f = scheduledexecutorservice;
    }

    public final void a()
    {
        a(new Runnable() {

            private akm a;

            public final void run()
            {
                try
                {
                    a.g.b();
                    return;
                }
                catch (Exception exception)
                {
                    gya.a().c("Answers", "Failed to send events files", exception);
                }
            }

            
            {
                a = akm.this;
                super();
            }
        });
    }

    public final void a(alc alc, boolean flag, boolean flag1)
    {
        alc = new Runnable(alc, flag1) {

            private alc a;
            private boolean b;
            private akm c;

            public final void run()
            {
                try
                {
                    c.g.a(a);
                    if (b)
                    {
                        c.g.e();
                    }
                    return;
                }
                catch (Exception exception)
                {
                    gya.a().c("Answers", "Failed to process event", exception);
                }
            }

            
            {
                c = akm.this;
                a = alc;
                b = flag;
                super();
            }
        };
        if (flag)
        {
            try
            {
                f.submit(alc).get();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (alc alc)
            {
                gya.a().c("Answers", "Failed to run events task", alc);
            }
            return;
        } else
        {
            a(((Runnable) (alc)));
            return;
        }
    }

    final void a(Runnable runnable)
    {
        try
        {
            f.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            gya.a().c("Answers", "Failed to submit events task", runnable);
        }
    }

    // Unreferenced inner class akm$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private hbg a;
        private String b;
        private akm c;

        public final void run()
        {
            try
            {
                c.g.a(a, b);
                return;
            }
            catch (Exception exception)
            {
                gya.a().c("Answers", "Failed to set analytics settings data", exception);
            }
        }

            
            {
                c = akm.this;
                a = hbg;
                b = s;
                super();
            }
    }


    // Unreferenced inner class akm$2

/* anonymous class */
    final class _cls2
        implements Runnable
    {

        private akm a;

        public final void run()
        {
            try
            {
                alb alb1 = a.g;
                a.g = new akr();
                alb1.c();
                return;
            }
            catch (Exception exception)
            {
                gya.a().c("Answers", "Failed to disable events", exception);
            }
        }

            
            {
                a = akm.this;
                super();
            }
    }


    // Unreferenced inner class akm$4

/* anonymous class */
    final class _cls4
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
                s2 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.d);
                s3 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.g);
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
            obj1 = (String)((Map) (obj4)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c);
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

            
            {
                a = akm.this;
                super();
            }
    }

}
