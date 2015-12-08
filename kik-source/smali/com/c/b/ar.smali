.class final Lcom/c/b/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ar$1;,
        Lcom/c/b/ar$a;
    }
.end annotation


# static fields
.field private static final d:Lcom/c/b/ar;


# instance fields
.field private final a:Lcom/c/b/bq;

.field private b:Z

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 102
    new-instance v0, Lcom/c/b/ar;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/c/b/ar;-><init>(B)V

    sput-object v0, Lcom/c/b/ar;->d:Lcom/c/b/ar;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/ar;->c:Z

    .line 77
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/c/b/bq;->a(I)Lcom/c/b/bq;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    .line 78
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-boolean v0, p0, Lcom/c/b/ar;->c:Z

    .line 85
    invoke-static {v0}, Lcom/c/b/bq;->a(I)Lcom/c/b/bq;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    .line 86
    invoke-virtual {p0}, Lcom/c/b/ar;->c()V

    .line 87
    return-void
.end method

.method private static a(Lcom/c/b/cd$a;ILjava/lang/Object;)I
    .locals 2

    .prologue
    .line 791
    invoke-static {p1}, Lcom/c/b/h;->j(I)I

    move-result v0

    .line 792
    sget-object v1, Lcom/c/b/cd$a;->j:Lcom/c/b/cd$a;

    if-ne p0, v1, :cond_0

    .line 795
    mul-int/lit8 v0, v0, 0x2

    .line 797
    :cond_0
    invoke-static {p0, p2}, Lcom/c/b/ar;->b(Lcom/c/b/cd$a;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method static a(Lcom/c/b/cd$a;Z)I
    .locals 1

    .prologue
    .line 469
    if-eqz p1, :cond_0

    .line 470
    const/4 v0, 0x2

    .line 472
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/c/b/cd$a;->b()I

    move-result v0

    goto :goto_0
.end method

.method public static a()Lcom/c/b/ar;
    .locals 1

    .prologue
    .line 92
    new-instance v0, Lcom/c/b/ar;

    invoke-direct {v0}, Lcom/c/b/ar;-><init>()V

    return-object v0
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 491
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    .line 492
    check-cast p0, [B

    .line 493
    array-length v0, p0

    new-array v0, v0, [B

    .line 494
    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v0

    .line 497
    :cond_0
    return-object p0
.end method

.method public static a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V
    .locals 4

    .prologue
    .line 696
    invoke-interface {p0}, Lcom/c/b/ar$a;->j()Lcom/c/b/cd$a;

    move-result-object v1

    .line 697
    invoke-interface {p0}, Lcom/c/b/ar$a;->e()I

    move-result v0

    .line 698
    invoke-interface {p0}, Lcom/c/b/ar$a;->o()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 699
    check-cast p1, Ljava/util/List;

    .line 700
    invoke-interface {p0}, Lcom/c/b/ar$a;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 701
    const/4 v2, 0x2

    invoke-virtual {p2, v0, v2}, Lcom/c/b/h;->g(II)V

    .line 703
    const/4 v0, 0x0

    .line 704
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 705
    invoke-static {v1, v3}, Lcom/c/b/ar;->b(Lcom/c/b/cd$a;Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v0, v3

    .line 706
    goto :goto_0

    .line 707
    :cond_0
    invoke-virtual {p2, v0}, Lcom/c/b/h;->k(I)V

    .line 709
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 710
    invoke-static {p2, v1, v2}, Lcom/c/b/ar;->a(Lcom/c/b/h;Lcom/c/b/cd$a;Ljava/lang/Object;)V

    goto :goto_1

    .line 713
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 714
    invoke-static {p2, v1, v0, v3}, Lcom/c/b/ar;->a(Lcom/c/b/h;Lcom/c/b/cd$a;ILjava/lang/Object;)V

    goto :goto_2

    .line 718
    :cond_2
    instance-of v2, p1, Lcom/c/b/aw;

    if-eqz v2, :cond_4

    .line 719
    check-cast p1, Lcom/c/b/aw;

    invoke-virtual {p1}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v2

    invoke-static {p2, v1, v0, v2}, Lcom/c/b/ar;->a(Lcom/c/b/h;Lcom/c/b/cd$a;ILjava/lang/Object;)V

    .line 724
    :cond_3
    :goto_3
    return-void

    .line 721
    :cond_4
    invoke-static {p2, v1, v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/h;Lcom/c/b/cd$a;ILjava/lang/Object;)V

    goto :goto_3
.end method

.method private static a(Lcom/c/b/cd$a;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 368
    if-nez p1, :cond_0

    .line 369
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 373
    :cond_0
    sget-object v2, Lcom/c/b/ar$1;->a:[I

    invoke-virtual {p0}, Lcom/c/b/cd$a;->a()Lcom/c/b/cd$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/cd$b;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 395
    :cond_1
    :goto_0
    if-nez v0, :cond_5

    .line 403
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong object type used with protocol message reflection."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 374
    :pswitch_0
    instance-of v0, p1, Ljava/lang/Integer;

    goto :goto_0

    .line 375
    :pswitch_1
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_0

    .line 376
    :pswitch_2
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_0

    .line 377
    :pswitch_3
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_0

    .line 378
    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_0

    .line 379
    :pswitch_5
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_0

    .line 381
    :pswitch_6
    instance-of v2, p1, Lcom/c/b/f;

    if-nez v2, :cond_2

    instance-of v2, p1, [B

    if-eqz v2, :cond_1

    :cond_2
    move v0, v1

    goto :goto_0

    .line 385
    :pswitch_7
    instance-of v2, p1, Ljava/lang/Integer;

    if-nez v2, :cond_3

    instance-of v2, p1, Lcom/c/b/au$a;

    if-eqz v2, :cond_1

    :cond_3
    move v0, v1

    goto :goto_0

    .line 390
    :pswitch_8
    instance-of v2, p1, Lcom/c/b/be;

    if-nez v2, :cond_4

    instance-of v2, p1, Lcom/c/b/aw;

    if-eqz v2, :cond_1

    :cond_4
    move v0, v1

    goto :goto_0

    .line 406
    :cond_5
    return-void

    .line 373
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private static a(Lcom/c/b/h;Lcom/c/b/cd$a;ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 628
    sget-object v0, Lcom/c/b/cd$a;->j:Lcom/c/b/cd$a;

    if-ne p1, v0, :cond_0

    .line 629
    check-cast p3, Lcom/c/b/be;

    invoke-virtual {p0, p2, p3}, Lcom/c/b/h;->a(ILcom/c/b/be;)V

    .line 634
    :goto_0
    return-void

    .line 631
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Z)I

    move-result v0

    invoke-virtual {p0, p2, v0}, Lcom/c/b/h;->g(II)V

    .line 632
    invoke-static {p0, p1, p3}, Lcom/c/b/ar;->a(Lcom/c/b/h;Lcom/c/b/cd$a;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private static a(Lcom/c/b/h;Lcom/c/b/cd$a;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 650
    sget-object v0, Lcom/c/b/ar$1;->b:[I

    invoke-virtual {p1}, Lcom/c/b/cd$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 689
    :goto_0
    return-void

    .line 651
    :pswitch_0
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->a(D)V

    goto :goto_0

    .line 652
    :pswitch_1
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->m(I)V

    goto :goto_0

    .line 653
    :pswitch_2
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->b(J)V

    goto :goto_0

    .line 654
    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->a(J)V

    goto :goto_0

    .line 655
    :pswitch_4
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->b(I)V

    goto :goto_0

    .line 656
    :pswitch_5
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->c(J)V

    goto :goto_0

    .line 657
    :pswitch_6
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->c(I)V

    goto :goto_0

    .line 658
    :pswitch_7
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->a(Z)V

    goto :goto_0

    .line 659
    :pswitch_8
    check-cast p2, Lcom/c/b/be;

    invoke-interface {p2, p0}, Lcom/c/b/be;->a(Lcom/c/b/h;)V

    goto :goto_0

    .line 660
    :pswitch_9
    check-cast p2, Lcom/c/b/be;

    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Lcom/c/b/be;)V

    goto :goto_0

    .line 662
    :pswitch_a
    instance-of v0, p2, Lcom/c/b/f;

    if-eqz v0, :cond_0

    .line 663
    check-cast p2, Lcom/c/b/f;

    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Lcom/c/b/f;)V

    goto :goto_0

    .line 665
    :cond_0
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 669
    :pswitch_b
    instance-of v0, p2, Lcom/c/b/f;

    if-eqz v0, :cond_1

    .line 670
    check-cast p2, Lcom/c/b/f;

    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Lcom/c/b/f;)V

    goto :goto_0

    .line 672
    :cond_1
    check-cast p2, [B

    array-length v0, p2

    invoke-virtual {p0, v0}, Lcom/c/b/h;->k(I)V

    invoke-virtual {p0, p2}, Lcom/c/b/h;->b([B)V

    goto/16 :goto_0

    .line 675
    :pswitch_c
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->d(I)V

    goto/16 :goto_0

    .line 676
    :pswitch_d
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->f(I)V

    goto/16 :goto_0

    .line 677
    :pswitch_e
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->d(J)V

    goto/16 :goto_0

    .line 678
    :pswitch_f
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->n(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->k(I)V

    goto/16 :goto_0

    .line 679
    :pswitch_10
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/h;->g(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->e(J)V

    goto/16 :goto_0

    .line 682
    :pswitch_11
    instance-of v0, p2, Lcom/c/b/au$a;

    if-eqz v0, :cond_2

    .line 683
    check-cast p2, Lcom/c/b/au$a;

    invoke-interface {p2}, Lcom/c/b/au$a;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->e(I)V

    goto/16 :goto_0

    .line 685
    :cond_2
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->e(I)V

    goto/16 :goto_0

    .line 650
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method

.method private static a(Ljava/util/Map$Entry;Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 597
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 598
    invoke-interface {v0}, Lcom/c/b/ar$a;->g()Lcom/c/b/cd$b;

    move-result-object v1

    sget-object v2, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Lcom/c/b/ar$a;->o()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/c/b/ar$a;->p()Z

    move-result v1

    if-nez v1, :cond_0

    .line 600
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 601
    instance-of v1, v0, Lcom/c/b/aw;

    if-eqz v1, :cond_1

    .line 602
    check-cast v0, Lcom/c/b/aw;

    invoke-virtual {v0}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v1

    .line 604
    :goto_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    invoke-interface {v0}, Lcom/c/b/ar$a;->e()I

    move-result v2

    move-object v0, v1

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->c(ILcom/c/b/be;)V

    .line 609
    :goto_1
    return-void

    .line 607
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method private static a(Ljava/util/Map;Ljava/util/Map$Entry;)V
    .locals 3

    .prologue
    .line 182
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 183
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 184
    instance-of v2, v1, Lcom/c/b/aw;

    if-eqz v2, :cond_0

    .line 185
    check-cast v1, Lcom/c/b/aw;

    invoke-virtual {v1}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    :goto_0
    return-void

    .line 187
    :cond_0
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private static a(Ljava/util/Map$Entry;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 435
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 436
    invoke-interface {v0}, Lcom/c/b/ar$a;->g()Lcom/c/b/cd$b;

    move-result-object v3

    sget-object v4, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    if-ne v3, v4, :cond_4

    .line 437
    invoke-interface {v0}, Lcom/c/b/ar$a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 439
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    .line 440
    invoke-interface {v0}, Lcom/c/b/be;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 458
    :goto_0
    return v0

    .line 445
    :cond_1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 446
    instance-of v3, v0, Lcom/c/b/be;

    if-eqz v3, :cond_2

    .line 447
    check-cast v0, Lcom/c/b/be;

    invoke-interface {v0}, Lcom/c/b/be;->a()Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    .line 448
    goto :goto_0

    .line 450
    :cond_2
    instance-of v0, v0, Lcom/c/b/aw;

    if-eqz v0, :cond_3

    move v0, v2

    .line 451
    goto :goto_0

    .line 453
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong object type used with protocol message reflection."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move v0, v2

    .line 458
    goto :goto_0
.end method

.method private static b(Lcom/c/b/cd$a;Ljava/lang/Object;)I
    .locals 4

    .prologue
    const/16 v0, 0x8

    const/4 v1, 0x4

    .line 812
    sget-object v2, Lcom/c/b/ar$1;->b:[I

    invoke-virtual {p0}, Lcom/c/b/cd$a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 858
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 815
    :pswitch_0
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 854
    :goto_0
    return v0

    .line 816
    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move v0, v1

    goto :goto_0

    .line 817
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/h;->f(J)I

    move-result v0

    goto :goto_0

    .line 818
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/h;->f(J)I

    move-result v0

    goto :goto_0

    .line 819
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->i(I)I

    move-result v0

    goto :goto_0

    .line 820
    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    goto :goto_0

    .line 821
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move v0, v1

    goto :goto_0

    .line 822
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    const/4 v0, 0x1

    goto :goto_0

    .line 823
    :pswitch_8
    check-cast p1, Lcom/c/b/be;

    invoke-interface {p1}, Lcom/c/b/be;->b()I

    move-result v0

    goto :goto_0

    .line 825
    :pswitch_9
    instance-of v0, p1, Lcom/c/b/f;

    if-eqz v0, :cond_0

    .line 826
    check-cast p1, Lcom/c/b/f;

    invoke-static {p1}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v0

    goto :goto_0

    .line 828
    :cond_0
    check-cast p1, [B

    array-length v0, p1

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    array-length v1, p1

    add-int/2addr v0, v1

    goto :goto_0

    .line 831
    :pswitch_a
    instance-of v0, p1, Lcom/c/b/f;

    if-eqz v0, :cond_1

    .line 832
    check-cast p1, Lcom/c/b/f;

    invoke-static {p1}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v0

    goto :goto_0

    .line 834
    :cond_1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/c/b/h;->b(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 836
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    goto :goto_0

    .line 837
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move v0, v1

    goto :goto_0

    .line 838
    :pswitch_d
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    goto/16 :goto_0

    .line 839
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->n(I)I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    goto/16 :goto_0

    .line 840
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/h;->g(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/c/b/h;->f(J)I

    move-result v0

    goto/16 :goto_0

    .line 843
    :pswitch_10
    instance-of v0, p1, Lcom/c/b/aw;

    if-eqz v0, :cond_2

    .line 844
    check-cast p1, Lcom/c/b/aw;

    invoke-static {p1}, Lcom/c/b/h;->a(Lcom/c/b/ax;)I

    move-result v0

    goto/16 :goto_0

    .line 846
    :cond_2
    check-cast p1, Lcom/c/b/be;

    invoke-static {p1}, Lcom/c/b/h;->b(Lcom/c/b/be;)I

    move-result v0

    goto/16 :goto_0

    .line 850
    :pswitch_11
    instance-of v0, p1, Lcom/c/b/au$a;

    if-eqz v0, :cond_3

    .line 851
    check-cast p1, Lcom/c/b/au$a;

    invoke-interface {p1}, Lcom/c/b/au$a;->a()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->i(I)I

    move-result v0

    goto/16 :goto_0

    .line 854
    :cond_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->i(I)I

    move-result v0

    goto/16 :goto_0

    .line 812
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_10
        :pswitch_a
        :pswitch_9
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_11
    .end packed-switch
.end method

.method public static b()Lcom/c/b/ar;
    .locals 1

    .prologue
    .line 99
    sget-object v0, Lcom/c/b/ar;->d:Lcom/c/b/ar;

    return-object v0
.end method

.method private b(Ljava/util/Map$Entry;)V
    .locals 5

    .prologue
    .line 504
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 505
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 506
    instance-of v2, v1, Lcom/c/b/aw;

    if-eqz v2, :cond_0

    .line 507
    check-cast v1, Lcom/c/b/aw;

    invoke-virtual {v1}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v1

    .line 510
    :cond_0
    invoke-interface {v0}, Lcom/c/b/ar$a;->o()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 511
    invoke-virtual {p0, v0}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v2

    .line 512
    if-nez v2, :cond_1

    .line 513
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 515
    :cond_1
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v1, v2

    .line 516
    check-cast v1, Ljava/util/List;

    invoke-static {v4}, Lcom/c/b/ar;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 518
    :cond_2
    iget-object v1, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1, v0, v2}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    :goto_1
    return-void

    .line 519
    :cond_3
    invoke-interface {v0}, Lcom/c/b/ar$a;->g()Lcom/c/b/cd$b;

    move-result-object v2

    sget-object v3, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    if-ne v2, v3, :cond_5

    .line 520
    invoke-virtual {p0, v0}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v2

    .line 521
    if-nez v2, :cond_4

    .line 522
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-static {v1}, Lcom/c/b/ar;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 525
    :cond_4
    check-cast v2, Lcom/c/b/be;

    invoke-interface {v2}, Lcom/c/b/be;->v()Lcom/c/b/be$a;

    move-result-object v2

    check-cast v1, Lcom/c/b/be;

    invoke-interface {v0, v2, v1}, Lcom/c/b/ar$a;->a(Lcom/c/b/be$a;Lcom/c/b/be;)Lcom/c/b/be$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/c/b/be$a;->j()Lcom/c/b/be;

    move-result-object v1

    .line 529
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2, v0, v1}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 532
    :cond_5
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-static {v1}, Lcom/c/b/ar;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public static c(Lcom/c/b/ar$a;Ljava/lang/Object;)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 867
    invoke-interface {p0}, Lcom/c/b/ar$a;->j()Lcom/c/b/cd$a;

    move-result-object v1

    .line 868
    invoke-interface {p0}, Lcom/c/b/ar$a;->e()I

    move-result v2

    .line 869
    invoke-interface {p0}, Lcom/c/b/ar$a;->o()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 870
    invoke-interface {p0}, Lcom/c/b/ar$a;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 872
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 873
    invoke-static {v1, v4}, Lcom/c/b/ar;->b(Lcom/c/b/cd$a;Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    .line 874
    goto :goto_0

    .line 875
    :cond_0
    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    add-int/2addr v0, v1

    .line 886
    :cond_1
    :goto_1
    return v0

    .line 880
    :cond_2
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 881
    invoke-static {v1, v2, v4}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;ILjava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    .line 882
    goto :goto_2

    .line 886
    :cond_3
    invoke-static {v1, v2, p1}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;ILjava/lang/Object;)I

    move-result v0

    goto :goto_1
.end method

.method private static c(Ljava/util/Map$Entry;)I
    .locals 4

    .prologue
    .line 761
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 762
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 763
    invoke-interface {v0}, Lcom/c/b/ar$a;->g()Lcom/c/b/cd$b;

    move-result-object v2

    sget-object v3, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    if-ne v2, v3, :cond_1

    invoke-interface {v0}, Lcom/c/b/ar$a;->o()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Lcom/c/b/ar$a;->p()Z

    move-result v2

    if-nez v2, :cond_1

    .line 765
    instance-of v0, v1, Lcom/c/b/aw;

    if-eqz v0, :cond_0

    .line 766
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    invoke-interface {v0}, Lcom/c/b/ar$a;->e()I

    move-result v2

    move-object v0, v1

    check-cast v0, Lcom/c/b/aw;

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/c/b/h;->j(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    const/4 v3, 0x2

    invoke-static {v3, v2}, Lcom/c/b/h;->e(II)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x3

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    invoke-static {v0}, Lcom/c/b/h;->a(Lcom/c/b/ax;)I

    move-result v0

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    .line 773
    :goto_0
    return v0

    .line 769
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    invoke-interface {v0}, Lcom/c/b/ar$a;->e()I

    move-result v0

    check-cast v1, Lcom/c/b/be;

    invoke-static {v0, v1}, Lcom/c/b/h;->e(ILcom/c/b/be;)I

    move-result v0

    goto :goto_0

    .line 773
    :cond_1
    invoke-static {v0, v1}, Lcom/c/b/ar;->c(Lcom/c/b/ar$a;Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/c/b/ar$a;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 238
    invoke-interface {p1}, Lcom/c/b/ar$a;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 239
    instance-of v0, p2, Ljava/util/List;

    if-nez v0, :cond_0

    .line 240
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong object type used with protocol message reflection."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 247
    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 248
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 249
    invoke-interface {p1}, Lcom/c/b/ar$a;->j()Lcom/c/b/cd$a;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object p2, v0

    .line 256
    :goto_1
    instance-of v0, p2, Lcom/c/b/aw;

    if-eqz v0, :cond_2

    .line 257
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/ar;->c:Z

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, p1, p2}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    return-void

    .line 253
    :cond_3
    invoke-interface {p1}, Lcom/c/b/ar$a;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final a(Lcom/c/b/ar;)V
    .locals 2

    .prologue
    .line 481
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1}, Lcom/c/b/bq;->c()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 482
    iget-object v1, p1, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1, v0}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/c/b/ar;->b(Ljava/util/Map$Entry;)V

    .line 481
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 485
    :cond_0
    iget-object v0, p1, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 486
    invoke-direct {p0, v0}, Lcom/c/b/ar;->b(Ljava/util/Map$Entry;)V

    goto :goto_1

    .line 488
    :cond_1
    return-void
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 569
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->c()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 570
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, v1}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v2

    .line 572
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V

    .line 569
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 575
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 576
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ar$a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V

    goto :goto_1

    .line 578
    :cond_1
    return-void
.end method

.method public final a(Lcom/c/b/ar$a;)Z
    .locals 2

    .prologue
    .line 209
    invoke-interface {p1}, Lcom/c/b/ar$a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hasField() can only be called on non-repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 214
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, p1}, Lcom/c/b/bq;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lcom/c/b/ar$a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 224
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, p1}, Lcom/c/b/bq;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 225
    instance-of v1, v0, Lcom/c/b/aw;

    if-eqz v1, :cond_0

    .line 226
    check-cast v0, Lcom/c/b/aw;

    invoke-virtual {v0}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v0

    .line 228
    :cond_0
    return-object v0
.end method

.method public final b(Lcom/c/b/ar$a;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 340
    invoke-interface {p1}, Lcom/c/b/ar$a;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "addRepeatedField() can only be called on repeated fields."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 345
    :cond_0
    invoke-interface {p1}, Lcom/c/b/ar$a;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Ljava/lang/Object;)V

    .line 347
    invoke-virtual {p0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v0

    .line 349
    if-nez v0, :cond_1

    .line 350
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 351
    iget-object v1, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1, p1, v0}, Lcom/c/b/bq;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    return-void

    .line 353
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_0
.end method

.method public final b(Lcom/c/b/h;)V
    .locals 2

    .prologue
    .line 585
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1}, Lcom/c/b/bq;->c()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 586
    iget-object v1, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1, v0}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/c/b/ar;->a(Ljava/util/Map$Entry;Lcom/c/b/h;)V

    .line 585
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 590
    invoke-static {v0, p1}, Lcom/c/b/ar;->a(Ljava/util/Map$Entry;Lcom/c/b/h;)V

    goto :goto_1

    .line 592
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 107
    iget-boolean v0, p0, Lcom/c/b/ar;->b:Z

    if-eqz v0, :cond_0

    .line 112
    :goto_0
    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->a()V

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/ar;->b:Z

    goto :goto_0
.end method

.method public final c(Lcom/c/b/ar$a;)V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, p1}, Lcom/c/b/bq;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/ar;->c:Z

    .line 271
    :cond_0
    return-void
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/c/b/ar;->e()Lcom/c/b/ar;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 121
    iget-boolean v0, p0, Lcom/c/b/ar;->b:Z

    return v0
.end method

.method public final e()Lcom/c/b/ar;
    .locals 4

    .prologue
    .line 134
    new-instance v2, Lcom/c/b/ar;

    invoke-direct {v2}, Lcom/c/b/ar;-><init>()V

    .line 135
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->c()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, v1}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v3

    .line 137
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    .line 138
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    .line 135
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 142
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ar$a;

    .line 143
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    goto :goto_1

    .line 145
    :cond_1
    iget-boolean v0, p0, Lcom/c/b/ar;->c:Z

    iput-boolean v0, v2, Lcom/c/b/ar;->c:Z

    .line 146
    return-object v2
.end method

.method public final f()Ljava/util/Map;
    .locals 3

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/c/b/ar;->c:Z

    if-eqz v0, :cond_3

    .line 163
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/c/b/bq;->a(I)Lcom/c/b/bq;

    move-result-object v1

    .line 165
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2}, Lcom/c/b/bq;->c()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 166
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2, v0}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/ar;->a(Ljava/util/Map;Ljava/util/Map$Entry;)V

    .line 165
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 170
    invoke-static {v1, v0}, Lcom/c/b/ar;->a(Ljava/util/Map;Ljava/util/Map$Entry;)V

    goto :goto_1

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    invoke-virtual {v1}, Lcom/c/b/bq;->a()V

    :cond_2
    move-object v0, v1

    .line 177
    :goto_2
    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    goto :goto_2
.end method

.method public final g()Ljava/util/Iterator;
    .locals 2

    .prologue
    .line 197
    iget-boolean v0, p0, Lcom/c/b/ar;->c:Z

    if-eqz v0, :cond_0

    .line 198
    new-instance v0, Lcom/c/b/aw$b;

    iget-object v1, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v1}, Lcom/c/b/bq;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/c/b/aw$b;-><init>(Ljava/util/Iterator;)V

    .line 201
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method

.method public final h()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 418
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2}, Lcom/c/b/bq;->c()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 419
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2, v0}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/c/b/ar;->a(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 429
    :goto_1
    return v1

    .line 418
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 424
    :cond_1
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 425
    invoke-static {v0}, Lcom/c/b/ar;->a(Ljava/util/Map$Entry;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 429
    :cond_3
    const/4 v1, 0x1

    goto :goto_1
.end method

.method public final i()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 731
    move v1, v0

    move v2, v0

    .line 732
    :goto_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->c()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 733
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0, v1}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v3

    .line 735
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ar$a;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/c/b/ar;->c(Lcom/c/b/ar$a;Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 732
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 738
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 739
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ar$a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/c/b/ar;->c(Lcom/c/b/ar$a;Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    .line 740
    goto :goto_1

    .line 741
    :cond_1
    return v2
.end method

.method public final j()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 748
    move v1, v0

    .line 749
    :goto_0
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2}, Lcom/c/b/bq;->c()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 750
    iget-object v2, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v2, v0}, Lcom/c/b/bq;->b(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/c/b/ar;->c(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    .line 749
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 753
    :cond_0
    iget-object v0, p0, Lcom/c/b/ar;->a:Lcom/c/b/bq;

    invoke-virtual {v0}, Lcom/c/b/bq;->d()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 754
    invoke-static {v0}, Lcom/c/b/ar;->c(Ljava/util/Map$Entry;)I

    move-result v0

    add-int/2addr v1, v0

    .line 755
    goto :goto_1

    .line 756
    :cond_1
    return v1
.end method
