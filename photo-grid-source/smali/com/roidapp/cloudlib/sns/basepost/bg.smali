.class final Lcom/roidapp/cloudlib/sns/basepost/bg;
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
    .line 945
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 949
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->l()V

    .line 950
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->b:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bg;->a:I

    new-instance v4, Lcom/roidapp/cloudlib/sns/basepost/bh;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/sns/basepost/bh;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bg;)V

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->i(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 967
    return-void
.end method
