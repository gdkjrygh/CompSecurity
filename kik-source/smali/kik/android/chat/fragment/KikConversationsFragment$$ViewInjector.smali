.class public Lkik/android/chat/fragment/KikConversationsFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/KikConversationsFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e0050

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624016\' for field \'_missedConvoButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    .line 15
    const v0, 0x7f0e0053

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624019\' for field \'_missedConvosTitle\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    .line 20
    const v0, 0x7f0e0052

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624018\' for field \'_missedConvosNotification\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosNotification:Landroid/widget/ImageView;

    .line 25
    const v0, 0x7f0e0043

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624003\' for field \'_animationContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    .line 30
    const v0, 0x7f0e0055

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624021\' for field \'_composeButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButton:Landroid/view/View;

    .line 35
    const v0, 0x7f0e004c

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_5

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624012\' for field \'_statusbarUnderlay\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_5
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_statusbarUnderlay:Landroid/view/View;

    .line 40
    const v0, 0x7f0e004f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624015\' for field \'_navBarShadow\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_6
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_navBarShadow:Landroid/view/View;

    .line 45
    const v0, 0x7f0e0054

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-nez v0, :cond_7

    .line 47
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624020\' for field \'_composeButtonShadow\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_7
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButtonShadow:Landroid/view/View;

    .line 50
    const v0, 0x7f0e004d

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 51
    if-nez v0, :cond_8

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624013\' for field \'_conversationsTopbar\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_8
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_conversationsTopbar:Landroid/view/View;

    .line 55
    const v0, 0x7f0e004e

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 56
    if-nez v0, :cond_9

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624014\' for field \'_webButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_9
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    .line 60
    const v0, 0x7f0e0036

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 61
    if-nez v0, :cond_a

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623990\' for field \'_settingsButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_a
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_settingsButton:Landroid/view/View;

    .line 65
    const v0, 0x7f0e0044

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 66
    if-nez v0, :cond_b

    .line 67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624004\' for field \'_pullToScanHint\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_b
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    .line 70
    const v0, 0x7f0e004a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 71
    if-nez v0, :cond_c

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624010\' for field \'_pullToScanHeader\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_c
    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHeader:Landroid/view/View;

    .line 75
    const v0, 0x7f0e0049

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 76
    if-nez v0, :cond_d

    .line 77
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624009\' for field \'_pullToScan\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_d
    check-cast v0, Lkik/android/widget/PullToRevealView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    .line 80
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    .line 84
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    .line 85
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosNotification:Landroid/widget/ImageView;

    .line 86
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    .line 87
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButton:Landroid/view/View;

    .line 88
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_statusbarUnderlay:Landroid/view/View;

    .line 89
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_navBarShadow:Landroid/view/View;

    .line 90
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButtonShadow:Landroid/view/View;

    .line 91
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_conversationsTopbar:Landroid/view/View;

    .line 92
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    .line 93
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_settingsButton:Landroid/view/View;

    .line 94
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    .line 95
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHeader:Landroid/view/View;

    .line 96
    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    .line 97
    return-void
.end method
