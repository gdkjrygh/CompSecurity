.class public Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/SignerWithRecovery;


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:[B

.field private c:I


# virtual methods
.method public final a(B)V
    .locals 3

    .prologue
    .line 224
    iget v0, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->c:I

    iget-object v1, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->b:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 226
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->b:[B

    iget v1, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->c:I

    aput-byte p1, v0, v1

    .line 232
    :goto_0
    return-void

    .line 230
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    goto :goto_0
.end method

.method public final a([BII)V
    .locals 2

    .prologue
    .line 242
    :goto_0
    if-lez p3, :cond_0

    iget v0, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->c:I

    iget-object v1, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->b:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 244
    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->a(B)V

    .line 245
    add-int/lit8 p2, p2, 0x1

    .line 246
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 249
    :cond_0
    if-lez p3, :cond_1

    .line 251
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 253
    :cond_1
    return-void
.end method
