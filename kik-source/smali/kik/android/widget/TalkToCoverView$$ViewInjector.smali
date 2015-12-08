.class public Lkik/android/widget/TalkToCoverView$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/TalkToCoverView;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e01e3

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624419\' for field \'_deleteButton\' and method \'deleteConversation\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    iput-object v0, p1, Lkik/android/widget/TalkToCoverView;->_deleteButton:Landroid/view/View;

    .line 15
    new-instance v1, Lkik/android/widget/dv;

    invoke-direct {v1, p1}, Lkik/android/widget/dv;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    const v0, 0x7f0e01e4

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624420\' for field \'_acceptButton\' and method \'acceptContact\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_1
    iput-object v0, p1, Lkik/android/widget/TalkToCoverView;->_acceptButton:Landroid/view/View;

    .line 28
    new-instance v1, Lkik/android/widget/dw;

    invoke-direct {v1, p1}, Lkik/android/widget/dw;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    return-void
.end method

.method public static reset(Lkik/android/widget/TalkToCoverView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->_deleteButton:Landroid/view/View;

    .line 40
    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->_acceptButton:Landroid/view/View;

    .line 41
    return-void
.end method
