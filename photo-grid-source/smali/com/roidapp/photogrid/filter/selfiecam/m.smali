.class public final Lcom/roidapp/photogrid/filter/selfiecam/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V
    .locals 0

    .prologue
    .line 548
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 552
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->e(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->f(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 554
    if-nez v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fd

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 556
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 561
    :goto_0
    return-void

    .line 558
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x3fc

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 559
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/m;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->g(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
