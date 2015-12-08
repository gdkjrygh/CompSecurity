.class final Lcom/roidapp/cloudlib/sns/notification/k;
.super Lcom/roidapp/cloudlib/sns/basepost/av;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;IILjava/lang/String;)V
    .locals 1

    .prologue
    .line 397
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/k;->d:Lcom/roidapp/cloudlib/sns/notification/f;

    const/4 v0, 0x1

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/roidapp/cloudlib/sns/basepost/av;-><init>(IILjava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 401
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/k;->d:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->d(Lcom/roidapp/cloudlib/sns/notification/f;)Lcom/roidapp/cloudlib/sns/notification/o;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/k;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/notification/o;->b(Ljava/lang/String;)V

    .line 403
    return-void
.end method
