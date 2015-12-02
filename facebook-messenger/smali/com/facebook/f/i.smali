.class Lcom/facebook/f/i;
.super Ljava/lang/Object;
.source "GkConfigurationComponent.java"

# interfaces
.implements Lcom/facebook/http/protocol/v;


# instance fields
.field final synthetic a:Lcom/facebook/f/g;


# direct methods
.method private constructor <init>(Lcom/facebook/f/g;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/f/i;->a:Lcom/facebook/f/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/f/g;Lcom/facebook/f/h;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/facebook/f/i;-><init>(Lcom/facebook/f/g;)V

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 66
    if-nez p1, :cond_0

    .line 75
    :goto_0
    return-void

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/facebook/f/i;->a:Lcom/facebook/f/g;

    invoke-static {v0}, Lcom/facebook/f/g;->c(Lcom/facebook/f/g;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 70
    sget-object v0, Lcom/facebook/f/n;->d:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 71
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 72
    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v3

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-interface {v1, v3, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    goto :goto_1

    .line 74
    :cond_1
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/f/i;->a:Lcom/facebook/f/g;

    invoke-static {v0}, Lcom/facebook/f/g;->a(Lcom/facebook/f/g;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/f/e;->a(Ljava/util/Set;)Lcom/google/common/a/fi;

    move-result-object v0

    .line 48
    new-instance v1, Lcom/facebook/f/b;

    sget-object v2, Lcom/facebook/f/c;->IS_NOT_SESSIONLESS:Lcom/facebook/f/c;

    invoke-direct {v1, v0, v2}, Lcom/facebook/f/b;-><init>(Lcom/google/common/a/fi;Lcom/facebook/f/c;)V

    .line 52
    iget-object v0, p0, Lcom/facebook/f/i;->a:Lcom/facebook/f/g;

    invoke-static {v0}, Lcom/facebook/f/g;->b(Lcom/facebook/f/g;)Lcom/facebook/f/a;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "gk"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    const-string v0, "gk"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 62
    invoke-direct {p0, v0}, Lcom/facebook/f/i;->a(Landroid/os/Bundle;)V

    .line 63
    return-void
.end method
