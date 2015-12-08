.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAnd128BitRC4;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAnd128BitRC4"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v3, 0x1

    const-string v1, "PBEWithSHAAnd128BitRC4"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bq:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v4, 0x2

    const/16 v6, 0x80

    const/4 v7, 0x0

    move-object v0, p0

    move v5, v3

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;ZIIII)V

    return-void
.end method
