.class public Lcom/facebook/analytics/b/a;
.super Ljava/lang/Object;
.source "CountersPrefKeyUtil.java"


# static fields
.field public static a:Lcom/facebook/prefs/shared/ae;

.field static b:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field static c:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "analytics_counters/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    .line 23
    const-string v0, "data"

    sput-object v0, Lcom/facebook/analytics/b/a;->b:Ljava/lang/String;

    .line 26
    const-string v0, "last_update_time"

    sput-object v0, Lcom/facebook/analytics/b/a;->c:Ljava/lang/String;

    .line 28
    const-string v0, "/"

    sput-object v0, Lcom/facebook/analytics/b/a;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 3

    .prologue
    .line 35
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot handle null process name"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 37
    sget-object v0, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/facebook/analytics/b/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 47
    invoke-static {p2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Should specify counters name"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/analytics/b/a;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/facebook/analytics/b/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/facebook/prefs/shared/ae;)[Ljava/lang/String;
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 107
    sget-object v0, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    const-string v1, "Invalid counters prefkey"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 108
    sget-object v0, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 109
    sget-object v1, Lcom/facebook/analytics/b/a;->d:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/b/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/b/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method b(Lcom/facebook/prefs/shared/ae;)Z
    .locals 2

    .prologue
    .line 118
    sget-object v0, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/b/a;->b:Ljava/lang/String;

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

.method c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 67
    invoke-virtual {p0, p1, p2}, Lcom/facebook/analytics/b/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method
