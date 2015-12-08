.class final Lcom/roidapp/photogrid/release/dr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 768
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dr;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 771
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 772
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dr;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ei;->a()[I

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dr;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    aget v0, v0, v1

    sget v1, Lcom/roidapp/photogrid/release/ei;->e:I

    if-ne v0, v1, :cond_0

    .line 773
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dr;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 774
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dr;->a:Lcom/roidapp/photogrid/release/dk;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    .line 776
    :cond_0
    return-void
.end method
