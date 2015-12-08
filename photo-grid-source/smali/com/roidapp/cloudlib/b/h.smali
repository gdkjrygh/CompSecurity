.class final Lcom/roidapp/cloudlib/b/h;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/g;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/g;)V
    .locals 0

    .prologue
    .line 219
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/h;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 229
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/h;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->a(Lcom/roidapp/cloudlib/b/g;)Z

    .line 231
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/h;->a:Lcom/roidapp/cloudlib/b/g;

    instance-of v0, p2, Lcom/roidapp/cloudlib/sns/z;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/b/g;->a(Lcom/roidapp/cloudlib/b/g;Z)V

    .line 232
    return-void

    .line 231
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 219
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/g;

    .line 1236
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 219
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 219
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/g;

    .line 2222
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->c(Ljava/lang/Object;)V

    .line 2223
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/h;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->a(Lcom/roidapp/cloudlib/b/g;)Z

    .line 2224
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/h;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/b/g;->a(Lcom/roidapp/cloudlib/b/g;Lcom/roidapp/cloudlib/sns/b/a/g;)V

    .line 219
    return-void
.end method
