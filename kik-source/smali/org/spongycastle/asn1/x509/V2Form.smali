.class public Lorg/spongycastle/asn1/x509/V2Form;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/x509/GeneralNames;

.field b:Lorg/spongycastle/asn1/x509/IssuerSerial;

.field c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 49
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    const/4 v3, 0x3

    if-le v2, v3, :cond_0

    .line 51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    instance-of v2, v2, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-nez v2, :cond_1

    .line 59
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/V2Form;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    move v0, v1

    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-eq v0, v2, :cond_4

    .line 64
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/ASN1TaggedObject;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1TaggedObject;

    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v3

    if-nez v3, :cond_2

    .line 67
    invoke-static {v2}, Lorg/spongycastle/asn1/x509/IssuerSerial;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/IssuerSerial;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/V2Form;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    .line 62
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v3

    if-ne v3, v1, :cond_3

    .line 71
    invoke-static {v2}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/V2Form;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    goto :goto_1

    .line 75
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Bad tag number: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_4
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/V2Form;
    .locals 3

    .prologue
    .line 28
    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/spongycastle/asn1/x509/V2Form;

    if-eqz v0, :cond_1

    .line 30
    :cond_0
    check-cast p0, Lorg/spongycastle/asn1/x509/V2Form;

    .line 34
    :goto_0
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_2

    .line 34
    new-instance v0, Lorg/spongycastle/asn1/x509/V2Form;

    check-cast p0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v0, p0}, Lorg/spongycastle/asn1/x509/V2Form;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 37
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

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/V2Form;
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/V2Form;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/V2Form;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 111
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 113
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/V2Form;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    if-eqz v1, :cond_0

    .line 115
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/V2Form;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 118
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/V2Form;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    if-eqz v1, :cond_1

    .line 120
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/V2Form;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 123
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/V2Form;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    if-eqz v1, :cond_2

    .line 125
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/V2Form;->c:Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 128
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/V2Form;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/IssuerSerial;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/V2Form;->b:Lorg/spongycastle/asn1/x509/IssuerSerial;

    return-object v0
.end method
