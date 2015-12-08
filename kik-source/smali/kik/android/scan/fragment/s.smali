.class final Lkik/android/scan/fragment/s;
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
    .line 408
    iput-object p1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 412
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_loadingContainer:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_progress:Landroid/widget/ProgressBar;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 413
    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_errorImage:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v1, v1, Lkik/android/scan/fragment/ScanFragment;->_errorText:Landroid/widget/TextView;

    aput-object v1, v0, v4

    const/4 v1, 0x3

    iget-object v2, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, v2, Lkik/android/scan/fragment/ScanFragment;->_errorTitle:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, v2, Lkik/android/scan/fragment/ScanFragment;->_cameraErrorCover:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/scan/fragment/s;->a:Lkik/android/scan/fragment/ScanFragment;

    iget-object v2, v2, Lkik/android/scan/fragment/ScanFragment;->_callToActionTextView:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 414
    return-void
.end method
