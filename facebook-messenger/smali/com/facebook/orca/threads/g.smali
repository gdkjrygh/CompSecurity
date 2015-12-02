.class public Lcom/facebook/orca/threads/g;
.super Ljava/lang/Object;
.source "MergedFolderManager.java"


# static fields
.field private static final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/common/a/ex;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ex",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/auth/b/b;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 25
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    sget-object v2, Lcom/facebook/orca/threads/FolderType;->e:Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    sget-object v2, Lcom/facebook/orca/threads/FolderType;->e:Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threads/g;->a:Lcom/google/common/a/ev;

    .line 31
    sget-object v0, Lcom/facebook/orca/threads/g;->a:Lcom/google/common/a/ev;

    invoke-static {v0}, Lcom/facebook/orca/threads/g;->a(Ljava/util/Map;)Lcom/google/common/a/ex;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threads/g;->b:Lcom/google/common/a/ex;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/orca/threads/g;->c:Lcom/facebook/auth/b/b;

    .line 55
    iput-object p2, p0, Lcom/facebook/orca/threads/g;->d:Ljavax/inject/a;

    .line 56
    iput-object p3, p0, Lcom/facebook/orca/threads/g;->e:Ljavax/inject/a;

    .line 57
    iput-object p4, p0, Lcom/facebook/orca/threads/g;->f:Ljavax/inject/a;

    .line 58
    return-void
.end method

.method private static a(Ljava/util/Map;)Lcom/google/common/a/ex;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 36
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v1

    .line 38
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 39
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;

    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/FolderName;
    .locals 2

    .prologue
    .line 68
    invoke-virtual {p1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 71
    :goto_0
    return-object v0

    .line 70
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {p1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    goto :goto_0

    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to get the folder for an invalid ThreadCriteria"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/FolderName;
    .locals 2

    .prologue
    .line 102
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    .line 103
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    move-object v1, v0

    .line 107
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-static {v1, v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0

    .line 105
    :cond_0
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    move-object v1, v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;
    .locals 2

    .prologue
    .line 85
    invoke-static {p1}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    move-object v1, v0

    .line 90
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-static {v1, v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    move-object v1, v0

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threads/g;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 119
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 117
    goto :goto_0

    :cond_1
    move v0, v1

    .line 119
    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 2

    .prologue
    .line 146
    sget-object v0, Lcom/facebook/orca/threads/g;->b:Lcom/google/common/a/ex;

    invoke-virtual {v0}, Lcom/google/common/a/ex;->l()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Lcom/facebook/orca/threads/FolderType;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threads/g;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threads/g;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/orca/threads/FolderType;->e:Lcom/facebook/orca/threads/FolderType;

    .line 134
    :goto_0
    return-object v0

    .line 130
    :cond_0
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    goto :goto_0

    .line 134
    :cond_1
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->a:Lcom/facebook/orca/threads/FolderType;

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 2

    .prologue
    .line 157
    sget-object v0, Lcom/facebook/orca/threads/g;->a:Lcom/google/common/a/ev;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation

    .prologue
    .line 167
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 168
    sget-object v0, Lcom/facebook/orca/threads/g;->b:Lcom/google/common/a/ex;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    .line 171
    iget-object v1, p0, Lcom/facebook/orca/threads/g;->f:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 173
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 175
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
