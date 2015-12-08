.class public Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;
.super Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GOST3410"
.end annotation


# instance fields
.field a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    const-class v0, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "unknown parameter spec passed to GOST3410 parameters object."

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetEncoded()[B
    .locals 5

    new-instance v0, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    new-instance v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-virtual {v2}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-virtual {v3}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-virtual {v4}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V

    :try_start_0
    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error encoding GOST3410Parameters"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetEncoded(Ljava/lang/String;)[B
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "X.509"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->engineGetEncoded()[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    return-void
.end method

.method protected engineInit([B)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    new-instance v1, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-static {v1}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->a(Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;)Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Not a valid GOST3410 Parameter encoding."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Not a valid GOST3410 Parameter encoding."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInit([BLjava/lang/String;)V
    .locals 3

    invoke-static {p2}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "X.509"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameters$GOST3410;->engineInit([B)V

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown parameter format "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineToString()Ljava/lang/String;
    .locals 1

    const-string v0, "GOST3410 Parameters"

    return-object v0
.end method
