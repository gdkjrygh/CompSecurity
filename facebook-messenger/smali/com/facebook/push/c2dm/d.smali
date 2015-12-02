.class public Lcom/facebook/push/c2dm/d;
.super Lcom/facebook/inject/c;
.source "C2DMPushModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 182
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 42
    const-class v0, Lcom/facebook/http/b/w;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->e(Ljava/lang/Class;)V

    .line 43
    const-class v0, Lcom/facebook/fbservice/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 44
    const-class v0, Lcom/facebook/analytics/f;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->e(Ljava/lang/Class;)V

    .line 45
    const-class v0, Lcom/facebook/push/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->e(Ljava/lang/Class;)V

    .line 47
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/IsGcmEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 51
    const-class v0, Lcom/facebook/push/c2dm/s;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/i;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 55
    const-class v0, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/k;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 58
    const-class v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/j;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 61
    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/g;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 64
    const-class v0, Lcom/facebook/push/c2dm/m;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/f;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 67
    const-class v0, Lcom/facebook/push/c2dm/r;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/h;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 69
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/RegistrationQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/push/c2dm/r;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 73
    const-class v0, Lcom/facebook/fbservice/service/n;

    const-class v1, Lcom/facebook/push/annotations/RegistrationQueue;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 74
    const-class v0, Lcom/facebook/push/c2dm/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/c2dm/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/c2dm/l;-><init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 79
    const-class v0, Lcom/facebook/push/fbpushdata/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 82
    const-class v0, Lcom/facebook/push/f;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/c2dm/s;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 85
    const-class v0, Lcom/facebook/device_id/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/c2dm/ad;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 87
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 91
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 92
    sget-object v1, Lcom/facebook/push/c2dm/r;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/push/annotations/RegistrationQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 93
    sget-object v1, Lcom/facebook/push/c2dm/r;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/push/annotations/RegistrationQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 94
    return-void
.end method
