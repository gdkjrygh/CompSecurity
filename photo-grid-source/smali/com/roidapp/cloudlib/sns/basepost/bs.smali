.class final Lcom/roidapp/cloudlib/sns/basepost/bs;
.super Landroid/support/v7/widget/bi;
.source "SourceFile"


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/view/ViewGroup;

.field public C:Landroid/widget/TextView;

.field public j:Landroid/view/View;

.field public k:Lcom/roidapp/baselib/view/RoundImageView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/ProgressBar;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/TextView;

.field public q:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

.field public r:Landroid/view/ViewGroup;

.field public s:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

.field public t:Landroid/view/ViewGroup;

.field public u:Landroid/view/ViewGroup;

.field public v:Landroid/view/ViewGroup;

.field public w:Landroid/widget/ProgressBar;

.field public x:Landroid/widget/ImageView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 164
    invoke-direct {p0, p1}, Landroid/support/v7/widget/bi;-><init>(Landroid/view/View;)V

    .line 166
    sget v0, Lcom/roidapp/cloudlib/ar;->aJ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    .line 167
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aL:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->k:Lcom/roidapp/baselib/view/RoundImageView;

    .line 168
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aM:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->l:Landroid/widget/TextView;

    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aK:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->m:Landroid/widget/TextView;

    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ah:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->B:Landroid/view/ViewGroup;

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->B:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->aj:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->C:Landroid/widget/TextView;

    .line 173
    sget v0, Lcom/roidapp/cloudlib/ar;->ap:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->n:Landroid/widget/ProgressBar;

    .line 174
    sget v0, Lcom/roidapp/cloudlib/ar;->aq:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->p:Landroid/widget/TextView;

    .line 175
    sget v0, Lcom/roidapp/cloudlib/ar;->ar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->o:Landroid/widget/ImageView;

    .line 176
    sget v0, Lcom/roidapp/cloudlib/ar;->ag:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->q:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 177
    sget v0, Lcom/roidapp/cloudlib/ar;->Q:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->r:Landroid/view/ViewGroup;

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->P:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->s:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 180
    sget v0, Lcom/roidapp/cloudlib/ar;->ax:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    .line 181
    sget v0, Lcom/roidapp/cloudlib/ar;->N:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->u:Landroid/view/ViewGroup;

    .line 182
    sget v0, Lcom/roidapp/cloudlib/ar;->aC:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->v:Landroid/view/ViewGroup;

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->az:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->y:Landroid/widget/TextView;

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->aw:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->w:Landroid/widget/ProgressBar;

    .line 188
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->u:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->O:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->z:Landroid/widget/TextView;

    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->v:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->aB:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bs;->A:Landroid/widget/TextView;

    .line 192
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 193
    return-void
.end method
