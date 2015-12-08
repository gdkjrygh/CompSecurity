.class public Lorg/bouncycastle/crypto/tls/Certificate;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lorg/bouncycastle/crypto/tls/Certificate;


# instance fields
.field protected b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/Certificate;

    const/4 v1, 0x0

    new-array v1, v1, [Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/Certificate;-><init>([Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    sput-object v0, Lorg/bouncycastle/crypto/tls/Certificate;->a:Lorg/bouncycastle/crypto/tls/Certificate;

    return-void
.end method

.method public constructor <init>([Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'certs\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    return-void
.end method

.method protected static parse(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/tls/Certificate;
    .locals 4

    invoke-static {p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint24(Ljava/io/InputStream;)I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lorg/bouncycastle/crypto/tls/Certificate;->a:Lorg/bouncycastle/crypto/tls/Certificate;

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    :cond_1
    if-lez v0, :cond_2

    invoke-static {p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint24(Ljava/io/InputStream;)I

    move-result v1

    add-int/lit8 v3, v1, 0x3

    sub-int/2addr v0, v3

    new-array v1, v1, [B

    invoke-static {v1, p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readFully([BLjava/io/InputStream;)V

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v1, v3}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v1

    if-lez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sorry, there is garbage data left after the certificate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v3, v0, [Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    aput-object v0, v3, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    new-instance v0, Lorg/bouncycastle/crypto/tls/Certificate;

    invoke-direct {v0, v3}, Lorg/bouncycastle/crypto/tls/Certificate;-><init>([Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)V

    goto :goto_0
.end method


# virtual methods
.method protected encode(Ljava/io/OutputStream;)V
    .locals 6

    const/4 v1, 0x0

    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    move v0, v1

    move v2, v1

    :goto_0
    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v4, v4

    if-ge v0, v4, :cond_0

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    aget-object v4, v4, v0

    const-string v5, "DER"

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    array-length v4, v4

    add-int/lit8 v4, v4, 0x3

    add-int/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v2, 0x3

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-static {v2, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    :goto_1
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque24([BLjava/io/OutputStream;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public getCerts()[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v0, v0

    new-array v0, v0, [Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
