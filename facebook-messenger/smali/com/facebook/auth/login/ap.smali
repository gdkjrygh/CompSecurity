.class public Lcom/facebook/auth/login/ap;
.super Lcom/facebook/inject/c;
.source "LoginModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 231
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 53
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsWildfireRegEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 54
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/ShouldExpireAuthToken;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 55
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsFirstPartySsoEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 56
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/ShouldRequestSessionCookiesWithAuth;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 62
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/b/a;

    invoke-static {v1}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 64
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-static {v1}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 66
    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/protocol/aq;

    invoke-static {v1}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 68
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/fbservice/service/p;

    invoke-static {v1}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 70
    const-class v0, Lcom/facebook/ui/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/ui/d/a;

    invoke-static {v1}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 74
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/at;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/at;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 79
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/aw;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/aw;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 83
    const-class v0, Lcom/facebook/auth/login/o;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/ar;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/ar;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 86
    const-class v0, Lcom/facebook/auth/login/bc;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/az;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/az;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 89
    const-class v0, Lcom/facebook/auth/login/s;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/as;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/as;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 91
    const-class v0, Lcom/facebook/auth/login/bm;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/ba;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/ba;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 94
    const-class v0, Lcom/facebook/auth/protocol/e;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/av;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/av;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 96
    const-class v0, Lcom/facebook/auth/login/am;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/ay;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/ay;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 100
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/AuthTokenString;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/au;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/au;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 104
    const-class v0, Lcom/facebook/auth/login/z;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/ax;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/login/ax;-><init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 108
    const-class v0, Lcom/facebook/auth/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/z;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 111
    const-class v0, Lcom/facebook/auth/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 112
    const-class v0, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 113
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 114
    const-class v0, Lcom/facebook/auth/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ap;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 115
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 3

    .prologue
    .line 119
    invoke-super {p0, p1}, Lcom/facebook/inject/c;->a(Lcom/facebook/inject/t;)V

    .line 121
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 122
    sget-object v1, Lcom/facebook/auth/login/n;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 123
    sget-object v1, Lcom/facebook/auth/login/n;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 124
    sget-object v1, Lcom/facebook/auth/login/n;->c:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 125
    sget-object v1, Lcom/facebook/auth/login/n;->d:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 126
    sget-object v1, Lcom/facebook/auth/login/bb;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v2, Lcom/facebook/auth/annotations/AuthQueue;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 127
    return-void
.end method
