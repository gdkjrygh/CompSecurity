.class public Lcom/facebook/analytics/ay;
.super Lcom/facebook/inject/c;
.source "AnalyticsServiceModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 317
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 72
    const-class v0, Lcom/facebook/analytics/f;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->e(Ljava/lang/Class;)V

    .line 74
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 76
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/service/AnalyticsQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bf;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bf;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 81
    const-class v0, Lcom/facebook/analytics/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ba;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ba;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 84
    const-class v0, Lcom/facebook/analytics/c/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bb;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bb;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 87
    const-class v0, Lcom/facebook/analytics/c/e;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/be;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/be;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 89
    const-class v0, Lcom/facebook/analytics/c/g;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bg;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bg;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 92
    const-class v0, Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bk;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bk;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 95
    const-class v0, Lcom/facebook/analytics/service/i;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bd;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bd;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 98
    const-class v0, Lcom/facebook/analytics/service/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bc;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bc;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 101
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/service/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 103
    const-class v0, Lcom/facebook/analytics/bq;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bh;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bh;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 106
    const-class v0, Lcom/facebook/analytics/service/u;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bn;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bn;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 109
    const-class v0, Lcom/facebook/analytics/service/t;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/service/r;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 111
    const-class v0, Lcom/facebook/analytics/service/r;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bj;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 114
    const-class v0, Lcom/facebook/analytics/service/v;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bo;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bo;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 119
    const-class v0, Lcom/facebook/analytics/periodicreporters/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bi;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bi;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 122
    const-class v0, Lcom/facebook/analytics/periodicreporters/e;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bl;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bl;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 125
    const-class v0, Lcom/facebook/analytics/periodicreporters/j;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 126
    const-class v0, Lcom/facebook/analytics/periodicreporters/k;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/bm;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/bm;-><init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 130
    const-class v0, Lcom/facebook/analytics/periodicreporters/l;

    const-class v1, Lcom/facebook/analytics/periodicreporters/ServicePeriodicReporters;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/ay;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/periodicreporters/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/periodicreporters/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/periodicreporters/k;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 135
    const-class v0, Lcom/facebook/analytics/service/k;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ay;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/service/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 137
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 141
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 142
    sget-object v1, Lcom/facebook/analytics/service/m;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/analytics/service/AnalyticsQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 143
    return-void
.end method
