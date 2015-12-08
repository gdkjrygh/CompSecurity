.class final Lcom/roidapp/cloudlib/sns/login/h;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/login/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/login/e;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 356
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 361
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/e;->f()V

    .line 362
    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 333
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/b;

    .line 1366
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/login/e;->a(Lcom/roidapp/cloudlib/sns/login/e;Lcom/roidapp/cloudlib/sns/b/a/b;)Lcom/roidapp/cloudlib/sns/b/a/b;

    .line 1367
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/login/e;->a(Lcom/roidapp/cloudlib/sns/login/e;)V

    .line 1368
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/login/e;->b(Lcom/roidapp/cloudlib/sns/login/e;)V

    .line 333
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 333
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/b;

    .line 2351
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/h;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/login/e;->a(Lcom/roidapp/cloudlib/sns/b/a/b;)V

    .line 333
    return-void
.end method
