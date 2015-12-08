.class final Lcom/roidapp/cloudlib/sns/basepost/bj;
.super Lcom/roidapp/cloudlib/sns/basepost/v;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IIJI)V
    .locals 8

    .prologue
    .line 280
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bj;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-object v1, p0

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/basepost/v;-><init>(IIJI)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 282
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToComments/FromPostComments/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bj;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToComments/FromPostComments/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 285
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bj;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bj;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(IZ)V

    .line 286
    return-void
.end method
