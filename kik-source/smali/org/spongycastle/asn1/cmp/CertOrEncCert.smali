.class public Lorg/spongycastle/asn1/cmp/CertOrEncCert;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/spongycastle/asn1/cmp/CMPCertificate;

.field private b:Lorg/spongycastle/asn1/crmf/EncryptedValue;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 89
    iget-object v0, p0, Lorg/spongycastle/asn1/cmp/CertOrEncCert;->a:Lorg/spongycastle/asn1/cmp/CMPCertificate;

    if-eqz v0, :cond_0

    .line 91
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/spongycastle/asn1/cmp/CertOrEncCert;->a:Lorg/spongycastle/asn1/cmp/CMPCertificate;

    invoke-direct {v0, v3, v1, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 94
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v1, p0, Lorg/spongycastle/asn1/cmp/CertOrEncCert;->b:Lorg/spongycastle/asn1/crmf/EncryptedValue;

    invoke-direct {v0, v3, v3, v1}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method
