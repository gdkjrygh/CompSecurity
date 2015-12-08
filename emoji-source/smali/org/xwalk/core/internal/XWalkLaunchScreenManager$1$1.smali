.class Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;
.super Ljava/lang/Object;
.source "XWalkLaunchScreenManager.java"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 118
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 119
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # invokes: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$300(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V

    .line 120
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 122
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
