.class public final Landroid/support/v7/widget/StaggeredGridLayoutManager;
.super Landroid/support/v7/widget/au;
.source "SourceFile"


# instance fields
.field private A:Z

.field private final B:Ljava/lang/Runnable;

.field a:Landroid/support/v7/widget/ad;

.field b:Landroid/support/v7/widget/ad;

.field c:Z

.field d:I

.field e:I

.field f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

.field private g:I

.field private h:[Landroid/support/v7/widget/br;

.field private i:I

.field private j:I

.field private k:Landroid/support/v7/widget/u;

.field private l:Z

.field private m:Ljava/util/BitSet;

.field private n:I

.field private o:Z

.field private p:Z

.field private t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

.field private u:I

.field private v:I

.field private w:I

.field private final x:Landroid/graphics/Rect;

.field private final y:Landroid/support/v7/widget/bo;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 223
    invoke-direct {p0}, Landroid/support/v7/widget/au;-><init>()V

    .line 97
    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    .line 117
    iput-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l:Z

    .line 122
    iput-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    .line 133
    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    .line 139
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    .line 145
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-direct {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 150
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n:I

    .line 176
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    .line 181
    new-instance v0, Landroid/support/v7/widget/bo;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/bo;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;B)V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->y:Landroid/support/v7/widget/bo;

    .line 189
    iput-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    .line 195
    iput-boolean v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    .line 197
    new-instance v0, Landroid/support/v7/widget/bm;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/bm;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B:Ljava/lang/Runnable;

    .line 224
    iput v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    .line 225
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i()V

    .line 226
    return-void
.end method

.method private B()I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1943
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v1

    .line 1944
    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 1030
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 1038
    :cond_0
    :goto_0
    return p0

    .line 1033
    :cond_1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 1034
    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    .line 1035
    :cond_2
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/widget/StaggeredGridLayoutManager;I)I
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j(I)I

    move-result v0

    return v0
.end method

