.class Lcom/facebook/orca/app/es;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/fk;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 597
    iput-object p1, p0, Lcom/facebook/orca/app/es;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 597
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/es;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/fk;
    .locals 3

    .prologue
    .line 602
    new-instance v1, Lcom/facebook/orca/app/fk;

    iget-object v0, p0, Lcom/facebook/orca/app/es;->a:Lcom/facebook/orca/app/dv;

    invoke-static {v0}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/orca/app/dv;)Landroid/app/Application;

    move-result-object v2

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/es;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, v2, v0}, Lcom/facebook/orca/app/fk;-><init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 597
    invoke-virtual {p0}, Lcom/facebook/orca/app/es;->a()Lcom/facebook/orca/app/fk;

    move-result-object v0

    return-object v0
.end method
