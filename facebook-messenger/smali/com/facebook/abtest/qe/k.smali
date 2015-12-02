.class Lcom/facebook/abtest/qe/k;
.super Lcom/facebook/inject/d;
.source "QuickExperimentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/g;

.field private b:Lcom/facebook/config/a/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/g;)V
    .locals 1

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/abtest/qe/k;->a:Lcom/facebook/abtest/qe/g;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 156
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/abtest/qe/k;->b:Lcom/facebook/config/a/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V
    .locals 0

    .prologue
    .line 154
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/k;-><init>(Lcom/facebook/abtest/qe/g;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/abtest/qe/k;->b:Lcom/facebook/config/a/a;

    if-nez v0, :cond_0

    .line 161
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/k;->b:Lcom/facebook/config/a/a;

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/k;->b:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 154
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/k;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
