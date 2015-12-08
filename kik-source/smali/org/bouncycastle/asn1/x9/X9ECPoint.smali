.class public Lorg/bouncycastle/asn1/x9/X9ECPoint;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/math/ec/ECPoint;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/asn1/ASN1OctetString;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/bouncycastle/math/ec/ECCurve;->a([B)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECPoint;->a:Lorg/bouncycastle/math/ec/ECPoint;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/math/ec/ECPoint;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/x9/X9ECPoint;->a:Lorg/bouncycastle/math/ec/ECPoint;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECPoint;->a:Lorg/bouncycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/bouncycastle/math/ec/ECPoint;->f()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public final e()Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X9ECPoint;->a:Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method
