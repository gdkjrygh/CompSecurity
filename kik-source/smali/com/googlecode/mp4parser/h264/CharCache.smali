.class public Lcom/googlecode/mp4parser/h264/CharCache;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cache:[C

.field private pos:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-array v0, p1, [C

    iput-object v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    .line 29
    return-void
.end method


# virtual methods
.method public append(C)V
    .locals 2

    .prologue
    .line 48
    iget v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 49
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    iget v1, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    aput-char p1, v0, v1

    .line 50
    iget v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    .line 52
    :cond_0
    return-void
.end method

.method public append(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 33
    iget-object v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    array-length v0, v0

    iget v2, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    sub-int/2addr v0, v2

    .line 34
    array-length v2, v1

    if-ge v2, v0, :cond_0

    array-length v0, v1

    .line 35
    :cond_0
    const/4 v2, 0x0

    iget-object v3, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    iget v4, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    invoke-static {v1, v2, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    iget v1, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    .line 37
    return-void
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    .line 45
    return-void
.end method

.method public length()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 40
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/CharCache;->cache:[C

    const/4 v2, 0x0

    iget v3, p0, Lcom/googlecode/mp4parser/h264/CharCache;->pos:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method
