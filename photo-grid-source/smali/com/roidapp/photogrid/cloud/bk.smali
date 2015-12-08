.class final Lcom/roidapp/photogrid/cloud/bk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bk;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bk;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bk;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bk;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 220
    :cond_0
    return-void
.end method
