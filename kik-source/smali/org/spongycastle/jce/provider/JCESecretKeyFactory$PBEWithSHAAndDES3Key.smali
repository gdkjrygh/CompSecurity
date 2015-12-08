.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES3Key;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAndDES3Key"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    .line 335
    const-string v1, "PBEwithSHAandDES3Key-CBC"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->bs:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/16 v5, 0xc0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;III)V

    .line 336
    return-void
.end method
