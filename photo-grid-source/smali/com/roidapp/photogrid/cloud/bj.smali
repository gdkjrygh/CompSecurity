.class final Lcom/roidapp/photogrid/cloud/bj;
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
    .line 202
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    .line 207
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->f()V

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->a(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)Z

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bj;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g()V

    .line 211
    return-void
.end method
