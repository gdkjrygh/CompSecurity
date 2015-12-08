.class public Lorg/spongycastle/x509/extension/X509ExtensionUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 29
    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    .line 31
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method
