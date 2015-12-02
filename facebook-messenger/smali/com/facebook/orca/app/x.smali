.class Lcom/facebook/orca/app/x;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/g/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1182
    iput-object p1, p0, Lcom/facebook/orca/app/x;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1182
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/x;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/g/g;
    .locals 3

    .prologue
    .line 1186
    new-instance v2, Lcom/facebook/orca/g/g;

    const-class v0, Lcom/facebook/orca/g/o;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/o;

    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/g/g;-><init>(Lcom/facebook/orca/g/o;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1182
    invoke-virtual {p0}, Lcom/facebook/orca/app/x;->a()Lcom/facebook/orca/g/g;

    move-result-object v0

    return-object v0
.end method
