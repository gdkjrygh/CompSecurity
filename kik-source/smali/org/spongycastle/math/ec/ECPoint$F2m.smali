.class public Lorg/spongycastle/math/ec/ECPoint$F2m;
.super Lorg/spongycastle/math/ec/ECPoint;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/math/ec/ECPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "F2m"
.end annotation


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V
    .locals 1

    .prologue
    .line 341
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    .line 342
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V
    .locals 2

    .prologue
    .line 352
    invoke-direct {p0, p1, p2, p3}, Lorg/spongycastle/math/ec/ECPoint;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 354
    if-eqz p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    if-nez p2, :cond_2

    if-eqz p3, :cond_2

    .line 356
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Exactly one of the field elements is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 359
    :cond_2
    if-eqz p2, :cond_3

    .line 362
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-static {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->a(Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 365
    if-eqz p1, :cond_3

    .line 367
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v1, v1, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-static {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->a(Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 371
    :cond_3
    iput-boolean p4, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->d:Z

    .line 372
    return-void
.end method

.method private static a(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/math/ec/ECPoint;)V
    .locals 2

    .prologue
    .line 435
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v1, p1, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 437
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only points on the same curve can be added or subtracted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 442
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 4

    .prologue
    .line 464
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 500
    :goto_0
    return-object v0

    .line 470
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 472
    goto :goto_0

    .line 475
    :cond_1
    iget-object v0, p1, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    check-cast v0, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 476
    iget-object v1, p1, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    check-cast v1, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 479
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 481
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 484
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->h()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    goto :goto_0

    .line 488
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    goto :goto_0

    .line 491
    :cond_3
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->d(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 494
    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v2, v2, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 497
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 500
    new-instance p1, Lorg/spongycastle/math/ec/ECPoint$F2m;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-boolean v3, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->d:Z

    invoke-direct {p1, v2, v0, v1, v3}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    move-object v0, p1

    goto :goto_0
.end method

.method public final a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 449
    invoke-static {p0, p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/math/ec/ECPoint;)V

    .line 450
    check-cast p1, Lorg/spongycastle/math/ec/ECPoint$F2m;

    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 1

    .prologue
    .line 523
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 529
    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->g()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    invoke-virtual {p0, v0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object p0

    goto :goto_0
.end method

.method public final b(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 508
    invoke-static {p0, p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/math/ec/ECPoint;)V

    .line 509
    check-cast p1, Lorg/spongycastle/math/ec/ECPoint$F2m;

    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->b(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    return-object v0
.end method

.method public final f()[B
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 379
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    new-array v0, v6, [B

    .line 422
    :goto_0
    return-object v0

    .line 384
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Lorg/spongycastle/math/ec/ECFieldElement;)I

    move-result v1

    .line 385
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v2

    .line 388
    iget-boolean v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->d:Z

    if-eqz v0, :cond_2

    .line 391
    add-int/lit8 v0, v1, 0x1

    new-array v0, v0, [B

    .line 393
    const/4 v3, 0x2

    aput-byte v3, v0, v5

    .line 399
    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    sget-object v4, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 401
    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v4, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v4}, Lorg/spongycastle/math/ec/ECFieldElement;->e()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 405
    const/4 v3, 0x3

    aput-byte v3, v0, v5

    .line 409
    :cond_1
    invoke-static {v2, v5, v0, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 413
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v3

    .line 415
    add-int v0, v1, v1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 417
    const/4 v4, 0x4

    aput-byte v4, v0, v5

    .line 418
    invoke-static {v2, v5, v0, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 419
    add-int/lit8 v2, v1, 0x1

    invoke-static {v3, v5, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public final g()Lorg/spongycastle/math/ec/ECPoint;
    .locals 5

    .prologue
    .line 567
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v4, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v3, v4}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    iget-boolean v4, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    return-object v0
.end method

.method public final h()Lorg/spongycastle/math/ec/ECPoint;
    .locals 5

    .prologue
    .line 537
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 562
    :goto_0
    return-object p0

    .line 543
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-nez v0, :cond_1

    .line 547
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0

    .line 550
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->d(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 553
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v2, v2, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 557
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ec/ECCurve;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    .line 558
    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/spongycastle/math/ec/ECFieldElement$F2m;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECFieldElement$F2m;

    .line 562
    new-instance v2, Lorg/spongycastle/math/ec/ECPoint$F2m;

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-boolean v4, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->d:Z

    invoke-direct {v2, v3, v1, v0, v4}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    move-object p0, v2

    goto :goto_0
.end method

.method final declared-synchronized i()V
    .locals 1

    .prologue
    .line 575
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->e:Lorg/spongycastle/math/ec/a;

    if-nez v0, :cond_0

    .line 577
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->a:Lorg/spongycastle/math/ec/ECCurve;

    check-cast v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    new-instance v0, Lorg/spongycastle/math/ec/i;

    invoke-direct {v0}, Lorg/spongycastle/math/ec/i;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->e:Lorg/spongycastle/math/ec/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 586
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 583
    :cond_1
    :try_start_1
    new-instance v0, Lorg/spongycastle/math/ec/g;

    invoke-direct {v0}, Lorg/spongycastle/math/ec/g;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$F2m;->e:Lorg/spongycastle/math/ec/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 575
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
