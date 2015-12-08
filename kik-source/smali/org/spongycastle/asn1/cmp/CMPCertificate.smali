.class public Lorg/spongycastle/asn1/cmp/CMPCertificate;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/Certificate;

.field private b:Lorg/spongycastle/asn1/x509/AttributeCertificate;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 85
    iget-object v0, p0, Lorg/spongycastle/asn1/cmp/CMPCertificate;->b:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    if-eqz v0, :cond_0

    .line 87
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CMPCertificate;->b:Lorg/spongycastle/asn1/x509/AttributeCertificate;

    invoke-direct {v0, v2, v2, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 90
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/cmp/CMPCertificate;->a:Lorg/spongycastle/asn1/x509/Certificate;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/Certificate;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    goto :goto_0
.end method
