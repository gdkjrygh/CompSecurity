.class Lcom/facebook/http/b/an;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/protocol/ar;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 357
    iput-object p1, p0, Lcom/facebook/http/b/an;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 357
    invoke-direct {p0, p1}, Lcom/facebook/http/b/an;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/ar;
    .locals 15

    .prologue
    .line 361
    new-instance v0, Lcom/facebook/http/protocol/ar;

    const-class v1, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/http/c/i;

    const-class v3, Lcom/facebook/http/annotations/ProductionPlatformAppHttpConfig;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/http/c/i;

    const-class v3, Lcom/facebook/http/c/i;

    const-class v4, Lcom/facebook/http/annotations/BootstrapPlatformAppHttpConfig;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/http/c/i;

    const-class v4, Lcom/facebook/http/b/ap;

    invoke-virtual {p0, v4}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/http/b/ap;

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v6}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/http/annotations/IsPhpProfilingEnabled;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/http/annotations/IsTeakProfilingEnabled;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Ljava/lang/Boolean;

    const-class v10, Lcom/facebook/http/annotations/IsWirehogProfilingEnabled;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/http/b/an;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    const-class v10, Lcom/facebook/config/a/c;

    invoke-virtual {p0, v10}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/config/a/c;

    const-class v11, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p0, v11}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/fasterxml/jackson/core/JsonFactory;

    const-class v12, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v12}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v13, Lcom/facebook/http/protocol/s;

    invoke-virtual {p0, v13}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/http/protocol/s;

    const-class v14, Lcom/facebook/http/protocol/q;

    invoke-virtual {p0, v14}, Lcom/facebook/http/b/an;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/facebook/http/protocol/q;

    invoke-direct/range {v0 .. v14}, Lcom/facebook/http/protocol/ar;-><init>(Ljavax/inject/a;Lcom/facebook/http/c/i;Lcom/facebook/http/c/i;Lcom/facebook/http/b/ap;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/config/a/c;Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/http/protocol/s;Lcom/facebook/http/protocol/q;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 357
    invoke-virtual {p0}, Lcom/facebook/http/b/an;->a()Lcom/facebook/http/protocol/ar;

    move-result-object v0

    return-object v0
.end method
