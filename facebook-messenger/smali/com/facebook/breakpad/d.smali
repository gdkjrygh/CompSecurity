.class Lcom/facebook/breakpad/d;
.super Lcom/facebook/inject/d;
.source "BreakpadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/breakpad/BreakpadManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/breakpad/b;


# direct methods
.method private constructor <init>(Lcom/facebook/breakpad/b;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/breakpad/d;->a:Lcom/facebook/breakpad/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/breakpad/b;Lcom/facebook/breakpad/c;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/breakpad/d;-><init>(Lcom/facebook/breakpad/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/breakpad/BreakpadManager;
    .locals 4

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/breakpad/d;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 37
    const-string v1, "minidumps"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    .line 39
    new-instance v3, Lcom/facebook/breakpad/BreakpadManager;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/breakpad/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/breakpad/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    invoke-direct {v3, v2, v0, v1}, Lcom/facebook/breakpad/BreakpadManager;-><init>(Ljava/io/File;Lcom/facebook/analytics/av;Lcom/facebook/common/e/h;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/breakpad/d;->a()Lcom/facebook/breakpad/BreakpadManager;

    move-result-object v0

    return-object v0
.end method
