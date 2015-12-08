.class final Lcom/roidapp/photogrid/release/n;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 869
    iput-object p1, p0, Lcom/roidapp/photogrid/release/n;->a:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 871
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 873
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 886
    :goto_0
    return-void

    .line 876
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/n;->a:Lcom/roidapp/photogrid/release/c;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->k(Lcom/roidapp/photogrid/release/c;)V

    .line 877
    iget-object v0, p0, Lcom/roidapp/photogrid/release/n;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->l(Lcom/roidapp/photogrid/release/c;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 878
    iget-object v0, p0, Lcom/roidapp/photogrid/release/n;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->m(Lcom/roidapp/photogrid/release/c;)Z

    goto :goto_0

    .line 873
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
