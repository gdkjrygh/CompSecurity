.class final Lkik/android/chat/fragment/ef;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 2903
    iput-object p1, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2916
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v3}, Lkik/android/chat/fragment/KikChatFragment;->f(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 2917
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2918
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/widget/TabIconImageView;->setVisibility(I)V

    .line 2920
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;I)V

    .line 2921
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->c:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 2923
    const-string v0, "Camera"

    iget-object v1, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->L(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2924
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/android/chat/fragment/KikChatFragment;Z)V

    .line 2926
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v3}, Lkik/android/chat/fragment/KikChatFragment;->h(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 2927
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 2907
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->f(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 2908
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 2909
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->e:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 2910
    iget-object v0, p0, Lkik/android/chat/fragment/ef;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ak(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 2911
    return-void
.end method
