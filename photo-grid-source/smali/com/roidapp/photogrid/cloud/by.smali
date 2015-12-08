.class final Lcom/roidapp/photogrid/cloud/by;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 396
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/by;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/a/f;)V
    .locals 3

    .prologue
    .line 399
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/f;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 405
    :cond_0
    :goto_0
    return-void

    .line 403
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/by;->a:Lcom/roidapp/photogrid/cloud/br;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/b/a/f;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/roidapp/photogrid/cloud/br;Ljava/lang/String;)Ljava/lang/String;

    .line 404
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/by;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->d(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/by;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->i(Lcom/roidapp/photogrid/cloud/br;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 410
    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 396
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 1414
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/by;->a(Lcom/roidapp/cloudlib/sns/b/a/f;)V

    .line 1415
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 396
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 396
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/by;->a(Lcom/roidapp/cloudlib/sns/b/a/f;)V

    return-void
.end method
