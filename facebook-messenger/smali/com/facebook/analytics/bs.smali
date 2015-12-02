.class public abstract Lcom/facebook/analytics/bs;
.super Ljava/lang/Object;
.source "DataLogger.java"

# interfaces
.implements Lcom/facebook/analytics/ck;


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
.field protected a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/analytics/a;

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/analytics/bs;

    sput-object v0, Lcom/facebook/analytics/bs;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/a;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/bs;->d:J

    .line 43
    iput-object p1, p0, Lcom/facebook/analytics/bs;->c:Lcom/facebook/analytics/a;

    .line 44
    return-void
.end method

.method private a(Ljava/net/URI;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/analytics/bs;->b(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_sent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/net/URI;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 69
    const-string v0, ""

    .line 70
    if-eqz p2, :cond_0

    .line 71
    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 72
    if-lez v1, :cond_0

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/analytics/bs;->b(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_received"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/net/URI;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/facebook/analytics/bs;->b()V

    .line 86
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v2

    .line 87
    iget-object v0, p0, Lcom/facebook/analytics/bs;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 88
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 89
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 103
    :goto_0
    return-object v0

    .line 93
    :cond_1
    invoke-virtual {p1}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object v0

    .line 96
    if-eqz v0, :cond_3

    const-string v1, "fbcdn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "fbexternal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    :cond_2
    const-string v0, "cdn"

    goto :goto_0

    .line 99
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bs;->c(Ljava/net/URI;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 100
    const-string v0, "other_fb"

    goto :goto_0

    .line 102
    :cond_4
    sget-object v0, Lcom/facebook/analytics/bs;->b:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uncategorized Uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 103
    const-string v0, "uncategorized"

    goto :goto_0
.end method

.method private declared-synchronized b()V
    .locals 4

    .prologue
    .line 119
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/bs;->a:Lcom/google/common/a/ev;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/analytics/bs;->d:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x2932e00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 121
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/bs;->d:J

    .line 122
    invoke-virtual {p0}, Lcom/facebook/analytics/bs;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/bs;->a:Lcom/google/common/a/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    :cond_1
    monitor-exit p0

    return-void

    .line 119
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private c(Ljava/net/URI;)Z
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 109
    if-eqz v0, :cond_0

    const-string v1, ".facebook.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public abstract a()Lcom/google/common/a/ev;
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
.end method

.method public a(Ljava/net/URI;J)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bs;->a(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/facebook/analytics/bs;->c:Lcom/facebook/analytics/a;

    invoke-virtual {v1, v0, p2, p3}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 50
    return-void
.end method

.method public a(Ljava/net/URI;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/bs;->a(Ljava/net/URI;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/facebook/analytics/bs;->c:Lcom/facebook/analytics/a;

    invoke-virtual {v1, v0, p3, p4}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 66
    return-void
.end method

.method public a(Ljava/net/URI;Ljava/lang/String;JJ)V
    .locals 3

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/bs;->a(Ljava/net/URI;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    const-wide/16 v1, 0x0

    cmp-long v1, p5, v1

    if-ltz v1, :cond_0

    .line 57
    add-long/2addr p3, p5

    .line 59
    :cond_0
    iget-object v1, p0, Lcom/facebook/analytics/bs;->c:Lcom/facebook/analytics/a;

    invoke-virtual {v1, v0, p3, p4}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 60
    return-void
.end method
