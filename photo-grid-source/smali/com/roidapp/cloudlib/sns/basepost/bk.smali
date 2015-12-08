.class final Lcom/roidapp/cloudlib/sns/basepost/bk;
.super Lcom/roidapp/cloudlib/sns/basepost/av;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IILcom/roidapp/cloudlib/sns/b/x;)V
    .locals 0

    .prologue
    .line 295
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bk;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {p0, p2, p3, p4}, Lcom/roidapp/cloudlib/sns/basepost/av;-><init>(IILcom/roidapp/cloudlib/sns/b/x;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 299
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromPostComments/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bk;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromPostComments/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bk;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bk;->a()Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    .line 303
    return-void
.end method
