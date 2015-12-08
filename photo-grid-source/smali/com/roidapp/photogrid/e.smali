.class final Lcom/roidapp/photogrid/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/d;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/d;I)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iput p2, p0, Lcom/roidapp/photogrid/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 253
    const-string v1, "SNS"

    const-string v2, "click"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/d;->a(Lcom/roidapp/photogrid/d;)Ljava/util/List;

    move-result-object v0

    iget v4, p0, Lcom/roidapp/photogrid/e;->a:I

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v3, p0, Lcom/roidapp/photogrid/e;->a:I

    int-to-long v4, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->n(Lcom/roidapp/photogrid/a;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/d;->a(Lcom/roidapp/photogrid/d;)Ljava/util/List;

    move-result-object v0

    iget v5, p0, Lcom/roidapp/photogrid/e;->a:I

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v4, p0, Lcom/roidapp/photogrid/e;->a:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2, v3, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 255
    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 256
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->d(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v2, v2, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v2}, Lcom/roidapp/photogrid/a;->d(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/d;->a(Lcom/roidapp/photogrid/d;)Ljava/util/List;

    move-result-object v0

    iget v2, p0, Lcom/roidapp/photogrid/e;->a:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    const-string v2, "Explore_Banner_%s_Page"

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->j(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/k;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/e;->b:Lcom/roidapp/photogrid/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/d;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->j(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/k;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 262
    :cond_1
    return-void
.end method
