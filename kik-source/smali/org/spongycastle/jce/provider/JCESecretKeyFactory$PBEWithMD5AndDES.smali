.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndDES;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithMD5AndDES"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 287
    const-string v1, "PBEwithMD5andDES"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const/16 v5, 0x40

    move-object v0, p0

    move v4, v3

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DESPBEKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;III)V

    .line 288
    return-void
.end method
