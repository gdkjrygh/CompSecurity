.class Landroid/support/v4/a/f;
.super Landroid/os/Handler;
.source "LocalBroadcastManager.java"


# instance fields
.field final synthetic a:Landroid/support/v4/a/e;


# direct methods
.method constructor <init>(Landroid/support/v4/a/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Landroid/support/v4/a/f;->a:Landroid/support/v4/a/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 114
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 119
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 121
    :goto_0
    return-void

    .line 116
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/a/f;->a:Landroid/support/v4/a/e;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/support/v4/a/e;)V

    goto :goto_0

    .line 114
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
