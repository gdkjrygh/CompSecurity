.class public Lorg/bouncycastle/asn1/misc/NetscapeCertType;
.super Lorg/bouncycastle/asn1/DERBitString;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DERBitString;)V
    .locals 2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/DERBitString;->f()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/asn1/DERBitString;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NetscapeCertType: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/misc/NetscapeCertType;->a:[B

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
