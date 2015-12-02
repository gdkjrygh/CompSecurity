.class Lcom/facebook/orca/app/ey;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/j/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 642
    iput-object p1, p0, Lcom/facebook/orca/app/ey;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 642
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ey;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/j/b;
    .locals 2

    .prologue
    .line 647
    new-instance v1, Lcom/facebook/orca/j/b;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ey;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/orca/j/b;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 642
    invoke-virtual {p0}, Lcom/facebook/orca/app/ey;->a()Lcom/facebook/orca/j/b;

    move-result-object v0

    return-object v0
.end method
