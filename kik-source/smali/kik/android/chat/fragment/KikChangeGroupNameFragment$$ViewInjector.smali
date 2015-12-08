.class public Lkik/android/chat/fragment/KikChangeGroupNameFragment$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/chat/fragment/KikChangeGroupNameFragment;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e0011

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623953\' for field \'_groupNameField\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    .line 15
    const v0, 0x7f0e0018

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131623960\' for field \'_confirmNameButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    iput-object v0, p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_confirmNameButton:Landroid/view/View;

    .line 20
    return-void
.end method

.method public static reset(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    .line 24
    iput-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_confirmNameButton:Landroid/view/View;

    .line 25
    return-void
.end method
