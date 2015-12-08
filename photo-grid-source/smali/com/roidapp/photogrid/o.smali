.class final Lcom/roidapp/photogrid/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/widget/av;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/k;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v3, 0x3

    const/4 v5, 0x2

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->c(Lcom/roidapp/photogrid/k;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->d()I

    move-result v0

    .line 299
    if-ne v0, v3, :cond_1

    .line 300
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->d(Lcom/roidapp/photogrid/k;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    const-string v0, "MainPage_template_card"

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 302
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->d(Lcom/roidapp/photogrid/k;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 313
    :cond_0
    :goto_0
    return-void

    .line 306
    :cond_1
    if-ne v0, v5, :cond_0

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->d(Lcom/roidapp/photogrid/k;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    const-string v0, "SNS"

    const-string v1, "UpGlide"

    const-string v2, "SNS/UpGlide/Home"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "UpGlide"

    const-string v3, "SNS/UpGlide/Home"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 310
    iget-object v0, p0, Lcom/roidapp/photogrid/o;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->d(Lcom/roidapp/photogrid/k;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
