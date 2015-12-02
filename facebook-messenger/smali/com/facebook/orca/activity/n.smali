.class public Lcom/facebook/orca/activity/n;
.super Ljava/lang/Object;
.source "MessengerLogoutHandler.java"

# interfaces
.implements Lcom/facebook/orca/auth/c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/c/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/s;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/activity/n;->a:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/facebook/orca/activity/n;->b:Lcom/facebook/c/s;

    .line 27
    return-void
.end method

.method private c()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/activity/n;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    const-string v1, "orca:loginparam:LoginFragmentState"

    const-class v2, Lcom/facebook/auth/login/LogoutFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    return-object v0
.end method

.method private d()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/activity/n;->c()Landroid/content/Intent;

    move-result-object v0

    .line 48
    sget-object v1, Lcom/facebook/auth/login/LogoutFragment;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 50
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/activity/n;->b:Lcom/facebook/c/s;

    invoke-direct {p0}, Lcom/facebook/orca/activity/n;->c()Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/activity/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/activity/n;->b:Lcom/facebook/c/s;

    invoke-direct {p0}, Lcom/facebook/orca/activity/n;->d()Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/activity/n;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 37
    return-void
.end method
