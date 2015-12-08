.class final Lcom/roidapp/cloudlib/sns/a/b;
.super Landroid/support/v7/widget/ax;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPropertyAnimatorListener;
.implements Landroid/widget/AbsListView$OnScrollListener;


# static fields
.field private static final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/a/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private final g:Landroid/util/SparseIntArray;

.field private final h:Landroid/view/View;

.field private final i:Ljava/lang/Object;

.field private j:Landroid/widget/AbsListView$OnScrollListener;

.field private k:Landroid/support/v7/widget/ax;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/a/b;->l:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/support/v7/widget/ax;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 44
    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    .line 19
    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    .line 23
    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    .line 27
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    .line 45
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/a/b;->k:Landroid/support/v7/widget/ax;

    .line 46
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    .line 47
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/widget/AbsListView$OnScrollListener;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 38
    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    .line 19
    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    .line 23
    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    .line 27
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    .line 39
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/a/b;->j:Landroid/widget/AbsListView$OnScrollListener;

    .line 40
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    .line 41
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    .line 42
    return-void
.end method

.method private static a(I)V
    .locals 2

    .prologue
    .line 196
    sget-object v0, Lcom/roidapp/cloudlib/sns/a/b;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/a/c;

    .line 197
    invoke-interface {v0, p0}, Lcom/roidapp/cloudlib/sns/a/c;->a(I)V

    goto :goto_0

    .line 199
    :cond_0
    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/a/c;)V
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/roidapp/cloudlib/sns/a/b;->l:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    sget-object v0, Lcom/roidapp/cloudlib/sns/a/b;->l:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_0
    return-void
.end method

.method private static a(Landroid/view/View;I)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 202
    if-nez p0, :cond_1

    .line 207
    :cond_0
    :goto_0
    return v0

    .line 205
    :cond_1
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    move-result v1

    float-to-int v1, v1

    .line 206
    int-to-float v2, p1

    invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 207
    int-to-float v1, v1

    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    move-result v2

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/a/c;)V
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/roidapp/cloudlib/sns/a/b;->l:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 63
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->k:Landroid/support/v7/widget/ax;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->k:Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;I)V

    .line 120
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 72
    :cond_1
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    if-nez v0, :cond_3

    .line 73
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    .line 76
    :cond_3
    if-lez p3, :cond_6

    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getY(Landroid/view/View;)F

    move-result v0

    float-to-int v0, v0

    .line 78
    iget v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v1, v1

    if-le v0, v1, :cond_5

    .line 79
    sub-int/2addr v0, p3

    .line 80
    iget v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v1, v1

    if-ge v0, v1, :cond_4

    .line 81
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v0, v0

    .line 83
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 84
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(I)V

    .line 100
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->k:Landroid/support/v7/widget/ax;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->k:Landroid/support/v7/widget/ax;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;II)V

    goto :goto_0

    .line 87
    :cond_6
    if-gez p3, :cond_5

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getY(Landroid/view/View;)F

    move-result v0

    float-to-int v0, v0

    .line 89
    if-gez v0, :cond_5

    .line 90
    sub-int/2addr v0, p3

    .line 91
    if-lez v0, :cond_7

    .line 92
    const/4 v0, 0x0

    .line 94
    :cond_7
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 95
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(I)V

    goto :goto_1
.end method

.method public final onAnimationCancel(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 290
    return-void
.end method

.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 282
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 283
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->f:I

    .line 285
    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 278
    return-void
.end method

.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->i:Ljava/lang/Object;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 193
    :cond_0
    :goto_0
    return-void

    .line 145
    :cond_1
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    if-nez v0, :cond_3

    .line 146
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    .line 1211
    :cond_3
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_13

    .line 1212
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    .line 1213
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    move v2, v0

    move v0, v1

    :goto_1
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v4

    if-gt v2, v4, :cond_6

    .line 1214
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v4

    if-ltz v4, :cond_4

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    if-eq v4, v5, :cond_5

    .line 1215
    :cond_4
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v4, v2, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 1213
    :cond_5
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1219
    :cond_6
    invoke-virtual {p1, v1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1220
    if-eqz v4, :cond_13

    .line 1221
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    if-ge v0, v3, :cond_e

    .line 1224
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    sub-int v0, v3, v0

    if-eq v0, v6, :cond_8

    .line 1225
    add-int/lit8 v0, v3, -0x1

    move v2, v0

    move v0, v1

    :goto_2
    iget v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    if-le v2, v5, :cond_9

    .line 1226
    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v5

    if-lez v5, :cond_7

    .line 1227
    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    add-int/2addr v0, v5

    .line 1225
    :goto_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 1232
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    goto :goto_3

    :cond_8
    move v0, v1

    .line 1236
    :cond_9
    iget v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->d:I

    iget v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    add-int/2addr v0, v5

    add-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->d:I

    .line 1237
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    .line 1258
    :cond_a
    :goto_4
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    if-gez v0, :cond_b

    .line 1259
    iput v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    .line 1262
    :cond_b
    iput v3, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    .line 1264
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->d:I

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int v2, v0, v2

    .line 1265
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->a:I

    sub-int v0, v2, v0

    .line 1266
    iput v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->a:I

    .line 151
    :goto_5
    if-lez v0, :cond_14

    .line 152
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v1}, Landroid/support/v4/view/ViewCompat;->getY(Landroid/view/View;)F

    move-result v1

    float-to-int v1, v1

    .line 153
    iget v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v2, v2

    if-le v1, v2, :cond_d

    .line 154
    sub-int v0, v1, v0

    .line 155
    iget v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v1, v1

    if-ge v0, v1, :cond_c

    .line 156
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->e:I

    neg-int v0, v0

    .line 158
    :cond_c
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 159
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/a/b;->a(I)V

    .line 190
    :cond_d
    :goto_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->j:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->j:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    goto/16 :goto_0

    .line 1238
    :cond_e
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    if-ge v3, v0, :cond_12

    .line 1241
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    sub-int/2addr v0, v3

    if-eq v0, v6, :cond_10

    .line 1242
    iget v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->b:I

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    move v0, v1

    :goto_7
    if-le v2, v3, :cond_11

    .line 1243
    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v5

    if-lez v5, :cond_f

    .line 1244
    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/a/b;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    add-int/2addr v0, v5

    .line 1242
    :goto_8
    add-int/lit8 v2, v2, -0x1

    goto :goto_7

    .line 1249
    :cond_f
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    goto :goto_8

    :cond_10
    move v0, v1

    .line 1253
    :cond_11
    iget v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->d:I

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    sub-int v0, v2, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->d:I

    .line 1254
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    goto :goto_4

    .line 1255
    :cond_12
    if-nez v3, :cond_a

    .line 1256
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->c:I

    goto/16 :goto_4

    :cond_13
    move v0, v1

    .line 1272
    goto :goto_5

    .line 169
    :cond_14
    if-gez v0, :cond_d

    .line 170
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v2}, Landroid/support/v4/view/ViewCompat;->getY(Landroid/view/View;)F

    move-result v2

    float-to-int v2, v2

    .line 171
    if-gez v2, :cond_d

    .line 172
    sub-int v0, v2, v0

    .line 173
    if-lez v0, :cond_15

    .line 176
    :goto_9
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->h:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/a/b;->a(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 177
    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/a/b;->a(I)V

    goto :goto_6

    :cond_15
    move v1, v0

    goto :goto_9
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->j:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/a/b;->j:Landroid/widget/AbsListView$OnScrollListener;

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 112
    :cond_0
    return-void
.end method
