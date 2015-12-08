.class public Lorg/bouncycastle/crypto/modes/gcm/BasicGCMExponentiator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/gcm/GCMExponentiator;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public exponentiateX(J[B)V
    .locals 7

    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    invoke-static {}, Lorg/bouncycastle/crypto/modes/gcm/a;->oneAsBytes()[B

    move-result-object v0

    cmp-long v1, p1, v4

    if-lez v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/gcm/BasicGCMExponentiator;->a:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v1

    :cond_0
    const-wide/16 v2, 0x1

    and-long/2addr v2, p1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiply([B[B)V

    :cond_1
    invoke-static {v1, v1}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiply([B[B)V

    const/4 v2, 0x1

    ushr-long/2addr p1, v2

    cmp-long v2, p1, v4

    if-gtz v2, :cond_0

    :cond_2
    const/16 v1, 0x10

    invoke-static {v0, v6, p3, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public init([B)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/BasicGCMExponentiator;->a:[B

    return-void
.end method
