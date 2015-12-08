.class public Lorg/bouncycastle/asn1/x509/Holder;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

.field b:Lorg/bouncycastle/asn1/x509/GeneralNames;

.field c:Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

.field private d:I


# direct methods
.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 4

    const/4 v3, 0x1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput v3, p0, Lorg/bouncycastle/asn1/x509/Holder;->d:I

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1TaggedObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in Holder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_1
    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/Holder;->c:Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    goto :goto_1

    :cond_1
    iput v3, p0, Lorg/bouncycastle/asn1/x509/Holder;->d:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private constructor <init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->d:I

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1TaggedObject;->e()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown tag in Holder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/IssuerSerial;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/IssuerSerial;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->d:I

    return-void

    :pswitch_1
    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/GeneralNames;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Holder;
    .locals 3

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/Holder;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/Holder;

    :goto_0
    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/Holder;

    check-cast p0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/Holder;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x509/Holder;

    check-cast p0, Lorg/bouncycastle/asn1/ASN1TaggedObject;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/x509/Holder;-><init>(Lorg/bouncycastle/asn1/ASN1TaggedObject;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown object in factory: "

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


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 5

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->d:I

    if-ne v0, v3, :cond_3

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    invoke-direct {v0, v4, v4, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    invoke-direct {v0, v4, v3, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->c:Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/Holder;->c:Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    invoke-direct {v0, v4, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    :goto_0
    return-object v0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    invoke-direct {v0, v4, v3, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    invoke-direct {v0, v4, v4, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_0
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/IssuerSerial;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->a:Lorg/bouncycastle/asn1/x509/IssuerSerial;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/asn1/x509/GeneralNames;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->b:Lorg/bouncycastle/asn1/x509/GeneralNames;

    return-object v0
.end method

.method public final g()Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/Holder;->c:Lorg/bouncycastle/asn1/x509/ObjectDigestInfo;

    return-object v0
.end method
