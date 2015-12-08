.class public Lorg/bouncycastle/asn1/esf/SignaturePolicyIdentifier;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/esf/SignaturePolicyId;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/esf/SignaturePolicyIdentifier;->b:Z

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/esf/SignaturePolicyIdentifier;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/DERNull;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/esf/SignaturePolicyIdentifier;->a:Lorg/bouncycastle/asn1/esf/SignaturePolicyId;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/esf/SignaturePolicyId;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    goto :goto_0
.end method
