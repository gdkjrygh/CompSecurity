.class Landroid/support/v4/app/j;
.super Landroid/os/Handler;
.source "FragmentActivity.java"


# instance fields
.field final synthetic a:Landroid/support/v4/app/i;


# direct methods
.method constructor <init>(Landroid/support/v4/app/i;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Landroid/support/v4/app/j;->a:Landroid/support/v4/app/i;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 84
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 95
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 86
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/app/j;->a:Landroid/support/v4/app/i;

    iget-boolean v0, v0, Landroid/support/v4/app/i;->g:Z

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Landroid/support/v4/app/j;->a:Landroid/support/v4/app/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/i;->a(Z)V

    goto :goto_0

    .line 91
    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/app/j;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->b()V

    .line 92
    iget-object v0, p0, Landroid/support/v4/app/j;->a:Landroid/support/v4/app/i;

    iget-object v0, v0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    goto :goto_0

    .line 84
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
