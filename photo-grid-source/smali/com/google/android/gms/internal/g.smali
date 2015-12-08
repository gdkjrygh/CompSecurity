.class public final Lcom/google/android/gms/internal/g;
.super Lcom/google/android/gms/internal/xt;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/xt",
        "<",
        "Lcom/google/android/gms/internal/g;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile o:[Lcom/google/android/gms/internal/g;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:[Lcom/google/android/gms/internal/g;

.field public d:[Lcom/google/android/gms/internal/g;

.field public e:[Lcom/google/android/gms/internal/g;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public i:Z

.field public j:[Lcom/google/android/gms/internal/g;

.field public k:[I

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/internal/xt;-><init>()V

    .line 1000
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/g;->a:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/g;->e()[Lcom/google/android/gms/internal/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    invoke-static {}, Lcom/google/android/gms/internal/g;->e()[Lcom/google/android/gms/internal/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    invoke-static {}, Lcom/google/android/gms/internal/g;->e()[Lcom/google/android/gms/internal/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/g;->h:J

    iput-boolean v2, p0, Lcom/google/android/gms/internal/g;->i:Z

    invoke-static {}, Lcom/google/android/gms/internal/g;->e()[Lcom/google/android/gms/internal/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    sget-object v0, Lcom/google/android/gms/internal/ye;->a:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->k:[I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/g;->l:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/g;->n:I

    .line 0
    return-void
.end method

.method private static e()[Lcom/google/android/gms/internal/g;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/g;->o:[Lcom/google/android/gms/internal/g;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ya;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/g;->o:[Lcom/google/android/gms/internal/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/g;

    sput-object v0, Lcom/google/android/gms/internal/g;->o:[Lcom/google/android/gms/internal/g;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/g;->o:[Lcom/google/android/gms/internal/g;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 14

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    const-wide/16 v12, 0x0

    .line 0
    invoke-super {p0}, Lcom/google/android/gms/internal/xt;->a()I

    move-result v0

    iget v2, p0, Lcom/google/android/gms/internal/g;->a:I

    .line 2000
    invoke-static {v3}, Lcom/google/android/gms/internal/xr;->b(I)I

    move-result v6

    invoke-static {v2}, Lcom/google/android/gms/internal/xr;->a(I)I

    move-result v2

    add-int/2addr v2, v6

    .line 0
    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/xr;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-lez v2, :cond_3

    move v2, v0

    move v0, v1

    :goto_0
    iget-object v6, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    array-length v6, v6

    if-ge v0, v6, :cond_2

    iget-object v6, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    aget-object v6, v6, v0

    if-eqz v6, :cond_1

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/xr;->b(ILcom/google/android/gms/internal/yb;)I

    move-result v6

    add-int/2addr v2, v6

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v2

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-lez v2, :cond_6

    move v2, v0

    move v0, v1

    :goto_1
    iget-object v6, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    array-length v6, v6

    if-ge v0, v6, :cond_5

    iget-object v6, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    aget-object v6, v6, v0

    if-eqz v6, :cond_4

    const/4 v7, 0x4

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/xr;->b(ILcom/google/android/gms/internal/yb;)I

    move-result v6

    add-int/2addr v2, v6

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-lez v2, :cond_9

    move v2, v0

    move v0, v1

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    array-length v6, v6

    if-ge v0, v6, :cond_8

    iget-object v6, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    aget-object v6, v6, v0

    if-eqz v6, :cond_7

    const/4 v7, 0x5

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/xr;->b(ILcom/google/android/gms/internal/yb;)I

    move-result v6

    add-int/2addr v2, v6

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    move v0, v2

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    const/4 v2, 0x6

    iget-object v6, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    invoke-static {v2, v6}, Lcom/google/android/gms/internal/xr;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const/4 v2, 0x7

    iget-object v6, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    invoke-static {v2, v6}, Lcom/google/android/gms/internal/xr;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_b
    iget-wide v6, p0, Lcom/google/android/gms/internal/g;->h:J

    cmp-long v2, v6, v12

    if-eqz v2, :cond_c

    iget-wide v6, p0, Lcom/google/android/gms/internal/g;->h:J

    .line 3000
    const/16 v2, 0x8

    invoke-static {v2}, Lcom/google/android/gms/internal/xr;->b(I)I

    move-result v8

    .line 5000
    const-wide/16 v10, -0x80

    and-long/2addr v10, v6

    cmp-long v2, v10, v12

    if-nez v2, :cond_e

    move v2, v3

    .line 3000
    :goto_3
    add-int/2addr v2, v8

    .line 0
    add-int/2addr v0, v2

    :cond_c
    iget-boolean v2, p0, Lcom/google/android/gms/internal/g;->l:Z

    if-eqz v2, :cond_d

    const/16 v2, 0x9

    .line 6000
    invoke-static {v2}, Lcom/google/android/gms/internal/xr;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 0
    add-int/2addr v0, v2

    :cond_d
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->k:[I

    if-eqz v2, :cond_18

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->k:[I

    array-length v2, v2

    if-lez v2, :cond_18

    move v2, v1

    move v3, v1

    :goto_4
    iget-object v4, p0, Lcom/google/android/gms/internal/g;->k:[I

    array-length v4, v4

    if-ge v2, v4, :cond_17

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->k:[I

    aget v4, v4, v2

    invoke-static {v4}, Lcom/google/android/gms/internal/xr;->a(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 5000
    :cond_e
    const-wide/16 v2, -0x4000

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_f

    move v2, v4

    goto :goto_3

    :cond_f
    const-wide/32 v2, -0x200000

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_10

    move v2, v5

    goto :goto_3

    :cond_10
    const-wide/32 v2, -0x10000000

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_11

    const/4 v2, 0x4

    goto :goto_3

    :cond_11
    const-wide v2, -0x800000000L

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_12

    const/4 v2, 0x5

    goto :goto_3

    :cond_12
    const-wide v2, -0x40000000000L

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_13

    const/4 v2, 0x6

    goto :goto_3

    :cond_13
    const-wide/high16 v2, -0x2000000000000L

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_14

    const/4 v2, 0x7

    goto :goto_3

    :cond_14
    const-wide/high16 v2, -0x100000000000000L

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_15

    const/16 v2, 0x8

    goto :goto_3

    :cond_15
    const-wide/high16 v2, -0x8000000000000000L

    and-long/2addr v2, v6

    cmp-long v2, v2, v12

    if-nez v2, :cond_16

    const/16 v2, 0x9

    goto :goto_3

    :cond_16
    const/16 v2, 0xa

    goto :goto_3

    .line 0
    :cond_17
    add-int/2addr v0, v3

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->k:[I

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    :cond_18
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    if-eqz v2, :cond_1a

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-lez v2, :cond_1a

    :goto_5
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-ge v1, v2, :cond_1a

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    aget-object v2, v2, v1

    if-eqz v2, :cond_19

    const/16 v3, 0xb

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/xr;->b(ILcom/google/android/gms/internal/yb;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_1a
    iget-boolean v1, p0, Lcom/google/android/gms/internal/g;->i:Z

    if-eqz v1, :cond_1b

    const/16 v1, 0xc

    .line 7000
    invoke-static {v1}, Lcom/google/android/gms/internal/xr;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 0
    add-int/2addr v0, v1

    :cond_1b
    return v0
.end method

.method public final a(Lcom/google/android/gms/internal/xr;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/g;->a:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/xr;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/xr;->a(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    array-length v0, v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    aget-object v2, v2, v0

    if-eqz v2, :cond_1

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/xr;->a(ILcom/google/android/gms/internal/yb;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/xr;->a(ILcom/google/android/gms/internal/yb;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    array-length v0, v0

    if-lez v0, :cond_6

    move v0, v1

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    array-length v2, v2

    if-ge v0, v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    aget-object v2, v2, v0

    if-eqz v2, :cond_5

    const/4 v3, 0x5

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/xr;->a(ILcom/google/android/gms/internal/yb;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/xr;->a(ILjava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/xr;->a(ILjava/lang/String;)V

    :cond_8
    iget-wide v2, p0, Lcom/google/android/gms/internal/g;->h:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_9

    const/16 v0, 0x8

    iget-wide v2, p0, Lcom/google/android/gms/internal/g;->h:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/xr;->a(IJ)V

    :cond_9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/g;->l:Z

    if-eqz v0, :cond_a

    const/16 v0, 0x9

    iget-boolean v2, p0, Lcom/google/android/gms/internal/g;->l:Z

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/xr;->a(IZ)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->k:[I

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->k:[I

    array-length v0, v0

    if-lez v0, :cond_b

    move v0, v1

    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->k:[I

    array-length v2, v2

    if-ge v0, v2, :cond_b

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/google/android/gms/internal/g;->k:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/xr;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    array-length v0, v0

    if-lez v0, :cond_d

    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    array-length v0, v0

    if-ge v1, v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    aget-object v0, v0, v1

    if-eqz v0, :cond_c

    const/16 v2, 0xb

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/xr;->a(ILcom/google/android/gms/internal/yb;)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    iget-boolean v0, p0, Lcom/google/android/gms/internal/g;->i:Z

    if-eqz v0, :cond_e

    const/16 v0, 0xc

    iget-boolean v1, p0, Lcom/google/android/gms/internal/g;->i:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/xr;->a(IZ)V

    :cond_e
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/xt;->a(Lcom/google/android/gms/internal/xr;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/g;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/g;

    iget v2, p0, Lcom/google/android/gms/internal/g;->a:I

    iget v3, p1, Lcom/google/android/gms/internal/g;->a:I

    if-eq v2, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    if-nez v2, :cond_4

    iget-object v2, p1, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    if-eqz v2, :cond_5

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    if-eqz v2, :cond_a

    move v0, v1

    goto :goto_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    move v0, v1

    goto :goto_0

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    if-nez v2, :cond_b

    iget-object v2, p1, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    if-eqz v2, :cond_c

    move v0, v1

    goto :goto_0

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    move v0, v1

    goto :goto_0

    :cond_c
    iget-wide v2, p0, Lcom/google/android/gms/internal/g;->h:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/g;->h:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_d

    move v0, v1

    goto :goto_0

    :cond_d
    iget-boolean v2, p0, Lcom/google/android/gms/internal/g;->i:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/g;->i:Z

    if-eq v2, v3, :cond_e

    move v0, v1

    goto/16 :goto_0

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    move v0, v1

    goto/16 :goto_0

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->k:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/g;->k:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ya;->a([I[I)Z

    move-result v2

    if-nez v2, :cond_10

    move v0, v1

    goto/16 :goto_0

    :cond_10
    iget-boolean v2, p0, Lcom/google/android/gms/internal/g;->l:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/g;->l:Z

    if-eq v2, v3, :cond_11

    move v0, v1

    goto/16 :goto_0

    :cond_11
    iget-object v2, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    if-eqz v2, :cond_12

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/xy;->b()Z

    move-result v2

    if-eqz v2, :cond_13

    :cond_12
    iget-object v2, p1, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    if-eqz v2, :cond_0

    iget-object v2, p1, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/xy;->b()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto/16 :goto_0

    :cond_13
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    iget-object v1, p1, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/xy;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public final hashCode()I
    .locals 9

    const/16 v3, 0x4d5

    const/16 v2, 0x4cf

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget v4, p0, Lcom/google/android/gms/internal/g;->a:I

    add-int/2addr v0, v4

    mul-int/lit8 v4, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->c:[Lcom/google/android/gms/internal/g;

    invoke-static {v4}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->d:[Lcom/google/android/gms/internal/g;

    invoke-static {v4}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->e:[Lcom/google/android/gms/internal/g;

    invoke-static {v4}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v4, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v4

    mul-int/lit8 v4, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, Lcom/google/android/gms/internal/g;->h:J

    iget-wide v6, p0, Lcom/google/android/gms/internal/g;->h:J

    const/16 v8, 0x20

    ushr-long/2addr v6, v8

    xor-long/2addr v4, v6

    long-to-int v4, v4

    add-int/2addr v0, v4

    mul-int/lit8 v4, v0, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/g;->i:Z

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->j:[Lcom/google/android/gms/internal/g;

    invoke-static {v4}, Lcom/google/android/gms/internal/ya;->a([Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/google/android/gms/internal/g;->k:[I

    invoke-static {v4}, Lcom/google/android/gms/internal/ya;->a([I)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/google/android/gms/internal/g;->l:Z

    if-eqz v4, :cond_5

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/xy;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_0
    :goto_5
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/g;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_4
    move v0, v3

    goto :goto_3

    :cond_5
    move v2, v3

    goto :goto_4

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/g;->m:Lcom/google/android/gms/internal/xy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/xy;->hashCode()I

    move-result v1

    goto :goto_5
.end method
