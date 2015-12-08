.class final Lorg/spongycastle/asn1/e;
.super Lorg/spongycastle/asn1/i;
.source "SourceFile"


# static fields
.field private static final b:[B


# instance fields
.field private final c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/spongycastle/asn1/e;->b:[B

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lorg/spongycastle/asn1/i;-><init>(Ljava/io/InputStream;I)V

    .line 24
    if-gez p2, :cond_0

    .line 26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative lengths not allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_0
    iput p2, p0, Lorg/spongycastle/asn1/e;->c:I

    .line 30
    iput p2, p0, Lorg/spongycastle/asn1/e;->d:I

    .line 32
    if-nez p2, :cond_1

    .line 34
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->c()V

    .line 36
    :cond_1
    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    return v0
.end method

.method final b()[B
    .locals 3

    .prologue
    .line 93
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    if-nez v0, :cond_0

    .line 95
    sget-object v0, Lorg/spongycastle/asn1/e;->b:[B

    .line 104
    :goto_0
    return-object v0

    .line 98
    :cond_0
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    new-array v0, v0, [B

    .line 99
    iget v1, p0, Lorg/spongycastle/asn1/e;->d:I

    iget-object v2, p0, Lorg/spongycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-static {v2, v0}, Lorg/spongycastle/util/io/Streams;->a(Ljava/io/InputStream;[B)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lorg/spongycastle/asn1/e;->d:I

    if-eqz v1, :cond_1

    .line 101
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DEF length "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/asn1/e;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " object truncated by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/asn1/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_1
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->c()V

    goto :goto_0
.end method

.method public final read()I
    .locals 3

    .prologue
    .line 46
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    if-nez v0, :cond_1

    .line 48
    const/4 v0, -0x1

    .line 63
    :cond_0
    :goto_0
    return v0

    .line 51
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 53
    if-gez v0, :cond_2

    .line 55
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DEF length "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/asn1/e;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " object truncated by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/asn1/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_2
    iget v1, p0, Lorg/spongycastle/asn1/e;->d:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/spongycastle/asn1/e;->d:I

    if-nez v1, :cond_0

    .line 60
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->c()V

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 3

    .prologue
    .line 69
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    if-nez v0, :cond_1

    .line 71
    const/4 v0, -0x1

    .line 87
    :cond_0
    :goto_0
    return v0

    .line 74
    :cond_1
    iget v0, p0, Lorg/spongycastle/asn1/e;->d:I

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 75
    iget-object v1, p0, Lorg/spongycastle/asn1/e;->a:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 77
    if-gez v0, :cond_2

    .line 79
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DEF length "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/asn1/e;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " object truncated by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/spongycastle/asn1/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_2
    iget v1, p0, Lorg/spongycastle/asn1/e;->d:I

    sub-int/2addr v1, v0

    iput v1, p0, Lorg/spongycastle/asn1/e;->d:I

    if-nez v1, :cond_0

    .line 84
    invoke-virtual {p0}, Lorg/spongycastle/asn1/e;->c()V

    goto :goto_0
.end method
