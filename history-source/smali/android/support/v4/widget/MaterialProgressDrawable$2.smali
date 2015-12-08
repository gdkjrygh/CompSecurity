.class Landroid/support/v4/widget/MaterialProgressDrawable$2;
.super Ljava/lang/Object;
.source "MaterialProgressDrawable.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/widget/MaterialProgressDrawable;->setupAnimators()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

.field final synthetic val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/MaterialProgressDrawable;Landroid/support/v4/widget/MaterialProgressDrawable$Ring;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    iput-object p2, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 321
    iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->goToNextColor()V

    .line 322
    iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->storeOriginals()V

    .line 323
    iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setShowArrow(Z)V

    .line 324
    iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    # getter for: Landroid/support/v4/widget/MaterialProgressDrawable;->mParent:Landroid/view/View;
    invoke-static {v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$300(Landroid/support/v4/widget/MaterialProgressDrawable;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    # getter for: Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    invoke-static {v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$200(Landroid/support/v4/widget/MaterialProgressDrawable;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 325
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 329
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 317
    return-void
.end method
