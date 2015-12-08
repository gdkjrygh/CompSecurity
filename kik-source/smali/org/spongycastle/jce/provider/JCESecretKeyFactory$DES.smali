.class public Lorg/spongycastle/jce/provider/JCESecretKeyFactory$DES;
.super Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JCESecretKeyFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DES"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 238
    const-string v0, "DES"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;-><init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;)V

    .line 239
    return-void
.end method


# virtual methods
.method protected engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    .locals 3

    .prologue
    .line 245
    instance-of v0, p1, Ljavax/crypto/spec/DESKeySpec;

    if-eqz v0, :cond_0

    .line 247
    check-cast p1, Ljavax/crypto/spec/DESKeySpec;

    .line 248
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/DESKeySpec;->getKey()[B

    move-result-object v1

    const-string v2, "DES"

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 251
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lorg/spongycastle/jce/provider/JCESecretKeyFactory;->engineGenerateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    goto :goto_0
.end method
