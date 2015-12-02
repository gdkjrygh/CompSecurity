.class Lcom/facebook/orca/app/au;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/k/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1273
    iput-object p1, p0, Lcom/facebook/orca/app/au;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1273
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/au;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/k/e;
    .locals 2

    .prologue
    .line 1277
    new-instance v1, Lcom/facebook/orca/k/e;

    const-class v0, Lcom/facebook/location/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/au;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/h;

    invoke-direct {v1, v0}, Lcom/facebook/orca/k/e;-><init>(Lcom/facebook/location/h;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1273
    invoke-virtual {p0}, Lcom/facebook/orca/app/au;->a()Lcom/facebook/orca/k/e;

    move-result-object v0

    return-object v0
.end method
