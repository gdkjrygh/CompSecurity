.class public Lorg/spongycastle/util/encoders/UrlBase64Encoder;
.super Lorg/spongycastle/util/encoders/Base64Encoder;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 18
    invoke-direct {p0}, Lorg/spongycastle/util/encoders/Base64Encoder;-><init>()V

    .line 19
    iget-object v0, p0, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->a:[B

    iget-object v1, p0, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->a:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x2

    const/16 v2, 0x2d

    aput-byte v2, v0, v1

    .line 20
    iget-object v0, p0, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->a:[B

    iget-object v1, p0, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->a:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, 0x5f

    aput-byte v2, v0, v1

    .line 21
    const/16 v0, 0x2e

    iput-byte v0, p0, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->b:B

    .line 23
    invoke-virtual {p0}, Lorg/spongycastle/util/encoders/UrlBase64Encoder;->a()V

    .line 24
    return-void
.end method
