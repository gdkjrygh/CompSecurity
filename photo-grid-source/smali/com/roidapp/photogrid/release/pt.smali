.class final Lcom/roidapp/photogrid/release/pt;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PickFolder;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PickFolder;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pt;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 87
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 94
    :cond_0
    :goto_0
    return-void

    .line 89
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pt;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->a(Lcom/roidapp/photogrid/release/PickFolder;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pt;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->a(Lcom/roidapp/photogrid/release/PickFolder;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto :goto_0

    .line 87
    :pswitch_data_0
    .packed-switch 0x236
        :pswitch_0
    .end packed-switch
.end method
