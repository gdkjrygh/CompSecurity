.class final Lorg/chromium/base/MemoryPressureListener$1;
.super Ljava/lang/Object;
.source "MemoryPressureListener.java"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/MemoryPressureListener;->registerSystemCallback(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0
    .param p1, "configuration"    # Landroid/content/res/Configuration;

    .prologue
    .line 61
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x2

    # invokes: Lorg/chromium/base/MemoryPressureListener;->nativeOnMemoryPressure(I)V
    invoke-static {v0}, Lorg/chromium/base/MemoryPressureListener;->access$000(I)V

    .line 57
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0
    .param p1, "level"    # I

    .prologue
    .line 51
    invoke-static {p1}, Lorg/chromium/base/MemoryPressureListener;->maybeNotifyMemoryPresure(I)V

    .line 52
    return-void
.end method
