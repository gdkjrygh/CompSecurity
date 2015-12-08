.class public Lorg/spongycastle/asn1/esf/CrlOcspRef;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/esf/CrlListID;

.field private b:Lorg/spongycastle/asn1/esf/OcspListID;

.field private c:Lorg/spongycastle/asn1/esf/OtherRevRefs;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 91
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 92
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->a:Lorg/spongycastle/asn1/esf/CrlListID;

    if-eqz v1, :cond_0

    .line 94
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->a:Lorg/spongycastle/asn1/esf/CrlListID;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/esf/CrlListID;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 96
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->b:Lorg/spongycastle/asn1/esf/OcspListID;

    if-eqz v1, :cond_1

    .line 98
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->b:Lorg/spongycastle/asn1/esf/OcspListID;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/esf/OcspListID;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-direct {v1, v4, v4, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 100
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->c:Lorg/spongycastle/asn1/esf/OtherRevRefs;

    if-eqz v1, :cond_2

    .line 102
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/esf/CrlOcspRef;->c:Lorg/spongycastle/asn1/esf/OtherRevRefs;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/esf/OtherRevRefs;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-direct {v1, v4, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 104
    :cond_2
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
