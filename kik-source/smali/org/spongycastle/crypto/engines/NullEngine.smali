.class public Lorg/spongycastle/crypto/engines/NullEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method


# virtual methods
.method public final a([BI[BI)I
    .locals 3

    .prologue
    .line 55
    iget-boolean v0, p0, Lorg/spongycastle/crypto/engines/NullEngine;->a:Z

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Null engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    add-int/lit8 v0, p2, 0x1

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 61
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_1
    add-int/lit8 v0, p4, 0x1

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 66
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-gtz v0, :cond_3

    .line 71
    add-int/lit8 v1, p4, 0x0

    add-int/lit8 v2, p2, 0x0

    aget-byte v2, p1, v2

    aput-byte v2, p3, v1

    .line 69
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 74
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    const-string v0, "Null"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/crypto/engines/NullEngine;->a:Z

    .line 31
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 83
    return-void
.end method
