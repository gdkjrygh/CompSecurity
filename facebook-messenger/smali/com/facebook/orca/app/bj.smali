.class Lcom/facebook/orca/app/bj;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/e/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1820
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1820
    invoke-direct {p0}, Lcom/facebook/orca/app/bj;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/e/b;
    .locals 4

    .prologue
    .line 1825
    new-instance v3, Lcom/facebook/orca/e/b;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/k;

    const-class v2, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/push/mqtt/v;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/e/b;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/contacts/data/k;Lcom/facebook/push/mqtt/v;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1820
    invoke-virtual {p0}, Lcom/facebook/orca/app/bj;->a()Lcom/facebook/orca/e/b;

    move-result-object v0

    return-object v0
.end method