.method private a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I
    .locals 15

    .prologue
    .line 1392
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m:Ljava/util/BitSet;

    const/4 v2, 0x0

    iget v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/BitSet;->set(IIZ)V

    .line 1397
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 1398
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->f:I

    move-object/from16 v0, p2

    iget v2, v0, Landroid/support/v7/widget/u;->a:I

    add-int/2addr v1, v2

    move v2, v1

    .line 1403
    :goto_0
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->d:I

    invoke-direct {p0, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f(II)V

    .line 1410
    iget-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    move v3, v1

    .line 1413
    :goto_1
    const/4 v1, 0x0

    .line 18076
    :goto_2
    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->b:I

    if-ltz v4, :cond_4

    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->b:I

    invoke-virtual/range {p3 .. p3}, Landroid/support/v7/widget/bf;->e()I

    move-result v5

    if-ge v4, v5, :cond_4

    const/4 v4, 0x1

    .line 1414
    :goto_3
    if-eqz v4, :cond_2b

    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m:Ljava/util/BitSet;

    invoke-virtual {v4}, Ljava/util/BitSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2b

    .line 18086
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->b:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/az;->b(I)Landroid/view/View;

    move-result-object v12

    .line 18087
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->b:I

    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->c:I

    add-int/2addr v1, v4

    move-object/from16 v0, p2

    iput v1, v0, Landroid/support/v7/widget/u;->b:I

    .line 1416
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 18416
    iget-object v4, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v4}, Landroid/support/v7/widget/bi;->c()I

    move-result v13

    .line 1418
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 19406
    iget-object v5, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    if-eqz v5, :cond_0

    iget-object v5, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    array-length v5, v5

    if-lt v13, v5, :cond_5

    .line 19407
    :cond_0
    const/4 v4, -0x1

    move v5, v4

    .line 1420
    :goto_4
    const/4 v4, -0x1

    if-ne v5, v4, :cond_6

    const/4 v4, 0x1

    move v11, v4

    .line 1421
    :goto_5
    if-eqz v11, :cond_10

    .line 1422
    iget-boolean v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v4, :cond_7

    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    const/4 v5, 0x0

    aget-object v7, v4, v5

    .line 1423
    :cond_1
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 21414
    invoke-virtual {v4, v13}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->c(I)V

    .line 21415
    iget-object v4, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    iget v5, v7, Landroid/support/v7/widget/br;->d:I

    aput v5, v4, v13

    .line 1434
    :goto_6
    iput-object v7, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 1435
    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_11

    .line 1436
    invoke-virtual {p0, v12}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(Landroid/view/View;)V

    .line 21991
    :goto_7
    iget-boolean v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v4, :cond_13

    .line 21992
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_12

    .line 21993
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->u:I

    iget v5, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->height:I

    iget v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->w:I

    invoke-static {v5, v6}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(II)I

    move-result v5

    invoke-direct {p0, v12, v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;II)V

    .line 1444
    :goto_8
    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_19

    .line 1445
    iget-boolean v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v4, :cond_15

    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i(I)I

    move-result v4

    .line 1447
    :goto_9
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v12}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v5

    add-int v6, v4, v5

    .line 1448
    if-eqz v11, :cond_2f

    iget-boolean v5, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v5, :cond_2f

    .line 22524
    new-instance v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    invoke-direct {v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;-><init>()V

    .line 22525
    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    new-array v5, v5, [I

    iput-object v5, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->c:[I

    .line 22526
    const/4 v5, 0x0

    :goto_a
    iget v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v5, v9, :cond_16

    .line 22527
    iget-object v9, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->c:[I

    iget-object v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v10, v10, v5

    invoke-virtual {v10, v4}, Landroid/support/v7/widget/br;->b(I)I

    move-result v10

    sub-int v10, v4, v10

    aput v10, v9, v5

    .line 22526
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 1400
    :cond_2
    move-object/from16 v0, p2

    iget v1, v0, Landroid/support/v7/widget/u;->e:I

    move-object/from16 v0, p2

    iget v2, v0, Landroid/support/v7/widget/u;->a:I

    sub-int/2addr v1, v2

    move v2, v1

    goto/16 :goto_0

    .line 1410
    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->c()I

    move-result v1

    move v3, v1

    goto/16 :goto_1

    .line 18076
    :cond_4
    const/4 v4, 0x0

    goto/16 :goto_3

    .line 19409
    :cond_5
    iget-object v4, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    aget v4, v4, v13

    move v5, v4

    goto/16 :goto_4

    .line 1420
    :cond_6
    const/4 v4, 0x0

    move v11, v4

    goto/16 :goto_5

    .line 19779
    :cond_7
    move-object/from16 v0, p2

    iget v4, v0, Landroid/support/v7/widget/u;->d:I

    .line 20769
    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-nez v5, :cond_a

    .line 20770
    const/4 v5, -0x1

    if-ne v4, v5, :cond_8

    const/4 v4, 0x1

    :goto_b
    iget-boolean v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eq v4, v5, :cond_9

    const/4 v4, 0x1

    .line 19781
    :goto_c
    if-eqz v4, :cond_e

    .line 19782
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    add-int/lit8 v5, v4, -0x1

    .line 19783
    const/4 v6, -0x1

    .line 19784
    const/4 v4, -0x1

    .line 19790
    :goto_d
    move-object/from16 v0, p2

    iget v7, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_f

    .line 19791
    const/4 v7, 0x0

    .line 19792
    const v9, 0x7fffffff

    .line 19793
    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v8}, Landroid/support/v7/widget/ad;->c()I

    move-result v14

    move v10, v5

    .line 19794
    :goto_e
    if-eq v10, v6, :cond_1

    .line 19795
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v5, v5, v10

    .line 19796
    invoke-virtual {v5, v14}, Landroid/support/v7/widget/br;->b(I)I

    move-result v8

    .line 19797
    if-ge v8, v9, :cond_31

    move v7, v8

    .line 19794
    :goto_f
    add-int v8, v10, v4

    move v10, v8

    move v9, v7

    move-object v7, v5

    goto :goto_e

    .line 20770
    :cond_8
    const/4 v4, 0x0

    goto :goto_b

    :cond_9
    const/4 v4, 0x0

    goto :goto_c

    .line 20772
    :cond_a
    const/4 v5, -0x1

    if-ne v4, v5, :cond_b

    const/4 v4, 0x1

    :goto_10
    iget-boolean v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-ne v4, v5, :cond_c

    const/4 v4, 0x1

    :goto_11
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l()Z

    move-result v5

    if-ne v4, v5, :cond_d

    const/4 v4, 0x1

    goto :goto_c

    :cond_b
    const/4 v4, 0x0

    goto :goto_10

    :cond_c
    const/4 v4, 0x0

    goto :goto_11

    :cond_d
    const/4 v4, 0x0

    goto :goto_c

    .line 19786
    :cond_e
    const/4 v5, 0x0

    .line 19787
    iget v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    .line 19788
    const/4 v4, 0x1

    goto :goto_d

    .line 19804
    :cond_f
    const/4 v7, 0x0

    .line 19805
    const/high16 v9, -0x80000000

    .line 19806
    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v8}, Landroid/support/v7/widget/ad;->d()I

    move-result v14

    move v10, v5

    .line 19807
    :goto_12
    if-eq v10, v6, :cond_1

    .line 19808
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v5, v5, v10

    .line 19809
    invoke-virtual {v5, v14}, Landroid/support/v7/widget/br;->a(I)I

    move-result v8

    .line 19810
    if-le v8, v9, :cond_30

    move v7, v8

    .line 19807
    :goto_13
    add-int v8, v10, v4

    move v10, v8

    move v9, v7

    move-object v7, v5

    goto :goto_12

    .line 1431
    :cond_10
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v7, v4, v5

    goto/16 :goto_6

    .line 1438
    :cond_11
    invoke-virtual {p0, v12}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d(Landroid/view/View;)V

    goto/16 :goto_7

    .line 21996
    :cond_12
    iget v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->width:I

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->v:I

    invoke-static {v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(II)I

    move-result v4

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->u:I

    invoke-direct {p0, v12, v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;II)V

    goto/16 :goto_8

    .line 22000
    :cond_13
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_14

    .line 22001
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->v:I

    iget v5, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->height:I

    iget v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->w:I

    invoke-static {v5, v6}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(II)I

    move-result v5

    invoke-direct {p0, v12, v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;II)V

    goto/16 :goto_8

    .line 22004
    :cond_14
    iget v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->width:I

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->v:I

    invoke-static {v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(II)I

    move-result v4

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->w:I

    invoke-direct {p0, v12, v4, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;II)V

    goto/16 :goto_8

    .line 1445
    :cond_15
    invoke-virtual {v7, v3}, Landroid/support/v7/widget/br;->b(I)I

    move-result v4

    goto/16 :goto_9

    .line 1451
    :cond_16
    const/4 v5, -0x1

    iput v5, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->b:I

    .line 1452
    iput v13, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a:I

    .line 1453
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v5, v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;)V

    move v5, v4

    move v4, v6

    .line 1469
    :goto_14
    iget-boolean v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v6, :cond_18

    move-object/from16 v0, p2

    iget v6, v0, Landroid/support/v7/widget/u;->c:I

    const/4 v8, -0x1

    if-ne v6, v8, :cond_18

    .line 1470
    if-nez v11, :cond_17

    .line 1474
    move-object/from16 v0, p2

    iget v6, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v8, 0x1

    if-ne v6, v8, :cond_20

    .line 22666
    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    const/4 v8, 0x0

    aget-object v6, v6, v8

    const/high16 v8, -0x80000000

    invoke-virtual {v6, v8}, Landroid/support/v7/widget/br;->b(I)I

    move-result v8

    .line 22667
    const/4 v6, 0x1

    :goto_15
    iget v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v6, v9, :cond_1e

    .line 22668
    iget-object v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v9, v9, v6

    const/high16 v10, -0x80000000

    invoke-virtual {v9, v10}, Landroid/support/v7/widget/br;->b(I)I

    move-result v9

    if-eq v9, v8, :cond_1d

    .line 22669
    const/4 v6, 0x0

    .line 1475
    :goto_16
    if-nez v6, :cond_1f

    const/4 v6, 0x1

    .line 1479
    :goto_17
    if-eqz v6, :cond_18

    .line 1480
    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v6, v13}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->d(I)Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v6

    .line 1482
    if-eqz v6, :cond_17

    .line 1483
    const/4 v8, 0x1

    iput-boolean v8, v6, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->d:Z

    .line 1485
    :cond_17
    const/4 v6, 0x1

    iput-boolean v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    .line 23542
    :cond_18
    move-object/from16 v0, p2

    iget v6, v0, Landroid/support/v7/widget/u;->d:I

    const/4 v8, 0x1

    if-ne v6, v8, :cond_26

    .line 23543
    iget-boolean v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v6, :cond_24

    .line 23595
    iget v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    add-int/lit8 v6, v6, -0x1

    :goto_18
    if-ltz v6, :cond_25

    .line 23596
    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v8, v8, v6

    invoke-virtual {v8, v12}, Landroid/support/v7/widget/br;->b(Landroid/view/View;)V

    .line 23595
    add-int/lit8 v6, v6, -0x1

    goto :goto_18

    .line 1456
    :cond_19
    iget-boolean v4, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v4, :cond_1a

    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h(I)I

    move-result v4

    .line 1458
    :goto_19
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v12}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v5

    sub-int v6, v4, v5

    .line 1459
    if-eqz v11, :cond_1c

    iget-boolean v5, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v5, :cond_1c

    .line 22533
    new-instance v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    invoke-direct {v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;-><init>()V

    .line 22534
    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    new-array v5, v5, [I

    iput-object v5, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->c:[I

    .line 22535
    const/4 v5, 0x0

    :goto_1a
    iget v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v5, v9, :cond_1b

    .line 22536
    iget-object v9, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->c:[I

    iget-object v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v10, v10, v5

    invoke-virtual {v10, v4}, Landroid/support/v7/widget/br;->a(I)I

    move-result v10

    sub-int/2addr v10, v4

    aput v10, v9, v5

    .line 22535
    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    .line 1456
    :cond_1a
    invoke-virtual {v7, v3}, Landroid/support/v7/widget/br;->a(I)I

    move-result v4

    goto :goto_19

    .line 1462
    :cond_1b
    const/4 v5, 0x1

    iput v5, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->b:I

    .line 1463
    iput v13, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a:I

    .line 1464
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v5, v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;)V

    :cond_1c
    move v5, v6

    goto/16 :goto_14

    .line 22667
    :cond_1d
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_15

    .line 22672
    :cond_1e
    const/4 v6, 0x1

    goto :goto_16

    .line 1475
    :cond_1f
    const/4 v6, 0x0

    goto :goto_17

    .line 22676
    :cond_20
    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    const/4 v8, 0x0

    aget-object v6, v6, v8

    const/high16 v8, -0x80000000

    invoke-virtual {v6, v8}, Landroid/support/v7/widget/br;->a(I)I

    move-result v8

    .line 22677
    const/4 v6, 0x1

    :goto_1b
    iget v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v6, v9, :cond_22

    .line 22678
    iget-object v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v9, v9, v6

    const/high16 v10, -0x80000000

    invoke-virtual {v9, v10}, Landroid/support/v7/widget/br;->a(I)I

    move-result v9

    if-eq v9, v8, :cond_21

    .line 22679
    const/4 v6, 0x0

    .line 1477
    :goto_1c
    if-nez v6, :cond_23

    const/4 v6, 0x1

    goto/16 :goto_17

    .line 22677
    :cond_21
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    .line 22682
    :cond_22
    const/4 v6, 0x1

    goto :goto_1c

    .line 1477
    :cond_23
    const/4 v6, 0x0

    goto/16 :goto_17

    .line 23546
    :cond_24
    iget-object v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-virtual {v6, v12}, Landroid/support/v7/widget/br;->b(Landroid/view/View;)V

    .line 1491
    :cond_25
    :goto_1d
    iget-boolean v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v6, :cond_28

    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    invoke-virtual {v6}, Landroid/support/v7/widget/ad;->c()I

    move-result v6

    .line 1494
    :goto_1e
    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    invoke-virtual {v8, v12}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v8

    add-int/2addr v8, v6

    .line 1495
    iget v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    const/4 v10, 0x1

    if-ne v9, v10, :cond_29

    .line 1496
    invoke-static {v12, v6, v5, v8, v4}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/view/View;IIII)V

    .line 1501
    :goto_1f
    iget-boolean v1, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v1, :cond_2a

    .line 1502
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v1, v1, Landroid/support/v7/widget/u;->d:I

    invoke-direct {p0, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f(II)V

    .line 1506
    :goto_20
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    move-object/from16 v0, p1

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;)V

    .line 1507
    const/4 v1, 0x1

    .line 1508
    goto/16 :goto_2

    .line 23549
    :cond_26
    iget-boolean v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v6, :cond_27

    .line 23602
    iget v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    add-int/lit8 v6, v6, -0x1

    :goto_21
    if-ltz v6, :cond_25

    .line 23603
    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v8, v8, v6

    invoke-virtual {v8, v12}, Landroid/support/v7/widget/br;->a(Landroid/view/View;)V

    .line 23602
    add-int/lit8 v6, v6, -0x1

    goto :goto_21

    .line 23552
    :cond_27
    iget-object v6, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-virtual {v6, v12}, Landroid/support/v7/widget/br;->a(Landroid/view/View;)V

    goto :goto_1d

    .line 1491
    :cond_28
    iget v6, v7, Landroid/support/v7/widget/br;->d:I

    iget v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j:I

    mul-int/2addr v6, v8

    iget-object v8, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    invoke-virtual {v8}, Landroid/support/v7/widget/ad;->c()I

    move-result v8

    add-int/2addr v6, v8

    goto :goto_1e

    .line 1498
    :cond_29
    invoke-static {v12, v5, v6, v4, v8}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/view/View;IIII)V

    goto :goto_1f

    .line 1504
    :cond_2a
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v1, v1, Landroid/support/v7/widget/u;->d:I

    invoke-direct {p0, v7, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/br;II)V

    goto :goto_20

    .line 1509
    :cond_2b
    if-nez v1, :cond_2c

    .line 1510
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    move-object/from16 v0, p1

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;)V

    .line 1513
    :cond_2c
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v1, v1, Landroid/support/v7/widget/u;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2d

    .line 1514
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->c()I

    move-result v1

    invoke-direct {p0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h(I)I

    move-result v1

    .line 1515
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    sub-int v1, v2, v1

    .line 1520
    :goto_22
    if-lez v1, :cond_2e

    move-object/from16 v0, p2

    iget v2, v0, Landroid/support/v7/widget/u;->a:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_23
    return v1

    .line 1517
    :cond_2d
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    invoke-direct {p0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i(I)I

    move-result v1

    .line 1518
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_22

    .line 1520
    :cond_2e
    const/4 v1, 0x0

    goto :goto_23

    :cond_2f
    move v5, v4

    move v4, v6

    goto/16 :goto_14

    :cond_30
    move-object v5, v7

    move v7, v9

    goto/16 :goto_13

    :cond_31
    move-object v5, v7

    move v7, v9

    goto/16 :goto_f
.end method

.method private a(Z)Landroid/view/View;
    .locals 8

    .prologue
    .line 1183
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 1184
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    .line 1185
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v4

    .line 1186
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v5

    .line 1187
    const/4 v1, 0x0

    .line 1188
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v5, :cond_2

    .line 1189
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    .line 1190
    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v6

    .line 1191
    iget-object v7, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v7, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v7

    .line 1192
    if-le v7, v3, :cond_3

    if-ge v6, v4, :cond_3

    .line 1195
    if-ge v6, v3, :cond_0

    if-nez p1, :cond_1

    .line 1204
    :cond_0
    :goto_1
    return-object v0

    .line 1200
    :cond_1
    if-nez v1, :cond_3

    .line 1188
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 1204
    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method private a(ILandroid/support/v7/widget/bf;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 1270
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iput v1, v0, Landroid/support/v7/widget/u;->a:I

    .line 1271
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iput p1, v0, Landroid/support/v7/widget/u;->b:I

    .line 1274
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->q()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1275
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->c()I

    move-result v0

    .line 1276
    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    .line 1277
    iget-boolean v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-ge v0, p1, :cond_1

    move v0, v3

    :goto_0
    if-ne v2, v0, :cond_2

    .line 1278
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->f()I

    move-result v0

    move v2, v1

    .line 17672
    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->v(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v1, v3

    .line 1287
    :cond_0
    if-eqz v1, :cond_3

    .line 1288
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    sub-int v2, v3, v2

    iput v2, v1, Landroid/support/v7/widget/u;->e:I

    .line 1289
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, v1, Landroid/support/v7/widget/u;->f:I

    .line 1294
    :goto_2
    return-void

    :cond_1
    move v0, v1

    .line 1277
    goto :goto_0

    .line 1280
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->f()I

    move-result v0

    move v2, v0

    move v0, v1

    goto :goto_1

    .line 1291
    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->e()I

    move-result v3

    add-int/2addr v0, v3

    iput v0, v1, Landroid/support/v7/widget/u;->f:I

    .line 1292
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    neg-int v1, v2

    iput v1, v0, Landroid/support/v7/widget/u;->e:I

    goto :goto_2

    :cond_4
    move v0, v1

    move v2, v1

    goto :goto_1
.end method

.method private a(Landroid/support/v7/widget/az;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 1708
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_0

    .line 1709
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v2

    .line 1710
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    if-gt v0, p2, :cond_0

    .line 1711
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1713
    iget-boolean v3, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v3, :cond_3

    move v0, v1

    .line 1714
    :goto_1
    iget v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v3, :cond_2

    .line 1715
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v3, v3, v0

    invoke-static {v3}, Landroid/support/v7/widget/br;->a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v4, :cond_1

    .line 1733
    :cond_0
    return-void

    .line 1714
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 1719
    :goto_2
    iget v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v3, :cond_4

    .line 1720
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Landroid/support/v7/widget/br;->e()V

    .line 1719
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1723
    :cond_3
    iget-object v3, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-static {v3}, Landroid/support/v7/widget/br;->a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eq v3, v4, :cond_0

    .line 1726
    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-virtual {v0}, Landroid/support/v7/widget/br;->e()V

    .line 1728
    :cond_4
    invoke-virtual {p0, v2, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;Landroid/support/v7/widget/az;)V

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V
    .locals 2

    .prologue
    .line 1239
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i(I)I

    move-result v0

    .line 1240
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    sub-int v0, v1, v0

    .line 1242
    if-lez v0, :cond_0

    .line 1243
    neg-int v1, v0

    invoke-direct {p0, v1, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v1

    neg-int v1, v1

    .line 1247
    sub-int/2addr v0, v1

    .line 1248
    if-eqz p3, :cond_0

    if-lez v0, :cond_0

    .line 1249
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->a(I)V

    .line 1251
    :cond_0
    return-void
.end method

.method private a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v5, 0x0

    const/4 v2, -0x1

    .line 1558
    iget v1, p2, Landroid/support/v7/widget/u;->a:I

    if-nez v1, :cond_1

    .line 1560
    iget v0, p2, Landroid/support/v7/widget/u;->d:I

    if-ne v0, v2, :cond_0

    .line 1561
    iget v0, p2, Landroid/support/v7/widget/u;->f:I

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/support/v7/widget/az;I)V

    .line 1591
    :goto_0
    return-void

    .line 1563
    :cond_0
    iget v0, p2, Landroid/support/v7/widget/u;->e:I

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;I)V

    goto :goto_0

    .line 1568
    :cond_1
    iget v1, p2, Landroid/support/v7/widget/u;->d:I

    if-ne v1, v2, :cond_5

    .line 1570
    iget v3, p2, Landroid/support/v7/widget/u;->e:I

    iget v4, p2, Landroid/support/v7/widget/u;->e:I

    .line 23644
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v5

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/br;->a(I)I

    move-result v1

    .line 23645
    :goto_1
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_3

    .line 23646
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2, v4}, Landroid/support/v7/widget/br;->a(I)I

    move-result v2

    .line 23647
    if-le v2, v1, :cond_2

    move v1, v2

    .line 23645
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1570
    :cond_3
    sub-int v0, v3, v1

    .line 1572
    if-gez v0, :cond_4

    .line 1573
    iget v0, p2, Landroid/support/v7/widget/u;->f:I

    .line 1577
    :goto_2
    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/support/v7/widget/az;I)V

    goto :goto_0

    .line 1575
    :cond_4
    iget v1, p2, Landroid/support/v7/widget/u;->f:I

    iget v2, p2, Landroid/support/v7/widget/u;->a:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v1, v0

    goto :goto_2

    .line 1580
    :cond_5
    iget v3, p2, Landroid/support/v7/widget/u;->f:I

    .line 23697
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v5

    invoke-virtual {v1, v3}, Landroid/support/v7/widget/br;->b(I)I

    move-result v1

    .line 23698
    :goto_3
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_7

    .line 23699
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/br;->b(I)I

    move-result v2

    .line 23700
    if-ge v2, v1, :cond_6

    move v1, v2

    .line 23698
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1580
    :cond_7
    iget v0, p2, Landroid/support/v7/widget/u;->f:I

    sub-int v0, v1, v0

    .line 1582
    if-gez v0, :cond_8

    .line 1583
    iget v0, p2, Landroid/support/v7/widget/u;->e:I

    .line 1587
    :goto_4
    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;I)V

    goto :goto_0

    .line 1585
    :cond_8
    iget v1, p2, Landroid/support/v7/widget/u;->e:I

    iget v2, p2, Landroid/support/v7/widget/u;->a:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v1

    goto :goto_4
.end method

.method private a(Landroid/support/v7/widget/br;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1629
    .line 24257
    iget v0, p1, Landroid/support/v7/widget/br;->c:I

    .line 1630
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 1631
    invoke-virtual {p1}, Landroid/support/v7/widget/br;->a()I

    move-result v1

    .line 1632
    add-int/2addr v0, v1

    if-gt v0, p3, :cond_0

    .line 1633
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m:Ljava/util/BitSet;

    iget v1, p1, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 1641
    :cond_0
    :goto_0
    return-void

    .line 1636
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/widget/br;->b()I

    move-result v1

    .line 1637
    sub-int v0, v1, v0

    if-lt v0, p3, :cond_0

    .line 1638
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m:Ljava/util/BitSet;

    iget v1, p1, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0
.end method

.method private a(Landroid/view/View;II)V
    .locals 4

    .prologue
    .line 1020
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1021
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1022
    iget v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->leftMargin:I

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->rightMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-static {p2, v1, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(III)I

    move-result v1

    .line 1024
    iget v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->topMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->bottomMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->x:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v3

    invoke-static {p3, v2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(III)I

    move-result v0

    .line 1026
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    .line 1027
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/StaggeredGridLayoutManager;)Z
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Landroid/support/v7/widget/StaggeredGridLayoutManager;)I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    return v0
.end method

.method private b(Z)Landroid/view/View;
    .locals 7

    .prologue
    .line 1214
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 1215
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    .line 1216
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v4

    .line 1217
    const/4 v1, 0x0

    .line 1218
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_2

    .line 1219
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    .line 1220
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v5

    .line 1221
    iget-object v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v6

    .line 1222
    if-le v6, v3, :cond_3

    if-ge v5, v4, :cond_3

    .line 1225
    if-le v6, v4, :cond_0

    if-nez p1, :cond_1

    .line 1234
    :cond_0
    :goto_1
    return-object v0

    .line 1230
    :cond_1
    if-nez v1, :cond_3

    .line 1218
    :goto_2
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 1234
    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method private b(III)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 1348
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v0

    move v2, v0

    .line 1352
    :goto_0
    const/4 v0, 0x3

    if-ne p3, v0, :cond_3

    .line 1353
    if-ge p1, p2, :cond_2

    .line 1354
    add-int/lit8 v0, p2, 0x1

    move v1, v0

    move v0, p1

    .line 1365
    :goto_1
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->b(I)I

    .line 1366
    packed-switch p3, :pswitch_data_0

    .line 1380
    :goto_2
    :pswitch_0
    if-gt v1, v2, :cond_4

    .line 1388
    :cond_0
    :goto_3
    return-void

    .line 1348
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v0

    move v2, v0

    goto :goto_0

    .line 1357
    :cond_2
    add-int/lit8 v0, p1, 0x1

    move v1, v0

    move v0, p2

    .line 1358
    goto :goto_1

    .line 1362
    :cond_3
    add-int v0, p1, p2

    move v1, v0

    move v0, p1

    goto :goto_1

    .line 1368
    :pswitch_1
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v3, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->b(II)V

    goto :goto_2

    .line 1371
    :pswitch_2
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v3, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(II)V

    goto :goto_2

    .line 1375
    :pswitch_3
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v3, p1, v4}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(II)V

    .line 1376
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v3, p2, v4}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->b(II)V

    goto :goto_2

    .line 1384
    :cond_4
    iget-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v1, :cond_5

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v1

    .line 1385
    :goto_4
    if-gt v0, v1, :cond_0

    .line 1386
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    goto :goto_3

    .line 1384
    :cond_5
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v1

    goto :goto_4

    .line 1366
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private b(Landroid/support/v7/widget/az;I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 1736
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    .line 1738
    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_0

    .line 1739
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v3

    .line 1740
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    if-lt v0, p2, :cond_0

    .line 1741
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1743
    iget-boolean v4, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v4, :cond_3

    move v0, v1

    .line 1744
    :goto_1
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v4, :cond_2

    .line 1745
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v4, v4, v0

    invoke-static {v4}, Landroid/support/v7/widget/br;->a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v5, :cond_1

    .line 1763
    :cond_0
    return-void

    .line 1744
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 1749
    :goto_2
    iget v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v4, :cond_4

    .line 1750
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Landroid/support/v7/widget/br;->d()V

    .line 1749
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1753
    :cond_3
    iget-object v4, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-static {v4}, Landroid/support/v7/widget/br;->a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eq v4, v5, :cond_0

    .line 1756
    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    invoke-virtual {v0}, Landroid/support/v7/widget/br;->d()V

    .line 1758
    :cond_4
    invoke-virtual {p0, v3, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;Landroid/support/v7/widget/az;)V

    .line 1738
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0
.end method

.method private b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V
    .locals 2

    .prologue
    .line 1255
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h(I)I

    move-result v0

    .line 1256
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->c()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1258
    if-lez v0, :cond_0

    .line 1259
    invoke-direct {p0, v0, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v1

    .line 1263
    sub-int/2addr v0, v1

    .line 1264
    if-eqz p3, :cond_0

    if-lez v0, :cond_0

    .line 1265
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    neg-int v0, v0

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->a(I)V

    .line 1267
    :cond_0
    return-void
.end method

.method private static b(Landroid/view/View;IIII)V
    .locals 4

    .prologue
    .line 1608
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1615
    iget v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->leftMargin:I

    add-int/2addr v1, p1

    iget v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->topMargin:I

    add-int/2addr v2, p2

    iget v3, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->rightMargin:I

    sub-int v3, p3, v3

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->bottomMargin:I

    sub-int v0, p4, v0

    invoke-static {p0, v1, v2, v3, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;IIII)V

    .line 1617
    return-void
.end method

.method private c()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 235
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->p()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v1, v2

    .line 276
    :goto_0
    return v1

    .line 239
    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_2

    .line 240
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v3

    .line 241
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v0

    move v4, v3

    move v3, v0

    .line 246
    :goto_1
    if-nez v4, :cond_3

    .line 247
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d()Landroid/view/View;

    move-result-object v0

    .line 248
    if-eqz v0, :cond_3

    .line 249
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a()V

    .line 250
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A()V

    .line 251
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    goto :goto_0

    .line 243
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v3

    .line 244
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v0

    move v4, v3

    move v3, v0

    goto :goto_1

    .line 255
    :cond_3
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    if-nez v0, :cond_4

    move v1, v2

    .line 256
    goto :goto_0

    .line 258
    :cond_4
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    .line 259
    :goto_2
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    add-int/lit8 v6, v3, 0x1

    invoke-virtual {v5, v4, v6, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(III)Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v5

    .line 261
    if-nez v5, :cond_6

    .line 262
    iput-boolean v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    .line 263
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(I)I

    move v1, v2

    .line 264
    goto :goto_0

    :cond_5
    move v0, v1

    .line 258
    goto :goto_2

    .line 266
    :cond_6
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget v3, v5, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a:I

    mul-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v4, v3, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(III)Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v0

    .line 269
    if-nez v0, :cond_7

    .line 270
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget v2, v5, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a:I

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(I)I

    .line 274
    :goto_3
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A()V

    .line 275
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    goto :goto_0

    .line 272
    :cond_7
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a(I)I

    goto :goto_3
.end method

.method private d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 3

    .prologue
    .line 1903
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 1906
    if-lez p1, :cond_1

    .line 1907
    const/4 v0, 0x1

    .line 1908
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v1

    .line 1913
    :goto_0
    invoke-direct {p0, v1, p3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(ILandroid/support/v7/widget/bf;)V

    .line 1914
    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(I)V

    .line 1915
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v2, v2, Landroid/support/v7/widget/u;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/support/v7/widget/u;->b:I

    .line 1916
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    .line 1917
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iput v1, v0, Landroid/support/v7/widget/u;->a:I

    .line 1918
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    invoke-direct {p0, p2, v0, p3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I

    move-result v0

    .line 1920
    if-lt v1, v0, :cond_0

    .line 1922
    if-gez p1, :cond_2

    .line 1923
    neg-int p1, v0

    .line 1931
    :cond_0
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ad;->a(I)V

    .line 1933
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    .line 1934
    return p1

    .line 1910
    :cond_1
    const/4 v0, -0x1

    .line 1911
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v1

    goto :goto_0

    :cond_2
    move p1, v0

    .line 1925
    goto :goto_1
.end method

.method private d()Landroid/view/View;
    .locals 12

    .prologue
    const/4 v0, -0x1

    const/4 v5, 0x0

    const/4 v3, 0x1

    .line 301
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 302
    new-instance v9, Ljava/util/BitSet;

    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    invoke-direct {v9, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 303
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    invoke-virtual {v9, v5, v2, v3}, Ljava/util/BitSet;->set(IIZ)V

    .line 306
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-ne v2, v3, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    .line 308
    :goto_0
    iget-boolean v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v4, :cond_1

    move v8, v0

    .line 315
    :goto_1
    if-ge v1, v8, :cond_2

    move v4, v3

    :goto_2
    move v7, v1

    .line 316
    :goto_3
    if-eq v7, v8, :cond_d

    .line 317
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v6

    .line 318
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 319
    iget-object v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    iget v1, v1, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v9, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 320
    iget-object v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 9364
    iget-boolean v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v10, :cond_3

    .line 9365
    invoke-virtual {v1}, Landroid/support/v7/widget/br;->b()I

    move-result v1

    iget-object v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v10}, Landroid/support/v7/widget/ad;->d()I

    move-result v10

    if-ge v1, v10, :cond_4

    move v1, v3

    .line 320
    :goto_4
    if-eqz v1, :cond_5

    move-object v0, v6

    .line 360
    :goto_5
    return-object v0

    :cond_0
    move v2, v0

    .line 306
    goto :goto_0

    .line 313
    :cond_1
    add-int/lit8 v1, v1, 0x1

    move v8, v1

    move v1, v5

    goto :goto_1

    :cond_2
    move v4, v0

    .line 315
    goto :goto_2

    .line 9368
    :cond_3
    invoke-virtual {v1}, Landroid/support/v7/widget/br;->a()I

    move-result v1

    iget-object v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v10}, Landroid/support/v7/widget/ad;->c()I

    move-result v10

    if-le v1, v10, :cond_4

    move v1, v3

    .line 9369
    goto :goto_4

    :cond_4
    move v1, v5

    .line 9371
    goto :goto_4

    .line 323
    :cond_5
    iget-object v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    iget v1, v1, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v9, v1}, Ljava/util/BitSet;->clear(I)V

    .line 325
    :cond_6
    iget-boolean v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-nez v1, :cond_c

    .line 329
    add-int v1, v7, v4

    if-eq v1, v8, :cond_c

    .line 330
    add-int v1, v7, v4

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v10

    .line 332
    iget-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v1, :cond_8

    .line 334
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v1

    .line 335
    iget-object v11, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v11, v10}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v11

    .line 336
    if-ge v1, v11, :cond_7

    move-object v0, v6

    .line 337
    goto :goto_5

    .line 338
    :cond_7
    if-ne v1, v11, :cond_e

    move v1, v3

    .line 350
    :goto_6
    if-eqz v1, :cond_c

    .line 352
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 353
    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    iget v0, v0, Landroid/support/v7/widget/br;->d:I

    iget-object v1, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    iget v1, v1, Landroid/support/v7/widget/br;->d:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_a

    move v1, v3

    :goto_7
    if-gez v2, :cond_b

    move v0, v3

    :goto_8
    if-eq v1, v0, :cond_c

    move-object v0, v6

    .line 354
    goto :goto_5

    .line 342
    :cond_8
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    .line 343
    iget-object v11, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v11, v10}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v11

    .line 344
    if-le v1, v11, :cond_9

    move-object v0, v6

    .line 345
    goto :goto_5

    .line 346
    :cond_9
    if-ne v1, v11, :cond_e

    move v1, v3

    .line 347
    goto :goto_6

    :cond_a
    move v1, v5

    .line 353
    goto :goto_7

    :cond_b
    move v0, v5

    goto :goto_8

    .line 316
    :cond_c
    add-int v0, v7, v4

    move v7, v0

    goto/16 :goto_3

    .line 360
    :cond_d
    const/4 v0, 0x0

    goto :goto_5

    :cond_e
    move v1, v5

    goto :goto_6
.end method

.method private static e(II)I
    .locals 1

    .prologue
    .line 1011
    if-gez p0, :cond_0

    .line 1014
    :goto_0
    return p1

    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0
.end method

.method private f(II)V
    .locals 2

    .prologue
    .line 1620
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v1, :cond_1

    .line 1621
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-static {v1}, Landroid/support/v7/widget/br;->a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1624
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-direct {p0, v1, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/br;II)V

    .line 1620
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1626
    :cond_1
    return-void
.end method

.method private g(Landroid/support/v7/widget/bf;)I
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 933
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 937
    :goto_0
    return v4

    .line 936
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 937
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    iget-boolean v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Landroid/support/v7/widget/bl;->a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;ZZ)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private g(I)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 1297
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iput p1, v2, Landroid/support/v7/widget/u;->d:I

    .line 1298
    iget-object v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget-boolean v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-ne p1, v1, :cond_0

    move v2, v0

    :goto_0
    if-ne v4, v2, :cond_1

    :goto_1
    iput v0, v3, Landroid/support/v7/widget/u;->c:I

    .line 1300
    return-void

    .line 1298
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private h(I)I
    .locals 3

    .prologue
    .line 1655
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/br;->a(I)I

    move-result v1

    .line 1656
    const/4 v0, 0x1

    :goto_0
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_1

    .line 1657
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/br;->a(I)I

    move-result v2

    .line 1658
    if-ge v2, v1, :cond_0

    move v1, v2

    .line 1656
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1662
    :cond_1
    return v1
.end method

.method private h(Landroid/support/v7/widget/bf;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 954
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 958
    :goto_0
    return v4

    .line 957
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 958
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/bl;->a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private i(I)I
    .locals 3

    .prologue
    .line 1686
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/br;->b(I)I

    move-result v1

    .line 1687
    const/4 v0, 0x1

    :goto_0
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_1

    .line 1688
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/br;->b(I)I

    move-result v2

    .line 1689
    if-le v2, v1, :cond_0

    move v1, v2

    .line 1687
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1693
    :cond_1
    return v1
.end method

.method private i(Landroid/support/v7/widget/bf;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 975
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 979
    :goto_0
    return v4

    .line 978
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 979
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->A:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/bl;->b(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x0

    .line 384
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    .line 385
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-eq v2, v0, :cond_1

    .line 9507
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a()V

    .line 9508
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 387
    iput v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    .line 388
    new-instance v0, Ljava/util/BitSet;

    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    invoke-direct {v0, v2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m:Ljava/util/BitSet;

    .line 389
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    new-array v0, v0, [Landroid/support/v7/widget/br;

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    move v0, v1

    .line 390
    :goto_0
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_0

    .line 391
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    new-instance v3, Landroid/support/v7/widget/br;

    invoke-direct {v3, p0, v0, v1}, Landroid/support/v7/widget/br;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;IB)V

    aput-object v3, v2, v0

    .line 390
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 393
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 395
    :cond_1
    return-void
.end method

.method private j(I)I
    .locals 4

    .prologue
    const/4 v2, -0x1

    const/4 v1, 0x1

    .line 1842
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_2

    .line 1843
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_1

    .line 1846
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v1, v2

    .line 1843
    goto :goto_0

    .line 1845
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v0

    .line 1846
    if-ge p1, v0, :cond_3

    move v0, v1

    :goto_1
    iget-boolean v3, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eq v0, v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private j()V
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    if-nez v0, :cond_0

    .line 513
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    invoke-static {p0, v0}, Landroid/support/v7/widget/ad;->a(Landroid/support/v7/widget/au;I)Landroid/support/v7/widget/ad;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    .line 514
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    rsub-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Landroid/support/v7/widget/ad;->a(Landroid/support/v7/widget/au;I)Landroid/support/v7/widget/ad;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    .line 516
    new-instance v0, Landroid/support/v7/widget/u;

    invoke-direct {v0}, Landroid/support/v7/widget/u;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    .line 518
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 527
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l()Z

    move-result v1

    if-nez v1, :cond_2

    .line 528
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l:Z

    .line 530
    :cond_1
    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    .line 532
    return-void

    .line 530
    :cond_2
    iget-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l:Z

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 535
    .line 9913
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    .line 535
    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private m()I
    .locals 1

    .prologue
    .line 1938
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    .line 1939
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1832
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1161
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-nez v0, :cond_0

    .line 1162
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    .line 1164
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 929
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 1988
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 1993
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 1994
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1996
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 1330
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a()V

    .line 1331
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 1332
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 1325
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(III)V

    .line 1326
    return-void
.end method

.method public final a(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 1043
    instance-of v0, p1, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 1044
    check-cast p1, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iput-object p1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    .line 1045
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 1049
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    .line 1852
    new-instance v0, Landroid/support/v7/widget/bn;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/bn;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;Landroid/content/Context;)V

    .line 1866
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/aa;->b(I)V

    .line 1867
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/bd;)V

    .line 1868
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Ljava/lang/Runnable;)Z

    .line 289
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v1, :cond_0

    .line 290
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroid/support/v7/widget/br;->c()V

    .line 289
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 292
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v3, -0x1

    .line 1105
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1106
    instance-of v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    if-nez v2, :cond_0

    .line 1107
    invoke-super {p0, p3, p4}, Landroid/support/v7/widget/au;->a(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1122
    :goto_0
    return-void

    :cond_0
    move-object v4, v0

    .line 1110
    check-cast v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 1111
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-nez v0, :cond_2

    .line 1112
    invoke-virtual {v4}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->b()I

    move-result v2

    iget-boolean v0, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    :goto_1
    move v1, v0

    move v0, v2

    move v2, v3

    .line 1117
    :goto_2
    iget-boolean v4, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->obtain(IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionItemInfo(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 1112
    goto :goto_1

    .line 1117
    :cond_2
    invoke-virtual {v4}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->b()I

    move-result v2

    iget-boolean v0, v4, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v0, :cond_3

    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    move v0, v3

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_2

    :cond_3
    move v0, v3

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_2
.end method

.method public final a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1126
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1127
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_0

    .line 1128
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v0

    .line 1130
    invoke-direct {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v1

    .line 1131
    invoke-direct {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v2

    .line 1132
    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    .line 1145
    :cond_0
    :goto_0
    return-void

    .line 1135
    :cond_1
    invoke-static {v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    .line 1136
    invoke-static {v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v2

    .line 1137
    if-ge v1, v2, :cond_2

    .line 1138
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V

    .line 1139
    invoke-virtual {v0, v2}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V

    goto :goto_0

    .line 1141
    :cond_2
    invoke-virtual {v0, v2}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V

    .line 1142
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 486
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_0

    .line 487
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->a(Ljava/lang/String;)V

    .line 489
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z
    .locals 1

    .prologue
    .line 2002
    instance-of v0, p1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    return v0
.end method

.method public final b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1838
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 2

    .prologue
    .line 1170
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1171
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    .line 1173
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/au;->b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    goto :goto_0
.end method

.method public final b(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 945
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final b()Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 1982
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final b(I)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 1872
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    if-eq v0, p1, :cond_0

    .line 1873
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    .line 24730
    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->d:[I

    .line 24731
    const/4 v1, 0x0

    iput v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    .line 24732
    iput v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    .line 24733
    iput v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->b:I

    .line 1875
    :cond_0
    iput p1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    .line 1876
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    .line 1877
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 1878
    return-void
.end method

.method public final b(II)V
    .locals 1

    .prologue
    .line 1320
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(III)V

    .line 1321
    return-void
.end method

.method public final c(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 950
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final c(II)V
    .locals 1

    .prologue
    .line 1341
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(III)V

    .line 1342
    return-void
.end method

.method public final c(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)V
    .locals 12

    .prologue
    const/4 v11, 0x0

    const/4 v10, -0x1

    const/4 v3, 0x1

    const/high16 v9, -0x80000000

    const/4 v1, 0x0

    .line 551
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 552
    iget-object v4, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->y:Landroid/support/v7/widget/bo;

    .line 10784
    iput v10, v4, Landroid/support/v7/widget/bo;->a:I

    .line 10785
    iput v9, v4, Landroid/support/v7/widget/bo;->b:I

    .line 10786
    iput-boolean v1, v4, Landroid/support/v7/widget/bo;->c:Z

    .line 10787
    iput-boolean v1, v4, Landroid/support/v7/widget/bo;->d:Z

    .line 555
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_e

    .line 11640
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    if-lez v0, :cond_3

    .line 11641
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ne v0, v2, :cond_2

    move v0, v1

    .line 11642
    :goto_0
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_3

    .line 11643
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/support/v7/widget/br;->c()V

    .line 11644
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->d:[I

    aget v2, v2, v0

    .line 11645
    if-eq v2, v9, :cond_0

    .line 11646
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v5, v5, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->i:Z

    if-eqz v5, :cond_1

    .line 11647
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->d()I

    move-result v5

    add-int/2addr v2, v5

    .line 11652
    :cond_0
    :goto_1
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v5, v5, v0

    invoke-virtual {v5, v2}, Landroid/support/v7/widget/br;->c(I)V

    .line 11642
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 11649
    :cond_1
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->c()I

    move-result v5

    add-int/2addr v2, v5

    goto :goto_1

    .line 11655
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    .line 11722
    iput-object v11, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->d:[I

    .line 11723
    iput v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    .line 11724
    iput v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->e:I

    .line 11725
    iput-object v11, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->f:[I

    .line 11726
    iput-object v11, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->g:Ljava/util/List;

    .line 11656
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->b:I

    iput v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    .line 11659
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->j:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->p:Z

    .line 11660
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->h:Z

    .line 12435
    invoke-virtual {p0, v11}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    .line 12436
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v2, :cond_4

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->h:Z

    if-eq v2, v0, :cond_4

    .line 12437
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iput-boolean v0, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->h:Z

    .line 12439
    :cond_4
    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l:Z

    .line 12440
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n()V

    .line 11661
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k()V

    .line 11663
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    if-eq v0, v10, :cond_d

    .line 11664
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    .line 11665
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->i:Z

    iput-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    .line 11669
    :goto_2
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->e:I

    if-le v0, v3, :cond_5

    .line 11670
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->f:[I

    iput-object v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    .line 11671
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->g:Ljava/util/List;

    iput-object v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->b:Ljava/util/List;

    .line 12703
    :cond_5
    :goto_3
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_6

    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    if-ne v0, v10, :cond_f

    :cond_6
    move v0, v1

    .line 12676
    :goto_4
    if-nez v0, :cond_8

    .line 13694
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    if-eqz v0, :cond_22

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v5

    .line 13970
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_5
    if-ltz v2, :cond_21

    .line 13971
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    .line 13972
    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 13973
    if-ltz v0, :cond_20

    if-ge v0, v5, :cond_20

    .line 13694
    :cond_7
    :goto_6
    iput v0, v4, Landroid/support/v7/widget/bo;->a:I

    .line 13697
    iput v9, v4, Landroid/support/v7/widget/bo;->b:I

    .line 564
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_a

    .line 565
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    iget-boolean v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    if-ne v0, v2, :cond_9

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l()Z

    move-result v0

    iget-boolean v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->p:Z

    if-eq v0, v2, :cond_a

    .line 567
    :cond_9
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a()V

    .line 568
    iput-boolean v3, v4, Landroid/support/v7/widget/bo;->d:Z

    .line 572
    :cond_a
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_2b

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    if-gtz v0, :cond_2b

    .line 574
    :cond_b
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->d:Z

    if-eqz v0, :cond_25

    move v0, v1

    .line 575
    :goto_7
    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v2, :cond_2b

    .line 577
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/support/v7/widget/br;->c()V

    .line 578
    iget v2, v4, Landroid/support/v7/widget/bo;->b:I

    if-eq v2, v9, :cond_c

    .line 579
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v2, v2, v0

    iget v5, v4, Landroid/support/v7/widget/bo;->b:I

    invoke-virtual {v2, v5}, Landroid/support/v7/widget/br;->c(I)V

    .line 575
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 11667
    :cond_d
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    iput-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    goto/16 :goto_2

    .line 558
    :cond_e
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k()V

    .line 559
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    iput-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    goto/16 :goto_3

    .line 12707
    :cond_f
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    if-ltz v0, :cond_10

    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v2

    if-lt v0, v2, :cond_11

    .line 12708
    :cond_10
    iput v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    .line 12709
    iput v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    move v0, v1

    .line 12710
    goto/16 :goto_4

    .line 12713
    :cond_11
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_12

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    if-eq v0, v10, :cond_12

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    if-gtz v0, :cond_1f

    .line 12716
    :cond_12
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(I)Landroid/view/View;

    move-result-object v2

    .line 12717
    if-eqz v2, :cond_1a

    .line 12720
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_13

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v0

    :goto_8
    iput v0, v4, Landroid/support/v7/widget/bo;->a:I

    .line 12723
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    if-eq v0, v9, :cond_15

    .line 12724
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    if-eqz v0, :cond_14

    .line 12725
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    sub-int/2addr v0, v5

    .line 12727
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    :goto_9
    move v0, v3

    .line 12733
    goto/16 :goto_4

    .line 12720
    :cond_13
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v0

    goto :goto_8

    .line 12729
    :cond_14
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    iget v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    add-int/2addr v0, v5

    .line 12731
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v2}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_9

    .line 12737
    :cond_15
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v0

    .line 12738
    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->f()I

    move-result v5

    if-le v0, v5, :cond_17

    .line 12740
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    if-eqz v0, :cond_16

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    :goto_a
    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    :goto_b
    move v0, v3

    .line 12778
    goto/16 :goto_4

    .line 12740
    :cond_16
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    goto :goto_a

    .line 12746
    :cond_17
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->c()I

    move-result v5

    sub-int/2addr v0, v5

    .line 12748
    if-gez v0, :cond_18

    .line 12749
    neg-int v0, v0

    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_b

    .line 12752
    :cond_18
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v0, v2

    .line 12754
    if-gez v0, :cond_19

    .line 12755
    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_b

    .line 12759
    :cond_19
    iput v9, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_b

    .line 12763
    :cond_1a
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    iput v0, v4, Landroid/support/v7/widget/bo;->a:I

    .line 12764
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    if-ne v0, v9, :cond_1d

    .line 12765
    iget v0, v4, Landroid/support/v7/widget/bo;->a:I

    invoke-direct {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j(I)I

    move-result v0

    .line 12767
    if-ne v0, v3, :cond_1b

    move v0, v3

    :goto_c
    iput-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    .line 12791
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    if-eqz v0, :cond_1c

    iget-object v0, v4, Landroid/support/v7/widget/bo;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    :goto_d
    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    .line 12772
    :goto_e
    iput-boolean v3, v4, Landroid/support/v7/widget/bo;->d:Z

    goto :goto_b

    :cond_1b
    move v0, v1

    .line 12767
    goto :goto_c

    .line 12791
    :cond_1c
    iget-object v0, v4, Landroid/support/v7/widget/bo;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    goto :goto_d

    .line 12770
    :cond_1d
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    .line 12796
    iget-boolean v2, v4, Landroid/support/v7/widget/bo;->c:Z

    if-eqz v2, :cond_1e

    .line 12797
    iget-object v2, v4, Landroid/support/v7/widget/bo;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    sub-int v0, v2, v0

    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_e

    .line 12799
    :cond_1e
    iget-object v2, v4, Landroid/support/v7/widget/bo;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, v4, Landroid/support/v7/widget/bo;->b:I

    goto :goto_e

    .line 12775
    :cond_1f
    iput v9, v4, Landroid/support/v7/widget/bo;->b:I

    .line 12776
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    iput v0, v4, Landroid/support/v7/widget/bo;->a:I

    goto/16 :goto_b

    .line 13970
    :cond_20
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto/16 :goto_5

    :cond_21
    move v0, v1

    .line 13694
    goto/16 :goto_6

    :cond_22
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v5

    .line 14953
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v6

    move v2, v1

    .line 14954
    :goto_f
    if-ge v2, v6, :cond_24

    .line 14955
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    .line 14956
    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 14957
    if-ltz v0, :cond_23

    if-lt v0, v5, :cond_7

    .line 14954
    :cond_23
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_f

    :cond_24
    move v0, v1

    .line 14961
    goto/16 :goto_6

    :cond_25
    move v2, v1

    .line 583
    :goto_10
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v2, v0, :cond_2b

    .line 584
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v5, v0, v2

    iget-boolean v6, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    iget v7, v4, Landroid/support/v7/widget/bo;->b:I

    .line 15195
    if-eqz v6, :cond_28

    .line 15196
    invoke-virtual {v5, v9}, Landroid/support/v7/widget/br;->b(I)I

    move-result v0

    .line 15200
    :goto_11
    invoke-virtual {v5}, Landroid/support/v7/widget/br;->c()V

    .line 15201
    if-eq v0, v9, :cond_27

    .line 15204
    if-eqz v6, :cond_26

    iget-object v8, v5, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v8, v8, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v8}, Landroid/support/v7/widget/ad;->d()I

    move-result v8

    if-lt v0, v8, :cond_27

    :cond_26
    if-nez v6, :cond_29

    iget-object v6, v5, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v6, v6, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v6}, Landroid/support/v7/widget/ad;->c()I

    move-result v6

    if-le v0, v6, :cond_29

    .line 583
    :cond_27
    :goto_12
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_10

    .line 15198
    :cond_28
    invoke-virtual {v5, v9}, Landroid/support/v7/widget/br;->a(I)I

    move-result v0

    goto :goto_11

    .line 15208
    :cond_29
    if-eq v7, v9, :cond_2a

    .line 15209
    add-int/2addr v0, v7

    .line 15211
    :cond_2a
    iput v0, v5, Landroid/support/v7/widget/br;->b:I

    iput v0, v5, Landroid/support/v7/widget/br;->a:I

    goto :goto_12

    .line 588
    :cond_2b
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;)V

    .line 589
    iput-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    .line 15782
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->f()I

    move-result v0

    iget v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    div-int/2addr v0, v2

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j:I

    .line 15783
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->f()I

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->u:I

    .line 15785
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-ne v0, v3, :cond_30

    .line 15786
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j:I

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->v:I

    .line 15787
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->w:I

    .line 591
    :goto_13
    iget v0, v4, Landroid/support/v7/widget/bo;->a:I

    invoke-direct {p0, v0, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(ILandroid/support/v7/widget/bf;)V

    .line 592
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    if-eqz v0, :cond_31

    .line 594
    invoke-direct {p0, v10}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(I)V

    .line 595
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    invoke-direct {p0, p1, v0, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I

    .line 597
    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(I)V

    .line 598
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v2, v4, Landroid/support/v7/widget/bo;->a:I

    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v5, v5, Landroid/support/v7/widget/u;->c:I

    add-int/2addr v2, v5

    iput v2, v0, Landroid/support/v7/widget/u;->b:I

    .line 599
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    invoke-direct {p0, p1, v0, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I

    .line 610
    :goto_14
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_2c

    .line 611
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_32

    .line 612
    invoke-direct {p0, p1, p2, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V

    .line 613
    invoke-direct {p0, p1, p2, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V

    .line 620
    :cond_2c
    :goto_15
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_2f

    .line 621
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->n:I

    if-eqz v0, :cond_33

    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_33

    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->z:Z

    if-nez v0, :cond_2d

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_33

    .line 624
    :cond_2d
    :goto_16
    if-eqz v3, :cond_2e

    .line 625
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Ljava/lang/Runnable;)Z

    .line 626
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B:Ljava/lang/Runnable;

    .line 16605
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_2e

    .line 16606
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1, v0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 628
    :cond_2e
    iput v10, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->d:I

    .line 629
    iput v9, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e:I

    .line 631
    :cond_2f
    iget-boolean v0, v4, Landroid/support/v7/widget/bo;->c:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    .line 632
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l()Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->p:Z

    .line 633
    iput-object v11, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    .line 634
    return-void

    .line 15789
    :cond_30
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j:I

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->w:I

    .line 15790
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->v:I

    goto/16 :goto_13

    .line 602
    :cond_31
    invoke-direct {p0, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(I)V

    .line 603
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    invoke-direct {p0, p1, v0, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I

    .line 605
    invoke-direct {p0, v10}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g(I)V

    .line 606
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v2, v4, Landroid/support/v7/widget/bo;->a:I

    iget-object v5, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    iget v5, v5, Landroid/support/v7/widget/u;->c:I

    add-int/2addr v2, v5

    iput v2, v0, Landroid/support/v7/widget/u;->b:I

    .line 607
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->k:Landroid/support/v7/widget/u;

    invoke-direct {p0, p1, v0, p2}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/u;Landroid/support/v7/widget/bf;)I

    goto :goto_14

    .line 615
    :cond_32
    invoke-direct {p0, p1, p2, v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V

    .line 616
    invoke-direct {p0, p1, p2, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)V

    goto :goto_15

    :cond_33
    move v3, v1

    .line 621
    goto :goto_16
.end method

.method public final d(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 966
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final d(I)V
    .locals 2

    .prologue
    .line 1304
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->d(I)V

    .line 1305
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v1, :cond_0

    .line 1306
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/br;->d(I)V

    .line 1305
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1308
    :cond_0
    return-void
.end method

.method public final d(II)V
    .locals 1

    .prologue
    .line 1336
    const/4 v0, 0x3

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(III)V

    .line 1337
    return-void
.end method

.method public final e(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 971
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final e(I)V
    .locals 2

    .prologue
    .line 1312
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->e(I)V

    .line 1313
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v1, :cond_0

    .line 1314
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/br;->d(I)V

    .line 1313
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1316
    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 796
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 987
    invoke-direct {p0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final f()Landroid/os/Parcelable;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    const/4 v1, -0x1

    const/high16 v4, -0x80000000

    .line 1053
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 1054
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->t:Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;)V

    .line 1099
    :goto_0
    return-object v0

    .line 1056
    :cond_0
    new-instance v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v3}, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;-><init>()V

    .line 1057
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->l:Z

    iput-boolean v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->h:Z

    .line 1058
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    iput-boolean v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->i:Z

    .line 1059
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->p:Z

    iput-boolean v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->j:Z

    .line 1061
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    if-eqz v0, :cond_2

    .line 1062
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->a:[I

    iput-object v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->f:[I

    .line 1063
    iget-object v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->f:[I

    array-length v0, v0

    iput v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->e:I

    .line 1064
    iget-object v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->b:Ljava/util/List;

    iput-object v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->g:Ljava/util/List;

    .line 1069
    :goto_1
    invoke-virtual {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_7

    .line 1070
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->j()V

    .line 1071
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->m()I

    move-result v0

    :goto_2
    iput v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    .line 17153
    iget-boolean v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c:Z

    if-eqz v0, :cond_4

    invoke-direct {p0, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v0

    .line 17155
    :goto_3
    if-nez v0, :cond_5

    move v0, v1

    .line 1073
    :goto_4
    iput v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->b:I

    .line 1074
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    iput v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    .line 1075
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    new-array v0, v0, [I

    iput-object v0, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->d:[I

    move v0, v2

    .line 1076
    :goto_5
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->g:I

    if-ge v0, v1, :cond_8

    .line 1078
    iget-boolean v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->o:Z

    if-eqz v1, :cond_6

    .line 1079
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/br;->b(I)I

    move-result v1

    .line 1080
    if-eq v1, v4, :cond_1

    .line 1081
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1089
    :cond_1
    :goto_6
    iget-object v2, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->d:[I

    aput v1, v2, v0

    .line 1076
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 1066
    :cond_2
    iput v2, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->e:I

    goto :goto_1

    .line 1071
    :cond_3
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->B()I

    move-result v0

    goto :goto_2

    .line 17153
    :cond_4
    invoke-direct {p0, v5}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v0

    goto :goto_3

    .line 17155
    :cond_5
    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_4

    .line 1084
    :cond_6
    iget-object v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->h:[Landroid/support/v7/widget/br;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/br;->a(I)I

    move-result v1

    .line 1085
    if-eq v1, v4, :cond_1

    .line 1086
    iget-object v2, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_6

    .line 1092
    :cond_7
    iput v1, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->a:I

    .line 1093
    iput v1, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->b:I

    .line 1094
    iput v2, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager$SavedState;->c:I

    :cond_8
    move-object v0, v3

    .line 1099
    goto/16 :goto_0
.end method

.method public final f(I)V
    .locals 0

    .prologue
    .line 281
    if-nez p1, :cond_0

    .line 282
    invoke-direct {p0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c()Z

    .line 284
    :cond_0
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 1826
    iget v0, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1821
    iget v1, p0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->i:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
