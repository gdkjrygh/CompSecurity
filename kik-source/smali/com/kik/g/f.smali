.class public final Lcom/kik/g/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/f$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/g/e;Lcom/kik/g/k;)Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 141
    new-instance v0, Lcom/kik/g/h;

    invoke-direct {v0, p0, p2}, Lcom/kik/g/h;-><init>(Lcom/kik/g/f;Lcom/kik/g/k;)V

    .line 150
    invoke-virtual {p0, p1, v0}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 152
    invoke-virtual {p2}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;
    .locals 3

    .prologue
    .line 72
    invoke-virtual {p1, p2}, Lcom/kik/g/e;->a(Lcom/kik/g/i;)Lcom/kik/g/e$a;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    new-instance v2, Lcom/kik/g/f$a;

    invoke-direct {v2, p1, p2, v0}, Lcom/kik/g/f$a;-><init>(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/e$a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    return-object p2
.end method

.method public final a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;
    .locals 1

    .prologue
    .line 89
    new-instance v0, Lcom/kik/g/g;

    invoke-direct {v0, p0, p2, p3}, Lcom/kik/g/g;-><init>(Lcom/kik/g/f;Lcom/kik/g/i;Lcom/kik/g/as;)V

    invoke-virtual {p0, p1, v0}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 160
    iget-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/f$a;

    .line 161
    iget-object v2, v0, Lcom/kik/g/f$a;->a:Lcom/kik/g/e;

    invoke-static {v0}, Lcom/kik/g/f$a;->a(Lcom/kik/g/f$a;)Lcom/kik/g/e$a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/e;->a(Lcom/kik/g/e$a;)V

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 165
    return-void
.end method

.method public final b(Lcom/kik/g/e;Lcom/kik/g/i;)V
    .locals 4

    .prologue
    .line 117
    iget-object v2, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    monitor-enter v2

    .line 118
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/f$a;

    .line 121
    iget-object v3, v0, Lcom/kik/g/f$a;->a:Lcom/kik/g/e;

    if-ne v3, p1, :cond_1

    iget-object v3, v0, Lcom/kik/g/f$a;->b:Lcom/kik/g/i;

    if-ne v3, p2, :cond_1

    .line 123
    invoke-static {v0}, Lcom/kik/g/f$a;->a(Lcom/kik/g/f$a;)Lcom/kik/g/e$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kik/g/e;->a(Lcom/kik/g/e$a;)V

    .line 125
    iget-object v0, p0, Lcom/kik/g/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 129
    :cond_0
    monitor-exit v2

    return-void

    .line 118
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 129
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
