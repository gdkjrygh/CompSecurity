.class public Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;
.super Ljava/lang/Object;
.source "LocalyticsActivityLifecycleCallbacks.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# static fields
.field private static final AMP_SESSION_CLASS_NAME:Ljava/lang/String; = "com.localytics.android.LocalyticsAmpSession"


# instance fields
.field private mSession:Lcom/localytics/android/LocalyticsSession;


# direct methods
.method public constructor <init>(Lcom/localytics/android/LocalyticsSession;)V
    .locals 2
    .param p1, "session"    # Lcom/localytics/android/LocalyticsSession;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    if-nez p1, :cond_0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "session cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 35
    :cond_0
    iput-object p1, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    .line 36
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 6
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 41
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->open()V

    .line 42
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->upload()V

    .line 43
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 44
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.localytics.android.LocalyticsAmpSession"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    const-string v1, "handleIntent"

    new-array v2, v4, [Ljava/lang/Class;

    const-class v3, Landroid/content/Intent;

    aput-object v3, v2, v5

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 98
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v2, 0x0

    .line 74
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.localytics.android.LocalyticsAmpSession"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    const-string v1, "detach"

    invoke-static {v0, v1, v2, v2}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->close()V

    .line 82
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->upload()V

    .line 83
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 7
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 58
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->open()V

    .line 59
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsSession;->upload()V

    .line 60
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.localytics.android.LocalyticsAmpSession"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    instance-of v0, p1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 64
    iget-object v1, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    const-string v2, "attach"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v0, Landroid/support/v4/app/FragmentActivity;

    aput-object v0, v3, v5

    new-array v4, v6, [Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    aput-object v0, v4, v5

    invoke-static {v1, v2, v3, v4}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    const-string v1, "handleIntent"

    new-array v2, v6, [Ljava/lang/Class;

    const-class v3, Landroid/content/Intent;

    aput-object v3, v2, v5

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/localytics/android/ReflectionUtils;->tryInvokeInstance(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/localytics/android/LocalyticsActivityLifecycleCallbacks;->mSession:Lcom/localytics/android/LocalyticsSession;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 69
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 93
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 53
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 88
    return-void
.end method
