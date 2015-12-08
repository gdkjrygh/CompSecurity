.class Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;
.super Ljava/lang/Object;
.source "XWalkLaunchScreenManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->displayLaunchScreen(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

.field final synthetic val$imageBorderList:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->val$imageBorderList:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    .line 100
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const-string v6, "launchscreen_bg"

    const-string v7, "drawable"

    iget-object v8, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v8}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 102
    .local v1, "bgResId":I
    if-nez v1, :cond_1

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 104
    .local v0, "bgDrawable":Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_0

    .line 106
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    new-instance v6, Landroid/app/Dialog;

    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLibContext:Landroid/content/Context;
    invoke-static {v7}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$200(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/content/Context;

    move-result-object v7

    const v8, 0x10300f0

    invoke-direct {v6, v7, v8}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    # setter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5, v6}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$102(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 109
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v3

    .line 110
    .local v3, "parentVisibility":I
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    .line 111
    .local v2, "parentParams":Landroid/view/WindowManager$LayoutParams;
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 112
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 114
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    new-instance v6, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;

    invoke-direct {v6, p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$1;-><init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;)V

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 125
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 126
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 128
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 130
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->val$imageBorderList:Ljava/lang/String;

    # invokes: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getLaunchScreenLayout(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    invoke-static {v5, v6}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$400(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v4

    .line 133
    .local v4, "root":Landroid/widget/RelativeLayout;
    if-eqz v4, :cond_2

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 134
    :cond_2
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 137
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    new-instance v6, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;

    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;
    invoke-static {v7}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;

    move-result-object v7

    const/4 v8, 0x3

    invoke-direct {v6, p0, v7, v8}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1$2;-><init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;Landroid/content/Context;I)V

    # setter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;
    invoke-static {v5, v6}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$502(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Landroid/view/OrientationEventListener;)Landroid/view/OrientationEventListener;

    .line 151
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$500(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/view/OrientationEventListener;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/OrientationEventListener;->enable()V

    .line 152
    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # getter for: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$700(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    move-result-object v5

    sget-object v6, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v5, v6, :cond_0

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;->this$0:Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    # invokes: Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->registerBroadcastReceiver()V
    invoke-static {v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->access$800(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V

    goto/16 :goto_0
.end method
