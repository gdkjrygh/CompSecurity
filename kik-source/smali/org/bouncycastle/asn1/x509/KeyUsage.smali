.class public Lorg/bouncycastle/asn1/x509/KeyUsage;
.super Lorg/bouncycastle/asn1/DERBitString;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/KeyUsage;->b(I)[B

    move-result-object v0

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/KeyUsage;->a(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/asn1/DERBitString;-><init>([BI)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DERBitString;)V
    .locals 2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/DERBitString;->f()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/asn1/DERBitString;-><init>([BI)V

    return-void
.end method

.method public static b(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;
    .locals 2

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/KeyUsage;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/bouncycastle/asn1/x509/KeyUsage;

    :goto_0
    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/X509Extension;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyUsage;

    check-cast p0, Lorg/bouncycastle/asn1/x509/X509Extension;

    invoke-static {p0}, Lorg/bouncycastle/asn1/x509/X509Extension;->a(Lorg/bouncycastle/asn1/x509/X509Extension;)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyUsage;-><init>(Lorg/bouncycastle/asn1/DERBitString;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyUsage;

    invoke-static {p0}, Lorg/bouncycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyUsage;-><init>(Lorg/bouncycastle/asn1/DERBitString;)V

    move-object p0, v0

    goto :goto_0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/KeyUsage;->a:[B

    array-length v0, v0

    if-ne v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyUsage: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/KeyUsage;->a:[B

    aget-byte v1, v1, v3

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyUsage: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/KeyUsage;->a:[B

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    iget-object v2, p0, Lorg/bouncycastle/asn1/x509/KeyUsage;->a:[B

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
