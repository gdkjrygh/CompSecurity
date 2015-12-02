// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import android.view.View;
import com.facebook.common.process.PrivateProcessName;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import com.google.common.cache.LoadingCache;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            InjectorLike, ContextKeyedLoadingCache, FbInjectorImpl, ModuleVerificationConfiguration, 
//            InjectableComponentWithContext, ProvisioningException, FbInjectorProvider, ScopeAwareInjector, 
//            ScopeUnawareInjector, InjectorThreadStack

public abstract class FbInjector
    implements InjectorLike
{

    private static final LoadingCache a = new ContextKeyedLoadingCache(new ContextContextScopeAwareInjectorCacheLoader((byte)0));
    private static FbInjectorProvider b;

    public FbInjector()
    {
    }

    public static FbInjector a(Context context)
    {
        return (FbInjector)a.d(context);
    }

    public static FbInjector a(Context context, List list, PrivateProcessName privateprocessname, boolean flag)
    {
        return new FbInjectorImpl(context, list, ModuleVerificationConfiguration.a(), privateprocessname, flag);
    }

    public static Key a(Class class1, Class class2)
    {
        class1 = TypeLiteral.a(new com.google.inject.internal.MoreTypes.ParameterizedTypeImpl(null, java/util/Set, new Type[] {
            class1
        }));
        if (class2 != null)
        {
            return Key.a(class1, class2);
        } else
        {
            return Key.a(class1);
        }
    }

    public static void a(Class class1, Context context)
    {
        a(class1, context, context);
    }

    public static void a(Class class1, View view)
    {
        a(class1, view, view.getContext());
    }

    public static void a(Class class1, InjectableComponentWithContext injectablecomponentwithcontext)
    {
        a(class1, injectablecomponentwithcontext, injectablecomponentwithcontext.getContext());
    }

    private static void a(Class class1, Object obj, Context context)
    {
        TracerDetour.a("FbInjector.injectMe()", 0x62ad1591);
        a(context).a(class1, obj);
        TracerDetour.a(0x866b381);
        return;
        class1;
        TracerDetour.a(0x8327670f);
        throw class1;
    }

    public static void a(String s)
    {
        throw new ProvisioningException((new StringBuilder("Invalid annotation: ")).append(s).toString());
    }

    static FbInjectorProvider b(Context context)
    {
        return c(context);
    }

    private static FbInjectorProvider c(Context context)
    {
        if (b != null)
        {
            return b;
        } else
        {
            return (FbInjectorProvider)context.getApplicationContext();
        }
    }

    protected abstract void a(Class class1, Object obj);

    public abstract ScopeAwareInjector b();

    public abstract Map g();

    public abstract Map h();

    public abstract ScopeUnawareInjector i();

    public abstract InjectorThreadStack j();


    /* member class not found */
    class ContextContextScopeAwareInjectorCacheLoader {}

}
