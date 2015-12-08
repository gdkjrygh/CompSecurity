.class public Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/Integer;

.field private static final b:[B


# instance fields
.field private c:Lorg/bouncycastle/crypto/tls/ByteQueue;

.field private d:Lorg/bouncycastle/crypto/tls/ByteQueue;

.field private e:Lorg/bouncycastle/crypto/tls/ByteQueue;

.field private f:Lorg/bouncycastle/crypto/tls/ByteQueue;

.field private g:Lorg/bouncycastle/crypto/tls/b;

.field private h:Ljava/security/SecureRandom;

.field private i:Lorg/bouncycastle/crypto/tls/k;

.field private j:Lorg/bouncycastle/crypto/tls/l;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Ljava/util/Hashtable;

.field private o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

.field private p:Lorg/bouncycastle/crypto/tls/c;

.field private q:Lorg/bouncycastle/crypto/tls/TlsClient;

.field private r:[I

.field private s:[S

.field private t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

.field private u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

.field private v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

.field private w:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Integer;

    const v1, 0xff01

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->b:[B

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1

    invoke-static {}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->createSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/security/SecureRandom;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/security/SecureRandom;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    new-instance v0, Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->d:Lorg/bouncycastle/crypto/tls/ByteQueue;

    new-instance v0, Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->e:Lorg/bouncycastle/crypto/tls/ByteQueue;

    new-instance v0, Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->i:Lorg/bouncycastle/crypto/tls/k;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->j:Lorg/bouncycastle/crypto/tls/l;

    iput-boolean v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    iput-boolean v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->l:Z

    iput-boolean v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->m:Z

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->p:Lorg/bouncycastle/crypto/tls/c;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->r:[I

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->s:[S

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

    iput-short v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    new-instance v0, Lorg/bouncycastle/crypto/tls/b;

    invoke-direct {v0, p0, p1, p2}, Lorg/bouncycastle/crypto/tls/b;-><init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;Ljava/io/InputStream;Ljava/io/OutputStream;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->h:Ljava/security/SecureRandom;

    return-void
.end method

.method private static arrayContains([II)Z
    .locals 3

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    aget v2, p0, v0

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static arrayContains([SS)Z
    .locals 3

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    aget-short v2, p0, v0

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private static createRenegotiationInfo([B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {p0, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque8([BLjava/io/OutputStream;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private static createSecureRandom()Ljava/security/SecureRandom;
    .locals 4

    new-instance v0, Lorg/bouncycastle/crypto/prng/ThreadedSeedGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/prng/ThreadedSeedGenerator;-><init>()V

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v2, 0x14

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lorg/bouncycastle/crypto/prng/ThreadedSeedGenerator;->generateSeed(IZ)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->setSeed([B)V

    return-object v1
.end method

.method private failWithError(SS)V
    .locals 3

    const/4 v2, 0x2

    const/4 v1, 0x1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-ne p1, v2, :cond_0

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->l:Z

    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->sendAlert(SS)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/b;->close()V

    if-ne p1, v2, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal TLS error, this could be an attack"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal TLS error, this could be an attack"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method private processAlert()V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x2

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->e:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v0

    if-lt v0, v2, :cond_2

    new-array v0, v2, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->e:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v1, v0, v3, v2, v3}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->e:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/tls/ByteQueue;->removeData(I)V

    aget-byte v1, v0, v3

    int-to-short v1, v1

    aget-byte v0, v0, v4

    int-to-short v0, v0

    if-ne v1, v2, :cond_1

    iput-boolean v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->l:Z

    iput-boolean v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/b;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal TLS error, this could be an attack"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-nez v0, :cond_0

    invoke-direct {p0, v4, v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    goto :goto_0

    :cond_2
    return-void

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private processApplicationData()V
    .locals 0

    return-void
.end method

.method private processChangeCipherSpec()V
    .locals 6

    const/16 v5, 0xa

    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->d:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v0

    if-lez v0, :cond_2

    new-array v0, v2, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->d:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v1, v0, v3, v2, v3}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->d:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/tls/ByteQueue;->removeData(I)V

    aget-byte v0, v0, v3

    if-eq v0, v2, :cond_0

    invoke-direct {p0, v4, v5}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    if-eq v0, v5, :cond_1

    const/16 v0, 0x28

    invoke-direct {p0, v4, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/b;->serverClientSpecReceived()V

    const/16 v0, 0xb

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto :goto_0

    :cond_2
    return-void
.end method

.method private processHandshake()V
    .locals 8

    const/4 v7, 0x4

    const/4 v1, 0x0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v0

    if-lt v0, v7, :cond_1

    new-array v0, v7, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v2, v0, v1, v7, v1}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v3

    invoke-static {v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint24(Ljava/io/InputStream;)I

    move-result v2

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v4

    add-int/lit8 v5, v2, 0x4

    if-lt v4, v5, :cond_1

    new-array v4, v2, [B

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v5, v4, v1, v2, v7}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    add-int/lit8 v6, v2, 0x4

    invoke-virtual {v5, v6}, Lorg/bouncycastle/crypto/tls/ByteQueue;->removeData(I)V

    sparse-switch v3, :sswitch_data_0

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v5, v0, v1, v7}, Lorg/bouncycastle/crypto/tls/b;->updateHandshakeData([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0, v4, v1, v2}, Lorg/bouncycastle/crypto/tls/b;->updateHandshakeData([BII)V

    :sswitch_0
    invoke-direct {p0, v3, v4}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processHandshakeMessage(S[B)V

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_0

    return-void

    :cond_1
    move v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method private processHandshakeMessage(S[B)V
    .locals 9

    const/4 v2, 0x0

    const/16 v8, 0xc

    const/4 v4, 0x1

    const/16 v7, 0xa

    const/4 v6, 0x2

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_0

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :goto_1
    const/4 v0, 0x3

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto :goto_0

    :pswitch_0
    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/Certificate;->parse(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/tls/Certificate;

    move-result-object v0

    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->processServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsClient;->getAuthentication()Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsAuthentication;->notifyServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V

    goto :goto_1

    :sswitch_1
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_1

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    goto :goto_0

    :pswitch_1
    new-array v0, v8, [B

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readFully([BLjava/io/InputStream;)V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v1, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    const-string v2, "server finished"

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/tls/b;->getCurrentHash()[B

    move-result-object v3

    invoke-static {v1, v2, v3, v8}, Lorg/bouncycastle/crypto/tls/TlsUtils;->PRF([BLjava/lang/String;[BI)[B

    move-result-object v1

    invoke-static {v1, v0}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x28

    invoke-direct {p0, v6, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_1
    iput-short v8, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    iput-boolean v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->m:Z

    goto :goto_0

    :sswitch_2
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_2

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    goto :goto_0

    :pswitch_2
    invoke-static {v1, p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->checkVersion(Ljava/io/InputStream;Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    const/16 v2, 0x20

    new-array v2, v2, [B

    iput-object v2, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v0, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readFully([BLjava/io/InputStream;)V

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque8(Ljava/io/InputStream;)[B

    move-result-object v0

    array-length v2, v0

    const/16 v3, 0x20

    if-le v2, v3, :cond_2

    const/16 v2, 0x2f

    invoke-direct {p0, v6, v2}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v2, v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->notifySessionID([B)V

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16(Ljava/io/InputStream;)I

    move-result v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->r:[I

    invoke-static {v2, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->arrayContains([II)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0xff

    if-ne v0, v2, :cond_4

    :cond_3
    const/16 v2, 0x2f

    invoke-direct {p0, v6, v2}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_4
    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v2, v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->notifySelectedCipherSuite(I)V

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->s:[S

    invoke-static {v2, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->arrayContains([SS)Z

    move-result v2

    if-nez v2, :cond_5

    const/16 v2, 0x2f

    invoke-direct {p0, v6, v2}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_5
    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v2, v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->notifySelectedCompressionMethod(S)V

    new-instance v2, Ljava/util/Hashtable;

    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-lez v0, :cond_8

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v0

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :goto_2
    invoke-virtual {v3}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-lez v0, :cond_8

    new-instance v0, Ljava/lang/Integer;

    invoke-static {v3}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16(Ljava/io/InputStream;)I

    move-result v4

    invoke-direct {v0, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v3}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    invoke-virtual {v5, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6

    const/16 v5, 0x6e

    invoke-direct {p0, v6, v5}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_6
    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x2f

    invoke-direct {p0, v6, v5}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_7
    invoke-virtual {v2, v0, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_8
    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    sget-object v0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    sget-object v3, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->b:[B

    invoke-static {v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->createRenegotiationInfo([B)[B

    move-result-object v3

    invoke-static {v0, v3}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_9

    const/16 v0, 0x28

    invoke-direct {p0, v6, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_9
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsClient;->notifySecureRenegotiation(Z)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0, v2}, Lorg/bouncycastle/crypto/tls/TlsClient;->processServerExtensions(Ljava/util/Hashtable;)V

    :cond_a
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->getKeyExchange()Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    iput-short v6, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto/16 :goto_0

    :sswitch_3
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x28

    invoke-direct {p0, v6, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->skipServerKeyExchange()V

    :pswitch_4
    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    const/4 v0, 0x6

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

    if-nez v1, :cond_c

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->skipClientCredentials()V

    :goto_3
    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->sendClientKeyExchange()V

    const/4 v1, 0x7

    iput-short v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    if-eqz v0, :cond_b

    instance-of v1, v0, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;

    if-eqz v1, :cond_b

    check-cast v0, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/b;->getCurrentHash()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;->generateCertificateSignature([B)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->sendCertificateVerify([B)V

    const/16 v0, 0x8

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    :cond_b
    new-array v0, v4, [B

    aput-byte v4, v0, v2

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v3, 0x14

    invoke-virtual {v1, v3, v0, v2, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    const/16 v0, 0x9

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->generatePremasterSecret()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    const-string v3, "master secret"

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v4, v4, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v5, v5, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    invoke-static {v4, v5}, Lorg/bouncycastle/crypto/tls/TlsUtils;->concat([B[B)[B

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v0, v3, v4, v5}, Lorg/bouncycastle/crypto/tls/TlsUtils;->PRF([BLjava/lang/String;[BI)[B

    move-result-object v3

    iput-object v3, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->a([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsClient;->getCompression()Lorg/bouncycastle/crypto/tls/TlsCompression;

    move-result-object v1

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/tls/TlsClient;->getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lorg/bouncycastle/crypto/tls/b;->clientCipherSpecDecided(Lorg/bouncycastle/crypto/tls/TlsCompression;Lorg/bouncycastle/crypto/tls/TlsCipher;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v0, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    const-string v1, "client finished"

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/tls/b;->getCurrentHash()[B

    move-result-object v3

    invoke-static {v0, v1, v3, v8}, Lorg/bouncycastle/crypto/tls/TlsUtils;->PRF([BLjava/lang/String;[BI)[B

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x14

    invoke-static {v3, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque24([BLjava/io/OutputStream;)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v3, 0x16

    array-length v4, v0

    invoke-virtual {v1, v3, v0, v2, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    iput-short v7, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsAuthentication;->getClientCredentials(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;

    move-result-object v1

    if-nez v1, :cond_d

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->skipClientCredentials()V

    sget-object v0, Lorg/bouncycastle/crypto/tls/Certificate;->a:Lorg/bouncycastle/crypto/tls/Certificate;

    :goto_4
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->sendClientCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V

    move-object v0, v1

    goto/16 :goto_3

    :cond_d
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->processClientCredentials(Lorg/bouncycastle/crypto/tls/TlsCredentials;)V

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsCredentials;->getCertificate()Lorg/bouncycastle/crypto/tls/Certificate;

    move-result-object v0

    goto :goto_4

    :sswitch_4
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_4

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :goto_5
    const/4 v0, 0x4

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto/16 :goto_0

    :pswitch_5
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->skipServerCertificate()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    :pswitch_6
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->processServerKeyExchange(Ljava/io/InputStream;)V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    goto :goto_5

    :sswitch_5
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    packed-switch v0, :pswitch_data_5

    invoke-direct {p0, v6, v7}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :goto_6
    const/4 v0, 0x5

    iput-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->skipServerKeyExchange()V

    :pswitch_8
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->u:Lorg/bouncycastle/crypto/tls/TlsAuthentication;

    if-nez v0, :cond_e

    const/16 v0, 0x28

    invoke-direct {p0, v6, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_e
    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v3

    new-array v4, v3, [S

    move v0, v2

    :goto_7
    if-ge v0, v3, :cond_f

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v2

    aput-short v2, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_f
    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->assertEmpty(Ljava/io/ByteArrayInputStream;)V

    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :goto_8
    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-lez v0, :cond_10

    invoke-static {v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/X500Name;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    new-instance v0, Lorg/bouncycastle/crypto/tls/CertificateRequest;

    invoke-direct {v0, v4, v1}, Lorg/bouncycastle/crypto/tls/CertificateRequest;-><init>([SLjava/util/Vector;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->v:Lorg/bouncycastle/crypto/tls/CertificateRequest;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->validateCertificateRequest(Lorg/bouncycastle/crypto/tls/CertificateRequest;)V

    goto :goto_6

    :sswitch_6
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    if-ne v0, v8, :cond_0

    const/16 v0, 0x64

    invoke-direct {p0, v4, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->sendAlert(SS)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_6
        0x2 -> :sswitch_2
        0xb -> :sswitch_0
        0xc -> :sswitch_4
        0xd -> :sswitch_5
        0xe -> :sswitch_3
        0x14 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xb
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3
        :pswitch_3
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_5
        :pswitch_6
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x3
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private safeReadData()V
    .locals 4

    const/16 v3, 0x50

    const/4 v2, 0x2

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/b;->readData()V
    :try_end_0
    .catch Lorg/bouncycastle/crypto/tls/TlsFatalAlert; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;->getAlertDescription()S

    move-result v1

    invoke-direct {p0, v2, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    throw v0

    :catch_1
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_1

    invoke-direct {p0, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_1
    throw v0

    :catch_2
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_2

    invoke-direct {p0, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_2
    throw v0
.end method

.method private safeWriteMessage(S[BII)V
    .locals 4

    const/16 v3, 0x50

    const/4 v2, 0x2

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V
    :try_end_0
    .catch Lorg/bouncycastle/crypto/tls/TlsFatalAlert; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;->getAlertDescription()S

    move-result v1

    invoke-direct {p0, v2, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    throw v0

    :catch_1
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_1

    invoke-direct {p0, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_1
    throw v0

    :catch_2
    move-exception v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v1, :cond_2

    invoke-direct {p0, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_2
    throw v0
.end method

.method private sendAlert(SS)V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x0

    new-array v0, v4, [B

    int-to-byte v1, p1

    aput-byte v1, v0, v3

    const/4 v1, 0x1

    int-to-byte v2, p2

    aput-byte v2, v0, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v2, 0x15

    invoke-virtual {v1, v2, v0, v3, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    return-void
.end method

.method private sendCertificateVerify([B)V
    .locals 5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0xf

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    array-length v1, p1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-static {p1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque16([BLjava/io/OutputStream;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v2, 0x16

    const/4 v3, 0x0

    array-length v4, v0

    invoke-virtual {v1, v2, v0, v3, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    return-void
.end method

.method private sendClientCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V
    .locals 5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0xb

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/tls/Certificate;->encode(Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v2, 0x16

    const/4 v3, 0x0

    array-length v4, v0

    invoke-virtual {v1, v2, v0, v3, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    return-void
.end method

.method private sendClientKeyExchange()V
    .locals 5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x10

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->t:Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsKeyExchange;->generateClientKeyExchange(Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    const/16 v2, 0x16

    const/4 v3, 0x0

    array-length v4, v0

    invoke-virtual {v1, v2, v0, v3, v4}, Lorg/bouncycastle/crypto/tls/b;->writeMessage(S[BII)V

    return-void
.end method

.method private static writeExtension(Ljava/io/OutputStream;Ljava/lang/Integer;[B)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0, p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(ILjava/io/OutputStream;)V

    invoke-static {p2, p0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque16([BLjava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method protected assertEmpty(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-void
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    return-void
.end method

.method public connect(Lorg/bouncycastle/crypto/tls/CertificateVerifyer;)V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/tls/LegacyTlsClient;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/tls/LegacyTlsClient;-><init>(Lorg/bouncycastle/crypto/tls/CertificateVerifyer;)V

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->connect(Lorg/bouncycastle/crypto/tls/TlsClient;)V

    return-void
.end method

.method public connect(Lorg/bouncycastle/crypto/tls/TlsClient;)V
    .locals 7

    const/4 v3, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'tlsClient\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "connect can only be called once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/SecurityParameters;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    const/16 v1, 0x20

    new-array v1, v1, [B

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->h:Ljava/security/SecureRandom;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v1, v1, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v0, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    invoke-static {v0, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeGMTUnixTime([BI)V

    new-instance v0, Lorg/bouncycastle/crypto/tls/c;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->h:Ljava/security/SecureRandom;

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    invoke-direct {v0, v1, v4}, Lorg/bouncycastle/crypto/tls/c;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/tls/SecurityParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->p:Lorg/bouncycastle/crypto/tls/c;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->p:Lorg/bouncycastle/crypto/tls/c;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsClient;->init(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeVersion(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->o:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    iget-object v0, v0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-static {v2, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->getCipherSuites()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->r:[I

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->getClientExtensions()Ljava/util/Hashtable;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_2
    move v0, v3

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->r:[I

    array-length v1, v1

    if-eqz v0, :cond_3

    add-int/lit8 v1, v1, 0x1

    :cond_3
    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(ILjava/io/OutputStream;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->r:[I

    invoke-static {v1, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16Array([ILjava/io/OutputStream;)V

    if-eqz v0, :cond_4

    const/16 v0, 0xff

    invoke-static {v0, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(ILjava/io/OutputStream;)V

    :cond_4
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->q:Lorg/bouncycastle/crypto/tls/TlsClient;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClient;->getCompressionMethods()[S

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->s:[S

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->s:[S

    array-length v0, v0

    int-to-short v0, v0

    invoke-static {v0, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->s:[S

    invoke-static {v0, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8Array([SLjava/io/OutputStream;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    if-eqz v0, :cond_7

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->n:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v5, v0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->writeExtension(Ljava/io/OutputStream;Ljava/lang/Integer;[B)V

    goto :goto_1

    :cond_5
    move v0, v2

    goto :goto_0

    :cond_6
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque16([BLjava/io/OutputStream;)V

    :cond_7
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v3, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(SLjava/io/OutputStream;)V

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/16 v1, 0x16

    array-length v4, v0

    invoke-direct {p0, v1, v0, v2, v4}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->safeWriteMessage(S[BII)V

    iput-short v3, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    :goto_2
    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->w:S

    const/16 v1, 0xc

    if-eq v0, v1, :cond_8

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->safeReadData()V

    goto :goto_2

    :cond_8
    new-instance v0, Lorg/bouncycastle/crypto/tls/k;

    invoke-direct {v0, p0}, Lorg/bouncycastle/crypto/tls/k;-><init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->i:Lorg/bouncycastle/crypto/tls/k;

    new-instance v0, Lorg/bouncycastle/crypto/tls/l;

    invoke-direct {v0, p0}, Lorg/bouncycastle/crypto/tls/l;-><init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->j:Lorg/bouncycastle/crypto/tls/l;

    return-void
.end method

.method protected flush()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->g:Lorg/bouncycastle/crypto/tls/b;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/b;->flush()V

    return-void
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->i:Lorg/bouncycastle/crypto/tls/k;

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->j:Lorg/bouncycastle/crypto/tls/l;

    return-object v0
.end method

.method protected processData(S[BII)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->d:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->addData([BII)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processChangeCipherSpec()V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->e:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->addData([BII)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processAlert()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->f:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->addData([BII)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processHandshake()V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->m:Z

    if-nez v0, :cond_0

    const/4 v0, 0x2

    const/16 v1, 0xa

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->failWithError(SS)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->addData([BII)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processApplicationData()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected readApplicationData([BII)I
    .locals 3

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->l:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal TLS error, this could be an attack"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, -0x1

    :goto_1
    return v0

    :cond_1
    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->safeReadData()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->size()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, p2, v0, v2}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->c:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->removeData(I)V

    goto :goto_1
.end method

.method protected writeData([BII)V
    .locals 3

    const/16 v2, 0x17

    const/4 v1, 0x0

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->k:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->l:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal TLS error, this could be an attack"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Sorry, connection has been closed, you cannot write more data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->b:[B

    invoke-direct {p0, v2, v0, v1, v1}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->safeWriteMessage(S[BII)V

    :cond_2
    const/16 v0, 0x4000

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {p0, v2, p1, p2, v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->safeWriteMessage(S[BII)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    if-gtz p3, :cond_2

    return-void
.end method
