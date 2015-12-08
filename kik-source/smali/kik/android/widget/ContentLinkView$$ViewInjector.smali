.class public Lkik/android/widget/ContentLinkView$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/ContentLinkView;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e00ec

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624172\' for field \'_contentLinkPic\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Lkik/android/widget/SquareNetworkedImageView;

    iput-object v0, p1, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    .line 15
    const v0, 0x7f0e00ed

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624173\' for field \'_contentLinkText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Lkik/android/widget/RobotoTextView;

    iput-object v0, p1, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    .line 20
    const v0, 0x7f0e00eb

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624171\' for field \'_contentLinkCenterLayout\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/ContentLinkView;->_contentLinkCenterLayout:Landroid/widget/FrameLayout;

    .line 25
    const v0, 0x7f0e00ee

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624174\' for field \'_contentLinkButtonImg\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/ContentLinkView;->_contentLinkButtonImg:Landroid/widget/ImageView;

    .line 30
    return-void
.end method

.method public static reset(Lkik/android/widget/ContentLinkView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkPic:Lkik/android/widget/SquareNetworkedImageView;

    .line 34
    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkText:Lkik/android/widget/RobotoTextView;

    .line 35
    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkCenterLayout:Landroid/widget/FrameLayout;

    .line 36
    iput-object v0, p0, Lkik/android/widget/ContentLinkView;->_contentLinkButtonImg:Landroid/widget/ImageView;

    .line 37
    return-void
.end method
