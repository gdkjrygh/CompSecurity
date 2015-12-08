.class public Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mac;
.super Lorg/bouncycastle/jce/provider/JCEMac;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/VMPC;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mac"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/macs/VMPCMac;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/macs/VMPCMac;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JCEMac;-><init>(Lorg/bouncycastle/crypto/Mac;)V

    return-void
.end method
