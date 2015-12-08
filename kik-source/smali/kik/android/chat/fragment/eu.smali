.class final Lkik/android/chat/fragment/eu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 3679
    iput-object p1, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 3691
    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->au(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3736
    :cond_0
    :goto_0
    return-void

    .line 3695
    :cond_1
    add-int v1, p2, p3

    .line 3696
    invoke-virtual {p1, v3}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 v0, -0x1

    .line 3697
    :goto_1
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->av(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-ne v1, v2, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aw(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 3701
    :cond_2
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->i(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 3703
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->B(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 3704
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->ax(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3705
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->ay(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3712
    :goto_2
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aA(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-ne p2, v2, :cond_3

    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aw(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-gt v0, v2, :cond_4

    :cond_3
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aA(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-ge p2, v2, :cond_a

    .line 3713
    :cond_4
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aB(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3714
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aC(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 3715
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aD(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3725
    :cond_5
    :goto_3
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aA(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-ne p2, v2, :cond_6

    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->av(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-eq v1, v2, :cond_7

    .line 3726
    :cond_6
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aG(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/am;

    move-result-object v2

    invoke-virtual {v2, p1, p2, p3, p4}, Lkik/android/chat/am;->onScroll(Landroid/widget/AbsListView;III)V

    .line 3730
    :cond_7
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aB(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3731
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2, v1}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;I)V

    .line 3733
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2, p2}, Lkik/android/chat/fragment/KikChatFragment;->h(Lkik/android/chat/fragment/KikChatFragment;I)I

    .line 3734
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2, v0}, Lkik/android/chat/fragment/KikChatFragment;->i(Lkik/android/chat/fragment/KikChatFragment;I)I

    .line 3735
    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->j(Lkik/android/chat/fragment/KikChatFragment;I)I

    goto/16 :goto_0

    .line 3696
    :cond_8
    invoke-virtual {p1, v3}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    goto/16 :goto_1

    .line 3708
    :cond_9
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->az(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_2

    .line 3719
    :cond_a
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aA(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-ne p2, v2, :cond_b

    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aw(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-lt v0, v2, :cond_c

    :cond_b
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aA(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    if-le p2, v2, :cond_5

    .line 3720
    :cond_c
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aE(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 3721
    iget-object v2, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aF(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_3
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 3683
    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->as(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3684
    iget-object v0, p0, Lkik/android/chat/fragment/eu;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->at(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3686
    :cond_0
    return-void
.end method
