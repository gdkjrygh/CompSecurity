.class public Lcom/roidapp/videolib/core/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static b:I

.field private static final e:Ljava/lang/String;

.field private static f:[B

.field private static final i:[I


# instance fields
.field c:J

.field public d:Ljava/lang/Object;

.field private g:[Lcom/roidapp/videolib/core/g;

.field private h:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 11
    const-class v0, Lcom/roidapp/videolib/core/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/videolib/core/e;->e:Ljava/lang/String;

    .line 15
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/videolib/core/e;->f:[B

    .line 25
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "effect_onelove.mp4"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "mask_onelove.mp4"

    aput-object v2, v0, v1

    const-string v1, "effect_christmas.mp4"

    aput-object v1, v0, v3

    const/4 v1, 0x3

    const-string v2, "mask_christmas.mp4"

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/videolib/core/e;->a:[Ljava/lang/String;

    .line 70
    const/4 v0, 0x6

    sput v0, Lcom/roidapp/videolib/core/e;->b:I

    .line 82
    new-array v0, v3, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/roidapp/videolib/core/e;->i:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x280
        0x280
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roidapp/videolib/core/e;->c:J

    .line 73
    iput-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    .line 74
    iput-object v2, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    .line 76
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/core/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(I)I
    .locals 1

    .prologue
    .line 227
    sget v0, Ljp/co/cyberagent/android/a/a;->K:I

    add-int/lit8 v0, v0, -0x1

    if-ne p0, v0, :cond_0

    .line 228
    sget v0, Lcom/roidapp/videolib/c;->a:I

    .line 234
    :goto_0
    return v0

    .line 229
    :cond_0
    sget v0, Ljp/co/cyberagent/android/a/a;->J:I

    add-int/lit8 v0, v0, -0x1

    if-ne p0, v0, :cond_1

    .line 230
    sget v0, Lcom/roidapp/videolib/c;->j:I

    goto :goto_0

    .line 231
    :cond_1
    sget v0, Ljp/co/cyberagent/android/a/a;->w:I

    add-int/lit8 v0, v0, -0x1

    if-ne p0, v0, :cond_2

    .line 232
    sget v0, Lcom/roidapp/videolib/d;->u:I

    goto :goto_0

    .line 234
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/videolib/b/u;)Z
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a()[I
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/roidapp/videolib/core/e;->i:[I

    return-object v0
.end method

.method public static b(Lcom/roidapp/videolib/b/u;)[Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 33
    const/4 v0, 0x0

    .line 34
    sget-object v1, Lcom/roidapp/videolib/core/f;->a:[I

    invoke-virtual {p0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 50
    :goto_0
    return-object v0

    .line 36
    :pswitch_0
    new-array v0, v5, [Ljava/lang/String;

    .line 37
    const-string v1, "effect_onelove.mp4"

    aput-object v1, v0, v3

    .line 38
    const-string v1, "mask_onelove.mp4"

    aput-object v1, v0, v4

    goto :goto_0

    .line 41
    :pswitch_1
    new-array v0, v5, [Ljava/lang/String;

    .line 42
    const-string v1, "effect_christmas.mp4"

    aput-object v1, v0, v3

    .line 43
    const-string v1, "mask_christmas.mp4"

    aput-object v1, v0, v4

    goto :goto_0

    .line 34
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static c(Lcom/roidapp/videolib/b/u;)I
    .locals 2

    .prologue
    .line 60
    sget-object v0, Lcom/roidapp/videolib/core/f;->a:[I

    invoke-virtual {p0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 66
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 62
    :pswitch_0
    const/4 v0, 0x6

    goto :goto_0

    .line 64
    :pswitch_1
    const/4 v0, 0x3

    goto :goto_0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private f()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 109
    .line 111
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    if-eqz v1, :cond_2

    .line 112
    iget-object v4, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    array-length v5, v4

    move v2, v0

    move v1, v0

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v1, v4, v2

    .line 113
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/roidapp/videolib/core/g;->b()Lcom/a/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/a/a/a;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 114
    :cond_0
    const/4 v3, 0x1

    .line 112
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v3

    goto :goto_0

    :cond_1
    move v0, v1

    .line 122
    :cond_2
    return v0
.end method


# virtual methods
.method public final a([Ljava/nio/ByteBuffer;J)I
    .locals 8

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 156
    iget-object v3, p0, Lcom/roidapp/videolib/core/e;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 157
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    if-eqz v2, :cond_0

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    array-length v2, v2

    array-length v4, p1

    if-eq v2, v4, :cond_1

    .line 158
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v1

    .line 209
    :goto_0
    return v0

    .line 164
    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/g;->b()Lcom/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/a/a/a;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    .line 165
    cmp-long v2, v4, p2

    if-gtz v2, :cond_4

    .line 168
    invoke-direct {p0}, Lcom/roidapp/videolib/core/e;->f()Z

    move-result v2

    if-nez v2, :cond_4

    move v2, v0

    .line 171
    :goto_1
    iget-object v4, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    array-length v4, v4

    if-ge v2, v4, :cond_1

    .line 172
    iget-object v4, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    aget-object v4, v4, v2

    invoke-virtual {v4}, Lcom/roidapp/videolib/core/g;->b()Lcom/a/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/a/a/a;->d()Z

    move-result v4

    if-nez v4, :cond_3

    aget-object v4, p1, v2

    if-eqz v4, :cond_3

    .line 176
    sget-object v4, Lcom/roidapp/videolib/core/e;->f:[B

    if-nez v4, :cond_2

    .line 177
    const/high16 v4, 0x190000

    new-array v4, v4, [B

    sput-object v4, Lcom/roidapp/videolib/core/e;->f:[B

    .line 180
    :cond_2
    iget-object v4, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    aget-object v4, v4, v2

    sget-object v5, Lcom/roidapp/videolib/core/e;->f:[B

    invoke-virtual {v4, v5}, Lcom/roidapp/videolib/core/g;->a([B)I

    move-result v4

    .line 181
    if-nez v4, :cond_3

    .line 182
    aget-object v4, p1, v2

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 183
    aget-object v4, p1, v2

    sget-object v5, Lcom/roidapp/videolib/core/e;->f:[B

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 184
    aget-object v4, p1, v2

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 171
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 203
    :cond_4
    iput-wide v4, p0, Lcom/roidapp/videolib/core/e;->c:J
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    :try_start_2
    monitor-exit v3

    goto :goto_0

    .line 211
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 207
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 209
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move v0, v1

    goto :goto_0
.end method

.method public final a([Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    .line 80
    return-void
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 90
    .line 92
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    array-length v1, v1

    new-array v1, v1, [Lcom/roidapp/videolib/core/g;

    iput-object v1, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    move v1, v0

    .line 93
    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 94
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    new-instance v2, Lcom/roidapp/videolib/core/g;

    iget-object v3, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-direct {v2, v3}, Lcom/roidapp/videolib/core/g;-><init>(Ljava/lang/String;)V

    aput-object v2, v1, v0

    .line 95
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/videolib/core/g;->a()I

    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 100
    :cond_0
    return v1

    .line 93
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 105
    iget-wide v0, p0, Lcom/roidapp/videolib/core/e;->c:J

    return-wide v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 127
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 128
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/videolib/core/e;->f()Z

    move-result v0

    .line 129
    monitor-exit v1

    .line 131
    return v0

    .line 129
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()V
    .locals 4

    .prologue
    .line 136
    iget-object v1, p0, Lcom/roidapp/videolib/core/e;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    if-eqz v0, :cond_2

    .line 138
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 139
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    .line 140
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/roidapp/videolib/core/g;->c()V

    .line 141
    :cond_0
    iget-object v2, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    const/4 v3, 0x0

    aput-object v3, v2, v0

    .line 138
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 144
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/e;->g:[Lcom/roidapp/videolib/core/g;

    .line 147
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/core/e;->h:[Ljava/lang/String;

    .line 149
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/roidapp/videolib/core/e;->c:J

    .line 151
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 152
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
