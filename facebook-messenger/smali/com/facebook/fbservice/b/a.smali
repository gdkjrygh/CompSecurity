.class public Lcom/facebook/fbservice/b/a;
.super Lcom/facebook/inject/b;
.source "BlueServiceModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 136
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 34
    const-class v0, Lcom/facebook/fbservice/service/o;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/d;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 37
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/e;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/fbservice/ops/c;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/c;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/c;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 42
    const-class v0, Lcom/facebook/fbservice/ops/p;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/g;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 44
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/fbservice/ops/p;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 47
    const-class v0, Lcom/facebook/fbservice/ops/o;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/f;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 50
    const-class v0, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/viewercontext/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 53
    const-class v0, Lcom/facebook/fbservice/service/n;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 54
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/fbservice/service/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 57
    const-class v0, Lcom/facebook/fbservice/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/h;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 59
    const-class v0, Lcom/facebook/fbservice/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/b/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/b/i;-><init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 61
    return-void
.end method
