.class public Lcom/facebook/nux/status/j;
.super Ljava/lang/Object;
.source "NuxStatusesManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/nux/status/NuxStatusResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/nux/status/j;

    sput-object v0, Lcom/facebook/nux/status/j;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/time/a;)V
    .locals 4

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/nux/status/j;->b:Lcom/facebook/prefs/shared/d;

    .line 47
    iput-object p2, p0, Lcom/facebook/nux/status/j;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 48
    iput-object p3, p0, Lcom/facebook/nux/status/j;->d:Lcom/facebook/common/time/a;

    .line 49
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x258

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->b(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->b(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/nux/status/j;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 53
    return-void
.end method

.method private a(Lcom/facebook/nux/status/NuxStatusResult;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/facebook/nux/status/j;->c:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    .line 95
    :catch_0
    move-exception v0

    .line 96
    sget-object v0, Lcom/facebook/nux/status/j;->a:Ljava/lang/Class;

    const-string v1, "Error serializing NuxStatusResult."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 98
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/nux/status/FetchNuxStatusesResult;)V
    .locals 5

    .prologue
    .line 76
    if-nez p1, :cond_0

    .line 90
    :goto_0
    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/facebook/nux/status/j;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 80
    sget-object v0, Lcom/facebook/nux/status/d;->d:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/nux/status/j;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 81
    invoke-virtual {p1}, Lcom/facebook/nux/status/FetchNuxStatusesResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/NuxStatusResult;

    .line 82
    invoke-virtual {v0}, Lcom/facebook/nux/status/NuxStatusResult;->getNuxId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/nux/status/d;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v3

    .line 83
    invoke-direct {p0, v0}, Lcom/facebook/nux/status/j;->a(Lcom/facebook/nux/status/NuxStatusResult;)Ljava/lang/String;

    move-result-object v4

    .line 84
    if-eqz v4, :cond_1

    .line 85
    invoke-interface {v1, v3, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 87
    :cond_1
    iget-object v3, p0, Lcom/facebook/nux/status/j;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, Lcom/facebook/nux/status/NuxStatusResult;->getNuxId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 89
    :cond_2
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method
