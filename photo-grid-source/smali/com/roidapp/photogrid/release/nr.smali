.class final Lcom/roidapp/photogrid/release/nr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/nn;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nn;)V
    .locals 0

    .prologue
    .line 326
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nr;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nr;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->h(Lcom/roidapp/photogrid/release/nn;)Z

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nr;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->e(Lcom/roidapp/photogrid/release/nn;)V

    .line 332
    return-void
.end method
