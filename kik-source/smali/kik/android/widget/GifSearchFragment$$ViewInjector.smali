.class public Lkik/android/widget/GifSearchFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/GifSearchFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e0114

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624212\' for field \'_emojiGridView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Lkik/android/widget/AutoResizeRecyclerGridView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    .line 15
    const v0, 0x7f0e0115

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624213\' for field \'_resultGridView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    .line 20
    const v0, 0x7f0e012b

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624235\' for field \'_noSearchResults\' and method \'onNoResultsClicked\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v0, v1

    .line 24
    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    .line 25
    new-instance v0, Lkik/android/widget/aw;

    invoke-direct {v0, p1}, Lkik/android/widget/aw;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    const v0, 0x7f0e0116

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624214\' for field \'_searchResultsLoading\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_3
    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    .line 38
    const v0, 0x7f0e012d

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624237\' for field \'_noSearchResultsText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_4
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_noSearchResultsText:Landroid/widget/TextView;

    .line 43
    const v0, 0x7f0e0119

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 44
    if-nez v1, :cond_5

    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624217\' for field \'_searchCancel\' and method \'cancelSearchText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object v0, v1

    .line 47
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_searchCancel:Landroid/widget/ImageView;

    .line 48
    new-instance v0, Lkik/android/widget/ax;

    invoke-direct {v0, p1}, Lkik/android/widget/ax;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    const v0, 0x7f0e0118

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624216\' for field \'_searchEditText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_6
    check-cast v0, Lkik/android/widget/RobotoEditText;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    .line 61
    const v0, 0x7f0e0117

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 62
    if-nez v0, :cond_7

    .line 63
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624215\' for field \'_searchBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_7
    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    .line 66
    const v0, 0x7f0e012a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 67
    if-nez v1, :cond_8

    .line 68
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624234\' for field \'_gifsCantLoad\' and method \'onResultsErrorClicked\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object v0, v1

    .line 70
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    .line 71
    new-instance v0, Lkik/android/widget/ay;

    invoke-direct {v0, p1}, Lkik/android/widget/ay;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    const v0, 0x7f0e011a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 80
    if-nez v0, :cond_9

    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624218\' for field \'_gifsHintBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_9
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_gifsHintBar:Landroid/widget/FrameLayout;

    .line 84
    const v0, 0x7f0e011b

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 85
    if-nez v1, :cond_a

    .line 86
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624219\' for field \'_gifsHintBarClose\' and method \'onHintCloseClicked\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move-object v0, v1

    .line 88
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_gifsHintBarClose:Landroid/widget/ImageView;

    .line 89
    new-instance v0, Lkik/android/widget/az;

    invoke-direct {v0, p1}, Lkik/android/widget/az;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    const v0, 0x7f0e01c9

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 98
    if-nez v0, :cond_b

    .line 99
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624393\' for field \'_gifAttributionBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_b
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    .line 102
    return-void
.end method

.method public static reset(Lkik/android/widget/GifSearchFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    .line 106
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    .line 107
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    .line 108
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    .line 109
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResultsText:Landroid/widget/TextView;

    .line 110
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchCancel:Landroid/widget/ImageView;

    .line 111
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    .line 112
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    .line 113
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    .line 114
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifsHintBar:Landroid/widget/FrameLayout;

    .line 115
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifsHintBarClose:Landroid/widget/ImageView;

    .line 116
    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    .line 117
    return-void
.end method
