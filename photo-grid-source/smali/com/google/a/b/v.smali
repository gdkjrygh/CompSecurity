.class public final Lcom/google/a/b/v;
.super Ljava/util/AbstractMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap",
        "<",
        "Ljava/lang/String;",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final b:[Ljava/util/Map$Entry;

.field private static final i:I


# instance fields
.field private a:Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field private c:[Lcom/google/a/b/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/a/b/aa;

    sput-object v0, Lcom/google/a/b/v;->b:[Ljava/util/Map$Entry;

    .line 485
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    sput v0, Lcom/google/a/b/v;->i:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 92
    sget-object v0, Lcom/google/a/b/v;->b:[Ljava/util/Map$Entry;

    check-cast v0, [Lcom/google/a/b/aa;

    iput-object v0, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 93
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/a/b/v;->e:I

    .line 94
    new-instance v0, Lcom/google/a/b/aa;

    invoke-direct {v0}, Lcom/google/a/b/aa;-><init>()V

    iput-object v0, p0, Lcom/google/a/b/v;->a:Lcom/google/a/b/aa;

    .line 95
    return-void
.end method

.method static synthetic a(Lcom/google/a/b/v;)Lcom/google/a/b/aa;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/a/b/v;->a:Lcom/google/a/b/aa;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/google/a/b/aa;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 115
    if-nez p1, :cond_1

    .line 127
    :cond_0
    :goto_0
    return-object v0

    .line 119
    :cond_1
    invoke-static {p1}, Lcom/google/a/b/v;->b(Ljava/lang/String;)I

    move-result v2

    .line 120
    iget-object v1, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 121
    array-length v3, v1

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v2

    aget-object v1, v1, v3

    :goto_1
    if-eqz v1, :cond_0

    .line 122
    iget-object v3, v1, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    .line 123
    if-eq v3, p1, :cond_2

    iget v4, v1, Lcom/google/a/b/aa;->c:I

    if-ne v4, v2, :cond_3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move-object v0, v1

    .line 124
    goto :goto_0

    .line 121
    :cond_3
    iget-object v1, v1, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    goto :goto_1
.end method

.method private static a(Lcom/google/a/b/aa;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/b/aa",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 250
    iget-object v0, p0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iget-object v1, p0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    iput-object v1, v0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 251
    iget-object v0, p0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    iget-object v1, p0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object v1, v0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object v0, p0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 253
    return-void
.end method

.method static synthetic a(Lcom/google/a/b/v;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 1349
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    move v0, v1

    .line 1368
    :goto_0
    return v0

    :cond_1
    move-object v0, p1

    .line 1353
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/a/b/v;->b(Ljava/lang/String;)I

    move-result v3

    .line 1354
    iget-object v4, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 1355
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    and-int v5, v3, v0

    .line 1356
    aget-object v2, v4, v5

    const/4 v0, 0x0

    :goto_1
    if-eqz v2, :cond_7

    .line 1357
    iget v6, v2, Lcom/google/a/b/aa;->c:I

    if-ne v6, v3, :cond_6

    iget-object v6, v2, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 1358
    if-nez p2, :cond_3

    iget-object v3, v2, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    if-eqz v3, :cond_4

    :cond_2
    move v0, v1

    .line 1359
    goto :goto_0

    .line 1358
    :cond_3
    iget-object v3, v2, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    invoke-virtual {p2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1361
    :cond_4
    if-nez v0, :cond_5

    .line 1362
    iget-object v0, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    aput-object v0, v4, v5

    .line 1366
    :goto_2
    iget v0, p0, Lcom/google/a/b/v;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/b/v;->d:I

    .line 1367
    invoke-static {v2}, Lcom/google/a/b/v;->a(Lcom/google/a/b/aa;)V

    .line 1368
    const/4 v0, 0x1

    goto :goto_0

    .line 1364
    :cond_5
    iget-object v1, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    iput-object v1, v0, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    goto :goto_2

    .line 1356
    :cond_6
    iget-object v0, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_1

    :cond_7
    move v0, v1

    .line 38
    goto :goto_0
.end method

.method private a()[Lcom/google/a/b/aa;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lcom/google/a/b/aa",
            "<TV;>;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 184
    iget-object v5, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 185
    array-length v9, v5

    .line 186
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v9, v0, :cond_1

    move-object v0, v5

    .line 223
    :cond_0
    return-object v0

    .line 189
    :cond_1
    mul-int/lit8 v1, v9, 0x2

    .line 1171
    new-array v0, v1, [Lcom/google/a/b/aa;

    check-cast v0, [Lcom/google/a/b/aa;

    .line 1172
    iput-object v0, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 1173
    shr-int/lit8 v2, v1, 0x1

    shr-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/a/b/v;->e:I

    .line 191
    iget v1, p0, Lcom/google/a/b/v;->d:I

    if-eqz v1, :cond_0

    .line 195
    const/4 v1, 0x0

    move v6, v1

    :goto_0
    if-ge v6, v9, :cond_0

    .line 200
    aget-object v7, v5, v6

    .line 201
    if-eqz v7, :cond_4

    .line 204
    iget v1, v7, Lcom/google/a/b/aa;->c:I

    and-int v4, v1, v9

    .line 206
    or-int v1, v6, v4

    aput-object v7, v0, v1

    .line 207
    iget-object v1, v7, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    move-object v2, v8

    move-object v10, v1

    move-object v1, v7

    move-object v7, v10

    :goto_1
    if-eqz v7, :cond_3

    .line 208
    iget v3, v7, Lcom/google/a/b/aa;->c:I

    and-int/2addr v3, v9

    .line 209
    if-eq v3, v4, :cond_5

    .line 210
    if-nez v2, :cond_2

    .line 211
    or-int v2, v6, v3

    aput-object v7, v0, v2

    :goto_2
    move v2, v3

    .line 207
    :goto_3
    iget-object v3, v7, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    move v4, v2

    move-object v2, v1

    move-object v1, v7

    move-object v7, v3

    goto :goto_1

    .line 213
    :cond_2
    iput-object v7, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    goto :goto_2

    .line 219
    :cond_3
    if-eqz v2, :cond_4

    .line 220
    iput-object v8, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    .line 195
    :cond_4
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_0

    :cond_5
    move-object v1, v2

    move v2, v4

    goto :goto_3
.end method

.method static synthetic b(Lcom/google/a/b/v;)I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/google/a/b/v;->d:I

    return v0
.end method

.method private static b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 498
    sget v1, Lcom/google/a/b/v;->i:I

    .line 499
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 500
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/2addr v1, v2

    .line 501
    add-int/2addr v1, v1

    shl-int/lit8 v1, v1, 0xa

    .line 502
    ushr-int/lit8 v2, v1, 0x6

    xor-int/2addr v1, v2

    .line 499
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 509
    :cond_0
    ushr-int/lit8 v0, v1, 0x14

    ushr-int/lit8 v2, v1, 0xc

    xor-int/2addr v0, v2

    xor-int/2addr v0, v1

    .line 510
    ushr-int/lit8 v1, v0, 0x7

    xor-int/2addr v1, v0

    ushr-int/lit8 v0, v0, 0x4

    xor-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;)TV;"
        }
    .end annotation

    .prologue
    .line 131
    if-nez p1, :cond_0

    .line 132
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "key == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    invoke-static {p1}, Lcom/google/a/b/v;->b(Ljava/lang/String;)I

    move-result v3

    .line 136
    iget-object v1, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 137
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v3

    .line 138
    aget-object v1, v1, v0

    :goto_0
    if-eqz v1, :cond_2

    .line 139
    iget v2, v1, Lcom/google/a/b/aa;->c:I

    if-ne v2, v3, :cond_1

    iget-object v2, v1, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 140
    iget-object v0, v1, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 141
    iput-object p2, v1, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 152
    :goto_1
    return-object v0

    .line 138
    :cond_1
    iget-object v1, v1, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    goto :goto_0

    .line 147
    :cond_2
    iget v1, p0, Lcom/google/a/b/v;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/a/b/v;->d:I

    iget v2, p0, Lcom/google/a/b/v;->e:I

    if-le v1, v2, :cond_3

    .line 148
    invoke-direct {p0}, Lcom/google/a/b/v;->a()[Lcom/google/a/b/aa;

    move-result-object v0

    .line 149
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v3

    move v7, v0

    .line 1156
    :goto_2
    iget-object v5, p0, Lcom/google/a/b/v;->a:Lcom/google/a/b/aa;

    .line 1159
    iget-object v6, v5, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    .line 1160
    new-instance v0, Lcom/google/a/b/aa;

    iget-object v1, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    aget-object v4, v1, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/a/b/aa;-><init>(Ljava/lang/String;Ljava/lang/Object;ILcom/google/a/b/aa;Lcom/google/a/b/aa;Lcom/google/a/b/aa;)V

    .line 1162
    iget-object v1, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    iput-object v0, v5, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object v0, v6, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    aput-object v0, v1, v7

    .line 152
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    move v7, v0

    goto :goto_2
.end method

.method public final clear()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 256
    iget v0, p0, Lcom/google/a/b/v;->d:I

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/a/b/v;->d:I

    .line 262
    :cond_0
    iget-object v2, p0, Lcom/google/a/b/v;->a:Lcom/google/a/b/aa;

    .line 263
    iget-object v0, v2, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    :goto_0
    if-eq v0, v2, :cond_1

    .line 264
    iget-object v1, v0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 265
    iput-object v3, v0, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object v3, v0, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    move-object v0, v1

    .line 267
    goto :goto_0

    .line 269
    :cond_1
    iput-object v2, v2, Lcom/google/a/b/aa;->f:Lcom/google/a/b/aa;

    iput-object v2, v2, Lcom/google/a/b/aa;->e:Lcom/google/a/b/aa;

    .line 270
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 102
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/a/b/v;->a(Ljava/lang/String;)Lcom/google/a/b/aa;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "TV;>;>;"
        }
    .end annotation

    .prologue
    .line 283
    iget-object v0, p0, Lcom/google/a/b/v;->g:Ljava/util/Set;

    .line 284
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/a/b/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/a/b/w;-><init>(Lcom/google/a/b/v;B)V

    iput-object v0, p0, Lcom/google/a/b/v;->g:Ljava/util/Set;

    goto :goto_0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 106
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 107
    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/a/b/v;->a(Ljava/lang/String;)Lcom/google/a/b/aa;

    move-result-object v1

    .line 108
    if-eqz v1, :cond_0

    iget-object v0, v1, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    .line 110
    :cond_0
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 273
    iget-object v0, p0, Lcom/google/a/b/v;->f:Ljava/util/Set;

    .line 274
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/a/b/y;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/a/b/y;-><init>(Lcom/google/a/b/v;B)V

    iput-object v0, p0, Lcom/google/a/b/v;->f:Ljava/util/Set;

    goto :goto_0
.end method

.method public final synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/google/a/b/v;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 227
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 246
    :goto_0
    return-object v0

    :cond_1
    move-object v0, p1

    .line 230
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/a/b/v;->b(Ljava/lang/String;)I

    move-result v3

    .line 231
    iget-object v4, p0, Lcom/google/a/b/v;->c:[Lcom/google/a/b/aa;

    .line 232
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    and-int v5, v3, v0

    .line 233
    aget-object v2, v4, v5

    move-object v0, v1

    .line 234
    :goto_1
    if-eqz v2, :cond_4

    .line 235
    iget v6, v2, Lcom/google/a/b/aa;->c:I

    if-ne v6, v3, :cond_3

    iget-object v6, v2, Lcom/google/a/b/aa;->a:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 236
    if-nez v0, :cond_2

    .line 237
    iget-object v0, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    aput-object v0, v4, v5

    .line 241
    :goto_2
    iget v0, p0, Lcom/google/a/b/v;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/a/b/v;->d:I

    .line 242
    invoke-static {v2}, Lcom/google/a/b/v;->a(Lcom/google/a/b/aa;)V

    .line 243
    iget-object v0, v2, Lcom/google/a/b/aa;->b:Ljava/lang/Object;

    goto :goto_0

    .line 239
    :cond_2
    iget-object v1, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    iput-object v1, v0, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    goto :goto_2

    .line 234
    :cond_3
    iget-object v0, v2, Lcom/google/a/b/aa;->d:Lcom/google/a/b/aa;

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 246
    goto :goto_0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 98
    iget v0, p0, Lcom/google/a/b/v;->d:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 278
    iget-object v0, p0, Lcom/google/a/b/v;->h:Ljava/util/Collection;

    .line 279
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/a/b/ac;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/a/b/ac;-><init>(Lcom/google/a/b/v;B)V

    iput-object v0, p0, Lcom/google/a/b/v;->h:Ljava/util/Collection;

    goto :goto_0
.end method
