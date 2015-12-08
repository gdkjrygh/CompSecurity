.class public Lorg/spongycastle/jce/provider/JDKKeyStore;
.super Ljava/security/KeyStoreSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/interfaces/BCKeyStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JDKKeyStore$BouncyCastleStore;,
        Lorg/spongycastle/jce/provider/JDKKeyStore$a;
    }
.end annotation


# instance fields
.field protected a:Ljava/util/Hashtable;

.field protected b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/security/KeyStoreSpi;-><init>()V

    .line 84
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    .line 86
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    .line 90
    return-void
.end method

.method static synthetic a(Ljava/io/DataInputStream;)Ljava/security/Key;
    .locals 1

    .prologue
    .line 54
    invoke-static {p0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->c(Ljava/io/DataInputStream;)Ljava/security/Key;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;
    .locals 4

    .prologue
    .line 460
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    .line 461
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {p0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    .line 462
    new-instance v2, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-direct {v2, p3, p4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 464
    sget-object v3, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {p0, v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 466
    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {v3, p1, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
    return-object v3

    .line 470
    :catch_0
    move-exception v0

    .line 472
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

    .prologue
    .line 54
    invoke-static {p0, p1}, Lorg/spongycastle/jce/provider/JDKKeyStore;->b(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    return-void
.end method

.method private static a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V
    .locals 2

    .prologue
    .line 337
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    .line 339
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 340
    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 341
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    return-void

    .line 343
    :catch_0
    move-exception v0

    .line 345
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;
    .locals 3

    .prologue
    .line 353
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    .line 354
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    new-array v1, v1, [B

    .line 356
    invoke-virtual {p0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 360
    :try_start_0
    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    .line 361
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 363
    invoke-virtual {v0, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 365
    :catch_0
    move-exception v0

    .line 367
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/NoSuchProviderException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 369
    :catch_1
    move-exception v0

    .line 371
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/security/cert/CertificateException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static b(Ljava/security/Key;Ljava/io/DataOutputStream;)V
    .locals 2

    .prologue
    .line 380
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    .line 382
    instance-of v1, p0, Ljava/security/PrivateKey;

    if-eqz v1, :cond_0

    .line 384
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 395
    :goto_0
    invoke-interface {p0}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 396
    invoke-interface {p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 397
    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 398
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 399
    return-void

    .line 386
    :cond_0
    instance-of v1, p0, Ljava/security/PublicKey;

    if-eqz v1, :cond_1

    .line 388
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    goto :goto_0

    .line 392
    :cond_1
    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write(I)V

    goto :goto_0
.end method

.method private static c(Ljava/io/DataInputStream;)Ljava/security/Key;
    .locals 5

    .prologue
    .line 405
    invoke-virtual {p0}, Ljava/io/DataInputStream;->read()I

    move-result v1

    .line 406
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    .line 407
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    .line 408
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    .line 411
    invoke-virtual {p0, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 413
    const-string v4, "PKCS#8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "PKCS8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 415
    :cond_0
    new-instance v0, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v0, v3}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 432
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 441
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

    .line 444
    :catch_0
    move-exception v0

    .line 446
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

    .line 417
    :cond_1
    const-string v4, "X.509"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "X509"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 419
    :cond_2
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, v3}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    goto :goto_0

    .line 421
    :cond_3
    const-string v1, "RAW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 423
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, v3, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 439
    :goto_1
    return-object v0

    .line 427
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

    .line 435
    :pswitch_0
    :try_start_1
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_1

    .line 437
    :pswitch_1
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_1

    .line 439
    :pswitch_2
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v2, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1

    .line 432
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

    .prologue
    .line 684
    new-instance v7, Ljava/io/DataInputStream;

    invoke-direct {v7, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 685
    invoke-virtual {v7}, Ljava/io/DataInputStream;->read()I

    move-result v4

    .line 687
    :goto_0
    if-lez v4, :cond_1

    .line 689
    invoke-virtual {v7}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    .line 690
    new-instance v3, Ljava/util/Date;

    invoke-virtual {v7}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 691
    invoke-virtual {v7}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 692
    const/4 v6, 0x0

    .line 694
    if-eqz v1, :cond_0

    .line 696
    new-array v6, v1, [Ljava/security/cert/Certificate;

    .line 698
    const/4 v0, 0x0

    :goto_1
    if-eq v0, v1, :cond_0

    .line 700
    invoke-static {v7}, Lorg/spongycastle/jce/provider/JDKKeyStore;->b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;

    move-result-object v5

    aput-object v5, v6, v0

    .line 698
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 704
    :cond_0
    packed-switch v4, :pswitch_data_0

    .line 723
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown object type in store."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 707
    :pswitch_0
    invoke-static {v7}, Lorg/spongycastle/jce/provider/JDKKeyStore;->b(Ljava/io/DataInputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    .line 709
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v4, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v4, p0, v2, v3, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    :goto_2
    invoke-virtual {v7}, Ljava/io/DataInputStream;->read()I

    move-result v4

    goto :goto_0

    .line 712
    :pswitch_1
    invoke-static {v7}, Lorg/spongycastle/jce/provider/JDKKeyStore;->c(Ljava/io/DataInputStream;)Ljava/security/Key;

    move-result-object v5

    .line 713
    iget-object v8, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    const/4 v4, 0x2

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;[Ljava/security/cert/Certificate;)V

    invoke-virtual {v8, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 717
    :pswitch_2
    invoke-virtual {v7}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    new-array v5, v0, [B

    .line 719
    invoke-virtual {v7, v5}, Ljava/io/DataInputStream;->readFully([B)V

    .line 720
    iget-object v8, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;[Ljava/security/cert/Certificate;)V

    invoke-virtual {v8, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 728
    :cond_1
    return-void

    .line 704
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

    .prologue
    const/4 v2, 0x0

    .line 734
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v3

    .line 735
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 737
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 739
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 741
    iget v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 742
    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 743
    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 745
    iget-object v5, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 746
    if-nez v5, :cond_1

    .line 748
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 759
    :cond_0
    iget v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    packed-switch v1, :pswitch_data_0

    .line 775
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown object type in store."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 752
    :cond_1
    array-length v1, v5

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    move v1, v2

    .line 753
    :goto_1
    array-length v6, v5

    if-eq v1, v6, :cond_0

    .line 755
    aget-object v6, v5, v1

    invoke-static {v6, v4}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V

    .line 753
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 762
    :pswitch_0
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-static {v0, v4}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/security/cert/Certificate;Ljava/io/DataOutputStream;)V

    goto :goto_0

    .line 765
    :pswitch_1
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/Key;

    invoke-static {v0, v4}, Lorg/spongycastle/jce/provider/JDKKeyStore;->b(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    goto :goto_0

    .line 769
    :pswitch_2
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    .line 771
    array-length v1, v0

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 772
    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_0

    .line 777
    :cond_2
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->write(I)V

    .line 780
    return-void

    .line 759
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

    .prologue
    .line 484
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public engineContainsAlias(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 490
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

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

    .prologue
    .line 497
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 499
    if-nez v0, :cond_0

    .line 501
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

    .line 504
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    return-void
.end method

.method public engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 3

    .prologue
    .line 510
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 512
    if-eqz v0, :cond_1

    .line 514
    iget v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 516
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/security/cert/Certificate;

    .line 529
    :goto_0
    return-object v0

    .line 520
    :cond_0
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 522
    if-eqz v0, :cond_1

    .line 524
    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    .line 529
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateAlias(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 535
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v2

    .line 536
    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 538
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 540
    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    instance-of v1, v1, Ljava/security/cert/Certificate;

    if-eqz v1, :cond_1

    .line 542
    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/security/cert/Certificate;

    .line 544
    invoke-virtual {v1, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 546
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 560
    :goto_0
    return-object v0

    .line 551
    :cond_1
    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 553
    if-eqz v1, :cond_0

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v1, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 555
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    goto :goto_0

    .line 560
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    .locals 1

    .prologue
    .line 566
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 568
    if-eqz v0, :cond_0

    .line 570
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 573
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetCreationDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    .prologue
    .line 578
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 580
    if-eqz v0, :cond_0

    .line 582
    iget-object v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 585
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineGetKey(Ljava/lang/String;[C)Ljava/security/Key;
    .locals 3

    .prologue
    .line 593
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 595
    if-eqz v0, :cond_0

    iget v1, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 597
    :cond_0
    const/4 v0, 0x0

    .line 600
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0, p2}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a([C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    goto :goto_0
.end method

.method public engineIsCertificateEntry(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 606
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 608
    if-eqz v0, :cond_0

    iget v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    if-ne v0, v1, :cond_0

    move v0, v1

    .line 613
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineIsKeyEntry(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 619
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 621
    if-eqz v0, :cond_0

    iget v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    if-eq v0, v1, :cond_0

    move v0, v1

    .line 626
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineLoad(Ljava/io/InputStream;[C)V
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x0

    .line 787
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 789
    if-nez p1, :cond_1

    .line 870
    :cond_0
    :goto_0
    return-void

    .line 794
    :cond_1
    new-instance v1, Ljava/io/DataInputStream;

    invoke-direct {v1, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 795
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 797
    if-eq v0, v9, :cond_2

    .line 799
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    .line 801
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Wrong version of key store."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 805
    :cond_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 806
    if-gtz v2, :cond_3

    .line 808
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid salt detected"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 811
    :cond_3
    new-array v2, v2, [B

    .line 813
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 815
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 820
    new-instance v4, Lorg/spongycastle/crypto/macs/HMac;

    new-instance v5, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v5}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v4, v5}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 821
    if-eqz p2, :cond_5

    array-length v5, p2

    if-eqz v5, :cond_5

    .line 823
    invoke-static {p2}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b([C)[B

    move-result-object v5

    .line 825
    new-instance v6, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v7, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v7}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v6, v7}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 826
    invoke-virtual {v6, v5, v2, v3}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 830
    if-eq v0, v9, :cond_4

    .line 832
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    .line 839
    :goto_1
    invoke-static {v5, v8}, Lorg/spongycastle/util/Arrays;->a([BB)V

    .line 841
    invoke-virtual {v4, v0}, Lorg/spongycastle/crypto/macs/HMac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 842
    new-instance v0, Lorg/spongycastle/crypto/io/MacInputStream;

    invoke-direct {v0, v1, v4}, Lorg/spongycastle/crypto/io/MacInputStream;-><init>(Ljava/io/InputStream;Lorg/spongycastle/crypto/Mac;)V

    .line 844
    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/InputStream;)V

    .line 847
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 848
    invoke-virtual {v4, v0, v8}, Lorg/spongycastle/crypto/macs/HMac;->a([BI)I

    .line 852
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v2

    new-array v2, v2, [B

    .line 853
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 855
    invoke-static {v0, v2}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    .line 857
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 858
    new-instance v0, Ljava/io/IOException;

    const-string v1, "KeyStore integrity check failed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 836
    :cond_4
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-virtual {v6, v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_1

    .line 863
    :cond_5
    invoke-virtual {p0, v1}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/InputStream;)V

    .line 867
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 868
    invoke-virtual {v1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    goto/16 :goto_0
.end method

.method public engineSetCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    .locals 3

    .prologue
    .line 634
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    .line 636
    if-eqz v0, :cond_0

    iget v0, v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 638
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

    .line 641
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v1, p0, p1, p2}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/cert/Certificate;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 7

    .prologue
    .line 660
    instance-of v0, p2, Ljava/security/PrivateKey;

    if-eqz v0, :cond_0

    if-nez p4, :cond_0

    .line 662
    new-instance v0, Ljava/security/KeyStoreException;

    const-string v1, "no certificate chain for private key"

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 667
    :cond_0
    :try_start_0
    iget-object v6, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V

    invoke-virtual {v6, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 672
    return-void

    .line 669
    :catch_0
    move-exception v0

    .line 671
    new-instance v1, Ljava/security/KeyStoreException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public engineSetKeyEntry(Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 2

    .prologue
    .line 650
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/jce/provider/JDKKeyStore$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lorg/spongycastle/jce/provider/JDKKeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    return-void
.end method

.method public engineSize()I
    .locals 1

    .prologue
    .line 677
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 8

    .prologue
    const/16 v5, 0x14

    const/4 v1, 0x0

    .line 876
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 877
    new-array v0, v5, [B

    .line 878
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v3}, Ljava/security/SecureRandom;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0x3ff

    add-int/lit16 v3, v3, 0x400

    .line 880
    iget-object v4, p0, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v4, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 882
    const/4 v4, 0x2

    invoke-virtual {v2, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 883
    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 884
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 885
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 887
    new-instance v4, Lorg/spongycastle/crypto/macs/HMac;

    new-instance v5, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v5}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v4, v5}, Lorg/spongycastle/crypto/macs/HMac;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 888
    new-instance v5, Lorg/spongycastle/crypto/io/MacOutputStream;

    invoke-direct {v5, v4}, Lorg/spongycastle/crypto/io/MacOutputStream;-><init>(Lorg/spongycastle/crypto/Mac;)V

    .line 889
    new-instance v6, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;

    new-instance v7, Lorg/spongycastle/crypto/digests/SHA1Digest;

    invoke-direct {v7}, Lorg/spongycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v6, v7}, Lorg/spongycastle/crypto/generators/PKCS12ParametersGenerator;-><init>(Lorg/spongycastle/crypto/Digest;)V

    .line 890
    invoke-static {p2}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b([C)[B

    move-result-object v7

    .line 892
    invoke-virtual {v6, v7, v0, v3}, Lorg/spongycastle/crypto/PBEParametersGenerator;->a([B[BI)V

    .line 894
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-virtual {v6, v0}, Lorg/spongycastle/crypto/PBEParametersGenerator;->b(I)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/spongycastle/crypto/macs/HMac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    move v0, v1

    .line 896
    :goto_0
    array-length v3, v7

    if-eq v0, v3, :cond_0

    .line 898
    aput-byte v1, v7, v0

    .line 896
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 901
    :cond_0
    new-instance v0, Lorg/spongycastle/util/io/TeeOutputStream;

    invoke-direct {v0, v2, v5}, Lorg/spongycastle/util/io/TeeOutputStream;-><init>(Ljava/io/OutputStream;Ljava/io/OutputStream;)V

    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/OutputStream;)V

    .line 903
    invoke-virtual {v4}, Lorg/spongycastle/crypto/macs/HMac;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 905
    invoke-virtual {v4, v0, v1}, Lorg/spongycastle/crypto/macs/HMac;->a([BI)I

    .line 907
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 909
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    .line 910
    return-void
.end method
