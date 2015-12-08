.class final Lkik/android/chat/fragment/dg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/chat/fragment/rl$a;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 1748
    iput-object p1, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1796
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Suggested Response Unsupported Type"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Type"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1797
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->ac(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 1798
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/view/View;)V
    .locals 7

    .prologue
    .line 1753
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ab(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 1755
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v0, :cond_2

    const/16 v0, 0xb

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1759
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 1761
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1762
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1763
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v4

    if-gt v1, v4, :cond_1

    .line 1764
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v4

    .line 1765
    if-eqz v4, :cond_0

    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1766
    sget-object v5, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v6, 0x2

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1763
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1769
    :cond_1
    new-instance v0, Lkik/android/chat/fragment/dh;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/dh;-><init>(Lkik/android/chat/fragment/dg;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1776
    const-wide/16 v0, 0x64

    invoke-virtual {v2, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 1777
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 1778
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/di;

    invoke-direct {v1, p0, v2}, Lkik/android/chat/fragment/di;-><init>(Lkik/android/chat/fragment/dg;Landroid/animation/AnimatorSet;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    .line 1791
    :goto_1
    return-void

    .line 1788
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget v1, Lkik/a/d/s$a;->b:I

    invoke-static {v0, p1, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;I)V

    goto :goto_1

    .line 1766
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final a(Landroid/view/MotionEvent;I)Z
    .locals 2

    .prologue
    .line 1803
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    .line 1804
    instance-of v1, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v1, :cond_0

    .line 1805
    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->k()I

    move-result v0

    .line 1806
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    if-le v0, p2, :cond_0

    .line 1807
    iget-object v0, p0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/RecyclerView;->a(I)V

    .line 1810
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
