.class final Lcom/roidapp/photogrid/release/gu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 1019
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 1023
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1024
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0d0047

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1025
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    const v1, 0x7f0d0048

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1026
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ge;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1030
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gu;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->r(Lcom/roidapp/photogrid/release/ge;)V

    .line 1031
    return-void
.end method
