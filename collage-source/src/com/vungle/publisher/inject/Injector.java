// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.inject;

import android.content.Context;
import com.vungle.log.Logger;
import com.vungle.publisher.cg;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.image.BitmapFactory;
import dagger.ObjectGraph;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vungle.publisher.inject:
//            ConfigurablePublisherModule

public class Injector
    implements cg
{

    private static final Injector b = new Injector();
    public ObjectGraph a;
    private boolean c;
    private List d;
    private cg e;

    private Injector()
    {
        d = new ArrayList();
    }

    private cg a()
    {
        if (e == null)
        {
            e = new ConfigurablePublisherModule();
        }
        return e;
    }

    public static Injector getInstance()
    {
        return b;
    }

    public final void a(Context context, String s)
    {
        if (c)
        {
            Logger.d("VungleInject", "already initialized");
            return;
        }
        try
        {
            Logger.d("VungleInject", "initializing");
            cg cg1 = a();
            cg1.a(context, s);
            context = new ArrayList();
            context.add(cg1);
            context.addAll(d);
            a = ObjectGraph.create(context.toArray());
            c = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.e("VungleInject", "error initializing injector", context);
        }
        return;
    }

    public final void a(Class class1)
    {
        if (c)
        {
            Logger.d("VungleInject", "full screen ad activity class in injector NOT set - already initialized");
            return;
        }
        try
        {
            Logger.d("VungleInject", (new StringBuilder("setting full screen ad activity class in injector ")).append(class1).toString());
            a().a(class1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            Logger.e("VungleInject", class1);
        }
        return;
    }

    public void setBitmapFactory(BitmapFactory bitmapfactory)
    {
        if (c)
        {
            Logger.d("VungleInject", "bitmap factory in injector NOT set - already initialized");
            return;
        }
        try
        {
            Logger.d("VungleInject", (new StringBuilder("setting bitmap factory in injector ")).append(bitmapfactory).toString());
            a().setBitmapFactory(bitmapfactory);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitmapFactory bitmapfactory)
        {
            Logger.e("VungleInject", bitmapfactory);
        }
        return;
    }

    public void setWrapperFramework(WrapperFramework wrapperframework)
    {
        if (c)
        {
            Logger.d("VungleInject", "wrapper framework in injector NOT set - already initialized");
            return;
        }
        try
        {
            Logger.d("VungleInject", (new StringBuilder("setting wrapper framework in injector: ")).append(wrapperframework).toString());
            a().setWrapperFramework(wrapperframework);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WrapperFramework wrapperframework)
        {
            Logger.e("VungleInject", wrapperframework);
        }
        return;
    }

    public void setWrapperFrameworkVersion(String s)
    {
        if (c)
        {
            Logger.d("VungleInject", "wrapper framework version in injector NOT set - already initialized");
            return;
        }
        try
        {
            Logger.d("VungleInject", (new StringBuilder("setting wrapper framework version in injector: ")).append(s).toString());
            a().setWrapperFrameworkVersion(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.e("VungleInject", s);
        }
        return;
    }

}
