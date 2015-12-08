.class final Lcom/kik/cards/web/auth/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/auth/AuthPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/kik/cards/web/auth/f;->b:Lcom/kik/cards/web/auth/AuthPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/auth/f;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a([B)[B
    .locals 3

    .prologue
    .line 93
    if-eqz p1, :cond_0

    :try_start_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 95
    :cond_0
    const-string v0, "prime256v1"

    invoke-static {v0}, Lorg/spongycastle/jce/ECNamedCurveTable;->a(Ljava/lang/String;)Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;

    move-result-object v0

    .line 97
    const-string v1, "EC"

    const-string v2, "SC"

    invoke-static {v1, v2}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v1

    .line 99
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, v0, v2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 101
    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    .line 104
    invoke-virtual {v1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    .line 106
    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->getEncoded()[B

    move-result-object v0

    .line 107
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getEncoded()[B

    move-result-object p1

    .line 110
    iget-object v1, p0, Lcom/kik/cards/web/auth/f;->b:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/auth/AuthPlugin;->a(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/android/b/s;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/auth/f;->a:Ljava/lang/String;

    invoke-virtual {v1, p1, v0, v2}, Lkik/android/b/s;->a([B[BLjava/lang/String;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1

    .line 123
    :cond_1
    :goto_0
    return-object p1

    .line 115
    :catch_0
    move-exception v0

    .line 116
    :goto_1
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 117
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 120
    :cond_2
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 123
    const/4 p1, 0x0

    goto :goto_0

    .line 115
    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 88
    check-cast p1, [B

    invoke-direct {p0, p1}, Lcom/kik/cards/web/auth/f;->a([B)[B

    move-result-object v0

    return-object v0
.end method
