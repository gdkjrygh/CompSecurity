.class public Lcom/facebook/auth/login/y;
.super Ljava/lang/Object;
.source "DefaultLaunchAuthActivityUtil.java"

# interfaces
.implements Lcom/facebook/auth/login/al;


# instance fields
.field private final a:Lcom/facebook/c/s;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/c/s;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/c/s;",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/auth/login/y;->a:Lcom/facebook/c/s;

    .line 20
    iput-object p2, p0, Lcom/facebook/auth/login/y;->b:Ljava/lang/Class;

    .line 21
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 25
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/auth/login/y;->b:Ljava/lang/Class;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 26
    const-string v1, "orca:loginparam:LoginFragmentState"

    const-class v2, Lcom/facebook/auth/login/LogoutFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    return-object v0
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/auth/login/y;->a:Lcom/facebook/c/s;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/y;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 33
    return-void
.end method

.method public b(Landroid/content/Context;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 37
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/auth/login/y;->b:Ljava/lang/Class;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 38
    const-string v1, "orca:loginparam:LoginFragmentState"

    const-class v2, Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    return-object v0
.end method

.method public b(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/auth/login/y;->a:Lcom/facebook/c/s;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/login/y;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 45
    return-void
.end method
