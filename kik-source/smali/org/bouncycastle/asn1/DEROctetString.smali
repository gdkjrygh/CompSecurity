.class public Lorg/bouncycastle/asn1/DEROctetString;
.super Lorg/bouncycastle/asn1/ASN1OctetString;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DEREncodable;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/asn1/ASN1OctetString;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/asn1/ASN1OctetString;-><init>([B)V

    return-void
.end method


# virtual methods
.method a(Lorg/bouncycastle/asn1/DEROutputStream;)V
    .locals 2

    const/4 v0, 0x4

    iget-object v1, p0, Lorg/bouncycastle/asn1/DEROctetString;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/bouncycastle/asn1/DEROutputStream;->a(I[B)V

    return-void
.end method
