.class public abstract Lcom/roidapp/photogrid/release/mm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field protected B:[I

.field protected C:F

.field protected D:Lcom/roidapp/photogrid/release/PhotoView;

.field protected E:Lcom/roidapp/photogrid/release/az;

.field protected F:Z

.field protected G:Z

.field protected H:Z

.field protected I:Z

.field protected J:I

.field protected K:Landroid/os/Handler;

.field private L:Lcom/roidapp/imagelib/d/b;

.field protected final a:I

.field protected final b:I

.field protected final c:I

.field protected final d:I

.field protected final e:I

.field protected final f:I

.field protected final g:I

.field protected h:Landroid/app/Activity;

.field public i:[Lcom/roidapp/photogrid/release/ig;

.field protected j:Landroid/view/ViewGroup;

.field protected k:Landroid/widget/RelativeLayout;

.field protected l:Lcom/roidapp/photogrid/release/ml;

.field protected m:I

.field protected n:I

.field protected o:I

.field protected p:Landroid/widget/LinearLayout;

.field protected q:Lcom/roidapp/photogrid/release/an;

.field protected r:I

.field protected s:I

.field protected t:I

.field protected u:I

.field protected v:Lcom/roidapp/photogrid/release/mp;

.field protected w:I

.field protected x:I

.field protected y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;"
        }
    .end annotation
.end field

.field protected z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->a:I

    .line 30
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->b:I

    .line 31
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->c:I

    .line 32
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->d:I

    .line 33
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->e:I

    .line 34
    const/4 v0, 0x6

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->f:I

    .line 35
    const/4 v0, 0x7

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->g:I

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mm;->z:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mm;->A:Ljava/util/List;

    .line 75
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->C:F

    .line 87
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/mm;->G:Z

    .line 95
    new-instance v0, Lcom/roidapp/imagelib/d/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/d/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mm;->L:Lcom/roidapp/imagelib/d/b;

    .line 100
    new-instance v0, Lcom/roidapp/photogrid/release/mn;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/mn;-><init>(Lcom/roidapp/photogrid/release/mm;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mm;->K:Landroid/os/Handler;

    .line 168
    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 210
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 214
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;F)V
    .locals 2

    .prologue
    .line 605
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->m:I

    if-nez v0, :cond_1

    .line 613
    :cond_0
    :goto_0
    return-void

    .line 608
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    .line 611
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 612
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method private m()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const v3, 0x3f23d70a    # 0.64f

    const/4 v1, 0x0

    const v2, 0x3fb9999a    # 1.45f

    .line 524
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 602
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 527
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 551
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    .line 552
    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v0, :cond_6

    .line 553
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 554
    const-string v0, "OUTER_SPACE"

    invoke-direct {p0, v0, v2}, Lcom/roidapp/photogrid/release/mm;->a(Ljava/lang/String;F)V

    .line 559
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 561
    const-string v0, "INNER_SPACE"

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/mm;->a(Ljava/lang/String;F)V

    .line 568
    :cond_2
    :goto_2
    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    goto :goto_0

    .line 532
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-eq v0, v4, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v0, :cond_4

    .line 533
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 535
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 539
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 540
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 542
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 546
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 547
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 556
    :cond_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 557
    const-string v0, "OUTER_SPACE"

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/mm;->a(Ljava/lang/String;F)V

    goto :goto_1

    .line 527
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public abstract a()V
.end method

.method public a(I)V
    .locals 5

    .prologue
    .line 305
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 307
    iput p1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    .line 308
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 309
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v1, :cond_1

    .line 310
    const/4 v1, 0x0

    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 311
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v1, v2, p1, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 312
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    .line 313
    instance-of v1, p0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v1, :cond_0

    .line 314
    move-object v0, p0

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    move-object v1, v0

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ng;->m()V

    .line 315
    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 323
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;->m()V

    .line 328
    :goto_1
    return-void

    .line 318
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 319
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 320
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/an;->invalidate()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 325
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 326
    const/16 v1, 0xb5

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->d(I)V

    goto :goto_1
.end method

.method public a(II)V
    .locals 4

    .prologue
    .line 335
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 336
    iput p1, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    .line 337
    iput p2, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    .line 339
    const/16 v1, -0x14

    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    .line 340
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 341
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 342
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 343
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v1, :cond_1

    .line 344
    const/4 v1, 0x0

    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 345
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    invoke-virtual {v1, v2, v3, p1, p2}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 346
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    .line 347
    instance-of v1, p0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v1, :cond_0

    .line 348
    move-object v0, p0

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    move-object v1, v0

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ng;->m()V

    .line 349
    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 357
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;->m()V

    .line 362
    :goto_1
    return-void

    .line 352
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 353
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 354
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/an;->invalidate()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 359
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 360
    const/16 v1, 0xb6

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->d(I)V

    goto :goto_1
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 664
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 665
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 666
    const/16 v1, 0x15

    iput v1, v0, Landroid/os/Message;->what:I

    .line 667
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 668
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 669
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 670
    return-void
.end method

.method public final a(IZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 220
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/mm;->G:Z

    .line 222
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 225
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 226
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 227
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 230
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/roidapp/photogrid/release/ln;->a(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    .line 234
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 235
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->o(Z)V

    .line 236
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ai()V

    .line 239
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 240
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->g(F)V

    .line 241
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(F)V

    .line 242
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->h(F)V

    .line 247
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 248
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 249
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 250
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 255
    :cond_1
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 256
    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 260
    if-nez p2, :cond_2

    .line 264
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 266
    :cond_2
    iput p1, p0, Lcom/roidapp/photogrid/release/mm;->m:I

    .line 268
    return-void
.end method

.method public abstract a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
.end method

.method public final a(Lcom/roidapp/photogrid/release/mp;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    .line 185
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x4

    .line 275
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 276
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 277
    if-eqz p1, :cond_0

    .line 278
    invoke-virtual {p0, v2, v2}, Lcom/roidapp/photogrid/release/mm;->a(II)V

    .line 281
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    .line 288
    :cond_2
    if-eqz p1, :cond_0

    .line 289
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    const v1, 0x7f07037d

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method public a(ZZ)V
    .locals 0

    .prologue
    .line 678
    return-void
.end method

.method public abstract b(Z)I
.end method

.method public abstract b()V
.end method

.method public final b(I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 369
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 371
    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eq v2, p1, :cond_1

    .line 372
    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move v0, v1

    .line 376
    :cond_1
    iput p1, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    .line 379
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v2, :cond_2

    .line 380
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    iget v5, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v2, p1, v3, v4, v5}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 381
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 382
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 383
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 389
    :cond_2
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/roidapp/photogrid/release/ih;->g(I)V

    .line 390
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;->m()V

    .line 391
    if-eqz v0, :cond_8

    .line 392
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ne v0, v1, :cond_6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    cmpg-float v0, v0, v6

    if-gtz v0, :cond_6

    .line 393
    if-nez p1, :cond_5

    .line 394
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 407
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/mp;->M()V

    .line 417
    :cond_3
    :goto_2
    return-void

    .line 385
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/an;->b(Z)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 414
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 415
    const/16 v0, 0xb7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mm;->d(I)V

    goto :goto_2

    .line 396
    :cond_5
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const v1, 0x3fb9999a    # 1.45f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_1

    .line 399
    :cond_6
    if-nez p1, :cond_7

    .line 400
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const v1, 0x3f23d70a    # 0.64f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 401
    const-string v0, "OUTER_SPACE"

    const v1, 0x3f23d70a    # 0.64f

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Ljava/lang/String;F)V

    goto :goto_1

    .line 403
    :cond_7
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const v1, 0x3fb9999a    # 1.45f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 404
    const-string v0, "OUTER_SPACE"

    const v1, 0x3fb9999a    # 1.45f

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Ljava/lang/String;F)V

    goto :goto_1

    .line 409
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_3

    .line 410
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method public abstract b(II)V
.end method

.method public abstract b(IZ)V
.end method

.method public final c()V
    .locals 6

    .prologue
    const/16 v0, -0x14

    const/4 v2, 0x2

    .line 424
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 425
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 428
    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    .line 429
    if-nez v3, :cond_1

    .line 430
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->i:[I

    array-length v3, v3

    .line 431
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v4

    iget-object v4, v4, Lcom/roidapp/baselib/c/p;->i:[I

    invoke-virtual {v1, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    aget v1, v4, v1

    .line 432
    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    :goto_0
    move v1, v0

    move v0, v2

    .line 438
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 440
    iget-object v4, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/an;->c()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->u(Z)V

    .line 441
    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->u(I)V

    .line 442
    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->v(I)V

    .line 443
    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->w(I)V

    .line 445
    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    .line 446
    iput v2, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    .line 447
    iput v0, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    .line 449
    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 450
    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 451
    iget v0, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 454
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 455
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    .line 460
    :goto_2
    return-void

    :cond_0
    move v0, v1

    .line 432
    goto :goto_0

    .line 434
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x2

    rem-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x2

    .line 435
    const/4 v3, 0x5

    invoke-virtual {v1, v3}, Ljava/util/Random;->nextInt(I)I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    move v5, v1

    move v1, v0

    move v0, v5

    goto :goto_1

    .line 457
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 458
    const/16 v0, 0xb8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mm;->d(I)V

    goto :goto_2
.end method

.method public abstract c(I)V
.end method

.method public abstract c(II)V
.end method

.method protected final d()V
    .locals 3

    .prologue
    .line 464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 482
    :cond_0
    :goto_0
    return-void

    .line 467
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 468
    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->m:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->s(I)V

    .line 469
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ay()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->t(Z)V

    .line 470
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->l(F)V

    .line 472
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 473
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 474
    if-eqz v0, :cond_2

    .line 475
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 478
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 479
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->o(Ljava/util/List;)V

    goto :goto_0
.end method

.method public d(I)V
    .locals 2

    .prologue
    .line 656
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 657
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 658
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 659
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 660
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 661
    return-void
.end method

.method protected final e()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 488
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 491
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bb()Z

    move-result v1

    .line 492
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->C:Z

    if-eqz v1, :cond_0

    .line 493
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x12

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 495
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/an;->b()V

    .line 496
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 497
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aB()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/an;->a(Ljava/lang/String;)V

    .line 498
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    .line 500
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 517
    :goto_0
    return-void

    .line 502
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aW()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    .line 503
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aX()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    .line 504
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aY()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    .line 506
    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 507
    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 508
    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 510
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 511
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 512
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    goto :goto_0
.end method

.method public e(I)V
    .locals 0

    .prologue
    .line 690
    return-void
.end method

.method public abstract f()V
.end method

.method public g()V
    .locals 0

    .prologue
    .line 684
    return-void
.end method

.method public h()V
    .locals 0

    .prologue
    .line 687
    return-void
.end method

.method public i()V
    .locals 0

    .prologue
    .line 693
    return-void
.end method

.method public j()V
    .locals 0

    .prologue
    .line 696
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 699
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->L:Lcom/roidapp/imagelib/d/b;

    if-eqz v0, :cond_0

    .line 700
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->L:Lcom/roidapp/imagelib/d/b;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/d/b;->a()V

    .line 702
    :cond_0
    return-void
.end method

.method public l()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 704
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 705
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    add-int/lit8 v2, v0, 0x1

    .line 708
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    move-object v1, v0

    .line 709
    :goto_0
    const/4 v0, 0x0

    .line 710
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0xa

    if-eq v3, v4, :cond_0

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    .line 713
    :cond_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 714
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 716
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mm;->L:Lcom/roidapp/imagelib/d/b;

    new-instance v4, Lcom/roidapp/photogrid/release/mo;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/mo;-><init>(Lcom/roidapp/photogrid/release/mm;)V

    invoke-virtual {v3, v1, v0, v2, v4}, Lcom/roidapp/imagelib/d/b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;ILcom/roidapp/imagelib/d/d;)V

    .line 736
    :goto_1
    return-void

    .line 708
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    move-object v1, v0

    goto :goto_0

    .line 731
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 732
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/mm;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/mm;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mm;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mm;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 733
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    goto :goto_1
.end method
