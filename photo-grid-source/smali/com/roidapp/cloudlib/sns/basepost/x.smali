.class final Lcom/roidapp/cloudlib/sns/basepost/x;
.super Lcom/roidapp/cloudlib/sns/basepost/bu;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/roidapp/cloudlib/sns/basepost/w;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/w;Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 268
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/x;->d:Lcom/roidapp/cloudlib/sns/basepost/w;

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/roidapp/cloudlib/sns/basepost/bu;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 272
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/x;->d:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Lcom/roidapp/cloudlib/sns/basepost/w;)Lcom/roidapp/cloudlib/sns/basepost/at;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/x;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(Ljava/lang/String;)V

    .line 273
    return-void
.end method
