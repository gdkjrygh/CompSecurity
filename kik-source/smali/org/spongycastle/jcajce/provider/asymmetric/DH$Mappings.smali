.class public Lorg/spongycastle/jcajce/provider/asymmetric/DH$Mappings;
.super Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/DH;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;-><init>()V

    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 2

    .prologue
    .line 19
    const-string v0, "KeyPairGenerator.DH"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    const-string v0, "Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN"

    const-string v1, "DH"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    const-string v0, "KeyAgreement.DH"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string v0, "Alg.Alias.KeyAgreement.DIFFIEHELLMAN"

    const-string v1, "DH"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v0, "KeyFactory.DH"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const-string v0, "Alg.Alias.KeyFactory.DIFFIEHELLMAN"

    const-string v1, "DH"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, "AlgorithmParameters.DH"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN"

    const-string v1, "DH"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string v0, "Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN"

    const-string v1, "DH"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "AlgorithmParameterGenerator.DH"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    return-void
.end method
