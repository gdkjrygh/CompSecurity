.class public Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEWithRIPEMD160;
.super Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithRIPEMD160"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v4, 0x2

    const/4 v3, 0x0

    const-string v1, "PBEwithHmacRIPEMD160"

    const/4 v2, 0x0

    const/16 v6, 0xa0

    move-object v0, p0

    move v5, v4

    move v7, v3

    invoke-direct/range {v0 .. v7}, Lorg/bouncycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;-><init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;ZIIII)V

    return-void
.end method
