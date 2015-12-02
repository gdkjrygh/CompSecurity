.class Lcom/facebook/launcherbadges/c;
.super Ljava/lang/Object;
.source "LauncherBadgesManager.java"

# interfaces
.implements Lcom/facebook/launcherbadges/a;


# instance fields
.field private final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/launcherbadges/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/launcherbadges/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {p1}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/launcherbadges/c;->a:Lcom/google/common/a/fi;

    .line 21
    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/common/w/q;
    .locals 4

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    .line 27
    iget-object v1, p0, Lcom/facebook/launcherbadges/c;->a:Lcom/google/common/a/fi;

    invoke-virtual {v1}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/launcherbadges/a;

    .line 29
    invoke-interface {v0, p1}, Lcom/facebook/launcherbadges/a;->a(I)Lcom/facebook/common/w/q;

    move-result-object v0

    .line 31
    sget-object v3, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v3, :cond_1

    .line 33
    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    .line 39
    :cond_0
    return-object v1

    .line 34
    :cond_1
    sget-object v3, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-ne v0, v3, :cond_2

    sget-object v3, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    if-ne v1, v3, :cond_2

    :goto_1
    move-object v1, v0

    .line 37
    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method
