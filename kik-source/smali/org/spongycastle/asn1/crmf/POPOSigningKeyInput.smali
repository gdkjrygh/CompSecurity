.class public Lorg/spongycastle/asn1/crmf/POPOSigningKeyInput;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/GeneralName;

.field private b:Lorg/spongycastle/asn1/crmf/PKMACValue;

.field private c:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 119
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 121
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/POPOSigningKeyInput;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    if-eqz v1, :cond_0

    .line 123
    new-instance v1, Lorg/spongycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/POPOSigningKeyInput;->a:Lorg/spongycastle/asn1/x509/GeneralName;

    invoke-direct {v1, v3, v3, v2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 130
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/POPOSigningKeyInput;->c:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 132
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1

    .line 127
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/POPOSigningKeyInput;->b:Lorg/spongycastle/asn1/crmf/PKMACValue;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method
