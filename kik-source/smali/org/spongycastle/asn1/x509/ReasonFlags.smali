.class public Lorg/spongycastle/asn1/x509/ReasonFlags;
.super Lorg/spongycastle/asn1/DERBitString;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lorg/spongycastle/asn1/DERBitString;)V
    .locals 2

    .prologue
    .line 83
    invoke-virtual {p1}, Lorg/spongycastle/asn1/DERBitString;->c()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/DERBitString;->d()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/asn1/DERBitString;-><init>([BI)V

    .line 84
    return-void
.end method
