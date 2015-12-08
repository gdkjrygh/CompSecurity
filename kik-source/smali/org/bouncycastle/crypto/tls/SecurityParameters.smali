.class public Lorg/bouncycastle/crypto/tls/SecurityParameters;
.super Ljava/lang/Object;


# instance fields
.field a:[B

.field b:[B

.field c:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    return-void
.end method


# virtual methods
.method public getClientRandom()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    return-object v0
.end method

.method public getMasterSecret()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->c:[B

    return-object v0
.end method

.method public getServerRandom()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    return-object v0
.end method
