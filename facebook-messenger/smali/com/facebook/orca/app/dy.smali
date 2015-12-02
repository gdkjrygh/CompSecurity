.class Lcom/facebook/orca/app/dy;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/auth/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 752
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 752
    invoke-direct {p0}, Lcom/facebook/orca/app/dy;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/auth/a;
    .locals 2

    .prologue
    .line 757
    new-instance v1, Lcom/facebook/orca/auth/a;

    const-class v0, Lcom/facebook/push/PushInitializer;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dy;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/PushInitializer;

    invoke-direct {v1, v0}, Lcom/facebook/orca/auth/a;-><init>(Lcom/facebook/push/PushInitializer;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 752
    invoke-virtual {p0}, Lcom/facebook/orca/app/dy;->a()Lcom/facebook/orca/auth/a;

    move-result-object v0

    return-object v0
.end method
