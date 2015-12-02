.class Lcom/facebook/debug/log/j;
.super Lcom/facebook/inject/d;
.source "LoggingModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/debug/log/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/debug/log/i;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/debug/log/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/log/d;
    .locals 5

    .prologue
    .line 38
    new-instance v3, Lcom/facebook/debug/log/d;

    const-class v0, Ljava/lang/String;

    const-class v1, Lcom/facebook/debug/log/AppLoggingPrefix;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/debug/log/j;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-class v1, Lcom/facebook/debug/log/e;

    invoke-virtual {p0, v1}, Lcom/facebook/debug/log/j;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/debug/log/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    const-class v2, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v2}, Lcom/facebook/debug/log/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/process/d;

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/debug/log/d;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/facebook/common/e/h;Lcom/facebook/common/process/d;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/facebook/debug/log/j;->a()Lcom/facebook/debug/log/d;

    move-result-object v0

    return-object v0
.end method
