.class Lcom/facebook/appconfig/j;
.super Lcom/facebook/inject/d;
.source "AppConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/appconfig/m;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/appconfig/g;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/facebook/appconfig/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/appconfig/m;
    .locals 2

    .prologue
    .line 80
    new-instance v1, Lcom/facebook/appconfig/m;

    const-class v0, Lcom/facebook/appconfig/b;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/b;

    invoke-direct {v1, v0}, Lcom/facebook/appconfig/m;-><init>(Lcom/facebook/appconfig/b;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/appconfig/j;->a()Lcom/facebook/appconfig/m;

    move-result-object v0

    return-object v0
.end method
