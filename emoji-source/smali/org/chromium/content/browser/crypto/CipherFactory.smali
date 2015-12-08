.class public Lorg/chromium/content/browser/crypto/CipherFactory;
.super Ljava/lang/Object;
.source "CipherFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;,
        Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field static final BUNDLE_IV:Ljava/lang/String; = "org.chromium.content.browser.crypto.CipherFactory.IV"

.field static final BUNDLE_KEY:Ljava/lang/String; = "org.chromium.content.browser.crypto.CipherFactory.KEY"

.field static final NUM_BYTES:I = 0x10

.field private static final TAG:Ljava/lang/String; = "CipherFactory"


# instance fields
.field private mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

.field private mDataGenerator:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<",
            "Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;",
            ">;"
        }
    .end annotation
.end field

.field private final mDataLock:Ljava/lang/Object;

.field private mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataLock:Ljava/lang/Object;

    .line 271
    new-instance v0, Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    invoke-direct {v0}, Lorg/chromium/content/browser/crypto/ByteArrayGenerator;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    .line 272
    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/content/browser/crypto/CipherFactory$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/content/browser/crypto/CipherFactory$1;

    .prologue
    .line 47
    invoke-direct {p0}, Lorg/chromium/content/browser/crypto/CipherFactory;-><init>()V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/crypto/CipherFactory;)Lorg/chromium/content/browser/crypto/ByteArrayGenerator;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/crypto/CipherFactory;

    .prologue
    .line 47
    iget-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    return-object v0
.end method

.method private createGeneratorCallable()Ljava/util/concurrent/Callable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Callable",
            "<",
            "Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;",
            ">;"
        }
    .end annotation

    .prologue
    .line 149
    new-instance v0, Lorg/chromium/content/browser/crypto/CipherFactory$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/crypto/CipherFactory$1;-><init>(Lorg/chromium/content/browser/crypto/CipherFactory;)V

    return-object v0
.end method

.method public static getInstance()Lorg/chromium/content/browser/crypto/CipherFactory;
    .locals 1

    .prologue
    .line 87
    # getter for: Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;->sInstance:Lorg/chromium/content/browser/crypto/CipherFactory;
    invoke-static {}, Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;->access$100()Lorg/chromium/content/browser/crypto/CipherFactory;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCipher(I)Ljavax/crypto/Cipher;
    .locals 5
    .param p1, "opmode"    # I

    .prologue
    .line 98
    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/crypto/CipherFactory;->getCipherData(Z)Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    move-result-object v1

    .line 100
    .local v1, "data":Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    if-eqz v1, :cond_0

    .line 102
    :try_start_0
    const-string v2, "AES/CBC/PKCS5Padding"

    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 103
    .local v0, "cipher":Ljavax/crypto/Cipher;
    iget-object v2, v1, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->key:Ljava/security/Key;

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    iget-object v4, v1, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->iv:[B

    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, p1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .end local v0    # "cipher":Ljavax/crypto/Cipher;
    :goto_0
    return-object v0

    .line 105
    :catch_0
    move-exception v2

    .line 110
    :cond_0
    const-string v2, "CipherFactory"

    const-string v3, "Error in creating cipher instance."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    const/4 v0, 0x0

    goto :goto_0
.end method

.method getCipherData(Z)Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    .locals 4
    .param p1, "generateIfNeeded"    # Z

    .prologue
    .line 120
    iget-object v2, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    if-nez v2, :cond_1

    if-eqz p1, :cond_1

    .line 122
    invoke-virtual {p0}, Lorg/chromium/content/browser/crypto/CipherFactory;->triggerKeyGeneration()V

    .line 127
    :try_start_0
    iget-object v2, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataGenerator:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v2}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 135
    .local v0, "data":Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    iget-object v3, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataLock:Ljava/lang/Object;

    monitor-enter v3

    .line 136
    :try_start_1
    iget-object v2, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    if-nez v2, :cond_0

    iput-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    .line 137
    :cond_0
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .end local v0    # "data":Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    :cond_1
    iget-object v2, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    return-object v2

    .line 128
    :catch_0
    move-exception v1

    .line 129
    .local v1, "e":Ljava/lang/InterruptedException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 130
    .end local v1    # "e":Ljava/lang/InterruptedException;
    :catch_1
    move-exception v1

    .line 131
    .local v1, "e":Ljava/util/concurrent/ExecutionException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 137
    .end local v1    # "e":Ljava/util/concurrent/ExecutionException;
    .restart local v0    # "data":Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    :catchall_0
    move-exception v2

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2
.end method

