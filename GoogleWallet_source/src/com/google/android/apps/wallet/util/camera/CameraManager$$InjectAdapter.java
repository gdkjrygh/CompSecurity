// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.camera;

import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.camera:
//            CameraManager

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/util/camera/CameraManager, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/util/camera/CameraManager, getClass().getClassLoader());
    }

    public final CameraManager get()
    {
        return new CameraManager((ThreadChecker)threadChecker.get(), (ActionExecutor)actionExecutor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(threadChecker);
        set.add(actionExecutor);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.camera.CameraManager", "members/com.google.android.apps.wallet.util.camera.CameraManager", false, com/google/android/apps/wallet/util/camera/CameraManager);
    }
}
