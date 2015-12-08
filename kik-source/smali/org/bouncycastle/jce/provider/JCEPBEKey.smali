.class public Lorg/bouncycastle/jce/provider/JCEPBEKey;
.super Ljava/lang/Object;

# interfaces
.implements Ljavax/crypto/interfaces/PBEKey;


# instance fields
.field a:Ljava/lang/String;

.field b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field c:I

.field d:I

.field e:I

.field f:I

.field g:Lorg/bouncycastle/crypto/CipherParameters;

.field h:Ljavax/crypto/spec/PBEKeySpec;

.field i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->i:Z

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->a:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput p3, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->c:I

    iput p4, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->d:I

    iput p5, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->e:I

    iput p6, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->f:I

    iput-object p7, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    iput-object p8, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    return-void
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    instance-of v0, v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_0

    :cond_1
    iget v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS12PasswordToBytes([C)[B

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS5PasswordToBytes([C)[B

    move-result-object v0

    goto :goto_1
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "RAW"

    return-object v0
.end method

.method public getIterationCount()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getIterationCount()I

    move-result v0

    return v0
.end method

.method public getPassword()[C
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    return-object v0
.end method

.method public getSalt()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    return-object v0
.end method
