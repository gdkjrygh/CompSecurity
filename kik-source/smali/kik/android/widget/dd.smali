.class final Lkik/android/widget/dd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lkik/android/widget/ProgressWidget;


# direct methods
.method constructor <init>(Lkik/android/widget/ProgressWidget;)V
    .locals 0

    .prologue
    .line 307
    iput-object p1, p0, Lkik/android/widget/dd;->a:Lkik/android/widget/ProgressWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    .line 317
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/widget/dd;->a:Lkik/android/widget/ProgressWidget;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 318
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 324
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 312
    return-void
.end method
