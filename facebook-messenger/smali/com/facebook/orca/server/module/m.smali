.class Lcom/facebook/orca/server/module/m;
.super Lcom/facebook/inject/d;
.source "MessagesServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/server/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/server/module/a;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lcom/facebook/orca/server/module/m;->a:Lcom/facebook/orca/server/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/server/module/a;Lcom/facebook/orca/server/module/b;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/module/m;-><init>(Lcom/facebook/orca/server/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 9

    .prologue
    .line 277
    new-instance v0, Lcom/facebook/orca/login/ae;

    const-class v1, Lcom/facebook/http/protocol/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/i;

    const-class v2, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/b/b;

    const-class v3, Lcom/facebook/orca/protocol/methods/z;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/f/f;

    const-class v4, Lcom/facebook/orca/protocol/methods/be;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/protocol/methods/be;

    const-class v5, Lcom/facebook/orca/protocol/methods/d;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/protocol/methods/d;

    const-class v6, Lcom/facebook/orca/protocol/methods/u;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/protocol/methods/u;

    const-class v7, Lcom/facebook/orca/protocol/methods/ag;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/protocol/methods/ag;

    const-class v8, Lcom/facebook/f/a;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/server/module/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/f/a;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/login/ae;-><init>(Lcom/facebook/http/protocol/i;Lcom/facebook/auth/b/b;Lcom/facebook/f/f;Lcom/facebook/orca/protocol/methods/be;Lcom/facebook/orca/protocol/methods/d;Lcom/facebook/orca/protocol/methods/u;Lcom/facebook/orca/protocol/methods/ag;Lcom/facebook/f/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 273
    invoke-virtual {p0}, Lcom/facebook/orca/server/module/m;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
