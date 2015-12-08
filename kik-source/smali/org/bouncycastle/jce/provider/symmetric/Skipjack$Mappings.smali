.class public Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;
.super Ljava/util/HashMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/Skipjack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "Cipher.SKIPJACK"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Skipjack$ECB"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.SKIPJACK"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Skipjack$KeyGen"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "AlgorithmParameters.SKIPJACK"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Skipjack$AlgParams"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.SKIPJACKMAC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Skipjack$Mac"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.SKIPJACK"

    const-string v1, "SKIPJACKMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.SKIPJACKMAC/CFB8"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.Skipjack$MacCFB8"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.SKIPJACK/CFB8"

    const-string v1, "SKIPJACKMAC/CFB8"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/Skipjack$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
