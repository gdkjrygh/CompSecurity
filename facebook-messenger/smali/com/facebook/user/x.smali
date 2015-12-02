.class public Lcom/facebook/user/x;
.super Lcom/facebook/inject/c;
.source "UserModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 36
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 20
    const-class v0, Lcom/facebook/user/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/user/x;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/user/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/user/aa;-><init>(Lcom/facebook/user/x;Lcom/facebook/user/y;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 22
    const-class v0, Lcom/facebook/user/a/h;

    invoke-virtual {p0, v0}, Lcom/facebook/user/x;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/user/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/user/z;-><init>(Lcom/facebook/user/x;Lcom/facebook/user/y;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 25
    return-void
.end method
