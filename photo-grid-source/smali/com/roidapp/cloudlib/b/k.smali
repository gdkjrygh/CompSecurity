.class final Lcom/roidapp/cloudlib/b/k;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/j;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/j;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/k;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 241
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 242
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/k;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/b/j;)Z

    .line 243
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/k;->a:Lcom/roidapp/cloudlib/b/j;

    instance-of v0, p2, Lcom/roidapp/cloudlib/sns/z;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/b/j;Z)V

    .line 244
    return-void

    .line 243
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 231
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    .line 1248
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 231
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 231
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    .line 2234
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->c(Ljava/lang/Object;)V

    .line 2235
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/k;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/b/j;)Z

    .line 2236
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/k;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/b/j;Lcom/roidapp/cloudlib/sns/b/a/h;)V

    .line 231
    return-void
.end method
