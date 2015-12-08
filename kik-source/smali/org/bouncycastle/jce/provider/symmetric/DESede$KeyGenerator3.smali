.class public Lorg/bouncycastle/jce/provider/symmetric/DESede$KeyGenerator3;
.super Lorg/bouncycastle/jce/provider/JCEKeyGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/DESede;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "KeyGenerator3"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "DESede3"

    const/16 v1, 0xc0

    new-instance v2, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/generators/DESedeKeyGenerator;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEKeyGenerator;-><init>(Ljava/lang/String;ILorg/bouncycastle/crypto/CipherKeyGenerator;)V

    return-void
.end method
