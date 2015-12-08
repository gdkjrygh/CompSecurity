.class final Lorg/bouncycastle/crypto/tls/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

.field private b:Ljava/io/InputStream;

.field private c:Ljava/io/OutputStream;

.field private d:Lorg/bouncycastle/crypto/tls/a;

.field private e:Lorg/bouncycastle/crypto/tls/TlsCompression;

.field private f:Lorg/bouncycastle/crypto/tls/TlsCompression;

.field private g:Lorg/bouncycastle/crypto/tls/TlsCipher;

.field private h:Lorg/bouncycastle/crypto/tls/TlsCipher;

.field private i:Ljava/io/ByteArrayOutputStream;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->e:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->f:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->g:Lorg/bouncycastle/crypto/tls/TlsCipher;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/b;->a:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/b;->c:Ljava/io/OutputStream;

    new-instance v0, Lorg/bouncycastle/crypto/tls/a;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/a;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->d:Lorg/bouncycastle/crypto/tls/a;

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsNullCompression;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/TlsNullCompression;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->e:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->e:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->f:Lorg/bouncycastle/crypto/tls/TlsCompression;

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsNullCipher;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/TlsNullCipher;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->g:Lorg/bouncycastle/crypto/tls/TlsCipher;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->g:Lorg/bouncycastle/crypto/tls/TlsCipher;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    return-void
.end method

.method private static doFinal(Lorg/bouncycastle/crypto/tls/a;)[B
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/tls/a;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/a;->doFinal([BI)I

    return-object v0
.end method

.method private getBufferContents()[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-object v0
.end method


# virtual methods
.method final clientCipherSpecDecided(Lorg/bouncycastle/crypto/tls/TlsCompression;Lorg/bouncycastle/crypto/tls/TlsCipher;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/b;->f:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    return-void
.end method

.method protected final close()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->c:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    if-eqz v0, :cond_0

    throw v0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected final decodeAndVerify(SLjava/io/InputStream;I)[B
    .locals 4

    const/4 v3, 0x0

    new-array v0, p3, [B

    invoke-static {v0, p2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readFully([BLjava/io/InputStream;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->g:Lorg/bouncycastle/crypto/tls/TlsCipher;

    invoke-interface {v1, p1, v0, v3, p3}, Lorg/bouncycastle/crypto/tls/TlsCipher;->decodeCiphertext(S[BII)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->e:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/tls/TlsCompression;->decompress(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    if-ne v1, v2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    array-length v2, v0

    invoke-virtual {v1, v0, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/b;->getBufferContents()[B

    move-result-object v0

    goto :goto_0
.end method

.method protected final flush()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method final getCurrentHash()[B
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/a;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->d:Lorg/bouncycastle/crypto/tls/a;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/a;-><init>(Lorg/bouncycastle/crypto/tls/a;)V

    invoke-static {v0}, Lorg/bouncycastle/crypto/tls/b;->doFinal(Lorg/bouncycastle/crypto/tls/a;)[B

    move-result-object v0

    return-object v0
.end method

.method public final readData()V
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    invoke-static {v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/b;->a:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-static {v1, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->checkVersion(Ljava/io/InputStream;Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16(Ljava/io/InputStream;)I

    move-result v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/b;->b:Ljava/io/InputStream;

    invoke-virtual {p0, v0, v2, v1}, Lorg/bouncycastle/crypto/tls/b;->decodeAndVerify(SLjava/io/InputStream;I)[B

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/b;->a:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    const/4 v3, 0x0

    array-length v4, v1

    invoke-virtual {v2, v0, v1, v3, v4}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->processData(S[BII)V

    return-void
.end method

.method final serverClientSpecReceived()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->f:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->e:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->g:Lorg/bouncycastle/crypto/tls/TlsCipher;

    return-void
.end method

.method final updateHandshakeData([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->d:Lorg/bouncycastle/crypto/tls/a;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/tls/a;->update([BII)V

    return-void
.end method

.method protected final writeMessage(S[BII)V
    .locals 5

    const/4 v4, 0x0

    const/16 v0, 0x16

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/b;->updateHandshakeData([BII)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->f:Lorg/bouncycastle/crypto/tls/TlsCompression;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsCompression;->compress(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->i:Ljava/io/ByteArrayOutputStream;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/TlsCipher;->encodePlaintext(S[BII)[B

    move-result-object v0

    :goto_0
    array-length v1, v0

    add-int/lit8 v1, v1, 0x5

    new-array v1, v1, [B

    invoke-static {p1, v1, v4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(S[BI)V

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeVersion([BI)V

    array-length v2, v0

    const/4 v3, 0x3

    invoke-static {v2, v1, v3}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(I[BI)V

    const/4 v2, 0x5

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->c:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/b;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void

    :cond_1
    invoke-virtual {v0, p2, p3, p4}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/b;->getBufferContents()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/b;->h:Lorg/bouncycastle/crypto/tls/TlsCipher;

    array-length v2, v0

    invoke-interface {v1, p1, v0, v4, v2}, Lorg/bouncycastle/crypto/tls/TlsCipher;->encodePlaintext(S[BII)[B

    move-result-object v0

    goto :goto_0
.end method
