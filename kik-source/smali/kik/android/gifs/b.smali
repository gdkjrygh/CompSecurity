.class public final Lkik/android/gifs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/b$a;
    }
.end annotation


# static fields
.field private static a:Lkik/android/gifs/b;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/kik/l/ab;

.field private d:Lcom/kik/android/a;

.field private e:Landroid/os/Handler;

.field private f:Ljava/util/concurrent/ConcurrentMap;

.field private g:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;)V
    .locals 2

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/gifs/b;->f:Ljava/util/concurrent/ConcurrentMap;

    .line 36
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/gifs/b;->g:Ljava/util/concurrent/ConcurrentMap;

    .line 58
    iput-object p1, p0, Lkik/android/gifs/b;->b:Landroid/content/Context;

    .line 59
    iput-object p2, p0, Lkik/android/gifs/b;->c:Lcom/kik/l/ab;

    .line 60
    iput-object p3, p0, Lkik/android/gifs/b;->d:Lcom/kik/android/a;

    .line 61
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lkik/android/gifs/b;->e:Landroid/os/Handler;

    .line 62
    return-void
.end method

.method static synthetic a(Lkik/android/gifs/b;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/android/gifs/b;->g:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method public static a()Lkik/android/gifs/b;
    .locals 2

    .prologue
    .line 49
    sget-object v0, Lkik/android/gifs/b;->a:Lkik/android/gifs/b;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must be initiated by first calling setup. Unfortunate consequence of our injection system."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    .line 53
    :cond_0
    sget-object v0, Lkik/android/gifs/b;->a:Lkik/android/gifs/b;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;)Lkik/android/gifs/b;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lkik/android/gifs/b;->a:Lkik/android/gifs/b;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lkik/android/gifs/b;

    invoke-direct {v0, p0, p1, p2}, Lkik/android/gifs/b;-><init>(Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;)V

    sput-object v0, Lkik/android/gifs/b;->a:Lkik/android/gifs/b;

    .line 44
    :cond_0
    sget-object v0, Lkik/android/gifs/b;->a:Lkik/android/gifs/b;

    return-object v0
.end method

.method static synthetic a(Lkik/android/gifs/b;Ljava/lang/String;Ljava/io/File;ILkik/android/gifs/a/f$a;Lcom/kik/g/p;Lkik/android/gifs/view/GifView;)V
    .locals 4

    .prologue
    .line 25
    new-instance v0, Lkik/android/gifs/b$a;

    invoke-virtual {p6}, Lkik/android/gifs/view/GifView;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lkik/android/gifs/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;B)V

    iget-object v1, p0, Lkik/android/gifs/b;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/gifs/b;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    new-instance v1, Lkik/android/gifs/e;

    invoke-direct {v1, p0, p5}, Lkik/android/gifs/e;-><init>(Lkik/android/gifs/b;Lcom/kik/g/p;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lkik/android/gifs/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {p1, p2, p3, p4, v1}, Lkik/android/gifs/view/a;->a(Ljava/lang/String;Ljava/io/File;ILkik/android/gifs/a/f$a;Landroid/content/res/Resources;)Lcom/kik/g/p;

    move-result-object v1

    iget-object v2, p0, Lkik/android/gifs/b;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v0, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lkik/android/gifs/f;

    invoke-direct {v2, p0, v0, p5}, Lkik/android/gifs/f;-><init>(Lkik/android/gifs/b;Lkik/android/gifs/b$a;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/gifs/b;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/android/gifs/b;->f:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkik/android/gifs/a/f$a;Lkik/android/gifs/view/GifView;)Lcom/kik/g/p;
    .locals 7

    .prologue
    .line 73
    if-nez p1, :cond_0

    .line 74
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "URL is null when trying to fetch GIF"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v4

    .line 81
    :goto_0
    return-object v4

    .line 76
    :cond_0
    if-nez p3, :cond_1

    .line 77
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "GifView is null when trying to fetch GIF"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v4

    goto :goto_0

    .line 79
    :cond_1
    new-instance v4, Lcom/kik/g/p;

    invoke-direct {v4}, Lcom/kik/g/p;-><init>()V

    .line 80
    iget-object v0, p0, Lkik/android/gifs/b;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/gifs/b;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/kik/g/p;

    new-instance v0, Lkik/android/gifs/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lkik/android/gifs/c;-><init>(Lkik/android/gifs/b;Ljava/lang/String;Lkik/android/gifs/a/f$a;Lcom/kik/g/p;Lkik/android/gifs/view/GifView;)V

    invoke-virtual {v6, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/android/gifs/b;->c:Lcom/kik/l/ab;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/gifs/b;->d:Lcom/kik/android/a;

    invoke-interface {v0, p1, v1, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;Lkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v6

    iget-object v0, p0, Lkik/android/gifs/b;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v6}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lkik/android/gifs/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lkik/android/gifs/d;-><init>(Lkik/android/gifs/b;Ljava/lang/String;Lkik/android/gifs/a/f$a;Lcom/kik/g/p;Lkik/android/gifs/view/GifView;)V

    invoke-virtual {v6, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lkik/android/gifs/b;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 87
    return-void
.end method
