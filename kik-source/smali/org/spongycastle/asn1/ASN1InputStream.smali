.class public Lorg/spongycastle/asn1/ASN1InputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/BERTags;


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:[[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 29
    invoke-static {p1}, Lorg/spongycastle/asn1/j;->a(Ljava/io/InputStream;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;B)V
    .locals 2

    .prologue
    .line 82
    invoke-static {p1}, Lorg/spongycastle/asn1/j;->a(Ljava/io/InputStream;)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    .line 69
    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;IZ)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 99
    iput p2, p0, Lorg/spongycastle/asn1/ASN1InputStream;->a:I

    .line 100
    iput-boolean p3, p0, Lorg/spongycastle/asn1/ASN1InputStream;->b:Z

    .line 101
    const/16 v0, 0xb

    new-array v0, v0, [[B

    iput-object v0, p0, Lorg/spongycastle/asn1/ASN1InputStream;->c:[[B

    .line 102
    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .prologue
    .line 41
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v1, p1

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;I)V

    .line 42
    return-void
.end method

.method public constructor <init>([BB)V
    .locals 3

    .prologue
    .line 55
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v1, p1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    .line 56
    return-void
.end method

.method static a(Ljava/io/InputStream;I)I
    .locals 3

    .prologue
    .line 284
    and-int/lit8 v0, p1, 0x1f

    .line 289
    const/16 v1, 0x1f

    if-ne v0, v1, :cond_3

    .line 291
    const/4 v1, 0x0

    .line 293
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 297
    and-int/lit8 v2, v0, 0x7f

    if-nez v2, :cond_0

    .line 299
    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - invalid high tag number found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 302
    :cond_0
    :goto_0
    if-ltz v0, :cond_1

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_1

    .line 304
    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v0, v1

    .line 305
    shl-int/lit8 v1, v0, 0x7

    .line 306
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    goto :goto_0

    .line 309
    :cond_1
    if-gez v0, :cond_2

    .line 311
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found inside tag value."

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :cond_2
    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v0, v1

    .line 317
    :cond_3
    return v0
.end method

.method private static a(Lorg/spongycastle/asn1/e;)Lorg/spongycastle/asn1/ASN1EncodableVector;
    .locals 3

    .prologue
    .line 204
    new-instance v0, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private a(III)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 134
    and-int/lit8 v0, p1, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 136
    :goto_0
    new-instance v2, Lorg/spongycastle/asn1/e;

    invoke-direct {v2, p0, p3}, Lorg/spongycastle/asn1/e;-><init>(Ljava/io/InputStream;I)V

    .line 138
    and-int/lit8 v3, p1, 0x40

    if-eqz v3, :cond_1

    .line 140
    new-instance v1, Lorg/spongycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v2

    invoke-direct {v1, v0, p2, v2}, Lorg/spongycastle/asn1/DERApplicationSpecific;-><init>(ZI[B)V

    move-object v0, v1

    .line 184
    :goto_1
    return-object v0

    :cond_0
    move v0, v1

    .line 134
    goto :goto_0

    .line 143
    :cond_1
    and-int/lit16 v3, p1, 0x80

    if-eqz v3, :cond_2

    .line 145
    new-instance v1, Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1, v0, p2}, Lorg/spongycastle/asn1/ASN1StreamParser;->a(ZI)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_1

    .line 148
    :cond_2
    if-eqz v0, :cond_5

    .line 151
    sparse-switch p2, :sswitch_data_0

    .line 180
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " encountered"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :sswitch_0
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;)Lorg/spongycastle/asn1/ASN1EncodableVector;

    move-result-object v2

    .line 158
    iget-object v0, v2, Lorg/spongycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v3, v0, [Lorg/spongycastle/asn1/ASN1OctetString;

    .line 160
    :goto_2
    array-length v0, v3

    if-eq v1, v0, :cond_3

    .line 162
    invoke-virtual {v2, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    aput-object v0, v3, v1

    .line 160
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 165
    :cond_3
    new-instance v0, Lorg/spongycastle/asn1/BEROctetString;

    invoke-direct {v0, v3}, Lorg/spongycastle/asn1/BEROctetString;-><init>([Lorg/spongycastle/asn1/ASN1OctetString;)V

    goto :goto_1

    .line 167
    :sswitch_1
    iget-boolean v0, p0, Lorg/spongycastle/asn1/ASN1InputStream;->b:Z

    if-eqz v0, :cond_4

    .line 169
    new-instance v0, Lorg/spongycastle/asn1/h;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/h;-><init>([B)V

    goto :goto_1

    .line 173
    :cond_4
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;)Lorg/spongycastle/asn1/ASN1EncodableVector;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/d;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    goto :goto_1

    .line 176
    :sswitch_2
    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;)Lorg/spongycastle/asn1/ASN1EncodableVector;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/d;->b(Lorg/spongycastle/asn1/ASN1EncodableVector;)Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v0

    goto :goto_1

    .line 178
    :sswitch_3
    new-instance v0, Lorg/spongycastle/asn1/DERExternal;

    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;)Lorg/spongycastle/asn1/ASN1EncodableVector;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERExternal;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    goto :goto_1

    .line 184
    :cond_5
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1InputStream;->c:[[B

    invoke-static {p2, v2, v0}, Lorg/spongycastle/asn1/ASN1InputStream;->a(ILorg/spongycastle/asn1/e;[[B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto/16 :goto_1

    .line 151
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x8 -> :sswitch_3
        0x10 -> :sswitch_1
        0x11 -> :sswitch_2
    .end sparse-switch
.end method

.method static a(ILorg/spongycastle/asn1/e;[[B)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 424
    packed-switch p0, :pswitch_data_0

    .line 463
    :pswitch_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " encountered"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 427
    :pswitch_1
    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->a()I

    move-result v0

    invoke-static {v0, p1}, Lorg/spongycastle/asn1/DERBitString;->a(ILjava/io/InputStream;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    .line 461
    :goto_0
    return-object v0

    .line 429
    :pswitch_2
    new-instance v0, Lorg/spongycastle/asn1/DERBMPString;

    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1InputStream;->b(Lorg/spongycastle/asn1/e;)[C

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERBMPString;-><init>([C)V

    goto :goto_0

    .line 431
    :pswitch_3
    invoke-static {p1, p2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;[[B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Boolean;->b([B)Lorg/spongycastle/asn1/ASN1Boolean;

    move-result-object v0

    goto :goto_0

    .line 433
    :pswitch_4
    invoke-static {p1, p2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;[[B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Enumerated;->b([B)Lorg/spongycastle/asn1/ASN1Enumerated;

    move-result-object v0

    goto :goto_0

    .line 435
    :pswitch_5
    new-instance v0, Lorg/spongycastle/asn1/ASN1GeneralizedTime;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1GeneralizedTime;-><init>([B)V

    goto :goto_0

    .line 437
    :pswitch_6
    new-instance v0, Lorg/spongycastle/asn1/DERGeneralString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERGeneralString;-><init>([B)V

    goto :goto_0

    .line 439
    :pswitch_7
    new-instance v0, Lorg/spongycastle/asn1/DERIA5String;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERIA5String;-><init>([B)V

    goto :goto_0

    .line 441
    :pswitch_8
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>([B)V

    goto :goto_0

    .line 443
    :pswitch_9
    sget-object v0, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    goto :goto_0

    .line 445
    :pswitch_a
    new-instance v0, Lorg/spongycastle/asn1/DERNumericString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERNumericString;-><init>([B)V

    goto :goto_0

    .line 447
    :pswitch_b
    invoke-static {p1, p2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Lorg/spongycastle/asn1/e;[[B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->b([B)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    goto :goto_0

    .line 449
    :pswitch_c
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    goto :goto_0

    .line 451
    :pswitch_d
    new-instance v0, Lorg/spongycastle/asn1/DERPrintableString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERPrintableString;-><init>([B)V

    goto :goto_0

    .line 453
    :pswitch_e
    new-instance v0, Lorg/spongycastle/asn1/DERT61String;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERT61String;-><init>([B)V

    goto :goto_0

    .line 455
    :pswitch_f
    new-instance v0, Lorg/spongycastle/asn1/DERUniversalString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERUniversalString;-><init>([B)V

    goto/16 :goto_0

    .line 457
    :pswitch_10
    new-instance v0, Lorg/spongycastle/asn1/ASN1UTCTime;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1UTCTime;-><init>([B)V

    goto/16 :goto_0

    .line 459
    :pswitch_11
    new-instance v0, Lorg/spongycastle/asn1/DERUTF8String;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERUTF8String;-><init>([B)V

    goto/16 :goto_0

    .line 461
    :pswitch_12
    new-instance v0, Lorg/spongycastle/asn1/DERVisibleString;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERVisibleString;-><init>([B)V

    goto/16 :goto_0

    .line 424
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_8
        :pswitch_1
        :pswitch_c
        :pswitch_9
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_d
        :pswitch_e
        :pswitch_0
        :pswitch_7
        :pswitch_10
        :pswitch_5
        :pswitch_0
        :pswitch_12
        :pswitch_6
        :pswitch_f
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private static a(Lorg/spongycastle/asn1/e;[[B)[B
    .locals 3

    .prologue
    .line 374
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->a()I

    move-result v1

    .line 375
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->a()I

    move-result v0

    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 377
    aget-object v0, p1, v1

    .line 379
    if-nez v0, :cond_0

    .line 381
    new-array v0, v1, [B

    aput-object v0, p1, v1

    .line 384
    :cond_0
    invoke-static {p0, v0}, Lorg/spongycastle/util/io/Streams;->a(Ljava/io/InputStream;[B)I

    .line 390
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->b()[B

    move-result-object v0

    goto :goto_0
.end method

.method static b(Ljava/io/InputStream;I)I
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 323
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 324
    if-gez v0, :cond_0

    .line 326
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found when length expected"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 329
    :cond_0
    const/16 v2, 0x80

    if-ne v0, v2, :cond_2

    .line 331
    const/4 v0, -0x1

    .line 368
    :cond_1
    return v0

    .line 334
    :cond_2
    const/16 v2, 0x7f

    if-le v0, v2, :cond_1

    .line 336
    and-int/lit8 v3, v0, 0x7f

    .line 339
    const/4 v0, 0x4

    if-le v3, v0, :cond_3

    .line 341
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DER length more than 4 bytes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v0, v1

    .line 345
    :goto_0
    if-ge v1, v3, :cond_5

    .line 347
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 349
    if-gez v2, :cond_4

    .line 351
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found reading length"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 354
    :cond_4
    shl-int/lit8 v0, v0, 0x8

    add-int/2addr v2, v0

    .line 345
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_0

    .line 357
    :cond_5
    if-gez v0, :cond_6

    .line 359
    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - negative length found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 362
    :cond_6
    if-lt v0, p1, :cond_1

    .line 364
    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - out of bounds length found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static b(Lorg/spongycastle/asn1/e;)[C
    .locals 6

    .prologue
    .line 397
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->a()I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    .line 398
    new-array v3, v2, [C

    .line 399
    const/4 v0, 0x0

    .line 400
    :goto_0
    if-ge v0, v2, :cond_0

    .line 402
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->read()I

    move-result v4

    .line 403
    if-ltz v4, :cond_0

    .line 405
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->read()I

    move-result v5

    .line 408
    if-ltz v5, :cond_0

    .line 410
    add-int/lit8 v1, v0, 0x1

    shl-int/lit8 v4, v4, 0x8

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v3, v0

    move v0, v1

    .line 413
    goto :goto_0

    .line 415
    :cond_0
    return-object v3
.end method

.method private c()I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Lorg/spongycastle/asn1/ASN1InputStream;->a:I

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1InputStream;->b(Ljava/io/InputStream;I)I

    move-result v0

    return v0
.end method


# virtual methods
.method final a()I
    .locals 1

    .prologue
    .line 106
    iget v0, p0, Lorg/spongycastle/asn1/ASN1InputStream;->a:I

    return v0
.end method

.method public final b()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 210
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1InputStream;->read()I

    move-result v2

    .line 211
    if-gtz v2, :cond_1

    .line 213
    if-nez v2, :cond_0

    .line 215
    new-instance v0, Ljava/io/IOException;

    const-string v1, "unexpected end-of-contents marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_0
    const/4 v0, 0x0

    .line 272
    :goto_0
    return-object v0

    .line 224
    :cond_1
    invoke-static {p0, v2}, Lorg/spongycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;I)I

    move-result v3

    .line 226
    and-int/lit8 v0, v2, 0x20

    if-eqz v0, :cond_2

    move v0, v1

    .line 231
    :goto_1
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1InputStream;->c()I

    move-result v4

    .line 233
    if-gez v4, :cond_6

    .line 235
    if-nez v0, :cond_3

    .line 237
    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 226
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 240
    :cond_3
    new-instance v0, Lorg/spongycastle/asn1/f;

    iget v4, p0, Lorg/spongycastle/asn1/ASN1InputStream;->a:I

    invoke-direct {v0, p0, v4}, Lorg/spongycastle/asn1/f;-><init>(Ljava/io/InputStream;I)V

    .line 241
    new-instance v4, Lorg/spongycastle/asn1/ASN1StreamParser;

    iget v5, p0, Lorg/spongycastle/asn1/ASN1InputStream;->a:I

    invoke-direct {v4, v0, v5}, Lorg/spongycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    .line 243
    and-int/lit8 v0, v2, 0x40

    if-eqz v0, :cond_4

    .line 245
    new-instance v0, Lorg/spongycastle/asn1/BERApplicationSpecificParser;

    invoke-direct {v0, v3, v4}, Lorg/spongycastle/asn1/BERApplicationSpecificParser;-><init>(ILorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/BERApplicationSpecificParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 248
    :cond_4
    and-int/lit16 v0, v2, 0x80

    if-eqz v0, :cond_5

    .line 250
    new-instance v0, Lorg/spongycastle/asn1/BERTaggedObjectParser;

    invoke-direct {v0, v1, v3, v4}, Lorg/spongycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/BERTaggedObjectParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 254
    :cond_5
    sparse-switch v3, :sswitch_data_0

    .line 265
    new-instance v0, Ljava/io/IOException;

    const-string v1, "unknown BER object encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 257
    :sswitch_0
    new-instance v0, Lorg/spongycastle/asn1/BEROctetStringParser;

    invoke-direct {v0, v4}, Lorg/spongycastle/asn1/BEROctetStringParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/BEROctetStringParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 259
    :sswitch_1
    new-instance v0, Lorg/spongycastle/asn1/BERSequenceParser;

    invoke-direct {v0, v4}, Lorg/spongycastle/asn1/BERSequenceParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/BERSequenceParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 261
    :sswitch_2
    new-instance v0, Lorg/spongycastle/asn1/BERSetParser;

    invoke-direct {v0, v4}, Lorg/spongycastle/asn1/BERSetParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/BERSetParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 263
    :sswitch_3
    new-instance v0, Lorg/spongycastle/asn1/DERExternalParser;

    invoke-direct {v0, v4}, Lorg/spongycastle/asn1/DERExternalParser;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERExternalParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0

    .line 272
    :cond_6
    :try_start_0
    invoke-direct {p0, v2, v3, v4}, Lorg/spongycastle/asn1/ASN1InputStream;->a(III)Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 274
    :catch_0
    move-exception v0

    .line 276
    new-instance v1, Lorg/spongycastle/asn1/ASN1Exception;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 254
    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x8 -> :sswitch_3
        0x10 -> :sswitch_1
        0x11 -> :sswitch_2
    .end sparse-switch
.end method
