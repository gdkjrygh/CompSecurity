.class public final Lcom/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:Lcom/b/a/b;


# instance fields
.field private final c:[B

.field private volatile d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 135
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/b/a/b;->a:[B

    .line 140
    new-instance v0, Lcom/b/a/b;

    sget-object v1, Lcom/b/a/b;->a:[B

    invoke-direct {v0, v1}, Lcom/b/a/b;-><init>([B)V

    sput-object v0, Lcom/b/a/b;->b:Lcom/b/a/b;

    return-void
.end method

.method private constructor <init>([B)V
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/b;->d:I

    .line 98
    iput-object p1, p0, Lcom/b/a/b;->c:[B

    .line 99
    return-void
.end method

.method static a([B)Lcom/b/a/b;
    .locals 1

    .prologue
    .line 68
    new-instance v0, Lcom/b/a/b;

    invoke-direct {v0, p0}, Lcom/b/a/b;-><init>([B)V

    return-object v0
.end method

.method public static a([BII)Lcom/b/a/b;
    .locals 2

    .prologue
    .line 147
    new-array v0, p2, [B

    .line 148
    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 149
    new-instance v1, Lcom/b/a/b;

    invoke-direct {v1, v0}, Lcom/b/a/b;-><init>([B)V

    return-object v1
.end method

.method public static b([B)Lcom/b/a/b;
    .locals 2

    .prologue
    .line 156
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/b/a/b;->a([BII)Lcom/b/a/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a()[B
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/b/a/b;->c:[B

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/b/a/b;->c:[B

    array-length v0, v0

    return v0
.end method

.method public final c()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 215
    iget-object v0, p0, Lcom/b/a/b;->c:[B

    array-length v0, v0

    .line 216
    new-array v1, v0, [B

    .line 217
    iget-object v2, p0, Lcom/b/a/b;->c:[B

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 218
    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 256
    if-eq p1, p0, :cond_0

    instance-of v2, p1, Lcom/b/a/b;

    if-eqz v2, :cond_1

    check-cast p1, Lcom/b/a/b;

    iget-object v2, p0, Lcom/b/a/b;->c:[B

    array-length v3, v2

    iget-object v2, p1, Lcom/b/a/b;->c:[B

    array-length v2, v2

    if-eq v3, v2, :cond_2

    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    return v0

    :cond_2
    iget-object v4, p0, Lcom/b/a/b;->c:[B

    iget-object v5, p1, Lcom/b/a/b;->c:[B

    move v2, v0

    :goto_1
    if-ge v2, v3, :cond_4

    aget-byte v6, v4, v2

    aget-byte v7, v5, v2

    if-eq v6, v7, :cond_3

    move v2, v0

    goto :goto_0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    move v2, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 5

    .prologue
    .line 316
    iget v0, p0, Lcom/b/a/b;->d:I

    .line 318
    if-nez v0, :cond_2

    .line 319
    iget-object v4, p0, Lcom/b/a/b;->c:[B

    .line 320
    iget-object v0, p0, Lcom/b/a/b;->c:[B

    array-length v2, v0

    .line 323
    const/4 v0, 0x0

    move v1, v0

    move v0, v2

    :goto_0
    if-ge v1, v2, :cond_0

    .line 324
    mul-int/lit8 v0, v0, 0x1f

    aget-byte v3, v4, v1

    add-int/2addr v3, v0

    .line 323
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v3

    goto :goto_0

    .line 326
    :cond_0
    if-nez v0, :cond_1

    .line 327
    const/4 v0, 0x1

    .line 330
    :cond_1
    iput v0, p0, Lcom/b/a/b;->d:I

    .line 333
    :cond_2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/b/a/b;->c:[B

    invoke-static {v0}, Lcom/b/a/w$a;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
