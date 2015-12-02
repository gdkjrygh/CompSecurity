.class Lcom/facebook/bugreporter/r;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/bugreporter/r;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/r;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/f;
    .locals 7

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/bugreporter/f;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/r;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v2}, Lcom/facebook/bugreporter/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/http/protocol/aq;

    const-class v3, Lcom/facebook/bugreporter/d;

    invoke-virtual {p0, v3}, Lcom/facebook/bugreporter/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/bugreporter/d;

    const-class v4, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v4}, Lcom/facebook/bugreporter/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/e/h;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/r;->e()Lcom/facebook/inject/ab;

    move-result-object v5

    const-class v6, Landroid/app/NotificationManager;

    invoke-interface {v5, v6}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/NotificationManager;

    const-class v6, Lcom/facebook/bugreporter/m;

    invoke-virtual {p0, v6}, Lcom/facebook/bugreporter/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/bugreporter/m;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/bugreporter/f;-><init>(Landroid/content/Context;Lcom/facebook/http/protocol/aq;Lcom/facebook/bugreporter/d;Lcom/facebook/common/e/h;Landroid/app/NotificationManager;Lcom/facebook/bugreporter/m;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/facebook/bugreporter/r;->a()Lcom/facebook/bugreporter/f;

    move-result-object v0

    return-object v0
.end method
