.class Lcom/thetransitapp/droid/widget/PopoverView$2;
.super Ljava/lang/Object;
.source "PopoverView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/PopoverView;->dissmissPopover(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/PopoverView;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/PopoverView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    .line 414
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 427
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    # getter for: Lcom/thetransitapp/droid/widget/PopoverView;->popoverView:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/PopoverView;->access$1(Lcom/thetransitapp/droid/widget/PopoverView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 428
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/PopoverView;->removeAllViews()V

    .line 429
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    # getter for: Lcom/thetransitapp/droid/widget/PopoverView;->superview:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/thetransitapp/droid/widget/PopoverView;->access$2(Lcom/thetransitapp/droid/widget/PopoverView;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 431
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView$2;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/thetransitapp/droid/widget/PopoverView;->access$0(Lcom/thetransitapp/droid/widget/PopoverView;Z)V

    .line 432
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 423
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 418
    return-void
.end method
