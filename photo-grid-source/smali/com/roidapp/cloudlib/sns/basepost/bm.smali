.class final Lcom/roidapp/cloudlib/sns/basepost/bm;
.super Lcom/roidapp/cloudlib/sns/basepost/av;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/bc;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IILjava/lang/String;Z)V
    .locals 0

    .prologue
    .line 325
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bm;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/roidapp/cloudlib/sns/basepost/av;-><init>(IILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 329
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bm;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bm;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    .line 330
    return-void
.end method
