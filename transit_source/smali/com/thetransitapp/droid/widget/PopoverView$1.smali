.class Lcom/thetransitapp/droid/widget/PopoverView$1;
.super Ljava/lang/Object;
.source "PopoverView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/PopoverView;->showPopoverFromRectInViewGroup(Landroid/view/ViewGroup;Landroid/graphics/Rect;IZ)V
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
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PopoverView$1;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    .line 384
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 397
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PopoverView$1;->this$0:Lcom/thetransitapp/droid/widget/PopoverView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/thetransitapp/droid/widget/PopoverView;->access$0(Lcom/thetransitapp/droid/widget/PopoverView;Z)V

    .line 398
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 393
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 388
    return-void
.end method
