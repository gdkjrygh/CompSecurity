.class final Lcom/roidapp/cloudlib/sns/basepost/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 405
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 2

    .prologue
    .line 411
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    if-ge v0, v1, :cond_0

    .line 412
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 413
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Lcom/roidapp/cloudlib/sns/b/a;)V

    .line 417
    :goto_0
    return-void

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ae;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0
.end method
