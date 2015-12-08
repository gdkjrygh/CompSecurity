.class final Lcom/roidapp/cloudlib/sns/basepost/ah;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;J)V
    .locals 0

    .prologue
    .line 1017
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iput-wide p2, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 1061
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->D(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1070
    :goto_0
    return-void

    .line 1064
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Comment/Send/Failed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1065
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Comment/Send/Failed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1066
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(J)V

    .line 1067
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 1069
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 1017
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a;

    .line 2021
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->B(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2024
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Comment/Send/Success"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2025
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Comment/Send/Success"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2032
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    invoke-virtual {v0, v2, v3, p1}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(JLcom/roidapp/cloudlib/sns/b/a;)V

    .line 2036
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2037
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2038
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    iget-wide v2, p1, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2040
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 2041
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 2042
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 2043
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    iget-wide v6, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->a:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    .line 2044
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2049
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->k(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 2054
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 2055
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/a;)V

    .line 2056
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ah;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    .line 1017
    :cond_2
    return-void

    .line 2041
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
