.class Lcom/facebook/zero/g;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/ui/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/facebook/zero/g;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 274
    invoke-direct {p0, p1}, Lcom/facebook/zero/g;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/ui/h;
    .locals 3

    .prologue
    .line 278
    new-instance v2, Lcom/facebook/zero/ui/h;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v1, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v2, v0, v1}, Lcom/facebook/zero/ui/h;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/fasterxml/jackson/core/JsonFactory;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/facebook/zero/g;->a()Lcom/facebook/zero/ui/h;

    move-result-object v0

    return-object v0
.end method
