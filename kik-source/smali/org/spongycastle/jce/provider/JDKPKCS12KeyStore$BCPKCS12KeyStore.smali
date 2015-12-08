.class public Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore;
.super Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BCPKCS12KeyStore"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 1545
    invoke-static {}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a()Ljava/security/Provider;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore;->bs:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore;->bv:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {p0, v0, v1, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;-><init>(Ljava/security/Provider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 1546
    return-void
.end method
