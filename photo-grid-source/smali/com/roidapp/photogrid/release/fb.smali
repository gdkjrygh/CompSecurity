.class public final Lcom/roidapp/photogrid/release/fb;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field public a:[[I

.field public b:[[I

.field private c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private d:I

.field private e:Landroid/view/ViewGroup;

.field private f:I

.field private g:Landroid/widget/HorizontalScrollView;

.field private h:I

.field private i:I

.field private j:I

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/Random;

.field private m:Z

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Z

.field private q:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    const/16 v7, 0xc

    const/16 v6, 0xb

    const/4 v5, 0x0

    const/16 v4, 0x9

    const/4 v3, 0x5

    .line 29
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 43
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->l:Ljava/util/Random;

    .line 47
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    .line 48
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    .line 50
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/fb;->p:Z

    .line 573
    const/16 v0, 0x10

    new-array v0, v0, [[I

    new-array v1, v5, [I

    aput-object v1, v0, v5

    const/4 v1, 0x1

    new-array v2, v7, [I

    fill-array-data v2, :array_0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const/16 v2, 0x11

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const/16 v2, 0xf

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0x16

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    aput-object v2, v0, v1

    const/16 v1, 0x13

    new-array v1, v1, [I

    fill-array-data v1, :array_4

    aput-object v1, v0, v3

    const/4 v1, 0x6

    const/16 v2, 0xe

    new-array v2, v2, [I

    fill-array-data v2, :array_5

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-array v2, v4, [I

    fill-array-data v2, :array_6

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const/16 v2, 0xd

    new-array v2, v2, [I

    fill-array-data v2, :array_7

    aput-object v2, v0, v1

    new-array v1, v6, [I

    fill-array-data v1, :array_8

    aput-object v1, v0, v4

    const/16 v1, 0xa

    new-array v2, v4, [I

    fill-array-data v2, :array_9

    aput-object v2, v0, v1

    new-array v1, v4, [I

    fill-array-data v1, :array_a

    aput-object v1, v0, v6

    new-array v1, v4, [I

    fill-array-data v1, :array_b

    aput-object v1, v0, v7

    const/16 v1, 0xd

    new-array v2, v4, [I

    fill-array-data v2, :array_c

    aput-object v2, v0, v1

    const/16 v1, 0xe

    new-array v2, v4, [I

    fill-array-data v2, :array_d

    aput-object v2, v0, v1

    const/16 v1, 0xf

    new-array v2, v4, [I

    fill-array-data v2, :array_e

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->a:[[I

    .line 798
    const/16 v0, 0x10

    new-array v0, v0, [[I

    new-array v1, v5, [I

    aput-object v1, v0, v5

    const/4 v1, 0x1

    new-array v2, v3, [I

    fill-array-data v2, :array_f

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-array v2, v3, [I

    fill-array-data v2, :array_10

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-array v2, v3, [I

    fill-array-data v2, :array_11

    aput-object v2, v0, v1

    const/4 v1, 0x4

    new-array v2, v3, [I

    fill-array-data v2, :array_12

    aput-object v2, v0, v1

    new-array v1, v3, [I

    fill-array-data v1, :array_13

    aput-object v1, v0, v3

    const/4 v1, 0x6

    new-array v2, v3, [I

    fill-array-data v2, :array_14

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-array v2, v3, [I

    fill-array-data v2, :array_15

    aput-object v2, v0, v1

    const/16 v1, 0x8

    new-array v2, v3, [I

    fill-array-data v2, :array_16

    aput-object v2, v0, v1

    new-array v1, v3, [I

    fill-array-data v1, :array_17

    aput-object v1, v0, v4

    const/16 v1, 0xa

    new-array v2, v3, [I

    fill-array-data v2, :array_18

    aput-object v2, v0, v1

    new-array v1, v3, [I

    fill-array-data v1, :array_19

    aput-object v1, v0, v6

    new-array v1, v3, [I

    fill-array-data v1, :array_1a

    aput-object v1, v0, v7

    const/16 v1, 0xd

    new-array v2, v3, [I

    fill-array-data v2, :array_1b

    aput-object v2, v0, v1

    const/16 v1, 0xe

    new-array v2, v3, [I

    fill-array-data v2, :array_1c

    aput-object v2, v0, v1

    const/16 v1, 0xf

    new-array v2, v3, [I

    fill-array-data v2, :array_1d

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->b:[[I

    return-void

    .line 573
    nop

    :array_0
    .array-data 4
        0x7f0202ac
        0x7f0202b0
        0x7f0202af
        0x7f0202b4
        0x7f0202b1
        0x7f0202b2
        0x7f0202b6
        0x7f0202b3
        0x7f0202ad
        0x7f0202b5
        0x7f0202ae
        0x7f0202b7
    .end array-data

    :array_1
    .array-data 4
        0x7f0202ba
        0x7f0202b8
        0x7f0202bb
        0x7f0202b9
        0x7f0202bf
        0x7f0202be
        0x7f0202bd
        0x7f0202c0
        0x7f0202bc
        0x7f0202c5
        0x7f0202c7
        0x7f0202c3
        0x7f0202c8
        0x7f0202c6
        0x7f0202c1
        0x7f0202c2
        0x7f0202c4
    .end array-data

    :array_2
    .array-data 4
        0x7f0202cb
        0x7f0202cf
        0x7f0202d3
        0x7f0202d0
        0x7f0202c9
        0x7f0202d1
        0x7f0202ca
        0x7f0202cc
        0x7f0202cd
        0x7f0202d2
        0x7f0202ce
        0x7f0202d6
        0x7f0202d4
        0x7f0202d5
        0x7f0202d7
    .end array-data

    :array_3
    .array-data 4
        0x7f0202d8
        0x7f0202db
        0x7f0202e4
        0x7f0202e8
        0x7f0202e1
        0x7f0202dc
        0x7f0202de
        0x7f0202e0
        0x7f0202df
        0x7f0202e3
        0x7f0202e7
        0x7f0202e6
        0x7f0202e5
        0x7f0202da
        0x7f0202e9
        0x7f0202dd
        0x7f0202d9
        0x7f0202e2
        0x7f0202ea
        0x7f0202ec
        0x7f0202ed
        0x7f0202eb
    .end array-data

    :array_4
    .array-data 4
        0x7f0202f7
        0x7f0202f0
        0x7f0202f4
        0x7f0202fa
        0x7f0202f1
        0x7f0202ef
        0x7f0202f8
        0x7f0202f9
        0x7f0202fc
        0x7f0202f2
        0x7f0202f6
        0x7f0202f5
        0x7f0202ee
        0x7f0202f3
        0x7f0202fb
        0x7f0202fd
        0x7f0202fe
        0x7f0202ff
        0x7f020300
    .end array-data

    :array_5
    .array-data 4
        0x7f020303
        0x7f020301
        0x7f02030e
        0x7f020302
        0x7f020308
        0x7f020306
        0x7f020304
        0x7f020305
        0x7f020307
        0x7f02030d
        0x7f02030c
        0x7f02030b
        0x7f020309
        0x7f02030a
    .end array-data

    :array_6
    .array-data 4
        0x7f020317
        0x7f020313
        0x7f020310
        0x7f020315
        0x7f02030f
        0x7f020316
        0x7f020311
        0x7f020312
        0x7f020314
    .end array-data

    :array_7
    .array-data 4
        0x7f02031a
        0x7f02031c
        0x7f02031b
        0x7f020324
        0x7f020323
        0x7f02031f
        0x7f020320
        0x7f02031d
        0x7f020319
        0x7f02031e
        0x7f020318
        0x7f020321
        0x7f020322
    .end array-data

    :array_8
    .array-data 4
        0x7f020325
        0x7f020326
        0x7f02032e
        0x7f02032f
        0x7f020328
        0x7f02032d
        0x7f020329
        0x7f020327
        0x7f02032c
        0x7f02032a
        0x7f02032b
    .end array-data

    :array_9
    .array-data 4
        0x7f020276
        0x7f020277
        0x7f02027b
        0x7f02027a
        0x7f02027d
        0x7f02027c
        0x7f02027e
        0x7f020278
        0x7f020279
    .end array-data

    :array_a
    .array-data 4
        0x7f02027f
        0x7f020281
        0x7f020280
        0x7f020282
        0x7f020285
        0x7f020286
        0x7f020284
        0x7f020283
        0x7f020287
    .end array-data

    :array_b
    .array-data 4
        0x7f020288
        0x7f02028b
        0x7f02028c
        0x7f020289
        0x7f02028a
        0x7f02028d
        0x7f02028f
        0x7f020290
        0x7f02028e
    .end array-data

    :array_c
    .array-data 4
        0x7f020291
        0x7f020296
        0x7f020294
        0x7f020292
        0x7f020295
        0x7f020298
        0x7f020293
        0x7f020297
        0x7f020299
    .end array-data

    :array_d
    .array-data 4
        0x7f02029a
        0x7f02029b
        0x7f02029c
        0x7f0202a2
        0x7f02029d
        0x7f02029f
        0x7f0202a0
        0x7f0202a1
        0x7f02029e
    .end array-data

    :array_e
    .array-data 4
        0x7f0202a3
        0x7f0202a4
        0x7f0202a5
        0x7f0202ab
        0x7f0202a6
        0x7f0202a9
        0x7f0202a8
        0x7f0202aa
        0x7f0202a7
    .end array-data

    .line 798
    :array_f
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
    .end array-data

    :array_10
    .array-data 4
        0x2
        0xa
        0xb
        0x3
        0x4
    .end array-data

    :array_11
    .array-data 4
        0x2
        0x6
        0x9
        0xa
        0x3
    .end array-data

    :array_12
    .array-data 4
        0x2
        0x1
        0x8
        0x7
        0x9
    .end array-data

    :array_13
    .array-data 4
        0x2
        0x7
        0xe
        0x6
        0x3
    .end array-data

    :array_14
    .array-data 4
        0x0
        0x4
        0x2
        0x9
        0x7
    .end array-data

    :array_15
    .array-data 4
        0x0
        0x8
        0x6
        0x2
        0x1
    .end array-data

    :array_16
    .array-data 4
        0x0
        0x2
        0x1
        0xc
        0x7
    .end array-data

    :array_17
    .array-data 4
        0x7
        0x0
        0x2
        0x6
        0x8
    .end array-data

    :array_18
    .array-data 4
        0x0
        0x2
        0x6
        0x7
        0x1
    .end array-data

    :array_19
    .array-data 4
        0x0
        0x3
        0x2
        0x1
        0x7
    .end array-data

    :array_1a
    .array-data 4
        0x0
        0x5
        0x3
        0x1
        0x2
    .end array-data

    :array_1b
    .array-data 4
        0x0
        0x5
        0x1
        0x3
        0x4
    .end array-data

    :array_1c
    .array-data 4
        0x0
        0x1
        0x2
        0x8
        0x6
    .end array-data

    :array_1d
    .array-data 4
        0x0
        0x2
        0x7
        0x1
        0x5
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fb;I)I
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/roidapp/photogrid/release/fb;->d:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fb;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/fb;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->g:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/fb;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->i:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/fb;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->d:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/fb;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->m:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/fb;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 29
    .line 1491
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    if-nez v1, :cond_1

    .line 1496
    :cond_0
    :goto_0
    return v0

    .line 1494
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 1495
    if-eqz v1, :cond_0

    .line 1498
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->l:Ljava/util/Random;

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    .line 1499
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1500
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/fb;)Z
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->m:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/fb;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->f:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/fb;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->j:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/fb;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/fb;)Ljava/util/List;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    const v5, 0x7f0d04c9

    const v4, 0x7f0203dc

    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 506
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    .line 507
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    .line 508
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v1, :pswitch_data_0

    .line 535
    :cond_0
    :goto_0
    :pswitch_0
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    if-eq v0, v1, :cond_1

    .line 536
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    const-string v1, "ratio"

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 537
    if-eqz v0, :cond_1

    .line 538
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    if-eqz v1, :cond_3

    .line 539
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 540
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00bf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 541
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 542
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 552
    :cond_1
    :goto_1
    return-void

    .line 510
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 511
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_0

    .line 515
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 516
    :cond_2
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_0

    .line 521
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 522
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_0

    .line 526
    :pswitch_4
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_0

    .line 529
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 530
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_0

    .line 544
    :cond_3
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 545
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 546
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 547
    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_1

    .line 508
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 570
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fb;->q:Ljava/lang/String;

    .line 571
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 562
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->p:Z

    .line 563
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 54
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 55
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 56
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const v9, 0x7f0203dc

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 59
    const v0, 0x7f0300b1

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v5

    .line 473
    :goto_0
    return-object v0

    .line 63
    :cond_1
    const v0, 0x7f0d0289

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    .line 64
    const v0, 0x7f0d0287

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->g:Landroid/widget/HorizontalScrollView;

    .line 66
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900d4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/fb;->i:I

    .line 68
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/fb;->j:I

    .line 72
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 108
    :goto_1
    :pswitch_0
    const v0, 0x7f03012c

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 109
    const v0, 0x7f0d04c9

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 111
    invoke-virtual {v0, v3, v9, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 112
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f07025d

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    .line 118
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v1, :pswitch_data_1

    :cond_2
    :pswitch_1
    move v1, v2

    .line 147
    :goto_2
    iget-boolean v6, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    if-eqz v6, :cond_b

    .line 148
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0c00bf

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 150
    const/16 v7, 0xff

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 151
    invoke-virtual {v0, v8, v6, v8, v8}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 159
    :goto_3
    const-string v0, "ratio"

    invoke-virtual {v4, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    new-instance v0, Lcom/roidapp/photogrid/release/fc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fc;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    .line 177
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/fb;->d:I

    .line 180
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    if-ne v0, v2, :cond_5

    .line 181
    const v0, 0x7f03012c

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 182
    const v0, 0x7f0d04c9

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 183
    const v6, 0x7f0203c8

    invoke-virtual {v0, v3, v6, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 184
    iget-object v6, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0701f5

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->d:I

    if-nez v0, :cond_4

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-eq v0, v2, :cond_3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-nez v0, :cond_4

    .line 187
    :cond_3
    const v0, 0x7f0d0493

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 189
    :cond_4
    const-string v0, "noMask"

    invoke-virtual {v4, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    new-instance v0, Lcom/roidapp/photogrid/release/fd;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fd;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    :cond_5
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    if-le v0, v2, :cond_6

    .line 250
    const v0, 0x7f03012c

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 252
    const v0, 0x7f0d04c9

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 253
    const v6, 0x7f0203db

    invoke-virtual {v0, v3, v6, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 254
    iget-object v6, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f070254

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    new-instance v0, Lcom/roidapp/photogrid/release/fe;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fe;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 329
    :cond_6
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    const/16 v4, 0x10

    if-ge v0, v4, :cond_e

    .line 331
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aG()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    .line 332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    if-eqz v0, :cond_c

    .line 333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_7

    .line 334
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/fb;->m:Z

    .line 344
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->a:[[I

    iget v4, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    aget-object v0, v0, v4

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/fb;->f:I

    move v4, v3

    .line 345
    :goto_5
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->f:I

    if-ge v4, v0, :cond_f

    .line 346
    const v0, 0x7f03012a

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 347
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget v7, p0, Lcom/roidapp/photogrid/release/fb;->i:I

    iget v8, p0, Lcom/roidapp/photogrid/release/fb;->i:I

    invoke-direct {v0, v7, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 348
    const v0, 0x7f0d0494

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 350
    :try_start_0
    iget-object v7, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget-object v8, p0, Lcom/roidapp/photogrid/release/fb;->a:[[I

    iget v9, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    aget-object v8, v8, v9

    aget v8, v8, v4

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 351
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    :goto_6
    iget v0, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    if-ne v0, v2, :cond_12

    .line 357
    add-int/lit8 v0, v4, 0x1

    .line 359
    :goto_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 360
    iget v7, p0, Lcom/roidapp/photogrid/release/fb;->d:I

    if-ne v0, v7, :cond_8

    .line 361
    iget-object v7, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 362
    const v0, 0x7f0d0493

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 364
    :cond_8
    new-instance v0, Lcom/roidapp/photogrid/release/ff;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ff;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 345
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_5

    .line 74
    :pswitch_2
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 77
    :pswitch_3
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 80
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    packed-switch v0, :pswitch_data_2

    :pswitch_5
    goto/16 :goto_1

    .line 82
    :pswitch_6
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 85
    :pswitch_7
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 88
    :pswitch_8
    const-string v0, "GridActivity/Single/Shape"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 93
    :pswitch_9
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 96
    :pswitch_a
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 99
    :pswitch_b
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->o:Ljava/lang/String;

    goto/16 :goto_1

    .line 120
    :pswitch_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v7, :cond_2

    .line 121
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    move v1, v2

    goto/16 :goto_2

    .line 125
    :pswitch_d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->g()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v7, :cond_2

    .line 126
    :cond_9
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    move v1, v2

    goto/16 :goto_2

    .line 130
    :pswitch_e
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v7, :cond_2

    .line 131
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    move v1, v2

    goto/16 :goto_2

    .line 135
    :pswitch_f
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    :cond_a
    :goto_8
    move v1, v3

    .line 142
    goto/16 :goto_2

    .line 139
    :pswitch_10
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v7, :cond_a

    .line 140
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/fb;->n:Z

    goto :goto_8

    .line 153
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0c00c0

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 154
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fb;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 155
    const/16 v7, 0x32

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 156
    invoke-virtual {v0, v8, v6, v8, v8}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_3

    .line 337
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    .line 338
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->b:[[I

    iget v4, p0, Lcom/roidapp/photogrid/release/fb;->h:I

    aget-object v4, v0, v4

    array-length v6, v4

    move v0, v3

    :goto_9
    if-ge v0, v6, :cond_d

    aget v7, v4, v0

    .line 339
    iget-object v8, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    .line 341
    :cond_d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/fb;->k:Ljava/util/List;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    goto/16 :goto_4

    .line 353
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_6

    .line 421
    :cond_e
    iput v3, p0, Lcom/roidapp/photogrid/release/fb;->f:I

    .line 429
    :cond_f
    if-eqz v1, :cond_10

    .line 430
    const v0, 0x7f03012a

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 437
    const v0, 0x7f0d0494

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 441
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fb;->q:Ljava/lang/String;

    .line 1479
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 1480
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 442
    :goto_a
    const v0, 0x7f020093

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 447
    :goto_b
    const-string v0, "templateEntry"

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->e:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 449
    new-instance v0, Lcom/roidapp/photogrid/release/fg;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/fg;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 465
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fb;->p:Z

    if-eqz v0, :cond_10

    .line 466
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fb;->g:Landroid/widget/HorizontalScrollView;

    new-instance v1, Lcom/roidapp/photogrid/release/fh;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/fh;-><init>(Lcom/roidapp/photogrid/release/fb;)V

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/HorizontalScrollView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_10
    move-object v0, v5

    .line 473
    goto/16 :goto_0

    .line 1485
    :cond_11
    :try_start_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fb;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1486
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_a

    .line 444
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_b

    :cond_12
    move v0, v4

    goto/16 :goto_7

    .line 72
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_a
    .end packed-switch

    .line 118
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_d
        :pswitch_e
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_f
        :pswitch_10
    .end packed-switch

    .line 80
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_8
    .end packed-switch
.end method
