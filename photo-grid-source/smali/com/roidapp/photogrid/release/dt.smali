.class final Lcom/roidapp/photogrid/release/dt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 832
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dt;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 837
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dt;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ei;->a()[I

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dt;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    aget v0, v0, v1

    sget v1, Lcom/roidapp/photogrid/release/ei;->b:I

    if-ne v0, v1, :cond_0

    .line 838
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dt;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 839
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dt;->a:Lcom/roidapp/photogrid/release/dk;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    .line 841
    :cond_0
    return-void
.end method
