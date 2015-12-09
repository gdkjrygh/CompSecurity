// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.libraries.uploader.service.lib.service.Uploader;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager, ImageUploadManagerRegistry, WobEncrypter

public final class  extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding appCacheDir;
    private Binding authScope;
    private Binding authUtil;
    private Binding context;
    private Binding eventBus;
    private Binding executor;
    private Binding gservicesWrapper;
    private Binding notificationManager;
    private Binding registry;
    private Binding scottyUrl;
    private Binding threadChecker;
    private Binding uploader;
    private Binding uriRegistry;
    private Binding userEventLogger;
    private Binding wobEncrypter;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        uploader = linker.requestBinding("com.google.android.libraries.uploader.service.lib.service.Uploader", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        scottyUrl = linker.requestBinding("@com.google.android.apps.wallet.wobs.upload.BindingAnnotations$ScottyUrl()/java.lang.String", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        gservicesWrapper = linker.requestBinding("com.google.android.apps.wallet.config.gservices.GservicesWrapper", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        authUtil = linker.requestBinding("com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        authScope = linker.requestBinding("@com.google.android.apps.wallet.wobs.upload.BindingAnnotations$AuthScope()/java.lang.String", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        appCacheDir = linker.requestBinding("@com.google.android.apps.wallet.wobs.upload.BindingAnnotations$ApplicationCacheDirectory()/java.io.File", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Sequential()/java.util.concurrent.Executor", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        registry = linker.requestBinding("com.google.android.apps.wallet.wobs.upload.ImageUploadManagerRegistry", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        wobEncrypter = linker.requestBinding("com.google.android.apps.wallet.wobs.upload.WobEncrypter", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/wobs/upload/ImageUploadManager, getClass().getClassLoader());
    }

    public final ImageUploadManager get()
    {
        return new ImageUploadManager((Context)context.get(), (Uploader)uploader.get(), (String)scottyUrl.get(), (GservicesWrapper)gservicesWrapper.get(), (WalletGoogleAuthUtil)authUtil.get(), (String)accountName.get(), (String)authScope.get(), (File)appCacheDir.get(), (Executor)executor.get(), (ThreadChecker)threadChecker.get(), (ImageUploadManagerRegistry)registry.get(), (EventBus)eventBus.get(), (WobEncrypter)wobEncrypter.get(), (UserEventLogger)userEventLogger.get(), (NotificationManager)notificationManager.get(), (UriRegistry)uriRegistry.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(uploader);
        set.add(scottyUrl);
        set.add(gservicesWrapper);
        set.add(authUtil);
        set.add(accountName);
        set.add(authScope);
        set.add(appCacheDir);
        set.add(executor);
        set.add(threadChecker);
        set.add(registry);
        set.add(eventBus);
        set.add(wobEncrypter);
        set.add(userEventLogger);
        set.add(notificationManager);
        set.add(uriRegistry);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.upload.ImageUploadManager", "members/com.google.android.apps.wallet.wobs.upload.ImageUploadManager", true, com/google/android/apps/wallet/wobs/upload/ImageUploadManager);
    }
}
