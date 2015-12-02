.class Lcom/facebook/orca/app/ez;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/common/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 527
    iput-object p1, p0, Lcom/facebook/orca/app/ez;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 527
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ez;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/common/b/a;
    .locals 3

    .prologue
    .line 531
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ez;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 532
    sget-object v1, Lcom/facebook/orca/prefs/o;->x:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    sget-object v0, Lcom/facebook/orca/common/b/a;->FB4A:Lcom/facebook/orca/common/b/a;

    .line 535
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/orca/common/b/a;->ORCA:Lcom/facebook/orca/common/b/a;

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 527
    invoke-virtual {p0}, Lcom/facebook/orca/app/ez;->a()Lcom/facebook/orca/common/b/a;

    move-result-object v0

    return-object v0
.end method
