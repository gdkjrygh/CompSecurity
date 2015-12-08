.class final Lcom/roidapp/cloudlib/template/a/f;
.super Lcom/roidapp/baselib/c/s;
.source "SourceFile"


# instance fields
.field k:Landroid/widget/ProgressBar;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/TextView;

.field n:Landroid/widget/TextView;

.field o:Landroid/widget/ImageView;

.field p:Landroid/widget/ImageView;

.field q:Landroid/widget/ImageView;

.field r:Landroid/widget/ImageView;

.field s:Landroid/widget/ImageView;

.field t:Landroid/widget/ImageView;

.field u:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 320
    invoke-direct {p0, p1, p2}, Lcom/roidapp/baselib/c/s;-><init>(Landroid/view/View;I)V

    .line 1325
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cA:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->u:Landroid/view/View;

    .line 1326
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cz:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->o:Landroid/widget/ImageView;

    .line 1327
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cx:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->l:Landroid/widget/TextView;

    .line 1328
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cF:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    .line 1329
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cs:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    .line 1330
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cy:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    .line 1331
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cB:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->k:Landroid/widget/ProgressBar;

    .line 1332
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cC:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->n:Landroid/widget/TextView;

    .line 1333
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cr:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->r:Landroid/widget/ImageView;

    .line 1334
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cu:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    .line 1335
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->a:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/f;->t:Landroid/widget/ImageView;

    .line 322
    return-void
.end method
