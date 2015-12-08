.class public Lorg/spongycastle/crypto/macs/OldHMac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:I

.field private c:[B

.field private d:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/Digest;)V
    .locals 2

    .prologue
    const/16 v1, 0x40

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    .line 24
    new-array v0, v1, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    .line 32
    iput-object p1, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    .line 33
    invoke-interface {p1}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->b:I

    .line 34
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 89
    iget v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->b:I

    return v0
.end method

.method public final a([BI)I
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 110
    iget v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->b:I

    new-array v0, v0, [B

    .line 111
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v4}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 113
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    array-length v3, v3

    invoke-interface {v1, v2, v4, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 114
    iget-object v1, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    array-length v2, v0

    invoke-interface {v1, v0, v4, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 116
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    move-result v0

    .line 118
    invoke-virtual {p0}, Lorg/spongycastle/crypto/macs/OldHMac;->b()V

    .line 120
    return v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 96
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 49
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 51
    check-cast p1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    .line 53
    array-length v2, v0

    const/16 v3, 0x40

    if-le v2, v3, :cond_0

    .line 55
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    array-length v3, v0

    invoke-interface {v2, v0, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 56
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    invoke-interface {v0, v2, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 57
    iget v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->b:I

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 59
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    aput-byte v1, v2, v0

    .line 57
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 64
    :cond_0
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v3, v0

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    array-length v0, v0

    :goto_1
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 67
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    aput-byte v1, v2, v0

    .line 65
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 71
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    .line 72
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v3, v3

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 74
    :goto_2
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 76
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    aget-byte v3, v2, v0

    xor-int/lit8 v3, v3, 0x36

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 74
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    .line 79
    :goto_3
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    array-length v2, v2

    if-ge v0, v2, :cond_3

    .line 81
    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->d:[B

    aget-byte v3, v2, v0

    xor-int/lit8 v3, v3, 0x5c

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 79
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 84
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v3, v3

    invoke-interface {v0, v2, v1, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 85
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 104
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 131
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 136
    iget-object v0, p0, Lorg/spongycastle/crypto/macs/OldHMac;->a:Lorg/spongycastle/crypto/Digest;

    iget-object v1, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/crypto/macs/OldHMac;->c:[B

    array-length v3, v3

    invoke-interface {v0, v1, v2, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 137
    return-void
.end method
