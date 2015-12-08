.class public Lorg/spongycastle/math/ec/ECPoint$Fp;
.super Lorg/spongycastle/math/ec/ECPoint;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/math/ec/ECPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fp"
.end annotation


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    .line 171
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V
    .locals 2

    .prologue
    .line 183
    invoke-direct {p0, p1, p2, p3}, Lorg/spongycastle/math/ec/ECPoint;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    .line 185
    if-eqz p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    if-nez p2, :cond_2

    if-eqz p3, :cond_2

    .line 187
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Exactly one of the field elements is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_2
    iput-boolean p4, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->d:Z

    .line 191
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 3

    .prologue
    .line 243
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$Fp;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    :goto_0
    return-object p1

    .line 248
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p1, p0

    .line 250
    goto :goto_0

    .line 254
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p1, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 256
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p1, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 259
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$Fp;->h()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p1

    goto :goto_0

    .line 263
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p1

    goto :goto_0

    .line 266
    :cond_3
    iget-object v0, p1, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    iget-object v1, p1, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->d(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p1, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    .line 269
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    .line 271
    new-instance p1, Lorg/spongycastle/math/ec/ECPoint$Fp;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-direct {p1, v2, v1, v0}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V

    goto :goto_0
.end method

.method public final b(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 303
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint;->g()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/math/ec/ECPoint$Fp;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0
.end method

.method public final f()[B
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 198
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$Fp;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    new-array v0, v5, [B

    .line 236
    :goto_0
    return-object v0

    .line 203
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Lorg/spongycastle/math/ec/ECFieldElement;)I

    move-result v1

    .line 205
    iget-boolean v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->d:Z

    if-eqz v0, :cond_2

    .line 209
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    const/4 v0, 0x3

    .line 218
    :goto_1
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2, v1}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v2

    .line 219
    array-length v1, v2

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [B

    .line 221
    aput-byte v0, v1, v4

    .line 222
    array-length v0, v2

    invoke-static {v2, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v1

    .line 224
    goto :goto_0

    .line 215
    :cond_1
    const/4 v0, 0x2

    goto :goto_1

    .line 228
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v2

    .line 229
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;->a(Ljava/math/BigInteger;I)[B

    move-result-object v1

    .line 230
    array-length v0, v2

    array-length v3, v1

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 232
    const/4 v3, 0x4

    aput-byte v3, v0, v4

    .line 233
    array-length v3, v2

    invoke-static {v2, v4, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 234
    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    array-length v3, v1

    invoke-static {v1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public final g()Lorg/spongycastle/math/ec/ECPoint;
    .locals 5

    .prologue
    .line 314
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$Fp;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v3}, Lorg/spongycastle/math/ec/ECFieldElement;->c()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v3

    iget-boolean v4, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    return-object v0
.end method

.method public final h()Lorg/spongycastle/math/ec/ECPoint;
    .locals 5

    .prologue
    .line 277
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint$Fp;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    :goto_0
    return-object p0

    .line 283
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-nez v0, :cond_1

    .line 287
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0

    .line 290
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    const-wide/16 v2, 0x2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECCurve;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    .line 291
    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    const-wide/16 v2, 0x3

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECCurve;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    .line 292
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-object v2, v2, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->d(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    .line 294
    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECFieldElement;->d()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v3, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v2

    .line 295
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/spongycastle/math/ec/ECFieldElement;->c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECFieldElement;->b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v1

    .line 297
    new-instance v0, Lorg/spongycastle/math/ec/ECPoint$Fp;

    iget-object v3, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->a:Lorg/spongycastle/math/ec/ECCurve;

    iget-boolean v4, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->d:Z

    invoke-direct {v0, v3, v2, v1, v4}, Lorg/spongycastle/math/ec/ECPoint$Fp;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;Z)V

    move-object p0, v0

    goto :goto_0
.end method

.method final declared-synchronized i()V
    .locals 1

    .prologue
    .line 322
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->e:Lorg/spongycastle/math/ec/a;

    if-nez v0, :cond_0

    .line 324
    new-instance v0, Lorg/spongycastle/math/ec/g;

    invoke-direct {v0}, Lorg/spongycastle/math/ec/g;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint$Fp;->e:Lorg/spongycastle/math/ec/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_0
    monitor-exit p0

    return-void

    .line 322
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
