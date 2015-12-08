.class public Lorg/bouncycastle/crypto/tls/TlsNullCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsCipher;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected copyData([BII)[B
    .locals 2

    new-array v0, p3, [B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public decodeCiphertext(S[BII)[B
    .locals 1

    invoke-virtual {p0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/TlsNullCipher;->copyData([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public encodePlaintext(S[BII)[B
    .locals 1

    invoke-virtual {p0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/TlsNullCipher;->copyData([BII)[B

    move-result-object v0

    return-object v0
.end method
