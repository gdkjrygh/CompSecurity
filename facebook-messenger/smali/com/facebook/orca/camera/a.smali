.class public Lcom/facebook/orca/camera/a;
.super Ljava/lang/Object;
.source "BitmapManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static c:Lcom/facebook/orca/camera/a;


# instance fields
.field private final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/Thread;",
            "Lcom/facebook/orca/camera/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/orca/camera/a;

    sput-object v0, Lcom/facebook/orca/camera/a;->a:Ljava/lang/Class;

    .line 62
    const/4 v0, 0x0

    sput-object v0, Lcom/facebook/orca/camera/a;->c:Lcom/facebook/orca/camera/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/a;->b:Ljava/util/WeakHashMap;

    .line 65
    return-void
.end method

.method public static declared-synchronized a()Lcom/facebook/orca/camera/a;
    .locals 2

    .prologue
    .line 124
    const-class v1, Lcom/facebook/orca/camera/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/orca/camera/a;->c:Lcom/facebook/orca/camera/a;

    if-nez v0, :cond_0

    .line 125
    new-instance v0, Lcom/facebook/orca/camera/a;

    invoke-direct {v0}, Lcom/facebook/orca/camera/a;-><init>()V

    sput-object v0, Lcom/facebook/orca/camera/a;->c:Lcom/facebook/orca/camera/a;

    .line 127
    :cond_0
    sget-object v0, Lcom/facebook/orca/camera/a;->c:Lcom/facebook/orca/camera/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private declared-synchronized a(Ljava/lang/Thread;Landroid/graphics/BitmapFactory$Options;)V
    .locals 1

    .prologue
    .line 85
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/camera/a;->c(Ljava/lang/Thread;)Lcom/facebook/orca/camera/d;

    move-result-object v0

    iput-object p2, v0, Lcom/facebook/orca/camera/d;->b:Landroid/graphics/BitmapFactory$Options;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    monitor-exit p0

    return-void

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized c(Ljava/lang/Thread;)Lcom/facebook/orca/camera/d;
    .locals 2

    .prologue
    .line 71
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/camera/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/d;

    .line 72
    if-nez v0, :cond_0

    .line 73
    new-instance v0, Lcom/facebook/orca/camera/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/orca/camera/d;-><init>(Lcom/facebook/orca/camera/b;)V

    .line 74
    iget-object v1, p0, Lcom/facebook/orca/camera/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :cond_0
    monitor-exit p0

    return-object v0

    .line 71
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Ljava/io/FileDescriptor;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 135
    iget-boolean v1, p2, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-eqz v1, :cond_0

    .line 149
    :goto_0
    return-object v0

    .line 139
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    .line 140
    invoke-virtual {p0, v1}, Lcom/facebook/orca/camera/a;->b(Ljava/lang/Thread;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 141
    sget-object v2, Lcom/facebook/orca/camera/a;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Thread "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " is not allowed to decode."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 145
    :cond_1
    invoke-direct {p0, v1, p2}, Lcom/facebook/orca/camera/a;->a(Ljava/lang/Thread;Landroid/graphics/BitmapFactory$Options;)V

    .line 146
    invoke-static {p1, v0, p2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 148
    invoke-virtual {p0, v1}, Lcom/facebook/orca/camera/a;->a(Ljava/lang/Thread;)V

    goto :goto_0
.end method

.method declared-synchronized a(Ljava/lang/Thread;)V
    .locals 2

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/camera/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/d;

    .line 90
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/facebook/orca/camera/d;->b:Landroid/graphics/BitmapFactory$Options;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit p0

    return-void

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/Thread;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 98
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/camera/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-nez v0, :cond_0

    .line 105
    :goto_0
    monitor-exit p0

    return v1

    .line 104
    :cond_0
    :try_start_1
    iget-object v0, v0, Lcom/facebook/orca/camera/d;->a:Lcom/facebook/orca/camera/c;

    sget-object v2, Lcom/facebook/orca/camera/c;->CANCEL:Lcom/facebook/orca/camera/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v0, v2, :cond_1

    move v0, v1

    :goto_1
    move v1, v0

    .line 105
    goto :goto_0

    .line 104
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
