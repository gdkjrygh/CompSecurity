.class Lcom/facebook/orca/app/ej;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/du;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 585
    iput-object p1, p0, Lcom/facebook/orca/app/ej;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 585
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ej;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/du;
    .locals 3

    .prologue
    .line 590
    new-instance v2, Lcom/facebook/orca/app/du;

    const-class v0, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ej;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ej;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/s;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/app/du;-><init>(Lcom/facebook/base/a/d;Lcom/facebook/c/s;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 585
    invoke-virtual {p0}, Lcom/facebook/orca/app/ej;->a()Lcom/facebook/orca/app/du;

    move-result-object v0

    return-object v0
.end method
