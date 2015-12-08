.class public abstract Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;
.super Ljava/security/KeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DH;,
        Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;,
        Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;,
        Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;,
        Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    return-void
.end method
