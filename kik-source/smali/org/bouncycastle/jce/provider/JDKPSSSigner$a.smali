.class final Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/Digest;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKPSSSigner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/bouncycastle/jce/provider/JDKPSSSigner;

.field private b:Ljava/io/ByteArrayOutputStream;

.field private c:Lorg/bouncycastle/crypto/Digest;

.field private d:Z


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jce/provider/JDKPSSSigner;Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->a:Lorg/bouncycastle/jce/provider/JDKPSSSigner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->b:Ljava/io/ByteArrayOutputStream;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->d:Z

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->c:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public final doFinal([BI)I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iget-boolean v2, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->d:Z

    if-eqz v2, :cond_1

    array-length v2, v1

    invoke-static {v1, v0, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->reset()V

    iget-boolean v2, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->d:Z

    if-nez v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->d:Z

    array-length v0, v1

    return v0

    :cond_1
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->c:Lorg/bouncycastle/crypto/Digest;

    array-length v3, v1

    invoke-interface {v2, v1, v0, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2, p1, p2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    goto :goto_0
.end method

.method public final getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "NULL"

    return-object v0
.end method

.method public final getDigestSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    return v0
.end method

.method public final reset()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return-void
.end method

.method public final update(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void
.end method

.method public final update([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPSSSigner$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void
.end method
