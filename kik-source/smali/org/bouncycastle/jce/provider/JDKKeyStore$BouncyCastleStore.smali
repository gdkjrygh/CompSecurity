.class public Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;
.super Lorg/bouncycastle/jce/provider/JDKKeyStore;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BouncyCastleStore"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKKeyStore;-><init>()V

    return-void
.end method


# virtual methods
.method public engineLoad(Ljava/io/InputStream;[C)V
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v1, Ljava/io/DataInputStream;

    invoke-direct {v1, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Wrong version of key store."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    new-array v2, v2, [B

    array-length v3, v2

    const/16 v4, 0x14

    if-eq v3, v4, :cond_3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Key store corrupted."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    if-ltz v3, :cond_4

    const/16 v4, 0x1000

    if-le v3, v4, :cond_5

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Key store corrupted."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    if-nez v0, :cond_6

    const-string v0, "OldPBEWithSHAAndTwofish-CBC"

    :goto_0
    const/4 v4, 0x2

    invoke-static {v0, v4, p2, v2, v3}, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v0

    new-instance v2, Ljavax/crypto/CipherInputStream;

    invoke-direct {v2, v1, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    new-instance v0, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    new-instance v1, Lorg/bouncycastle/crypto/io/DigestInputStream;

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/io/DigestInputStream;-><init>(Ljava/io/InputStream;Lorg/bouncycastle/crypto/Digest;)V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a(Ljava/io/InputStream;)V

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    invoke-static {v2, v0}, Lorg/bouncycastle/util/io/Streams;->a(Ljava/io/InputStream;[B)I

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    new-instance v0, Ljava/io/IOException;

    const-string v1, "KeyStore integrity check failed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const-string v0, "PBEWithSHAAndTwofish-CBC"

    goto :goto_0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 6

    const/16 v5, 0x14

    const/4 v4, 0x1

    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-array v1, v5, [B

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v2}, Ljava/security/SecureRandom;->nextInt()I

    move-result v2

    and-int/lit16 v2, v2, 0x3ff

    add-int/lit16 v2, v2, 0x400

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v3, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v0, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    const-string v3, "PBEWithSHAAndTwofish-CBC"

    invoke-static {v3, v4, p2, v1, v2}, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v1

    new-instance v2, Ljavax/crypto/CipherOutputStream;

    invoke-direct {v2, v0, v1}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    new-instance v0, Lorg/bouncycastle/crypto/io/DigestOutputStream;

    new-instance v1, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/crypto/io/DigestOutputStream;-><init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/Digest;)V

    invoke-virtual {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;->a(Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/io/DigestOutputStream;->getDigest()Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-virtual {v2, v1}, Ljavax/crypto/CipherOutputStream;->write([B)V

    invoke-virtual {v2}, Ljavax/crypto/CipherOutputStream;->close()V

    return-void
.end method
