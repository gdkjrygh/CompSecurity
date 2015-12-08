.class final Lkik/android/chat/fragment/fx;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 5163
    iput-object p1, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/fx;->a:Z

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 5174
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v4}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 5175
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/fx;->a:Z

    if-eqz v0, :cond_0

    .line 5176
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/fy;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/fy;-><init>(Lkik/android/chat/fragment/fx;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/ResizeEventList;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 5184
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v4}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 5185
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-boolean v1, p0, Lkik/android/chat/fragment/fx;->a:Z

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->i(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 5186
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 5167
    new-array v0, v3, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 5168
    iget-object v0, p0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v3}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 5169
    return-void
.end method
