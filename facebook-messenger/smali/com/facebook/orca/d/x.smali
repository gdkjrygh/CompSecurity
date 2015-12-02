.class Lcom/facebook/orca/d/x;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/facebook/orca/d/x;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/x;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/r;
    .locals 6

    .prologue
    .line 121
    new-instance v0, Lcom/facebook/orca/d/r;

    invoke-virtual {p0}, Lcom/facebook/orca/d/x;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/http/b/ap;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/d/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/http/b/ap;

    const-class v3, Lcom/facebook/analytics/j/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/d/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/j/a;

    const-class v4, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/d/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/analytics/av;

    const-class v5, Lcom/facebook/analytics/g/g;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/d/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/g/e;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/d/r;-><init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/d/x;->a()Lcom/facebook/orca/d/r;

    move-result-object v0

    return-object v0
.end method
