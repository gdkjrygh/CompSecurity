.class final Lcom/roidapp/cloudlib/sns/basepost/bt;
.super Landroid/support/v7/widget/bi;
.source "SourceFile"


# instance fields
.field public j:Landroid/widget/ImageView;

.field public k:Landroid/view/View;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/TextView;

.field public n:Lcom/roidapp/baselib/view/RoundImageView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/view/ViewGroup;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/ProgressBar;

.field public s:Landroid/view/ViewGroup;

.field public t:Landroid/widget/ImageView;

.field public u:Landroid/widget/ImageView;

.field public v:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 223
    invoke-direct {p0, p1}, Landroid/support/v7/widget/bi;-><init>(Landroid/view/View;)V

    .line 225
    sget v0, Lcom/roidapp/cloudlib/ar;->aJ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->k:Landroid/view/View;

    .line 227
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->k:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ak:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->m:Landroid/widget/TextView;

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->k:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->al:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->j:Landroid/widget/ImageView;

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->k:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->am:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->an:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->n:Lcom/roidapp/baselib/view/RoundImageView;

    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ao:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->o:Landroid/widget/TextView;

    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ah:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->p:Landroid/view/ViewGroup;

    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->p:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->aj:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    .line 238
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->p:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->ai:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->r:Landroid/widget/ProgressBar;

    .line 240
    sget v0, Lcom/roidapp/cloudlib/ar;->av:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    .line 241
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->as:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->t:Landroid/widget/ImageView;

    .line 242
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->at:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->u:Landroid/widget/ImageView;

    .line 243
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->au:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    .line 245
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 246
    return-void
.end method
