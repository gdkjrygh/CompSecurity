.class final Lkik/android/b/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/b/a;


# direct methods
.method constructor <init>(Lkik/android/b/a;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lkik/android/b/d;->b:Lkik/android/b/a;

    iput-object p2, p0, Lkik/android/b/d;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 105
    check-cast p1, Ljava/util/Map;

    invoke-super {p0}, Lcom/kik/g/r;->c()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/b/a$a;

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lkik/android/b/a$a;->a:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkik/android/b/d;->b:Lkik/android/b/a;

    invoke-static {v2}, Lkik/android/b/a;->a(Lkik/android/b/a;)Lkik/android/b/s;

    move-result-object v2

    iget-object v3, v0, Lkik/android/b/a$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lkik/android/b/s;->d(Ljava/lang/String;)Lcom/kik/g/p;

    :cond_2
    iget-boolean v2, v0, Lkik/android/b/a$a;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lkik/android/b/d;->b:Lkik/android/b/a;

    invoke-static {v2}, Lkik/android/b/a;->a(Lkik/android/b/a;)Lkik/android/b/s;

    move-result-object v2

    iget-object v3, v0, Lkik/android/b/a$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lkik/android/b/s;->g(Ljava/lang/String;)Lcom/kik/g/p;

    :cond_3
    iget-object v2, v0, Lkik/android/b/a$a;->d:[B

    if-eqz v2, :cond_1

    iget-object v2, v0, Lkik/android/b/a$a;->e:[B

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkik/android/b/d;->b:Lkik/android/b/a;

    invoke-static {v2}, Lkik/android/b/a;->a(Lkik/android/b/a;)Lkik/android/b/s;

    move-result-object v2

    iget-object v3, v0, Lkik/android/b/a$a;->e:[B

    iget-object v4, v0, Lkik/android/b/a$a;->d:[B

    iget-object v0, v0, Lkik/android/b/a$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v0}, Lkik/android/b/s;->a([B[BLjava/lang/String;)Lcom/kik/g/p;

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lkik/android/b/d;->b:Lkik/android/b/a;

    invoke-static {v0}, Lkik/android/b/a;->b(Lkik/android/b/a;)Lkik/a/e/v;

    move-result-object v0

    const-string v1, "XDATA_CARD_PERMISSIONS_MIGRATED"

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    iget-object v0, p0, Lkik/android/b/d;->a:Lcom/kik/g/p;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lkik/android/b/d;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 138
    return-void
.end method
