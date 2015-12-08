.class final Lcom/roidapp/photogrid/release/qu;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/RetouchActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/release/RetouchActivity;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qu;->a:Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/release/RetouchActivity;B)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/qu;-><init>(Lcom/roidapp/photogrid/release/RetouchActivity;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 80
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 91
    :goto_0
    return-void

    .line 84
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qu;->a:Lcom/roidapp/photogrid/release/RetouchActivity;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iput v1, v0, Lcom/roidapp/photogrid/release/RetouchActivity;->a:I

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qu;->a:Lcom/roidapp/photogrid/release/RetouchActivity;

    iget v1, p1, Landroid/os/Message;->arg2:I

    iput v1, v0, Lcom/roidapp/photogrid/release/RetouchActivity;->b:I

    goto :goto_0

    .line 80
    :pswitch_data_0
    .packed-switch 0x402
        :pswitch_0
    .end packed-switch
.end method
