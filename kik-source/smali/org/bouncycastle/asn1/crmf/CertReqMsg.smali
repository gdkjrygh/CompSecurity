.class public Lorg/bouncycastle/asn1/crmf/CertReqMsg;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/crmf/CertRequest;

.field private b:Lorg/bouncycastle/asn1/crmf/ProofOfPossession;

.field private c:Lorg/bouncycastle/asn1/ASN1Sequence;


# direct methods
.method private static a(Lorg/bouncycastle/asn1/ASN1EncodableVector;Lorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/CertReqMsg;->a:Lorg/bouncycastle/asn1/crmf/CertRequest;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/CertReqMsg;->b:Lorg/bouncycastle/asn1/crmf/ProofOfPossession;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/crmf/CertReqMsg;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/CertReqMsg;->c:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/crmf/CertReqMsg;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
