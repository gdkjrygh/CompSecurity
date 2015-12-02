.class public Lcom/qihoo/security/leak/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/leak/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/leak/c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/qihoo/security/leak/e;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/leak/d;->d:Z

    .line 26
    invoke-static {}, Lcom/qihoo/security/leak/e;->a()Lcom/qihoo/security/leak/e;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/leak/d;->c:Lcom/qihoo/security/leak/e;

    .line 27
    return-void
.end method

.method public static a()Lcom/qihoo/security/leak/d;
    .locals 3

    .prologue
    .line 30
    const-class v1, Lcom/qihoo/security/leak/d;

    monitor-enter v1

    .line 31
    const/4 v0, 0x0

    .line 32
    :try_start_0
    sget-object v2, Lcom/qihoo/security/leak/d;->a:Ljava/lang/ref/WeakReference;

    .line 33
    if-eqz v2, :cond_0

    .line 34
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/d;

    .line 36
    :cond_0
    if-nez v0, :cond_1

    .line 37
    new-instance v0, Lcom/qihoo/security/leak/d;

    invoke-direct {v0}, Lcom/qihoo/security/leak/d;-><init>()V

    .line 38
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/qihoo/security/leak/d;->a:Ljava/lang/ref/WeakReference;

    .line 40
    :cond_1
    monitor-exit v1

    return-object v0

    .line 41
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private declared-synchronized d()V
    .locals 3

    .prologue
    .line 59
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/qihoo/security/leak/d;->d:Z

    if-nez v0, :cond_5

    .line 60
    new-instance v0, Lcom/qihoo/security/leak/j;

    invoke-direct {v0, p0}, Lcom/qihoo/security/leak/j;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 61
    invoke-virtual {v0}, Lcom/qihoo/security/leak/j;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_0
    new-instance v0, Lcom/qihoo/security/leak/i;

    invoke-direct {v0, p0}, Lcom/qihoo/security/leak/i;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 66
    invoke-virtual {v0}, Lcom/qihoo/security/leak/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 67
    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/i;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    :cond_1
    new-instance v0, Lcom/qihoo/security/leak/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/leak/a;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 76
    invoke-virtual {v0}, Lcom/qihoo/security/leak/a;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 77
    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_2
    new-instance v0, Lcom/qihoo/security/leak/g;

    invoke-direct {v0, p0}, Lcom/qihoo/security/leak/g;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 81
    invoke-virtual {v0}, Lcom/qihoo/security/leak/g;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 82
    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_3
    new-instance v0, Lcom/qihoo/security/leak/h;

    invoke-direct {v0, p0}, Lcom/qihoo/security/leak/h;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 86
    invoke-virtual {v0}, Lcom/qihoo/security/leak/h;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 87
    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    const-string/jumbo v2, "leak_samsung_backup"

    invoke-virtual {v1, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/leak/d;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :cond_5
    monitor-exit p0

    return-void

    .line 59
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lcom/qihoo/security/leak/c;
    .locals 1

    .prologue
    .line 49
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/leak/d;->d()V

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Lcom/qihoo/security/leak/e;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/leak/d;->c:Lcom/qihoo/security/leak/e;

    return-object v0
.end method

.method public declared-synchronized c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/leak/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/leak/d;->d()V

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/leak/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
