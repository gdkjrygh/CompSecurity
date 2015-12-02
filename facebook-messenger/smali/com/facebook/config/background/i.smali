.class public Lcom/facebook/config/background/i;
.super Lcom/facebook/backgroundtasks/a;
.source "ConfigurationBackgroundTask.java"


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
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/fbservice/ops/k;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/config/background/i;

    sput-object v0, Lcom/facebook/config/background/i;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Ljavax/inject/a;Lcom/facebook/common/time/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/fbservice/ops/k;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 46
    const-string v0, "CONFIGURATION"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Lcom/facebook/config/background/i;->b:Lcom/facebook/auth/b/b;

    .line 48
    iput-object p2, p0, Lcom/facebook/config/background/i;->c:Lcom/facebook/prefs/shared/d;

    .line 49
    iput-object p3, p0, Lcom/facebook/config/background/i;->d:Lcom/facebook/fbservice/ops/k;

    .line 50
    iput-object p4, p0, Lcom/facebook/config/background/i;->e:Ljavax/inject/a;

    .line 51
    iput-object p5, p0, Lcom/facebook/config/background/i;->f:Lcom/facebook/common/time/a;

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/facebook/config/background/i;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/config/background/i;->f:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/config/background/i;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/config/background/i;->c:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const/4 v1, 0x0

    .line 55
    iget-object v0, p0, Lcom/facebook/config/background/i;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    :cond_0
    :goto_0
    return v1

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/facebook/config/background/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 60
    iget-object v0, p0, Lcom/facebook/config/background/i;->c:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/config/background/h;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v4, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v4

    .line 62
    sub-long v4, v2, v4

    const-wide/32 v6, 0xdbba0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/facebook/config/background/i;->c:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/config/background/h;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v4, v8, v9}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v4

    .line 69
    sub-long/2addr v2, v4

    iget-object v0, p0, Lcom/facebook/config/background/i;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 4
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
    .line 74
    sget-object v0, Lcom/facebook/config/background/i;->a:Ljava/lang/Class;

    const-string v1, "Starting fetch"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/config/background/i;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/background/h;->a:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/config/background/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 83
    iget-object v0, p0, Lcom/facebook/config/background/i;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v1, Lcom/facebook/config/background/f;->a:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 88
    new-instance v1, Lcom/facebook/config/background/j;

    invoke-direct {v1, p0}, Lcom/facebook/config/background/j;-><init>(Lcom/facebook/config/background/i;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 106
    new-instance v1, Lcom/facebook/backgroundtasks/r;

    sget-object v2, Lcom/facebook/config/background/i;->a:Ljava/lang/Class;

    invoke-direct {v1, v2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    .line 107
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 108
    return-object v1
.end method
