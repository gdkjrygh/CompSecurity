.class public final Lcom/cleanmaster/base/util/misc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;


# static fields
.field static a:[Ljava/lang/Object;

.field static b:I

.field static c:[Ljava/lang/Object;

.field static d:I


# instance fields
.field e:[I

.field f:[Ljava/lang/Object;

.field g:I

.field h:Lcom/cleanmaster/base/util/misc/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->b:[I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 228
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 229
    const/4 v0, 0x0

    iput v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 230
    return-void
.end method

.method private a()I
    .locals 4

    .prologue
    .line 118
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 121
    if-nez v2, :cond_1

    .line 122
    const/4 v0, -0x1

    .line 152
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/cleanmaster/base/util/misc/c;->a([III)I

    move-result v0

    .line 128
    if-ltz v0, :cond_0

    .line 133
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    .line 139
    add-int/lit8 v1, v0, 0x1

    :goto_1
    if-ge v1, v2, :cond_3

    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    aget v3, v3, v1

    if-nez v3, :cond_3

    .line 140
    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v3, v3, v1

    if-nez v3, :cond_2

    move v0, v1

    goto :goto_0

    .line 139
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 144
    :cond_3
    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-ltz v0, :cond_4

    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    aget v2, v2, v0

    if-nez v2, :cond_4

    .line 145
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 144
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 152
    :cond_4
    xor-int/lit8 v0, v1, -0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/cleanmaster/base/util/misc/a;)I
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/a;->a()I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/cleanmaster/base/util/misc/a;Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/base/util/misc/a;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/Object;I)I
    .locals 4

    .prologue
    .line 80
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 83
    if-nez v2, :cond_1

    .line 84
    const/4 v0, -0x1

    .line 114
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    invoke-static {v0, v2, p2}, Lcom/cleanmaster/base/util/misc/c;->a([III)I

    move-result v0

    .line 90
    if-ltz v0, :cond_0

    .line 95
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 101
    add-int/lit8 v1, v0, 0x1

    :goto_1
    if-ge v1, v2, :cond_3

    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    aget v3, v3, v1

    if-ne v3, p2, :cond_3

    .line 102
    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    goto :goto_0

    .line 101
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 106
    :cond_3
    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-ltz v0, :cond_4

    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    aget v2, v2, v0

    if-ne v2, p2, :cond_4

    .line 107
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 106
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 114
    :cond_4
    xor-int/lit8 v0, v1, -0x1

    goto :goto_0
.end method

.method private static a([I[Ljava/lang/Object;I)V
    .locals 4

    .prologue
    const/16 v2, 0xa

    const/4 v3, 0x2

    .line 191
    array-length v0, p0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 192
    const-class v1, Lcom/cleanmaster/base/util/misc/a;

    monitor-enter v1

    .line 193
    :try_start_0
    sget v0, Lcom/cleanmaster/base/util/misc/a;->d:I

    if-ge v0, v2, :cond_1

    .line 194
    const/4 v0, 0x0

    sget-object v2, Lcom/cleanmaster/base/util/misc/a;->c:[Ljava/lang/Object;

    aput-object v2, p1, v0

    .line 195
    const/4 v0, 0x1

    aput-object p0, p1, v0

    .line 196
    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-lt v0, v3, :cond_0

    .line 197
    const/4 v2, 0x0

    aput-object v2, p1, v0

    .line 196
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 199
    :cond_0
    sput-object p1, Lcom/cleanmaster/base/util/misc/a;->c:[Ljava/lang/Object;

    .line 200
    sget v0, Lcom/cleanmaster/base/util/misc/a;->d:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/cleanmaster/base/util/misc/a;->d:I

    .line 204
    :cond_1
    monitor-exit v1

    .line 220
    :cond_2
    :goto_1
    return-void

    .line 204
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 205
    :cond_3
    array-length v0, p0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 206
    const-class v1, Lcom/cleanmaster/base/util/misc/a;

    monitor-enter v1

    .line 207
    :try_start_1
    sget v0, Lcom/cleanmaster/base/util/misc/a;->b:I

    if-ge v0, v2, :cond_5

    .line 208
    const/4 v0, 0x0

    sget-object v2, Lcom/cleanmaster/base/util/misc/a;->a:[Ljava/lang/Object;

    aput-object v2, p1, v0

    .line 209
    const/4 v0, 0x1

    aput-object p0, p1, v0

    .line 210
    add-int/lit8 v0, p2, -0x1

    :goto_2
    if-lt v0, v3, :cond_4

    .line 211
    const/4 v2, 0x0

    aput-object v2, p1, v0

    .line 210
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 213
    :cond_4
    sput-object p1, Lcom/cleanmaster/base/util/misc/a;->a:[Ljava/lang/Object;

    .line 214
    sget v0, Lcom/cleanmaster/base/util/misc/a;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/cleanmaster/base/util/misc/a;->b:I

    .line 218
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

.method private b()Lcom/cleanmaster/base/util/misc/d;
    .locals 1

    .prologue
    .line 575
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->h:Lcom/cleanmaster/base/util/misc/d;

    if-nez v0, :cond_0

    .line 576
    new-instance v0, Lcom/cleanmaster/base/util/misc/b;

    invoke-direct {v0, p0}, Lcom/cleanmaster/base/util/misc/b;-><init>(Lcom/cleanmaster/base/util/misc/a;)V

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->h:Lcom/cleanmaster/base/util/misc/d;

    .line 623
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->h:Lcom/cleanmaster/base/util/misc/d;

    return-object v0
.end method

.method private d(I)V
    .locals 5

    .prologue
    .line 156
    const/16 v0, 0x8

    if-ne p1, v0, :cond_2

    .line 157
    const-class v1, Lcom/cleanmaster/base/util/misc/a;

    monitor-enter v1

    .line 158
    :try_start_0
    sget-object v0, Lcom/cleanmaster/base/util/misc/a;->c:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 159
    sget-object v2, Lcom/cleanmaster/base/util/misc/a;->c:[Ljava/lang/Object;

    .line 160
    iput-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 161
    const/4 v0, 0x0

    aget-object v0, v2, v0

    check-cast v0, [Ljava/lang/Object;

    sput-object v0, Lcom/cleanmaster/base/util/misc/a;->c:[Ljava/lang/Object;

    .line 162
    const/4 v0, 0x1

    aget-object v0, v2, v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 163
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    aput-object v4, v2, v0

    .line 164
    sget v0, Lcom/cleanmaster/base/util/misc/a;->d:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/cleanmaster/base/util/misc/a;->d:I

    .line 167
    monitor-exit v1

    .line 188
    :goto_0
    return-void

    .line 169
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    :cond_1
    :goto_1
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 187
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    goto :goto_0

    .line 169
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 170
    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 171
    const-class v1, Lcom/cleanmaster/base/util/misc/a;

    monitor-enter v1

    .line 172
    :try_start_2
    sget-object v0, Lcom/cleanmaster/base/util/misc/a;->a:[Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 173
    sget-object v2, Lcom/cleanmaster/base/util/misc/a;->a:[Ljava/lang/Object;

    .line 174
    iput-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 175
    const/4 v0, 0x0

    aget-object v0, v2, v0

    check-cast v0, [Ljava/lang/Object;

    sput-object v0, Lcom/cleanmaster/base/util/misc/a;->a:[Ljava/lang/Object;

    .line 176
    const/4 v0, 0x1

    aget-object v0, v2, v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 177
    const/4 v0, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    aput-object v4, v2, v0

    .line 178
    sget v0, Lcom/cleanmaster/base/util/misc/a;->b:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/cleanmaster/base/util/misc/a;->b:I

    .line 181
    monitor-exit v1

    goto :goto_0

    .line 183
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 274
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v0, v0

    if-ge v0, p1, :cond_1

    .line 275
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 276
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 277
    invoke-direct {p0, p1}, Lcom/cleanmaster/base/util/misc/a;->d(I)V

    .line 278
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-lez v2, :cond_0

    .line 279
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget v3, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 280
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v3, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 282
    :cond_0
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v0, v1, v2}, Lcom/cleanmaster/base/util/misc/a;->a([I[Ljava/lang/Object;I)V

    .line 284
    :cond_1
    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/16 v0, 0x8

    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 327
    if-nez p1, :cond_0

    .line 329
    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/a;->a()I

    move-result v3

    move v4, v2

    .line 334
    :goto_0
    if-ltz v3, :cond_1

    move v0, v2

    .line 368
    :goto_1
    return v0

    .line 331
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    .line 332
    invoke-direct {p0, p1, v4}, Lcom/cleanmaster/base/util/misc/a;->a(Ljava/lang/Object;I)I

    move-result v3

    goto :goto_0

    .line 338
    :cond_1
    xor-int/lit8 v3, v3, -0x1

    .line 339
    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    iget-object v6, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v6, v6

    if-lt v5, v6, :cond_4

    .line 340
    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-lt v5, v0, :cond_6

    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    iget v1, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    shr-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 345
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 346
    iget-object v5, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 347
    invoke-direct {p0, v0}, Lcom/cleanmaster/base/util/misc/a;->d(I)V

    .line 349
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v0, v0

    if-lez v0, :cond_3

    .line 351
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v6, v1

    invoke-static {v1, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 352
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    array-length v6, v5

    invoke-static {v5, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 355
    :cond_3
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v1, v5, v0}, Lcom/cleanmaster/base/util/misc/a;->a([I[Ljava/lang/Object;I)V

    .line 358
    :cond_4
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge v3, v0, :cond_5

    .line 361
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    add-int/lit8 v2, v3, 0x1

    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v5, v3

    invoke-static {v0, v3, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 362
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    add-int/lit8 v2, v3, 0x1

    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v5, v3

    invoke-static {v0, v3, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 365
    :cond_5
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    aput v4, v0, v3

    .line 366
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aput-object p1, v0, v3

    .line 367
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 368
    const/4 v0, 0x1

    goto :goto_1

    .line 340
    :cond_6
    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge v5, v1, :cond_2

    move v0, v1

    goto :goto_2
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 3

    .prologue
    .line 644
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/cleanmaster/base/util/misc/a;->a(I)V

    .line 645
    const/4 v0, 0x0

    .line 646
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 647
    invoke-virtual {p0, v2}, Lcom/cleanmaster/base/util/misc/a;->add(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 648
    goto :goto_0

    .line 649
    :cond_0
    return v0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 303
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 6

    .prologue
    const/16 v0, 0x8

    const/4 v4, 0x0

    .line 413
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v1, v1, p1

    .line 414
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    const/4 v3, 0x1

    if-gt v2, v3, :cond_1

    .line 417
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v3, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v0, v2, v3}, Lcom/cleanmaster/base/util/misc/a;->a([I[Ljava/lang/Object;I)V

    .line 418
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->b:[I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 419
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 420
    iput v4, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 457
    :cond_0
    :goto_0
    return-object v1

    .line 422
    :cond_1
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v2, v2

    if-le v2, v0, :cond_4

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    array-length v3, v3

    div-int/lit8 v3, v3, 0x3

    if-ge v2, v3, :cond_4

    .line 426
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-le v2, v0, :cond_2

    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    shr-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 430
    :cond_2
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 431
    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 432
    invoke-direct {p0, v0}, Lcom/cleanmaster/base/util/misc/a;->d(I)V

    .line 434
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 435
    if-lez p1, :cond_3

    .line 437
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    invoke-static {v2, v4, v0, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 438
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    invoke-static {v3, v4, v0, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 440
    :cond_3
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge p1, v0, :cond_0

    .line 443
    add-int/lit8 v0, p1, 0x1

    iget-object v4, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget v5, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v5, p1

    invoke-static {v2, v0, v4, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 444
    add-int/lit8 v0, p1, 0x1

    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v4, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v4, p1

    invoke-static {v3, v0, v2, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 447
    :cond_4
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 448
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge p1, v0, :cond_5

    .line 451
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget v4, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v4, p1

    invoke-static {v0, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 452
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v4, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    sub-int/2addr v4, p1

    invoke-static {v0, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 454
    :cond_5
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    const/4 v3, 0x0

    aput-object v3, v0, v2

    goto :goto_0
.end method

.method public final clear()V
    .locals 3

    .prologue
    .line 261
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v0, v1, v2}, Lcom/cleanmaster/base/util/misc/a;->a([I[Ljava/lang/Object;I)V

    .line 263
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->b:[I

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 264
    sget-object v0, Lcom/cleanmaster/base/util/misc/c;->d:[Ljava/lang/Object;

    iput-object v0, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    .line 265
    const/4 v0, 0x0

    iput v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    .line 267
    :cond_0
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 294
    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/a;->a()I

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

    invoke-direct {p0, p1, v2}, Lcom/cleanmaster/base/util/misc/a;->a(Ljava/lang/Object;I)I

    move-result v2

    if-gez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .prologue
    .line 633
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 634
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 635
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/base/util/misc/a;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 636
    const/4 v0, 0x0

    .line 639
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 500
    if-ne p0, p1, :cond_1

    .line 523
    :cond_0
    :goto_0
    return v0

    .line 503
    :cond_1
    instance-of v2, p1, Ljava/util/Set;

    if-eqz v2, :cond_4

    .line 504
    check-cast p1, Ljava/util/Set;

    .line 505
    invoke-virtual {p0}, Lcom/cleanmaster/base/util/misc/a;->size()I

    move-result v2

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v2, v3, :cond_2

    move v0, v1

    .line 506
    goto :goto_0

    :cond_2
    move v2, v1

    .line 510
    :goto_1
    :try_start_0
    iget v3, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge v2, v3, :cond_0

    .line 511
    invoke-virtual {p0, v2}, Lcom/cleanmaster/base/util/misc/a;->b(I)Ljava/lang/Object;

    move-result-object v3

    .line 512
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    if-nez v3, :cond_3

    move v0, v1

    .line 513
    goto :goto_0

    .line 510
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 517
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 519
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v1

    .line 523
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 531
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->e:[I

    .line 533
    iget v3, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    move v1, v0

    :goto_0
    if-ge v0, v3, :cond_0

    .line 534
    aget v4, v2, v0

    add-int/2addr v1, v4

    .line 533
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 536
    :cond_0
    return v1
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 311
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .prologue
    .line 628
    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/a;->b()Lcom/cleanmaster/base/util/misc/d;

    move-result-object v0

    .line 1535
    iget-object v1, v0, Lcom/cleanmaster/base/util/misc/d;->b:Lcom/cleanmaster/base/util/misc/f;

    if-nez v1, :cond_0

    .line 1536
    new-instance v1, Lcom/cleanmaster/base/util/misc/f;

    invoke-direct {v1, v0}, Lcom/cleanmaster/base/util/misc/f;-><init>(Lcom/cleanmaster/base/util/misc/d;)V

    iput-object v1, v0, Lcom/cleanmaster/base/util/misc/d;->b:Lcom/cleanmaster/base/util/misc/f;

    .line 1538
    :cond_0
    iget-object v0, v0, Lcom/cleanmaster/base/util/misc/d;->b:Lcom/cleanmaster/base/util/misc/f;

    .line 628
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 399
    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/a;->a()I

    move-result v0

    .line 400
    :goto_0
    if-ltz v0, :cond_1

    .line 401
    invoke-virtual {p0, v0}, Lcom/cleanmaster/base/util/misc/a;->c(I)Ljava/lang/Object;

    .line 402
    const/4 v0, 0x1

    .line 404
    :goto_1
    return v0

    .line 399
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/cleanmaster/base/util/misc/a;->a(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0

    .line 404
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    .prologue
    .line 654
    const/4 v0, 0x0

    .line 655
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 656
    invoke-virtual {p0, v2}, Lcom/cleanmaster/base/util/misc/a;->remove(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 657
    goto :goto_0

    .line 658
    :cond_0
    return v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 4

    .prologue
    .line 663
    const/4 v1, 0x0

    .line 664
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v1

    move v1, v3

    :goto_0
    if-ltz v1, :cond_1

    .line 665
    iget-object v2, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 666
    invoke-virtual {p0, v1}, Lcom/cleanmaster/base/util/misc/a;->c(I)Ljava/lang/Object;

    .line 667
    const/4 v0, 0x1

    .line 664
    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 670
    :cond_1
    return v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 465
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 470
    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    new-array v0, v0, [Ljava/lang/Object;

    .line 471
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 472
    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 477
    array-length v0, p1

    iget v1, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge v0, v1, :cond_1

    .line 478
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    iget v1, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 482
    :goto_0
    iget-object v1, p0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 483
    array-length v1, v0

    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-le v1, v2, :cond_0

    .line 484
    iget v1, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 486
    :cond_0
    return-object v0

    :cond_1
    move-object v0, p1

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 548
    invoke-virtual {p0}, Lcom/cleanmaster/base/util/misc/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 549
    const-string v0, "{}"

    .line 566
    :goto_0
    return-object v0

    .line 552
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    mul-int/lit8 v0, v0, 0xe

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 553
    const/16 v0, 0x7b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 554
    const/4 v0, 0x0

    :goto_1
    iget v2, p0, Lcom/cleanmaster/base/util/misc/a;->g:I

    if-ge v0, v2, :cond_3

    .line 555
    if-lez v0, :cond_1

    .line 556
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    :cond_1
    invoke-virtual {p0, v0}, Lcom/cleanmaster/base/util/misc/a;->b(I)Ljava/lang/Object;

    move-result-object v2

    .line 559
    if-eq v2, p0, :cond_2

    .line 560
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 554
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 562
    :cond_2
    const-string v2, "(this Set)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 565
    :cond_3
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 566
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
