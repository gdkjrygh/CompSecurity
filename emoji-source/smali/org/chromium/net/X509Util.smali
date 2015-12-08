.class public Lorg/chromium/net/X509Util;
.super Ljava/lang/Object;
.source "X509Util.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/net/X509Util$1;,
        Lorg/chromium/net/X509Util$X509TrustManagerJellyBean;,
        Lorg/chromium/net/X509Util$X509TrustManagerIceCreamSandwich;,
        Lorg/chromium/net/X509Util$X509TrustManagerImplementation;,
        Lorg/chromium/net/X509Util$TrustStorageListener;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "net"
.end annotation


# static fields
.field private static final HEX_DIGITS:[C

.field private static final OID_ANY_EKU:Ljava/lang/String; = "2.5.29.37.0"

.field private static final OID_SERVER_GATED_MICROSOFT:Ljava/lang/String; = "1.3.6.1.4.1.311.10.3.3"

.field private static final OID_SERVER_GATED_NETSCAPE:Ljava/lang/String; = "2.16.840.1.113730.4.1"

.field private static final OID_TLS_SERVER_AUTH:Ljava/lang/String; = "1.3.6.1.5.5.7.3.1"

.field private static final TAG:Ljava/lang/String; = "X509Util"

.field private static sCertificateFactory:Ljava/security/cert/CertificateFactory;

.field private static sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

.field private static sDisableNativeCodeForTest:Z

.field private static sLoadedSystemKeyStore:Z

.field private static final sLock:Ljava/lang/Object;

.field private static sSystemCertificateDirectory:Ljava/io/File;

.field private static sSystemKeyStore:Ljava/security/KeyStore;

.field private static sSystemTrustAnchorCache:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljavax/security/auth/x500/X500Principal;",
            "Ljava/security/PublicKey;",
            ">;>;"
        }
    .end annotation
.end field

.field private static sTestKeyStore:Ljava/security/KeyStore;

.field private static sTestTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

.field private static sTrustStorageListener:Lorg/chromium/net/X509Util$TrustStorageListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 171
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lorg/chromium/net/X509Util;->sLock:Ljava/lang/Object;

    .line 178
    const/4 v0, 0x0

    sput-boolean v0, Lorg/chromium/net/X509Util;->sDisableNativeCodeForTest:Z

    .line 315
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lorg/chromium/net/X509Util;->HEX_DIGITS:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    return-void
.end method

.method static synthetic access$000()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    .line 49
    invoke-static {}, Lorg/chromium/net/X509Util;->reloadDefaultTrustManager()V

    return-void
.end method

