.class Lcom/facebook/abtest/qe/i;
.super Lcom/facebook/inject/d;
.source "QuickExperimentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/g;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/g;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/facebook/abtest/qe/i;->a:Lcom/facebook/abtest/qe/g;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/g;Lcom/facebook/abtest/qe/h;)V
    .locals 0

    .prologue
    .line 140
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/i;-><init>(Lcom/facebook/abtest/qe/g;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/b;
    .locals 5

    .prologue
    .line 145
    new-instance v3, Lcom/facebook/abtest/qe/b;

    const-class v0, Lcom/facebook/common/time/c;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/common/l/a;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/l/a;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v4, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v4}, Lcom/facebook/abtest/qe/i;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/facebook/abtest/qe/b;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/common/l/a;Lcom/facebook/prefs/shared/d;Ljava/util/Set;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 140
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/i;->a()Lcom/facebook/abtest/qe/b;

    move-result-object v0

    return-object v0
.end method
