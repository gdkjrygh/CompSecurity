.class public Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;
.super Ljava/util/AbstractList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;
    }
.end annotation


# instance fields
.field auxiliaryDataFormats:Ljava/util/List;

.field ceks:Lcom/googlecode/mp4parser/util/RangeStartMap;

.field cipher:Ljavax/crypto/Cipher;

.field private final encryptionAlgo:Ljava/lang/String;

.field parent:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/util/RangeStartMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 30
    new-instance v0, Lcom/googlecode/mp4parser/util/RangeStartMap;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/util/RangeStartMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->ceks:Lcom/googlecode/mp4parser/util/RangeStartMap;

    .line 45
    iput-object p3, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->auxiliaryDataFormats:Ljava/util/List;

    .line 46
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->ceks:Lcom/googlecode/mp4parser/util/RangeStartMap;

    .line 47
    iput-object p4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->parent:Ljava/util/List;

    .line 50
    :try_start_0
    const-string v0, "cenc"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    const-string v0, "AES/CTR/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->cipher:Ljavax/crypto/Cipher;

    .line 54
    :goto_0
    return-void

    .line 52
    :cond_0
    const-string v0, "cbc1"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "AES/CBC/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->cipher:Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 55
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Only cenc & cbc1 is supported as encryptionAlgo"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Ljavax/crypto/SecretKey;Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .prologue
    .line 37
    new-instance v0, Lcom/googlecode/mp4parser/util/RangeStartMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/googlecode/mp4parser/util/RangeStartMap;-><init>(Ljava/lang/Comparable;Ljava/lang/Object;)V

    const-string v1, "cenc"

    invoke-direct {p0, v0, p2, p3, v1}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;-><init>(Lcom/googlecode/mp4parser/util/RangeStartMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 38
    return-void
.end method

.method static synthetic access$1(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public get(I)Lcom/googlecode/mp4parser/authoring/Sample;
    .locals 7

    .prologue
    .line 66
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->parent:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/Sample;

    .line 67
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->ceks:Lcom/googlecode/mp4parser/util/RangeStartMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/RangeStartMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->auxiliaryDataFormats:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    .line 69
    new-instance v0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;

    iget-object v4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->cipher:Ljavax/crypto/Cipher;

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->ceks:Lcom/googlecode/mp4parser/util/RangeStartMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/googlecode/mp4parser/util/RangeStartMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljavax/crypto/SecretKey;

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;-><init>(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;Lcom/googlecode/mp4parser/authoring/Sample;Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;Ljavax/crypto/Cipher;Ljavax/crypto/SecretKey;Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;)V

    .line 71
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v2

    goto :goto_0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->get(I)Lcom/googlecode/mp4parser/authoring/Sample;

    move-result-object v0

    return-object v0
.end method

.method protected initCipher([BLjavax/crypto/SecretKey;)V
    .locals 4

    .prologue
    .line 78
    const/16 v0, 0x10

    :try_start_0
    new-array v0, v0, [B

    .line 79
    const/4 v1, 0x0

    const/4 v2, 0x0

    array-length v3, p1

    invoke-static {p1, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->cipher:Ljavax/crypto/Cipher;

    const/4 v2, 0x1

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v3, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v1, v2, p2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    return-void

    :catch_0
    move-exception v0

    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 84
    :catch_1
    move-exception v0

    .line 85
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public size()I
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->parent:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
