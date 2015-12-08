.class final Lcom/kik/android/stickers/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/android/stickers/c;


# direct methods
.method constructor <init>(Lcom/kik/android/stickers/c;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/kik/android/stickers/e;->b:Lcom/kik/android/stickers/c;

    iput-object p2, p0, Lcom/kik/android/stickers/e;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 171
    check-cast p1, Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/f/c;

    new-instance v3, Lkik/a/d/x;

    invoke-direct {v3, v0}, Lkik/a/d/x;-><init>(Lcom/kik/n/a/f/c;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/kik/android/stickers/c;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/x;

    invoke-virtual {v0}, Lkik/a/d/x;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/kik/android/stickers/e;->b:Lcom/kik/android/stickers/c;

    invoke-static {v3}, Lcom/kik/android/stickers/c;->a(Lcom/kik/android/stickers/c;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v3, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/kik/android/stickers/e;->b:Lcom/kik/android/stickers/c;

    invoke-virtual {v0}, Lcom/kik/android/stickers/c;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/x;

    invoke-static {v0}, Lcom/kik/android/stickers/c;->b(Lkik/a/d/x;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/kik/android/stickers/e;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 204
    invoke-static {}, Lcom/kik/android/stickers/c;->c()Lorg/c/b;

    move-result-object v0

    const-string v1, "Failed to load sticker packs"

    invoke-interface {v0, v1, p1}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    iget-object v0, p0, Lcom/kik/android/stickers/e;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 206
    return-void
.end method
