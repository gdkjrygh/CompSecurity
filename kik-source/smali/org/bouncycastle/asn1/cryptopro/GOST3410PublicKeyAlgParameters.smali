.class public Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private c:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 2

    const/4 v1, 0x2

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    if-le v0, v1, :cond_0

    invoke-virtual {p1, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object p2, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object p2, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object p3, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method

.method public final g()Lorg/bouncycastle/asn1/DERObjectIdentifier;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method
