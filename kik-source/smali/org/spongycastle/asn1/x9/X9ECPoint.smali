.class public Lorg/spongycastle/asn1/x9/X9ECPoint;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/math/ec/ECPoint;


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/asn1/ASN1OctetString;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 28
    invoke-virtual {p2}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/spongycastle/math/ec/ECCurve;->a([B)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECPoint;->a:Lorg/spongycastle/math/ec/ECPoint;

    .line 29
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/math/ec/ECPoint;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/spongycastle/asn1/x9/X9ECPoint;->a:Lorg/spongycastle/math/ec/ECPoint;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lorg/spongycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9ECPoint;->a:Lorg/spongycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECPoint;->f()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public final c()Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9ECPoint;->a:Lorg/spongycastle/math/ec/ECPoint;

    return-object v0
.end method
