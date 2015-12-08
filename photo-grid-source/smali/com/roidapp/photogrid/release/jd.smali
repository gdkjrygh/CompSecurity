.class final Lcom/roidapp/photogrid/release/jd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->y(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 462
    :goto_0
    return-void

    .line 456
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 457
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->A(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->z(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto :goto_0

    .line 460
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jd;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
