.class Lcom/facebook/orca/app/ec;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/intents/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 560
    iput-object p1, p0, Lcom/facebook/orca/app/ec;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 560
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ec;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/intents/b;
    .locals 9

    .prologue
    .line 564
    new-instance v0, Lcom/facebook/orca/intents/b;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/user/i;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/i;

    const-class v3, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/auth/b/b;

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/app/ec;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Ljava/lang/Boolean;

    const-class v6, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/app/ec;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/c/s;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/c/s;

    const-class v7, Landroid/content/ComponentName;

    const-class v8, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/ComponentName;

    const-class v8, Lcom/facebook/b/a/b;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/ec;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/b/a/b;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/intents/b;-><init>(Landroid/content/Context;Lcom/facebook/user/i;Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/c/s;Landroid/content/ComponentName;Lcom/facebook/b/a/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 560
    invoke-virtual {p0}, Lcom/facebook/orca/app/ec;->a()Lcom/facebook/orca/intents/b;

    move-result-object v0

    return-object v0
.end method
