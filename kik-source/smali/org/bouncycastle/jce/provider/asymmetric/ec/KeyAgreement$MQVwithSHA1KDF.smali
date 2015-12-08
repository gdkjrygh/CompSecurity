.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement$MQVwithSHA1KDF;
.super Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MQVwithSHA1KDF"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    const-string v0, "ECMQVwithSHA1KDF"

    new-instance v1, Lorg/bouncycastle/crypto/agreement/ECMQVBasicAgreement;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/agreement/ECMQVBasicAgreement;-><init>()V

    new-instance v2, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;

    new-instance v3, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/agreement/kdf/ECDHKEKGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyAgreement;-><init>(Ljava/lang/String;Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;)V

    return-void
.end method
