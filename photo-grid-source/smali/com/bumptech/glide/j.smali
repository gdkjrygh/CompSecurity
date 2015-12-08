.class public final Lcom/bumptech/glide/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/widget/AbsListView$OnScrollListener;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lcom/bumptech/glide/n;

.field private final c:Lcom/bumptech/glide/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/k",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/bumptech/glide/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/l",
            "<TT;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/k",
            "<TT;>;",
            "Lcom/bumptech/glide/l",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/j;->i:Z

    .line 136
    iput-object p1, p0, Lcom/bumptech/glide/j;->c:Lcom/bumptech/glide/k;

    .line 137
    iput-object p2, p0, Lcom/bumptech/glide/j;->d:Lcom/bumptech/glide/l;

    .line 138
    const/4 v0, 0x6

    iput v0, p0, Lcom/bumptech/glide/j;->a:I

    .line 139
    new-instance v0, Lcom/bumptech/glide/n;

    invoke-direct {v0}, Lcom/bumptech/glide/n;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/j;->b:Lcom/bumptech/glide/n;

    .line 140
    return-void
.end method

.method private a(IZ)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 217
    iget-boolean v0, p0, Lcom/bumptech/glide/j;->i:Z

    if-eq v0, p2, :cond_0

    .line 218
    iput-boolean p2, p0, Lcom/bumptech/glide/j;->i:Z

    move v0, v1

    .line 1276
    :goto_0
    iget v2, p0, Lcom/bumptech/glide/j;->a:I

    if-ge v0, v2, :cond_0

    .line 1277
    iget-object v2, p0, Lcom/bumptech/glide/j;->b:Lcom/bumptech/glide/n;

    invoke-virtual {v2, v1, v1}, Lcom/bumptech/glide/n;->a(II)Lcom/bumptech/glide/m;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Lcom/bumptech/glide/g/b/k;)V

    .line 1276
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 221
    :cond_0
    if-eqz p2, :cond_1

    iget v0, p0, Lcom/bumptech/glide/j;->a:I

    :goto_1
    add-int v2, p1, v0

    .line 2227
    if-ge p1, v2, :cond_2

    .line 2228
    iget v0, p0, Lcom/bumptech/glide/j;->e:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v3, v0

    move v0, v2

    .line 2234
    :goto_2
    iget v4, p0, Lcom/bumptech/glide/j;->h:I

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 2235
    iget v0, p0, Lcom/bumptech/glide/j;->h:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 2237
    if-ge p1, v2, :cond_3

    move v0, v3

    .line 2239
    :goto_3
    if-ge v0, v4, :cond_4

    .line 2240
    iget-object v1, p0, Lcom/bumptech/glide/j;->c:Lcom/bumptech/glide/k;

    invoke-interface {v1, v0}, Lcom/bumptech/glide/k;->c(I)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2}, Lcom/bumptech/glide/j;->a(Ljava/util/List;Z)V

    .line 2239
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 221
    :cond_1
    iget v0, p0, Lcom/bumptech/glide/j;->a:I

    neg-int v0, v0

    goto :goto_1

    .line 2232
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/j;->f:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v3, v2

    goto :goto_2

    .line 2244
    :cond_3
    add-int/lit8 v0, v4, -0x1

    :goto_4
    if-lt v0, v3, :cond_4

    .line 2245
    iget-object v2, p0, Lcom/bumptech/glide/j;->c:Lcom/bumptech/glide/k;

    invoke-interface {v2, v0}, Lcom/bumptech/glide/k;->c(I)Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lcom/bumptech/glide/j;->a(Ljava/util/List;Z)V

    .line 2244
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    .line 2249
    :cond_4
    iput v3, p0, Lcom/bumptech/glide/j;->f:I

    .line 2250
    iput v4, p0, Lcom/bumptech/glide/j;->e:I

    .line 222
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 268
    iget-object v0, p0, Lcom/bumptech/glide/j;->d:Lcom/bumptech/glide/l;

    invoke-interface {v0}, Lcom/bumptech/glide/l;->b()[I

    move-result-object v0

    .line 270
    iget-object v1, p0, Lcom/bumptech/glide/j;->c:Lcom/bumptech/glide/k;

    invoke-interface {v1, p1}, Lcom/bumptech/glide/k;->a(Ljava/lang/Object;)Lcom/bumptech/glide/e;

    move-result-object v1

    .line 271
    iget-object v2, p0, Lcom/bumptech/glide/j;->b:Lcom/bumptech/glide/n;

    const/4 v3, 0x0

    aget v3, v0, v3

    const/4 v4, 0x1

    aget v0, v0, v4

    invoke-virtual {v2, v3, v0}, Lcom/bumptech/glide/n;->a(II)Lcom/bumptech/glide/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 273
    return-void
.end method

.method private a(Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TT;>;Z)V"
        }
    .end annotation

    .prologue
    .line 254
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 255
    if-eqz p2, :cond_0

    .line 256
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 257
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/bumptech/glide/j;->a(Ljava/lang/Object;)V

    .line 256
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 260
    :cond_0
    add-int/lit8 v0, v1, -0x1

    :goto_1
    if-ltz v0, :cond_1

    .line 261
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/bumptech/glide/j;->a(Ljava/lang/Object;)V

    .line 260
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 264
    :cond_1
    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .prologue
    .line 150
    iput p4, p0, Lcom/bumptech/glide/j;->h:I

    .line 151
    iget v0, p0, Lcom/bumptech/glide/j;->g:I

    if-le p2, v0, :cond_1

    .line 152
    add-int v0, p2, p3

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/bumptech/glide/j;->a(IZ)V

    .line 156
    :cond_0
    :goto_0
    iput p2, p0, Lcom/bumptech/glide/j;->g:I

    .line 157
    return-void

    .line 153
    :cond_1
    iget v0, p0, Lcom/bumptech/glide/j;->g:I

    if-ge p2, v0, :cond_0

    .line 154
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/bumptech/glide/j;->a(IZ)V

    goto :goto_0
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 145
    return-void
.end method
