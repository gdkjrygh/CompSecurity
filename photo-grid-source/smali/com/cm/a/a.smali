.class public final Lcom/cm/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/cm/a/a;

.field static b:[Ljava/lang/Object;

.field static c:I

.field static d:[Ljava/lang/Object;

.field static e:I

.field static final f:[I


# instance fields
.field g:[I

.field h:[Ljava/lang/Object;

.field i:I

.field j:Lcom/cm/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/a/d",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 65
    new-instance v0, Lcom/cm/a/a;

    invoke-direct {v0, v1}, Lcom/cm/a/a;-><init>(B)V

    sput-object v0, Lcom/cm/a/a;->a:Lcom/cm/a/a;

    .line 81
    new-array v0, v1, [I

    sput-object v0, Lcom/cm/a/a;->f:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    sget-object v0, Lcom/cm/a/c;->b:[I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 240
    sget-object v0, Lcom/cm/a/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 241
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 242
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 258
    sget-object v0, Lcom/cm/a/a;->f:[I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 259
    sget-object v0, Lcom/cm/a/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 260
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 261
    return-void
.end method

.method private static a([I[Ljava/lang/Object;I)V
    .locals 4

    .prologue
    const/16 v2, 0xa

    const/4 v3, 0x2

    .line 203
    array-length v0, p0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 204
    const-class v1, Lcom/cm/a/a;

    monitor-enter v1

    .line 205
    :try_start_0
    sget v0, Lcom/cm/a/a;->e:I

    if-ge v0, v2, :cond_1

    .line 206
    const/4 v0, 0x0

    sget-object v2, Lcom/cm/a/a;->d:[Ljava/lang/Object;

    aput-object v2, p1, v0

    .line 207
    const/4 v0, 0x1

    aput-object p0, p1, v0

    .line 208
    shl-int/lit8 v0, p2, 0x1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-lt v0, v3, :cond_0

    .line 209
    const/4 v2, 0x0

    aput-object v2, p1, v0

    .line 208
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 211
    :cond_0
    sput-object p1, Lcom/cm/a/a;->d:[Ljava/lang/Object;

    .line 212
    sget v0, Lcom/cm/a/a;->e:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/cm/a/a;->e:I

    .line 216
    :cond_1
    monitor-exit v1

    .line 232
    :cond_2
    :goto_1
    return-void

    .line 216
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 217
    :cond_3
    array-length v0, p0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 218
    const-class v1, Lcom/cm/a/a;

    monitor-enter v1

    .line 219
    :try_start_1
    sget v0, Lcom/cm/a/a;->c:I

    if-ge v0, v2, :cond_5

    .line 220
    const/4 v0, 0x0

    sget-object v2, Lcom/cm/a/a;->b:[Ljava/lang/Object;

    aput-object v2, p1, v0

    .line 221
    const/4 v0, 0x1

    aput-object p0, p1, v0

    .line 222
    shl-int/lit8 v0, p2, 0x1

    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-lt v0, v3, :cond_4

    .line 223
    const/4 v2, 0x0

    aput-object v2, p1, v0

    .line 222
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 225
    :cond_4
    sput-object p1, Lcom/cm/a/a;->b:[Ljava/lang/Object;

    .line 226
    sget v0, Lcom/cm/a/a;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/cm/a/a;->c:I

    .line 230
    :cond_5
    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0
.end method

.method private b()Lcom/cm/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/cm/a/d",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 698
    iget-object v0, p0, Lcom/cm/a/a;->j:Lcom/cm/a/d;

    if-nez v0, :cond_0

    .line 699
    new-instance v0, Lcom/cm/a/b;

    invoke-direct {v0, p0}, Lcom/cm/a/b;-><init>(Lcom/cm/a/a;)V

    iput-object v0, p0, Lcom/cm/a/a;->j:Lcom/cm/a/d;

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/cm/a/a;->j:Lcom/cm/a/d;

    return-object v0
.end method

.method private b(I)V
    .locals 5

    .prologue
    .line 165
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    sget-object v1, Lcom/cm/a/a;->f:[I

    if-ne v0, v1, :cond_0

    .line 166
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "ArrayMap is immutable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_0
    const/16 v0, 0x8

    if-ne p1, v0, :cond_3

    .line 169
    const-class v1, Lcom/cm/a/a;

    monitor-enter v1

    .line 170
    :try_start_0
    sget-object v0, Lcom/cm/a/a;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 171
    sget-object v2, Lcom/cm/a/a;->d:[Ljava/lang/Object;

    .line 172
    iput-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 173
    const/4 v0, 0x0

    aget-object v0, v2, v0

    check-cast v0, [Ljava/lang/Object;

    sput-object v0, Lcom/cm/a/a;->d:[Ljava/lang/Object;

    .line 174
    const/4 v0, 0x1

    aget-object v0, v2, v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 175
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    aput-object v4, v2, v0

    .line 176
    sget v0, Lcom/cm/a/a;->e:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/cm/a/a;->e:I

    .line 179
    monitor-exit v1

    .line 200
    :goto_0
    return-void

    .line 181
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    :cond_2
    :goto_1
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 199
    shl-int/lit8 v0, p1, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    goto :goto_0

    .line 181
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 182
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 183
    const-class v1, Lcom/cm/a/a;

    monitor-enter v1

    .line 184
    :try_start_2
    sget-object v0, Lcom/cm/a/a;->b:[Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 185
    sget-object v2, Lcom/cm/a/a;->b:[Ljava/lang/Object;

    .line 186
    iput-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 187
    const/4 v0, 0x0

    aget-object v0, v2, v0

    check-cast v0, [Ljava/lang/Object;

    sput-object v0, Lcom/cm/a/a;->b:[Ljava/lang/Object;

    .line 188
    const/4 v0, 0x1

    aget-object v0, v2, v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 189
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    aput-object v4, v2, v0

    .line 190
    sget v0, Lcom/cm/a/a;->c:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/cm/a/a;->c:I

    .line 193
    monitor-exit v1

    goto :goto_0

    .line 195
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method

.method private c(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    .prologue
    .line 378
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, p1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method private d(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .line 387
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, p1, 0x1

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method


# virtual methods
.method final a()I
    .locals 5

    .prologue
    .line 127
    iget v2, p0, Lcom/cm/a/a;->i:I

    .line 130
    if-nez v2, :cond_1

    .line 131
    const/4 v0, -0x1

    .line 161
    :cond_0
    :goto_0
    return v0

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/cm/a/c;->a([III)I

    move-result v0

    .line 137
    if-ltz v0, :cond_0

    .line 142
    iget-object v1, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    aget-object v1, v1, v3

    if-eqz v1, :cond_0

    .line 148
    add-int/lit8 v1, v0, 0x1

    :goto_1
    if-ge v1, v2, :cond_3

    iget-object v3, p0, Lcom/cm/a/a;->g:[I

    aget v3, v3, v1

    if-nez v3, :cond_3

    .line 149
    iget-object v3, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v4, v1, 0x1

    aget-object v3, v3, v4

    if-nez v3, :cond_2

    move v0, v1

    goto :goto_0

    .line 148
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 153
    :cond_3
    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-ltz v0, :cond_4

    iget-object v2, p0, Lcom/cm/a/a;->g:[I

    aget v2, v2, v0

    if-nez v2, :cond_4

    .line 154
    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    aget-object v2, v2, v3

    if-eqz v2, :cond_0

    .line 153
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 161
    :cond_4
    xor-int/lit8 v0, v1, -0x1

    goto :goto_0
.end method

.method final a(Ljava/lang/Object;)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 330
    iget v1, p0, Lcom/cm/a/a;->i:I

    mul-int/lit8 v1, v1, 0x2

    .line 331
    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 332
    if-nez p1, :cond_2

    .line 333
    :goto_0
    if-ge v0, v1, :cond_3

    .line 334
    aget-object v3, v2, v0

    if-nez v3, :cond_0

    .line 335
    shr-int/lit8 v0, v0, 0x1

    .line 345
    :goto_1
    return v0

    .line 333
    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 339
    :cond_1
    add-int/lit8 v0, v0, 0x2

    :cond_2
    if-ge v0, v1, :cond_3

    .line 340
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 341
    shr-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 345
    :cond_3
    const/4 v0, -0x1

    goto :goto_1
.end method

.method final a(Ljava/lang/Object;I)I
    .locals 5

    .prologue
    .line 89
    iget v2, p0, Lcom/cm/a/a;->i:I

    .line 92
    if-nez v2, :cond_1

    .line 93
    const/4 v0, -0x1

    .line 123
    :cond_0
    :goto_0
    return v0

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    invoke-static {v0, v2, p2}, Lcom/cm/a/c;->a([III)I

    move-result v0

    .line 99
    if-ltz v0, :cond_0

    .line 104
    iget-object v1, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    aget-object v1, v1, v3

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 110
    add-int/lit8 v1, v0, 0x1

    :goto_1
    if-ge v1, v2, :cond_3

    iget-object v3, p0, Lcom/cm/a/a;->g:[I

    aget v3, v3, v1

    if-ne v3, p2, :cond_3

    .line 111
    iget-object v3, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v4, v1, 0x1

    aget-object v3, v3, v4

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    goto :goto_0

    .line 110
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 115
    :cond_3
    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-ltz v0, :cond_4

    iget-object v2, p0, Lcom/cm/a/a;->g:[I

    aget v2, v2, v0

    if-ne v2, p2, :cond_4

    .line 116
    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    aget-object v2, v2, v3

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 115
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 123
    :cond_4
    xor-int/lit8 v0, v1, -0x1

    goto :goto_0
.end method

.method public final a(I)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/16 v0, 0x8

    const/4 v5, 0x0

    .line 540
    iget-object v1, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v2, p1, 0x1

    add-int/lit8 v2, v2, 0x1

    aget-object v1, v1, v2

    .line 541
    iget v2, p0, Lcom/cm/a/a;->i:I

    const/4 v3, 0x1

    if-gt v2, v3, :cond_1

    .line 544
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    iget v3, p0, Lcom/cm/a/a;->i:I

    invoke-static {v0, v2, v3}, Lcom/cm/a/a;->a([I[Ljava/lang/Object;I)V

    .line 545
    sget-object v0, Lcom/cm/a/c;->b:[I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 546
    sget-object v0, Lcom/cm/a/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 547
    iput v5, p0, Lcom/cm/a/a;->i:I

    .line 587
    :cond_0
    :goto_0
    return-object v1

    .line 549
    :cond_1
    iget-object v2, p0, Lcom/cm/a/a;->g:[I

    array-length v2, v2

    if-le v2, v0, :cond_4

    iget v2, p0, Lcom/cm/a/a;->i:I

    iget-object v3, p0, Lcom/cm/a/a;->g:[I

    array-length v3, v3

    div-int/lit8 v3, v3, 0x3

    if-ge v2, v3, :cond_4

    .line 553
    iget v2, p0, Lcom/cm/a/a;->i:I

    if-le v2, v0, :cond_2

    iget v0, p0, Lcom/cm/a/a;->i:I

    iget v2, p0, Lcom/cm/a/a;->i:I

    shr-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 557
    :cond_2
    iget-object v2, p0, Lcom/cm/a/a;->g:[I

    .line 558
    iget-object v3, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 559
    invoke-direct {p0, v0}, Lcom/cm/a/a;->b(I)V

    .line 561
    iget v0, p0, Lcom/cm/a/a;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 562
    if-lez p1, :cond_3

    .line 564
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    invoke-static {v2, v5, v0, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 565
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v4, p1, 0x1

    invoke-static {v3, v5, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 567
    :cond_3
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-ge p1, v0, :cond_0

    .line 570
    add-int/lit8 v0, p1, 0x1

    iget-object v4, p0, Lcom/cm/a/a;->g:[I

    iget v5, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v5, p1

    invoke-static {v2, v0, v4, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 571
    add-int/lit8 v0, p1, 0x1

    shl-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v4, p1, 0x1

    iget v5, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v5, p1

    shl-int/lit8 v5, v5, 0x1

    invoke-static {v3, v0, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 575
    :cond_4
    iget v0, p0, Lcom/cm/a/a;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 576
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-ge p1, v0, :cond_5

    .line 579
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/cm/a/a;->g:[I

    iget v4, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v4, p1

    invoke-static {v0, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 580
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    shl-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v4, p1, 0x1

    iget v5, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v5, p1

    shl-int/lit8 v5, v5, 0x1

    invoke-static {v0, v2, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 583
    :cond_5
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    iget v2, p0, Lcom/cm/a/a;->i:I

    shl-int/lit8 v2, v2, 0x1

    aput-object v6, v0, v2

    .line 584
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    iget v2, p0, Lcom/cm/a/a;->i:I

    shl-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    aput-object v6, v0, v2

    goto/16 :goto_0
.end method

.method public final clear()V
    .locals 3

    .prologue
    .line 278
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-lez v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    iget-object v1, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    iget v2, p0, Lcom/cm/a/a;->i:I

    invoke-static {v0, v1, v2}, Lcom/cm/a/a;->a([I[Ljava/lang/Object;I)V

    .line 280
    sget-object v0, Lcom/cm/a/c;->b:[I

    iput-object v0, p0, Lcom/cm/a/a;->g:[I

    .line 281
    sget-object v0, Lcom/cm/a/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 282
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 284
    :cond_0
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 326
    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/cm/a/a;->a()I

    move-result v2

    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {p0, p1, v2}, Lcom/cm/a/a;->a(Ljava/lang/Object;I)I

    move-result v2

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 357
    invoke-virtual {p0, p1}, Lcom/cm/a/a;->a(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

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
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 805
    invoke-direct {p0}, Lcom/cm/a/a;->b()Lcom/cm/a/d;

    move-result-object v0

    .line 1529
    iget-object v1, v0, Lcom/cm/a/d;->b:Lcom/cm/a/f;

    if-nez v1, :cond_0

    .line 1530
    new-instance v1, Lcom/cm/a/f;

    invoke-direct {v1, v0}, Lcom/cm/a/f;-><init>(Lcom/cm/a/d;)V

    iput-object v1, v0, Lcom/cm/a/d;->b:Lcom/cm/a/f;

    .line 1532
    :cond_0
    iget-object v0, v0, Lcom/cm/a/d;->b:Lcom/cm/a/f;

    .line 805
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 608
    if-ne p0, p1, :cond_1

    .line 637
    :cond_0
    :goto_0
    return v0

    .line 611
    :cond_1
    instance-of v2, p1, Ljava/util/Map;

    if-eqz v2, :cond_6

    .line 612
    check-cast p1, Ljava/util/Map;

    .line 613
    invoke-virtual {p0}, Lcom/cm/a/a;->size()I

    move-result v2

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v3

    if-eq v2, v3, :cond_2

    move v0, v1

    .line 614
    goto :goto_0

    :cond_2
    move v2, v1

    .line 618
    :goto_1
    :try_start_0
    iget v3, p0, Lcom/cm/a/a;->i:I

    if-ge v2, v3, :cond_0

    .line 619
    invoke-direct {p0, v2}, Lcom/cm/a/a;->c(I)Ljava/lang/Object;

    move-result-object v3

    .line 620
    invoke-direct {p0, v2}, Lcom/cm/a/a;->d(I)Ljava/lang/Object;

    move-result-object v4

    .line 621
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 622
    if-nez v4, :cond_4

    .line 623
    if-nez v5, :cond_3

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_3
    move v0, v1

    .line 624
    goto :goto_0

    .line 626
    :cond_4
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    if-nez v3, :cond_5

    move v0, v1

    .line 627
    goto :goto_0

    .line 618
    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 631
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 633
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    :cond_6
    move v0, v1

    .line 637
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
    .line 368
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/cm/a/a;->a()I

    move-result v0

    .line 369
    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    :goto_1
    return-object v0

    .line 368
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/cm/a/a;->a(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0

    .line 369
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final hashCode()I
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 645
    iget-object v5, p0, Lcom/cm/a/a;->g:[I

    .line 646
    iget-object v6, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 648
    const/4 v0, 0x1

    iget v7, p0, Lcom/cm/a/a;->i:I

    move v2, v0

    move v3, v1

    move v4, v1

    :goto_0
    if-ge v3, v7, :cond_1

    .line 649
    aget-object v0, v6, v2

    .line 650
    aget v8, v5, v3

    if-nez v0, :cond_0

    move v0, v1

    :goto_1
    xor-int/2addr v0, v8

    add-int/2addr v4, v0

    .line 648
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v0, v2, 0x2

    move v2, v0

    goto :goto_0

    .line 650
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    .line 652
    :cond_1
    return v4
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 408
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 817
    invoke-direct {p0}, Lcom/cm/a/a;->b()Lcom/cm/a/d;

    move-result-object v0

    .line 1536
    iget-object v1, v0, Lcom/cm/a/d;->c:Lcom/cm/a/g;

    if-nez v1, :cond_0

    .line 1537
    new-instance v1, Lcom/cm/a/g;

    invoke-direct {v1, v0}, Lcom/cm/a/g;-><init>(Lcom/cm/a/d;)V

    iput-object v1, v0, Lcom/cm/a/d;->c:Lcom/cm/a/g;

    .line 1539
    :cond_0
    iget-object v0, v0, Lcom/cm/a/d;->c:Lcom/cm/a/g;

    .line 817
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    const/16 v0, 0x8

    const/4 v1, 0x4

    const/4 v4, 0x0

    .line 423
    if-nez p1, :cond_0

    .line 425
    invoke-virtual {p0}, Lcom/cm/a/a;->a()I

    move-result v2

    move v3, v4

    .line 430
    :goto_0
    if-ltz v2, :cond_1

    .line 431
    shl-int/lit8 v0, v2, 0x1

    add-int/lit8 v1, v0, 0x1

    .line 432
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    aget-object v0, v0, v1

    .line 433
    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    aput-object p2, v2, v1

    .line 468
    :goto_1
    return-object v0

    .line 427
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 428
    invoke-virtual {p0, p1, v3}, Lcom/cm/a/a;->a(Ljava/lang/Object;I)I

    move-result v2

    goto :goto_0

    .line 437
    :cond_1
    xor-int/lit8 v2, v2, -0x1

    .line 438
    iget v5, p0, Lcom/cm/a/a;->i:I

    iget-object v6, p0, Lcom/cm/a/a;->g:[I

    array-length v6, v6

    if-lt v5, v6, :cond_4

    .line 439
    iget v5, p0, Lcom/cm/a/a;->i:I

    if-lt v5, v0, :cond_6

    iget v0, p0, Lcom/cm/a/a;->i:I

    iget v1, p0, Lcom/cm/a/a;->i:I

    shr-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 444
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/cm/a/a;->g:[I

    .line 445
    iget-object v5, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 446
    invoke-direct {p0, v0}, Lcom/cm/a/a;->b(I)V

    .line 448
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    array-length v0, v0

    if-lez v0, :cond_3

    .line 450
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    array-length v6, v1

    invoke-static {v1, v4, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 451
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    array-length v6, v5

    invoke-static {v5, v4, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 454
    :cond_3
    iget v0, p0, Lcom/cm/a/a;->i:I

    invoke-static {v1, v5, v0}, Lcom/cm/a/a;->a([I[Ljava/lang/Object;I)V

    .line 457
    :cond_4
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-ge v2, v0, :cond_5

    .line 460
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    iget-object v1, p0, Lcom/cm/a/a;->g:[I

    add-int/lit8 v4, v2, 0x1

    iget v5, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v5, v2

    invoke-static {v0, v2, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 461
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, v2, 0x1

    iget-object v4, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    add-int/lit8 v5, v2, 0x1

    shl-int/lit8 v5, v5, 0x1

    iget v6, p0, Lcom/cm/a/a;->i:I

    sub-int/2addr v6, v2

    shl-int/lit8 v6, v6, 0x1

    invoke-static {v0, v1, v4, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 464
    :cond_5
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    aput v3, v0, v2

    .line 465
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, v2, 0x1

    aput-object p1, v0, v1

    .line 466
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    aput-object p2, v0, v1

    .line 467
    iget v0, p0, Lcom/cm/a/a;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cm/a/a;->i:I

    .line 468
    const/4 v0, 0x0

    goto :goto_1

    .line 439
    :cond_6
    iget v5, p0, Lcom/cm/a/a;->i:I

    if-ge v5, v1, :cond_2

    move v0, v1

    goto :goto_2
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 765
    iget v0, p0, Lcom/cm/a/a;->i:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 1306
    iget-object v1, p0, Lcom/cm/a/a;->g:[I

    array-length v1, v1

    if-ge v1, v0, :cond_1

    .line 1307
    iget-object v1, p0, Lcom/cm/a/a;->g:[I

    .line 1308
    iget-object v2, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    .line 1309
    invoke-direct {p0, v0}, Lcom/cm/a/a;->b(I)V

    .line 1310
    iget v0, p0, Lcom/cm/a/a;->i:I

    if-lez v0, :cond_0

    .line 1311
    iget-object v0, p0, Lcom/cm/a/a;->g:[I

    iget v3, p0, Lcom/cm/a/a;->i:I

    invoke-static {v1, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1312
    iget-object v0, p0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    iget v3, p0, Lcom/cm/a/a;->i:I

    shl-int/lit8 v3, v3, 0x1

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1314
    :cond_0
    iget v0, p0, Lcom/cm/a/a;->i:I

    invoke-static {v1, v2, v0}, Lcom/cm/a/a;->a([I[Ljava/lang/Object;I)V

    .line 766
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 767
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/cm/a/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 769
    :cond_2
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 526
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/cm/a/a;->a()I

    move-result v0

    .line 527
    :goto_0
    if-ltz v0, :cond_1

    .line 528
    invoke-virtual {p0, v0}, Lcom/cm/a/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    .line 531
    :goto_1
    return-object v0

    .line 526
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/cm/a/a;->a(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0

    .line 531
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 595
    iget v0, p0, Lcom/cm/a/a;->i:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 664
    invoke-virtual {p0}, Lcom/cm/a/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 665
    const-string v0, "{}"

    .line 689
    :goto_0
    return-object v0

    .line 668
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/cm/a/a;->i:I

    mul-int/lit8 v0, v0, 0x1c

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 669
    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 670
    const/4 v0, 0x0

    :goto_1
    iget v2, p0, Lcom/cm/a/a;->i:I

    if-ge v0, v2, :cond_4

    .line 671
    if-lez v0, :cond_1

    .line 672
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    :cond_1
    invoke-direct {p0, v0}, Lcom/cm/a/a;->c(I)Ljava/lang/Object;

    move-result-object v2

    .line 675
    if-eq v2, p0, :cond_2

    .line 676
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 680
    :goto_2
    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 681
    invoke-direct {p0, v0}, Lcom/cm/a/a;->d(I)Ljava/lang/Object;

    move-result-object v2

    .line 682
    if-eq v2, p0, :cond_3

    .line 683
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 670
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 678
    :cond_2
    const-string v2, "(this Map)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 685
    :cond_3
    const-string v2, "(this Map)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 688
    :cond_4
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 689
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
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
    .line 829
    invoke-direct {p0}, Lcom/cm/a/a;->b()Lcom/cm/a/d;

    move-result-object v0

    .line 1543
    iget-object v1, v0, Lcom/cm/a/d;->d:Lcom/cm/a/i;

    if-nez v1, :cond_0

    .line 1544
    new-instance v1, Lcom/cm/a/i;

    invoke-direct {v1, v0}, Lcom/cm/a/i;-><init>(Lcom/cm/a/d;)V

    iput-object v1, v0, Lcom/cm/a/d;->d:Lcom/cm/a/i;

    .line 1546
    :cond_0
    iget-object v0, v0, Lcom/cm/a/d;->d:Lcom/cm/a/i;

    .line 829
    return-object v0
.end method
