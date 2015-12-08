.class Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;
.super Landroid/os/Handler;
.source "XWalkSettings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->bindUiThread()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkSettings$EventHandler;Landroid/os/Looper;)V
    .locals 0
    .param p2, "x0"    # Landroid/os/Looper;

    .prologue
    .line 94
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;->this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 97
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 106
    :goto_0
    return-void

    .line 99
    :pswitch_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;->this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->this$0:Lorg/xwalk/core/internal/XWalkSettings;

    # getter for: Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings;->access$100(Lorg/xwalk/core/internal/XWalkSettings;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 100
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;->this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->this$0:Lorg/xwalk/core/internal/XWalkSettings;

    # invokes: Lorg/xwalk/core/internal/XWalkSettings;->updateWebkitPreferencesOnUiThread()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings;->access$200(Lorg/xwalk/core/internal/XWalkSettings;)V

    .line 101
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;->this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->this$0:Lorg/xwalk/core/internal/XWalkSettings;

    const/4 v2, 0x0

    # setter for: Lorg/xwalk/core/internal/XWalkSettings;->mIsUpdateWebkitPrefsMessagePending:Z
    invoke-static {v0, v2}, Lorg/xwalk/core/internal/XWalkSettings;->access$302(Lorg/xwalk/core/internal/XWalkSettings;Z)Z

    .line 102
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler$1;->this$1:Lorg/xwalk/core/internal/XWalkSettings$EventHandler;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkSettings$EventHandler;->this$0:Lorg/xwalk/core/internal/XWalkSettings;

    # getter for: Lorg/xwalk/core/internal/XWalkSettings;->mXWalkSettingsLock:Ljava/lang/Object;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkSettings;->access$100(Lorg/xwalk/core/internal/XWalkSettings;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 103
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
