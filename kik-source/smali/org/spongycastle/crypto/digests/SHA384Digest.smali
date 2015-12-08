.class public Lorg/spongycastle/crypto/digests/SHA384Digest;
.super Lorg/spongycastle/crypto/digests/LongDigest;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/LongDigest;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/SHA384Digest;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/LongDigest;-><init>(Lorg/spongycastle/crypto/digests/LongDigest;)V

    .line 37
    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 3

    .prologue
    .line 53
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/SHA384Digest;->e()V

    .line 55
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->a:J

    invoke-static {v0, v1, p1, p2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 56
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->b:J

    add-int/lit8 v2, p2, 0x8

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 57
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->c:J

    add-int/lit8 v2, p2, 0x10

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 58
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->d:J

    add-int/lit8 v2, p2, 0x18

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 59
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->e:J

    add-int/lit8 v2, p2, 0x20

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 60
    iget-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->f:J

    add-int/lit8 v2, p2, 0x28

    invoke-static {v0, v1, p1, v2}, Lorg/spongycastle/crypto/util/Pack;->a(J[BI)V

    .line 62
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/SHA384Digest;->c()V

    .line 64
    const/16 v0, 0x30

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    const-string v0, "SHA-384"

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 46
    const/16 v0, 0x30

    return v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 72
    invoke-super {p0}, Lorg/spongycastle/crypto/digests/LongDigest;->c()V

    .line 78
    const-wide v0, -0x344462a23efa6128L    # -6.771107636816954E56

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->a:J

    .line 79
    const-wide v0, 0x629a292a367cd507L    # 9.641589608180943E166

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->b:J

    .line 80
    const-wide v0, -0x6ea6fea5cf8f22e9L    # -4.222163200156129E-225

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->c:J

    .line 81
    const-wide v0, 0x152fecd8f70e5939L

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->d:J

    .line 82
    const-wide v0, 0x67332667ffc00b31L    # 1.3331733573491853E189

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->e:J

    .line 83
    const-wide v0, -0x714bb57897a7eaefL    # -7.790218494879152E-238

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->f:J

    .line 84
    const-wide v0, -0x24f3d1f29b067059L    # -3.9066766103558855E130

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->g:J

    .line 85
    const-wide v0, 0x47b5481dbefa4fa4L    # 2.8288236605994657E37

    iput-wide v0, p0, Lorg/spongycastle/crypto/digests/SHA384Digest;->h:J

    .line 86
    return-void
.end method
