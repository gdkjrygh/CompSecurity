.class public Lcom/facebook/inject/g;
.super Ljava/lang/Object;
.source "BinderImpl.java"

# interfaces
.implements Lcom/facebook/inject/e;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/h;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Lcom/facebook/inject/aj;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/q;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/au;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->a:Ljava/util/List;

    .line 40
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->b:Ljava/util/Map;

    .line 41
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->c:Ljava/util/List;

    .line 42
    return-void
.end method

.method private e(Lcom/google/inject/a;)Lcom/facebook/inject/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/h",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 99
    new-instance v0, Lcom/facebook/inject/h;

    invoke-direct {v0}, Lcom/facebook/inject/h;-><init>()V

    .line 100
    invoke-virtual {v0, p1}, Lcom/facebook/inject/h;->a(Lcom/google/inject/a;)V

    .line 101
    iget-object v1, p0, Lcom/facebook/inject/g;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    return-object v0
.end method

.method private f(Lcom/google/inject/a;)Lcom/facebook/inject/aj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/inject/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/aj;

    .line 107
    if-nez v0, :cond_0

    .line 108
    new-instance v0, Lcom/facebook/inject/aj;

    invoke-direct {v0, p1}, Lcom/facebook/inject/aj;-><init>(Lcom/google/inject/a;)V

    .line 109
    iget-object v1, p0, Lcom/facebook/inject/g;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_0
    return-object v0
.end method

.method private g(Ljava/lang/Class;)Lcom/facebook/inject/a/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/a/f;"
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/inject/g;->g:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 137
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->g:Ljava/util/Map;

    .line 139
    :cond_0
    new-instance v0, Lcom/facebook/inject/r;

    invoke-direct {v0}, Lcom/facebook/inject/r;-><init>()V

    .line 140
    iget-object v1, p0, Lcom/facebook/inject/g;->g:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    new-instance v1, Lcom/facebook/inject/a/f;

    invoke-direct {v1, v0}, Lcom/facebook/inject/a/f;-><init>(Lcom/facebook/inject/r;)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/a/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 46
    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/inject/g;->e(Lcom/google/inject/a;)Lcom/facebook/inject/h;

    move-result-object v0

    .line 47
    new-instance v1, Lcom/facebook/inject/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/inject/a/b;-><init>(Lcom/facebook/inject/h;)V

    return-object v1
.end method

.method public a(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/a/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/inject/g;->e(Lcom/google/inject/a;)Lcom/facebook/inject/h;

    move-result-object v0

    .line 53
    new-instance v1, Lcom/facebook/inject/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/inject/a/b;-><init>(Lcom/facebook/inject/h;)V

    return-object v1
.end method

.method public a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;
    .locals 3

    .prologue
    .line 184
    instance-of v0, p1, Lcom/facebook/inject/af;

    if-eqz v0, :cond_0

    .line 185
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Library modules cannot be installed (only required): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/inject/g;->g(Ljava/lang/Class;)Lcom/facebook/inject/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/a/f;->a()Lcom/facebook/inject/a/f;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/h;",
            ">;"
        }
    .end annotation

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/inject/g;->a:Ljava/util/List;

    return-object v0
.end method

.method public a(Ljava/lang/Class;Lcom/facebook/inject/au;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/au;",
            ")V"
        }
    .end annotation

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/inject/g;->h:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 83
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->h:Ljava/util/Map;

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->h:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    return-void
.end method

.method public b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/a/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 58
    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/inject/g;->e(Lcom/google/inject/a;)Lcom/facebook/inject/h;

    move-result-object v0

    .line 59
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Z)V

    .line 60
    new-instance v1, Lcom/facebook/inject/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/inject/a/b;-><init>(Lcom/facebook/inject/h;)V

    return-object v1
.end method

.method public b(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/a/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/facebook/inject/g;->e(Lcom/google/inject/a;)Lcom/facebook/inject/h;

    move-result-object v0

    .line 66
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/inject/h;->a(Z)V

    .line 67
    new-instance v1, Lcom/facebook/inject/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/inject/a/b;-><init>(Lcom/facebook/inject/h;)V

    return-object v1
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Lcom/facebook/inject/aj;",
            ">;"
        }
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/inject/g;->b:Ljava/util/Map;

    return-object v0
.end method

.method public c(Lcom/google/inject/a;)Lcom/facebook/inject/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 77
    invoke-direct {p0, p1}, Lcom/facebook/inject/g;->f(Lcom/google/inject/a;)Lcom/facebook/inject/aj;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Lcom/facebook/inject/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/inject/aj",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 72
    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/inject/g;->f(Lcom/google/inject/a;)Lcom/facebook/inject/aj;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/inject/g;->e:Ljava/util/Set;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/inject/g;->e:Ljava/util/Set;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public d(Lcom/google/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 125
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 128
    return-void
.end method

.method public d(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 117
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->d:Ljava/util/Set;

    invoke-static {p1}, Lcom/google/inject/a;->a(Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 120
    return-void
.end method

.method public e(Ljava/lang/Class;)Lcom/facebook/inject/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/a/e;"
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/inject/g;->e:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 155
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->e:Ljava/util/Set;

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 158
    invoke-direct {p0, p1}, Lcom/facebook/inject/g;->g(Ljava/lang/Class;)Lcom/facebook/inject/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/a/f;->a()Lcom/facebook/inject/a/f;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/inject/g;->f:Ljava/util/Set;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/inject/g;->f:Ljava/util/Set;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;)",
            "Lcom/facebook/inject/a/e;"
        }
    .end annotation

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/inject/g;->f:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 164
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/g;->f:Ljava/util/Set;

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 167
    invoke-direct {p0, p1}, Lcom/facebook/inject/g;->g(Ljava/lang/Class;)Lcom/facebook/inject/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/a/f;->a()Lcom/facebook/inject/a/f;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/inject/g;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/q;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/inject/g;->g:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 147
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    .line 149
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->g:Ljava/util/Map;

    goto :goto_0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/au;",
            ">;"
        }
    .end annotation

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/inject/g;->h:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/g;->h:Ljava/util/Map;

    goto :goto_0
.end method
