.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithSHAAndDES2Key;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithSHAAndDES2Key"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    .line 347
    const-string v1, "PBEwithSHAandDES2Key-CBC"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->bt:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/16 v5, 0x80

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;III)V

    .line 348
    return-void
.end method
