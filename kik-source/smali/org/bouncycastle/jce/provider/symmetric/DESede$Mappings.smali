.class public Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;
.super Ljava/util/HashMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/symmetric/DESede;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "Cipher.DESEDE"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$ECB"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cipher."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$CBC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cipher."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/bouncycastle/asn1/oiw/OIWObjectIdentifiers;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$CBC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cipher.DESEDEWRAP"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$Wrap"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cipher."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bw:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$Wrap"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cipher.DESEDERFC3211WRAP"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$RFC3211"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.DESEDE"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyGenerator."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator3"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "KeyGenerator.DESEDEWRAP"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "SecretKeyFactory.DESEDE"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$KeyFactory"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.DESEDECMAC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$CMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.DESEDEMAC"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$CBCMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDE"

    const-string v1, "DESEDEMAC"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.DESEDEMAC/CFB8"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$DESedeCFB8"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDE/CFB8"

    const-string v1, "DESEDEMAC/CFB8"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.DESEDEMAC64"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$DESede64"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDE64"

    const-string v1, "DESEDEMAC64"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Mac.DESEDEMAC64WITHISO7816-4PADDING"

    const-string v1, "org.bouncycastle.jce.provider.symmetric.DESede$DESede64with7816d4"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING"

    const-string v1, "DESEDEMAC64WITHISO7816-4PADDING"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING"

    const-string v1, "DESEDEMAC64WITHISO7816-4PADDING"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING"

    const-string v1, "DESEDEMAC64WITHISO7816-4PADDING"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/jce/provider/symmetric/DESede$Mappings;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
