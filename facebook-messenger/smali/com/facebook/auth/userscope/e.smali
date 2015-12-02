.class public Lcom/facebook/auth/userscope/e;
.super Ljava/lang/Object;
.source "ViewerContextManagerForUserScope.java"

# interfaces
.implements Lcom/facebook/auth/viewercontext/e;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/auth/viewercontext/ViewerContext;

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/auth/userscope/e;

    sput-object v0, Lcom/facebook/auth/userscope/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/auth/viewercontext/e;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/facebook/auth/userscope/f;

    invoke-direct {v0, p0}, Lcom/facebook/auth/userscope/f;-><init>(Lcom/facebook/auth/userscope/e;)V

    iput-object v0, p0, Lcom/facebook/auth/userscope/e;->e:Ljava/lang/ThreadLocal;

    .line 39
    iput-object p1, p0, Lcom/facebook/auth/userscope/e;->b:Lcom/facebook/auth/b/b;

    .line 40
    invoke-interface {p2}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 41
    invoke-interface {p1}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    invoke-interface {p1}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    .line 46
    :goto_0
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    const/4 v0, 0x0

    .line 60
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    goto :goto_0
.end method

.method public a(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 1

    .prologue
    .line 71
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 66
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    return-void
.end method

.method public c()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 76
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 77
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 78
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 114
    :cond_0
    :goto_0
    return-object v0

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 84
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 85
    if-nez v0, :cond_2

    .line 88
    sget-object v0, Lcom/facebook/auth/userscope/e;->a:Ljava/lang/Class;

    const-string v1, "User no longer logged in. Original uid: %s, viewer context: null, is_logged_in: %s. Returning original viewer context."

    new-array v2, v6, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/facebook/auth/userscope/e;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v3}, Lcom/facebook/auth/b/b;->b()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 99
    sget-object v1, Lcom/facebook/auth/userscope/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User no longer logged in. Original uid: %s, viewer context uid: %s, is_logged_in: %s. Returning original viewer context."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/auth/userscope/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    goto :goto_0

    .line 114
    :cond_3
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->c:Lcom/facebook/auth/viewercontext/ViewerContext;

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/auth/userscope/e;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 126
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 127
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 129
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 130
    return-void
.end method
