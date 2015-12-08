.class final Lkik/android/util/cx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 0

    .prologue
    .line 779
    iput-object p1, p0, Lkik/android/util/cx;->a:Landroid/view/View;

    iput-object p2, p0, Lkik/android/util/cx;->b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .prologue
    .line 783
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 784
    iget-object v1, p0, Lkik/android/util/cx;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 785
    iget-object v0, p0, Lkik/android/util/cx;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 786
    iget-object v0, p0, Lkik/android/util/cx;->b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    if-eqz v0, :cond_0

    .line 787
    iget-object v0, p0, Lkik/android/util/cx;->b:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-interface {v0, p1}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    .line 789
    :cond_0
    return-void
.end method
