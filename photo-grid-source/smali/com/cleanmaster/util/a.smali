.class public Lcom/cleanmaster/util/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[B


# instance fields
.field protected a:Ljavax/crypto/spec/IvParameterSpec;

.field protected b:Ljavax/crypto/spec/SecretKeySpec;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/cleanmaster/util/a;->d:[B

    return-void

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 5

    .prologue
    const/16 v4, 0x10

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x1

    iput v0, p0, Lcom/cleanmaster/util/a;->c:I

    .line 78
    new-array v0, v4, [B

    .line 79
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 80
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    iput-object v1, p0, Lcom/cleanmaster/util/a;->a:Ljavax/crypto/spec/IvParameterSpec;

    .line 81
    new-array v2, v4, [B

    .line 82
    const/4 v0, 0x0

    .line 84
    :try_start_0
    const-string v1, "liebao%^&()@Io=-"

    const-string v3, "utf-8"

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 88
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v4, :cond_0

    array-length v3, v0

    if-ge v1, v3, :cond_0

    if-eqz v0, :cond_0

    .line 89
    aget-byte v3, v0, v1

    aput-byte v3, v2, v1

    .line 88
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 86
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 91
    :cond_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, v2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lcom/cleanmaster/util/a;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 92
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "InlinedApi"
        }
    .end annotation

    .prologue
    .line 101
    if-eqz p1, :cond_0

    .line 102
    :try_start_0
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "0000"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/cleanmaster/util/a;->c:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 103
    iget-object v1, p0, Lcom/cleanmaster/util/a;->a:Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {v1}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v1

    array-length v1, v1

    .line 104
    const-string v2, "utf-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    array-length v2, v2

    .line 105
    const-string v3, "utf-8"

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/cleanmaster/util/a;->a([B)[B

    move-result-object v3

    .line 106
    array-length v4, v3

    .line 107
    add-int v5, v1, v2

    add-int/2addr v5, v4

    new-array v5, v5, [B

    .line 108
    iget-object v6, p0, Lcom/cleanmaster/util/a;->a:Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {v6}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v6, v7, v5, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 109
    const-string v6, "utf-8"

    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v0, v6, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    const/4 v0, 0x0

    add-int/2addr v1, v2

    invoke-static {v3, v0, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    const/4 v0, 0x2

    invoke-static {v5, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 116
    :goto_0
    return-object v0

    .line 114
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 116
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a([B)[B
    .locals 4

    .prologue
    .line 37
    :try_start_0
    const-string v0, "AES/CBC/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 38
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/cleanmaster/util/a;->b:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, p0, Lcom/cleanmaster/util/a;->a:Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 39
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 43
    :goto_0
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 43
    const/4 v0, 0x0

    goto :goto_0
.end method
