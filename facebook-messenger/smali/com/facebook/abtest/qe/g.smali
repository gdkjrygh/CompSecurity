.class public Lcom/facebook/abtest/qe/g;
.super Lcom/facebook/inject/c;
.source "QuickExperimentModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 154
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 65
    const-class v0, Lcom/facebook/http/b/w;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->e(Ljava/lang/Class;)V

    .line 66
    const-class v0, Lcom/facebook/prefs/shared/t;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->e(Ljava/lang/Class;)V

    .line 67
    const-class v0, Lcom/facebook/analytics/f;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->e(Ljava/lang/Class;)V

    .line 69
    new-instance v0, Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/service/module/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 70
    new-instance v0, Lcom/facebook/abtest/qe/l;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/l;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 72
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 74
    const-class v0, Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/g/b;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/g/b;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 77
    const-class v0, Lcom/facebook/abtest/qe/b;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/i;-><init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 80
    const-class v0, Lcom/facebook/abtest/qe/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/c/b;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/c/b;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 83
    const-class v0, Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/c/d;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/c/d;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 86
    const-class v0, Lcom/facebook/abtest/qe/e/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/e/c;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/e/c;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 88
    const-class v0, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/b/g;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/b/g;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 91
    const-class v0, Lcom/facebook/abtest/qe/b/e;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/j;-><init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 93
    const-class v0, Lcom/facebook/abtest/qe/c/e;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/c/g;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/c/g;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 95
    const-class v0, Lcom/facebook/abtest/qe/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/f;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/f;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 98
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/protocol/sync/full/e;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/protocol/sync/full/e;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 101
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 105
    const-class v0, Lcom/facebook/abtest/qe/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/d/f;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/d/f;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 109
    const-class v0, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 111
    const-class v0, Lcom/facebook/prefs/shared/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/data/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 114
    const-class v0, Lcom/facebook/abtest/qe/service/d;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/service/f;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/service/f;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 118
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/b/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/service/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 122
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 126
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/abtest/qe/annotations/ShouldAppFetchOnForeground;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/abtest/qe/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/abtest/qe/k;-><init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 129
    return-void
.end method
