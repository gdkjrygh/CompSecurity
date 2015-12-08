.class final Lcom/roidapp/photogrid/release/je;
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
    .line 486
    iput-object p1, p0, Lcom/roidapp/photogrid/release/je;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 488
    iget-object v0, p0, Lcom/roidapp/photogrid/release/je;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->y(Lcom/roidapp/photogrid/release/ImageEditor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 492
    :goto_0
    return-void

    .line 491
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/je;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->B(Lcom/roidapp/photogrid/release/ImageEditor;)V

    goto :goto_0
.end method
