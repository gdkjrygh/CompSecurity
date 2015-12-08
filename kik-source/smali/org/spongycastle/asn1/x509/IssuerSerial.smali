.class public Lorg/spongycastle/asn1/x509/IssuerSerial;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/x509/GeneralNames;

.field b:Lorg/spongycastle/asn1/ASN1Integer;

.field c:Lorg/spongycastle/asn1/DERBitString;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x2

    .line 44
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 47
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

    .line 50
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralNames;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralNames;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    .line 51
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Integer;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->b:Lorg/spongycastle/asn1/ASN1Integer;

    .line 53
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 55
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->c:Lorg/spongycastle/asn1/DERBitString;

    .line 57
    :cond_1
    return-void
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/IssuerSerial;
    .locals 4

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/spongycastle/asn1/x509/IssuerSerial;

    if-eqz v1, :cond_1

    :cond_0
    check-cast v0, Lorg/spongycastle/asn1/x509/IssuerSerial;

    :goto_0
    return-object v0

    :cond_1
    instance-of v1, v0, Lorg/spongycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/spongycastle/asn1/x509/IssuerSerial;

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x509/IssuerSerial;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "illegal object in getInstance: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 94
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 96
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 97
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->b:Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 99
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->c:Lorg/spongycastle/asn1/DERBitString;

    if-eqz v1, :cond_0

    .line 101
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->c:Lorg/spongycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 104
    :cond_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/x509/GeneralNames;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->a:Lorg/spongycastle/asn1/x509/GeneralNames;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Integer;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/IssuerSerial;->b:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method
