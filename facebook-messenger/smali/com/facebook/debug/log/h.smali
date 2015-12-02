.class public Lcom/facebook/debug/log/h;
.super Lcom/facebook/inject/b;
.source "LoggingModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 34
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 19
    const-class v0, Lcom/facebook/debug/log/d;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/log/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/log/j;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/debug/log/j;-><init>(Lcom/facebook/debug/log/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/log/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/log/AppLoggingPrefix;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-string v1, "unknown"

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 26
    const-class v0, Lcom/facebook/debug/log/e;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/log/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 27
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/debug/log/d;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/log/c;

    invoke-static {v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/c;)V

    .line 32
    return-void
.end method
