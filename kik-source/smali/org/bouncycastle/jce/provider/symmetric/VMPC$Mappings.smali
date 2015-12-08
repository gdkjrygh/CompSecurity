.class public Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;
.super Ljava/util/HashMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/VMPC;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "Cipher.VMPC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.VMPC$Base"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.VMPC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.VMPC$KeyGen"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.VMPCMAC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.VMPC$Mac"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.VMPC"

    const-string v1, "VMPCMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.VMPC-MAC"

    const-string v1, "VMPCMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/VMPC$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
