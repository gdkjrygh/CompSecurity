.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$ECGOST3410;
.super Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ECGOST3410"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ECGOST3410"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/KeyPairGenerator$EC;-><init>(Ljava/lang/String;)V

    return-void
.end method
