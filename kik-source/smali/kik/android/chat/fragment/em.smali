.class final Lkik/android/chat/fragment/em;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 526
    iput-object p1, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v2, 0x7

    const/4 v1, 0x4

    const/4 v3, 0x1

    .line 531
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 532
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 574
    :cond_0
    :goto_0
    return-void

    .line 534
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->i(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 537
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    .line 539
    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->j(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 540
    iget-object v1, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    aget-object v0, v0, v3

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    goto :goto_0

    .line 545
    :pswitch_2
    iget-object v1, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/k;)Lkik/a/d/k;

    .line 547
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->k(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 551
    :pswitch_3
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/em;->removeMessages(I)V

    .line 552
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->l(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 555
    :pswitch_4
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/em;->removeMessages(I)V

    .line 556
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/em;->removeMessages(I)V

    .line 557
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->l(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 559
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, -0x1f4

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/ResizeEventList;->setSelectionFromTop(II)V

    goto :goto_0

    .line 563
    :pswitch_5
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/em;->removeMessages(I)V

    .line 568
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/em;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->n(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 567
    :pswitch_6
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/em;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 532
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
