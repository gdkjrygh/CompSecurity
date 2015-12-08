.class public Lorg/spongycastle/crypto/tls/SSL3Mac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Mac;


# static fields
.field static final a:[B

.field static final b:[B

.field static final c:[B

.field static final d:[B


# instance fields
.field private e:Lorg/spongycastle/crypto/Digest;

.field private f:[B

.field private g:[B

.field private h:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/16 v4, 0x5c

    const/16 v3, 0x36

    const/16 v2, 0x30

    const/16 v1, 0x28

    .line 21
    invoke-static {v3, v2}, Lorg/spongycastle/crypto/tls/SSL3Mac;->a(BI)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/tls/SSL3Mac;->a:[B

    .line 22
    invoke-static {v4, v2}, Lorg/spongycastle/crypto/tls/SSL3Mac;->a(BI)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/tls/SSL3Mac;->b:[B

    .line 23
    invoke-static {v3, v1}, Lorg/spongycastle/crypto/tls/SSL3Mac;->a(BI)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/tls/SSL3Mac;->c:[B

    .line 24
    invoke-static {v4, v1}, Lorg/spongycastle/crypto/tls/SSL3Mac;->a(BI)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/tls/SSL3Mac;->d:[B

    return-void
.end method

.method private static a(BI)[B
    .locals 1

    .prologue
    .line 113
    new-array v0, p1, [B

    .line 114
    invoke-static {v0, p0}, Lorg/spongycastle/util/Arrays;->a([BB)V

    .line 115
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    return v0
.end method

.method public final a([BI)I
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 87
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 88
    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v4}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 90
    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->f:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->f:[B

    array-length v3, v3

    invoke-interface {v1, v2, v4, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 91
    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v2, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->h:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->h:[B

    array-length v3, v3

    invoke-interface {v1, v2, v4, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 92
    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    array-length v2, v0

    invoke-interface {v1, v0, v4, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 94
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    move-result v0

    .line 96
    invoke-virtual {p0}, Lorg/spongycastle/crypto/tls/SSL3Mac;->b()V

    .line 98
    return v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 78
    return-void
.end method

.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 65
    check-cast p1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->f:[B

    .line 67
    invoke-virtual {p0}, Lorg/spongycastle/crypto/tls/SSL3Mac;->b()V

    .line 68
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 83
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 106
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 107
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->f:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->f:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 108
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v1, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->g:[B

    iget-object v2, p0, Lorg/spongycastle/crypto/tls/SSL3Mac;->g:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 109
    return-void
.end method
