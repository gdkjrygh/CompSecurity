.class public Lorg/spongycastle/crypto/engines/DESedeEngine;
.super Lorg/spongycastle/crypto/engines/DESEngine;
.source "SourceFile"


# instance fields
.field private a:[I

.field private b:[I

.field private c:[I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 25
    invoke-direct {p0}, Lorg/spongycastle/crypto/engines/DESEngine;-><init>()V

    .line 15
    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    .line 16
    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->b:[I

    .line 17
    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->c:[I

    .line 26
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 90
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DESede engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    add-int/lit8 v0, p2, 0x8

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 97
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_1
    add-int/lit8 v0, p4, 0x8

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 102
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_2
    new-array v0, v3, [B

    .line 107
    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->d:Z

    if-eqz v1, :cond_3

    .line 109
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    invoke-static {v1, p1, p2, v0, v2}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    .line 110
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->b:[I

    invoke-static {v1, v0, v2, v0, v2}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    .line 111
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->c:[I

    invoke-static {v1, v0, v2, p3, p4}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    .line 120
    :goto_0
    return v3

    .line 115
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->c:[I

    invoke-static {v1, p1, p2, v0, v2}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    .line 116
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->b:[I

    invoke-static {v1, v0, v2, v0, v2}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    .line 117
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    invoke-static {v1, v0, v2, p3, p4}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a([I[BI[BI)V

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    const-string v0, "DESede"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 7

    .prologue
    const/16 v6, 0x18

    const/16 v5, 0x10

    const/4 v1, 0x0

    const/16 v4, 0x8

    .line 40
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    .line 42
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

    .line 45
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v2

    .line 47
    array-length v0, v2

    if-eq v0, v6, :cond_1

    array-length v0, v2

    if-eq v0, v5, :cond_1

    .line 49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "key size must be 16 or 24 bytes."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->d:Z

    .line 54
    new-array v0, v4, [B

    .line 55
    invoke-static {v2, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    .line 58
    new-array v3, v4, [B

    .line 59
    invoke-static {v2, v4, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0, v3}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->b:[I

    .line 62
    array-length v0, v2

    if-ne v0, v6, :cond_3

    .line 64
    new-array v0, v4, [B

    .line 65
    invoke-static {v2, v5, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/DESedeEngine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->c:[I

    .line 72
    :goto_1
    return-void

    :cond_2
    move v0, v1

    .line 60
    goto :goto_0

    .line 70
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->a:[I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESedeEngine;->c:[I

    goto :goto_1
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 81
    const/16 v0, 0x8

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 125
    return-void
.end method
