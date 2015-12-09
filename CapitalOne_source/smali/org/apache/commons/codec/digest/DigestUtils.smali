.class public Lorg/apache/commons/codec/digest/DigestUtils;
.super Ljava/lang/Object;
.source "DigestUtils.java"


# static fields
.field private static final STREAM_BUFFER_LENGTH:I = 0x400


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B
    .locals 5
    .param p0, "digest"    # Ljava/security/MessageDigest;
    .param p1, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v4, 0x400

    const/4 v3, 0x0

    .line 49
    new-array v0, v4, [B

    .line 50
    .local v0, "buffer":[B
    invoke-virtual {p1, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    .line 52
    .local v1, "read":I
    :goto_0
    const/4 v2, -0x1

    if-le v1, v2, :cond_0

    .line 53
    invoke-virtual {p0, v0, v3, v1}, Ljava/security/MessageDigest;->update([BII)V

    .line 54
    invoke-virtual {p1, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    return-object v2
.end method

.method private static getBytesUtf8(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 68
    invoke-static {p0}, Lorg/apache/commons/codec/binary/StringUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;
    .locals 2
    .param p0, "algorithm"    # Ljava/lang/String;

    .prologue
    .line 86
    :try_start_0
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 87
    :catch_0
    move-exception v0

    .line 88
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static getMd2Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 103
    const-string v0, "MD2"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getMd5Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 116
    const-string v0, "MD5"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getSha1Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 130
    const-string v0, "SHA-1"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getSha256Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 146
    const-string v0, "SHA-256"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getSha384Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 162
    const-string v0, "SHA-384"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getSha512Digest()Ljava/security/MessageDigest;
    .locals 1

    .prologue
    .line 178
    const-string v0, "SHA-512"

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static getShaDigest()Ljava/security/MessageDigest;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 191
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha1Digest()Ljava/security/MessageDigest;

    move-result-object v0

    return-object v0
.end method

.method public static md2(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 217
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getMd2Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static md2(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 229
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->md2([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static md2([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 203
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getMd2Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static md2Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 255
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md2(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md2Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 267
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md2(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md2Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 241
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md2([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md5(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 292
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getMd5Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static md5(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 303
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->md5([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static md5([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 278
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getMd5Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static md5Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 328
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md5(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md5Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 339
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md5(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static md5Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 314
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->md5([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 368
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1(Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 381
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha([B)[B
    .locals 1
    .param p0, "data"    # [B
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 352
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha1(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 407
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha1Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha1(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 418
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha1([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 393
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha1Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha1Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 444
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha1Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 456
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha1Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 430
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha256(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 488
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha256Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha256(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 503
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha256([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha256([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 471
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha256Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha256Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 535
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha256(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha256Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 550
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha256(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha256Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 518
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha256([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha384(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 582
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha384Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha384(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 597
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha384([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha384([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 565
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha384Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha384Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 629
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha384(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha384Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 644
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha384(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha384Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 612
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha384([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha512(Ljava/io/InputStream;)[B
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 676
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha512Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/codec/digest/DigestUtils;->digest(Ljava/security/MessageDigest;Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha512(Ljava/lang/String;)[B
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 691
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha512([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha512([B)[B
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 659
    invoke-static {}, Lorg/apache/commons/codec/digest/DigestUtils;->getSha512Digest()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static sha512Hex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 723
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha512(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha512Hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;

    .prologue
    .line 738
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha512(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static sha512Hex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B

    .prologue
    .line 706
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha512([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/codec/binary/Hex;->encodeHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static shaHex(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 767
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1Hex(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static shaHex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 780
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1Hex(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static shaHex([B)Ljava/lang/String;
    .locals 1
    .param p0, "data"    # [B
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 751
    invoke-static {p0}, Lorg/apache/commons/codec/digest/DigestUtils;->sha1Hex([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static updateDigest(Ljava/security/MessageDigest;Ljava/lang/String;)Ljava/security/MessageDigest;
    .locals 1
    .param p0, "messageDigest"    # Ljava/security/MessageDigest;
    .param p1, "valueToDigest"    # Ljava/lang/String;

    .prologue
    .line 809
    invoke-static {p1}, Lorg/apache/commons/codec/digest/DigestUtils;->getBytesUtf8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 810
    return-object p0
.end method

.method public static updateDigest(Ljava/security/MessageDigest;[B)Ljava/security/MessageDigest;
    .locals 0
    .param p0, "messageDigest"    # Ljava/security/MessageDigest;
    .param p1, "valueToDigest"    # [B

    .prologue
    .line 794
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 795
    return-object p0
.end method
