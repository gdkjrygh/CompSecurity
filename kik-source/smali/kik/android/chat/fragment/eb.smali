.class final Lkik/android/chat/fragment/eb;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 2809
    iput-object p1, p0, Lkik/android/chat/fragment/eb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 2820
    iget-object v0, p0, Lkik/android/chat/fragment/eb;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 2821
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 2813
    iget-object v0, p0, Lkik/android/chat/fragment/eb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 2814
    new-array v0, v1, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/eb;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 2815
    return-void
.end method
