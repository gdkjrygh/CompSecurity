.class public Lcom/roidapp/videolib/core/i;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:I

.field private c:[Lcom/roidapp/videolib/gl/a;

.field private d:Ljava/lang/Object;

.field private e:I

.field private f:Lcom/roidapp/videolib/core/h;

.field private g:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/roidapp/videolib/core/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/videolib/core/i;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/roidapp/videolib/core/h;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 12
    iput v1, p0, Lcom/roidapp/videolib/core/i;->b:I

    .line 15
    iput-object v2, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/core/i;->d:Ljava/lang/Object;

    .line 18
    iput v1, p0, Lcom/roidapp/videolib/core/i;->e:I

    .line 23
    iput-object v2, p0, Lcom/roidapp/videolib/core/i;->f:Lcom/roidapp/videolib/core/h;

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/videolib/core/i;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    iput-object p1, p0, Lcom/roidapp/videolib/core/i;->f:Lcom/roidapp/videolib/core/h;

    .line 29
    iput p2, p0, Lcom/roidapp/videolib/core/i;->b:I

    .line 30
    new-array v0, p2, [Lcom/roidapp/videolib/gl/a;

    iput-object v0, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    .line 31
    return-void
.end method

.method private static a(Lcom/roidapp/videolib/gl/a;)V
    .locals 2

    .prologue
    .line 149
    if-nez p0, :cond_0

    .line 160
    :goto_0
    return-void

    .line 152
    :cond_0
    iget-object v1, p0, Lcom/roidapp/videolib/gl/a;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 153
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 157
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/gl/a;->d:Z

    goto :goto_0

    .line 157
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private b(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 74
    if-ltz p1, :cond_0

    iget v1, p0, Lcom/roidapp/videolib/core/i;->b:I

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->f:Lcom/roidapp/videolib/core/h;

    if-nez v1, :cond_1

    .line 82
    :cond_0
    :goto_0
    return v0

    .line 78
    :cond_1
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aget-object v1, v1, p1

    if-nez v1, :cond_0

    .line 79
    iget-object v0, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->f:Lcom/roidapp/videolib/core/h;

    invoke-interface {v1, p1}, Lcom/roidapp/videolib/core/h;->f(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v1

    aput-object v1, v0, p1

    .line 80
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private declared-synchronized c()V
    .locals 3

    .prologue
    .line 58
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    iget v1, p0, Lcom/roidapp/videolib/core/i;->b:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/core/i;->f:Lcom/roidapp/videolib/core/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 70
    :cond_0
    monitor-exit p0

    return-void

    .line 62
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 63
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 64
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 65
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/i;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    iget v0, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v0, v0, -0x2

    invoke-direct {p0, v0}, Lcom/roidapp/videolib/core/i;->b(I)Z

    .line 1088
    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 1089
    iget v1, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v1, v1, -0x2

    if-lt v0, v1, :cond_3

    iget v1, p0, Lcom/roidapp/videolib/core/i;->e:I

    add-int/lit8 v1, v1, 0x2

    if-le v0, v1, :cond_4

    .line 1090
    :cond_3
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aget-object v1, v1, v0

    invoke-static {v1}, Lcom/roidapp/videolib/core/i;->a(Lcom/roidapp/videolib/gl/a;)V

    .line 1091
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    const/4 v2, 0x0

    aput-object v2, v1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1088
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a(I)Lcom/roidapp/videolib/gl/a;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 103
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/roidapp/videolib/core/i;->b:I

    if-lt p1, v1, :cond_1

    .line 131
    :cond_0
    :goto_0
    return-object v0

    .line 107
    :cond_1
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aget-object v1, v1, p1

    if-nez v1, :cond_3

    .line 108
    iget-object v2, p0, Lcom/roidapp/videolib/core/i;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :try_start_1
    iput p1, p0, Lcom/roidapp/videolib/core/i;->e:I

    .line 110
    invoke-direct {p0}, Lcom/roidapp/videolib/core/i;->c()V

    .line 112
    iget v1, p0, Lcom/roidapp/videolib/core/i;->e:I

    sub-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_2

    .line 113
    iput p1, p0, Lcom/roidapp/videolib/core/i;->e:I

    .line 115
    :cond_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    :cond_3
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aget-object v0, v1, p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 115
    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 130
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final declared-synchronized a()V
    .locals 0

    .prologue
    .line 39
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public final b()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 136
    iget-object v0, p0, Lcom/roidapp/videolib/core/i;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 137
    invoke-virtual {p0}, Lcom/roidapp/videolib/core/i;->interrupt()V

    .line 138
    iget-object v0, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    array-length v2, v0

    move v0, v1

    :goto_0
    if-ge v0, v2, :cond_0

    .line 139
    iget-object v3, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aget-object v3, v3, v0

    invoke-static {v3}, Lcom/roidapp/videolib/core/i;->a(Lcom/roidapp/videolib/gl/a;)V

    .line 140
    iget-object v3, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    aput-object v4, v3, v0

    .line 138
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 143
    :cond_0
    iput v1, p0, Lcom/roidapp/videolib/core/i;->e:I

    .line 144
    iput-object v4, p0, Lcom/roidapp/videolib/core/i;->c:[Lcom/roidapp/videolib/gl/a;

    .line 145
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 146
    return-void
.end method

.method public run()V
    .locals 2

    .prologue
    .line 44
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/i;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/i;->sleep(J)V

    .line 47
    iget-object v1, p0, Lcom/roidapp/videolib/core/i;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :try_start_1
    invoke-direct {p0}, Lcom/roidapp/videolib/core/i;->c()V

    .line 49
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    :catch_0
    move-exception v0

    :cond_0
    return-void
.end method
