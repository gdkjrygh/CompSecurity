.class public Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/crypto/interfaces/PBEKey;


# instance fields
.field a:Ljava/lang/String;

.field b:Lorg/spongycastle/asn1/DERObjectIdentifier;

.field c:I

.field d:I

.field e:I

.field f:I

.field g:Lorg/spongycastle/crypto/CipherParameters;

.field h:Ljavax/crypto/spec/PBEKeySpec;

.field i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/spongycastle/asn1/DERObjectIdentifier;IIIILjavax/crypto/spec/PBEKeySpec;Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->i:Z

    .line 38
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    .line 40
    iput p3, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c:I

    .line 41
    iput p4, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->d:I

    .line 42
    iput p5, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->e:I

    .line 43
    iput p6, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->f:I

    .line 44
    iput-object p7, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    .line 45
    iput-object p8, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    .line 46
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->f:I

    return v0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 144
    iput-boolean p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->i:Z

    .line 145
    return-void
.end method

.method public final b()Lorg/spongycastle/crypto/CipherParameters;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    return-object v0
.end method

.method public final c()Lorg/spongycastle/asn1/DERObjectIdentifier;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b:Lorg/spongycastle/asn1/DERObjectIdentifier;

    return-object v0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    instance-of v0, v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 73
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    .line 83
    :goto_1
    return-object v0

    .line 70
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->g:Lorg/spongycastle/crypto/CipherParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    goto :goto_0

    .line 77
    :cond_1
    iget v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 79
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b([C)[B

    move-result-object v0

    goto :goto_1

    .line 83
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([C)[B

    move-result-object v0

    goto :goto_1
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    const-string v0, "RAW"

    return-object v0
.end method

.method public getIterationCount()I
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getIterationCount()I

    move-result v0

    return v0
.end method

.method public getPassword()[C
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getPassword()[C

    move-result-object v0

    return-object v0
.end method

.method public getSalt()[B
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->h:Ljavax/crypto/spec/PBEKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/spec/PBEKeySpec;->getSalt()[B

    move-result-object v0

    return-object v0
.end method
