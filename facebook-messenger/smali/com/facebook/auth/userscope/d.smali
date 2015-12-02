.class Lcom/facebook/auth/userscope/d;
.super Ljava/lang/Object;
.source "UserScope.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/userscope/b;

.field private final b:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/facebook/auth/userscope/b;Lcom/google/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Ljavax/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 160
    iput-object p1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p2, p0, Lcom/facebook/auth/userscope/d;->b:Lcom/google/inject/a;

    .line 162
    iput-object p3, p0, Lcom/facebook/auth/userscope/d;->c:Ljavax/inject/a;

    .line 163
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/userscope/b;Lcom/google/inject/a;Ljavax/inject/a;Lcom/facebook/auth/userscope/c;)V
    .locals 0

    .prologue
    .line 155
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/auth/userscope/d;-><init>(Lcom/facebook/auth/userscope/b;Lcom/google/inject/a;Ljavax/inject/a;)V

    return-void
.end method

.method private a(Lcom/facebook/inject/av;Lcom/facebook/auth/viewercontext/e;Ljava/util/Map;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/av;",
            "Lcom/facebook/auth/viewercontext/e;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/auth/userscope/d;->b:Lcom/google/inject/a;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 237
    # getter for: Lcom/facebook/auth/userscope/b;->c:Ljava/lang/Object;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$1000()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 238
    const/4 v0, 0x0

    .line 263
    :cond_0
    :goto_0
    return-object v0

    .line 240
    :cond_1
    if-nez v0, :cond_0

    .line 241
    const-class v0, Lcom/facebook/auth/userscope/b;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/av;->a(Ljava/lang/Class;)V

    .line 242
    iget-object v0, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v0}, Lcom/facebook/auth/userscope/b;->h(Lcom/facebook/auth/userscope/b;)Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/e;

    .line 243
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->h(Lcom/facebook/auth/userscope/b;)Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 247
    :try_start_0
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->a(Lcom/facebook/auth/userscope/b;)Lcom/facebook/inject/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/inject/n;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 249
    :try_start_1
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->c:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    .line 251
    :try_start_2
    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v2}, Lcom/facebook/auth/userscope/b;->a(Lcom/facebook/auth/userscope/b;)Lcom/facebook/inject/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/inject/n;->b()V

    .line 253
    if-nez v1, :cond_2

    .line 254
    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->b:Lcom/google/inject/a;

    # getter for: Lcom/facebook/auth/userscope/b;->c:Ljava/lang/Object;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$1000()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 259
    :goto_1
    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v2}, Lcom/facebook/auth/userscope/b;->h(Lcom/facebook/auth/userscope/b;)Ljava/lang/ThreadLocal;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 260
    const-class v0, Lcom/facebook/auth/userscope/b;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    move-object v0, v1

    .line 261
    goto :goto_0

    .line 251
    :catchall_0
    move-exception v1

    :try_start_3
    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v2}, Lcom/facebook/auth/userscope/b;->a(Lcom/facebook/auth/userscope/b;)Lcom/facebook/inject/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/inject/n;->b()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 259
    :catchall_1
    move-exception v1

    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v2}, Lcom/facebook/auth/userscope/b;->h(Lcom/facebook/auth/userscope/b;)Ljava/lang/ThreadLocal;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 260
    const-class v0, Lcom/facebook/auth/userscope/b;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    throw v1

    .line 256
    :cond_2
    :try_start_4
    iget-object v2, p0, Lcom/facebook/auth/userscope/d;->b:Lcom/google/inject/a;

    invoke-interface {p3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v0}, Lcom/facebook/auth/userscope/b;->a(Lcom/facebook/auth/userscope/b;)Lcom/facebook/inject/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/n;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 168
    if-nez v0, :cond_0

    .line 170
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Called user scoped provider outside of context scope"

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :cond_0
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->b(Lcom/facebook/auth/userscope/b;)V

    .line 175
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v2

    .line 176
    # getter for: Lcom/facebook/auth/userscope/b;->b:Lcom/google/common/a/fi;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$300()Lcom/google/common/a/fi;

    move-result-object v1

    const-class v3, Lcom/facebook/auth/userscope/UserScoped;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/av;->a(Ljava/util/Set;Ljava/lang/Class;)V

    .line 178
    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 179
    const-class v1, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/e;

    .line 181
    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    .line 182
    if-nez v1, :cond_5

    .line 183
    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->b()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    .line 186
    iget-object v3, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v3}, Lcom/facebook/auth/userscope/b;->c(Lcom/facebook/auth/userscope/b;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 187
    if-nez v1, :cond_2

    .line 188
    :try_start_0
    # getter for: Lcom/facebook/auth/userscope/b;->a:Ljava/lang/Class;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$500()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Called user scoped provider with no viewer. ViewerContextManager was created with no ViewerContext. Using EmptyViewerContextManager to return fake logged in instance."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v0}, Lcom/facebook/auth/userscope/b;->d(Lcom/facebook/auth/userscope/b;)Lcom/facebook/auth/userscope/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/userscope/a;->c()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v1

    .line 192
    iget-object v0, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v0}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 193
    if-nez v0, :cond_1

    .line 194
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 195
    iget-object v4, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v4}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->d(Lcom/facebook/auth/userscope/b;)Lcom/facebook/auth/userscope/a;

    move-result-object v1

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/auth/userscope/d;->a(Lcom/facebook/inject/av;Lcom/facebook/auth/viewercontext/e;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v3

    .line 227
    :goto_0
    return-object v0

    .line 200
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v1

    .line 201
    iget-object v4, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v4}, Lcom/facebook/auth/userscope/b;->f(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 203
    # getter for: Lcom/facebook/auth/userscope/b;->a:Ljava/lang/Class;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$500()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "Called user scoped provider with no viewer. Getting or creating instance according to creation time ViewerContext and old instance map."

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 205
    iget-object v4, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v4}, Lcom/facebook/auth/userscope/b;->f(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 206
    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/auth/userscope/d;->a(Lcom/facebook/inject/av;Lcom/facebook/auth/viewercontext/e;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v3

    goto :goto_0

    .line 217
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 207
    :cond_3
    :try_start_1
    iget-object v4, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v4}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 210
    # getter for: Lcom/facebook/auth/userscope/b;->a:Ljava/lang/Class;
    invoke-static {}, Lcom/facebook/auth/userscope/b;->access$500()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "Called user scoped provider with no viewer. Getting or creating instance using creation time ViewerContext and current instance map."

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 212
    iget-object v4, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v4}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 213
    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/auth/userscope/d;->a(Lcom/facebook/inject/av;Lcom/facebook/auth/viewercontext/e;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v3

    goto :goto_0

    .line 215
    :cond_4
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Called user scoped provider with no viewer. No instance map (current or old) exists for creation time ViewerContext."

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    :cond_5
    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v3

    .line 220
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->c(Lcom/facebook/auth/userscope/b;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 221
    :try_start_2
    iget-object v1, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v1}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 222
    if-nez v1, :cond_6

    .line 223
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 224
    iget-object v5, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v5}, Lcom/facebook/auth/userscope/b;->e(Lcom/facebook/auth/userscope/b;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    iget-object v3, p0, Lcom/facebook/auth/userscope/d;->a:Lcom/facebook/auth/userscope/b;

    invoke-static {v3}, Lcom/facebook/auth/userscope/b;->g(Lcom/facebook/auth/userscope/b;)V

    .line 227
    :cond_6
    invoke-direct {p0, v2, v0, v1}, Lcom/facebook/auth/userscope/d;->a(Lcom/facebook/inject/av;Lcom/facebook/auth/viewercontext/e;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v4

    goto/16 :goto_0

    .line 228
    :catchall_1
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
