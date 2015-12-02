.class Lcom/facebook/orca/g/ag;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/orca/g/ag;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/ag;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/k;
    .locals 8

    .prologue
    .line 111
    new-instance v0, Lcom/facebook/orca/g/k;

    const-class v1, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/g/aa;

    const-class v2, Lcom/facebook/orca/g/j;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/j;

    const-class v3, Lcom/facebook/orca/g/y;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/g/y;

    const-class v4, Lcom/facebook/orca/g/r;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/g/r;

    const-class v5, Lcom/facebook/orca/g/g;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/g/g;

    const-class v6, Lcom/facebook/orca/g/z;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/g/ag;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Lcom/facebook/orca/g/e;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/g/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/g/e;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/g/k;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/j;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/g;Ljavax/inject/a;Lcom/facebook/orca/g/e;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/facebook/orca/g/ag;->a()Lcom/facebook/orca/g/k;

    move-result-object v0

    return-object v0
.end method
