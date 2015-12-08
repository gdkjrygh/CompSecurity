.class final Lkik/android/scan/fragment/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/scan/KikCode;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/scan/KikCode;)V
    .locals 0

    .prologue
    .line 591
    iput-object p1, p0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/g;->a:Lcom/kik/scan/KikCode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 596
    new-array v0, v6, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    aput-object v1, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 597
    iget-object v0, p0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v0, v0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    const-string v1, "backgroundColor"

    new-instance v2, Landroid/animation/ArgbEvaluator;

    invoke-direct {v2}, Landroid/animation/ArgbEvaluator;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/high16 v4, -0x1000000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    const/16 v4, 0xb3

    invoke-static {v4, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v0, v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 598
    new-instance v1, Lkik/android/scan/fragment/h;

    invoke-direct {v1, p0}, Lkik/android/scan/fragment/h;-><init>(Lkik/android/scan/fragment/g;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 613
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 614
    return-void
.end method
