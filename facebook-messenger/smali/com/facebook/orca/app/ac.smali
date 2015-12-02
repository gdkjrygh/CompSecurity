.class Lcom/facebook/orca/app/ac;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1210
    iput-object p1, p0, Lcom/facebook/orca/app/ac;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1210
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ac;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/w;
    .locals 2

    .prologue
    .line 1214
    new-instance v1, Lcom/facebook/orca/g/w;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v1, v0}, Lcom/facebook/orca/g/w;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1210
    invoke-virtual {p0}, Lcom/facebook/orca/app/ac;->a()Lcom/facebook/orca/g/w;

    move-result-object v0

    return-object v0
.end method
