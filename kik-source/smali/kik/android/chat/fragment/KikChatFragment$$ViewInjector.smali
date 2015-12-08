.class public Lkik/android/chat/fragment/KikChatFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e01b1

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624369\' for field \'sendButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    .line 15
    const v0, 0x7f0e00d8

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624152\' for field \'_contentButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Lkik/android/widget/DarkFrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    .line 20
    const v0, 0x7f0e01ad

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624365\' for field \'_contentButtonSpacer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_contentButtonSpacer:Landroid/view/View;

    .line 25
    const v0, 0x7f0e0025

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    check-cast v0, Lkik/android/widget/TalkToCoverView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    .line 27
    const v0, 0x7f0e002b

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623979\' for field \'_newMessagesButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_3
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    .line 32
    const v0, 0x7f0e002a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623978\' for field \'_scrollToLastReadButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_4
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    .line 37
    const v0, 0x7f0e001c

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 38
    if-nez v0, :cond_5

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623964\' for field \'_topBar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_5
    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_topBar:Landroid/view/View;

    .line 42
    const v0, 0x7f0e01aa

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 43
    if-nez v0, :cond_6

    .line 44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624362\' for field \'tabs\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_6
    check-cast v0, Lkik/android/widget/PagerIconTabs;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    .line 47
    const v0, 0x7f0e001a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 48
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    .line 49
    const v0, 0x7f0e0019

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    .line 51
    const v0, 0x7f0e01a4

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 52
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    .line 53
    const v0, 0x7f0e01a7

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 54
    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    .line 55
    const v0, 0x7f0e01b2

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 56
    check-cast v0, Lkik/android/widget/TabIconImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->contentButtonImage:Lkik/android/widget/TabIconImageView;

    .line 57
    const v0, 0x7f0e01a6

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 58
    if-nez v0, :cond_7

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624358\' for field \'_suggestedRecyclerView\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_7
    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 62
    const v0, 0x7f0e01b3

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 63
    if-nez v0, :cond_8

    .line 64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624371\' for field \'_mediaItemArea\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_8
    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    .line 67
    const v0, 0x7f0e01a3

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 68
    if-nez v0, :cond_9

    .line 69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624355\' for field \'tray\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_9
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    .line 72
    const v0, 0x7f0e01ac

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 73
    if-nez v0, :cond_a

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624364\' for field \'_mediaModeButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_a
    check-cast v0, Lkik/android/widget/TabIconImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    .line 77
    const v0, 0x7f0e01a5

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 78
    if-nez v0, :cond_b

    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624357\' for field \'_mediaTrayContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_b
    check-cast v0, Lkik/android/widget/DarkLinearLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    .line 82
    const v0, 0x7f0e01a9

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 83
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    .line 84
    const v0, 0x7f0e01a8

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 85
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    .line 86
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    .line 90
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    .line 91
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentButtonSpacer:Landroid/view/View;

    .line 92
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    .line 93
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    .line 94
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    .line 95
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_topBar:Landroid/view/View;

    .line 96
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    .line 97
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    .line 98
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    .line 99
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    .line 100
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    .line 101
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->contentButtonImage:Lkik/android/widget/TabIconImageView;

    .line 102
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 103
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    .line 104
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    .line 105
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    .line 106
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    .line 107
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    .line 108
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    .line 109
    return-void
.end method
