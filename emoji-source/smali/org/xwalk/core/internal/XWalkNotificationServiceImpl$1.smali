.class Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$1;
.super Landroid/content/BroadcastReceiver;
.source "XWalkNotificationServiceImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;-><init>(Landroid/content/Context;Lorg/xwalk/core/internal/XWalkViewInternal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$1;->this$0:Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 67
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$1;->this$0:Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;

    # getter for: Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->access$000(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)Lorg/xwalk/core/internal/XWalkViewInternal;

    move-result-object v0

    invoke-virtual {v0, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->onNewIntent(Landroid/content/Intent;)Z

    .line 68
    return-void
.end method
