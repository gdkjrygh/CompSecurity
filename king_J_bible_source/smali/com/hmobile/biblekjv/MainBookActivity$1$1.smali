.class Lcom/hmobile/biblekjv/MainBookActivity$1$1;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/MainBookActivity$1;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$1$1;->this$1:Lcom/hmobile/biblekjv/MainBookActivity$1;

    .line 451
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 463
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$1$1;->this$1:Lcom/hmobile/biblekjv/MainBookActivity$1;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity$1;->access$0(Lcom/hmobile/biblekjv/MainBookActivity$1;)Lcom/hmobile/biblekjv/MainBookActivity;

    move-result-object v0

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$0(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 464
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$1$1;->this$1:Lcom/hmobile/biblekjv/MainBookActivity$1;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity$1;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity$1;->access$0(Lcom/hmobile/biblekjv/MainBookActivity$1;)Lcom/hmobile/biblekjv/MainBookActivity;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/hmobile/biblekjv/MainBookActivity;->thread:Ljava/lang/Thread;

    .line 465
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 459
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 455
    return-void
.end method
