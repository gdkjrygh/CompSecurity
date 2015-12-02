.class Lcom/facebook/common/json/g;
.super Lcom/facebook/inject/d;
.source "FbJsonModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/fasterxml/jackson/core/JsonFactory;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/json/f;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/facebook/common/json/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/fasterxml/jackson/core/JsonFactory;
    .locals 1

    .prologue
    .line 62
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/common/json/g;->a()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    return-object v0
.end method
