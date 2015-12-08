.class public final Lkik/android/gifs/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/b/e$a;
    }
.end annotation


# static fields
.field private static d:Lkik/android/gifs/b/e;


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/kik/l/ab;

.field private e:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method private constructor <init>(Lcom/kik/l/ab;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/android/gifs/b/e;->a:Ljava/util/concurrent/ExecutorService;

    .line 25
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/android/gifs/b/e;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/gifs/b/e;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 52
    iput-object p1, p0, Lkik/android/gifs/b/e;->c:Lcom/kik/l/ab;

    .line 53
    return-void
.end method

.method static synthetic a(Lkik/android/gifs/b/e;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lkik/android/gifs/b/e;->e:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method public static a()Lkik/android/gifs/b/e;
    .locals 2

    .prologue
    .line 43
    sget-object v0, Lkik/android/gifs/b/e;->d:Lkik/android/gifs/b/e;

    if-nez v0, :cond_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must be init\'d with ClientStorage. Unfortunate consequence of our injection system."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    .line 47
    :cond_0
    sget-object v0, Lkik/android/gifs/b/e;->d:Lkik/android/gifs/b/e;

    return-object v0
.end method

.method public static a(Lcom/kik/l/ab;)Lkik/android/gifs/b/e;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lkik/android/gifs/b/e;->d:Lkik/android/gifs/b/e;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lkik/android/gifs/b/e;

    invoke-direct {v0, p0}, Lkik/android/gifs/b/e;-><init>(Lcom/kik/l/ab;)V

    sput-object v0, Lkik/android/gifs/b/e;->d:Lkik/android/gifs/b/e;

    .line 38
    :cond_0
    sget-object v0, Lkik/android/gifs/b/e;->d:Lkik/android/gifs/b/e;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkik/android/gifs/a/f$a;I)Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 60
    iget-object v0, p0, Lkik/android/gifs/b/e;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lkik/android/gifs/b/e;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/b/c;

    .line 62
    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0}, Lkik/android/gifs/b/c;->a()Lcom/kik/g/p;

    move-result-object v0

    .line 81
    :goto_0
    return-object v0

    .line 67
    :cond_0
    iget-object v0, p0, Lkik/android/gifs/b/e;->c:Lcom/kik/l/ab;

    invoke-static {p1, v0, p2, p3}, Lkik/android/gifs/b/d;->a(Ljava/lang/String;Lcom/kik/l/ab;Lkik/android/gifs/a/f$a;I)Lkik/android/gifs/b/c;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lkik/android/gifs/b/e;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 70
    iget-object v1, p0, Lkik/android/gifs/b/e;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lkik/android/gifs/b/e$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lkik/android/gifs/b/e$a;-><init>(Lkik/android/gifs/b/e;Lkik/android/gifs/b/c;B)V

    const-wide/16 v4, 0x5dc

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 72
    iget-object v1, p0, Lkik/android/gifs/b/e;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-virtual {v0}, Lkik/android/gifs/b/c;->a()Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/gifs/b/f;

    invoke-direct {v2, p0, p1}, Lkik/android/gifs/b/f;-><init>(Lkik/android/gifs/b/e;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 81
    invoke-virtual {v0}, Lkik/android/gifs/b/c;->a()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method
