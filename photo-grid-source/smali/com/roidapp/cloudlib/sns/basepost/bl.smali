.class final Lcom/roidapp/cloudlib/sns/basepost/bl;
.super Lcom/roidapp/cloudlib/sns/basepost/bu;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Ljava/lang/String;IIZ)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bl;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/roidapp/cloudlib/sns/basepost/bu;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 321
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bl;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bl;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(Ljava/lang/String;)V

    .line 322
    return-void
.end method
