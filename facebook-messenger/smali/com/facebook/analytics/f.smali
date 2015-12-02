.class public Lcom/facebook/analytics/f;
.super Lcom/facebook/inject/c;
.source "AnalyticsClientModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 525
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 79
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 81
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/IsPeriodicDeviceStatusEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 84
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/IsVerboseReliabilityAnalyticsLoggingPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/f;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 87
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/IsTimeSpentBitArrayLoggingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/e;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 90
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/IsOldTimeSpentLoggingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 93
    const-class v0, Lcom/facebook/analytics/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/h;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 96
    const-class v0, Lcom/facebook/analytics/bt;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/o;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 99
    const-class v0, Lcom/facebook/analytics/cg;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ab;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ab;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 102
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/bt;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 104
    const-class v0, Lcom/facebook/analytics/bp;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/q;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 107
    const-class v0, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/x;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 110
    const-class v0, Lcom/facebook/analytics/bx;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/n;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 113
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/bx;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 115
    const-class v0, Lcom/facebook/analytics/i/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/i;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 118
    const-class v0, Lcom/facebook/common/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/aa;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 121
    const-class v0, Lcom/facebook/analytics/e/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ae;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ae;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 124
    const-class v0, Lcom/facebook/analytics/e/i;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/e/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 126
    const-class v0, Lcom/facebook/analytics/module/b;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/m;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 129
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ag;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ag;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 132
    const-class v0, Lcom/facebook/analytics/cj;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ac;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ac;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 135
    const-class v0, Lcom/facebook/analytics/an;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/p;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 138
    const-class v0, Lcom/facebook/analytics/au;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/k;

    invoke-direct {v1, v2}, Lcom/facebook/analytics/k;-><init>(Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 141
    const-class v0, Lcom/facebook/analytics/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/j;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 144
    const-class v0, Lcom/facebook/http/b/t;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/an;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 146
    const-class v0, Lcom/facebook/http/b/au;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/au;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 148
    const-class v0, Lcom/facebook/analytics/i/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ad;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 151
    const-class v0, Lcom/facebook/analytics/cache/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/r;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 154
    const-class v0, Lcom/facebook/analytics/j/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/aj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/aj;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 157
    const-class v0, Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/z;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 161
    const-class v0, Lcom/facebook/analytics/cache/h;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/s;

    invoke-direct {v1, p0}, Lcom/facebook/analytics/s;-><init>(Lcom/facebook/analytics/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 164
    const-class v0, Lcom/facebook/analytics/br;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/w;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 167
    const-class v0, Lcom/facebook/analytics/b/c;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/v;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 170
    const-class v0, Lcom/facebook/analytics/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/u;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 173
    const-class v0, Lcom/facebook/analytics/g/g;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ai;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ai;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 176
    const-class v0, Lcom/facebook/analytics/g/f;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/ah;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/ah;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 179
    const-class v0, Lcom/facebook/analytics/g/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/l;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 183
    const-class v0, Lcom/facebook/analytics/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/t;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 188
    const-class v0, Lcom/facebook/analytics/ck;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 190
    const-class v0, Lcom/facebook/analytics/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 192
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 195
    const-class v0, Lcom/facebook/device_id/a;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/module/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 198
    const-class v0, Lcom/facebook/analytics/periodicreporters/m;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/af;

    invoke-direct {v1, p0, v2}, Lcom/facebook/analytics/af;-><init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 202
    const-class v0, Lcom/facebook/analytics/periodicreporters/l;

    const-class v1, Lcom/facebook/analytics/periodicreporters/ClientPeriodicReporters;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/analytics/periodicreporters/m;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 204
    return-void
.end method
