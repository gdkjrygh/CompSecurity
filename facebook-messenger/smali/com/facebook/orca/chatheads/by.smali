.class Lcom/facebook/orca/chatheads/by;
.super Ljava/lang/Object;
.source "ChatHeadsAnalytics.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/facebook/orca/chatheads/by;->a:Lcom/facebook/analytics/av;

    .line 70
    iput-object p2, p0, Lcom/facebook/orca/chatheads/by;->d:Lcom/facebook/prefs/shared/d;

    .line 71
    iput-object p3, p0, Lcom/facebook/orca/chatheads/by;->b:Ljavax/inject/a;

    .line 72
    iput-object p4, p0, Lcom/facebook/orca/chatheads/by;->c:Ljavax/inject/a;

    .line 73
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/analytics/cb;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 134
    if-eqz p3, :cond_0

    .line 135
    invoke-virtual {p3, v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/analytics/cb;)V

    .line 137
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 107
    const-string v0, "chathead"

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 108
    if-eqz p3, :cond_0

    .line 109
    const-string v1, "reason"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 112
    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/chatheads/ag;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/analytics/cb;"
        }
    .end annotation

    .prologue
    .line 117
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 119
    :goto_0
    const-string v1, "chathead"

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/orca/chatheads/by;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 120
    const-string v1, "gesture_headcount"

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 121
    if-eqz p3, :cond_0

    .line 122
    const-string v1, "reason"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 125
    :cond_0
    return-object v0

    .line 117
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 86
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v0, "chathead_settings_change"

    invoke-direct {v1, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/chatheads/dy;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 89
    const-string v2, "HAS_CHAT_HEADS_GK"

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 90
    const-string v2, "permitted"

    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 91
    const-string v2, "enabled"

    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 92
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/by;->b(Lcom/facebook/analytics/cb;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->G:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 96
    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->G:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 101
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 76
    const-string v0, "chatheads"

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 78
    return-void
.end method

.method public b(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 81
    const-string v0, "chatheads"

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/chatheads/by;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 83
    return-void
.end method
