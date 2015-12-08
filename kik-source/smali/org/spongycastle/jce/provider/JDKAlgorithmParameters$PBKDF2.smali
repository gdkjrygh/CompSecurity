.class public Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;
.super Lorg/spongycastle/jce/provider/JDKAlgorithmParameters;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JDKAlgorithmParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBKDF2"
.end annotation


# instance fields
.field a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    .locals 3

    .prologue
    .line 77
    const-class v0, Ljavax/crypto/spec/PBEParameterSpec;

    if-ne p1, v0, :cond_0

    .line 79
    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;->c()[B

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    return-object v0

    .line 83
    :cond_0
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "unknown parameter spec passed to PKCS12 PBE parameters object."

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetEncoded()[B
    .locals 4

    .prologue
    .line 54
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 56
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Oooops! "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineGetEncoded(Ljava/lang/String;)[B
    .locals 1

    .prologue
    .line 65
    invoke-static {p1}, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->engineGetEncoded()[B

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 3

    .prologue
    .line 90
    instance-of v0, p1, Ljavax/crypto/spec/PBEParameterSpec;

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Ljava/security/spec/InvalidParameterSpecException;

    const-string v1, "PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object"

    invoke-direct {v0, v1}, Ljava/security/spec/InvalidParameterSpecException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    check-cast p1, Ljavax/crypto/spec/PBEParameterSpec;

    .line 97
    new-instance v0, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getSalt()[B

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/spec/PBEParameterSpec;->getIterationCount()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;-><init>([BI)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    .line 99
    return-void
.end method

.method protected engineInit([B)V
    .locals 1

    .prologue
    .line 105
    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/PBKDF2Params;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a:Lorg/spongycastle/asn1/pkcs/PBKDF2Params;

    .line 106
    return-void
.end method

.method protected engineInit([BLjava/lang/String;)V
    .locals 2

    .prologue
    .line 113
    invoke-static {p2}, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {p0, p1}, Lorg/spongycastle/jce/provider/JDKAlgorithmParameters$PBKDF2;->engineInit([B)V

    .line 116
    return-void

    .line 119
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unknown parameters format in PWRIKEK parameters object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineToString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    const-string v0, "PBKDF2 Parameters"

    return-object v0
.end method
