.class public Lkik/android/widget/GifWidget$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/GifWidget;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e011e

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624222\' for field \'_gifFrame\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_gifFrame:Landroid/widget/FrameLayout;

    .line 15
    const v0, 0x7f0e0122

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624226\' for field \'_featuredButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_featuredButton:Landroid/widget/FrameLayout;

    .line 20
    const v0, 0x7f0e0124

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624228\' for field \'_searchButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_searchButton:Landroid/widget/FrameLayout;

    .line 25
    const v0, 0x7f0e0120

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624224\' for field \'_trendingButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_trendingButton:Landroid/widget/FrameLayout;

    .line 30
    const v0, 0x7f0e0125

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624229\' for field \'_searchButtonImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_searchButtonImage:Landroid/widget/ImageView;

    .line 35
    const v0, 0x7f0e0123

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_5

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624227\' for field \'_featuredButtonImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_5
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_featuredButtonImage:Landroid/widget/ImageView;

    .line 40
    const v0, 0x7f0e0121

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624225\' for field \'_trendingButtonImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_6
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_trendingButtonImage:Landroid/widget/ImageView;

    .line 45
    const v0, 0x7f0e011f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-nez v0, :cond_7

    .line 47
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624223\' for field \'_buttonBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_7
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_buttonBar:Landroid/widget/LinearLayout;

    .line 50
    const v0, 0x7f0e011d

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 51
    if-nez v0, :cond_8

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624221\' for field \'_selectionView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_8
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_selectionView:Landroid/widget/FrameLayout;

    .line 55
    const v0, 0x7f0e0126

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 56
    if-nez v0, :cond_9

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624230\' for field \'_previewView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_9
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_previewView:Landroid/widget/FrameLayout;

    .line 60
    const v0, 0x7f0e0127

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 61
    if-nez v0, :cond_a

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624231\' for field \'_previewImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_a
    check-cast v0, Lkik/android/gifs/view/AspectRatioGifView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    .line 65
    const v0, 0x7f0e0128

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 66
    if-nez v0, :cond_b

    .line 67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624232\' for field \'_rechooseButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_b
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_rechooseButton:Landroid/widget/ImageView;

    .line 70
    const v0, 0x7f0e0129

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 71
    if-nez v0, :cond_c

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624233\' for field \'_gifUseButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_c
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    .line 75
    const v0, 0x7f0e012a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 76
    if-nez v0, :cond_d

    .line 77
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624234\' for field \'_gifsCantLoad\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_d
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lkik/android/widget/GifWidget;->_gifsCantLoad:Landroid/widget/LinearLayout;

    .line 80
    return-void
.end method

.method public static reset(Lkik/android/widget/GifWidget;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_gifFrame:Landroid/widget/FrameLayout;

    .line 84
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_featuredButton:Landroid/widget/FrameLayout;

    .line 85
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_searchButton:Landroid/widget/FrameLayout;

    .line 86
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_trendingButton:Landroid/widget/FrameLayout;

    .line 87
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_searchButtonImage:Landroid/widget/ImageView;

    .line 88
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_featuredButtonImage:Landroid/widget/ImageView;

    .line 89
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_trendingButtonImage:Landroid/widget/ImageView;

    .line 90
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_buttonBar:Landroid/widget/LinearLayout;

    .line 91
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_selectionView:Landroid/widget/FrameLayout;

    .line 92
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_previewView:Landroid/widget/FrameLayout;

    .line 93
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    .line 94
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_rechooseButton:Landroid/widget/ImageView;

    .line 95
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_gifUseButton:Landroid/widget/ImageView;

    .line 96
    iput-object v0, p0, Lkik/android/widget/GifWidget;->_gifsCantLoad:Landroid/widget/LinearLayout;

    .line 97
    return-void
.end method
