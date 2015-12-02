.class Lcom/facebook/orca/protocol/ac;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/ao;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lcom/facebook/orca/protocol/ac;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 364
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/ac;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/ao;
    .locals 8

    .prologue
    .line 368
    new-instance v0, Lcom/facebook/orca/protocol/methods/ao;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/bx;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/push/mqtt/bx;

    const-class v3, Lcom/facebook/orca/f/n;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/n;

    const-class v4, Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/protocol/methods/an;

    const-class v5, Lcom/facebook/orca/a/j;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/protocol/ac;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v7, Lcom/facebook/c/j;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/protocol/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/c/j;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/protocol/methods/ao;-><init>(Landroid/content/Context;Lcom/facebook/push/mqtt/bx;Lcom/facebook/orca/f/n;Lcom/facebook/orca/protocol/methods/an;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/c/j;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 364
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/ac;->a()Lcom/facebook/orca/protocol/methods/ao;

    move-result-object v0

    return-object v0
.end method
