.class public Lcom/facebook/auth/broadcast/d;
.super Lcom/facebook/inject/c;
.source "CrossProcessAuthModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 81
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    const-class v0, Lcom/facebook/auth/login/z;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->d(Ljava/lang/Class;)V

    .line 23
    const-class v0, Lcom/facebook/auth/broadcast/k;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/broadcast/i;

    invoke-direct {v1, v2}, Lcom/facebook/auth/broadcast/i;-><init>(Lcom/facebook/auth/broadcast/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    const-class v0, Lcom/facebook/auth/broadcast/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/broadcast/k;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 30
    const-class v0, Lcom/facebook/base/j;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/broadcast/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/broadcast/j;-><init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 32
    const-class v0, Lcom/facebook/c/l;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/broadcast/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/broadcast/f;-><init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 34
    const-class v0, Lcom/facebook/auth/broadcast/l;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/broadcast/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/broadcast/h;-><init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 36
    const-class v0, Lcom/facebook/auth/broadcast/c;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 38
    const-class v0, Lcom/facebook/auth/broadcast/m;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/broadcast/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/broadcast/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/broadcast/g;-><init>(Lcom/facebook/auth/broadcast/d;Lcom/facebook/auth/broadcast/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 40
    return-void
.end method
