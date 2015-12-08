.class public Lorg/spongycastle/crypto/StreamBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/StreamCipher;


# instance fields
.field private a:Lorg/spongycastle/crypto/BlockCipher;

.field private b:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->b:[B

    .line 24
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "block cipher block size != 1."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_0
    iput-object p1, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    .line 30
    return-void
.end method


# virtual methods
.method public final a(B)B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 64
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->b:[B

    aput-byte p1, v0, v3

    .line 66
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->b:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->b:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 68
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->b:[B

    aget-byte v0, v0, v3

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 43
    return-void
.end method

.method public final a([BII[BI)V
    .locals 4

    .prologue
    .line 89
    add-int v0, p5, p3

    array-length v1, p4

    if-le v0, v1, :cond_0

    .line 91
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too small in processBytes()"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq v0, p3, :cond_1

    .line 96
    iget-object v1, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    add-int v2, p2, v0

    add-int v3, p5, v0

    invoke-interface {v1, p1, v2, p4, v3}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 94
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 98
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lorg/spongycastle/crypto/StreamBlockCipher;->a:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 107
    return-void
.end method
