.class public Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA224WithRSAEncryption;
.super Lorg/bouncycastle/jce/provider/JDKDigestSignature;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKDigestSignature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SHA224WithRSAEncryption"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v1, Lorg/bouncycastle/crypto/digests/SHA224Digest;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/digests/SHA224Digest;-><init>()V

    new-instance v2, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    new-instance v3, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jce/provider/JDKDigestSignature;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    return-void
.end method
