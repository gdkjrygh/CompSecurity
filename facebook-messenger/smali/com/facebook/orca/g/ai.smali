.class Lcom/facebook/orca/g/ai;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/facebook/orca/g/ai;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 188
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/ai;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/n;
    .locals 15

    .prologue
    .line 192
    new-instance v0, Lcom/facebook/orca/g/n;

    const-class v1, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/g/aa;

    const-class v2, Lcom/facebook/orca/g/y;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/y;

    const-class v3, Lcom/facebook/orca/g/h;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/g/h;

    const-class v4, Lcom/facebook/orca/g/k;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/g/k;

    const-class v5, Lcom/facebook/orca/g/r;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/g/r;

    const-class v6, Lcom/facebook/orca/g/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/g/a;

    const-class v7, Lcom/facebook/orca/g/w;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/g/w;

    const-class v8, Lcom/facebook/orca/g/f;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/g/f;

    const-class v9, Lcom/facebook/orca/g/q;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/g/q;

    const-class v10, Lcom/facebook/orca/g/o;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/g/o;

    const-class v11, Lcom/facebook/orca/g/g;

    invoke-virtual {p0, v11}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/orca/g/g;

    const-class v12, Lcom/facebook/orca/threads/i;

    invoke-virtual {p0, v12}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/orca/threads/i;

    const-class v13, Lcom/facebook/user/User;

    const-class v14, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v13, v14}, Lcom/facebook/orca/g/ai;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v13

    const-class v14, Lcom/facebook/orca/threads/x;

    invoke-virtual {p0, v14}, Lcom/facebook/orca/g/ai;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/orca/threads/x;

    invoke-direct/range {v0 .. v14}, Lcom/facebook/orca/g/n;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/y;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/k;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/a;Lcom/facebook/orca/g/w;Lcom/facebook/orca/g/f;Lcom/facebook/orca/g/q;Lcom/facebook/orca/g/o;Lcom/facebook/orca/g/g;Lcom/facebook/orca/threads/i;Ljavax/inject/a;Lcom/facebook/orca/threads/x;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 188
    invoke-virtual {p0}, Lcom/facebook/orca/g/ai;->a()Lcom/facebook/orca/g/n;

    move-result-object v0

    return-object v0
.end method
