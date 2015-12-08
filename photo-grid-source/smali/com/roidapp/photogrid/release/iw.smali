.class final Lcom/roidapp/photogrid/release/iw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1013
    iput-object p1, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/iw;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1015
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/iw;->a:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1016
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/iw;->a:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)Landroid/view/View;

    .line 1017
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1018
    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->z()I

    move-result v1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1019
    iget-object v1, p0, Lcom/roidapp/photogrid/release/iw;->a:Landroid/view/View;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1020
    iget-object v1, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1025
    :goto_0
    return-void

    .line 1022
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, 0xa4

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 1023
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iw;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
