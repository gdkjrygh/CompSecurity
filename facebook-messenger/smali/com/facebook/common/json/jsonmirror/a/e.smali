.class public Lcom/facebook/common/json/jsonmirror/a/e;
.super Lcom/facebook/common/json/jsonmirror/a/c;
.source "JMDynamicKeysDict.java"


# instance fields
.field private g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/common/json/jsonmirror/a/a;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;Z)V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/common/json/jsonmirror/a/c;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/common/json/jsonmirror/a/e;->g:Ljava/lang/Class;

    .line 30
    invoke-static {p1}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/e;->h:Lcom/facebook/common/json/jsonmirror/a/a;

    .line 31
    if-eqz p2, :cond_0

    .line 32
    const-class v0, Ljava/util/List;

    iput-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/e;->g:Ljava/lang/Class;

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 35
    iget-object v1, p0, Lcom/facebook/common/json/jsonmirror/a/e;->h:Lcom/facebook/common/json/jsonmirror/a/a;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v1, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-direct {v1, v0}, Lcom/facebook/common/json/jsonmirror/a/h;-><init>(Ljava/util/Set;)V

    iput-object v1, p0, Lcom/facebook/common/json/jsonmirror/a/e;->h:Lcom/facebook/common/json/jsonmirror/a/a;

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/json/jsonmirror/b;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/common/json/jsonmirror/d;

    iget-object v1, p0, Lcom/facebook/common/json/jsonmirror/a/e;->g:Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/d;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/common/w/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/common/w/s",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/common/w/s;

    iget-object v1, p0, Lcom/facebook/common/json/jsonmirror/a/e;->h:Lcom/facebook/common/json/jsonmirror/a/a;

    invoke-direct {v0, p1, v1}, Lcom/facebook/common/w/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;D)V
    .locals 1

    .prologue
    .line 96
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 97
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/e;->g:Ljava/lang/Class;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 82
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Lcom/facebook/common/json/jsonmirror/b;)V
    .locals 1

    .prologue
    .line 73
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 74
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-virtual {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 89
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 90
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-virtual {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/json/jsonmirror/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 103
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 104
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-virtual {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/json/jsonmirror/b;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 110
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 111
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-virtual {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 66
    instance-of v0, p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 67
    check-cast p1, Lcom/facebook/common/json/jsonmirror/d;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/facebook/common/json/jsonmirror/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    return v0
.end method
