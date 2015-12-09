.class public Lcom/worklight/common/security/WLDeviceAuthManager;
.super Ljava/lang/Object;
.source "WLDeviceAuthManager.java"


# static fields
.field private static final ALG:Ljava/lang/String; = "alg"

.field private static final APPLICATION:Ljava/lang/String; = "application"

.field private static final EXP:Ljava/lang/String; = "exp"

.field private static final JPK:Ljava/lang/String; = "jpk"

.field private static final KEYSTORE_FILENAME:Ljava/lang/String; = ".keystore"

.field private static final MOD:Ljava/lang/String; = "mod"

.field private static final RSA:Ljava/lang/String; = "RSA"

.field private static final X5C:Ljava/lang/String; = "x5c"

.field private static instance:Lcom/worklight/common/security/WLDeviceAuthManager;

.field private static keyStorePassword:[C


# instance fields
.field private context:Landroid/content/Context;

.field private provisioningDelegate:Lcom/worklight/common/security/WLProvisioningDelegate;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    sput-object v0, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    .line 48
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->provisioningDelegate:Lcom/worklight/common/security/WLProvisioningDelegate;

    .line 79
    return-void
.end method

.method static synthetic access$0(Lcom/worklight/common/security/WLDeviceAuthManager;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method private addBasicDeviceProvisioningProperties(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "payloadJSON"    # Ljava/lang/String;
    .param p2, "provisioningEntity"    # Ljava/lang/String;
    .param p3, "realm"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 234
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 237
    .local v0, "csrJwsHeaderJson":Lorg/json/JSONObject;
    const-string v1, "realm"

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    const-string v1, "deviceId"

    iget-object v2, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "android_id"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 239
    const-string v1, "application"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 240
    const-string v2, "applicationId"

    iget-object v1, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    check-cast v1, Lcom/worklight/androidgap/WLDroidGap;

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/common/WLConfig;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 245
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 241
    :cond_1
    const-string v1, "group:"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 242
    const-string v1, "groupId"

    const-string v2, ":"

    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0
.end method

.method private getAlias(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "provisioningEntity"    # Ljava/lang/String;

    .prologue
    .line 130
    const-string v0, "application"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "app:"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    check-cast v0, Lcom/worklight/androidgap/WLDroidGap;

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/worklight/common/WLConfig;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 133
    .end local p1    # "provisioningEntity":Ljava/lang/String;
    :cond_0
    return-object p1
.end method

.method public static declared-synchronized getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;
    .locals 2

    .prologue
    .line 69
    const-class v1, Lcom/worklight/common/security/WLDeviceAuthManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/worklight/common/security/WLDeviceAuthManager;->instance:Lcom/worklight/common/security/WLDeviceAuthManager;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/worklight/common/security/WLDeviceAuthManager;

    invoke-direct {v0}, Lcom/worklight/common/security/WLDeviceAuthManager;-><init>()V

    sput-object v0, Lcom/worklight/common/security/WLDeviceAuthManager;->instance:Lcom/worklight/common/security/WLDeviceAuthManager;

    .line 72
    :cond_0
    sget-object v0, Lcom/worklight/common/security/WLDeviceAuthManager;->instance:Lcom/worklight/common/security/WLDeviceAuthManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private signData(Ljava/lang/String;Ljava/security/PrivateKey;)[B
    .locals 2
    .param p1, "data"    # Ljava/lang/String;
    .param p2, "privateKey"    # Ljava/security/PrivateKey;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;
        }
    .end annotation

    .prologue
    .line 381
    const-string v1, "SHA256withRSA"

    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 382
    .local v0, "signature":Ljava/security/Signature;
    invoke-virtual {v0, p2}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 383
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    .line 384
    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public addDeviceIdAndAppId(Lcom/worklight/common/WLConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "wlConfig"    # Lcom/worklight/common/WLConfig;
    .param p2, "payloadJSON"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 305
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 306
    .local v2, "jwsHeaderJson":Lorg/json/JSONObject;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 307
    .local v0, "appId":Lorg/json/JSONObject;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 308
    .local v1, "deviceId":Lorg/json/JSONObject;
    const-string v3, "id"

    invoke-virtual {p1}, Lcom/worklight/common/WLConfig;->getAppId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    const-string v3, "version"

    invoke-virtual {p1}, Lcom/worklight/common/WLConfig;->getApplicationVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 310
    const-string v4, "id"

    iget-object v3, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    check-cast v3, Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v3}, Lcom/worklight/androidgap/WLDroidGap;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v5, "android_id"

    invoke-static {v3, v5}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 311
    const-string v3, "os"

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    const-string v3, "model"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 313
    const-string v3, "environment"

    const-string v4, "Android"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 315
    const-string v3, "app"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 316
    const-string v3, "device"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 317
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public createCSR(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p1, "csrData"    # Ljava/lang/String;
    .param p2, "provisioningEntity"    # Ljava/lang/String;
    .param p3, "realm"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 155
    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->provisioningDelegate:Lcom/worklight/common/security/WLProvisioningDelegate;

    if-eqz v0, :cond_0

    .line 156
    invoke-direct {p0, p1, p2, p3}, Lcom/worklight/common/security/WLDeviceAuthManager;->addBasicDeviceProvisioningProperties(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 157
    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->provisioningDelegate:Lcom/worklight/common/security/WLProvisioningDelegate;

    iget-object v1, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    invoke-interface {v0, p1, v1}, Lcom/worklight/common/security/WLProvisioningDelegate;->sendCSR(Ljava/lang/String;Landroid/content/Context;)V

    .line 158
    const/4 v0, 0x1

    .line 160
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public createCsrHeader(Ljava/security/KeyPair;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "keyPair"    # Ljava/security/KeyPair;
    .param p2, "csrPayload"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 192
    const-string v0, ""

    .line 193
    .local v0, "csrHeader":Ljava/lang/String;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 195
    .local v2, "csrHeaderJson":Lorg/json/JSONObject;
    const-string v9, "alg"

    const-string v10, "RS256"

    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 198
    .local v7, "publicKeyDataJson":Lorg/json/JSONObject;
    invoke-virtual {p1}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v6

    check-cast v6, Ljava/security/interfaces/RSAPublicKey;

    .line 199
    .local v6, "publicKey":Ljava/security/interfaces/RSAPublicKey;
    const-string v9, "alg"

    const-string v10, "RSA"

    invoke-virtual {v7, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    invoke-interface {v6}, Ljava/security/interfaces/RSAPublicKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v9}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 202
    .local v5, "mod":Ljava/lang/String;
    const-string v9, "mod"

    invoke-virtual {v7, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    invoke-interface {v6}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v9}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 205
    .local v3, "exp":Ljava/lang/String;
    const-string v9, "exp"

    invoke-virtual {v7, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    const-string v9, "jpk"

    invoke-virtual {v2, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 212
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v10

    const-string v11, "UTF-8"

    invoke-static {v10, v11}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, "."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v10

    const-string v11, "UTF-8"

    invoke-static {v10, v11}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 214
    .local v1, "csrHeaderAndPayload":Ljava/lang/String;
    const/4 v4, 0x0

    .line 216
    .local v4, "jwsSignature":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v9

    invoke-virtual {p0, v1, v9}, Lcom/worklight/common/security/WLDeviceAuthManager;->signCSR(Ljava/lang/String;Ljava/security/PrivateKey;)[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 219
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, "."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 220
    .local v8, "result":Ljava/lang/String;
    return-object v8
.end method

.method public createDeviceAuthHeader(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 11
    .param p1, "payloadJSON"    # Ljava/lang/String;
    .param p2, "provisioningEntity"    # Ljava/lang/String;
    .param p3, "isProvisioningEnabled"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 260
    const-string v1, ""

    .line 261
    .local v1, "jwsHeader":Ljava/lang/String;
    const-string v6, ""

    .line 263
    .local v6, "result":Ljava/lang/String;
    if-eqz p3, :cond_0

    invoke-virtual {p0, p2}, Lcom/worklight/common/security/WLDeviceAuthManager;->isCertificateExists(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 266
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 267
    .local v3, "jwsHeaderJson":Lorg/json/JSONObject;
    const/4 v5, 0x0

    .line 269
    .local v5, "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    const-string v8, "alg"

    const-string v9, "RS256"

    invoke-virtual {v3, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    invoke-virtual {p0, p2}, Lcom/worklight/common/security/WLDeviceAuthManager;->getPrivateKeyEntry(Ljava/lang/String;)Ljava/security/KeyStore$PrivateKeyEntry;

    move-result-object v5

    .line 271
    invoke-virtual {v5}, Ljava/security/KeyStore$PrivateKeyEntry;->getCertificate()Ljava/security/cert/Certificate;

    move-result-object v8

    invoke-virtual {v8}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    .line 272
    .local v0, "cert":[B
    const-string v8, "UTF-8"

    invoke-static {v0, v8}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 273
    .local v7, "x5cValue":Ljava/lang/String;
    const-string v8, "x5c"

    invoke-virtual {v3, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 275
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 278
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 280
    .local v2, "jwsHeaderAndPayload":Ljava/lang/String;
    const/4 v4, 0x0

    .line 282
    .local v4, "jwsSignature":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    move-result-object v8

    invoke-direct {p0, v2, v8}, Lcom/worklight/common/security/WLDeviceAuthManager;->signData(Ljava/lang/String;Ljava/security/PrivateKey;)[B

    move-result-object v8

    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Lcom/worklight/utils/Base64;->encodeUrlSafe([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 285
    const/4 v5, 0x0

    .line 288
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 295
    .end local v0    # "cert":[B
    .end local v2    # "jwsHeaderAndPayload":Ljava/lang/String;
    .end local v3    # "jwsHeaderJson":Lorg/json/JSONObject;
    .end local v4    # "jwsSignature":Ljava/lang/String;
    .end local v5    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .end local v7    # "x5cValue":Ljava/lang/String;
    :goto_0
    return-object v6

    .line 292
    :cond_0
    move-object v6, p1

    goto :goto_0
.end method

.method public csrCertificateRecieveFailed(Ljava/lang/String;)V
    .locals 2
    .param p1, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 480
    invoke-static {p1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    .line 481
    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    check-cast v0, Lcom/worklight/androidgap/WLDroidGap;

    new-instance v1, Lcom/worklight/common/security/WLDeviceAuthManager$2;

    invoke-direct {v1, p0}, Lcom/worklight/common/security/WLDeviceAuthManager$2;-><init>(Lcom/worklight/common/security/WLDeviceAuthManager;)V

    invoke-virtual {v0, v1}, Lcom/worklight/androidgap/WLDroidGap;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 487
    return-void
.end method

.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 88
    const-string v1, "RSA"

    invoke-static {v1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    .line 89
    .local v0, "kpg":Ljava/security/KeyPairGenerator;
    const/16 v1, 0x200

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(I)V

    .line 90
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->genKeyPair()Ljava/security/KeyPair;

    move-result-object v1

    return-object v1
.end method

.method protected getPrivateKeyEntry(Ljava/lang/String;)Ljava/security/KeyStore$PrivateKeyEntry;
    .locals 23
    .param p1, "provisioningEntity"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;,
            Landroid/content/pm/PackageManager$NameNotFoundException;,
            Ljava/security/UnrecoverableEntryException;
        }
    .end annotation

    .prologue
    .line 402
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v13

    .line 403
    .local v13, "myKeyStore":Ljava/security/KeyStore;
    new-instance v14, Ljava/io/File;

    new-instance v18, Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v19, "/"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ".keystore"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-direct {v14, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 404
    .local v14, "myKeyStoreFile":Ljava/io/File;
    invoke-direct/range {p0 .. p1}, Lcom/worklight/common/security/WLDeviceAuthManager;->getAlias(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 405
    .local v3, "alias":Ljava/lang/String;
    const/4 v11, 0x0

    .line 406
    .local v11, "myFis":Ljava/io/FileInputStream;
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v18

    if-eqz v18, :cond_7

    .line 408
    :try_start_0
    new-instance v12, Ljava/io/FileInputStream;

    invoke-direct {v12, v14}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .local v12, "myFis":Ljava/io/FileInputStream;
    :try_start_1
    sget-object v18, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    move-object/from16 v0, v18

    invoke-virtual {v13, v12, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 410
    new-instance v18, Ljava/security/KeyStore$PasswordProtection;

    sget-object v19, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-direct/range {v18 .. v19}, Ljava/security/KeyStore$PasswordProtection;-><init>([C)V

    move-object/from16 v0, v18

    invoke-virtual {v13, v3, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object v17

    check-cast v17, Ljava/security/KeyStore$PrivateKeyEntry;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 411
    .local v17, "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    if-eqz v17, :cond_2

    .line 422
    if-eqz v12, :cond_0

    .line 423
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V

    :cond_0
    move-object v11, v12

    .line 472
    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    :cond_1
    :goto_0
    return-object v17

    .line 415
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .restart local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :cond_2
    :try_start_2
    const-string v18, "application"

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-result v18

    if-eqz v18, :cond_6

    .line 416
    const/16 v17, 0x0

    .line 422
    if-eqz v12, :cond_3

    .line 423
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V

    :cond_3
    move-object v11, v12

    .line 417
    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    goto :goto_0

    .line 419
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :catch_0
    move-exception v4

    .line 420
    .local v4, "e":Ljava/io/IOException;
    :goto_1
    :try_start_3
    const-string v18, "failed getting any certificate from app local keystore"

    move-object/from16 v0, v18

    invoke-static {v0, v4}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 422
    if-eqz v11, :cond_4

    .line 423
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V

    .line 437
    .end local v4    # "e":Ljava/io/IOException;
    :cond_4
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v18

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v19

    move-object/from16 v0, v19

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v16

    .line 438
    .local v16, "packages":[Ljava/lang/String;
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v9

    .line 439
    .local v9, "keyStore":Ljava/security/KeyStore;
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v19, v0

    const/16 v18, 0x0

    :goto_3
    move/from16 v0, v18

    move/from16 v1, v19

    if-lt v0, v1, :cond_9

    .line 472
    const/16 v17, 0x0

    goto :goto_0

    .line 421
    .end local v9    # "keyStore":Ljava/security/KeyStore;
    .end local v16    # "packages":[Ljava/lang/String;
    :catchall_0
    move-exception v18

    .line 422
    :goto_4
    if-eqz v11, :cond_5

    .line 423
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V

    .line 425
    :cond_5
    throw v18

    .line 422
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .restart local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :cond_6
    if-eqz v12, :cond_12

    .line 423
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V

    move-object v11, v12

    .line 425
    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    goto :goto_2

    .line 428
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :cond_7
    const-string v18, "application"

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_8

    .line 429
    const/16 v17, 0x0

    goto :goto_0

    .line 432
    :cond_8
    const/16 v18, 0x0

    sget-object v19, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v13, v0, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    goto :goto_2

    .line 439
    .restart local v9    # "keyStore":Ljava/security/KeyStore;
    .restart local v16    # "packages":[Ljava/lang/String;
    :cond_9
    aget-object v15, v16, v18

    .line 440
    .local v15, "packageName":Ljava/lang/String;
    new-instance v10, Ljava/io/File;

    new-instance v20, Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    move-object/from16 v0, v21

    move/from16 v1, v22

    invoke-virtual {v0, v15, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v21, "/"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, ".keystore"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 441
    .local v10, "keyStoreFile":Ljava/io/File;
    const/4 v5, 0x0

    .line 442
    .local v5, "fis":Ljava/io/FileInputStream;
    const/4 v7, 0x0

    .line 443
    .local v7, "fos":Ljava/io/FileOutputStream;
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v20

    if-eqz v20, :cond_b

    .line 445
    :try_start_4
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 446
    .end local v5    # "fis":Ljava/io/FileInputStream;
    .local v6, "fis":Ljava/io/FileInputStream;
    :try_start_5
    sget-object v20, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    move-object/from16 v0, v20

    invoke-virtual {v9, v6, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 447
    new-instance v20, Ljava/security/KeyStore$PasswordProtection;

    sget-object v21, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-direct/range {v20 .. v21}, Ljava/security/KeyStore$PasswordProtection;-><init>([C)V

    move-object/from16 v0, v20

    invoke-virtual {v9, v3, v0}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object v17

    check-cast v17, Ljava/security/KeyStore$PrivateKeyEntry;

    .line 448
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    if-nez v17, :cond_c

    .line 449
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 462
    if-eqz v6, :cond_a

    .line 463
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 465
    :cond_a
    if-eqz v7, :cond_11

    .line 466
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    move-object v5, v6

    .line 439
    .end local v6    # "fis":Ljava/io/FileInputStream;
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    :cond_b
    :goto_5
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_3

    .line 453
    .end local v5    # "fis":Ljava/io/FileInputStream;
    .restart local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :cond_c
    :try_start_6
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 454
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .local v8, "fos":Ljava/io/FileOutputStream;
    :try_start_7
    invoke-virtual/range {v17 .. v17}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    move-result-object v20

    sget-object v21, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-virtual/range {v17 .. v17}, Ljava/security/KeyStore$PrivateKeyEntry;->getCertificateChain()[Ljava/security/cert/Certificate;

    move-result-object v22

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-virtual {v13, v3, v0, v1, v2}, Ljava/security/KeyStore;->setKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V

    .line 455
    sget-object v20, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    move-object/from16 v0, v20

    invoke-virtual {v13, v8, v0}, Ljava/security/KeyStore;->store(Ljava/io/OutputStream;[C)V

    .line 456
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 457
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 462
    if-eqz v6, :cond_d

    .line 463
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 465
    :cond_d
    if-eqz v8, :cond_1

    .line 466
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    goto/16 :goto_0

    .line 459
    .end local v6    # "fis":Ljava/io/FileInputStream;
    .end local v8    # "fos":Ljava/io/FileOutputStream;
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    .restart local v7    # "fos":Ljava/io/FileOutputStream;
    :catch_1
    move-exception v4

    .line 460
    .restart local v4    # "e":Ljava/io/IOException;
    :goto_6
    :try_start_8
    const-string v20, "failed copying certificate to application keystore"

    move-object/from16 v0, v20

    invoke-static {v0, v4}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 462
    if-eqz v5, :cond_e

    .line 463
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V

    .line 465
    :cond_e
    if-eqz v7, :cond_b

    .line 466
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    goto :goto_5

    .line 461
    .end local v4    # "e":Ljava/io/IOException;
    :catchall_1
    move-exception v18

    .line 462
    :goto_7
    if-eqz v5, :cond_f

    .line 463
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V

    .line 465
    :cond_f
    if-eqz v7, :cond_10

    .line 466
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 468
    :cond_10
    throw v18

    .line 461
    .end local v5    # "fis":Ljava/io/FileInputStream;
    .restart local v6    # "fis":Ljava/io/FileInputStream;
    :catchall_2
    move-exception v18

    move-object v5, v6

    .end local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    goto :goto_7

    .end local v5    # "fis":Ljava/io/FileInputStream;
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .restart local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v8    # "fos":Ljava/io/FileOutputStream;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :catchall_3
    move-exception v18

    move-object v7, v8

    .end local v8    # "fos":Ljava/io/FileOutputStream;
    .restart local v7    # "fos":Ljava/io/FileOutputStream;
    move-object v5, v6

    .end local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    goto :goto_7

    .line 459
    .end local v5    # "fis":Ljava/io/FileInputStream;
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .restart local v6    # "fis":Ljava/io/FileInputStream;
    :catch_2
    move-exception v4

    move-object v5, v6

    .end local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    goto :goto_6

    .end local v5    # "fis":Ljava/io/FileInputStream;
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .restart local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v8    # "fos":Ljava/io/FileOutputStream;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :catch_3
    move-exception v4

    move-object v7, v8

    .end local v8    # "fos":Ljava/io/FileOutputStream;
    .restart local v7    # "fos":Ljava/io/FileOutputStream;
    move-object v5, v6

    .end local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    goto :goto_6

    .line 421
    .end local v5    # "fis":Ljava/io/FileInputStream;
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .end local v9    # "keyStore":Ljava/security/KeyStore;
    .end local v10    # "keyStoreFile":Ljava/io/File;
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .end local v15    # "packageName":Ljava/lang/String;
    .end local v16    # "packages":[Ljava/lang/String;
    .end local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .restart local v12    # "myFis":Ljava/io/FileInputStream;
    :catchall_4
    move-exception v18

    move-object v11, v12

    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    goto/16 :goto_4

    .line 419
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .restart local v12    # "myFis":Ljava/io/FileInputStream;
    :catch_4
    move-exception v4

    move-object v11, v12

    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    goto/16 :goto_1

    .restart local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v7    # "fos":Ljava/io/FileOutputStream;
    .restart local v9    # "keyStore":Ljava/security/KeyStore;
    .restart local v10    # "keyStoreFile":Ljava/io/File;
    .restart local v15    # "packageName":Ljava/lang/String;
    .restart local v16    # "packages":[Ljava/lang/String;
    .restart local v17    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    :cond_11
    move-object v5, v6

    .end local v6    # "fis":Ljava/io/FileInputStream;
    .restart local v5    # "fis":Ljava/io/FileInputStream;
    goto :goto_5

    .end local v5    # "fis":Ljava/io/FileInputStream;
    .end local v7    # "fos":Ljava/io/FileOutputStream;
    .end local v9    # "keyStore":Ljava/security/KeyStore;
    .end local v10    # "keyStoreFile":Ljava/io/File;
    .end local v11    # "myFis":Ljava/io/FileInputStream;
    .end local v15    # "packageName":Ljava/lang/String;
    .end local v16    # "packages":[Ljava/lang/String;
    .restart local v12    # "myFis":Ljava/io/FileInputStream;
    :cond_12
    move-object v11, v12

    .end local v12    # "myFis":Ljava/io/FileInputStream;
    .restart local v11    # "myFis":Ljava/io/FileInputStream;
    goto/16 :goto_2
.end method

.method public init(Landroid/app/Activity;Landroid/webkit/WebView;)V
    .locals 0
    .param p1, "ctx"    # Landroid/app/Activity;
    .param p2, "webView"    # Landroid/webkit/WebView;

    .prologue
    .line 99
    iput-object p2, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->webView:Landroid/webkit/WebView;

    .line 100
    iput-object p1, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    .line 101
    return-void
.end method

.method public isCertificateExists(Ljava/lang/String;)Z
    .locals 4
    .param p1, "provisioningEntity"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 108
    iget-object v3, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    if-nez v3, :cond_0

    .line 122
    :goto_0
    return v2

    .line 114
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/worklight/common/security/WLDeviceAuthManager;->getPrivateKeyEntry(Ljava/lang/String;)Ljava/security/KeyStore$PrivateKeyEntry;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 115
    .local v1, "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    if-eqz v1, :cond_1

    const/4 v2, 0x1

    .line 116
    .local v2, "ret":Z
    :cond_1
    const/4 v1, 0x0

    .line 117
    goto :goto_0

    .line 119
    .end local v1    # "pke":Ljava/security/KeyStore$PrivateKeyEntry;
    .end local v2    # "ret":Z
    :catch_0
    move-exception v0

    .line 120
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "Error checking if certificate exists"

    invoke-static {v3, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public saveCertificate(Ljava/lang/String;Ljava/security/KeyPair;Ljava/security/cert/Certificate;)V
    .locals 12
    .param p1, "provisioningEntity"    # Ljava/lang/String;
    .param p2, "keyPair"    # Ljava/security/KeyPair;
    .param p3, "certificate"    # Ljava/security/cert/Certificate;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 328
    invoke-virtual {p0, p1}, Lcom/worklight/common/security/WLDeviceAuthManager;->isCertificateExists(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 329
    new-instance v8, Ljava/lang/Exception;

    const-string v9, "Error - Got a new Certificate, but an older one already exists, exiting process"

    invoke-direct {v8, v9}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v8

    .line 332
    :cond_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v6

    .line 333
    .local v6, "keyStore":Ljava/security/KeyStore;
    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".keystore"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 334
    .local v7, "keyStoreFile":Ljava/io/File;
    const/4 v2, 0x0

    .line 335
    .local v2, "fis":Ljava/io/FileInputStream;
    const/4 v4, 0x0

    .line 337
    .local v4, "fos":Ljava/io/FileOutputStream;
    :try_start_0
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 338
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .local v3, "fis":Ljava/io/FileInputStream;
    :try_start_1
    sget-object v8, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-virtual {v6, v3, v8}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 340
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v2, v3

    .line 344
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :goto_0
    :try_start_2
    invoke-direct {p0, p1}, Lcom/worklight/common/security/WLDeviceAuthManager;->getAlias(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 345
    .local v0, "alias":Ljava/lang/String;
    invoke-virtual {p2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v8

    sget-object v9, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/security/cert/Certificate;

    const/4 v11, 0x0

    aput-object p3, v10, v11

    invoke-virtual {v6, v0, v8, v9, v10}, Ljava/security/KeyStore;->setKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V

    .line 346
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 347
    .end local v4    # "fos":Ljava/io/FileOutputStream;
    .local v5, "fos":Ljava/io/FileOutputStream;
    :try_start_3
    sget-object v8, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-virtual {v6, v5, v8}, Ljava/security/KeyStore;->store(Ljava/io/OutputStream;[C)V

    .line 350
    iget-object v8, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->context:Landroid/content/Context;

    check-cast v8, Lcom/worklight/androidgap/WLDroidGap;

    new-instance v9, Lcom/worklight/common/security/WLDeviceAuthManager$1;

    invoke-direct {v9, p0}, Lcom/worklight/common/security/WLDeviceAuthManager$1;-><init>(Lcom/worklight/common/security/WLDeviceAuthManager;)V

    invoke-virtual {v8, v9}, Lcom/worklight/androidgap/WLDroidGap;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 361
    if-eqz v5, :cond_1

    .line 362
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 364
    :cond_1
    if-eqz v2, :cond_2

    .line 365
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    :cond_2
    move-object v4, v5

    .line 368
    .end local v0    # "alias":Ljava/lang/String;
    .end local v5    # "fos":Ljava/io/FileOutputStream;
    .restart local v4    # "fos":Ljava/io/FileOutputStream;
    :cond_3
    :goto_1
    return-void

    .line 342
    :cond_4
    const/4 v8, 0x0

    :try_start_4
    sget-object v9, Lcom/worklight/common/security/WLDeviceAuthManager;->keyStorePassword:[C

    invoke-virtual {v6, v8, v9}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 358
    :catch_0
    move-exception v1

    .line 359
    .local v1, "e":Ljava/lang/Exception;
    :goto_2
    :try_start_5
    const-string v8, "Error saving certificate"

    invoke-static {v8, v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 361
    if-eqz v4, :cond_5

    .line 362
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 364
    :cond_5
    if-eqz v2, :cond_3

    .line 365
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    goto :goto_1

    .line 360
    .end local v1    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v8

    .line 361
    :goto_3
    if-eqz v4, :cond_6

    .line 362
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 364
    :cond_6
    if-eqz v2, :cond_7

    .line 365
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 367
    :cond_7
    throw v8

    .line 360
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    :catchall_1
    move-exception v8

    move-object v2, v3

    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    goto :goto_3

    .end local v4    # "fos":Ljava/io/FileOutputStream;
    .restart local v0    # "alias":Ljava/lang/String;
    .restart local v5    # "fos":Ljava/io/FileOutputStream;
    :catchall_2
    move-exception v8

    move-object v4, v5

    .end local v5    # "fos":Ljava/io/FileOutputStream;
    .restart local v4    # "fos":Ljava/io/FileOutputStream;
    goto :goto_3

    .line 358
    .end local v0    # "alias":Ljava/lang/String;
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    :catch_1
    move-exception v1

    move-object v2, v3

    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    goto :goto_2

    .end local v4    # "fos":Ljava/io/FileOutputStream;
    .restart local v0    # "alias":Ljava/lang/String;
    .restart local v5    # "fos":Ljava/io/FileOutputStream;
    :catch_2
    move-exception v1

    move-object v4, v5

    .end local v5    # "fos":Ljava/io/FileOutputStream;
    .restart local v4    # "fos":Ljava/io/FileOutputStream;
    goto :goto_2
.end method

.method public setProvisioningDelegate(Lcom/worklight/common/security/WLProvisioningDelegate;)V
    .locals 0
    .param p1, "provisioningDelegate"    # Lcom/worklight/common/security/WLProvisioningDelegate;

    .prologue
    .line 143
    iput-object p1, p0, Lcom/worklight/common/security/WLDeviceAuthManager;->provisioningDelegate:Lcom/worklight/common/security/WLProvisioningDelegate;

    .line 144
    return-void
.end method

.method public signCSR(Ljava/lang/String;Ljava/security/PrivateKey;)[B
    .locals 2
    .param p1, "csrJSONData"    # Ljava/lang/String;
    .param p2, "privateKey"    # Ljava/security/PrivateKey;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;
        }
    .end annotation

    .prologue
    .line 173
    const-string v1, "SHA256withRSA"

    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 174
    .local v0, "signature":Ljava/security/Signature;
    invoke-virtual {v0, p2}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 175
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V

    .line 176
    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v1

    return-object v1
.end method
