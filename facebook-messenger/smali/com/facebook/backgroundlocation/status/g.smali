.class Lcom/facebook/backgroundlocation/status/g;
.super Lcom/facebook/inject/d;
.source "BackgroundLocationStatusModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/backgroundlocation/status/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/backgroundlocation/status/e;


# direct methods
.method private constructor <init>(Lcom/facebook/backgroundlocation/status/e;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/backgroundlocation/status/g;->a:Lcom/facebook/backgroundlocation/status/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/backgroundlocation/status/e;Lcom/facebook/backgroundlocation/status/f;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/backgroundlocation/status/g;-><init>(Lcom/facebook/backgroundlocation/status/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/backgroundlocation/status/a;
    .locals 2

    .prologue
    .line 62
    new-instance v1, Lcom/facebook/backgroundlocation/status/a;

    const-class v0, Lcom/facebook/backgroundlocation/status/d;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundlocation/status/d;

    invoke-direct {v1, v0}, Lcom/facebook/backgroundlocation/status/a;-><init>(Lcom/facebook/backgroundlocation/status/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/facebook/backgroundlocation/status/g;->a()Lcom/facebook/backgroundlocation/status/a;

    move-result-object v0

    return-object v0
.end method
