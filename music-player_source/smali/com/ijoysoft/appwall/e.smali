.class final Lcom/ijoysoft/appwall/e;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/d;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/e;->a:Lcom/ijoysoft/appwall/d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/ijoysoft/appwall/h;

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->a(Lcom/ijoysoft/appwall/h;)Lcom/ijoysoft/appwall/g;

    move-result-object v1

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->b(Lcom/ijoysoft/appwall/h;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/ijoysoft/appwall/h;->c(Lcom/ijoysoft/appwall/h;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/ijoysoft/appwall/g;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
