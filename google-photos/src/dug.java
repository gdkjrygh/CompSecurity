// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import java.lang.reflect.Method;

public final class dug
{

    public volatile Object a;
    private final Object b = new Object();

    public dug()
    {
    }

    public void a(Application application)
    {
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = a;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Class class1 = Class.forName("com.google.apps.tiktok.inject.compatrootmodule.ComponentCreator");
        a = class1.getMethod("createComponent", new Class[] {
            android/app/Application
        }).invoke(class1.newInstance(), new Object[] {
            application
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        application;
        throw new RuntimeException(application);
        application;
        obj;
        JVM INSTR monitorexit ;
        throw application;
    }
}
