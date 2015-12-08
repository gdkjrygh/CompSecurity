.class public Lkik/android/widget/GalleryWidget$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/GalleryWidget;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e0111

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624209\' for field \'_folderDropdown\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Lkik/android/util/KikSpinner;

    iput-object v0, p1, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    .line 15
    const v0, 0x7f0e0112

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624210\' for field \'_grid\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p1, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    .line 20
    const v0, 0x7f0e0110

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624208\' for field \'_noPhotosText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/widget/GalleryWidget;->_noPhotosText:Landroid/widget/TextView;

    .line 25
    const v0, 0x7f0e0113

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624211\' for field \'_dimBackground\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    iput-object v0, p1, Lkik/android/widget/GalleryWidget;->_dimBackground:Landroid/view/View;

    .line 30
    const v0, 0x7f0e010f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624207\' for field \'_topDivider\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    iput-object v0, p1, Lkik/android/widget/GalleryWidget;->_topDivider:Landroid/view/View;

    .line 35
    return-void
.end method

.method public static reset(Lkik/android/widget/GalleryWidget;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->_folderDropdown:Lkik/android/util/KikSpinner;

    .line 39
    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->_grid:Landroid/widget/GridView;

    .line 40
    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->_noPhotosText:Landroid/widget/TextView;

    .line 41
    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->_dimBackground:Landroid/view/View;

    .line 42
    iput-object v0, p0, Lkik/android/widget/GalleryWidget;->_topDivider:Landroid/view/View;

    .line 43
    return-void
.end method
