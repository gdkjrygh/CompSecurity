.class public Lorg/spongycastle/crypto/signers/RSADigestSigner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Signer;


# static fields
.field private static final b:Ljava/util/Hashtable;


# instance fields
.field private final a:Lorg/spongycastle/crypto/Digest;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 35
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 42
    sput-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "RIPEMD256"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "SHA-1"

    sget-object v2, Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "SHA-224"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "SHA-256"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "SHA-384"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "SHA-512"

    sget-object v2, Lorg/spongycastle/asn1/nist/NISTObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "MD2"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "MD4"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->b:Ljava/util/Hashtable;

    const-string v1, "MD5"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    return-void
.end method


# virtual methods
.method public final a(B)V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 119
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/RSADigestSigner;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 130
    return-void
.end method
