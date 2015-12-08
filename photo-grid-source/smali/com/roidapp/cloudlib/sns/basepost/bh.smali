.class final Lcom/roidapp/cloudlib/sns/basepost/bh;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/bg;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bg;)V
    .locals 0

    .prologue
    .line 951
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bh;->a:Lcom/roidapp/cloudlib/sns/basepost/bg;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 962
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bh;->a:Lcom/roidapp/cloudlib/sns/basepost/bg;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->m()V

    .line 963
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bh;->a:Lcom/roidapp/cloudlib/sns/basepost/bg;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aw:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 965
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 951
    .line 1955
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bh;->a:Lcom/roidapp/cloudlib/sns/basepost/bg;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->m()V

    .line 1956
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/aw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/aw;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bb;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bh;->a:Lcom/roidapp/cloudlib/sns/basepost/bg;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->ay:I

    sget v3, Lcom/roidapp/cloudlib/at;->ax:I

    sget v4, Lcom/roidapp/cloudlib/at;->f:I

    const/4 v5, -0x1

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Landroid/content/Context;IIII)V

    .line 951
    return-void
.end method
