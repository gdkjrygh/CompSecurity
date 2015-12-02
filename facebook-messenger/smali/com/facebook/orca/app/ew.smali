.class Lcom/facebook/orca/app/ew;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/reflex/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 761
    iput-object p1, p0, Lcom/facebook/orca/app/ew;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 761
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ew;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/reflex/e;
    .locals 3

    .prologue
    .line 766
    new-instance v2, Lcom/facebook/orca/reflex/e;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ew;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/abtest/qe/d/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ew;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/d/e;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/reflex/e;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/abtest/qe/d/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 761
    invoke-virtual {p0}, Lcom/facebook/orca/app/ew;->a()Lcom/facebook/orca/reflex/e;

    move-result-object v0

    return-object v0
.end method
