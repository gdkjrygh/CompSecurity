.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndRC2;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithMD2AndRC2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 8

    const/16 v6, 0x40

    const-string v1, "PBEwithMD2andRC2"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x5

    move-object v0, p0

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;ZIIII)V

    return-void
.end method
