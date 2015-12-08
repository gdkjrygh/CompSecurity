.class final Lkik/android/scan/fragment/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 0

    .prologue
    .line 486
    iput-object p1, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 491
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_loadingContainer:Landroid/view/View;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, v2, Lkik/android/scan/fragment/ScanFragment;->_progress:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 493
    new-instance v0, Lkik/android/scan/widget/a;

    invoke-direct {v0, v3}, Lkik/android/scan/widget/a;-><init>(I)V

    .line 494
    iget-object v1, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v1}, Lkik/android/scan/fragment/ScanFragment;->i(Lkik/android/scan/fragment/ScanFragment;)I

    move-result v1

    iget-object v2, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, v2, Lkik/android/scan/fragment/ScanFragment;->_scanFinder:Lkik/android/scan/widget/ScannerViewFinder;

    invoke-virtual {v2}, Lkik/android/scan/widget/ScannerViewFinder;->a()Landroid/graphics/Point;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/scan/widget/a;->a(ILandroid/graphics/Point;)V

    .line 495
    iget-object v1, p0, Lkik/android/scan/fragment/d;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 496
    return-void
.end method
