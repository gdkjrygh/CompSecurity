.class public final Lnet/jarlehansen/protobuf/javame/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final a:Lnet/jarlehansen/protobuf/javame/b;


# instance fields
.field volatile b:I

.field private final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 80
    new-instance v0, Lnet/jarlehansen/protobuf/javame/b;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/b;-><init>([B)V

    sput-object v0, Lnet/jarlehansen/protobuf/javame/b;->a:Lnet/jarlehansen/protobuf/javame/b;

    return-void
.end method

.method private constructor <init>([B)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    const/4 v0, 0x0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/b;->b:I

    .line 48
    iput-object p1, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    .line 49
    return-void
.end method

.method public static a([B)Lnet/jarlehansen/protobuf/javame/b;
    .locals 2

    .prologue
    .line 95
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lnet/jarlehansen/protobuf/javame/b;->a([BII)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    return-object v0
.end method

.method public static a([BII)Lnet/jarlehansen/protobuf/javame/b;
    .locals 2

    .prologue
    .line 86
    new-array v0, p2, [B

    .line 87
    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    new-instance v1, Lnet/jarlehansen/protobuf/javame/b;

    invoke-direct {v1, v0}, Lnet/jarlehansen/protobuf/javame/b;-><init>([B)V

    return-object v1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    array-length v0, v0

    return v0
.end method

.method public b()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 149
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    array-length v0, v0

    .line 150
    new-array v1, v0, [B

    .line 151
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    return-object v1
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 169
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    const-string/jumbo v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 170
    :catch_0
    move-exception v0

    .line 171
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "UTF-8 not supported?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 179
    if-ne p1, p0, :cond_1

    .line 201
    :cond_0
    :goto_0
    return v0

    .line 183
    :cond_1
    instance-of v2, p1, Lnet/jarlehansen/protobuf/javame/b;

    if-nez v2, :cond_2

    move v0, v1

    .line 184
    goto :goto_0

    .line 187
    :cond_2
    check-cast p1, Lnet/jarlehansen/protobuf/javame/b;

    .line 188
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    array-length v3, v2

    .line 189
    iget-object v2, p1, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    array-length v2, v2

    if-eq v3, v2, :cond_3

    move v0, v1

    .line 190
    goto :goto_0

    .line 193
    :cond_3
    iget-object v4, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    .line 194
    iget-object v5, p1, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    move v2, v1

    .line 195
    :goto_1
    if-ge v2, v3, :cond_0

    .line 196
    aget-byte v6, v4, v2

    aget-byte v7, v5, v2

    if-eq v6, v7, :cond_4

    move v0, v1

    .line 197
    goto :goto_0

    .line 195
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public hashCode()I
    .locals 5

    .prologue
    .line 207
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/b;->b:I

    .line 209
    if-nez v0, :cond_2

    .line 210
    iget-object v4, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    .line 211
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b;->c:[B

    array-length v2, v0

    .line 214
    const/4 v0, 0x0

    move v1, v0

    move v0, v2

    :goto_0
    if-ge v1, v2, :cond_0

    .line 215
    mul-int/lit8 v0, v0, 0x1f

    aget-byte v3, v4, v1

    add-int/2addr v3, v0

    .line 214
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v3

    goto :goto_0

    .line 217
    :cond_0
    if-nez v0, :cond_1

    .line 218
    const/4 v0, 0x1

    .line 221
    :cond_1
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/b;->b:I

    .line 224
    :cond_2
    return v0
.end method
