.class final Lcom/roidapp/cloudlib/sns/basepost/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/bb;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V
    .locals 0

    .prologue
    .line 805
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 808
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d(Lcom/roidapp/cloudlib/sns/basepost/bc;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 844
    :goto_0
    return-void

    .line 811
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;Z)Z

    .line 812
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Post/Delete/Confirm"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Post/Delete/Confirm"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 814
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->l()V

    .line 815
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bq;->a:I

    new-instance v4, Lcom/roidapp/cloudlib/sns/basepost/br;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/sns/basepost/br;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bq;)V

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->e(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
