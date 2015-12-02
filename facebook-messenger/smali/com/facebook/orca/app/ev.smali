.class Lcom/facebook/orca/app/ev;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/reflex/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 772
    iput-object p1, p0, Lcom/facebook/orca/app/ev;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 772
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ev;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/reflex/h;
    .locals 2

    .prologue
    .line 777
    new-instance v1, Lcom/facebook/orca/reflex/h;

    const-class v0, Lcom/facebook/orca/reflex/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ev;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/reflex/e;

    invoke-direct {v1, v0}, Lcom/facebook/orca/reflex/h;-><init>(Lcom/facebook/orca/reflex/e;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 772
    invoke-virtual {p0}, Lcom/facebook/orca/app/ev;->a()Lcom/facebook/orca/reflex/h;

    move-result-object v0

    return-object v0
.end method
