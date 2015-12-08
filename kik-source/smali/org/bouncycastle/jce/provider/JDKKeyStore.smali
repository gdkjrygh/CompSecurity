.class public Lorg/bouncycastle/jce/provider/JDKKeyStore;
.super Ljava/security/KeyStoreSpi;

# interfaces
.implements Lorg/bouncycastle/jce/interfaces/BCKeyStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKKeyStore$BouncyCastleStore;,
        Lorg/bouncycastle/jce/provider/JDKKeyStore$a;
    }
.end annotation


# instance fields
.field protected a:Ljava/util/Hashtable;

.field protected b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/security/KeyStoreSpi;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    return-void
.end method

.method static synthetic a(Ljava/io/DataInputStream;)Ljava/security/Key;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->c(Ljava/io/DataInputStream;)Ljava/security/Key;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;
    .locals 4

    :try_start_0
    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {p0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-direct {v2, p3, p4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    sget-object v3, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {p0, v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {v3, p1, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error initialising store of key store: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static synthetic a(Ljava/security/Key;Ljava/io/DataOutputStream;)V
    .locals 0

    invoke-static {p0, p1}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    return-void
.end method

.method private static a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;
    .locals 3

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    :try_start_0
    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/NoSuchProviderException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static b(Ljava/security/Key;Ljava/io/DataOutputStream;)V
    .locals 2

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    instance-of v1, p0, Ljava/security/PrivateKey;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    :goto_0
    invoke-interface {p0}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    return-void

    :cond_0
    instance-of v1, p0, Ljava/security/PublicKey;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    goto :goto_0
.end method

.method private static c(Ljava/io/DataInputStream;)Ljava/security/Key;
    .locals 5

    invoke-virtual {p0}, Ljava/io/DataInputStream;->read()I

    move-result v1

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    invoke-virtual {p0, v3}, Ljava/io/DataInputStream;->readFully([B)V

    const-string v4, "PKCS#8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "PKCS8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    new-instance v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v0, v3}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    :goto_0
    packed-switch v1, :pswitch_data_0

    :try_start_0
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Key type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not recognised!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception creating key: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v4, "X.509"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "X509"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, v3}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    goto :goto_0

    :cond_3
    const-string v1, "RAW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, v3, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :goto_1
    return-object v0

    :cond_4
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Key format "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " not recognised!"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    :try_start_1
    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method protected final a(Ljava/io/InputStream;)V
    .locals 9

    new-instance v7, Ljava/io/DataInputStream;

    invoke-direct {v7, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v7}, Ljava/io/DataInputStream;->read()I

    move-result v4

    :goto_0
    if-lez v4, :cond_1

    invoke-virtual {v7}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v7}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    new-array v6, v1, [Ljava/security/cert/Certificate;

    const/4 v0, 0x0

    :goto_1
    if-eq v0, v1, :cond_0

    invoke-static {v7}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;

    move-result-object v5

    aput-object v5, v6, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown object type in store."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {v7}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v4, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v4, p0, v2, v3, v0}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-virtual {v7}, Ljava/io/DataInputStream;->read()I

    move-result v4

    goto :goto_0

    :pswitch_1
    invoke-static {v7}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->c(Ljava/io/DataInputStream;)Ljava/security/Key;

    move-result-object v5

    iget-object v8, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    const/4 v4, 0x2

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;[Ljava/security/cert/Certificate;)V

    invoke-virtual {v8, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :pswitch_2
    invoke-virtual {v7}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    new-array v5, v0, [B

    invoke-virtual {v7, v5}, Ljava/io/DataInputStream;->readFully([B)V

    iget-object v8, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;[Ljava/security/cert/Certificate;)V

    invoke-virtual {v8, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method protected final a(Ljava/io/OutputStream;)V
    .locals 8

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    iget v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->write(I)V

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/io/DataOutputStream;->writeLong(J)V

    iget-object v5, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    if-nez v5, :cond_1

    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    :cond_0
    iget v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown object type in store."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    array-length v1, v5

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    move v1, v2

    :goto_1
    array-length v6, v5

    if-eq v1, v6, :cond_0

    aget-object v6, v5, v1

    invoke-static {v6, v4}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :pswitch_0
    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-static {v0, v4}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/Key;

    invoke-static {v0, v4}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    array-length v1, v0

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_0

    :cond_2
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->write(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public engineAliases()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public engineContainsAlias(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineDeleteEntry(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/KeyStoreException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no such entry as "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_1

    iget v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/cert/Certificate;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateAlias(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    instance-of v1, v1, Ljava/security/cert/Certificate;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/security/cert/Certificate;

    invoke-virtual {v1, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_1
    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v1, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCreationDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetKey(Ljava/lang/String;[C)Ljava/security/Key;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget v1, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0, p2}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a([C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    goto :goto_0
.end method

.method public engineIsCertificateEntry(Ljava/lang/String;)Z
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineIsKeyEntry(Ljava/lang/String;)Z
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    if-eq v0, v1, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineLoad(Ljava/io/InputStream;[C)V
    .locals 7

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    if-eqz v1, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Wrong version of key store."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    new-instance v3, Lorg/bouncycastle/crypto/macs/HMac;

    new-instance v4, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v4}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v3, v4}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    if-eqz p2, :cond_3

    array-length v4, p2

    if-eqz v4, :cond_3

    invoke-static {p2}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS12PasswordToBytes([C)[B

    move-result-object v4

    new-instance v5, Lorg/bouncycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v6, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v5, v6}, Lorg/bouncycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-virtual {v5, v4, v1, v2}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->init([B[BI)V

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v1

    invoke-virtual {v5, v1}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->generateDerivedMacParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-static {v4}, Lorg/bouncycastle/util/Arrays;->a([B)V

    invoke-virtual {v3, v1}, Lorg/bouncycastle/crypto/macs/HMac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    new-instance v1, Lorg/bouncycastle/crypto/io/MacInputStream;

    invoke-direct {v1, v0, v3}, Lorg/bouncycastle/crypto/io/MacInputStream;-><init>(Ljava/io/InputStream;Lorg/bouncycastle/crypto/Mac;)V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a(Ljava/io/InputStream;)V

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v1

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v2}, Lorg/bouncycastle/crypto/macs/HMac;->doFinal([BI)I

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v0, v2}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-static {v1, v2}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    new-instance v0, Ljava/io/IOException;

    const-string v1, "KeyStore integrity check failed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a(Ljava/io/InputStream;)V

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    goto/16 :goto_0
.end method

.method public engineSetCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    if-eqz v0, :cond_0

    iget v0, v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/security/KeyStoreException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "key store already has a key entry with alias "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v1, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v1, p0, p1, p2}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/cert/Certificate;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 7

    instance-of v0, p2, Ljava/security/PrivateKey;

    if-eqz v0, :cond_0

    if-nez p4, :cond_0

    new-instance v0, Ljava/security/KeyStoreException;

    const-string v1, "no certificate chain for private key"

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iget-object v6, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V

    invoke-virtual {v6, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/KeyStoreException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineSetKeyEntry(Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v1, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lorg/bouncycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKKeyStore;Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public engineSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 8

    const/16 v5, 0x14

    const/4 v1, 0x0

    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-array v0, v5, [B

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v3}, Ljava/security/SecureRandom;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0x3ff

    add-int/lit16 v3, v3, 0x400

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v4, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    new-instance v4, Lorg/bouncycastle/crypto/macs/HMac;

    new-instance v5, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v5}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v4, v5}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    new-instance v5, Lorg/bouncycastle/crypto/io/MacOutputStream;

    invoke-direct {v5, v2, v4}, Lorg/bouncycastle/crypto/io/MacOutputStream;-><init>(Ljava/io/OutputStream;Lorg/bouncycastle/crypto/Mac;)V

    new-instance v6, Lorg/bouncycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v7, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v7}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v6, v7}, Lorg/bouncycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-static {p2}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS12PasswordToBytes([C)[B

    move-result-object v7

    invoke-virtual {v6, v7, v0, v3}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->init([B[BI)V

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->generateDerivedMacParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/bouncycastle/crypto/macs/HMac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    move v0, v1

    :goto_0
    array-length v3, v7

    if-eq v0, v3, :cond_0

    aput-byte v1, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v5}, Lorg/bouncycastle/jce/provider/JDKKeyStore;->a(Ljava/io/OutputStream;)V

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/macs/HMac;->getMacSize()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {v4, v0, v1}, Lorg/bouncycastle/crypto/macs/HMac;->doFinal([BI)I

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    return-void
.end method
