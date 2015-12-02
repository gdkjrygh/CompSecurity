.class Lcom/facebook/orca/app/dx;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/ak;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 683
    iput-object p1, p0, Lcom/facebook/orca/app/dx;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 683
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dx;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/ak;
    .locals 4

    .prologue
    .line 687
    new-instance v2, Lcom/facebook/orca/app/fe;

    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/app/dx;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/a/d;

    invoke-direct {v2, v3, v0, v1}, Lcom/facebook/orca/app/fe;-><init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/base/a/d;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 683
    invoke-virtual {p0}, Lcom/facebook/orca/app/dx;->a()Lcom/facebook/analytics/ak;

    move-result-object v0

    return-object v0
.end method
