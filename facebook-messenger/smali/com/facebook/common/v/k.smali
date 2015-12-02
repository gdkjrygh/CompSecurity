.class public Lcom/facebook/common/v/k;
.super Lcom/facebook/inject/b;
.source "UserInteractionModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 65
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 27
    const-class v0, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/v/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/v/n;-><init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 30
    const-class v0, Lcom/facebook/common/v/c;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/v/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/v/m;-><init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 33
    const-class v0, Lcom/facebook/common/v/d;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/v/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/v/o;-><init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 37
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/k;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/common/v/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 39
    return-void
.end method
