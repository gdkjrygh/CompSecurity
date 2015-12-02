.class Lcom/facebook/orca/g/an;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/facebook/orca/g/an;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/an;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/aa;
    .locals 5

    .prologue
    .line 154
    new-instance v4, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/g/an;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/d/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/d/b/a;

    const-class v3, Lcom/facebook/orca/g/ap;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/g/ap;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/g/aa;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/orca/g/ap;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/facebook/orca/g/an;->a()Lcom/facebook/orca/g/aa;

    move-result-object v0

    return-object v0
.end method
