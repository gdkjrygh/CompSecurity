.class public abstract Lorg/bouncycastle/crypto/tls/SRPTlsClient;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsClient;


# static fields
.field public static final a:Ljava/lang/Integer;


# instance fields
.field protected b:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

.field protected c:[B

.field protected d:[B

.field protected e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected f:I

.field protected g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->a:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsCipherFactory;[B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->c:[B

    invoke-static {p3}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->d:[B

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/tls/DefaultTlsCipherFactory;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsCipherFactory;-><init>()V

    invoke-direct {p0, v0, p1, p2}, Lorg/bouncycastle/crypto/tls/SRPTlsClient;-><init>(Lorg/bouncycastle/crypto/tls/TlsCipherFactory;[B[B)V

    return-void
.end method


# virtual methods
.method protected createSRPKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 4

    new-instance v0, Lorg/bouncycastle/crypto/tls/o;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->c:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->d:[B

    invoke-direct {v0, v1, p1, v2, v3}, Lorg/bouncycastle/crypto/tls/o;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I[B[B)V

    return-object v0
.end method

.method public getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;
    .locals 4

    const/4 v3, 0x2

    iget v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->g:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0xc01a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public getCipherSuites()[I
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0xc022
        0xc01f
        0xc01c
        0xc021
        0xc01e
        0xc01b
        0xc020
        0xc01d
        0xc01a
    .end array-data
.end method

.method public getClientExtensions()Ljava/util/Hashtable;
    .locals 3

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->c:[B

    invoke-static {v2, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque8([BLjava/io/OutputStream;)V

    sget-object v2, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getCompression()Lorg/bouncycastle/crypto/tls/TlsCompression;
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->f:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :pswitch_0
    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsNullCompression;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/TlsNullCompression;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getCompressionMethods()[S
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [S

    aput-short v1, v0, v1

    return-object v0
.end method

.method public getKeyExchange()Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->g:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :pswitch_0
    const/16 v0, 0x15

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->createSRPKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    const/16 v0, 0x17

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->createSRPKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x16

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->createSRPKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0xc01a
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public init(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->e:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    return-void
.end method

.method public notifySecureRenegotiation(Z)V
    .locals 0

    return-void
.end method

.method public notifySelectedCipherSuite(I)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->g:I

    return-void
.end method

.method public notifySelectedCompressionMethod(S)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/tls/SRPTlsClient;->f:I

    return-void
.end method

.method public notifySessionID([B)V
    .locals 0

    return-void
.end method

.method public processServerExtensions(Ljava/util/Hashtable;)V
    .locals 0

    return-void
.end method
