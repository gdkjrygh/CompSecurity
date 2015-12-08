.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithMD2AndDES;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithMD2AndDES"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 6

    const-string v1, "PBEwithMD2andDES"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->s_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/16 v5, 0x40

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;III)V

    return-void
.end method
