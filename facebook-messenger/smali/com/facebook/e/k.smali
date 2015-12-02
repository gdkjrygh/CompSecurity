.class Lcom/facebook/e/k;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/base/activity/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 149
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 149
    invoke-direct {p0}, Lcom/facebook/e/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/activity/c;
    .locals 1

    .prologue
    .line 154
    new-instance v0, Lcom/facebook/base/activity/c;

    invoke-direct {v0}, Lcom/facebook/base/activity/c;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 149
    invoke-virtual {p0}, Lcom/facebook/e/k;->a()Lcom/facebook/base/activity/c;

    move-result-object v0

    return-object v0
.end method
