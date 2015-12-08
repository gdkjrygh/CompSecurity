.class Lorg/chromium/content/browser/crypto/CipherFactory$1;
.super Ljava/lang/Object;
.source "CipherFactory.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/crypto/CipherFactory;->createGeneratorCallable()Ljava/util/concurrent/Callable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/crypto/CipherFactory;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/crypto/CipherFactory;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lorg/chromium/content/browser/crypto/CipherFactory$1;->this$0:Lorg/chromium/content/browser/crypto/CipherFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 149
    invoke-virtual {p0}, Lorg/chromium/content/browser/crypto/CipherFactory$1;->call()Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    move-result-object v0

    return-object v0
.end method

.method public call()Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 155
    :try_start_0
    iget-object v5, p0, Lorg/chromium/content/browser/crypto/CipherFactory$1;->this$0:Lorg/chromium/content/browser/crypto/CipherFactory;

    # getter for: Lorg/chromium/content/browser/crypto/CipherFactory;->mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;
    invoke-static {v5}, Lorg/chromium/content/browser/crypto/CipherFactory;->access$200(Lorg/chromium/content/browser/crypto/CipherFactory;)Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    move-result-object v5

    const/16 v7, 0x10

    invoke-virtual {v5, v7}, Lorg/chromium/content/browser/crypto/ByteArrayGenerator;->getBytes(I)[B

    move-result-object v4

    .line 156
    .local v4, "seed":[B
    iget-object v5, p0, Lorg/chromium/content/browser/crypto/CipherFactory$1;->this$0:Lorg/chromium/content/browser/crypto/CipherFactory;

    # getter for: Lorg/chromium/content/browser/crypto/CipherFactory;->mRandomNumberProvider:Lorg/chromium/content/browser/crypto/ByteArrayGenerator;
    invoke-static {v5}, Lorg/chromium/content/browser/crypto/CipherFactory;->access$200(Lorg/chromium/content/browser/crypto/CipherFactory;)Lorg/chromium/content/browser/crypto/ByteArrayGenerator;

    move-result-object v5

    const/16 v7, 0x10

    invoke-virtual {v5, v7}, Lorg/chromium/content/browser/crypto/ByteArrayGenerator;->getBytes(I)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 174
    .local v2, "iv":[B
    :try_start_1
    const-string v5, "SHA1PRNG"

    invoke-static {v5}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v3

    .line 175
    .local v3, "random":Ljava/security/SecureRandom;
    invoke-virtual {v3, v4}, Ljava/security/SecureRandom;->setSeed([B)V

    .line 177
    const-string v5, "AES"

    invoke-static {v5}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v1

    .line 178
    .local v1, "generator":Ljavax/crypto/KeyGenerator;
    const/16 v5, 0x80

    invoke-virtual {v1, v5, v3}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V

    .line 179
    new-instance v5, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;

    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v7

    invoke-direct {v5, v7, v2}, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;-><init>(Ljava/security/Key;[B)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 182
    .end local v1    # "generator":Ljavax/crypto/KeyGenerator;
    .end local v2    # "iv":[B
    .end local v3    # "random":Ljava/security/SecureRandom;
    .end local v4    # "seed":[B
    :goto_0
    return-object v5

    .line 157
    :catch_0
    move-exception v0

    .line 158
    .local v0, "e":Ljava/io/IOException;
    const-string v5, "CipherFactory"

    const-string v7, "Couldn\'t get generator data."

    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v5, v6

    .line 159
    goto :goto_0

    .line 160
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 161
    .local v0, "e":Ljava/security/GeneralSecurityException;
    const-string v5, "CipherFactory"

    const-string v7, "Couldn\'t get generator data."

    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v5, v6

    .line 162
    goto :goto_0

    .line 180
    .end local v0    # "e":Ljava/security/GeneralSecurityException;
    .restart local v2    # "iv":[B
    .restart local v4    # "seed":[B
    :catch_2
    move-exception v0

    .line 181
    .restart local v0    # "e":Ljava/security/GeneralSecurityException;
    const-string v5, "CipherFactory"

    const-string v7, "Couldn\'t get generator instances."

    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v5, v6

    .line 182
    goto :goto_0
.end method
