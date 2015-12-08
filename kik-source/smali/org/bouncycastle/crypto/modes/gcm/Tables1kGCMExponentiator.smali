.class public Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/gcm/GCMExponentiator;


# instance fields
.field a:[[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [[B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    return-void
.end method


# virtual methods
.method public exponentiateX(J[B)V
    .locals 11

    const-wide/16 v8, 0x0

    const/4 v1, 0x1

    const/4 v6, 0x0

    invoke-static {}, Lorg/bouncycastle/crypto/modes/gcm/a;->oneAsBytes()[B

    move-result-object v2

    move v0, v1

    :goto_0
    cmp-long v3, p1, v8

    if-lez v3, :cond_1

    const-wide/16 v4, 0x1

    and-long/2addr v4, p1

    cmp-long v3, v4, v8

    if-eqz v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    aget-object v3, v3, v0

    invoke-static {v2, v3}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiply([B[B)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    ushr-long/2addr p1, v1

    goto :goto_0

    :cond_1
    const/16 v0, 0x10

    invoke-static {v2, v6, p3, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public init([B)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    const/16 v1, 0x10

    new-array v1, v1, [B

    aput-object v1, v0, v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    aget-object v0, v0, v2

    const/16 v1, -0x80

    aput-byte v1, v0, v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    const/4 v1, 0x1

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v0, 0x2

    :goto_0
    const/16 v1, 0x40

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    add-int/lit8 v2, v0, -0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v1

    invoke-static {v1, v1}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiply([B[B)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/gcm/Tables1kGCMExponentiator;->a:[[B

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
