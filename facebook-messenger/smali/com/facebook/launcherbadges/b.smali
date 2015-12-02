.class public Lcom/facebook/launcherbadges/b;
.super Lcom/facebook/inject/d;
.source "LauncherBadgesInterface.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/launcherbadges/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/launcherbadges/a;
    .locals 2

    .prologue
    .line 28
    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/launcherbadges/b;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 29
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/launcherbadges/b;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    .line 30
    const-class v0, Ljava/lang/Class;

    const-class v1, Lcom/facebook/launcherbadges/AppLaunchClass;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/launcherbadges/b;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 33
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    .line 38
    new-instance v1, Lcom/facebook/launcherbadges/c;

    invoke-direct {v1, v0}, Lcom/facebook/launcherbadges/c;-><init>(Ljava/util/Set;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/facebook/launcherbadges/b;->a()Lcom/facebook/launcherbadges/a;

    move-result-object v0

    return-object v0
.end method
