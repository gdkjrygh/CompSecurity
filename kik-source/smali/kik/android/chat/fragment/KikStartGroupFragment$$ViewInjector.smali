.class public Lkik/android/chat/fragment/KikStartGroupFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/KikStartGroupFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e006a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624042\' for field \'_rootLayout\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->_rootLayout:Landroid/view/ViewGroup;

    .line 15
    const v0, 0x7f0e0079

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624057\' for field \'_numGroupMembersText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->_numGroupMembersText:Landroid/widget/TextView;

    .line 20
    const v0, 0x7f0e0070

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624048\' for field \'_groupNameEditText\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    .line 25
    const v0, 0x7f0e006f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624047\' for field \'_groupContactView\' and method \'setGroupPicture\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object v0, v1

    .line 29
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupContactView:Landroid/widget/ImageView;

    .line 30
    new-instance v0, Lkik/android/chat/fragment/pp;

    invoke-direct {v0, p1}, Lkik/android/chat/fragment/pp;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    const v0, 0x7f0e007a

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624058\' for field \'_createGroupButton\', field \'createButton\', and method \'handleGroupCreate\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v0, v1

    .line 42
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->_createGroupButton:Landroid/widget/Button;

    move-object v0, v1

    .line 43
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->createButton:Landroid/widget/Button;

    .line 44
    new-instance v0, Lkik/android/chat/fragment/pq;

    invoke-direct {v0, p1}, Lkik/android/chat/fragment/pq;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    const v0, 0x7f0e006e

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624046\' for field \'groupHeader\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_5
    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->groupHeader:Landroid/view/View;

    .line 57
    const v0, 0x7f0e0071

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    .line 58
    if-nez v1, :cond_6

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624049\' for field \'groupNameClearButton\' and method \'clearGroupName\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object v0, v1

    .line 61
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->groupNameClearButton:Landroid/widget/ImageView;

    .line 62
    new-instance v0, Lkik/android/chat/fragment/pr;

    invoke-direct {v0, p1}, Lkik/android/chat/fragment/pr;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    const v0, 0x7f0e012f

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 71
    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lkik/android/chat/fragment/KikStartGroupFragment;->searchButton:Landroid/view/ViewGroup;

    .line 72
    const v0, 0x7f0e0075

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624053\' for method \'clearComposeTo\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_7
    new-instance v1, Lkik/android/chat/fragment/ps;

    invoke-direct {v1, p1}, Lkik/android/chat/fragment/ps;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/KikStartGroupFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 87
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_rootLayout:Landroid/view/ViewGroup;

    .line 88
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_numGroupMembersText:Landroid/widget/TextView;

    .line 89
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    .line 90
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupContactView:Landroid/widget/ImageView;

    .line 91
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_createGroupButton:Landroid/widget/Button;

    .line 92
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->createButton:Landroid/widget/Button;

    .line 93
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->groupHeader:Landroid/view/View;

    .line 94
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->groupNameClearButton:Landroid/widget/ImageView;

    .line 95
    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->searchButton:Landroid/view/ViewGroup;

    .line 96
    return-void
.end method
