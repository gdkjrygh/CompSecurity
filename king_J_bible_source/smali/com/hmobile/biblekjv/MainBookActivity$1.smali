.class Lcom/hmobile/biblekjv/MainBookActivity$1;
.super Landroid/os/Handler;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 445
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/MainBookActivity$1;)Lcom/hmobile/biblekjv/MainBookActivity;
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    return-object v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 448
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-boolean v1, v1, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    if-eqz v1, :cond_0

    .line 450
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    const v2, 0x7f040004

    .line 449
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 451
    .local v0, "fadeInAnimation":Landroid/view/animation/Animation;
    new-instance v1, Lcom/hmobile/biblekjv/MainBookActivity$1$1;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/MainBookActivity$1$1;-><init>(Lcom/hmobile/biblekjv/MainBookActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 467
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$0(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 469
    .end local v0    # "fadeInAnimation":Landroid/view/animation/Animation;
    :cond_0
    return-void
.end method
