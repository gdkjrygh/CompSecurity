.class final Lorg/spongycastle/math/ec/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Lorg/spongycastle/math/ec/k;

.field public static final b:[[B

.field public static final c:[Lorg/spongycastle/math/ec/k;

.field public static final d:[[B

.field private static final e:Ljava/math/BigInteger;

.field private static final f:Ljava/math/BigInteger;

.field private static final g:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x0

    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 14
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    .line 15
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->h:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ec/f;->f:Ljava/math/BigInteger;

    .line 16
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->i:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ec/f;->g:Ljava/math/BigInteger;

    .line 39
    const/16 v0, 0x9

    new-array v0, v0, [Lorg/spongycastle/math/ec/k;

    aput-object v5, v0, v8

    new-instance v1, Lorg/spongycastle/math/ec/k;

    sget-object v2, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v1, v0, v6

    const/4 v1, 0x2

    aput-object v5, v0, v1

    new-instance v1, Lorg/spongycastle/math/ec/k;

    sget-object v2, Lorg/spongycastle/math/ec/f;->g:Ljava/math/BigInteger;

    sget-object v3, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v1, v0, v7

    aput-object v5, v0, v9

    const/4 v1, 0x5

    new-instance v2, Lorg/spongycastle/math/ec/k;

    sget-object v3, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v5, v0, v1

    const/4 v1, 0x7

    new-instance v2, Lorg/spongycastle/math/ec/k;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v2, v0, v1

    const/16 v1, 0x8

    aput-object v5, v0, v1

    sput-object v0, Lorg/spongycastle/math/ec/f;->a:[Lorg/spongycastle/math/ec/k;

    .line 51
    const/16 v0, 0x8

    new-array v0, v0, [[B

    aput-object v5, v0, v8

    new-array v1, v6, [B

    aput-byte v6, v1, v8

    aput-object v1, v0, v6

    const/4 v1, 0x2

    aput-object v5, v0, v1

    new-array v1, v7, [B

    fill-array-data v1, :array_0

    aput-object v1, v0, v7

    aput-object v5, v0, v9

    const/4 v1, 0x5

    new-array v2, v7, [B

    fill-array-data v2, :array_1

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v5, v0, v1

    const/4 v1, 0x7

    new-array v2, v9, [B

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    sput-object v0, Lorg/spongycastle/math/ec/f;->b:[[B

    .line 59
    const/16 v0, 0x9

    new-array v0, v0, [Lorg/spongycastle/math/ec/k;

    aput-object v5, v0, v8

    new-instance v1, Lorg/spongycastle/math/ec/k;

    sget-object v2, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v1, v0, v6

    const/4 v1, 0x2

    aput-object v5, v0, v1

    new-instance v1, Lorg/spongycastle/math/ec/k;

    sget-object v2, Lorg/spongycastle/math/ec/f;->g:Ljava/math/BigInteger;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v1, v0, v7

    aput-object v5, v0, v9

    const/4 v1, 0x5

    new-instance v2, Lorg/spongycastle/math/ec/k;

    sget-object v3, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v5, v0, v1

    const/4 v1, 0x7

    new-instance v2, Lorg/spongycastle/math/ec/k;

    sget-object v3, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    sget-object v4, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    aput-object v2, v0, v1

    const/16 v1, 0x8

    aput-object v5, v0, v1

    sput-object v0, Lorg/spongycastle/math/ec/f;->c:[Lorg/spongycastle/math/ec/k;

    .line 70
    const/16 v0, 0x8

    new-array v0, v0, [[B

    aput-object v5, v0, v8

    new-array v1, v6, [B

    aput-byte v6, v1, v8

    aput-object v1, v0, v6

    const/4 v1, 0x2

    aput-object v5, v0, v1

    new-array v1, v7, [B

    fill-array-data v1, :array_3

    aput-object v1, v0, v7

    aput-object v5, v0, v9

    const/4 v1, 0x5

    new-array v2, v7, [B

    fill-array-data v2, :array_4

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v5, v0, v1

    const/4 v1, 0x7

    new-array v2, v9, [B

    fill-array-data v2, :array_5

    aput-object v2, v0, v1

    sput-object v0, Lorg/spongycastle/math/ec/f;->d:[[B

    return-void

    .line 51
    :array_0
    .array-data 1
        -0x1t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x0t
        0x1t
    .end array-data

    :array_2
    .array-data 1
        -0x1t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 70
    :array_3
    .array-data 1
        -0x1t
        0x0t
        0x1t
    .end array-data

    :array_4
    .array-data 1
        0x1t
        0x0t
        0x1t
    .end array-data

    :array_5
    .array-data 1
        -0x1t
        0x0t
        0x0t
        -0x1t
    .end array-data
.end method

.method public static a(Lorg/spongycastle/math/ec/ECCurve$F2m;)B
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    .line 421
    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 423
    const/4 v0, -0x1

    .line 434
    :goto_0
    return v0

    .line 425
    :cond_0
    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 427
    const/4 v0, 0x1

    goto :goto_0

    .line 431
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No Koblitz curve (ABC), TNAF multiplication not possible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(B)Ljava/math/BigInteger;
    .locals 2

    .prologue
    .line 508
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 512
    const-wide/16 v0, 0x6

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 517
    :goto_0
    return-object v0

    :cond_0
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 5

    .prologue
    .line 395
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 403
    :goto_0
    return-object p0

    .line 400
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    .line 401
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    .line 403
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->e()Z

    move-result v4

    invoke-direct {v0, v3, v1, v2, v4}, Lorg/spongycastle/math/ec/ECPoint$F2m;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    move-object p0, v0

    goto :goto_0
.end method

.method private static a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;BI)Lorg/spongycastle/math/ec/e;
    .locals 3

    .prologue
    .line 286
    add-int/lit8 v0, p4, 0x5

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v1, v0, 0xa

    .line 287
    sub-int v0, p4, v1

    add-int/lit8 v0, v0, -0x2

    add-int/2addr v0, p3

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    .line 289
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 291
    invoke-virtual {v0, p4}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v2

    .line 293
    invoke-virtual {p2, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 295
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 296
    add-int/lit8 v0, v1, -0xa

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    .line 297
    add-int/lit8 v1, v1, -0xa

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 300
    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 303
    :cond_0
    new-instance v1, Lorg/spongycastle/math/ec/e;

    const/16 v2, 0xa

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/math/ec/e;-><init>(Ljava/math/BigInteger;I)V

    return-object v1
.end method

.method public static a(Ljava/math/BigInteger;IB[Ljava/math/BigInteger;B)Lorg/spongycastle/math/ec/k;
    .locals 9

    .prologue
    .line 611
    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 613
    const/4 v0, 0x0

    aget-object v0, p3, v0

    const/4 v1, 0x1

    aget-object v1, p3, v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 620
    :goto_0
    const/4 v1, 0x1

    invoke-static {p4, p1, v1}, Lorg/spongycastle/math/ec/f;->a(BIZ)[Ljava/math/BigInteger;

    move-result-object v1

    .line 621
    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 623
    const/4 v2, 0x0

    aget-object v2, p3, v2

    invoke-static {p0, v2, v1, p2, p1}, Lorg/spongycastle/math/ec/f;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;BI)Lorg/spongycastle/math/ec/e;

    move-result-object v2

    .line 626
    const/4 v3, 0x1

    aget-object v3, p3, v3

    invoke-static {p0, v3, v1, p2, p1}, Lorg/spongycastle/math/ec/f;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;BI)Lorg/spongycastle/math/ec/e;

    move-result-object v1

    .line 629
    invoke-virtual {v2}, Lorg/spongycastle/math/ec/e;->b()I

    move-result v3

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/e;->b()I

    move-result v4

    if-eq v4, v3, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "lambda0 and lambda1 do not have same scale"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 617
    :cond_0
    const/4 v0, 0x0

    aget-object v0, p3, v0

    const/4 v1, 0x1

    aget-object v1, p3, v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0

    .line 629
    :cond_1
    const/4 v3, 0x1

    if-eq p4, v3, :cond_2

    const/4 v3, -0x1

    if-eq p4, v3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mu must be 1 or -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v2}, Lorg/spongycastle/math/ec/e;->a()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/e;->a()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v2, v6}, Lorg/spongycastle/math/ec/e;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/e;

    move-result-object v3

    invoke-virtual {v1, v7}, Lorg/spongycastle/math/ec/e;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/e;

    move-result-object v2

    invoke-virtual {v3, v3}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v1

    const/4 v4, 0x1

    if-ne p4, v4, :cond_5

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v1

    :goto_1
    invoke-virtual {v2, v2}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v5

    const/4 v2, 0x1

    if-ne p4, v2, :cond_6

    invoke-virtual {v3, v4}, Lorg/spongycastle/math/ec/e;->b(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v2

    invoke-virtual {v3, v5}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v3

    :goto_2
    const/4 v5, 0x0

    const/4 v4, 0x0

    sget-object v8, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v1, v8}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v8

    if-ltz v8, :cond_8

    sget-object v8, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    invoke-virtual {v2, v8}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v8

    if-gez v8, :cond_7

    move v4, p4

    :cond_3
    :goto_3
    sget-object v8, Lorg/spongycastle/math/ec/f;->e:Ljava/math/BigInteger;

    invoke-virtual {v1, v8}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_a

    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    invoke-virtual {v2, v1}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v1

    if-ltz v1, :cond_9

    neg-int v1, p4

    int-to-byte v4, v1

    :cond_4
    :goto_4
    int-to-long v2, v5

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    int-to-long v2, v4

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    new-instance v3, Lorg/spongycastle/math/ec/k;

    invoke-direct {v3, v1, v2}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 632
    iget-object v1, v3, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    const-wide/16 v4, 0x2

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, p3, v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, v3, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 636
    const/4 v1, 0x1

    aget-object v1, p3, v1

    iget-object v2, v3, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, p3, v2

    iget-object v3, v3, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 638
    new-instance v2, Lorg/spongycastle/math/ec/k;

    invoke-direct {v2, v0, v1}, Lorg/spongycastle/math/ec/k;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v2

    .line 629
    :cond_5
    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/e;->b(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v1

    goto/16 :goto_1

    :cond_6
    invoke-virtual {v3, v4}, Lorg/spongycastle/math/ec/e;->a(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v2

    invoke-virtual {v3, v5}, Lorg/spongycastle/math/ec/e;->b(Lorg/spongycastle/math/ec/e;)Lorg/spongycastle/math/ec/e;

    move-result-object v3

    goto/16 :goto_2

    :cond_7
    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    sget-object v8, Lorg/spongycastle/math/ec/ECConstants;->h:Ljava/math/BigInteger;

    invoke-virtual {v3, v8}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v8

    if-ltz v8, :cond_3

    move v4, p4

    goto/16 :goto_3

    :cond_9
    const/4 v5, -0x1

    goto :goto_4

    :cond_a
    sget-object v1, Lorg/spongycastle/math/ec/f;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, v1}, Lorg/spongycastle/math/ec/e;->b(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_4

    neg-int v1, p4

    int-to-byte v4, v1

    goto :goto_4
.end method

.method public static a(BLorg/spongycastle/math/ec/k;Ljava/math/BigInteger;Ljava/math/BigInteger;[Lorg/spongycastle/math/ec/k;)[B
    .locals 10

    .prologue
    const/4 v6, -0x1

    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 726
    if-eq p0, v5, :cond_0

    if-eq p0, v6, :cond_0

    .line 728
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mu must be 1 or -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 731
    :cond_0
    iget-object v0, p1, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    iget-object v2, p1, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v2, p1, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    iget-object v3, p1, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    iget-object v3, p1, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    iget-object v4, p1, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v3

    if-ne p0, v5, :cond_2

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 734
    :goto_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 737
    const/16 v2, 0x1e

    if-le v0, v2, :cond_4

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    .line 740
    :goto_1
    new-array v7, v0, [B

    .line 743
    invoke-virtual {p2, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v8

    .line 746
    iget-object v0, p1, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    .line 747
    iget-object v2, p1, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    move-object v3, v2

    move-object v2, v0

    move v0, v1

    .line 751
    :goto_2
    sget-object v4, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    .line 754
    :cond_1
    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 757
    invoke-virtual {v3, p3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 762
    invoke-virtual {v4, v8}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v6

    if-ltz v6, :cond_5

    .line 764
    invoke-virtual {v4, p2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    int-to-byte v4, v4

    .line 772
    :goto_3
    aput-byte v4, v7, v0

    .line 774
    if-gez v4, :cond_a

    .line 777
    neg-int v4, v4

    int-to-byte v4, v4

    move v6, v4

    move v4, v1

    .line 781
    :goto_4
    if-eqz v4, :cond_6

    .line 783
    aget-object v4, p4, v6

    iget-object v4, v4, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 784
    aget-object v4, p4, v6

    iget-object v4, v4, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    move-object v9, v2

    move-object v2, v3

    move-object v3, v9

    .line 799
    :goto_5
    if-ne p0, v5, :cond_8

    .line 801
    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 808
    :goto_6
    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v3

    .line 809
    add-int/lit8 v0, v0, 0x1

    .line 810
    goto :goto_2

    .line 731
    :cond_2
    if-ne p0, v6, :cond_3

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mu must be 1 or -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 737
    :cond_4
    const/16 v0, 0x26

    goto/16 :goto_1

    .line 768
    :cond_5
    invoke-virtual {v4}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    int-to-byte v4, v4

    goto :goto_3

    .line 788
    :cond_6
    aget-object v4, p4, v6

    iget-object v4, v4, Lorg/spongycastle/math/ec/k;->a:Ljava/math/BigInteger;

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 789
    aget-object v4, p4, v6

    iget-object v4, v4, Lorg/spongycastle/math/ec/k;->b:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    move-object v9, v2

    move-object v2, v3

    move-object v3, v9

    .line 791
    goto :goto_5

    .line 794
    :cond_7
    aput-byte v1, v7, v0

    move-object v9, v2

    move-object v2, v3

    move-object v3, v9

    goto :goto_5

    .line 806
    :cond_8
    invoke-virtual {v3, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    goto :goto_6

    .line 811
    :cond_9
    return-object v7

    :cond_a
    move v6, v4

    move v4, v5

    goto :goto_4
.end method

.method private static a(BIZ)[Ljava/math/BigInteger;
    .locals 7

    .prologue
    const/4 v3, 0x1

    .line 453
    if-eq p0, v3, :cond_0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    .line 455
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mu must be 1 or -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 462
    :cond_0
    if-eqz p2, :cond_1

    .line 464
    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->h:Ljava/math/BigInteger;

    .line 465
    int-to-long v4, p0

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    :goto_0
    move v2, v3

    move-object v4, v1

    move-object v1, v0

    .line 473
    :goto_1
    if-ge v2, p1, :cond_3

    .line 476
    if-ne p0, v3, :cond_2

    move-object v0, v1

    .line 487
    :goto_2
    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 473
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    goto :goto_1

    .line 469
    :cond_1
    sget-object v1, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    .line 470
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    goto :goto_0

    .line 484
    :cond_2
    invoke-virtual {v1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_2

    .line 494
    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/math/BigInteger;

    const/4 v2, 0x0

    aput-object v4, v0, v2

    aput-object v1, v0, v3

    .line 495
    return-object v0
.end method

.method public static a(Lorg/spongycastle/math/ec/ECPoint$F2m;B)[Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 10

    .prologue
    const/4 v9, 0x1

    .line 823
    const/16 v0, 0x10

    new-array v4, v0, [Lorg/spongycastle/math/ec/ECPoint$F2m;

    .line 824
    aput-object p0, v4, v9

    .line 826
    if-nez p1, :cond_1

    .line 828
    sget-object v0, Lorg/spongycastle/math/ec/f;->b:[[B

    move-object v1, v0

    .line 836
    :goto_0
    array-length v5, v1

    .line 837
    const/4 v0, 0x3

    move v3, v0

    :goto_1
    if-ge v3, v5, :cond_4

    .line 839
    aget-object v6, v1, v3

    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    check-cast v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    array-length v2, v6

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-ltz v2, :cond_3

    invoke-static {v0}, Lorg/spongycastle/math/ec/f;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    aget-byte v7, v6, v2

    if-ne v7, v9, :cond_2

    invoke-virtual {v0, p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    :cond_0
    :goto_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 833
    :cond_1
    sget-object v0, Lorg/spongycastle/math/ec/f;->d:[[B

    move-object v1, v0

    goto :goto_0

    .line 839
    :cond_2
    aget-byte v7, v6, v2

    const/4 v8, -0x1

    if-ne v7, v8, :cond_0

    invoke-virtual {v0, p0}, Lorg/spongycastle/math/ec/ECPoint$F2m;->b(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    goto :goto_3

    :cond_3
    aput-object v0, v4, v3

    .line 837
    add-int/lit8 v0, v3, 0x2

    move v3, v0

    goto :goto_1

    .line 842
    :cond_4
    return-object v4
.end method

.method public static b(Lorg/spongycastle/math/ec/ECCurve$F2m;)[Ljava/math/BigInteger;
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 544
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 546
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "si is defined for Koblitz curves only"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 549
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->h()I

    move-result v0

    .line 550
    iget-object v1, p0, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    .line 551
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->f()B

    move-result v2

    .line 552
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->m()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    .line 553
    add-int/lit8 v0, v0, 0x3

    sub-int/2addr v0, v1

    .line 554
    invoke-static {v2, v0, v6}, Lorg/spongycastle/math/ec/f;->a(BIZ)[Ljava/math/BigInteger;

    move-result-object v1

    .line 558
    if-ne v2, v5, :cond_1

    .line 560
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    aget-object v2, v1, v5

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 561
    sget-object v2, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    aget-object v1, v1, v6

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 573
    :goto_0
    new-array v2, v7, [Ljava/math/BigInteger;

    .line 575
    if-ne v3, v7, :cond_3

    .line 577
    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v2, v6

    .line 578
    invoke-virtual {v1, v5}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v2, v5

    .line 590
    :goto_1
    return-object v2

    .line 563
    :cond_1
    const/4 v0, -0x1

    if-ne v2, v0, :cond_2

    .line 565
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    aget-object v2, v1, v5

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 566
    sget-object v2, Lorg/spongycastle/math/ec/ECConstants;->g:Ljava/math/BigInteger;

    aget-object v1, v1, v6

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    goto :goto_0

    .line 570
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mu must be 1 or -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 580
    :cond_3
    const/4 v4, 0x4

    if-ne v3, v4, :cond_4

    .line 582
    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v2, v6

    .line 583
    invoke-virtual {v1, v7}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v2, v5

    goto :goto_1

    .line 587
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "h (Cofactor) must be 2 or 4"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
