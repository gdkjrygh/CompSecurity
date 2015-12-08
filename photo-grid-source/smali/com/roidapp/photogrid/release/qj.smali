.class final Lcom/roidapp/photogrid/release/qj;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 48
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 71
    :goto_0
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;Landroid/app/Activity;)V

    goto :goto_0

    .line 53
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->b(Lcom/roidapp/photogrid/release/qi;Landroid/app/Activity;)V

    goto :goto_0

    .line 56
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;)V

    goto :goto_0

    .line 60
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f07033e

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->D()V

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qj;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->dismissAllowingStateLoss()V

    goto :goto_0

    .line 48
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
