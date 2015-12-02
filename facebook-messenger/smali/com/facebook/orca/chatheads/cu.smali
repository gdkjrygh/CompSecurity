.class Lcom/facebook/orca/chatheads/cu;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/by;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cu;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 204
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cu;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/by;
    .locals 6

    .prologue
    .line 208
    new-instance v2, Lcom/facebook/orca/chatheads/by;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsPermitted;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/chatheads/cu;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/chatheads/cu;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-direct {v2, v0, v1, v3, v4}, Lcom/facebook/orca/chatheads/by;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 204
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cu;->a()Lcom/facebook/orca/chatheads/by;

    move-result-object v0

    return-object v0
.end method
