.class final Lcom/roidapp/photogrid/cloud/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bi;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bi;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bi;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bi;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
