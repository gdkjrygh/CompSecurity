.class Lcom/facebook/orca/app/ep;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/f/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 712
    iput-object p1, p0, Lcom/facebook/orca/app/ep;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 712
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ep;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/fd;
    .locals 10

    .prologue
    .line 716
    new-instance v0, Lcom/facebook/orca/app/fd;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/bugreporter/g;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/bugreporter/g;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsMessengerBugReporterEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/app/ep;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/analytics/av;

    const-class v5, Lcom/facebook/orca/h/b;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/h/b;

    const-class v6, Lcom/facebook/common/w/q;

    const-class v7, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/app/ep;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/auth/b/b;

    const-class v8, Lcom/facebook/c/s;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/c/s;

    const-class v9, Lcom/facebook/orca/h/a;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/app/ep;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/h/a;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/orca/app/fd;-><init>(Landroid/content/Context;Lcom/facebook/bugreporter/g;Ljavax/inject/a;Lcom/facebook/analytics/av;Lcom/facebook/orca/h/b;Ljavax/inject/a;Lcom/facebook/auth/b/b;Lcom/facebook/c/s;Lcom/facebook/orca/h/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 712
    invoke-virtual {p0}, Lcom/facebook/orca/app/ep;->a()Lcom/facebook/orca/app/fd;

    move-result-object v0

    return-object v0
.end method
