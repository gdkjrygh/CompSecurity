.class final Lkik/android/scan/fragment/h;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/g;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/g;)V
    .locals 0

    .prologue
    .line 598
    iput-object p1, p0, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    .line 602
    iget-object v0, p0, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    iget-object v0, v0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->h(Lkik/android/scan/fragment/ScanFragment;)V

    .line 603
    iget-object v0, p0, Lkik/android/scan/fragment/h;->a:Lkik/android/scan/fragment/g;

    iget-object v0, v0, Lkik/android/scan/fragment/g;->b:Lkik/android/scan/fragment/ScanFragment;

    iget-object v0, v0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    new-instance v1, Lkik/android/scan/fragment/i;

    invoke-direct {v1, p0}, Lkik/android/scan/fragment/i;-><init>(Lkik/android/scan/fragment/h;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 611
    return-void
.end method
