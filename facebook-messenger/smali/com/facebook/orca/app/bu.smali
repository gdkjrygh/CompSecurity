.class Lcom/facebook/orca/app/bu;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/fg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 876
    iput-object p1, p0, Lcom/facebook/orca/app/bu;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 876
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bu;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/fg;
    .locals 10

    .prologue
    .line 880
    new-instance v0, Lcom/facebook/orca/app/fg;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/aa;

    const-class v3, Lcom/facebook/prefs/shared/j;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/j;

    const-class v4, Lcom/facebook/orca/prefs/az;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/prefs/az;

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/app/g;

    const-class v7, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/contacts/data/b;

    const-class v8, Lcom/facebook/orca/app/dt;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/bu;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/app/bu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/config/a/a;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/orca/app/fg;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/g/aa;Lcom/facebook/prefs/shared/j;Lcom/facebook/orca/prefs/az;Lcom/facebook/common/executors/a;Lcom/facebook/orca/app/g;Lcom/facebook/contacts/data/b;Ljavax/inject/a;Lcom/facebook/config/a/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 876
    invoke-virtual {p0}, Lcom/facebook/orca/app/bu;->a()Lcom/facebook/orca/app/fg;

    move-result-object v0

    return-object v0
.end method
