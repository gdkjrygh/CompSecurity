.class final Lkik/android/chat/fragment/jt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 613
    iput-object p1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 617
    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    if-nez v0, :cond_1

    .line 630
    :cond_0
    :goto_0
    return-void

    .line 621
    :cond_1
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 622
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->c([Landroid/view/View;)V

    .line 624
    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 625
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikConversationsFragment;->c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/ScanCodeTabFragment;->getView()Landroid/view/View;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 626
    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->c()V

    .line 627
    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->e()V

    .line 629
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/jt;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->d(Lkik/android/chat/fragment/KikConversationsFragment;)V

    goto :goto_0
.end method
