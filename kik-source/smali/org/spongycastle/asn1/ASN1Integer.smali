.class public Lorg/spongycastle/asn1/ASN1Integer;
.super Lorg/spongycastle/asn1/DERInteger;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/DERInteger;-><init>(I)V

    .line 21
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    .line 16
    return-void
.end method

.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/DERInteger;-><init>([B)V

    .line 11
    return-void
.end method
