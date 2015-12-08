.class Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;
.super Landroid/view/OrientationEventListener;
.source "XWalkLaunchScreenManager.java"


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
.method constructor <init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;Landroid/content/Context;I)V
    .locals 0
    .param p2, "x0"    # Landroid/content/Context;
    .param p3, "x1"    # I

    .prologue
    .line 138
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 4
    .param p1, "ori"    # I

    .prologue
    .line 140
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    move-result v2

    if-nez v2, :cond_1

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getScreenOrientation()I

    move-result v0

    .line 144
    .local v0, "orientation":I
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCurrentOrientation:I
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$600(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 145
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v3, v3, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->val$imageBorderList:Ljava/lang/String;

    # invokes: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getLaunchScreenLayout(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    invoke-static {v2, v3}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$400(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v1

    .line 146
    .local v1, "root":Landroid/widget/RelativeLayout;
    if-eqz v1, :cond_0

    .line 147
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;->this$1:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    iget-object v2, v2, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_0
.end method
