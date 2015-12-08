.class final Lorg/bouncycastle/crypto/tls/k;
.super Ljava/io/InputStream;


# instance fields
.field private a:[B

.field private b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->a:[B

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/k;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->close()V

    return-void
.end method

.method public final read()I
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->a:[B

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/k;->read([B)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->a:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/k;->b:Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/tls/TlsProtocolHandler;->readApplicationData([BII)I

    move-result v0

    return v0
.end method
