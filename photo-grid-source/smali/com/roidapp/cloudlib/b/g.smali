.class public final Lcom/roidapp/cloudlib/b/g;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Lcom/roidapp/cloudlib/b/i;

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Lcom/roidapp/cloudlib/sns/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/g;",
            ">;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 36
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 48
    iput v0, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    .line 49
    iput v0, p0, Lcom/roidapp/cloudlib/b/g;->k:I

    .line 455
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/g;Lcom/roidapp/cloudlib/sns/b/a/g;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 36
    .line 2328
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->p:Z

    if-nez v0, :cond_1

    .line 2329
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->l()V

    .line 2330
    iget v0, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    if-ne v0, v1, :cond_4

    .line 2331
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->g()V

    .line 2332
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    .line 2333
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/g;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2334
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/g;->size()I

    .line 2339
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 2340
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->i()V

    .line 2367
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->k()V

    .line 36
    :cond_1
    return-void

    .line 2345
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_3

    .line 2346
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->i()V

    goto :goto_0

    .line 2348
    :cond_3
    sget v0, Lcom/roidapp/cloudlib/at;->ad:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/b/g;->a(I)V

    goto :goto_0

    .line 2352
    :cond_4
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/g;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2353
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 2354
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2358
    :goto_1
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/g;->size()I

    goto :goto_0

    .line 2356
    :cond_5
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/g;Z)V
    .locals 1

    .prologue
    .line 36
    .line 2373
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->p:Z

    if-nez v0, :cond_1

    .line 2374
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/b/g;->q:Z

    .line 2375
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->l()V

    .line 2376
    iget v0, p0, Lcom/roidapp/cloudlib/b/g;->k:I

    iput v0, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    .line 2377
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 2378
    :cond_0
    if-eqz p1, :cond_2

    .line 2379
    sget v0, Lcom/roidapp/cloudlib/at;->e:I

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/g;->c(I)V

    :cond_1
    :goto_0
    return-void

    .line 2381
    :cond_2
    sget v0, Lcom/roidapp/cloudlib/at;->t:I

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/g;->c(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/g;)Z
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 292
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->g()V

    .line 293
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->h()V

    .line 294
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 298
    return-void
.end method

.method private declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 212
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->p:Z

    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 2204
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2205
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 217
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->k()V

    .line 218
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    .line 219
    new-instance v0, Lcom/roidapp/cloudlib/b/h;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/h;-><init>(Lcom/roidapp/cloudlib/b/g;)V

    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    .line 239
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 240
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    monitor-exit p0

    return-void

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private g()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 255
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 274
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    :cond_0
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 279
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/i;->getCount()I

    move-result v0

    if-gtz v0, :cond_3

    .line 280
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->g()V

    .line 284
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->j()V

    .line 285
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 286
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 288
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->aB:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 289
    return-void

    .line 2258
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 2259
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private j()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 301
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 304
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 307
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    if-nez v0, :cond_0

    .line 308
    new-instance v0, Lcom/roidapp/cloudlib/b/i;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/i;-><init>(Lcom/roidapp/cloudlib/b/g;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    .line 309
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/i;->notifyDataSetChanged()V

    .line 312
    iget v0, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x14

    add-int/lit8 v0, v0, -0x1

    .line 313
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    if-eqz v1, :cond_1

    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 314
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/g;->a:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 316
    :cond_1
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 391
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->l:Z

    if-eqz v0, :cond_0

    .line 392
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/b/g;->l:Z

    .line 393
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 397
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 264
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->g()V

    .line 265
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->j()V

    .line 266
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 270
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 174
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/g;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/g;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 1244
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->h()V

    .line 1245
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->j()V

    .line 1246
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1247
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 177
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->c:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->aC:I

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/cloudlib/b/g;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/b/g;->c(Ljava/lang/String;)V

    .line 183
    :cond_2
    :goto_0
    return-void

    .line 180
    :cond_3
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/b/g;->m:Z

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 186
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->g()V

    .line 187
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->h()V

    .line 188
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->j()V

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    .line 190
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->k()V

    .line 191
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 194
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->m:Z

    if-nez v0, :cond_0

    .line 195
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->m:Z

    .line 197
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->m:Z

    return v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 321
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->p:Z

    .line 322
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 325
    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 89
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityCreated(Landroid/os/Bundle;)V

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Lcom/roidapp/cloudlib/b/i;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/i;-><init>(Lcom/roidapp/cloudlib/b/g;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1104
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->h:Z

    if-eqz v0, :cond_2

    .line 1105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->h:Z

    .line 1106
    iput v2, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    iput v2, p0, Lcom/roidapp/cloudlib/b/g;->k:I

    :cond_1
    :goto_0
    return-void

    .line 1108
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->i:Lcom/roidapp/cloudlib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/i;->getCount()I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 1109
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/g;->i()V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 58
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onAttach(Landroid/app/Activity;)V

    .line 59
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->q:Z

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.WIFI_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/b/g;->startActivity(Landroid/content/Intent;)V

    .line 121
    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 64
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 69
    sget v0, Lcom/roidapp/cloudlib/as;->R:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 70
    sget v0, Lcom/roidapp/cloudlib/ar;->cg:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->a:Landroid/widget/ListView;

    .line 71
    sget v0, Lcom/roidapp/cloudlib/ar;->cf:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->b:Landroid/view/View;

    .line 72
    sget v0, Lcom/roidapp/cloudlib/ar;->ce:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->c:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/roidapp/cloudlib/ar;->bY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/roidapp/cloudlib/ar;->bZ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    .line 75
    sget v0, Lcom/roidapp/cloudlib/ar;->cm:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {p0, v0, v2, v2}, Lcom/roidapp/cloudlib/b/g;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 78
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 79
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->e:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->ad:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    return-object v1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 438
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p3, :cond_0

    .line 439
    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 440
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/g;->g:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "Hashtagsearch_%s_Page"

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/g;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 453
    :cond_0
    return-void
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 401
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/g;->l:Z

    if-nez v0, :cond_0

    .line 402
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/b/g;->l:Z

    .line 403
    iget v0, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    iput v0, p0, Lcom/roidapp/cloudlib/b/g;->k:I

    .line 404
    iput v1, p0, Lcom/roidapp/cloudlib/b/g;->j:I

    .line 405
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/g;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/g;->c(Ljava/lang/String;)V

    .line 407
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 0

    .prologue
    .line 100
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onResume()V

    .line 101
    return-void
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 426
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 433
    return-void
.end method
