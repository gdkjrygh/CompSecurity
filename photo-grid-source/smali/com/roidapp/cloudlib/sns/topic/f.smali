.class final Lcom/roidapp/cloudlib/sns/topic/f;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/e;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(II)V

    .line 44
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/topic/e;->j:Z

    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 46
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    sget v1, Lcom/roidapp/cloudlib/at;->bb:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(II)V

    goto :goto_0
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 1049
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/topic/e;->b(Ljava/lang/Object;)V

    .line 26
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 26
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 2028
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2029
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/topic/e;->b(Ljava/lang/Object;)V

    .line 2030
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v2, Lcom/roidapp/cloudlib/sns/topic/e;->j:Z

    .line 2032
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/f;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 26
    return-void

    :cond_2
    move v0, v1

    .line 2030
    goto :goto_0
.end method
