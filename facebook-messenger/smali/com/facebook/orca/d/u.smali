.class Lcom/facebook/orca/d/u;
.super Lcom/facebook/inject/d;
.source "AudioModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/d/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/s;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/d/s;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/orca/d/u;->a:Lcom/facebook/orca/d/s;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/d/s;Lcom/facebook/orca/d/t;)V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/u;-><init>(Lcom/facebook/orca/d/s;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/d/a;
    .locals 11

    .prologue
    .line 103
    new-instance v0, Lcom/facebook/orca/d/a;

    invoke-virtual {p0}, Lcom/facebook/orca/d/u;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Lcom/facebook/ui/c/d;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/ui/c/d;

    const-class v4, Lcom/facebook/analytics/cache/h;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/analytics/cache/h;

    const-class v5, Lcom/facebook/analytics/j/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/j/a;

    const-class v6, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/e/h;

    const-class v7, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/analytics/av;

    const-class v8, Lcom/facebook/cache/j;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/d/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/cache/j;

    const-class v9, Lcom/facebook/common/w/q;

    const-class v10, Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/orca/d/u;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    invoke-direct/range {v0 .. v9}, Lcom/facebook/orca/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/facebook/orca/d/u;->a()Lcom/facebook/orca/d/a;

    move-result-object v0

    return-object v0
.end method
