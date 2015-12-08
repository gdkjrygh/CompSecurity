.class final Lorg/chromium/base/ApplicationStatusManager$2;
.super Lorg/chromium/base/WindowCallbackWrapper;
.source "ApplicationStatusManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/ApplicationStatusManager;->setWindowFocusChangedCallback(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/view/Window$Callback;Landroid/app/Activity;)V
    .locals 0
    .param p1, "x0"    # Landroid/view/Window$Callback;

    .prologue
    .line 100
    iput-object p2, p0, Lorg/chromium/base/ApplicationStatusManager$2;->val$activity:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lorg/chromium/base/WindowCallbackWrapper;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public onWindowFocusChanged(Z)V
    .locals 3
    .param p1, "hasFocus"    # Z

    .prologue
    .line 103
    invoke-super {p0, p1}, Lorg/chromium/base/WindowCallbackWrapper;->onWindowFocusChanged(Z)V

    .line 105
    # getter for: Lorg/chromium/base/ApplicationStatusManager;->sWindowFocusListeners:Lorg/chromium/base/ObserverList;
    invoke-static {}, Lorg/chromium/base/ApplicationStatusManager;->access$100()Lorg/chromium/base/ObserverList;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/base/ObserverList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;

    .line 106
    .local v1, "listener":Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;
    iget-object v2, p0, Lorg/chromium/base/ApplicationStatusManager$2;->val$activity:Landroid/app/Activity;

    invoke-interface {v1, v2, p1}, Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;->onWindowFocusChanged(Landroid/app/Activity;Z)V

    goto :goto_0

    .line 108
    .end local v1    # "listener":Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;
    :cond_0
    return-void
.end method
