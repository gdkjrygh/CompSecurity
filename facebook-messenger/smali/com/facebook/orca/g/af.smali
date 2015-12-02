.class Lcom/facebook/orca/g/af;
.super Lcom/facebook/inject/d;
.source "ThreadsDbModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/ab;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/g/ab;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/orca/g/af;->a:Lcom/facebook/orca/g/ab;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/g/ab;Lcom/facebook/orca/g/ac;)V
    .locals 0

    .prologue
    .line 163
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/af;-><init>(Lcom/facebook/orca/g/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/j;
    .locals 4

    .prologue
    .line 168
    new-instance v3, Lcom/facebook/orca/g/j;

    const-class v0, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/g/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/aa;

    const-class v1, Lcom/facebook/user/ac;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/g/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/ac;

    const-class v2, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/g/af;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/g/j;-><init>(Lcom/facebook/orca/g/aa;Lcom/facebook/user/ac;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 163
    invoke-virtual {p0}, Lcom/facebook/orca/g/af;->a()Lcom/facebook/orca/g/j;

    move-result-object v0

    return-object v0
.end method
