.class Lcom/facebook/abtest/qe/n;
.super Lcom/facebook/inject/d;
.source "QuickExperimentPrefsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/prefs/provider/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/l;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/l;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/abtest/qe/n;->a:Lcom/facebook/abtest/qe/l;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/l;Lcom/facebook/abtest/qe/m;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/n;-><init>(Lcom/facebook/abtest/qe/l;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/prefs/provider/a;
    .locals 1

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/abtest/qe/o;

    invoke-direct {v0, p0}, Lcom/facebook/abtest/qe/o;-><init>(Lcom/facebook/abtest/qe/n;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/n;->a()Lcom/facebook/prefs/provider/a;

    move-result-object v0

    return-object v0
.end method
