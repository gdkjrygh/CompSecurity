.class public Lcom/facebook/ui/i/c;
.super Lcom/facebook/inject/b;
.source "ToastModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 35
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const-class v0, Lcom/facebook/ui/i/g;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/i/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/ui/i/f;

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/f;-><init>(Lcom/facebook/ui/i/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 20
    const-class v0, Lcom/facebook/ui/i/b;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/i/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/ui/i/e;

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/e;-><init>(Lcom/facebook/ui/i/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    return-void
.end method
