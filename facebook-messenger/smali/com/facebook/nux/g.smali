.class Lcom/facebook/nux/g;
.super Lcom/facebook/inject/d;
.source "NuxModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/nux/status/j;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/nux/b;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/nux/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/nux/status/j;
    .locals 4

    .prologue
    .line 95
    new-instance v3, Lcom/facebook/nux/status/j;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v1}, Lcom/facebook/nux/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/nux/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/nux/status/j;-><init>(Lcom/facebook/prefs/shared/d;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 90
    invoke-virtual {p0}, Lcom/facebook/nux/g;->a()Lcom/facebook/nux/status/j;

    move-result-object v0

    return-object v0
.end method
