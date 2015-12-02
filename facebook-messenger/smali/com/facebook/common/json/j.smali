.class Lcom/facebook/common/json/j;
.super Lcom/facebook/inject/d;
.source "FbJsonModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/json/f;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/common/json/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 2

    .prologue
    .line 54
    new-instance v1, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/common/json/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/core/ObjectCodec;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;-><init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/facebook/common/json/j;->a()Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    move-result-object v0

    return-object v0
.end method
