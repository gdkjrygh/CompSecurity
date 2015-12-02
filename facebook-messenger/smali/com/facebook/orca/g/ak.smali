.class Lcom/facebook/orca/g/ak;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/orca/g/ak;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/ak;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/u;
    .locals 11

    .prologue
    .line 127
    new-instance v0, Lcom/facebook/orca/g/u;

    const-class v1, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/broadcast/a;

    const-class v2, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/k;

    const-class v3, Lcom/facebook/orca/g/k;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/g/k;

    const-class v4, Lcom/facebook/orca/g/h;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/g/h;

    const-class v5, Lcom/facebook/orca/g/n;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/g/n;

    const-class v6, Lcom/facebook/orca/g/m;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/g/m;

    const-class v7, Lcom/facebook/orca/g/t;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/g/t;

    const-class v8, Lcom/facebook/orca/g/y;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/g/y;

    const-class v9, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/g/aa;

    const-class v10, Lcom/facebook/orca/threads/i;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/g/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/threads/i;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/g/u;-><init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/orca/f/k;Lcom/facebook/orca/g/k;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/n;Lcom/facebook/orca/g/m;Lcom/facebook/orca/g/t;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/threads/i;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/g/ak;->a()Lcom/facebook/orca/g/u;

    move-result-object v0

    return-object v0
.end method
