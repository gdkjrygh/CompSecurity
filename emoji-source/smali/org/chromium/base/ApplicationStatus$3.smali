.class final Lorg/chromium/base/ApplicationStatus$3;
.super Ljava/lang/Object;
.source "ApplicationStatus.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/ApplicationStatus;->registerThreadSafeNativeApplicationStateListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 416
    # getter for: Lorg/chromium/base/ApplicationStatus;->sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->access$300()Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 425
    :goto_0
    return-void

    .line 418
    :cond_0
    new-instance v0, Lorg/chromium/base/ApplicationStatus$3$1;

    invoke-direct {v0, p0}, Lorg/chromium/base/ApplicationStatus$3$1;-><init>(Lorg/chromium/base/ApplicationStatus$3;)V

    # setter for: Lorg/chromium/base/ApplicationStatus;->sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    invoke-static {v0}, Lorg/chromium/base/ApplicationStatus;->access$302(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    .line 424
    # getter for: Lorg/chromium/base/ApplicationStatus;->sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->access$300()Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/base/ApplicationStatus;->registerApplicationStateListener(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)V

    goto :goto_0
.end method
