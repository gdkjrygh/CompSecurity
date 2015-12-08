.class public Lcom/worklight/utils/SecurityUtils$PBKDF2;
.super Ljava/lang/Object;
.source "SecurityUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/utils/SecurityUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PBKDF2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ceil(II)I
    .locals 2
    .param p0, "dkLen"    # I
    .param p1, "hLen"    # I

    .prologue
    .line 119
    div-int v0, p0, p1

    .line 120
    .local v0, "len":I
    rem-int v1, p0, p1

    if-eqz v1, :cond_0

    .line 121
    add-int/lit8 v0, v0, 0x1

    .line 122
    :cond_0
    return v0
.end method

.method private static concat([B[B)[B
    .locals 5
    .param p0, "ba1"    # [B
    .param p1, "ba2"    # [B

    .prologue
    const/4 v4, 0x0

    .line 107
    array-length v2, p0

    array-length v3, p1

    add-int v1, v2, v3

    .line 108
    .local v1, "length":I
    new-array v0, v1, [B

    .line 109
    .local v0, "ba":[B
    array-length v2, p0

    invoke-static {p0, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    array-length v2, p0

    array-length v3, p1

    invoke-static {p1, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    return-object v0
.end method

.method private static encodedInt(I)[B
    .locals 3
    .param p0, "i"    # I

    .prologue
    .line 129
    const/4 v1, 0x4

    new-array v0, v1, [B

    .line 130
    .local v0, "encoded":[B
    const/4 v1, 0x0

    const/high16 v2, -0x1000000

    and-int/2addr v2, p0

    ushr-int/lit8 v2, v2, 0x18

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 131
    const/4 v1, 0x1

    const/high16 v2, 0xff0000

    and-int/2addr v2, p0

    ushr-int/lit8 v2, v2, 0x10

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 132
    const/4 v1, 0x2

    const v2, 0xff00

    and-int/2addr v2, p0

    ushr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 133
    const/4 v1, 0x3

    and-int/lit16 v2, p0, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 135
    return-object v0
.end method

.method private static f(Ljavax/crypto/Mac;[BII)[B
    .locals 5
    .param p0, "mac"    # Ljavax/crypto/Mac;
    .param p1, "salt"    # [B
    .param p2, "iterations"    # I
    .param p3, "block"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;,
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .prologue
    .line 78
    invoke-virtual {p0}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v4

    new-array v1, v4, [B

    .line 80
    .local v1, "result":[B
    invoke-static {p3}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->encodedInt(I)[B

    move-result-object v4

    invoke-static {p1, v4}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->concat([B[B)[B

    move-result-object v2

    .line 81
    .local v2, "text":[B
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_0
    if-le v0, p2, :cond_0

    .line 87
    return-object v1

    .line 82
    :cond_0
    invoke-virtual {p0, v2}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v3

    .line 83
    .local v3, "u":[B
    invoke-static {v1, v3}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->xor([B[B)[B

    move-result-object v1

    .line 84
    move-object v2, v3

    .line 81
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static genKey([C[BII)Ljava/security/Key;
    .locals 14
    .param p0, "password"    # [C
    .param p1, "salt"    # [B
    .param p2, "iterations"    # I
    .param p3, "dkLen"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .prologue
    .line 47
    const-string v12, "HMACSHA1"

    invoke-static {v12}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v8

    .line 49
    .local v8, "mac":Ljavax/crypto/Mac;
    invoke-virtual {v8}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v4

    .line 50
    .local v4, "hLen":I
    move/from16 v0, p3

    invoke-static {v0, v4}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->ceil(II)I

    move-result v1

    .line 51
    .local v1, "blocks":I
    add-int/lit8 v12, v1, -0x1

    mul-int/2addr v12, v4

    sub-int v10, p3, v12

    .line 53
    .local v10, "r":I
    move/from16 v0, p3

    new-array v3, v0, [B

    .line 55
    .local v3, "dk":[B
    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B

    move-result-object v9

    .line 56
    .local v9, "pwdBytes":[B
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    const-string v12, "HmacSHA1"

    invoke-direct {v7, v9, v12}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 57
    .local v7, "keySpec":Ljavax/crypto/spec/SecretKeySpec;
    invoke-virtual {v8, v7}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 59
    const/4 v5, 0x1

    .local v5, "i":I
    :goto_0
    if-le v5, v1, :cond_0

    .line 67
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    const-string v12, "AES"

    invoke-direct {v6, v3, v12}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 68
    .local v6, "key":Ljava/security/Key;
    return-object v6

    .line 60
    .end local v6    # "key":Ljava/security/Key;
    :cond_0
    move/from16 v0, p2

    invoke-static {v8, p1, v0, v5}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->f(Ljavax/crypto/Mac;[BII)[B

    move-result-object v11

    .line 61
    .local v11, "t":[B
    move v2, v4

    .line 62
    .local v2, "copyLen":I
    if-ne v5, v1, :cond_1

    .line 63
    move v2, v10

    .line 64
    :cond_1
    const/4 v12, 0x0

    add-int/lit8 v13, v5, -0x1

    mul-int/2addr v13, v4

    invoke-static {v11, v12, v3, v13, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    add-int/lit8 v5, v5, 0x1

    goto :goto_0
.end method

.method private static xor([B[B)[B
    .locals 3
    .param p0, "result"    # [B
    .param p1, "ba2"    # [B

    .prologue
    .line 97
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v1, p0

    if-lt v0, v1, :cond_0

    .line 100
    return-object p0

    .line 98
    :cond_0
    aget-byte v1, p0, v0

    aget-byte v2, p1, v0

    xor-int/2addr v1, v2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    .line 97
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
