// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.support.v4.app.FragmentActivity;
import com.google.wallet.wobl.renderer.android.RendererClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ProtoWoblRenderer

public final class  extends Binding
    implements Provider
{

    private Binding context;
    private Binding rendererClient;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/wobs/wobl/protorenderer/ProtoWoblRenderer, getClass().getClassLoader());
        rendererClient = linker.requestBinding("com.google.wallet.wobl.renderer.android.RendererClient", com/google/android/apps/wallet/wobs/wobl/protorenderer/ProtoWoblRenderer, getClass().getClassLoader());
    }

    public final ProtoWoblRenderer get()
    {
        return new ProtoWoblRenderer((FragmentActivity)context.get(), (RendererClient)rendererClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(rendererClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer", "members/com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer", false, com/google/android/apps/wallet/wobs/wobl/protorenderer/ProtoWoblRenderer);
    }
}
