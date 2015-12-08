// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import java.io.File;
import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android:
//            InitializationTask, Fabric, FabricContext, InitializationCallback

public abstract class Kit
    implements Comparable
{

    Fabric b;
    InitializationTask c;
    Context d;
    InitializationCallback e;
    IdManager f;

    public Kit()
    {
        c = new InitializationTask(this);
    }

    final void A()
    {
        c.a(b.e(), new Void[] {
            (Void)null
        });
    }

    protected IdManager B()
    {
        return f;
    }

    public Context C()
    {
        return d;
    }

    public Fabric D()
    {
        return b;
    }

    public String E()
    {
        return (new StringBuilder()).append(".Fabric").append(File.separator).append(c()).toString();
    }

    boolean F()
    {
        return (DependsOn)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn) != null;
    }

    protected Collection G()
    {
        return c.c();
    }

    public int a(Kit kit)
    {
        if (!b(kit))
        {
            if (kit.b(this))
            {
                return -1;
            }
            if (!F() || kit.F())
            {
                return F() || !kit.F() ? 0 : -1;
            }
        }
        return 1;
    }

    void a(Context context, Fabric fabric, InitializationCallback initializationcallback, IdManager idmanager)
    {
        b = fabric;
        d = new FabricContext(context, c(), E());
        e = initializationcallback;
        f = idmanager;
    }

    protected void a(Object obj)
    {
    }

    protected boolean a()
    {
        return true;
    }

    protected void b(Object obj)
    {
    }

    boolean b(Kit kit)
    {
        DependsOn dependson = (DependsOn)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
        if (dependson != null)
        {
            Class aclass[] = dependson.a();
            int j = aclass.length;
            for (int i = 0; i < j; i++)
            {
                if (aclass[i].equals(kit.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public abstract String c();

    public int compareTo(Object obj)
    {
        return a((Kit)obj);
    }

    public abstract String d();

    protected abstract Object z();
}
