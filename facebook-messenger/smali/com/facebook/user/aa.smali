.class Lcom/facebook/user/aa;
.super Lcom/facebook/inject/d;
.source "UserModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/ac;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/x;


# direct methods
.method private constructor <init>(Lcom/facebook/user/x;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/facebook/user/aa;->a:Lcom/facebook/user/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/user/x;Lcom/facebook/user/y;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/user/aa;-><init>(Lcom/facebook/user/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/ac;
    .locals 2

    .prologue
    .line 31
    new-instance v1, Lcom/facebook/user/ac;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/user/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v1, v0}, Lcom/facebook/user/ac;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/user/aa;->a()Lcom/facebook/user/ac;

    move-result-object v0

    return-object v0
.end method
