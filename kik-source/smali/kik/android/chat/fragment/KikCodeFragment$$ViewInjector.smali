.class public Lkik/android/chat/fragment/KikCodeFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/KikCodeFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e0032

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623986\' for field \'_nameText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_nameText:Landroid/widget/TextView;

    .line 15
    const v0, 0x7f0e0033

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623987\' for field \'_usernameText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_usernameText:Landroid/widget/TextView;

    .line 20
    const v0, 0x7f0e00ff

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624191\' for field \'_scanText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    .line 25
    const v0, 0x7f0e00fb

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624187\' for field \'_drawArea\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_3
    check-cast v0, Lkik/android/widget/KikFinderCodeImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    .line 30
    const v0, 0x7f0e00fa

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624186\' for field \'_fakeCode\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_4
    check-cast v0, Lkik/android/widget/KikCodeBackgroundImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    .line 35
    const v0, 0x7f0e00f8

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 36
    if-nez v0, :cond_5

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624184\' for field \'_tellAFriendImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_5
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    .line 40
    const v0, 0x7f0e0030

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 41
    if-nez v0, :cond_6

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623984\' for field \'_profilePic\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_6
    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    .line 45
    const v0, 0x7f0e00fe

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 46
    if-nez v0, :cond_7

    .line 47
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624190\' for field \'_codeInfo\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_7
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_codeInfo:Landroid/view/ViewGroup;

    .line 50
    const v0, 0x7f0e00fc

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 51
    if-nez v0, :cond_8

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624188\' for field \'_spinner\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_8
    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    .line 55
    const v0, 0x7f0e0100

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 56
    if-nez v0, :cond_9

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624192\' for field \'_errorHolder\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_9
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_errorHolder:Landroid/widget/LinearLayout;

    .line 60
    const v0, 0x7f0e00fd

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 61
    if-nez v0, :cond_a

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624189\' for field \'_retryImage\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_a
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_retryImage:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0e0101

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 66
    if-nez v0, :cond_b

    .line 67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624193\' for field \'_wipeContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_b
    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_wipeContainer:Landroid/view/View;

    .line 70
    const v0, 0x7f0e00f9

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 71
    if-nez v0, :cond_c

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624185\' for field \'_codeContainer\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_c
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikCodeFragment;->_codeContainer:Landroid/view/ViewGroup;

    .line 75
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_nameText:Landroid/widget/TextView;

    .line 79
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_usernameText:Landroid/widget/TextView;

    .line 80
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    .line 81
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    .line 82
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    .line 83
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    .line 84
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_profilePic:Lcom/kik/cache/ContactImageView;

    .line 85
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_codeInfo:Landroid/view/ViewGroup;

    .line 86
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    .line 87
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_errorHolder:Landroid/widget/LinearLayout;

    .line 88
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_retryImage:Landroid/widget/ImageView;

    .line 89
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_wipeContainer:Landroid/view/View;

    .line 90
    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment;->_codeContainer:Landroid/view/ViewGroup;

    .line 91
    return-void
.end method
