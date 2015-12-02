.class public Lcom/facebook/push/mqtt/ax;
.super Lcom/facebook/inject/c;
.source "MqttPushModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 361
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 56
    const-class v0, Lcom/facebook/http/b/w;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->e(Ljava/lang/Class;)V

    .line 57
    const-class v0, Lcom/facebook/analytics/f;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->e(Ljava/lang/Class;)V

    .line 58
    const-class v0, Lcom/facebook/push/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->e(Ljava/lang/Class;)V

    .line 60
    new-instance v0, Lcom/facebook/mqtt/q;

    invoke-direct {v0}, Lcom/facebook/mqtt/q;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 62
    const-class v0, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bf;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bf;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 65
    const-class v0, Lcom/facebook/push/mqtt/ci;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bp;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bp;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 68
    const-class v0, Lcom/facebook/push/mqtt/u;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/be;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/be;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 71
    const-class v0, Lcom/facebook/push/mqtt/s;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bd;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bd;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 74
    const-class v0, Lcom/facebook/push/mqtt/ai;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bg;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bg;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 76
    const-class v0, Lcom/facebook/push/mqtt/aw;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bk;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bk;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 79
    const-class v0, Lcom/facebook/push/mqtt/ch;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bo;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bo;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 82
    const-class v0, Lcom/facebook/push/mqtt/ca;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bn;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bn;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 85
    const-class v0, Lcom/facebook/push/mqtt/o;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bc;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bc;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 88
    const-class v0, Lcom/facebook/push/mqtt/ar;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/HighestMqttPersistence;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 91
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/KeepaliveDelayAdjustmentPercentage;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/n;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 96
    const-class v0, Lcom/facebook/push/mqtt/bx;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bl;

    invoke-direct {v1, v2}, Lcom/facebook/push/mqtt/bl;-><init>(Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 101
    const-class v0, Lcom/facebook/push/mqtt/as;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 104
    const-class v0, Lcom/facebook/push/mqtt/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/az;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/az;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 106
    const-class v0, Lcom/facebook/push/mqtt/f;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bb;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bb;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 109
    const-class v0, Lcom/facebook/analytics/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/at;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 112
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/ai;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/s;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 118
    const-class v0, Lcom/facebook/push/mqtt/av;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 122
    const-class v0, Lcom/facebook/push/mqtt/i;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 125
    const-class v0, Lcom/facebook/push/f;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/aw;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 129
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 133
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/IsDeviceForegroundEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 137
    const-class v0, Lcom/facebook/push/mqtt/ck;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 138
    const-class v0, Ljava/lang/Long;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/MqttEndpointCapability;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/ah;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 142
    const-class v0, Lcom/facebook/push/mqtt/at;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bj;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bj;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 147
    const-class v0, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/abtest/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 149
    const-class v0, Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bm;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bm;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 153
    const-class v0, Lcom/facebook/push/mqtt/d;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/ba;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/ba;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 156
    const-class v0, Lcom/facebook/push/mqtt/ap;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bi;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bi;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 159
    const-class v0, Lcom/facebook/push/mqtt/an;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/ax;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/bh;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/bh;-><init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 162
    return-void
.end method
