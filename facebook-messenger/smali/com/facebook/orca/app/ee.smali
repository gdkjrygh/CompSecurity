.class Lcom/facebook/orca/app/ee;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/app/LoginReminderManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 513
    iput-object p1, p0, Lcom/facebook/orca/app/ee;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 513
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ee;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/app/LoginReminderManager;
    .locals 6

    .prologue
    .line 517
    new-instance v0, Lcom/facebook/orca/app/LoginReminderManager;

    iget-object v1, p0, Lcom/facebook/orca/app/ee;->a:Lcom/facebook/orca/app/dv;

    invoke-static {v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/orca/app/dv;)Landroid/app/Application;

    move-result-object v1

    const-class v2, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ee;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/b/b;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/ee;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    new-instance v4, Lcom/facebook/orca/notify/au;

    const-class v5, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/ee;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    invoke-direct {v4, v5}, Lcom/facebook/orca/notify/au;-><init>(Lcom/facebook/prefs/shared/d;)V

    const-class v5, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/ee;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/analytics/av;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/app/LoginReminderManager;-><init>(Landroid/content/Context;Lcom/facebook/auth/b/b;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/an;Lcom/facebook/analytics/av;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 513
    invoke-virtual {p0}, Lcom/facebook/orca/app/ee;->a()Lcom/facebook/orca/app/LoginReminderManager;

    move-result-object v0

    return-object v0
.end method
