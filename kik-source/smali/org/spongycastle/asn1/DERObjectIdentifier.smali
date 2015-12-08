.class public Lorg/spongycastle/asn1/DERObjectIdentifier;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"


# static fields
.field private static c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# instance fields
.field a:Ljava/lang/String;

.field private b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 301
    const/16 v0, 0xff

    new-array v0, v0, [[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/DERObjectIdentifier;->c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/16 v7, 0x30

    const/16 v6, 0x2e

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 125
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x3

    if-lt v0, v3, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v6, :cond_1

    :cond_0
    :goto_0
    if-nez v2, :cond_4

    .line 128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "string "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not an OID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-lt v0, v7, :cond_0

    const/16 v3, 0x32

    if-gt v0, v3, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v2

    :goto_1
    const/4 v4, 0x2

    if-lt v3, v4, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-gt v7, v4, :cond_2

    const/16 v5, 0x39

    if-gt v4, v5, :cond_2

    move v0, v1

    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    if-ne v4, v6, :cond_0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_2

    :cond_3
    move v2, v0

    goto :goto_0

    .line 131
    :cond_4
    iput-object p1, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    .line 132
    return-void
.end method

.method constructor <init>([B)V
    .locals 11

    .prologue
    .line 64
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 65
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 66
    const-wide/16 v4, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    const/4 v1, 0x1

    .line 70
    const/4 v0, 0x0

    move v10, v0

    move-object v0, v2

    move-wide v2, v4

    move v4, v10

    :goto_0
    array-length v5, p1

    if-eq v4, v5, :cond_3

    .line 72
    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    .line 74
    const-wide/high16 v8, 0x80000000000000L

    cmp-long v7, v2, v8

    if-gez v7, :cond_1

    .line 76
    const-wide/16 v8, 0x80

    mul-long/2addr v2, v8

    and-int/lit8 v7, v5, 0x7f

    int-to-long v8, v7

    add-long/2addr v2, v8

    .line 77
    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_4

    .line 79
    if-eqz v1, :cond_0

    .line 81
    long-to-int v1, v2

    div-int/lit8 v1, v1, 0x28

    packed-switch v1, :pswitch_data_0

    .line 91
    const/16 v1, 0x32

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 92
    const-wide/16 v8, 0x50

    sub-long/2addr v2, v8

    .line 94
    :goto_1
    const/4 v1, 0x0

    .line 97
    :cond_0
    const/16 v5, 0x2e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 99
    const-wide/16 v2, 0x0

    move v10, v1

    move-object v1, v0

    move v0, v10

    .line 70
    :goto_2
    add-int/lit8 v4, v4, 0x1

    move v10, v0

    move-object v0, v1

    move v1, v10

    goto :goto_0

    .line 84
    :pswitch_0
    const/16 v1, 0x30

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 87
    :pswitch_1
    const/16 v1, 0x31

    invoke-virtual {v6, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 88
    const-wide/16 v8, 0x28

    sub-long/2addr v2, v8

    .line 89
    goto :goto_1

    .line 104
    :cond_1
    if-nez v0, :cond_2

    .line 106
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 108
    :cond_2
    const/4 v7, 0x7

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v0

    .line 109
    and-int/lit8 v7, v5, 0x7f

    int-to-long v8, v7

    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 110
    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_4

    .line 112
    const/16 v2, 0x2e

    invoke-virtual {v6, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 113
    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 114
    const/4 v0, 0x0

    .line 115
    const-wide/16 v2, 0x0

    move v10, v1

    move-object v1, v0

    move v0, v10

    goto :goto_2

    .line 120
    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    .line 121
    return-void

    :cond_4
    move v10, v1

    move-object v1, v0

    move v0, v10

    goto :goto_2

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 3

    .prologue
    .line 24
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v0, :cond_1

    .line 26
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 31
    :goto_0
    return-object p0

    .line 29
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_2

    .line 31
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    check-cast p0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget-object v1, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    goto :goto_0

    .line 34
    :cond_2
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 2

    .prologue
    .line 50
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 52
    instance-of v1, v0, Lorg/spongycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_0

    .line 54
    invoke-static {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b([B)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/io/ByteArrayOutputStream;)V
    .locals 4

    .prologue
    .line 179
    new-instance v0, Lorg/spongycastle/asn1/OIDTokenizer;

    iget-object v1, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/OIDTokenizer;-><init>(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v0}, Lorg/spongycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x28

    invoke-virtual {v0}, Lorg/spongycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    int-to-long v2, v1

    invoke-static {p1, v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/io/ByteArrayOutputStream;J)V

    .line 185
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/OIDTokenizer;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 187
    invoke-virtual {v0}, Lorg/spongycastle/asn1/OIDTokenizer;->b()Ljava/lang/String;

    move-result-object v1

    .line 188
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x12

    if-ge v2, v3, :cond_0

    .line 190
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/io/ByteArrayOutputStream;J)V

    goto :goto_0

    .line 194
    :cond_0
    new-instance v2, Ljava/math/BigInteger;

    invoke-direct {v2, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V

    goto :goto_0

    .line 197
    :cond_1
    return-void
.end method

.method private static a(Ljava/io/ByteArrayOutputStream;J)V
    .locals 5

    .prologue
    const/16 v0, 0x8

    .line 143
    const/16 v1, 0x9

    new-array v1, v1, [B

    .line 145
    long-to-int v2, p1

    and-int/lit8 v2, v2, 0x7f

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 146
    :goto_0
    const-wide/16 v2, 0x80

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    .line 148
    const/4 v2, 0x7

    shr-long/2addr p1, v2

    .line 149
    add-int/lit8 v0, v0, -0x1

    long-to-int v2, p1

    and-int/lit8 v2, v2, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    goto :goto_0

    .line 151
    :cond_0
    rsub-int/lit8 v2, v0, 0x9

    invoke-virtual {p0, v1, v0, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 152
    return-void
.end method

.method private static a(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 158
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    div-int/lit8 v1, v0, 0x7

    .line 159
    if-nez v1, :cond_0

    .line 161
    invoke-virtual {p0, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 175
    :goto_0
    return-void

    .line 165
    :cond_0
    new-array v2, v1, [B

    .line 167
    add-int/lit8 v0, v1, -0x1

    :goto_1
    if-ltz v0, :cond_1

    .line 169
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    and-int/lit8 v3, v3, 0x7f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 170
    const/4 v3, 0x7

    invoke-virtual {p1, v3}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object p1

    .line 167
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 172
    :cond_1
    add-int/lit8 v0, v1, -0x1

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    .line 173
    invoke-virtual {p0, v2, v4, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method

.method static b([B)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 5

    .prologue
    const/16 v4, 0xff

    .line 305
    array-length v0, p0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 307
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    .line 369
    :goto_0
    return-object v0

    .line 310
    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, p0, v0

    and-int/lit16 v2, v0, 0xff

    .line 311
    sget-object v0, Lorg/spongycastle/asn1/DERObjectIdentifier;->c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    aget-object v0, v0, v2

    .line 313
    if-nez v0, :cond_1

    .line 315
    sget-object v1, Lorg/spongycastle/asn1/DERObjectIdentifier;->c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-array v0, v4, [Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v1, v2

    .line 318
    :cond_1
    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    aget-byte v1, p0, v1

    and-int/lit16 v3, v1, 0xff

    .line 320
    aget-object v1, v0, v3

    .line 322
    if-nez v1, :cond_2

    .line 324
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    aput-object v1, v0, v3

    move-object v0, v1

    .line 325
    goto :goto_0

    .line 328
    :cond_2
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->d()[B

    move-result-object v0

    invoke-static {p0, v0}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, v1

    .line 330
    goto :goto_0

    .line 334
    :cond_3
    add-int/lit8 v0, v2, 0x1

    rem-int/lit16 v1, v0, 0x100

    .line 335
    sget-object v0, Lorg/spongycastle/asn1/DERObjectIdentifier;->c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    aget-object v0, v0, v1

    .line 336
    if-nez v0, :cond_4

    .line 338
    sget-object v2, Lorg/spongycastle/asn1/DERObjectIdentifier;->c:[[Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-array v0, v4, [Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    aput-object v0, v2, v1

    .line 341
    :cond_4
    aget-object v1, v0, v3

    .line 343
    if-nez v1, :cond_5

    .line 345
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    aput-object v1, v0, v3

    move-object v0, v1

    .line 346
    goto :goto_0

    .line 349
    :cond_5
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->d()[B

    move-result-object v2

    invoke-static {p0, v2}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v0, v1

    .line 351
    goto :goto_0

    .line 354
    :cond_6
    add-int/lit8 v1, v3, 0x1

    rem-int/lit16 v2, v1, 0x100

    .line 355
    aget-object v1, v0, v2

    .line 357
    if-nez v1, :cond_7

    .line 359
    new-instance v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v1, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    aput-object v1, v0, v2

    move-object v0, v1

    .line 360
    goto :goto_0

    .line 363
    :cond_7
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->d()[B

    move-result-object v0

    invoke-static {p0, v0}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object v0, v1

    .line 365
    goto :goto_0

    .line 369
    :cond_8
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    goto :goto_0
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 230
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->d()[B

    move-result-object v0

    .line 232
    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->b(I)V

    .line 233
    array-length v1, v0

    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I)V

    .line 234
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a([B)V

    .line 235
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 245
    instance-of v0, p1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    if-nez v0, :cond_0

    .line 247
    const/4 v0, 0x0

    .line 250
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    check-cast p1, Lorg/spongycastle/asn1/DERObjectIdentifier;

    iget-object v1, p1, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected final d()[B
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->b:[B

    if-nez v0, :cond_0

    .line 203
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 205
    invoke-direct {p0, v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 207
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->b:[B

    .line 210
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->b:[B

    return-object v0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 215
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 221
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->d()[B

    move-result-object v0

    array-length v0, v0

    .line 223
    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lorg/spongycastle/asn1/DERObjectIdentifier;->a:Ljava/lang/String;

    return-object v0
.end method
