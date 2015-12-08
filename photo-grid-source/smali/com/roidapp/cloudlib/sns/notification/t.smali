.class final Lcom/roidapp/cloudlib/sns/notification/t;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/s;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/s;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->e(Lcom/roidapp/cloudlib/sns/notification/s;)Z

    .line 61
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->f(Lcom/roidapp/cloudlib/sns/notification/s;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    :goto_0
    return-void

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->g(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->h(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->i(Lcom/roidapp/cloudlib/sns/notification/s;)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->j(Lcom/roidapp/cloudlib/sns/notification/s;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 44
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/n;

    .line 1047
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->a(Lcom/roidapp/cloudlib/sns/notification/s;)Z

    .line 1048
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->b(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1049
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->c(Lcom/roidapp/cloudlib/sns/notification/s;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1051
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->d(Lcom/roidapp/cloudlib/sns/notification/s;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1052
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/s;->a(Lcom/roidapp/cloudlib/sns/notification/s;Lcom/roidapp/cloudlib/sns/b/n;)Lcom/roidapp/cloudlib/sns/b/n;

    .line 1053
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;-><init>()V

    .line 1054
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->add(Ljava/lang/Object;)Z

    .line 1055
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/t;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-virtual {v1, v0, v2, v2}, Lcom/roidapp/cloudlib/sns/notification/s;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 44
    return-void
.end method
