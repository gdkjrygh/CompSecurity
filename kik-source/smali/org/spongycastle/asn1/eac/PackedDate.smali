.class public Lorg/spongycastle/asn1/eac/PackedDate;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 77
    instance-of v0, p1, Lorg/spongycastle/asn1/eac/PackedDate;

    if-nez v0, :cond_0

    .line 79
    const/4 v0, 0x0

    .line 84
    :goto_0
    return v0

    .line 82
    :cond_0
    check-cast p1, Lorg/spongycastle/asn1/eac/PackedDate;

    .line 84
    iget-object v0, p0, Lorg/spongycastle/asn1/eac/PackedDate;->a:[B

    iget-object v1, p1, Lorg/spongycastle/asn1/eac/PackedDate;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lorg/spongycastle/asn1/eac/PackedDate;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 89
    iget-object v0, p0, Lorg/spongycastle/asn1/eac/PackedDate;->a:[B

    array-length v0, v0

    new-array v1, v0, [C

    .line 91
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    .line 93
    iget-object v2, p0, Lorg/spongycastle/asn1/eac/PackedDate;->a:[B

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 91
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 96
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
