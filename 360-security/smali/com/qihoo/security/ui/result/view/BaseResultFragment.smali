.class public abstract Lcom/qihoo/security/ui/result/view/BaseResultFragment;
.super Lcom/qihoo/security/ui/main/BaseHomeFragment;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;
.implements Lcom/qihoo/security/ui/result/view/ResultScrollView$a;


# instance fields
.field private A:Z

.field private final B:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final C:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final D:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private E:Lcom/qihoo/security/ui/b/a$f;

.field protected a:Landroid/view/View;

.field protected k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

.field protected l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

.field protected m:Landroid/view/View;

.field protected n:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field protected o:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field protected p:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field protected q:Landroid/widget/ImageView;

.field protected r:Landroid/view/View;

.field protected s:Landroid/view/ViewGroup;

.field protected t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/result/card/view/CardView;",
            ">;"
        }
    .end annotation
.end field

.field private u:Landroid/view/View;

.field private v:Landroid/view/View;

.field private w:Landroid/view/View;

.field private x:Landroid/view/View;

.field private y:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;-><init>()V

    .line 98
    iput-boolean v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->A:Z

    .line 111
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 112
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 116
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;I)I
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->y:I

    return p1
.end method

.method private a(Landroid/view/View;Landroid/view/animation/Interpolator;IJI)Lcom/nineoldandroids/a/k;
    .locals 6

    .prologue
    .line 742
    const-string/jumbo v0, "translationY"

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    int-to-float v3, p3

    aput v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, v1, v2

    invoke-static {p1, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 743
    invoke-virtual {v0, p4, p5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 744
    int-to-long v2, p6

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 745
    invoke-virtual {v0, p2}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 746
    new-instance v1, Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 752
    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    return-object p1
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 492
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l()I

    move-result v0

    .line 493
    packed-switch v0, :pswitch_data_0

    .line 504
    :goto_0
    return-void

    .line 495
    :pswitch_0
    if-nez p1, :cond_0

    .line 496
    const/16 v0, 0x2c97

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 498
    :cond_0
    const/16 v0, 0x2c96

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    goto :goto_0

    .line 493
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 5

    .prologue
    const/16 v2, 0x8

    const/4 v4, -0x1

    const/4 v3, -0x2

    .line 338
    if-eqz p1, :cond_0

    .line 339
    iget v0, p1, Lcom/qihoo/security/ui/result/AdvData;->tp:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 340
    new-instance v0, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;-><init>(Landroid/content/Context;)V

    .line 341
    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->setADcontent(Lcom/qihoo/security/ui/result/AdvData;)V

    .line 342
    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/result/card/view/AdvCardSimpleView;->setVisibility(I)V

    .line 343
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s:Landroid/view/ViewGroup;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 353
    :cond_0
    :goto_0
    return-void

    .line 345
    :cond_1
    iget v0, p1, Lcom/qihoo/security/ui/result/AdvData;->tp:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 346
    new-instance v0, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;-><init>(Landroid/content/Context;)V

    .line 347
    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->setADcontent(Lcom/qihoo/security/ui/result/AdvData;)V

    .line 348
    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/result/card/view/AdvCardComplexView;->setVisibility(I)V

    .line 349
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s:Landroid/view/ViewGroup;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Lcom/nineoldandroids/a/b;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/nineoldandroids/a/b;)V

    return-void
.end method

.method private b(Lcom/nineoldandroids/a/b;)V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    const/high16 v11, 0x41200000    # 10.0f

    const/4 v10, 0x0

    const/4 v9, 0x2

    .line 597
    new-instance v0, Lcom/nineoldandroids/a/c;

    invoke-direct {v0}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 598
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 600
    const-wide/16 v2, 0x12c

    .line 601
    iget-object v4, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    const-string/jumbo v5, "alpha"

    new-array v6, v9, [F

    fill-array-data v6, :array_0

    invoke-static {v4, v5, v6}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v4

    .line 602
    invoke-virtual {v4, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 603
    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    const-string/jumbo v6, "translationY"

    new-array v7, v9, [F

    aput v10, v7, v12

    iget-object v8, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v8, v11}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v8

    neg-int v8, v8

    int-to-float v8, v8

    aput v8, v7, v13

    invoke-static {v5, v6, v7}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v5

    .line 605
    invoke-virtual {v5, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 609
    iget-object v6, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    const-string/jumbo v7, "translationY"

    new-array v8, v9, [F

    aput v10, v8, v12

    iget-object v9, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v9, v11}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v9

    neg-int v9, v9

    int-to-float v9, v9

    aput v9, v8, v13

    invoke-static {v6, v7, v8}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v6

    .line 611
    invoke-virtual {v6, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 612
    invoke-virtual {v6, v2, v3}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 617
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 622
    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/c;->a(Ljava/util/Collection;)V

    .line 623
    if-eqz p1, :cond_0

    .line 624
    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 626
    :cond_0
    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    .line 627
    return-void

    .line 601
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static synthetic b(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->y:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q()V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->u()V

    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Lcom/qihoo/security/ui/fragment/BaseFragment$b;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->e:Lcom/qihoo/security/ui/fragment/BaseFragment$b;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->i:Z

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Ljava/util/List;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->A:Z

    return v0
.end method

.method private q()V
    .locals 2

    .prologue
    .line 276
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;I)V

    .line 277
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->u:Landroid/view/View;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;I)V

    .line 278
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->w:Landroid/view/View;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->e()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;I)V

    .line 279
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->x:Landroid/view/View;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;I)V

    .line 280
    return-void
.end method

.method private r()V
    .locals 9

    .prologue
    .line 302
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l()I

    move-result v0

    .line 303
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 304
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    .line 308
    :goto_0
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/f;->b(I)Ljava/util/List;

    move-result-object v2

    .line 309
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/f;->c(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    .line 310
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/f;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v3

    .line 311
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    .line 312
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v4, :cond_1

    .line 314
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    .line 316
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/card/a;

    .line 317
    new-instance v5, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;

    iget-object v6, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-direct {v5, v6}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;-><init>(Landroid/content/Context;)V

    .line 318
    invoke-virtual {v5, p0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setOnCardClickListener(Lcom/qihoo/security/ui/result/card/view/FunctionCardView$a;)V

    .line 319
    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setVisibility(I)V

    .line 320
    invoke-virtual {v5, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setCardViewData(Lcom/qihoo/security/ui/result/card/a;)V

    .line 321
    iget v0, v0, Lcom/qihoo/security/ui/result/card/a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/qihoo/security/ui/result/card/view/FunctionCardView;->setTag(Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s:Landroid/view/ViewGroup;

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v7, -0x1

    const/4 v8, -0x2

    invoke-direct {v6, v7, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 312
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 306
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 326
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 327
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 329
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    goto :goto_2

    .line 331
    :cond_2
    return-void
.end method

.method private s()V
    .locals 3

    .prologue
    const/4 v2, 0x4

    .line 587
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/card/view/CardView;

    .line 588
    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/result/card/view/CardView;->setVisibility(I)V

    goto :goto_0

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 591
    return-void
.end method

.method private t()V
    .locals 6

    .prologue
    .line 633
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->m()V

    .line 634
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x4

    new-array v3, v3, [Landroid/view/View;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    iget-object v5, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->p:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aput-object v5, v3, v4

    new-instance v4, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;

    invoke-direct {v4, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$6;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J

    .line 655
    return-void
.end method

.method private u()V
    .locals 1

    .prologue
    .line 661
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s()V

    .line 662
    new-instance v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$7;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$7;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/nineoldandroids/a/b;)V

    .line 668
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->v()V

    .line 670
    return-void
.end method

.method private v()V
    .locals 9

    .prologue
    .line 676
    new-instance v7, Lcom/nineoldandroids/a/c;

    invoke-direct {v7}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 677
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 678
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 679
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v3

    .line 681
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 682
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/ui/result/card/view/CardView;

    .line 683
    const-wide/16 v4, 0x12c

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;Landroid/view/animation/Interpolator;IJI)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 685
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 681
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 691
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x64

    int-to-long v4, v6

    mul-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 693
    invoke-virtual {v7, v8}, Lcom/nineoldandroids/a/c;->a(Ljava/util/Collection;)V

    .line 694
    new-instance v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-virtual {v7, v0}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 707
    invoke-virtual {v7}, Lcom/nineoldandroids/a/c;->a()V

    .line 708
    return-void
.end method

.method private w()V
    .locals 3

    .prologue
    .line 714
    const/4 v0, 0x0

    .line 715
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->e()I

    move-result v1

    add-int/2addr v0, v1

    .line 716
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/card/view/CardView;

    .line 717
    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/card/view/CardView;->getHeight()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 718
    goto :goto_0

    .line 719
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v1

    .line 724
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->b()I

    move-result v1

    if-le v1, v0, :cond_1

    .line 725
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->v:Landroid/view/View;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/ui/result/view/a;->b()I

    move-result v2

    sub-int v0, v2, v0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;I)V

    .line 728
    :cond_1
    return-void
.end method


# virtual methods
.method protected a(Landroid/os/Message;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1f4

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 125
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 127
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    goto :goto_0

    .line 131
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a()V

    goto :goto_0

    .line 134
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v0

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v2

    add-int/2addr v2, v0

    const-wide/16 v4, 0x12c

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/nineoldandroids/a/b;

    invoke-virtual {v1, v2, v4, v5, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a(IJLcom/nineoldandroids/a/b;)V

    goto :goto_0

    .line 139
    :pswitch_3
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->w()V

    goto :goto_0

    .line 142
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->x:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/ui/result/view/BaseResultFragment$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$1;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-static {v4, v5, v0, v1}, Lcom/qihoo/security/ui/main/a;->b(JLandroid/view/View;Lcom/nineoldandroids/a/b;)V

    goto :goto_0

    .line 155
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->x:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v4, v5, v0, v1}, Lcom/qihoo/security/ui/main/a;->a(JLandroid/view/View;Lcom/nineoldandroids/a/b;)V

    goto :goto_0

    .line 125
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 289
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 290
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 291
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 292
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/b;)V
    .locals 2

    .prologue
    .line 420
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 421
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 422
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 423
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessage(Landroid/os/Message;)Z

    .line 424
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/result/card/a;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 508
    if-nez p1, :cond_1

    .line 562
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 511
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    iget v0, p1, Lcom/qihoo/security/ui/result/card/a;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_1
    goto :goto_0

    .line 526
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 527
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/a;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 530
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 531
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/a;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 538
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_SWITCH_TAB:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 539
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/a;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 542
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/ui/a;->a(Landroid/content/Context;)V

    .line 543
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 544
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f040006

    const v2, 0x7f040008

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->overridePendingTransition(II)V

    .line 546
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_game_booster_card_clicked"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 547
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 548
    invoke-static {}, Lcom/qihoo/security/gamebooster/d;->b()V

    goto :goto_0

    .line 517
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_5
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/result/view/ResultScrollView;IIII)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x5

    .line 435
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v1

    mul-int/2addr v1, p3

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v2

    div-int/2addr v1, v2

    int-to-float v1, v1

    .line 437
    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v1, v2

    if-lez v2, :cond_0

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v1

    int-to-float v1, v1

    .line 442
    :cond_0
    if-nez p3, :cond_2

    .line 443
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 444
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 446
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v4, 0x12c

    invoke-virtual {v2, v3, v4, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 447
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->bringToFront()V

    .line 452
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s:Landroid/view/ViewGroup;

    neg-float v3, v1

    invoke-static {v2, v3}, Lcom/nineoldandroids/b/a;->e(Landroid/view/View;F)V

    .line 453
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r:Landroid/view/View;

    neg-float v3, v1

    invoke-static {v2, v3}, Lcom/nineoldandroids/b/a;->e(Landroid/view/View;F)V

    .line 454
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->m:Landroid/view/View;

    invoke-static {v2, v1}, Lcom/nineoldandroids/b/a;->e(Landroid/view/View;F)V

    .line 456
    const/high16 v1, 0x3f800000    # 1.0f

    int-to-float v2, p3

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/ui/result/view/a;->c()I

    move-result v3

    invoke-static {}, Lcom/qihoo/security/ui/result/view/a;->a()Lcom/qihoo/security/ui/result/view/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/ui/result/view/a;->d()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    .line 460
    cmpg-float v2, v1, v0

    if-gez v2, :cond_3

    .line 464
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 465
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/nineoldandroids/b/a;->b(Landroid/view/View;F)V

    .line 466
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-static {v1, v0}, Lcom/nineoldandroids/b/a;->c(Landroid/view/View;F)V

    .line 468
    return-void

    .line 449
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v4, 0x6

    invoke-virtual {v3, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessage(Landroid/os/Message;)Z

    .line 450
    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->bringToFront()V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 460
    goto :goto_1
.end method

.method protected b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 576
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    new-instance v2, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;

    invoke-direct {v2, p0, p1, p2}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    invoke-virtual {p1, v0}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x12c

    :goto_0
    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 584
    return-void

    .line 576
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract d()V
.end method

.method protected abstract l()I
.end method

.method protected abstract m()V
.end method

.method protected abstract n()V
.end method

.method protected o()V
    .locals 4

    .prologue
    .line 406
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 409
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 296
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 297
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 298
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->A:Z

    .line 299
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 169
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onAttach(Landroid/app/Activity;)V

    .line 170
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 472
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    :goto_0
    return-void

    .line 475
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 477
    :sswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(I)V

    .line 478
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->p()I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->a(I)V

    .line 479
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b()V

    goto :goto_0

    .line 482
    :sswitch_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(I)V

    .line 483
    sget-object v0, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    goto :goto_0

    .line 475
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0b009f -> :sswitch_0
        0x7f0b00f6 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 174
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onCreate(Landroid/os/Bundle;)V

    .line 175
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const v5, 0x7f03008a

    const v2, 0x7f030030

    const/4 v4, 0x0

    .line 179
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v1

    .line 180
    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_0

    .line 185
    new-instance v0, Lcom/qihoo/security/ui/b/a$f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    invoke-virtual {p1, v2, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    iget-object v2, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 189
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v3, 0x7f0b009d

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v3, 0x7f0b009f

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    .line 191
    invoke-virtual {v1, v5}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    .line 192
    if-eqz v0, :cond_1

    .line 196
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setTopView(Landroid/view/View;)V

    .line 200
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    new-instance v1, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setButtonAnimatorListener(Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;)V

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/view/ResultScrollView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->setScrollViewListener(Lcom/qihoo/security/ui/result/view/ResultScrollView$a;)V

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->m:Landroid/view/View;

    .line 227
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->u:Landroid/view/View;

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->v:Landroid/view/View;

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->w:Landroid/view/View;

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b01c8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->n:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b01c9

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->o:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 234
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->x:Landroid/view/View;

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0195

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->p:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0194

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f080056

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->s:Landroid/view/ViewGroup;

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00a7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r:Landroid/view/View;

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->E:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00f6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setEnabled(Z)V

    .line 261
    return-object v2

    .line 198
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->k:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v1, v5, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setTopView(Landroid/view/View;)V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 6

    .prologue
    const/4 v5, 0x5

    const/4 v4, 0x4

    const/4 v3, 0x3

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 372
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onDestroy()V

    .line 373
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 379
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 380
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 382
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 383
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 385
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 386
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 388
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 389
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 391
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    if-eqz v0, :cond_8

    .line 392
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 393
    if-eqz v0, :cond_6

    iget-object v2, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v2, :cond_6

    .line 394
    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    goto :goto_0

    .line 397
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 398
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->z:Ljava/util/List;

    .line 400
    :cond_8
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 357
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onResume()V

    .line 359
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    new-instance v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment$4;-><init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/nineoldandroids/a/b;)V

    .line 368
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 756
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onStop()V

    .line 757
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->A:Z

    .line 758
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 266
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 268
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 270
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->q()V

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a:Landroid/view/View;

    const-wide/16 v2, 0x12c

    const/4 v1, 0x0

    invoke-static {v0, v2, v3, v1}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;JLcom/nineoldandroids/a/b;)V

    .line 273
    return-void
.end method

.method protected p()I
    .locals 1

    .prologue
    .line 565
    const/4 v0, -0x1

    return v0
.end method
