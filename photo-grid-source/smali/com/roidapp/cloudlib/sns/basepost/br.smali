.class final Lcom/roidapp/cloudlib/sns/basepost/br;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/bq;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bq;)V
    .locals 0

    .prologue
    .line 816
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 836
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Post/Delete/Failed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 837
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Post/Delete/Failed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 838
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->m()V

    .line 839
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 840
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;Z)Z

    .line 841
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 816
    .line 1820
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Post/Delete/Success"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1821
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Post/Delete/Success"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1822
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->G:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1824
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d(Lcom/roidapp/cloudlib/sns/basepost/bc;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 1825
    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget v3, v3, Lcom/roidapp/cloudlib/sns/basepost/bq;->a:I

    if-ne v2, v3, :cond_0

    .line 1826
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/g/b;->e(Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 1830
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->n()V

    .line 1831
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/br;->a:Lcom/roidapp/cloudlib/sns/basepost/bq;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;Z)Z

    .line 816
    return-void
.end method
