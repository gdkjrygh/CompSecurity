.class public Lcom/facebook/base/a/k;
.super Ljava/lang/Object;
.source "FbAppInitializer.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/a;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/executors/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/c;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-class v0, Lcom/facebook/base/a/k;

    iput-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    .line 62
    iput-object p1, p0, Lcom/facebook/base/a/k;->b:Lcom/facebook/common/executors/a;

    .line 64
    invoke-static {p2}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->c:Ljava/util/Set;

    .line 66
    invoke-static {p4}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->d:Ljava/util/Set;

    .line 68
    invoke-static {p6}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->e:Ljava/util/Set;

    .line 71
    invoke-static {p3}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->f:Ljava/util/Set;

    .line 73
    invoke-static {p5}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->g:Ljava/util/Set;

    .line 75
    invoke-static {p7}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/k;->h:Ljava/util/Set;

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/a/k;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/base/a/k;->b()V

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 109
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 110
    const-string v0, "FbAppInitializer"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 111
    iget-object v0, p0, Lcom/facebook/base/a/k;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/c;

    .line 112
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 113
    invoke-interface {v0}, Lcom/facebook/base/c;->a()V

    .line 114
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/a/k;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/d;

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 119
    invoke-interface {v0}, Lcom/facebook/base/d;->a()V

    .line 120
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 124
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    const-string v1, "High priority worker thread app initialization complete"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 126
    return-void
.end method

.method static synthetic b(Lcom/facebook/base/a/k;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/base/a/k;->c()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/base/a/k;)Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/base/a/k;->b:Lcom/facebook/common/executors/a;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 129
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 130
    const-string v0, "FbAppInitializer-LowPriUIThread"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 131
    iget-object v0, p0, Lcom/facebook/base/a/k;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/c;

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 133
    invoke-interface {v0}, Lcom/facebook/base/c;->a()V

    .line 134
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/a/k;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/d;

    .line 138
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 139
    invoke-interface {v0}, Lcom/facebook/base/d;->a()V

    .line 140
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_1

    .line 142
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 143
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    const-string v1, "Low priority main thread app initialization complete"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 145
    return-void
.end method

.method private d()V
    .locals 5

    .prologue
    .line 148
    const-wide/16 v0, 0xa

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 149
    const-string v0, "FbAppInitializer-LowPriWorkerThread"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 150
    iget-object v0, p0, Lcom/facebook/base/a/k;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/c;

    .line 151
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 152
    invoke-interface {v0}, Lcom/facebook/base/c;->a()V

    .line 153
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/a/k;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/d;

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 158
    invoke-interface {v0}, Lcom/facebook/base/d;->a()V

    .line 159
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_1

    .line 161
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 162
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    const-string v1, "Low priority worker thread app initialization complete"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/facebook/base/a/k;->a:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 164
    return-void
.end method

.method static synthetic d(Lcom/facebook/base/a/k;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/base/a/k;->d()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 86
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/facebook/base/a/k;->b:Lcom/facebook/common/executors/a;

    const-string v2, "FbAppInit"

    new-instance v3, Lcom/facebook/base/a/l;

    invoke-direct {v3, p0, v0}, Lcom/facebook/base/a/l;-><init>(Lcom/facebook/base/a/k;Lcom/google/common/d/a/ab;)V

    invoke-interface {v1, v2, v3}, Lcom/facebook/common/executors/a;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 105
    return-object v0
.end method
