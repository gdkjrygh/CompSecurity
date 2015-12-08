.class final Lcom/kik/n/a/b/h;
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
    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    .line 230
    iget-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    const-string v1, "url"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    const-string v1, "title"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    iget-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    const-string v1, "faviconUrl"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    iget-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    const-string v1, "timestamp"

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    iget-object v0, p0, Lcom/kik/n/a/b/h;->a:Ljava/util/HashMap;

    const-string v1, "uniqueId"

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 133
    new-instance v0, Lcom/kik/n/a/b/g;

    invoke-direct {v0}, Lcom/kik/n/a/b/g;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 133
    check-cast p2, Lcom/kik/n/a/b/g;

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

    iput-object v0, p2, Lcom/kik/n/a/b/g;->b:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/b/g;->c:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/b/g;->d:Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    invoke-interface {p1}, Lcom/b/a/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/b/g;->e:Ljava/lang/Long;

    goto :goto_1

    :pswitch_4
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/b/g;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 133
    check-cast p2, Lcom/kik/n/a/b/g;

    iget-object v0, p2, Lcom/kik/n/a/b/g;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p2, Lcom/kik/n/a/b/g;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/b/g;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p2, Lcom/kik/n/a/b/g;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_1
    iget-object v0, p2, Lcom/kik/n/a/b/g;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p2, Lcom/kik/n/a/b/g;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_2
    iget-object v0, p2, Lcom/kik/n/a/b/g;->e:Ljava/lang/Long;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-object v1, p2, Lcom/kik/n/a/b/g;->e:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v0, v2, v3, v4}, Lcom/b/a/o;->a(IJZ)V

    :cond_3
    iget-object v0, p2, Lcom/kik/n/a/b/g;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    iget-object v1, p2, Lcom/kik/n/a/b/g;->f:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v4}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_4
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x1

    return v0
.end method
