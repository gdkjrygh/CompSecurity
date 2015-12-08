.class public Lorg/spongycastle/asn1/x509/sigi/PersonalData;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;

.field private b:Ljava/math/BigInteger;

.field private c:Lorg/spongycastle/asn1/DERGeneralizedTime;

.field private d:Lorg/spongycastle/asn1/x500/DirectoryString;

.field private e:Ljava/lang/String;

.field private f:Lorg/spongycastle/asn1/x500/DirectoryString;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 190
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 191
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->a:Lorg/spongycastle/asn1/x509/sigi/NameOrPseudonym;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 192
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->b:Ljava/math/BigInteger;

    if-eqz v1, :cond_0

    .line 194
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->b:Ljava/math/BigInteger;

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    invoke-direct {v1, v5, v5, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 196
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->c:Lorg/spongycastle/asn1/DERGeneralizedTime;

    if-eqz v1, :cond_1

    .line 198
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->c:Lorg/spongycastle/asn1/DERGeneralizedTime;

    invoke-direct {v1, v5, v6, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 200
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->d:Lorg/spongycastle/asn1/x500/DirectoryString;

    if-eqz v1, :cond_2

    .line 202
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->d:Lorg/spongycastle/asn1/x500/DirectoryString;

    invoke-direct {v1, v6, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 204
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->e:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 206
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x3

    new-instance v3, Lorg/spongycastle/asn1/DERPrintableString;

    iget-object v4, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->e:Ljava/lang/String;

    invoke-direct {v3, v4, v6}, Lorg/spongycastle/asn1/DERPrintableString;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v1, v5, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 208
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->f:Lorg/spongycastle/asn1/x500/DirectoryString;

    if-eqz v1, :cond_4

    .line 210
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x4

    iget-object v3, p0, Lorg/spongycastle/asn1/x509/sigi/PersonalData;->f:Lorg/spongycastle/asn1/x500/DirectoryString;

    invoke-direct {v1, v6, v2, v3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 212
    :cond_4
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
