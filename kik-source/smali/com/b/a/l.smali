.class public final Lcom/b/a/l;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 70
    iput p2, p0, Lcom/b/a/l;->a:I

    .line 71
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .prologue
    .line 81
    invoke-super {p0}, Ljava/io/FilterInputStream;->available()I

    move-result v0

    iget v1, p0, Lcom/b/a/l;->a:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 2

    .prologue
    .line 86
    iget v0, p0, Lcom/b/a/l;->a:I

    if-gtz v0, :cond_1

    .line 88
    const/4 v0, -0x1

    .line 95
    :cond_0
    :goto_0
    return v0

    .line 90
    :cond_1
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 91
    if-ltz v0, :cond_0

    .line 93
    iget v1, p0, Lcom/b/a/l;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/b/a/l;->a:I

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 2

    .prologue
    .line 100
    iget v0, p0, Lcom/b/a/l;->a:I

    if-gtz v0, :cond_1

    .line 102
    const/4 v0, -0x1

    .line 110
    :cond_0
    :goto_0
    return v0

    .line 104
    :cond_1
    iget v0, p0, Lcom/b/a/l;->a:I

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 105
    invoke-super {p0, p1, p2, v0}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v0

    .line 106
    if-ltz v0, :cond_0

    .line 108
    iget v1, p0, Lcom/b/a/l;->a:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/b/a/l;->a:I

    goto :goto_0
.end method

.method public final skip(J)J
    .locals 5

    .prologue
    .line 115
    iget v0, p0, Lcom/b/a/l;->a:I

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-super {p0, v0, v1}, Ljava/io/FilterInputStream;->skip(J)J

    move-result-wide v0

    .line 116
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    .line 118
    iget v2, p0, Lcom/b/a/l;->a:I

    int-to-long v2, v2

    sub-long/2addr v2, v0

    long-to-int v2, v2

    iput v2, p0, Lcom/b/a/l;->a:I

    .line 120
    :cond_0
    return-wide v0
.end method
