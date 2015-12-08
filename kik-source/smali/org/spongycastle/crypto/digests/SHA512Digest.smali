.class public Lorg/spongycastle/crypto/digests/SHA512Digest;
.super Lorg/spongycastle/crypto/digests/LongDigest;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/SHA512Digest;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/LongDigest;-><init>(Lorg/spongycastle/crypto/digests/LongDigest;)V

    .line 36
    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 3

    .prologue
    .line 52
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/SHA512Digest;->e()V

    .line 54
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->a:J

    invoke-static {v0, v1, p1, p2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 55
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->b:J

    add-int/lit8 v2, p2, 0x8

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 56
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->c:J

    add-int/lit8 v2, p2, 0x10

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 57
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->d:J

    add-int/lit8 v2, p2, 0x18

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 58
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->e:J

    add-int/lit8 v2, p2, 0x20

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 59
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->f:J

    add-int/lit8 v2, p2, 0x28

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 60
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->g:J

    add-int/lit8 v2, p2, 0x30

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 61
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->h:J

    add-int/lit8 v2, p2, 0x38

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 63
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/SHA512Digest;->c()V

    .line 65
    const/16 v0, 0x40

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    const-string v0, "SHA-512"

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 45
    const/16 v0, 0x40

    return v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 73
    invoke-super {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->c()V

    .line 79
    const-wide v0, 0x6a09e667f3bcc908L    # 6.344059688352415E202

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->a:J

    .line 80
    const-wide v0, -0x4498517a7b3558c5L    # -1.5671250923562117E-22

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->b:J

    .line 81
    const-wide v0, 0x3c6ef372fe94f82bL    # 1.342284505169847E-17

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->c:J

    .line 82
    const-wide v0, -0x5ab00ac5a0e2c90fL

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->d:J

    .line 83
    const-wide v0, 0x510e527fade682d1L    # 2.876275032471325E82

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->e:J

    .line 84
    const-wide v0, -0x64fa9773d4c193e1L

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->f:J

    .line 85
    const-wide v0, 0x1f83d9abfb41bd6bL    # 7.229011495228878E-157

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->g:J

    .line 86
    const-wide v0, 0x5be0cd19137e2179L    # 3.816167663240759E134

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA512Digest;->h:J

    .line 87
    return-void
.end method