.method public static addTestRootCertificate([B)V
    .locals 5
    .param p0, "rootCertBytes"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 293
    invoke-static {}, Lorg/chromium/net/X509Util;->ensureInitialized()V

    .line 294
    invoke-static {p0}, Lorg/chromium/net/X509Util;->createCertificateFromBytes([B)Ljava/security/cert/X509Certificate;

    move-result-object v0

    .line 295
    .local v0, "rootCert":Ljava/security/cert/X509Certificate;
    sget-object v2, Lorg/chromium/net/X509Util;->sLock:Ljava/lang/Object;

    monitor-enter v2

    .line 296
    :try_start_0
    sget-object v1, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "root_cert_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    invoke-virtual {v4}, Ljava/security/KeyStore;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    .line 298
    invoke-static {}, Lorg/chromium/net/X509Util;->reloadTestTrustManager()V

    .line 299
    monitor-exit v2

    .line 300
    return-void

    .line 299
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static clearTestRootCertificates()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .prologue
    .line 304
    invoke-static {}, Lorg/chromium/net/X509Util;->ensureInitialized()V

    .line 305
    sget-object v1, Lorg/chromium/net/X509Util;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 307
    :try_start_0
    sget-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 308
    invoke-static {}, Lorg/chromium/net/X509Util;->reloadTestTrustManager()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    :goto_0
    :try_start_1
    monitor-exit v1

    .line 313
    return-void

    .line 312
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 309
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static createCertificateFromBytes([B)Ljava/security/cert/X509Certificate;
    .locals 2
    .param p0, "derBytes"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 286
    invoke-static {}, Lorg/chromium/net/X509Util;->ensureInitialized()V

    .line 287
    sget-object v0, Lorg/chromium/net/X509Util;->sCertificateFactory:Ljava/security/cert/CertificateFactory;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method private static createTrustManager(Ljava/security/KeyStore;)Lorg/chromium/net/X509Util$X509TrustManagerImplementation;
    .locals 12
    .param p0, "keyStore"    # Ljava/security/KeyStore;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 240
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v1

    .line 241
    .local v1, "algorithm":Ljava/lang/String;
    invoke-static {v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v8

    .line 242
    .local v8, "tmf":Ljavax/net/ssl/TrustManagerFactory;
    invoke-virtual {v8, p0}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 244
    invoke-virtual {v8}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v2

    .local v2, "arr$":[Ljavax/net/ssl/TrustManager;
    array-length v6, v2

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_2

    aget-object v7, v2, v5

    .line 245
    .local v7, "tm":Ljavax/net/ssl/TrustManager;
    instance-of v9, v7, Ljavax/net/ssl/X509TrustManager;

    if-eqz v9, :cond_1

    .line 247
    :try_start_0
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x11

    if-lt v9, v10, :cond_0

    .line 248
    new-instance v10, Lorg/chromium/net/X509Util$X509TrustManagerJellyBean;

    move-object v0, v7

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    move-object v9, v0

    invoke-direct {v10, v9}, Lorg/chromium/net/X509Util$X509TrustManagerJellyBean;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    move-object v9, v10

    .line 259
    .end local v7    # "tm":Ljavax/net/ssl/TrustManager;
    :goto_1
    return-object v9

    .line 250
    .restart local v7    # "tm":Ljavax/net/ssl/TrustManager;
    :cond_0
    new-instance v10, Lorg/chromium/net/X509Util$X509TrustManagerIceCreamSandwich;

    move-object v0, v7

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    move-object v9, v0

    invoke-direct {v10, v9}, Lorg/chromium/net/X509Util$X509TrustManagerIceCreamSandwich;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v9, v10

    goto :goto_1

    .line 252
    :catch_0
    move-exception v4

    .line 253
    .local v4, "e":Ljava/lang/IllegalArgumentException;
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 254
    .local v3, "className":Ljava/lang/String;
    const-string v9, "X509Util"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Error creating trust manager ("

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "): "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    .end local v3    # "className":Ljava/lang/String;
    .end local v4    # "e":Ljava/lang/IllegalArgumentException;
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 258
    .end local v7    # "tm":Ljavax/net/ssl/TrustManager;
    :cond_2
    const-string v9, "X509Util"

    const-string v10, "Could not find suitable trust manager"

    invoke-static {v9, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 259
    const/4 v9, 0x0

    goto :goto_1
.end method

.method private static ensureInitialized()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 185
    sget-object v1, Lorg/chromium/net/X509Util;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 186
    :try_start_0
    sget-object v2, Lorg/chromium/net/X509Util;->sCertificateFactory:Ljava/security/cert/CertificateFactory;

    if-nez v2, :cond_0

    .line 187
    const-string v2, "X.509"

    invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v2

    sput-object v2, Lorg/chromium/net/X509Util;->sCertificateFactory:Ljava/security/cert/CertificateFactory;

    .line 189
    :cond_0
    sget-object v2, Lorg/chromium/net/X509Util;->sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    if-nez v2, :cond_1

    .line 190
    const/4 v2, 0x0

    invoke-static {v2}, Lorg/chromium/net/X509Util;->createTrustManager(Ljava/security/KeyStore;)Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    move-result-object v2

    sput-object v2, Lorg/chromium/net/X509Util;->sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    .line 192
    :cond_1
    sget-boolean v2, Lorg/chromium/net/X509Util;->sLoadedSystemKeyStore:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_3

    .line 194
    :try_start_1
    const-string v2, "AndroidCAStore"

    invoke-static {v2}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v2

    sput-object v2, Lorg/chromium/net/X509Util;->sSystemKeyStore:Ljava/security/KeyStore;
    :try_end_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    :try_start_2
    sget-object v2, Lorg/chromium/net/X509Util;->sSystemKeyStore:Ljava/security/KeyStore;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    :goto_0
    :try_start_3
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ANDROID_ROOT"

    invoke-static {v4}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/etc/security/cacerts"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v2, Lorg/chromium/net/X509Util;->sSystemCertificateDirectory:Ljava/io/File;
    :try_end_3
    .catch Ljava/security/KeyStoreException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 206
    :goto_1
    :try_start_4
    sget-boolean v2, Lorg/chromium/net/X509Util;->sDisableNativeCodeForTest:Z

    if-nez v2, :cond_2

    .line 207
    sget-object v2, Lorg/chromium/net/X509Util;->sSystemKeyStore:Ljava/security/KeyStore;

    if-eqz v2, :cond_8

    :goto_2
    invoke-static {v0}, Lorg/chromium/net/X509Util;->nativeRecordCertVerifyCapabilitiesHistogram(Z)V

    .line 208
    :cond_2
    const/4 v0, 0x1

    sput-boolean v0, Lorg/chromium/net/X509Util;->sLoadedSystemKeyStore:Z

    .line 210
    :cond_3
    sget-object v0, Lorg/chromium/net/X509Util;->sSystemTrustAnchorCache:Ljava/util/Set;

    if-nez v0, :cond_4

    .line 211
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/chromium/net/X509Util;->sSystemTrustAnchorCache:Ljava/util/Set;

    .line 213
    :cond_4
    sget-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    if-nez v0, :cond_5

    .line 214
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    sput-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 216
    :try_start_5
    sget-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 221
    :cond_5
    :goto_3
    :try_start_6
    sget-object v0, Lorg/chromium/net/X509Util;->sTestTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    if-nez v0, :cond_6

    .line 222
    sget-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    invoke-static {v0}, Lorg/chromium/net/X509Util;->createTrustManager(Ljava/security/KeyStore;)Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    move-result-object v0

    sput-object v0, Lorg/chromium/net/X509Util;->sTestTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    .line 224
    :cond_6
    sget-boolean v0, Lorg/chromium/net/X509Util;->sDisableNativeCodeForTest:Z

    if-nez v0, :cond_7

    sget-object v0, Lorg/chromium/net/X509Util;->sTrustStorageListener:Lorg/chromium/net/X509Util$TrustStorageListener;

    if-nez v0, :cond_7

    .line 225
    new-instance v0, Lorg/chromium/net/X509Util$TrustStorageListener;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lorg/chromium/net/X509Util$TrustStorageListener;-><init>(Lorg/chromium/net/X509Util$1;)V

    sput-object v0, Lorg/chromium/net/X509Util;->sTrustStorageListener:Lorg/chromium/net/X509Util$TrustStorageListener;

    .line 226
    invoke-static {}, Lorg/chromium/net/X509Util;->nativeGetApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lorg/chromium/net/X509Util;->sTrustStorageListener:Lorg/chromium/net/X509Util$TrustStorageListener;

    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "android.security.STORAGE_CHANGED"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 229
    :cond_7
    monitor-exit v1

    .line 230
    return-void

    .line 207
    :cond_8
    const/4 v0, 0x0

    goto :goto_2

    .line 229
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    .line 217
    :catch_0
    move-exception v0

    goto :goto_3

    .line 202
    :catch_1
    move-exception v2

    goto :goto_1

    .line 197
    :catch_2
    move-exception v2

    goto/16 :goto_0
.end method

.method private static hashPrincipal(Ljavax/security/auth/x500/X500Principal;)Ljava/lang/String;
    .locals 6
    .param p0, "principal"    # Ljavax/security/auth/x500/X500Principal;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 323
    const-string v3, "MD5"

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    invoke-virtual {p0}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    .line 324
    .local v0, "digest":[B
    const/16 v3, 0x8

    new-array v1, v3, [C

    .line 325
    .local v1, "hexChars":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    .line 326
    mul-int/lit8 v3, v2, 0x2

    sget-object v4, Lorg/chromium/net/X509Util;->HEX_DIGITS:[C

    rsub-int/lit8 v5, v2, 0x3

    aget-byte v5, v0, v5

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0xf

    aget-char v4, v4, v5

    aput-char v4, v1, v3

    .line 327
    mul-int/lit8 v3, v2, 0x2

    add-int/lit8 v3, v3, 0x1

    sget-object v4, Lorg/chromium/net/X509Util;->HEX_DIGITS:[C

    rsub-int/lit8 v5, v2, 0x3

    aget-byte v5, v0, v5

    and-int/lit8 v5, v5, 0xf

    aget-char v4, v4, v5

    aput-char v4, v1, v3

    .line 325
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 329
    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v1}, Ljava/lang/String;-><init>([C)V

    return-object v3
.end method

.method private static isKnownRoot(Ljava/security/cert/X509Certificate;)Z
    .locals 12
    .param p0, "root"    # Ljava/security/cert/X509Certificate;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 335
    sget-object v9, Lorg/chromium/net/X509Util;->sSystemKeyStore:Ljava/security/KeyStore;

    if-nez v9, :cond_1

    .line 385
    :cond_0
    :goto_0
    return v7

    .line 340
    :cond_1
    new-instance v6, Landroid/util/Pair;

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v9

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 342
    .local v6, "key":Landroid/util/Pair;, "Landroid/util/Pair<Ljavax/security/auth/x500/X500Principal;Ljava/security/PublicKey;>;"
    sget-object v9, Lorg/chromium/net/X509Util;->sSystemTrustAnchorCache:Ljava/util/Set;

    invoke-interface {v9, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move v7, v8

    .line 343
    goto :goto_0

    .line 355
    :cond_2
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v9

    invoke-static {v9}, Lorg/chromium/net/X509Util;->hashPrincipal(Ljavax/security/auth/x500/X500Principal;)Ljava/lang/String;

    move-result-object v4

    .line 356
    .local v4, "hash":Ljava/lang/String;
    const/4 v5, 0x0

    .line 357
    .local v5, "i":I
    :goto_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const/16 v10, 0x2e

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 358
    .local v0, "alias":Ljava/lang/String;
    new-instance v9, Ljava/io/File;

    sget-object v10, Lorg/chromium/net/X509Util;->sSystemCertificateDirectory:Ljava/io/File;

    invoke-direct {v9, v10, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 361
    sget-object v9, Lorg/chromium/net/X509Util;->sSystemKeyStore:Ljava/security/KeyStore;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "system:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v1

    .line 366
    .local v1, "anchor":Ljava/security/cert/Certificate;
    if-nez v1, :cond_4

    .line 356
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 369
    :cond_4
    instance-of v9, v1, Ljava/security/cert/X509Certificate;

    if-nez v9, :cond_5

    .line 371
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 372
    .local v3, "className":Ljava/lang/String;
    const-string v9, "X509Util"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Anchor "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " not an X509Certificate: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .end local v3    # "className":Ljava/lang/String;
    :cond_5
    move-object v2, v1

    .line 377
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 378
    .local v2, "anchorX509":Ljava/security/cert/X509Certificate;
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v9

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v9

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 380
    sget-object v7, Lorg/chromium/net/X509Util;->sSystemTrustAnchorCache:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v7, v8

    .line 381
    goto/16 :goto_0
.end method

.method private static native nativeGetApplicationContext()Landroid/content/Context;
.end method

.method private static native nativeNotifyKeyChainChanged()V
.end method

.method private static native nativeRecordCertVerifyCapabilitiesHistogram(Z)V
.end method

.method private static reloadDefaultTrustManager()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 275
    sput-object v0, Lorg/chromium/net/X509Util;->sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    .line 276
    sput-object v0, Lorg/chromium/net/X509Util;->sSystemTrustAnchorCache:Ljava/util/Set;

    .line 277
    invoke-static {}, Lorg/chromium/net/X509Util;->nativeNotifyKeyChainChanged()V

    .line 278
    invoke-static {}, Lorg/chromium/net/X509Util;->ensureInitialized()V

    .line 279
    return-void
.end method

.method private static reloadTestTrustManager()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    .line 267
    sget-object v0, Lorg/chromium/net/X509Util;->sTestKeyStore:Ljava/security/KeyStore;

    invoke-static {v0}, Lorg/chromium/net/X509Util;->createTrustManager(Ljava/security/KeyStore;)Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    move-result-object v0

    sput-object v0, Lorg/chromium/net/X509Util;->sTestTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    .line 268
    return-void
.end method

.method public static setDisableNativeCodeForTest(Z)V
    .locals 0
    .param p0, "disabled"    # Z

    .prologue
    .line 501
    sput-boolean p0, Lorg/chromium/net/X509Util;->sDisableNativeCodeForTest:Z

    .line 502
    return-void
.end method

.method static verifyKeyUsage(Ljava/security/cert/X509Certificate;)Z
    .locals 7
    .param p0, "certificate"    # Ljava/security/cert/X509Certificate;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 401
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getExtendedKeyUsage()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 408
    .local v2, "ekuOids":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-nez v2, :cond_1

    .line 420
    .end local v2    # "ekuOids":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    return v4

    .line 402
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/NullPointerException;
    move v4, v5

    .line 406
    goto :goto_0

    .line 411
    .end local v0    # "e":Ljava/lang/NullPointerException;
    .restart local v2    # "ekuOids":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 412
    .local v1, "ekuOid":Ljava/lang/String;
    const-string v6, "1.3.6.1.5.5.7.3.1"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "2.5.29.37.0"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "2.16.840.1.113730.4.1"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "1.3.6.1.4.1.311.10.3.3"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .end local v1    # "ekuOid":Ljava/lang/String;
    :cond_3
    move v4, v5

    .line 420
    goto :goto_0
.end method

.method public static verifyServerCertificates([[BLjava/lang/String;Ljava/lang/String;)Lorg/chromium/net/AndroidCertVerifyResult;
    .locals 12
    .param p0, "certChain"    # [[B
    .param p1, "authType"    # Ljava/lang/String;
    .param p2, "host"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyStoreException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .prologue
    const/4 v10, -0x1

    const/4 v9, 0x0

    .line 427
    if-eqz p0, :cond_0

    array-length v8, p0

    if-eqz v8, :cond_0

    aget-object v8, p0, v9

    if-nez v8, :cond_1

    .line 428
    :cond_0
    new-instance v8, Ljava/lang/IllegalArgumentException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {p0}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 434
    :cond_1
    :try_start_0
    invoke-static {}, Lorg/chromium/net/X509Util;->ensureInitialized()V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 439
    array-length v8, p0

    new-array v6, v8, [Ljava/security/cert/X509Certificate;

    .line 441
    .local v6, "serverCertificates":[Ljava/security/cert/X509Certificate;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    :try_start_1
    array-length v8, p0

    if-ge v3, v8, :cond_2

    .line 442
    aget-object v8, p0, v3

    invoke-static {v8}, Lorg/chromium/net/X509Util;->createCertificateFromBytes([B)Ljava/security/cert/X509Certificate;

    move-result-object v8

    aput-object v8, v6, v3
    :try_end_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 441
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 435
    .end local v3    # "i":I
    .end local v6    # "serverCertificates":[Ljava/security/cert/X509Certificate;
    :catch_0
    move-exception v0

    .line 436
    .local v0, "e":Ljava/security/cert/CertificateException;
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    invoke-direct {v8, v10}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    .line 495
    .end local v0    # "e":Ljava/security/cert/CertificateException;
    :goto_1
    return-object v8

    .line 444
    .restart local v3    # "i":I
    .restart local v6    # "serverCertificates":[Ljava/security/cert/X509Certificate;
    :catch_1
    move-exception v0

    .line 445
    .restart local v0    # "e":Ljava/security/cert/CertificateException;
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v9, -0x5

    invoke-direct {v8, v9}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    goto :goto_1

    .line 453
    .end local v0    # "e":Ljava/security/cert/CertificateException;
    :cond_2
    const/4 v8, 0x0

    :try_start_2
    aget-object v8, v6, v8

    invoke-virtual {v8}, Ljava/security/cert/X509Certificate;->checkValidity()V

    .line 454
    const/4 v8, 0x0

    aget-object v8, v6, v8

    invoke-static {v8}, Lorg/chromium/net/X509Util;->verifyKeyUsage(Ljava/security/cert/X509Certificate;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 455
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v9, -0x6

    invoke-direct {v8, v9}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V
    :try_end_2
    .catch Ljava/security/cert/CertificateExpiredException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_1

    .line 458
    :catch_2
    move-exception v0

    .line 459
    .local v0, "e":Ljava/security/cert/CertificateExpiredException;
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v9, -0x3

    invoke-direct {v8, v9}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    goto :goto_1

    .line 460
    .end local v0    # "e":Ljava/security/cert/CertificateExpiredException;
    :catch_3
    move-exception v0

    .line 461
    .local v0, "e":Ljava/security/cert/CertificateNotYetValidException;
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v9, -0x4

    invoke-direct {v8, v9}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    goto :goto_1

    .line 462
    .end local v0    # "e":Ljava/security/cert/CertificateNotYetValidException;
    :catch_4
    move-exception v0

    .line 463
    .local v0, "e":Ljava/security/cert/CertificateException;
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    invoke-direct {v8, v10}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    goto :goto_1

    .line 466
    .end local v0    # "e":Ljava/security/cert/CertificateException;
    :cond_3
    sget-object v9, Lorg/chromium/net/X509Util;->sLock:Ljava/lang/Object;

    monitor-enter v9

    .line 468
    :try_start_3
    sget-object v8, Lorg/chromium/net/X509Util;->sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    if-nez v8, :cond_4

    .line 469
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v10, -0x1

    invoke-direct {v8, v10}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    monitor-exit v9

    goto :goto_1

    .line 497
    :catchall_0
    move-exception v8

    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v8

    .line 473
    :cond_4
    :try_start_4
    sget-object v8, Lorg/chromium/net/X509Util;->sDefaultTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    invoke-interface {v8, v6, p1, p2}, Lorg/chromium/net/X509Util$X509TrustManagerImplementation;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_4
    .catch Ljava/security/cert/CertificateException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v7

    .line 489
    .local v7, "verifiedChain":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/X509Certificate;>;"
    :goto_2
    const/4 v4, 0x0

    .line 490
    .local v4, "isIssuedByKnownRoot":Z
    :try_start_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-lez v8, :cond_5

    .line 491
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 492
    .local v5, "root":Ljava/security/cert/X509Certificate;
    invoke-static {v5}, Lorg/chromium/net/X509Util;->isKnownRoot(Ljava/security/cert/X509Certificate;)Z

    move-result v4

    .line 495
    .end local v5    # "root":Ljava/security/cert/X509Certificate;
    :cond_5
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v10, 0x0

    invoke-direct {v8, v10, v4, v7}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(IZLjava/util/List;)V

    monitor-exit v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 475
    .end local v4    # "isIssuedByKnownRoot":Z
    .end local v7    # "verifiedChain":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/X509Certificate;>;"
    :catch_5
    move-exception v1

    .line 477
    .local v1, "eDefaultManager":Ljava/security/cert/CertificateException;
    :try_start_6
    sget-object v8, Lorg/chromium/net/X509Util;->sTestTrustManager:Lorg/chromium/net/X509Util$X509TrustManagerImplementation;

    invoke-interface {v8, v6, p1, p2}, Lorg/chromium/net/X509Util$X509TrustManagerImplementation;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_6
    .catch Ljava/security/cert/CertificateException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v7

    .restart local v7    # "verifiedChain":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/X509Certificate;>;"
    goto :goto_2

    .line 479
    .end local v7    # "verifiedChain":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/X509Certificate;>;"
    :catch_6
    move-exception v2

    .line 482
    .local v2, "eTestManager":Ljava/security/cert/CertificateException;
    :try_start_7
    const-string v8, "X509Util"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Failed to validate the certificate chain, error: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v1}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 484
    new-instance v8, Lorg/chromium/net/AndroidCertVerifyResult;

    const/4 v10, -0x2

    invoke-direct {v8, v10}, Lorg/chromium/net/AndroidCertVerifyResult;-><init>(I)V

    monitor-exit v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_1
.end method
