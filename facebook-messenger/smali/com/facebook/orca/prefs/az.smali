.class public Lcom/facebook/orca/prefs/az;
.super Ljava/lang/Object;
.source "UiCounters.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Lcom/facebook/orca/prefs/ba;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/prefs/az;->a:Lcom/facebook/prefs/shared/d;

    .line 33
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/prefs/az;->b:Ljava/util/WeakHashMap;

    .line 34
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/orca/prefs/az;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/ba;

    .line 157
    invoke-interface {v0, p1, p2}, Lcom/facebook/orca/prefs/ba;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 159
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 162
    sget-object v0, Lcom/facebook/orca/prefs/n;->L:Lcom/facebook/prefs/shared/ae;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 163
    if-eqz p2, :cond_0

    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 166
    :cond_0
    const-string v1, "/count"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 167
    return-object v0
.end method

.method private f(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 171
    sget-object v0, Lcom/facebook/orca/prefs/n;->L:Lcom/facebook/prefs/shared/ae;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 172
    if-eqz p2, :cond_0

    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 175
    :cond_0
    const-string v1, "/timestamp"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 176
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/facebook/orca/prefs/az;->a:Lcom/facebook/prefs/shared/d;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    return v0
.end method

.method public a(Lcom/facebook/orca/prefs/ba;)V
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/prefs/az;->b:Ljava/util/WeakHashMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 111
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/prefs/az;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 122
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 123
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 124
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 125
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    return-void
.end method

.method public b(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/prefs/az;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)J
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 76
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/prefs/az;->a:Lcom/facebook/prefs/shared/d;

    const-wide/16 v2, 0x0

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 96
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 97
    iget-object v1, p0, Lcom/facebook/orca/prefs/az;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 99
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 100
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/az;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method
