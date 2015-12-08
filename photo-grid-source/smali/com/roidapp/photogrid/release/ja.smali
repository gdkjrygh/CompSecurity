.class final Lcom/roidapp/photogrid/release/ja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/aq;

.field final synthetic b:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;Lcom/roidapp/photogrid/release/aq;)V
    .locals 0

    .prologue
    .line 1381
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ja;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ja;->a:Lcom/roidapp/photogrid/release/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1384
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ja;->b:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ja;->a:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/aq;)V

    .line 1385
    return-void
.end method
