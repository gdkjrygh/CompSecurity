.class public Lkik/android/widget/BugmeBarView$$ViewInjector;
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

.method public static inject(Lbutterknife/ButterKnife$Finder;Lkik/android/widget/BugmeBarView;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    const v0, 0x7f0e00aa

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624106\' for field \'_bugmeButton\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_0
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    .line 15
    const v0, 0x7f0e00ac

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624108\' for field \'_bugmePic\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_1
    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, p1, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    .line 20
    const v0, 0x7f0e00ab

    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findById(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required view with id \'2131624107\' for field \'_bugMeSingleTextLayout\' was not found. If this view is optional add \'@Optional\' annotation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_2
    iput-object v0, p1, Lkik/android/widget/BugmeBarView;->_bugMeSingleTextLayout:Landroid/view/View;

    .line 25
    return-void
.end method

.method public static reset(Lkik/android/widget/BugmeBarView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    .line 29
    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    .line 30
    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugMeSingleTextLayout:Landroid/view/View;

    .line 31
    return-void
.end method
