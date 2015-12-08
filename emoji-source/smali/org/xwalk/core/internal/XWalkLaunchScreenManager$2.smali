.class Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;
.super Landroid/content/BroadcastReceiver;
.source "XWalkLaunchScreenManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->registerBroadcastReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V
    .locals 0

    .prologue
    .line 554
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 557
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    const/4 v1, 0x1

    # setter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCustomHideLaunchScreen:Z
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$902(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Z)Z

    .line 558
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # invokes: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->hideLaunchScreenWhenReady()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$1000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V

    .line 559
    return-void
.end method
