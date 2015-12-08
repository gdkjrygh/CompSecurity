.class public abstract Lorg/bouncycastle/crypto/tls/DefaultTlsClient;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsClient;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

.field protected b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected c:I

.field protected d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/tls/DefaultTlsCipherFactory;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsCipherFactory;-><init>()V

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;-><init>(Lorg/bouncycastle/crypto/tls/TlsCipherFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsCipherFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->a:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    return-void
.end method


# virtual methods
.method protected createDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/d;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/tls/d;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V

    return-object v0
.end method

.method protected createDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/e;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/tls/e;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V

    return-object v0
.end method

.method protected createECDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/h;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/tls/h;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V

    return-object v0
.end method

.method protected createECDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/i;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/tls/i;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V

    return-object v0
.end method

.method protected createRSAKeyExchange()Lorg/bouncycastle/crypto/tls/TlsKeyExchange;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/m;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/m;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V

    return-object v0
.end method

.method public getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;
    .locals 4

    const/4 v3, 0x2

    iget v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->c:I

    sparse-switch v0, :sswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :sswitch_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->a:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    :goto_0
    return-object v0

    :sswitch_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->a:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->a:Lorg/bouncycastle/crypto/tls/TlsCipherFactory;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/tls/TlsCipherFactory;->createCipher(Lorg/bouncycastle/crypto/tls/TlsClientContext;II)Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x10 -> :sswitch_0
        0x13 -> :sswitch_0
        0x16 -> :sswitch_0
        0x2f -> :sswitch_1
        0x30 -> :sswitch_1
        0x31 -> :sswitch_1
        0x32 -> :sswitch_1
        0x33 -> :sswitch_1
        0x35 -> :sswitch_2
        0x36 -> :sswitch_2
        0x37 -> :sswitch_2
        0x38 -> :sswitch_2
        0x39 -> :sswitch_2
        0xc003 -> :sswitch_0
        0xc004 -> :sswitch_1
        0xc005 -> :sswitch_2
        0xc008 -> :sswitch_0
        0xc009 -> :sswitch_1
        0xc00a -> :sswitch_2
        0xc00d -> :sswitch_0
        0xc00e -> :sswitch_1
        0xc00f -> :sswitch_2
        0xc012 -> :sswitch_0
        0xc013 -> :sswitch_1
        0xc014 -> :sswitch_2
    .end sparse-switch
.end method

.method public getCipherSuites()[I
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x39
        0x38
        0x33
        0x32
        0x16
        0x13
        0x35
        0x2f
        0xa
    .end array-data
.end method

.method public getClientExtensions()Ljava/util/Hashtable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCompression()Lorg/bouncycastle/crypto/tls/TlsCompression;
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->d:I

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

    iget v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->c:I

    sparse-switch v0, :sswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :sswitch_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createRSAKeyExchange()Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    :goto_0
    return-object v0

    :sswitch_1
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_4
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createECDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createECDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_7
    const/16 v0, 0x12

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createECDHKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    :sswitch_8
    const/16 v0, 0x13

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->createECDHEKeyExchange(I)Lorg/bouncycastle/crypto/tls/TlsKeyExchange;

    move-result-object v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xd -> :sswitch_1
        0x10 -> :sswitch_2
        0x13 -> :sswitch_3
        0x16 -> :sswitch_4
        0x2f -> :sswitch_0
        0x30 -> :sswitch_1
        0x31 -> :sswitch_2
        0x32 -> :sswitch_3
        0x33 -> :sswitch_4
        0x35 -> :sswitch_0
        0x36 -> :sswitch_1
        0x37 -> :sswitch_2
        0x38 -> :sswitch_3
        0x39 -> :sswitch_4
        0xc003 -> :sswitch_5
        0xc004 -> :sswitch_5
        0xc005 -> :sswitch_5
        0xc008 -> :sswitch_6
        0xc009 -> :sswitch_6
        0xc00a -> :sswitch_6
        0xc00d -> :sswitch_7
        0xc00e -> :sswitch_7
        0xc00f -> :sswitch_7
        0xc012 -> :sswitch_8
        0xc013 -> :sswitch_8
        0xc014 -> :sswitch_8
    .end sparse-switch
.end method

.method public init(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->b:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    return-void
.end method

.method public notifySecureRenegotiation(Z)V
    .locals 0

    return-void
.end method

.method public notifySelectedCipherSuite(I)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->c:I

    return-void
.end method

.method public notifySelectedCompressionMethod(S)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;->d:I

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
