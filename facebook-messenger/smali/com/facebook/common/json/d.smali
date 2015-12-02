.class public Lcom/facebook/common/json/d;
.super Ljava/lang/Object;
.source "FbJsonChecker.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/JsonToken;
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/facebook/common/json/d;->a(Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 21
    return-object v0
.end method

.method public static final a(Lcom/fasterxml/jackson/core/JsonToken;)V
    .locals 2

    .prologue
    .line 28
    if-nez p0, :cond_0

    .line 29
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected end of json input"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_0
    return-void
.end method