.method public restoreFromBundle(Landroid/os/Bundle;)Z
    .locals 8
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 237
    if-nez p1, :cond_1

    .line 259
    :cond_0
    :goto_0
    return v4

    .line 239
    :cond_1
    const-string v6, "org.chromium.content.browser.crypto.CipherFactory.KEY"

    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    .line 240
    .local v3, "wrappedKey":[B
    const-string v6, "org.chromium.content.browser.crypto.CipherFactory.IV"

    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v2

    .line 241
    .local v2, "iv":[B
    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    .line 244
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v6, "AES"

    invoke-direct {v0, v3, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 245
    .local v0, "bundledKey":Ljava/security/Key;
    iget-object v6, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataLock:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    :try_start_1
    iget-object v7, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    if-nez v7, :cond_2

    .line 247
    new-instance v7, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    invoke-direct {v7, v0, v2}, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;-><init>(Ljava/security/Key;[B)V

    iput-object v7, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    .line 248
    monitor-exit v6

    move v4, v5

    goto :goto_0

    .line 249
    :cond_2
    iget-object v7, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    iget-object v7, v7, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->key:Ljava/security/Key;

    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    iget-object v7, v7, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->iv:[B

    invoke-static {v7, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 250
    monitor-exit v6

    move v4, v5

    goto :goto_0

    .line 252
    :cond_3
    const-string v5, "CipherFactory"

    const-string v7, "Attempted to restore different cipher data."

    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 254
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v5
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 255
    .end local v0    # "bundledKey":Ljava/security/Key;
    :catch_0
    move-exception v1

    .line 256
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    const-string v5, "CipherFactory"

    const-string v6, "Error in restoring the key from the bundle."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public saveToBundle(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 215
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/crypto/CipherFactory;->getCipherData(Z)Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    move-result-object v0

    .line 216
    .local v0, "data":Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    if-nez v0, :cond_1

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 218
    :cond_1
    iget-object v2, v0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->key:Ljava/security/Key;

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    .line 219
    .local v1, "wrappedKey":[B
    if-eqz v1, :cond_0

    iget-object v2, v0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->iv:[B

    if-eqz v2, :cond_0

    .line 220
    const-string v2, "org.chromium.content.browser.crypto.CipherFactory.KEY"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 221
    const-string v2, "org.chromium.content.browser.crypto.CipherFactory.IV"

    iget-object v3, v0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->iv:[B

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto :goto_0
.end method

.method setRandomNumberProviderForTests(Lorg/chromium/content/browser/crypto/ByteArrayGenerator;)V
    .locals 0
    .param p1, "mockProvider"    # Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    .prologue
    .line 267
    iput-object p1, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    .line 268
    return-void
.end method

.method public triggerKeyGeneration()V
    .locals 3

    .prologue
    .line 194
    iget-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mData:Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    if-eqz v0, :cond_0

    .line 202
    :goto_0
    return-void

    .line 196
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataLock:Ljava/lang/Object;

    monitor-enter v1

    .line 197
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataGenerator:Ljava/util/concurrent/FutureTask;

    if-nez v0, :cond_1

    .line 198
    new-instance v0, Ljava/util/concurrent/FutureTask;

    invoke-direct {p0}, Lorg/chromium/content/browser/crypto/CipherFactory;->createGeneratorCallable()Ljava/util/concurrent/Callable;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataGenerator:Ljava/util/concurrent/FutureTask;

    .line 199
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lorg/chromium/content/browser/crypto/CipherFactory;->mDataGenerator:Ljava/util/concurrent/FutureTask;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 201
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
