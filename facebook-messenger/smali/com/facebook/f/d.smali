.class public Lcom/facebook/f/d;
.super Lcom/facebook/inject/d;
.source "GatekeeperProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/w/q;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/ae;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 21
    invoke-static {p1}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/f/d;->a:Lcom/facebook/prefs/shared/ae;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/w/q;
    .locals 2

    .prologue
    .line 26
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/f/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 27
    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 28
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    .line 38
    :goto_0
    return-object v0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/facebook/f/d;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->c(Lcom/facebook/prefs/shared/ae;)Ljava/lang/Object;

    move-result-object v0

    .line 32
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_0

    .line 38
    :cond_2
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/f/d;->a()Lcom/facebook/common/w/q;

    move-result-object v0

    return-object v0
.end method
