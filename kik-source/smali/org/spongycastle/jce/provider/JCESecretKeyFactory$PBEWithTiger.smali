.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEWithTiger;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBEWithTiger"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 443
    const-string v1, "PBEwithHmacTiger"

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/16 v6, 0xc0

    move-object v0, p0

    move v7, v3

    invoke-direct/range {v0 .. v7}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory$PBEKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;ZIIII)V

    .line 444
    return-void
.end method
