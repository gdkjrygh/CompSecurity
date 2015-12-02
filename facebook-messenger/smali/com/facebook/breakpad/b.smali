.class public Lcom/facebook/breakpad/b;
.super Lcom/facebook/inject/c;
.source "BreakpadModule.java"

# interfaces
.implements Lcom/facebook/inject/af;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 30
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 24
    const-class v0, Lcom/facebook/breakpad/BreakpadManager;

    invoke-virtual {p0, v0}, Lcom/facebook/breakpad/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/breakpad/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/breakpad/d;-><init>(Lcom/facebook/breakpad/b;Lcom/facebook/breakpad/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    return-void
.end method
