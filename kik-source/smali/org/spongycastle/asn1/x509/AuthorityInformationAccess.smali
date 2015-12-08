.class public Lorg/spongycastle/asn1/x509/AuthorityInformationAccess;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:[Lorg/spongycastle/asn1/x509/AccessDescription;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 87
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 89
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/AuthorityInformationAccess;->a:[Lorg/spongycastle/asn1/x509/AccessDescription;

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 91
    iget-object v2, p0, Lorg/spongycastle/asn1/x509/AuthorityInformationAccess;->a:[Lorg/spongycastle/asn1/x509/AccessDescription;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 89
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 94
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AuthorityInformationAccess: Oid("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/AuthorityInformationAccess;->a:[Lorg/spongycastle/asn1/x509/AccessDescription;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    iget-object v1, v1, Lorg/spongycastle/asn1/x509/AccessDescription;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
