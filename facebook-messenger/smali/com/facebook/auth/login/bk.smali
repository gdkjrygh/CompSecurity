.class public Lcom/facebook/auth/login/bk;
.super Lcom/facebook/auth/a/a;
.source "PreferencesCleaner.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/j;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ad;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ac;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/j;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/j;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ad;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/auth/a/a;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/auth/login/bk;->a:Lcom/facebook/prefs/shared/j;

    .line 28
    iput-object p2, p0, Lcom/facebook/auth/login/bk;->b:Ljava/util/Set;

    .line 29
    iput-object p3, p0, Lcom/facebook/auth/login/bk;->c:Ljava/util/Set;

    .line 30
    return-void
.end method


# virtual methods
.method public e()V
    .locals 3

    .prologue
    .line 34
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/bk;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ad;

    .line 36
    invoke-interface {v0}, Lcom/facebook/prefs/shared/ad;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/bk;->a:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;)V

    .line 39
    return-void
.end method

.method public f()V
    .locals 3

    .prologue
    .line 43
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 44
    iget-object v0, p0, Lcom/facebook/auth/login/bk;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ac;

    .line 45
    invoke-interface {v0}, Lcom/facebook/prefs/shared/ac;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/bk;->a:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;)V

    .line 48
    return-void
.end method
