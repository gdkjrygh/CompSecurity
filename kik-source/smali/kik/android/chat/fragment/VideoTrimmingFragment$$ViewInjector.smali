.class public Lkik/android/chat/fragment/VideoTrimmingFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/VideoTrimmingFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e008b

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624075\' for field \'_videoView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/widget/VideoView;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    .line 15
    const v0, 0x7f0e008c

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624076\' for field \'_videoPlayIcon\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    .line 20
    const v0, 0x7f0e0088

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624072\' for field \'_videoViewContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoViewContainer:Landroid/widget/FrameLayout;

    .line 25
    const v0, 0x7f0e008f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624079\' for field \'_saveButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_saveButton:Landroid/widget/ImageButton;

    .line 30
    const v0, 0x7f0e008a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624074\' for field \'_videoKeyFrameView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    check-cast v0, Lkik/android/widget/VideoKeyFrameView;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoKeyFrameView:Lkik/android/widget/VideoKeyFrameView;

    .line 35
    const v0, 0x7f0e008e

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_5

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624078\' for field \'_editedSizeText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_5
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/VideoTrimmingFragment;->_editedSizeText:Landroid/widget/TextView;

    .line 40
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/VideoTrimmingFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    .line 44
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    .line 45
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoViewContainer:Landroid/widget/FrameLayout;

    .line 46
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_saveButton:Landroid/widget/ImageButton;

    .line 47
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoKeyFrameView:Lkik/android/widget/VideoKeyFrameView;

    .line 48
    iput-object v0, p0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_editedSizeText:Landroid/widget/TextView;

    .line 49
    return-void
.end method
