.class Lcom/facebook/orca/app/en;
.super Lcom/facebook/inject/d;
.source "MessengerAppModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/activity/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/dv;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/dv;)V
    .locals 0

    .prologue
    .line 501
    iput-object p1, p0, Lcom/facebook/orca/app/en;->a:Lcom/facebook/orca/app/dv;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V
    .locals 0

    .prologue
    .line 501
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/en;-><init>(Lcom/facebook/orca/app/dv;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/activity/m;
    .locals 5

    .prologue
    .line 505
    new-instance v3, Lcom/facebook/orca/activity/m;

    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/en;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    const-class v1, Lcom/facebook/orca/c/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/en;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/c/a;

    const-class v2, Landroid/content/ComponentName;

    const-class v4, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/app/en;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ComponentName;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/activity/m;-><init>(Lcom/facebook/orca/nux/h;Lcom/facebook/orca/c/a;Landroid/content/ComponentName;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 501
    invoke-virtual {p0}, Lcom/facebook/orca/app/en;->a()Lcom/facebook/orca/activity/m;

    move-result-object v0

    return-object v0
.end method
