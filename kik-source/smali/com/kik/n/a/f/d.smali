.class final Lcom/kik/n/a/f/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/u;


# instance fields
.field final a:Ljava/util/HashMap;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/n/a/f/d;->a:Ljava/util/HashMap;

    .line 242
    iget-object v0, p0, Lcom/kik/n/a/f/d;->a:Ljava/util/HashMap;

    const-string v1, "title"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    iget-object v0, p0, Lcom/kik/n/a/f/d;->a:Ljava/util/HashMap;

    const-string v1, "icon"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    iget-object v0, p0, Lcom/kik/n/a/f/d;->a:Ljava/util/HashMap;

    const-string v1, "storeLink"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    iget-object v0, p0, Lcom/kik/n/a/f/d;->a:Ljava/util/HashMap;

    const-string v1, "sticker"

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 138
    new-instance v0, Lcom/kik/n/a/f/c;

    invoke-direct {v0}, Lcom/kik/n/a/f/c;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 138
    check-cast p2, Lcom/kik/n/a/f/c;

    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    :goto_0
    packed-switch v0, :pswitch_data_0

    invoke-interface {p1, v0, p0}, Lcom/b/a/k;->a(ILcom/b/a/u;)V

    :goto_1
    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/f/c;->b:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/f/c;->c:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/f/c;->d:Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    iget-object v0, p2, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p2, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {}, Lcom/kik/n/a/f/a;->b()Lcom/b/a/u;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 138
    check-cast p2, Lcom/kik/n/a/f/c;

    iget-object v0, p2, Lcom/kik/n/a/f/c;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/kik/n/a/f/c;->b:Ljava/lang/String;

    invoke-interface {p1, v4, v0, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/f/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p2, Lcom/kik/n/a/f/c;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_1
    iget-object v0, p2, Lcom/kik/n/a/f/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p2, Lcom/kik/n/a/f/c;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_2
    iget-object v0, p2, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/kik/n/a/f/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/f/a;

    if-eqz v0, :cond_3

    const/4 v2, 0x4

    invoke-static {}, Lcom/kik/n/a/f/a;->b()Lcom/b/a/u;

    move-result-object v3

    invoke-interface {p1, v2, v0, v3, v4}, Lcom/b/a/o;->a(ILjava/lang/Object;Lcom/b/a/u;Z)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 138
    const/4 v0, 0x1

    return v0
.end method
