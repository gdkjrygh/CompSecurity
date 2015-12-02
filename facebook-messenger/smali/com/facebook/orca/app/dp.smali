.class Lcom/facebook/orca/app/dp;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/bs;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1808
    iput-object p1, p0, Lcom/facebook/orca/app/dp;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1808
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dp;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/bs;
    .locals 5

    .prologue
    .line 1812
    new-instance v3, Lcom/facebook/orca/contacts/divebar/bs;

    const-class v0, Lcom/facebook/abtest/qe/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/dp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/app/dp;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/bs;-><init>(Lcom/facebook/abtest/qe/c;Lcom/facebook/prefs/shared/d;Ljava/util/concurrent/Executor;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1808
    invoke-virtual {p0}, Lcom/facebook/orca/app/dp;->a()Lcom/facebook/orca/contacts/divebar/bs;

    move-result-object v0

    return-object v0
.end method
