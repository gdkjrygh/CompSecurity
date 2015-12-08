.class final Lcom/roidapp/photogrid/release/nq;
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
    .line 309
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->d(Lcom/roidapp/photogrid/release/nn;)Z

    .line 314
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->e(Lcom/roidapp/photogrid/release/nn;)V

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->g(Lcom/roidapp/photogrid/release/nn;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->c(Lcom/roidapp/photogrid/release/nn;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 320
    :cond_0
    const-string v0, "PhotoSaveDialog/Save"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nq;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->c(Lcom/roidapp/photogrid/release/nn;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s()V

    .line 323
    return-void
.end method
