.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECDSA;
.super Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ECDSA"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ECDSA"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;-><init>(Ljava/lang/String;)V

    return-void
.end method
