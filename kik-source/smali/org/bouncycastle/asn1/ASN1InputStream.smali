.class public Lorg/bouncycastle/asn1/ASN1InputStream;
.super Ljava/io/FilterInputStream;

# interfaces
.implements Lorg/bouncycastle/asn1/DERTags;


# instance fields
.field private final a:I

.field private final b:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    iput p2, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->a:I

    iput-boolean p3, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->b:Z

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v1, p1

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>([BB)V
    .locals 3

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v1, p1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method static a(Ljava/io/InputStream;)I
    .locals 1

    instance-of v0, p0, Lorg/bouncycastle/asn1/g;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/g;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/g;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    instance-of v0, p0, Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    goto :goto_0

    :cond_1
    const v0, 0x7fffffff

    goto :goto_0
.end method

.method static a(Ljava/io/InputStream;I)I
    .locals 3

    and-int/lit8 v0, p1, 0x1f

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    and-int/lit8 v2, v0, 0x7f

    if-nez v2, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - invalid high tag number found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :goto_0
    if-ltz v0, :cond_1

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_1

    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x7

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    goto :goto_0

    :cond_1
    if-gez v0, :cond_2

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found inside tag value."

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v0, v1

    :cond_3
    return v0
.end method

.method private static a(Lorg/bouncycastle/asn1/d;)Lorg/bouncycastle/asn1/ASN1EncodableVector;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method static a(I[B)Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Lorg/bouncycastle/asn1/DERUnknownTag;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lorg/bouncycastle/asn1/DERUnknownTag;-><init>(ZI[B)V

    :goto_0
    return-object v0

    :pswitch_1
    invoke-static {p1}, Lorg/bouncycastle/asn1/DERBitString;->b([B)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    new-instance v0, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>([B)V

    goto :goto_0

    :pswitch_3
    new-instance v0, Lorg/bouncycastle/asn1/ASN1Boolean;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1Boolean;-><init>([B)V

    goto :goto_0

    :pswitch_4
    new-instance v0, Lorg/bouncycastle/asn1/ASN1Enumerated;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1Enumerated;-><init>([B)V

    goto :goto_0

    :pswitch_5
    new-instance v0, Lorg/bouncycastle/asn1/ASN1GeneralizedTime;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1GeneralizedTime;-><init>([B)V

    goto :goto_0

    :pswitch_6
    new-instance v0, Lorg/bouncycastle/asn1/DERGeneralString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERGeneralString;-><init>([B)V

    goto :goto_0

    :pswitch_7
    new-instance v0, Lorg/bouncycastle/asn1/DERIA5String;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERIA5String;-><init>([B)V

    goto :goto_0

    :pswitch_8
    new-instance v0, Lorg/bouncycastle/asn1/ASN1Integer;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>([B)V

    goto :goto_0

    :pswitch_9
    sget-object v0, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    goto :goto_0

    :pswitch_a
    new-instance v0, Lorg/bouncycastle/asn1/DERNumericString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERNumericString;-><init>([B)V

    goto :goto_0

    :pswitch_b
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>([B)V

    goto :goto_0

    :pswitch_c
    new-instance v0, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    goto :goto_0

    :pswitch_d
    new-instance v0, Lorg/bouncycastle/asn1/DERPrintableString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERPrintableString;-><init>([B)V

    goto :goto_0

    :pswitch_e
    new-instance v0, Lorg/bouncycastle/asn1/DERT61String;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERT61String;-><init>([B)V

    goto :goto_0

    :pswitch_f
    new-instance v0, Lorg/bouncycastle/asn1/DERUniversalString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERUniversalString;-><init>([B)V

    goto :goto_0

    :pswitch_10
    new-instance v0, Lorg/bouncycastle/asn1/ASN1UTCTime;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/ASN1UTCTime;-><init>([B)V

    goto :goto_0

    :pswitch_11
    new-instance v0, Lorg/bouncycastle/asn1/DERUTF8String;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERUTF8String;-><init>([B)V

    goto :goto_0

    :pswitch_12
    new-instance v0, Lorg/bouncycastle/asn1/DERVisibleString;

    invoke-direct {v0, p1}, Lorg/bouncycastle/asn1/DERVisibleString;-><init>([B)V

    goto :goto_0

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

.method private b()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->a:I

    invoke-static {p0, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->b(Ljava/io/InputStream;I)I

    move-result v0

    return v0
.end method

.method static b(Ljava/io/InputStream;I)I
    .locals 4

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found when length expected"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/16 v2, 0x80

    if-ne v0, v2, :cond_2

    const/4 v0, -0x1

    :cond_1
    return v0

    :cond_2
    const/16 v2, 0x7f

    if-le v0, v2, :cond_1

    and-int/lit8 v3, v0, 0x7f

    const/4 v0, 0x4

    if-le v3, v0, :cond_3

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

    :goto_0
    if-ge v1, v3, :cond_5

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    if-gez v2, :cond_4

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "EOF found reading length"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    shl-int/lit8 v0, v0, 0x8

    add-int/2addr v2, v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_5
    if-gez v0, :cond_6

    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - negative length found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-lt v0, p1, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "corrupted stream - out of bounds length found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/asn1/DERObject;
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1InputStream;->read()I

    move-result v3

    if-gtz v3, :cond_1

    if-nez v3, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "unexpected end-of-contents marker"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {p0, v3}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Ljava/io/InputStream;I)I

    move-result v4

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1InputStream;->b()I

    move-result v5

    if-gez v5, :cond_6

    if-nez v0, :cond_3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "indefinite length primitive encoding encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    new-instance v0, Lorg/bouncycastle/asn1/e;

    iget v2, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->a:I

    invoke-direct {v0, p0, v2}, Lorg/bouncycastle/asn1/e;-><init>(Ljava/io/InputStream;I)V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1StreamParser;

    iget v5, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->a:I

    invoke-direct {v2, v0, v5}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;I)V

    and-int/lit8 v0, v3, 0x40

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;

    invoke-direct {v0, v4, v2}, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;-><init>(ILorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :cond_4
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_5

    new-instance v0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;

    invoke-direct {v0, v1, v4, v2}, Lorg/bouncycastle/asn1/BERTaggedObjectParser;-><init>(ZILorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :cond_5
    sparse-switch v4, :sswitch_data_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "unknown BER object encountered"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    new-instance v0, Lorg/bouncycastle/asn1/BEROctetStringParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BEROctetStringParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BEROctetStringParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lorg/bouncycastle/asn1/BERSequenceParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BERSequenceParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BERSequenceParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Lorg/bouncycastle/asn1/BERSetParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/BERSetParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/BERSetParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Lorg/bouncycastle/asn1/DERExternalParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/DERExternalParser;-><init>(Lorg/bouncycastle/asn1/ASN1StreamParser;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERExternalParser;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0

    :cond_6
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_7

    :goto_2
    :try_start_0
    new-instance v2, Lorg/bouncycastle/asn1/d;

    invoke-direct {v2, p0, v5}, Lorg/bouncycastle/asn1/d;-><init>(Ljava/io/InputStream;I)V

    and-int/lit8 v0, v3, 0x40

    if-eqz v0, :cond_8

    new-instance v0, Lorg/bouncycastle/asn1/DERApplicationSpecific;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v2

    invoke-direct {v0, v1, v4, v2}, Lorg/bouncycastle/asn1/DERApplicationSpecific;-><init>(ZI[B)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1Exception;

    const-string v2, "corrupted stream detected"

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_7
    move v1, v2

    goto :goto_2

    :cond_8
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_9

    :try_start_1
    new-instance v0, Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/ASN1StreamParser;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0, v1, v4}, Lorg/bouncycastle/asn1/ASN1StreamParser;->a(ZI)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    if-eqz v1, :cond_b

    sparse-switch v4, :sswitch_data_1

    new-instance v0, Lorg/bouncycastle/asn1/DERUnknownTag;

    const/4 v1, 0x1

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v2

    invoke-direct {v0, v1, v4, v2}, Lorg/bouncycastle/asn1/DERUnknownTag;-><init>(ZI[B)V

    goto/16 :goto_0

    :sswitch_4
    new-instance v0, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Lorg/bouncycastle/asn1/d;)Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v1

    iget-object v1, v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a:Ljava/util/Vector;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/BERConstructedOctetString;-><init>(Ljava/util/Vector;)V

    goto/16 :goto_0

    :sswitch_5
    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ASN1InputStream;->b:Z

    if-eqz v0, :cond_a

    new-instance v0, Lorg/bouncycastle/asn1/LazyDERSequence;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/LazyDERSequence;-><init>([B)V

    goto/16 :goto_0

    :cond_a
    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Lorg/bouncycastle/asn1/d;)Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/c;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/DERSequence;

    move-result-object v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Lorg/bouncycastle/asn1/d;)Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/c;->b(Lorg/bouncycastle/asn1/ASN1EncodableVector;)Lorg/bouncycastle/asn1/DERSet;

    move-result-object v0

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Lorg/bouncycastle/asn1/DERExternal;

    invoke-static {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(Lorg/bouncycastle/asn1/d;)Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERExternal;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/d;->b()[B

    move-result-object v0

    invoke-static {v4, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a(I[B)Lorg/bouncycastle/asn1/DERObject;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x8 -> :sswitch_3
        0x10 -> :sswitch_1
        0x11 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x4 -> :sswitch_4
        0x8 -> :sswitch_7
        0x10 -> :sswitch_5
        0x11 -> :sswitch_6
    .end sparse-switch
.end method
