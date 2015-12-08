.class public final Lcom/roidapp/cloudlib/b/j;
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

.field private g:Lcom/roidapp/cloudlib/b/m;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

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
            "Lcom/roidapp/cloudlib/sns/b/a/h;",
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

    .line 45
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 58
    iput v0, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    .line 59
    iput v0, p0, Lcom/roidapp/cloudlib/b/j;->k:I

    .line 470
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/j;Lcom/roidapp/cloudlib/sns/b/a/h;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 45
    .line 2340
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->p:Z

    if-nez v0, :cond_1

    .line 2341
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->l()V

    .line 2342
    iget v0, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    if-ne v0, v1, :cond_4

    .line 2343
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->g()V

    .line 2344
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    .line 2345
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2346
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    .line 2351
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 2352
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->i()V

    .line 2379
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->k()V

    .line 45
    :cond_1
    return-void

    .line 2357
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_3

    .line 2358
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->i()V

    goto :goto_0

    .line 2360
    :cond_3
    sget v0, Lcom/roidapp/cloudlib/at;->ac:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/b/j;->a(I)V

    goto :goto_0

    .line 2364
    :cond_4
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2365
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 2366
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2370
    :goto_1
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    goto :goto_0

    .line 2368
    :cond_5
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/j;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 45
    .line 2512
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/e/a;

    invoke-direct {v1, p2}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/j;Z)V
    .locals 1

    .prologue
    .line 45
    .line 2385
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->p:Z

    if-nez v0, :cond_1

    .line 2386
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/b/j;->q:Z

    .line 2387
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->l()V

    .line 2388
    iget v0, p0, Lcom/roidapp/cloudlib/b/j;->k:I

    iput v0, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    .line 2389
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 2390
    :cond_0
    if-eqz p1, :cond_2

    .line 2391
    sget v0, Lcom/roidapp/cloudlib/at;->e:I

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/j;->c(I)V

    :cond_1
    :goto_0
    return-void

    .line 2393
    :cond_2
    sget v0, Lcom/roidapp/cloudlib/at;->t:I

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/j;->c(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/j;)Z
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 304
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->g()V

    .line 305
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->h()V

    .line 306
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 310
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 224
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/b/j;->p:Z

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 2218
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2219
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 229
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->k()V

    .line 230
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    .line 231
    new-instance v0, Lcom/roidapp/cloudlib/b/k;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/k;-><init>(Lcom/roidapp/cloudlib/b/j;)V

    invoke-static {v1, p1, v0}, Lcom/roidapp/cloudlib/sns/q;->a(ZLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    .line 251
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 253
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 264
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 267
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 285
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 286
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 288
    :cond_0
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 291
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/m;->getCount()I

    move-result v0

    if-gtz v0, :cond_3

    .line 292
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->g()V

    .line 296
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->j()V

    .line 297
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 300
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->aB:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 301
    return-void

    .line 2270
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 2271
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private j()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 313
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 314
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 316
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 319
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    if-nez v0, :cond_0

    .line 320
    new-instance v0, Lcom/roidapp/cloudlib/b/m;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/m;-><init>(Lcom/roidapp/cloudlib/b/j;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    .line 321
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/m;->notifyDataSetChanged()V

    .line 324
    iget v0, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x14

    add-int/lit8 v0, v0, -0x1

    .line 325
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    if-eqz v1, :cond_1

    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 326
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/j;->a:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V

    .line 328
    :cond_1
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 403
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->l:Z

    if-eqz v0, :cond_0

    .line 404
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/b/j;->l:Z

    .line 405
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 409
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 276
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->g()V

    .line 277
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->j()V

    .line 278
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 282
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 186
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 1256
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->h()V

    .line 1257
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->j()V

    .line 1258
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1259
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->c:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->aC:I

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/cloudlib/b/j;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/b/j;->c(Ljava/lang/String;)V

    .line 195
    :cond_2
    :goto_0
    return-void

    .line 192
    :cond_3
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/b/j;->m:Z

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 198
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->g()V

    .line 199
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->h()V

    .line 200
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->j()V

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    .line 202
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->k()V

    .line 203
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 206
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->m:Z

    if-nez v0, :cond_0

    .line 207
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->m:Z

    .line 209
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 212
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->m:Z

    return v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 333
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->p:Z

    .line 334
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->o:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 337
    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 100
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityCreated(Landroid/os/Bundle;)V

    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Lcom/roidapp/cloudlib/b/m;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/m;-><init>(Lcom/roidapp/cloudlib/b/j;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1115
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->i:Z

    if-eqz v0, :cond_2

    .line 1116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->i:Z

    .line 1117
    iput v2, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    iput v2, p0, Lcom/roidapp/cloudlib/b/j;->k:I

    :cond_1
    :goto_0
    return-void

    .line 1120
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->g:Lcom/roidapp/cloudlib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/m;->getCount()I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 1121
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/j;->i()V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 68
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onAttach(Landroid/app/Activity;)V

    .line 69
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->q:Z

    if-eqz v0, :cond_0

    .line 134
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.WIFI_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/b/j;->startActivity(Landroid/content/Intent;)V

    .line 137
    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 73
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->i:Z

    .line 75
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 80
    sget v0, Lcom/roidapp/cloudlib/as;->R:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 81
    sget v0, Lcom/roidapp/cloudlib/ar;->cg:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->a:Landroid/widget/ListView;

    .line 82
    sget v0, Lcom/roidapp/cloudlib/ar;->cf:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->b:Landroid/view/View;

    .line 83
    sget v0, Lcom/roidapp/cloudlib/ar;->ce:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->c:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/roidapp/cloudlib/ar;->bY:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    .line 85
    sget v0, Lcom/roidapp/cloudlib/ar;->bZ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/roidapp/cloudlib/ar;->cm:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 87
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {p0, v0, v2, v2}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->d:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->e:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->ac:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const-string v2, "Usersearch_Page"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 95
    return-object v1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
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
    .line 449
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p3, :cond_0

    .line 451
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/j;->h:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 452
    if-eqz v0, :cond_0

    .line 453
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v2, v3, v1, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v1

    .line 454
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 455
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 468
    :cond_0
    :goto_0
    return-void

    .line 459
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 460
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/b/l;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/b/l;-><init>(Lcom/roidapp/cloudlib/b/j;)V

    const-string v2, "Usersearch_Page"

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 413
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/j;->l:Z

    if-nez v0, :cond_0

    .line 414
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/b/j;->l:Z

    .line 415
    iget v0, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    iput v0, p0, Lcom/roidapp/cloudlib/b/j;->k:I

    .line 416
    iput v1, p0, Lcom/roidapp/cloudlib/b/j;->j:I

    .line 417
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/j;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/b/j;->c(Ljava/lang/String;)V

    .line 419
    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 0

    .prologue
    .line 111
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onResume()V

    .line 112
    return-void
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 438
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 445
    return-void
.end method
