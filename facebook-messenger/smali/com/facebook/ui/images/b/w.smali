.class public Lcom/facebook/ui/images/b/w;
.super Ljava/lang/Object;
.source "ImageFetchOperation.java"


# static fields
.field static final a:[I
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final c:[I


# instance fields
.field private final d:Lcom/facebook/common/time/a;

.field private final e:Landroid/os/Handler;

.field private final f:Lcom/facebook/ui/images/b/h;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Lcom/facebook/ui/images/b/m;

.field private i:I

.field private j:Z

.field private k:J

.field private l:J

.field private m:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:Ljava/lang/Runnable;

.field private p:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x3

    .line 34
    const-class v0, Lcom/facebook/ui/images/b/w;

    sput-object v0, Lcom/facebook/ui/images/b/w;->b:Ljava/lang/Class;

    .line 41
    new-array v0, v4, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/ui/images/b/w;->c:[I

    .line 55
    new-array v0, v4, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/facebook/ui/images/b/w;->a:[I

    .line 58
    sget-object v0, Lcom/facebook/ui/images/b/w;->c:[I

    array-length v0, v0

    sget-object v3, Lcom/facebook/ui/images/b/w;->a:[I

    array-length v3, v3

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 60
    sget-object v0, Lcom/facebook/ui/images/b/w;->c:[I

    array-length v0, v0

    if-ne v0, v4, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 61
    return-void

    :cond_0
    move v0, v2

    .line 58
    goto :goto_0

    :cond_1
    move v1, v2

    .line 60
    goto :goto_1

    .line 41
    :array_0
    .array-data 4
        0x0
        0x9c4
        0x2710
    .end array-data

    .line 55
    :array_1
    .array-data 4
        0x9c4
        0x1388
        0x7530
    .end array-data
.end method

.method constructor <init>(Lcom/facebook/common/time/a;Landroid/os/Handler;Lcom/facebook/ui/images/b/h;Ljava/util/concurrent/Executor;Lcom/facebook/ui/images/b/m;)V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/ui/images/b/w;->i:I

    .line 105
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->d:Lcom/facebook/common/time/a;

    .line 106
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->e:Landroid/os/Handler;

    .line 107
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/h;

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->f:Lcom/facebook/ui/images/b/h;

    .line 108
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->g:Ljava/util/concurrent/Executor;

    .line 109
    invoke-static {p5}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/m;

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    .line 110
    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/c;Lcom/facebook/ui/images/b/m;)V
    .locals 6

    .prologue
    .line 95
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/ui/images/b/w;-><init>(Lcom/facebook/common/time/a;Landroid/os/Handler;Lcom/facebook/ui/images/b/h;Ljava/util/concurrent/Executor;Lcom/facebook/ui/images/b/m;)V

    .line 96
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/w;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    return-object p1
.end method

.method private static a(Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 204
    if-eqz p1, :cond_0

    .line 206
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 217
    :goto_0
    return-object v0

    .line 208
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 209
    sget-object v0, Lcom/facebook/ui/images/b/z;->a:[I

    invoke-virtual {p0}, Lcom/facebook/ui/images/b/r;->c()Lcom/facebook/ui/images/b/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/b/u;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 217
    const-string v0, "unknown"

    goto :goto_0

    .line 208
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 211
    :pswitch_0
    const-string v0, "download not found"

    goto :goto_0

    .line 213
    :pswitch_1
    const-string v0, "download I/O error"

    goto :goto_0

    .line 215
    :pswitch_2
    const-string v0, "prev failure, retry blocked"

    goto :goto_0

    .line 209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(J)V
    .locals 2

    .prologue
    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/w;->n:Z

    .line 142
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 143
    new-instance v0, Lcom/facebook/ui/images/b/x;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/b/x;-><init>(Lcom/facebook/ui/images/b/w;)V

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    .line 149
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_0
    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->d()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/w;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->d()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/w;Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lcom/facebook/ui/images/b/w;->b(Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/ui/images/b/w;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->e()V

    return-void
.end method

.method private b(Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Z
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x3

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 248
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 276
    :cond_0
    :goto_0
    return v0

    .line 251
    :cond_1
    instance-of v2, p2, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_0

    .line 257
    invoke-static {p1, p2}, Lcom/facebook/ui/images/b/w;->a(Lcom/facebook/ui/images/b/r;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    .line 258
    iget-boolean v3, p0, Lcom/facebook/ui/images/b/w;->j:Z

    if-nez v3, :cond_2

    .line 259
    sget-object v3, Lcom/facebook/ui/images/b/w;->b:Ljava/lang/Class;

    const-string v4, "Failed to fetch url: %s; failure reason: %s; total elapsed time: %d ms"

    new-array v5, v7, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v6}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v6

    aput-object v6, v5, v0

    aput-object v2, v5, v1

    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v8

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 264
    :cond_2
    iget v3, p0, Lcom/facebook/ui/images/b/w;->i:I

    if-lt v3, v7, :cond_3

    .line 265
    sget-object v3, Lcom/facebook/ui/images/b/w;->b:Ljava/lang/Class;

    const-string v4, "Failed to fetch url after %d attempts: %s; final failure: %s; total elapsed time: %d ms"

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    iget v6, p0, Lcom/facebook/ui/images/b/w;->i:I

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    iget-object v6, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v6}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v6

    aput-object v6, v5, v1

    aput-object v2, v5, v8

    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 271
    :cond_3
    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->h()J

    move-result-wide v3

    .line 272
    sget-object v5, Lcom/facebook/ui/images/b/w;->b:Ljava/lang/Class;

    const-string v6, "Got error: %s; delaying %d ms before trying again to download url: %s"

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v7, v1

    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v0

    aput-object v0, v7, v8

    invoke-static {v5, v6, v7}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget v0, p0, Lcom/facebook/ui/images/b/w;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/ui/images/b/w;->i:I

    .line 275
    invoke-direct {p0, v3, v4}, Lcom/facebook/ui/images/b/w;->a(J)V

    move v0, v1

    .line 276
    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/ui/images/b/w;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->m:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/images/b/w;->l:J

    .line 157
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Active future must be null before submitting for another"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->f:Lcom/facebook/ui/images/b/h;

    iget-object v1, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/h;->b(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    .line 160
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/ui/images/b/y;

    invoke-direct {v1, p0}, Lcom/facebook/ui/images/b/y;-><init>(Lcom/facebook/ui/images/b/w;)V

    iget-object v2, p0, Lcom/facebook/ui/images/b/w;->g:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 177
    return-void

    .line 157
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 180
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/w;->n:Z

    .line 182
    return-void
.end method

.method private f()J
    .locals 4

    .prologue
    .line 223
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/ui/images/b/w;->k:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private g()J
    .locals 4

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/ui/images/b/w;->l:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private h()J
    .locals 6

    .prologue
    .line 231
    sget-object v0, Lcom/facebook/ui/images/b/w;->c:[I

    iget v1, p0, Lcom/facebook/ui/images/b/w;->i:I

    aget v0, v0, v1

    .line 232
    sget-object v1, Lcom/facebook/ui/images/b/w;->a:[I

    iget v2, p0, Lcom/facebook/ui/images/b/w;->i:I

    aget v1, v1, v2

    .line 234
    invoke-direct {p0}, Lcom/facebook/ui/images/b/w;->g()J

    move-result-wide v2

    .line 235
    int-to-long v4, v1

    cmp-long v4, v2, v4

    if-gez v4, :cond_0

    .line 236
    int-to-long v0, v1

    sub-long/2addr v0, v2

    .line 238
    :goto_0
    return-wide v0

    :cond_0
    int-to-long v0, v0

    goto :goto_0
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .prologue
    .line 113
    iput-boolean p1, p0, Lcom/facebook/ui/images/b/w;->j:Z

    .line 114
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/w;->j:Z

    return v0
.end method

.method public b()Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation

    .prologue
    .line 129
    invoke-virtual {p0}, Lcom/facebook/ui/images/b/w;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/m;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    sget-object v0, Lcom/facebook/ui/images/b/w;->b:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Potentially inefficient usage of UrlImage#setShouldRetry detected while fetching: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/ui/images/b/w;->h:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v2}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    :cond_0
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/w;->m:Lcom/google/common/d/a/ab;

    .line 135
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ui/images/b/w;->k:J

    .line 136
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/ui/images/b/w;->a(J)V

    .line 137
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->m:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method public c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 185
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/w;->n:Z

    if-eqz v0, :cond_3

    .line 186
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    if-nez v0, :cond_4

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v2, "mActiveRequest was not set to false correctly (or some other programmer error?)"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 190
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->e:Landroid/os/Handler;

    iget-object v2, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 191
    iput-object v3, p0, Lcom/facebook/ui/images/b/w;->o:Ljava/lang/Runnable;

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_2

    .line 195
    iget-object v0, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 196
    iput-object v3, p0, Lcom/facebook/ui/images/b/w;->p:Lcom/google/common/d/a/s;

    .line 199
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/ui/images/b/w;->n:Z

    .line 201
    :cond_3
    return-void

    :cond_4
    move v0, v1

    .line 186
    goto :goto_0
.end method
