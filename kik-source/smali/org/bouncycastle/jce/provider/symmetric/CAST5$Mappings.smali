.class public Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;
.super Ljava/util/HashMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/CAST5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "AlgorithmParameters.CAST5"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.CAST5$AlgParams"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10"

    const-string v1, "CAST5"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "AlgorithmParameterGenerator.CAST5"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.CAST5$AlgParamGen"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10"

    const-string v1, "CAST5"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cipher.CAST5"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.CAST5$ECB"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cipher.1.2.840.113533.7.66.10"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.CAST5$CBC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.CAST5"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.CAST5$KeyGen"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.KeyGenerator.1.2.840.113533.7.66.10"

    const-string v1, "CAST5"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/CAST5$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
