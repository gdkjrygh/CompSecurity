.class Lcom/facebook/orca/app/em;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 741
    iput-object p1, p0, Lcom/facebook/orca/app/em;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 741
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/em;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/y;
    .locals 3

    .prologue
    .line 746
    new-instance v1, Lcom/facebook/auth/login/y;

    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/em;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {v1, v0, v2}, Lcom/facebook/auth/login/y;-><init>(Lcom/facebook/c/s;Ljava/lang/Class;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 741
    invoke-virtual {p0}, Lcom/facebook/orca/app/em;->a()Lcom/facebook/auth/login/y;

    move-result-object v0

    return-object v0
.end method
