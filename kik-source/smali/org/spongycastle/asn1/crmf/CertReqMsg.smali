.class public Lorg/spongycastle/asn1/crmf/CertReqMsg;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/crmf/CertRequest;

.field private b:Lorg/spongycastle/asn1/crmf/ProofOfPossession;

.field private c:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method private static a(Lorg/spongycastle/asn1/ASN1EncodableVector;Lorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 0

    .prologue
    .line 140
    if-eqz p1, :cond_0

    .line 142
    invoke-virtual {p0, p1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 144
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 128
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 130
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertReqMsg;->a:Lorg/spongycastle/asn1/crmf/CertRequest;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 132
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertReqMsg;->b:Lorg/spongycastle/asn1/crmf/ProofOfPossession;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/crmf/CertReqMsg;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 133
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/CertReqMsg;->c:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/crmf/CertReqMsg;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 135
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
