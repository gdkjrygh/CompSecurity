.class final Lcom/roidapp/photogrid/release/eg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 662
    iput-object p1, p0, Lcom/roidapp/photogrid/release/eg;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 665
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eg;->a:Lcom/roidapp/photogrid/release/dk;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;I)I

    .line 666
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eg;->a:Lcom/roidapp/photogrid/release/dk;

    sget v1, Lcom/roidapp/photogrid/release/ei;->j:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 667
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eg;->a:Lcom/roidapp/photogrid/release/dk;

    sget v1, Lcom/roidapp/photogrid/release/ei;->j:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 668
    :cond_0
    return-void
.end method
