.class public Lcom/worklight/utils/SecurityUtils;
.super Ljava/lang/Object;
.source "SecurityUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/worklight/utils/SecurityUtils$PBKDF2;
    }
.end annotation


# static fields
.field public static final HASH_ALGORITH_MD5:Ljava/lang/String; = "MD5"

.field public static final HASH_ALGORITH_SHA1:Ljava/lang/String; = "SHA-1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decryptData(Ljava/io/InputStream;[B)Ljava/io/InputStream;
    .locals 4
    .param p0, "encryptedStream"    # Ljava/io/InputStream;
    .param p1, "key"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 164
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 165
    .local v2, "skeySpec":Ljavax/crypto/spec/SecretKeySpec;
    const-string v3, "AES"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 166
    .local v0, "cipher":Ljavax/crypto/Cipher;
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 167
    new-instance v1, Ljavax/crypto/CipherInputStream;

    invoke-direct {v1, p0, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 168
    .local v1, "decryptedStream":Ljava/io/InputStream;
    return-object v1
.end method

.method public static hashData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "algorithm"    # Ljava/lang/String;

    .prologue
    .line 141
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 142
    .local v0, "b":[B
    invoke-static {v0, p1}, Lcom/worklight/utils/SecurityUtils;->hashData([BLjava/lang/String;)[B

    move-result-object v2

    .line 143
    .local v2, "messageDigest":[B
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .local v3, "result":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v4, v2

    if-lt v1, v4, :cond_0

    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 145
    :cond_0
    aget-byte v4, v2, v1

    and-int/lit16 v4, v4, 0xff

    add-int/lit16 v4, v4, 0x100

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static hashData([BLjava/lang/String;)[B
    .locals 5
    .param p0, "data"    # [B
    .param p1, "algorithm"    # Ljava/lang/String;

    .prologue
    .line 152
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 153
    .local v1, "md":Ljava/security/MessageDigest;
    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    .line 154
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 155
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 159
    .end local v1    # "md":Ljava/security/MessageDigest;
    :goto_0
    return-object v2

    .line 157
    :catch_0
    move-exception v0

    .line 158
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " is not supported on this device"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 159
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static kpg(Landroid/content/Context;[Ljava/lang/String;)[B
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "arr"    # [Ljava/lang/String;

    .prologue
    .line 173
    :try_start_0
    invoke-static {p0, p1}, Lcom/worklight/utils/PaidSecurityUtils;->kpg(Landroid/content/Context;[Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 176
    :goto_0
    return-object v1

    .line 174
    :catch_0
    move-exception v0

    .line 176
    .local v0, "e":Ljava/lang/Throwable;
    const/4 v1, 0x0

    new-array v1, v1, [B

    goto :goto_0
.end method
