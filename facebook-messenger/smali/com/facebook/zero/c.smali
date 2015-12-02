.class public Lcom/facebook/zero/c;
.super Lcom/facebook/inject/c;
.source "ZeroModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 341
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 80
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 82
    const-class v0, Lcom/facebook/zero/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/u;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 85
    const-class v0, Lcom/facebook/zero/protocol/c;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/t;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 87
    const-class v0, Lcom/facebook/fbservice/service/e;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/zero/annotations/ZeroTokenQueue;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/e;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 91
    const-class v0, Lcom/facebook/zero/ui/o;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/i;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 93
    const-class v0, Lcom/facebook/zero/ui/l;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/h;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 95
    const-class v0, Lcom/facebook/zero/ui/d;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/f;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 97
    const-class v0, Lcom/facebook/zero/rewrite/b;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/m;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 99
    const-class v0, Lcom/facebook/zero/ui/h;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/g;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 101
    const-class v0, Lcom/facebook/zero/ui/p;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/l;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 103
    const-class v0, Lcom/facebook/zero/rewrite/e;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/v;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 105
    const-class v0, Lcom/facebook/zero/server/d;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/s;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/s;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 107
    const-class v0, Lcom/facebook/zero/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/r;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 109
    const-class v0, Lcom/facebook/zero/protocol/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/k;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 111
    const-class v0, Lcom/facebook/zero/protocol/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/j;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 114
    const-class v0, Lcom/facebook/http/b/u;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/zero/rewrite/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 116
    const-class v0, Lcom/facebook/auth/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/zero/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 119
    const-class v0, Lcom/facebook/zero/b/d;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/q;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 121
    const-class v0, Lcom/facebook/zero/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/o;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 123
    const-class v0, Lcom/facebook/zero/b/c;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/p;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 126
    const-class v0, Lcom/facebook/zero/rewrite/f;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/w;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 129
    const-class v0, Lcom/facebook/zero/rewrite/c;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/zero/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/zero/n;-><init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 132
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 135
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 138
    return-void
.end method
