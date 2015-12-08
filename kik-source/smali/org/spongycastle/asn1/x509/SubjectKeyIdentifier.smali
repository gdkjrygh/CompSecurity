.class public Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 76
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 77
    new-instance v0, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/spongycastle/asn1/DERBitString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v2

    array-length v3, v2

    invoke-interface {v0, v2, v4, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    invoke-interface {v0, v1, v4}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    .line 78
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;->a:[B

    return-object v0
.end method
