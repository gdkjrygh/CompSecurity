.class public Lorg/spongycastle/jcajce/provider/asymmetric/ElGamal$Mappings;
.super Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/ElGamal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;-><init>()V

    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 3

    .prologue
    .line 22
    const-string v0, "AlgorithmParameterGenerator.ELGAMAL"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string v0, "AlgorithmParameterGenerator.ElGamal"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string v0, "AlgorithmParameters.ELGAMAL"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v0, "AlgorithmParameters.ElGamal"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string v0, "Cipher.ELGAMAL"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, "Cipher.ElGamal"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING"

    const-string v1, "ELGAMAL/PKCS1"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING"

    const-string v1, "ELGAMAL/PKCS1"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string v0, "Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING"

    const-string v1, "ELGAMAL"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "Cipher.ELGAMAL/PKCS1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "KeyFactory.ELGAMAL"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "KeyFactory.ElGamal"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "KeyPairGenerator.ELGAMAL"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "KeyPairGenerator.ElGamal"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyFactorySpi;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyFactorySpi;-><init>()V

    .line 42
    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "ELGAMAL"

    invoke-static {p1, v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ElGamal$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 43
    sget-object v0, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "ELGAMAL"

    invoke-static {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ElGamal$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 44
    return-void
.end method
