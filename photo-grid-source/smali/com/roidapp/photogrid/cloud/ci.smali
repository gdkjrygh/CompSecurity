.class final Lcom/roidapp/photogrid/cloud/ci;
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
.field final synthetic a:Lcom/roidapp/photogrid/cloud/ch;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/ch;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/a/f;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/f;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/ch;)V

    goto :goto_0

    .line 75
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->b(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FlowLayout;->removeAllViews()V

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/cm;->b()V

    :cond_4
    move v1, v2

    .line 79
    :goto_1
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/f;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 80
    invoke-virtual {p1, v1}, Lcom/roidapp/cloudlib/sns/b/a/f;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    .line 81
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v3}, Lcom/roidapp/photogrid/cloud/ch;->b(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "#"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/ch;Ljava/lang/String;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roidapp/baselib/view/FlowLayout;->addView(Landroid/view/View;)V

    .line 82
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v3}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 83
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v3}, Lcom/roidapp/photogrid/cloud/ch;->c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/roidapp/photogrid/cloud/cm;->a(Ljava/lang/String;)V

    .line 79
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 86
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0, p1}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/ch;Ljava/util/List;)V

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->d(Lcom/roidapp/photogrid/cloud/ch;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->b(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/view/FlowLayout;->setVisibility(I)V

    goto/16 :goto_0
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ci;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/ch;)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 65
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 1101
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/ci;->a(Lcom/roidapp/cloudlib/sns/b/a/f;)V

    .line 1102
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 65
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 65
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/ci;->a(Lcom/roidapp/cloudlib/sns/b/a/f;)V

    return-void
.end method
