.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithMD5AndRC2;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithMD5AndRC2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    const/16 v6, 0x40

    const/4 v4, 0x0

    .line 299
    const-string v1, "PBEwithMD5andRC2"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const/4 v3, 0x1

    move-object v0, p0

    move v5, v4

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;ZIIII)V

    .line 300
    return-void
.end method
