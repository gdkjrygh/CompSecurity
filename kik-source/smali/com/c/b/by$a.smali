.class public final Lcom/c/b/by$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/be$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/by;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/Map;

.field private b:I

.field private c:Lcom/c/b/by$b$a;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(I)Lcom/c/b/by$b$a;
    .locals 2

    .prologue
    .line 304
    iget-object v0, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    if-eqz v0, :cond_1

    .line 305
    iget v0, p0, Lcom/c/b/by$a;->b:I

    if-ne p1, v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    .line 320
    :goto_0
    return-object v0

    .line 309
    :cond_0
    iget v0, p0, Lcom/c/b/by$a;->b:I

    iget-object v1, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    invoke-virtual {v1}, Lcom/c/b/by$b$a;->a()Lcom/c/b/by$b;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/c/b/by$a;->b(ILcom/c/b/by$b;)Lcom/c/b/by$a;

    .line 311
    :cond_1
    if-nez p1, :cond_2

    .line 312
    const/4 v0, 0x0

    goto :goto_0

    .line 314
    :cond_2
    iget-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/by$b;

    .line 315
    iput p1, p0, Lcom/c/b/by$a;->b:I

    .line 316
    invoke-static {}, Lcom/c/b/by$b;->a()Lcom/c/b/by$b$a;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    .line 317
    if-eqz v0, :cond_3

    .line 318
    iget-object v1, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    invoke-virtual {v1, v0}, Lcom/c/b/by$b$a;->a(Lcom/c/b/by$b;)Lcom/c/b/by$b$a;

    .line 320
    :cond_3
    iget-object v0, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    goto :goto_0
.end method

.method private b(ILcom/c/b/by$b;)Lcom/c/b/by$a;
    .locals 2

    .prologue
    .line 462
    if-nez p1, :cond_0

    .line 463
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/c/b/by$a;->b:I

    if-ne v0, p1, :cond_1

    .line 467
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    .line 468
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/by$a;->b:I

    .line 470
    :cond_1
    iget-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 471
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    .line 473
    :cond_2
    iget-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    return-object p0
.end method

.method static synthetic d()Lcom/c/b/by$a;
    .locals 2

    .prologue
    .line 281
    new-instance v0, Lcom/c/b/by$a;

    invoke-direct {v0}, Lcom/c/b/by$a;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    const/4 v1, 0x0

    iput v1, v0, Lcom/c/b/by$a;->b:I

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/c/b/by$a;->c:Lcom/c/b/by$b$a;

    return-object v0
.end method


# virtual methods
.method public final a(II)Lcom/c/b/by$a;
    .locals 4

    .prologue
    .line 427
    if-nez p1, :cond_0

    .line 428
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 430
    :cond_0
    invoke-direct {p0, p1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v0

    int-to-long v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/c/b/by$b$a;->a(J)Lcom/c/b/by$b$a;

    .line 431
    return-object p0
.end method

.method public final a(ILcom/c/b/by$b;)Lcom/c/b/by$a;
    .locals 2

    .prologue
    .line 407
    if-nez p1, :cond_0

    .line 408
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 410
    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/c/b/by$a;->b:I

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_4

    .line 411
    invoke-direct {p0, p1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/c/b/by$b$a;->a(Lcom/c/b/by$b;)Lcom/c/b/by$b$a;

    .line 418
    :goto_1
    return-object p0

    .line 410
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 416
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/c/b/by$a;->b(ILcom/c/b/by$b;)Lcom/c/b/by$a;

    goto :goto_1
.end method

.method public final a(Lcom/c/b/by;)Lcom/c/b/by$a;
    .locals 3

    .prologue
    .line 394
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 395
    invoke-static {p1}, Lcom/c/b/by;->b(Lcom/c/b/by;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 396
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/by$b;

    invoke-virtual {p0, v1, v0}, Lcom/c/b/by$a;->a(ILcom/c/b/by$b;)Lcom/c/b/by$a;

    goto :goto_0

    .line 399
    :cond_0
    return-object p0
.end method

.method public final a(Lcom/c/b/g;)Lcom/c/b/by$a;
    .locals 1

    .prologue
    .line 492
    :cond_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 493
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, p1}, Lcom/c/b/by$a;->a(ILcom/c/b/g;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 494
    :cond_1
    return-object p0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 665
    const/4 v0, 0x1

    return v0
.end method

.method public final a(ILcom/c/b/g;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 507
    invoke-static {p1}, Lcom/c/b/cd;->b(I)I

    move-result v1

    .line 508
    invoke-static {p1}, Lcom/c/b/cd;->a(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 530
    invoke-static {}, Lcom/c/b/av;->g()Lcom/c/b/av;

    move-result-object v0

    throw v0

    .line 510
    :pswitch_0
    invoke-direct {p0, v1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v1

    invoke-virtual {p2}, Lcom/c/b/g;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/c/b/by$b$a;->a(J)Lcom/c/b/by$b$a;

    .line 528
    :goto_0
    return v0

    .line 513
    :pswitch_1
    invoke-direct {p0, v1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v1

    invoke-virtual {p2}, Lcom/c/b/g;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/c/b/by$b$a;->b(J)Lcom/c/b/by$b$a;

    goto :goto_0

    .line 516
    :pswitch_2
    invoke-direct {p0, v1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v1

    invoke-virtual {p2}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/c/b/by$b$a;->a(Lcom/c/b/f;)Lcom/c/b/by$b$a;

    goto :goto_0

    .line 519
    :pswitch_3
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 520
    invoke-static {}, Lcom/c/b/ap;->b()Lcom/c/b/ap;

    move-result-object v3

    invoke-virtual {p2, v1, v2, v3}, Lcom/c/b/g;->a(ILcom/c/b/be$a;Lcom/c/b/aq;)V

    .line 522
    invoke-direct {p0, v1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v1

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/c/b/by$b$a;->a(Lcom/c/b/by;)Lcom/c/b/by$b$a;

    goto :goto_0

    .line 525
    :pswitch_4
    const/4 v0, 0x0

    goto :goto_0

    .line 527
    :pswitch_5
    invoke-direct {p0, v1}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    move-result-object v1

    invoke-virtual {p2}, Lcom/c/b/g;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/c/b/by$b$a;->a(I)Lcom/c/b/by$b$a;

    goto :goto_0

    .line 508
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final b()Lcom/c/b/by;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 333
    invoke-direct {p0, v2}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    .line 335
    iget-object v0, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    .line 340
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    .line 341
    return-object v0

    .line 338
    :cond_0
    new-instance v0, Lcom/c/b/by;

    iget-object v1, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/c/b/by;-><init>(Ljava/util/Map;B)V

    goto :goto_0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0, p1}, Lcom/c/b/by$a;->a(Lcom/c/b/g;)Lcom/c/b/by$a;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 346
    invoke-virtual {p0}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 281
    invoke-direct {p0, v3}, Lcom/c/b/by$a;->a(I)Lcom/c/b/by$b$a;

    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v0

    new-instance v1, Lcom/c/b/by;

    iget-object v2, p0, Lcom/c/b/by$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2, v3}, Lcom/c/b/by;-><init>(Ljava/util/Map;B)V

    invoke-virtual {v0, v1}, Lcom/c/b/by$a;->a(Lcom/c/b/by;)Lcom/c/b/by$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method
