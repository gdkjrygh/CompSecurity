.class final Lkik/android/chat/fragment/ae;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ConversationsBaseFragment;

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V
    .locals 1

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/chat/fragment/ae;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 73
    const/4 v0, 0x6

    iput v0, p0, Lkik/android/chat/fragment/ae;->b:I

    .line 74
    const/4 v0, 0x7

    iput v0, p0, Lkik/android/chat/fragment/ae;->c:I

    .line 75
    const/16 v0, 0x7d0

    iput v0, p0, Lkik/android/chat/fragment/ae;->d:I

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x7d0

    const/4 v4, 0x5

    const/4 v3, 0x1

    const/4 v2, 0x6

    const/4 v1, 0x7

    .line 81
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 82
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 115
    :cond_0
    :goto_0
    return-void

    .line 84
    :pswitch_0
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/ae;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 86
    invoke-virtual {p0, v2, v6, v7}, Lkik/android/chat/fragment/ae;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 90
    :pswitch_1
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ae;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/ae;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    invoke-virtual {p0, v1, v6, v7}, Lkik/android/chat/fragment/ae;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 95
    :pswitch_2
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 96
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 97
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 98
    invoke-virtual {p0, v4}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/ae;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto :goto_0

    .line 103
    :pswitch_3
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 104
    invoke-virtual {p0, v4}, Lkik/android/chat/fragment/ae;->removeMessages(I)V

    .line 112
    :pswitch_4
    iget-object v0, p0, Lkik/android/chat/fragment/ae;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto :goto_0

    .line 109
    :pswitch_5
    iget-object v0, p0, Lkik/android/chat/fragment/ae;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
