.class public Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;
.super Ljavax/crypto/KeyAgreementSpi;
.source "SourceFile"


# static fields
.field private static final e:Ljava/util/Hashtable;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 34
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    .line 38
    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 39
    new-instance v1, Ljava/lang/Integer;

    const/16 v2, 0xc0

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 40
    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x80

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 41
    new-instance v3, Ljava/lang/Integer;

    const/16 v4, 0x100

    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 43
    sget-object v4, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    const-string v5, "DES"

    invoke-virtual {v4, v5, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    const-string v4, "DESEDE"

    invoke-virtual {v0, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    const-string v1, "BLOWFISH"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    const-string v1, "AES"

    invoke-virtual {v0, v1, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljavax/crypto/KeyAgreementSpi;-><init>()V

    return-void
.end method

.method private static a(Ljava/math/BigInteger;)[B
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 52
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    .line 54
    aget-byte v0, v1, v4

    if-nez v0, :cond_0

    .line 56
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    .line 58
    const/4 v2, 0x1

    array-length v3, v0

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 62
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected engineDoPhase(Ljava/security/Key;Z)Ljava/security/Key;
    .locals 4

    .prologue
    .line 70
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Diffie-Hellman not initialised."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_0
    instance-of v0, p1, Ljavax/crypto/interfaces/DHPublicKey;

    if-nez v0, :cond_1

    .line 77
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "DHKeyAgreement doPhase requires DHPublicKey"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, p1

    .line 79
    check-cast v0, Ljavax/crypto/interfaces/DHPublicKey;

    .line 81
    invoke-interface {v0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 83
    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "DHPublicKey not for this KeyAgreement!"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_3
    if-eqz p2, :cond_4

    .line 88
    check-cast p1, Ljavax/crypto/interfaces/DHPublicKey;

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    .line 89
    const/4 v0, 0x0

    .line 96
    :goto_0
    return-object v0

    .line 93
    :cond_4
    check-cast p1, Ljavax/crypto/interfaces/DHPublicKey;

    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    .line 96
    new-instance v1, Lorg/spongycastle/jcajce/provider/asymmetric/dh/BCDHPublicKey;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-interface {v0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dh/BCDHPublicKey;-><init>(Ljava/math/BigInteger;Ljavax/crypto/spec/DHParameterSpec;)V

    move-object v0, v1

    goto :goto_0
.end method

.method protected engineGenerateSecret([BI)I
    .locals 3

    .prologue
    .line 115
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 117
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Diffie-Hellman not initialised."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    .line 122
    array-length v1, p1

    sub-int/2addr v1, p2

    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 124
    new-instance v0, Ljavax/crypto/ShortBufferException;

    const-string v1, "DHKeyAgreement - buffer too short"

    invoke-direct {v0, v1}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_1
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    array-length v0, v0

    return v0
.end method

.method protected engineGenerateSecret(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 135
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Diffie-Hellman not initialised."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_0
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 141
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a(Ljava/math/BigInteger;)[B

    move-result-object v2

    .line 143
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 145
    sget-object v0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->e:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 147
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    new-array v3, v0, [B

    .line 148
    array-length v0, v3

    invoke-static {v2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 150
    const-string v0, "DES"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    invoke-static {v3}, Lorg/spongycastle/crypto/params/DESParameters;->a([B)V

    .line 155
    :cond_1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, v3, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 158
    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, v2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method

.method protected engineGenerateSecret()[B
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Diffie-Hellman not initialised."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 198
    instance-of v0, p1, Ljavax/crypto/interfaces/DHPrivateKey;

    if-nez v0, :cond_0

    .line 200
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "DHKeyAgreement requires DHPrivateKey"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_0
    check-cast p1, Ljavax/crypto/interfaces/DHPrivateKey;

    .line 205
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    .line 206
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->c:Ljava/math/BigInteger;

    .line 207
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    .line 208
    return-void
.end method

.method protected engineInit(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 167
    instance-of v0, p1, Ljavax/crypto/interfaces/DHPrivateKey;

    if-nez v0, :cond_0

    .line 169
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "DHKeyAgreement requires DHPrivateKey for initialisation"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_0
    check-cast p1, Ljavax/crypto/interfaces/DHPrivateKey;

    .line 173
    if-eqz p2, :cond_2

    .line 175
    instance-of v0, p2, Ljavax/crypto/spec/DHParameterSpec;

    if-nez v0, :cond_1

    .line 177
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "DHKeyAgreement only accepts DHParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_1
    check-cast p2, Ljavax/crypto/spec/DHParameterSpec;

    .line 181
    invoke-virtual {p2}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    .line 182
    invoke-virtual {p2}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->c:Ljava/math/BigInteger;

    .line 190
    :goto_0
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->d:Ljava/math/BigInteger;

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->a:Ljava/math/BigInteger;

    .line 191
    return-void

    .line 186
    :cond_2
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->b:Ljava/math/BigInteger;

    .line 187
    invoke-interface {p1}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dh/KeyAgreementSpi;->c:Ljava/math/BigInteger;

    goto :goto_0
.end method
