.class final Lcom/roidapp/photogrid/release/kl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ig;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/roidapp/photogrid/release/kg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;II)V
    .locals 0

    .prologue
    .line 533
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kl;->d:Lcom/roidapp/photogrid/release/kg;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/kl;->a:Lcom/roidapp/photogrid/release/ig;

    iput p3, p0, Lcom/roidapp/photogrid/release/kl;->b:I

    iput p4, p0, Lcom/roidapp/photogrid/release/kl;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 537
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kl;->d:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0, v4}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Z)Z

    .line 578
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kl;->d:Lcom/roidapp/photogrid/release/kg;

    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kl;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/release/kl;->b:I

    iget v3, p0, Lcom/roidapp/photogrid/release/kl;->c:I

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 581
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 582
    iput v4, v0, Landroid/os/Message;->what:I

    .line 583
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kl;->d:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kg;->n(Lcom/roidapp/photogrid/release/kg;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 584
    return-void
.end method
