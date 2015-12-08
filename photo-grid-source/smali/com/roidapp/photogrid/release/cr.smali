.class final Lcom/roidapp/photogrid/release/cr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:Lcom/roidapp/photogrid/release/ck;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ck;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 387
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cr;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/cr;->b:Landroid/view/View;

    iput p4, p0, Lcom/roidapp/photogrid/release/cr;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const v2, 0x7f0d0493

    .line 390
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 400
    :goto_0
    return-void

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->m(Lcom/roidapp/photogrid/release/ck;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->m(Lcom/roidapp/photogrid/release/ck;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 397
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->b:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    iget v1, p0, Lcom/roidapp/photogrid/release/cr;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cr;->d:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/mm;->b(I)V

    goto :goto_0
.end method
