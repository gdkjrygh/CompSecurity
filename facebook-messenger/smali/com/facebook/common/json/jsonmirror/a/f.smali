.class public Lcom/facebook/common/json/jsonmirror/a/f;
.super Lcom/facebook/common/json/jsonmirror/a/a;
.source "JMEscaped.java"


# instance fields
.field public final g:Lcom/facebook/common/json/jsonmirror/a/a;

.field public final h:Lcom/fasterxml/jackson/core/JsonFactory;


# direct methods
.method public constructor <init>(Lcom/facebook/common/json/jsonmirror/a/a;Lcom/fasterxml/jackson/core/JsonFactory;)V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/common/json/jsonmirror/a/a;-><init>()V

    .line 18
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/a/c;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/a/j;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/a/h;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    const-string v1, "stringified values can only encapsulate complex types."

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_0
    iput-object p1, p0, Lcom/facebook/common/json/jsonmirror/a/f;->g:Lcom/facebook/common/json/jsonmirror/a/a;

    .line 26
    iput-object p2, p0, Lcom/facebook/common/json/jsonmirror/a/f;->h:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 27
    return-void
.end method
