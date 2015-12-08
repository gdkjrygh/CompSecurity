.class final Lcom/roidapp/cloudlib/sns/basepost/y;
.super Lcom/roidapp/cloudlib/sns/basepost/av;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/w;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/w;IILjava/lang/String;)V
    .locals 1

    .prologue
    .line 276
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/y;->d:Lcom/roidapp/cloudlib/sns/basepost/w;

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/roidapp/cloudlib/sns/basepost/av;-><init>(IILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 280
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/y;->d:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Lcom/roidapp/cloudlib/sns/basepost/w;)Lcom/roidapp/cloudlib/sns/basepost/at;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/y;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    .line 281
    return-void
.end method
