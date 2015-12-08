.class public Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V
    .locals 5

    const/4 v4, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->g()Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v2

    array-length v3, v2

    invoke-interface {v0, v2, v4, v3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v0, v1, v4}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    iput-object v1, p0, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public final e()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    return-object v0
.end method
