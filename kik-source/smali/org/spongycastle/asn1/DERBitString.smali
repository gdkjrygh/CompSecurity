.class public Lorg/spongycastle/asn1/DERBitString;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1String;


# static fields
.field private static final c:[C


# instance fields
.field protected a:[B

.field protected b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/asn1/DERBitString;->c:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 4

    .prologue
    .line 163
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 166
    :try_start_0
    invoke-interface {p1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->a(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    .line 167
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/asn1/DERBitString;->b:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 171
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error processing object : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/DERBitString;-><init>([BI)V

    .line 159
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 151
    iput-object p1, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    .line 152
    iput p2, p0, Lorg/spongycastle/asn1/DERBitString;->b:I

    .line 153
    return-void
.end method

.method protected static a(I)I
    .locals 3

    .prologue
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    .line 34
    if-eqz v0, :cond_1

    .line 36
    mul-int/lit8 v2, v0, 0x8

    shr-int v2, p0, v2

    if-eqz v2, :cond_2

    .line 38
    mul-int/lit8 v0, v0, 0x8

    shr-int v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    .line 52
    :cond_0
    :goto_1
    if-nez v1, :cond_3

    .line 54
    const/4 v0, 0x7

    .line 65
    :goto_2
    return v0

    .line 44
    :cond_1
    if-eqz p0, :cond_2

    .line 46
    and-int/lit16 v1, p0, 0xff

    .line 47
    goto :goto_1

    .line 28
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 58
    :cond_3
    const/4 v0, 0x1

    .line 60
    :goto_3
    shl-int/lit8 v1, v1, 0x1

    and-int/lit16 v2, v1, 0xff

    if-eqz v2, :cond_4

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 65
    :cond_4
    rsub-int/lit8 v0, v0, 0x8

    goto :goto_2
.end method

.method static a(ILjava/io/InputStream;)Lorg/spongycastle/asn1/DERBitString;
    .locals 4

    .prologue
    .line 294
    if-gtz p0, :cond_0

    .line 296
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "truncated BIT STRING detected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 300
    add-int/lit8 v1, p0, -0x1

    new-array v1, v1, [B

    .line 302
    array-length v2, v1

    if-eqz v2, :cond_1

    .line 304
    invoke-static {p1, v1}, Lorg/spongycastle/util/io/Streams;->a(Ljava/io/InputStream;[B)I

    move-result v2

    array-length v3, v1

    if-eq v2, v3, :cond_1

    .line 306
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF encountered in middle of BIT STRING"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :cond_1
    new-instance v2, Lorg/spongycastle/asn1/DERBitString;

    invoke-direct {v2, v1, v0}, Lorg/spongycastle/asn1/DERBitString;-><init>([BI)V

    return-object v2
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;
    .locals 3

    .prologue
    .line 101
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/DERBitString;

    if-eqz v0, :cond_1

    .line 103
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/DERBitString;

    return-object p0

    .line 106
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "illegal object in getInstance: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/DERBitString;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 122
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 124
    instance-of v1, v0, Lorg/spongycastle/asn1/DERBitString;

    if-eqz v1, :cond_0

    .line 126
    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    .line 130
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    array-length v1, v0

    if-gtz v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "truncated BIT STRING detected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    aget-byte v1, v0, v5

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    new-array v2, v2, [B

    array-length v3, v2

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    array-length v4, v0

    add-int/lit8 v4, v4, -0x1

    invoke-static {v0, v3, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    new-instance v0, Lorg/spongycastle/asn1/DERBitString;

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/asn1/DERBitString;-><init>([BI)V

    goto :goto_0
.end method

.method protected static b(I)[B
    .locals 4

    .prologue
    .line 74
    const/4 v1, 0x4

    .line 75
    const/4 v0, 0x3

    :goto_0
    if-lez v0, :cond_0

    .line 77
    const/16 v2, 0xff

    mul-int/lit8 v3, v0, 0x8

    shl-int/2addr v2, v3

    and-int/2addr v2, p0

    if-nez v2, :cond_0

    .line 79
    add-int/lit8 v1, v1, -0x1

    .line 75
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 84
    :cond_0
    new-array v2, v1, [B

    .line 85
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_1

    .line 87
    mul-int/lit8 v3, v0, 0x8

    shr-int v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 85
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 90
    :cond_1
    return-object v2
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 215
    iget-object v0, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 217
    iget v1, p0, Lorg/spongycastle/asn1/DERBitString;->b:I

    int-to-byte v1, v1

    aput-byte v1, v0, v4

    .line 218
    iget-object v1, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    const/4 v2, 0x1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    invoke-static {v1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 220
    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 221
    return-void
.end method

.method protected final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 231
    instance-of v1, p1, Lorg/spongycastle/asn1/DERBitString;

    if-nez v1, :cond_1

    .line 238
    :cond_0
    :goto_0
    return v0

    .line 236
    :cond_1
    check-cast p1, Lorg/spongycastle/asn1/DERBitString;

    .line 238
    iget v1, p0, Lorg/spongycastle/asn1/DERBitString;->b:I

    iget v2, p1, Lorg/spongycastle/asn1/DERBitString;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    iget-object v2, p1, Lorg/spongycastle/asn1/DERBitString;->a:[B

    invoke-static {v1, v2}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 182
    iget v0, p0, Lorg/spongycastle/asn1/DERBitString;->b:I

    return v0
.end method

.method public final e()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 191
    move v1, v0

    .line 193
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    array-length v2, v2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    .line 195
    iget-object v2, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    mul-int/lit8 v3, v0, 0x8

    shl-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 193
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 198
    :cond_0
    return v1
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 203
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 225
    iget v0, p0, Lorg/spongycastle/asn1/DERBitString;->b:I

    iget-object v1, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERBitString;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final o_()Ljava/lang/String;
    .locals 5

    .prologue
    .line 244
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "#"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 245
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 246
    new-instance v2, Lorg/spongycastle/asn1/ASN1OutputStream;

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 250
    :try_start_0
    invoke-virtual {v2, p0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 259
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    .line 261
    sget-object v3, Lorg/spongycastle/asn1/DERBitString;->c:[C

    aget-byte v4, v2, v0

    ushr-int/lit8 v4, v4, 0x4

    and-int/lit8 v4, v4, 0xf

    aget-char v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 262
    sget-object v3, Lorg/spongycastle/asn1/DERBitString;->c:[C

    aget-byte v4, v2, v0

    and-int/lit8 v4, v4, 0xf

    aget-char v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 259
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 254
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "internal error encoding BitString"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERBitString;->o_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
