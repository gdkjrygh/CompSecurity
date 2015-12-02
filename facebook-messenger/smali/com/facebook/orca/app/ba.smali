.class Lcom/facebook/orca/app/ba;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/mqtt/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1439
    iput-object p1, p0, Lcom/facebook/orca/app/ba;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1439
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ba;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/a/a;
    .locals 2

    .prologue
    .line 1443
    new-instance v1, Lcom/facebook/mqtt/a/a;

    const-class v0, Lcom/facebook/mqtt/a/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/a/h;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/a/a;-><init>(Lcom/facebook/mqtt/a/h;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1439
    invoke-virtual {p0}, Lcom/facebook/orca/app/ba;->a()Lcom/facebook/mqtt/a/a;

    move-result-object v0

    return-object v0
.end method
