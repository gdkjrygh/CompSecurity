.class public Lorg/bouncycastle/asn1/pkcs/Pfx;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;


# instance fields
.field private by:Lorg/bouncycastle/asn1/pkcs/ContentInfo;

.field private bz:Lorg/bouncycastle/asn1/pkcs/MacData;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 2

    const/4 v1, 0x3

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "wrong version for PFX PDU"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->by:Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/MacData;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/MacData;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    :cond_1
    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/pkcs/ContentInfo;Lorg/bouncycastle/asn1/pkcs/MacData;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    iput-object p1, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->by:Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    iput-object p2, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->by:Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/BERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/pkcs/ContentInfo;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->by:Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    return-object v0
.end method

.method public final f()Lorg/bouncycastle/asn1/pkcs/MacData;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/pkcs/Pfx;->bz:Lorg/bouncycastle/asn1/pkcs/MacData;

    return-object v0
.end method
