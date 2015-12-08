.class final Lcom/roidapp/photogrid/release/jc;
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
    .line 441
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jc;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jc;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->y(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    :goto_0
    return-void

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jc;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->z(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto :goto_0
.end method
