.class public Lorg/bouncycastle/crypto/engines/DESedeEngine;
.super Lorg/bouncycastle/crypto/engines/DESEngine;


# instance fields
.field private a:[I

.field private b:[I

.field private c:[I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/DESEngine;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->b:[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->c:[I

    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "DESede"

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 6

    const/16 v5, 0x18

    const/4 v1, 0x0

    const/16 v4, 0x8

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to DESede init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p2, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v2

    array-length v0, v2

    if-le v0, v5, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key size greater than 24 bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->d:Z

    new-array v0, v4, [B

    invoke-static {v2, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->generateWorkingKey(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    new-array v3, v4, [B

    invoke-static {v2, v4, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0, v3}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->generateWorkingKey(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->b:[I

    array-length v0, v2

    if-ne v0, v5, :cond_3

    new-array v0, v4, [B

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->generateWorkingKey(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->c:[I

    :goto_1
    return-void

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->c:[I

    goto :goto_1
.end method

.method public processBlock([BI[BI)I
    .locals 9

    const/16 v8, 0x8

    const/4 v5, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DESede engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    add-int/lit8 v0, p2, 0x8

    array-length v1, p1

    if-le v0, v1, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, p4, 0x8

    array-length v1, p3

    if-le v0, v1, :cond_2

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-array v4, v8, [B

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->d:Z

    if-eqz v0, :cond_3

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->b:[I

    move-object v2, p0

    move-object v6, v4

    move v7, v5

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->c:[I

    move-object v2, p0

    move-object v6, p3

    move v7, p4

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    :goto_0
    return v8

    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->c:[I

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->b:[I

    move-object v2, p0

    move-object v6, v4

    move v7, v5

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->a:[I

    move-object v2, p0

    move-object v6, p3

    move v7, p4

    invoke-virtual/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->desFunc([I[BI[BI)V

    goto :goto_0
.end method

.method public reset()V
    .locals 0

    return-void
.end method
