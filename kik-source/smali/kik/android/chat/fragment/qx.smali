.class final Lkik/android/chat/fragment/qx;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/SendToFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/SendToFragment;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lkik/android/chat/fragment/qx;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 55
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 56
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 62
    :goto_0
    return-void

    .line 58
    :pswitch_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/qx;->removeMessages(I)V

    .line 59
    iget-object v0, p0, Lkik/android/chat/fragment/qx;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment;->a(Lkik/android/chat/fragment/SendToFragment;)V

    goto :goto_0

    .line 56
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
