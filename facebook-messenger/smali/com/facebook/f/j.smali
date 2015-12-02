.class public Lcom/facebook/f/j;
.super Lcom/facebook/inject/c;
.source "GkModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const-class v0, Lcom/facebook/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/f/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/f/l;

    invoke-direct {v1, v2}, Lcom/facebook/f/l;-><init>(Lcom/facebook/f/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 22
    const-class v0, Lcom/facebook/f/g;

    invoke-virtual {p0, v0}, Lcom/facebook/f/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/f/m;

    invoke-direct {v1, v2}, Lcom/facebook/f/m;-><init>(Lcom/facebook/f/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 24
    const-class v0, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/f/j;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/f/g;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 26
    const-class v0, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v0}, Lcom/facebook/f/j;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/f/g;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 28
    return-void
.end method
