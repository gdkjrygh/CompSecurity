.class public Lcom/facebook/orca/push/c;
.super Lcom/facebook/inject/c;
.source "MessagesPushModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 92
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    const-class v0, Lcom/facebook/auth/login/bm;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 41
    const-class v0, Lcom/facebook/orca/push/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/push/e;-><init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 44
    const-class v0, Lcom/facebook/orca/push/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/push/g;-><init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 47
    const-class v0, Lcom/facebook/orca/push/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/push/f;-><init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 50
    const-class v0, Lcom/facebook/push/fbpushdata/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/push/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/an;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 53
    return-void
.end method
