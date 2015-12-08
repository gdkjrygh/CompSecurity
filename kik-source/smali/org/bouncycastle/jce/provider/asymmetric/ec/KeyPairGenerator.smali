.class public abstract Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;
.super Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECDH;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECDHC;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECDSA;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECGOST3410;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECMQV;
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;-><init>(Ljava/lang/String;)V

    return-void
.end method
