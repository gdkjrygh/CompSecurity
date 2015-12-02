.class Lcom/facebook/orca/app/ef;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/media/cache/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 620
    iput-object p1, p0, Lcom/facebook/orca/app/ef;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 620
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ef;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/media/cache/k;
    .locals 2

    .prologue
    .line 625
    new-instance v1, Lcom/facebook/ui/media/cache/k;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ef;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/ui/media/cache/k;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 620
    invoke-virtual {p0}, Lcom/facebook/orca/app/ef;->a()Lcom/facebook/ui/media/cache/k;

    move-result-object v0

    return-object v0
.end method
