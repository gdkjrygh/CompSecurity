.class Lcom/facebook/orca/app/eg;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/ipc/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 577
    iput-object p1, p0, Lcom/facebook/orca/app/eg;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 577
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/eg;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/ipc/k;
    .locals 1

    .prologue
    .line 581
    new-instance v0, Lcom/facebook/orca/intents/f;

    invoke-direct {v0}, Lcom/facebook/orca/intents/f;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 577
    invoke-virtual {p0}, Lcom/facebook/orca/app/eg;->a()Lcom/facebook/messages/ipc/k;

    move-result-object v0

    return-object v0
.end method
