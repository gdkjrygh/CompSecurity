.class public Lcom/facebook/abtest/qe/service/a/a;
.super Lcom/facebook/backgroundtasks/a;
.source "SyncQuickExperimentBackgroundTask.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/fbservice/ops/k;

.field private final e:Lcom/facebook/abtest/qe/g/a;

.field private final f:Lcom/facebook/common/time/a;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/abtest/qe/service/a/a;

    sput-object v0, Lcom/facebook/abtest/qe/service/a/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/common/time/a;Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/abtest/qe/g/a;",
            "Lcom/facebook/common/time/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 56
    const-string v0, "SYNC_QUICK_EXPERIMENT"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 58
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/a/a;->b:Ljavax/inject/a;

    .line 59
    iput-object p2, p0, Lcom/facebook/abtest/qe/service/a/a;->c:Lcom/facebook/prefs/shared/d;

    .line 60
    iput-object p3, p0, Lcom/facebook/abtest/qe/service/a/a;->d:Lcom/facebook/fbservice/ops/k;

    .line 61
    iput-object p4, p0, Lcom/facebook/abtest/qe/service/a/a;->e:Lcom/facebook/abtest/qe/g/a;

    .line 62
    iput-object p5, p0, Lcom/facebook/abtest/qe/service/a/a;->f:Lcom/facebook/common/time/a;

    .line 63
    iput-object p6, p0, Lcom/facebook/abtest/qe/service/a/a;->g:Ljavax/inject/a;

    .line 64
    return-void
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/facebook/abtest/qe/service/a/a;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 68
    const-class v0, Lcom/facebook/abtest/qe/service/module/QuickExperimentQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 10

    .prologue
    const-wide/16 v7, 0x0

    const/4 v1, 0x1

    .line 73
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 74
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->c:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/abtest/qe/data/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v4, v7, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v4

    .line 76
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->c:Lcom/facebook/prefs/shared/d;

    sget-object v6, Lcom/facebook/abtest/qe/data/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v6, v7, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v6

    .line 79
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->e:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v8

    .line 80
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->c:Lcom/facebook/prefs/shared/d;

    sget-object v9, Lcom/facebook/abtest/qe/data/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v9, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 85
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    cmp-long v0, v4, v6

    if-gez v0, :cond_0

    move v0, v1

    .line 98
    :goto_0
    return v0

    .line 89
    :cond_0
    sub-long/2addr v2, v4

    const-wide/32 v4, 0xdbba00

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    move v0, v1

    .line 90
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 94
    goto :goto_0

    .line 98
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 103
    sget-object v0, Lcom/facebook/abtest/qe/service/a/a;->a:Ljava/lang/Class;

    const-string v1, "Starting fetch"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/a/a;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v1, Lcom/facebook/abtest/qe/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 107
    new-instance v1, Lcom/facebook/abtest/qe/service/a/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/abtest/qe/service/a/c;-><init>(Lcom/facebook/abtest/qe/service/a/b;)V

    .line 108
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 109
    return-object v1
.end method
