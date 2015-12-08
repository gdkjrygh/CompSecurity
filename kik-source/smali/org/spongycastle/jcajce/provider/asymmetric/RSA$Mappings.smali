.class public Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;
.super Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/RSA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mappings"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/util/AsymmetricAlgorithmProvider;-><init>()V

    .line 22
    return-void
.end method

.method private static a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 9

    .prologue
    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "WITHRSA"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "withRSA"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "WithRSA"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 177
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/RSA"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 178
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "WITHRSAENCRYPTION"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 179
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "withRSAEncryption"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 180
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "WithRSAEncryption"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 182
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Signature."

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p0, v7, p2}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Alg.Alias.Signature."

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Alg.Alias.Signature."

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    if-eqz p3, :cond_0

    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Alg.Alias.Signature.OID."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 26
    const-string v0, "AlgorithmParameters.OAEP"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string v0, "AlgorithmParameters.PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "Alg.Alias.AlgorithmParameters.RSAPSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "Alg.Alias.AlgorithmParameters.RSASSA-PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const-string v0, "Alg.Alias.AlgorithmParameters.RAWRSAPSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "Cipher.RSA"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "Cipher.RSA/RAW"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string v0, "Cipher.RSA/PKCS1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "Cipher.1.2.840.113549.1.1.1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "Cipher.2.5.8.1.1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const-string v0, "Cipher.RSA/1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v0, "Cipher.RSA/2"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "Cipher.RSA/OAEP"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cipher."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, "Cipher.RSA/ISO9796-1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "Alg.Alias.Cipher.RSA//RAW"

    const-string v1, "RSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "Alg.Alias.Cipher.RSA//NOPADDING"

    const-string v1, "RSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "Alg.Alias.Cipher.RSA//PKCS1PADDING"

    const-string v1, "RSA/PKCS1"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "Alg.Alias.Cipher.RSA//OAEPPADDING"

    const-string v1, "RSA/OAEP"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "Alg.Alias.Cipher.RSA//ISO9796-1PADDING"

    const-string v1, "RSA/ISO9796-1"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "KeyFactory.RSA"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "KeyPairGenerator.RSA"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/KeyFactorySpi;

    invoke-direct {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/KeyFactorySpi;-><init>()V

    .line 68
    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->D_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "RSA"

    invoke-static {p1, v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 69
    sget-object v1, Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "RSA"

    invoke-static {p1, v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 70
    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "RSA"

    invoke-static {p1, v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 71
    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "RSA"

    invoke-static {p1, v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/spongycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    .line 73
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->D_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "RSA"

    invoke-static {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 74
    sget-object v0, Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "RSA"

    invoke-static {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 75
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "OAEP"

    invoke-static {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 76
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "PSS"

    invoke-static {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    .line 79
    const-string v0, "Signature.RSASSA-PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Signature."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Signature.OID."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "Signature.SHA224withRSA/PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "Signature.SHA256withRSA/PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "Signature.SHA384withRSA/PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "Signature.SHA512withRSA/PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "Signature.RSA"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "Signature.RAWRSASSA-PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "Alg.Alias.Signature.RAWRSA"

    const-string v1, "RSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "Alg.Alias.Signature.NONEWITHRSA"

    const-string v1, "RSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "Alg.Alias.Signature.RAWRSAPSS"

    const-string v1, "RAWRSASSA-PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "Alg.Alias.Signature.NONEWITHRSAPSS"

    const-string v1, "RAWRSASSA-PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "Alg.Alias.Signature.NONEWITHRSASSA-PSS"

    const-string v1, "RAWRSASSA-PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "Alg.Alias.Signature.NONEWITHRSAANDMGF1"

    const-string v1, "RAWRSASSA-PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "Alg.Alias.Signature.RSAPSS"

    const-string v1, "RSASSA-PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "Alg.Alias.Signature.SHA224withRSAandMGF1"

    const-string v1, "SHA224withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "Alg.Alias.Signature.SHA256withRSAandMGF1"

    const-string v1, "SHA256withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v0, "Alg.Alias.Signature.SHA384withRSAandMGF1"

    const-string v1, "SHA384withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "Alg.Alias.Signature.SHA512withRSAandMGF1"

    const-string v1, "SHA512withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "Alg.Alias.Signature.SHA224WITHRSAANDMGF1"

    const-string v1, "SHA224withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v0, "Alg.Alias.Signature.SHA256WITHRSAANDMGF1"

    const-string v1, "SHA256withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "Alg.Alias.Signature.SHA384WITHRSAANDMGF1"

    const-string v1, "SHA384withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "Alg.Alias.Signature.SHA512WITHRSAANDMGF1"

    const-string v1, "SHA512withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "MessageDigest"

    const-string v1, "MD2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "MD2"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->E_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 114
    :cond_0
    const-string v0, "MessageDigest"

    const-string v1, "MD2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    const-string v0, "MD4"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 119
    :cond_1
    const-string v0, "MessageDigest"

    const-string v1, "MD2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    const-string v0, "MD5"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 122
    const-string v0, "Signature.MD5withRSA/ISO9796-2"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "Alg.Alias.Signature.MD5WithRSA/ISO9796-2"

    const-string v1, "MD5withRSA/ISO9796-2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :cond_2
    const-string v0, "MessageDigest"

    const-string v1, "SHA1"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 128
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string v0, "Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1"

    const-string v1, "PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "Signature.SHA1withRSA/PSS"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "Alg.Alias.Signature.SHA1withRSAandMGF1"

    const-string v1, "SHA1withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "Alg.Alias.Signature.SHA1WITHRSAANDMGF1"

    const-string v1, "SHA1withRSA/PSS"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v0, "SHA1"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->F_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 136
    const-string v0, "Alg.Alias.Signature.SHA1WithRSA/ISO9796-2"

    const-string v1, "SHA1withRSA/ISO9796-2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "Signature.SHA1withRSA/ISO9796-2"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Alg.Alias.Signature."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SHA1WITHRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Alg.Alias.Signature.OID."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SHA1WITHRSA"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :cond_3
    const-string v0, "SHA224"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->L_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 143
    const-string v0, "SHA256"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->I_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 144
    const-string v0, "SHA384"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->J_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 145
    const-string v0, "SHA512"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512"

    sget-object v2, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->K_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 147
    const-string v0, "MessageDigest"

    const-string v1, "RIPEMD128"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    const-string v0, "RIPEMD128"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 150
    const-string v0, "RMD128"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128"

    invoke-static {p1, v0, v1, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 153
    :cond_4
    const-string v0, "MessageDigest"

    const-string v1, "RIPEMD160"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 155
    const-string v0, "RIPEMD160"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 156
    const-string v0, "RMD160"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160"

    invoke-static {p1, v0, v1, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 157
    const-string v0, "Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2"

    const-string v1, "RIPEMD160withRSA/ISO9796-2"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v0, "Signature.RIPEMD160withRSA/ISO9796-2"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :cond_5
    const-string v0, "MessageDigest"

    const-string v1, "RIPEMD256"

    invoke-interface {p1, v0, v1}, Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 163
    const-string v0, "RIPEMD256"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256"

    sget-object v2, Lorg/spongycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v0, v1, v2}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 164
    const-string v0, "RMD256"

    const-string v1, "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256"

    invoke-static {p1, v0, v1, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/RSA$Mappings;->a(Lorg/spongycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V

    .line 166
    :cond_6
    return-void
.end method
