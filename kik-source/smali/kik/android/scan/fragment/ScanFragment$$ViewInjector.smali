.class public Lkik/android/scan/fragment/ScanFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/scan/fragment/ScanFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e01ca

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624394\' for field \'_scanContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    .line 15
    const v0, 0x7f0e01cf

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624399\' for field \'_animationContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    .line 20
    const v0, 0x7f0e01d0

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624400\' for field \'_loadingContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_loadingContainer:Landroid/view/View;

    .line 25
    const v0, 0x7f0e01d1

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624401\' for field \'_progress\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_progress:Landroid/widget/ProgressBar;

    .line 30
    const v0, 0x7f0e01d2

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624402\' for field \'_errorImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_errorImage:Landroid/view/View;

    .line 35
    const v0, 0x7f0e01d3

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_5

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624403\' for field \'_errorTitle\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_5
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_errorTitle:Landroid/widget/TextView;

    .line 40
    const v0, 0x7f0e00be

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624126\' for field \'_cameraErrorCover\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_6
    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_cameraErrorCover:Landroid/view/View;

    .line 45
    const v0, 0x7f0e01cd

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-nez v0, :cond_7

    .line 47
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624397\' for field \'_scanFinder\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_7
    check-cast v0, Lkik/android/scan/widget/ScannerViewFinder;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_scanFinder:Lkik/android/scan/widget/ScannerViewFinder;

    .line 50
    const v0, 0x7f0e01cc

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 51
    if-nez v0, :cond_8

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624396\' for field \'_resultImageView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_8
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    .line 55
    const v0, 0x7f0e01ce

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 56
    if-nez v0, :cond_9

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624398\' for field \'_callToActionTextView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_9
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_callToActionTextView:Landroid/widget/TextView;

    .line 60
    const v0, 0x7f0e01cb

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 61
    if-nez v0, :cond_a

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624395\' for field \'_cameraBlurView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_a
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0e01d4

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 66
    if-nez v0, :cond_b

    .line 67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624404\' for field \'_errorText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_b
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_errorText:Landroid/widget/TextView;

    .line 70
    const v0, 0x7f0e01d5

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 71
    if-nez v0, :cond_c

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624405\' for field \'_errorRetryButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_c
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    .line 75
    return-void
.end method

.method public static reset(Lkik/android/scan/fragment/ScanFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_scanContainer:Landroid/view/ViewGroup;

    .line 79
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_animationContainer:Landroid/view/View;

    .line 80
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_loadingContainer:Landroid/view/View;

    .line 81
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_progress:Landroid/widget/ProgressBar;

    .line 82
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_errorImage:Landroid/view/View;

    .line 83
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_errorTitle:Landroid/widget/TextView;

    .line 84
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraErrorCover:Landroid/view/View;

    .line 85
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_scanFinder:Lkik/android/scan/widget/ScannerViewFinder;

    .line 86
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_resultImageView:Landroid/widget/ImageView;

    .line 87
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_callToActionTextView:Landroid/widget/TextView;

    .line 88
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_cameraBlurView:Landroid/widget/ImageView;

    .line 89
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_errorText:Landroid/widget/TextView;

    .line 90
    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment;->_errorRetryButton:Landroid/widget/TextView;

    .line 91
    return-void
.end method
