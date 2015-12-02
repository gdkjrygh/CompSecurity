.class public Lcom/facebook/d/a/a;
.super Lcom/facebook/inject/b;
.source "DatabaseModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 19
    const-class v0, Lcom/facebook/d/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/d/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/d/a/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/d/a/c;-><init>(Lcom/facebook/d/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 22
    return-void
.end method
