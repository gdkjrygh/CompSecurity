.class final Lorg/chromium/base/ApplicationStatus$2;
.super Ljava/lang/Object;
.source "ApplicationStatus.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/ApplicationStatus;->initialize(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 134
    const/4 v0, 0x1

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 135
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 139
    const/4 v0, 0x6

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 140
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 144
    const/4 v0, 0x4

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 145
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 149
    const/4 v0, 0x3

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 150
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 153
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 157
    const/4 v0, 0x2

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 158
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 162
    const/4 v0, 0x5

    # invokes: Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V
    invoke-static {p1, v0}, Lorg/chromium/base/ApplicationStatus;->access$100(Landroid/app/Activity;I)V

    .line 163
    return-void
.end method
