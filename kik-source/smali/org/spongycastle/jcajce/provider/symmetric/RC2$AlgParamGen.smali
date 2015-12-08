.class public Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;
.super Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameterGenerator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/symmetric/RC2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AlgParamGen"
.end annotation


# instance fields
.field a:Ljavax/crypto/spec/RC2ParameterSpec;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/symmetric/util/BaseAlgorithmParameterGenerator;-><init>()V

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->a:Ljavax/crypto/spec/RC2ParameterSpec;

    return-void
.end method


# virtual methods
.method protected engineGenerateParameters()Ljava/security/AlgorithmParameters;
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->a:Ljavax/crypto/spec/RC2ParameterSpec;

    if-nez v0, :cond_1

    .line 118
    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 120
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->b:Ljava/security/SecureRandom;

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->b:Ljava/security/SecureRandom;

    .line 125
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->b:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 129
    :try_start_0
    const-string v0, "RC2"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    .line 130
    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    return-object v0

    .line 132
    :catch_0
    move-exception v0

    .line 134
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 136
    :cond_1
    :try_start_1
    const-string v0, "RC2"

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->a:Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 144
    :catch_1
    move-exception v0

    .line 146
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 103
    instance-of v0, p1, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v0, :cond_0

    .line 105
    check-cast p1, Ljavax/crypto/spec/RC2ParameterSpec;

    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/symmetric/RC2$AlgParamGen;->a:Ljavax/crypto/spec/RC2ParameterSpec;

    .line 106
    return-void

    .line 109
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "No supported AlgorithmParameterSpec for RC2 parameter generation."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
