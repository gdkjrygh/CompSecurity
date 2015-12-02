.class public Lcom/facebook/orca/b/b;
.super Lcom/facebook/analytics/bs;
.source "OrcaDataLogger.java"


# static fields
.field private static b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/config/server/j;

.field private final d:Lcom/facebook/prefs/shared/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/b/b;

    sput-object v0, Lcom/facebook/orca/b/b;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/a;Lcom/facebook/config/server/j;Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bs;-><init>(Lcom/facebook/analytics/a;)V

    .line 30
    iput-object p2, p0, Lcom/facebook/orca/b/b;->c:Lcom/facebook/config/server/j;

    .line 31
    new-instance v0, Lcom/facebook/orca/b/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/b/c;-><init>(Lcom/facebook/orca/b/b;)V

    iput-object v0, p0, Lcom/facebook/orca/b/b;->d:Lcom/facebook/prefs/shared/f;

    .line 39
    iget-object v0, p0, Lcom/facebook/orca/b/b;->d:Lcom/facebook/prefs/shared/f;

    invoke-interface {p3, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/b/b;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/b/b;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 61
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/http/f/c;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/b/b;->a:Lcom/google/common/a/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_0
    monitor-exit p0

    return-void

    .line 61
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/b/b;->c:Lcom/facebook/config/server/j;

    invoke-interface {v0}, Lcom/facebook/config/server/j;->a()Lcom/facebook/http/c/i;

    move-result-object v0

    .line 45
    new-instance v1, Lcom/google/common/a/ew;

    invoke-direct {v1}, Lcom/google/common/a/ew;-><init>()V

    invoke-interface {v0}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "method/logging.mobilelogs"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "log"

    invoke-virtual {v1, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "https://www.facebook.com/mobile/orca_android_crash_logs/"

    const-string v3, "crash_report"

    invoke-virtual {v1, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    invoke-interface {v0}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "api"

    invoke-virtual {v1, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    invoke-interface {v0}, Lcom/facebook/http/c/i;->b()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "graph"

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method
