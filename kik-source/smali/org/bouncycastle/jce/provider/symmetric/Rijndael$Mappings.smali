.class public Lorg/bouncycastle/jce/provider/symmetric/Rijndael$Mappings;
.super Ljava/util/HashMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/Rijndael;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "Cipher.RIJNDAEL"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Rijndael$ECB"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Rijndael$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.RIJNDAEL"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Rijndael$KeyGen"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Rijndael$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "AlgorithmParameters.RIJNDAEL"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Rijndael$AlgParams"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Rijndael$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
