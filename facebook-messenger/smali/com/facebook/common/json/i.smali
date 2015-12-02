.class Lcom/facebook/common/json/i;
.super Lcom/facebook/inject/d;
.source "FbJsonModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/fasterxml/jackson/databind/ObjectMapper;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/json/f;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/facebook/common/json/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/fasterxml/jackson/databind/ObjectMapper;
    .locals 2

    .prologue
    .line 69
    new-instance v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p0, v0}, Lcom/facebook/common/json/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    invoke-static {v1}, Lcom/facebook/common/json/e;->a(Lcom/fasterxml/jackson/databind/ObjectMapper;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/common/json/i;->a()Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v0

    return-object v0
.end method
