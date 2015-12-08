.class final Lkik/android/widget/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lkik/android/widget/FragmentContainerFrame;


# direct methods
.method constructor <init>(Lkik/android/widget/FragmentContainerFrame;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/widget/x;->b:Lkik/android/widget/FragmentContainerFrame;

    iput-object p2, p0, Lkik/android/widget/x;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lkik/android/widget/x;->a:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    iget-object v0, p0, Lkik/android/widget/x;->b:Lkik/android/widget/FragmentContainerFrame;

    new-instance v1, Lkik/android/widget/y;

    invoke-direct {v1, p0}, Lkik/android/widget/y;-><init>(Lkik/android/widget/x;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/FragmentContainerFrame;->post(Ljava/lang/Runnable;)Z

    .line 56
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 61
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 43
    return-void
.end method
