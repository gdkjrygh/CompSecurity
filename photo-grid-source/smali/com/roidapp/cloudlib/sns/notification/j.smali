.class final Lcom/roidapp/cloudlib/sns/notification/j;
.super Lcom/roidapp/cloudlib/sns/basepost/bu;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 387
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/j;->d:Lcom/roidapp/cloudlib/sns/notification/f;

    const/4 v0, 0x1

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/roidapp/cloudlib/sns/basepost/bu;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 391
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/j;->d:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->d(Lcom/roidapp/cloudlib/sns/notification/f;)Lcom/roidapp/cloudlib/sns/notification/o;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/j;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/notification/o;->a(Ljava/lang/String;)V

    .line 393
    return-void
.end method
