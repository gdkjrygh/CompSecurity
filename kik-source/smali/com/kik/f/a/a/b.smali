.class final Lcom/kik/f/a/a/b;
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
    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    .line 286
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "platform"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "type"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "byline"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "url"

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "iconUrl"

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "appName"

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    iget-object v0, p0, Lcom/kik/f/a/a/b;->a:Ljava/util/HashMap;

    const-string v1, "contentFileType"

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 171
    new-instance v0, Lcom/kik/f/a/a/a;

    invoke-direct {v0}, Lcom/kik/f/a/a/a;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 171
    check-cast p2, Lcom/kik/f/a/a/a;

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

    iput-object v0, p2, Lcom/kik/f/a/a/a;->b:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->c:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->d:Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->f:Ljava/lang/String;

    goto :goto_1

    :pswitch_5
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    goto :goto_1

    :pswitch_6
    invoke-interface {p1}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/f/a/a/a;->h:Ljava/lang/String;

    goto :goto_1

    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 171
    check-cast p2, Lcom/kik/f/a/a/a;

    iget-object v0, p2, Lcom/kik/f/a/a/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p2, Lcom/kik/f/a/a/a;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_0
    iget-object v0, p2, Lcom/kik/f/a/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p2, Lcom/kik/f/a/a/a;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_1
    iget-object v0, p2, Lcom/kik/f/a/a/a;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p2, Lcom/kik/f/a/a/a;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_2
    iget-object v0, p2, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p2}, Lcom/b/a/x;-><init>(Lcom/b/a/n;)V

    throw v0

    :cond_3
    const/4 v0, 0x4

    iget-object v1, p2, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    iget-object v0, p2, Lcom/kik/f/a/a/a;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    iget-object v1, p2, Lcom/kik/f/a/a/a;->f:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_4
    iget-object v0, p2, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    if-nez v0, :cond_5

    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p2}, Lcom/b/a/x;-><init>(Lcom/b/a/n;)V

    throw v0

    :cond_5
    const/4 v0, 0x6

    iget-object v1, p2, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    iget-object v0, p2, Lcom/kik/f/a/a/a;->h:Ljava/lang/String;

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    iget-object v1, p2, Lcom/kik/f/a/a/a;->h:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(ILjava/lang/String;Z)V

    :cond_6
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 171
    check-cast p1, Lcom/kik/f/a/a/a;

    iget-object v0, p1, Lcom/kik/f/a/a/a;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/kik/f/a/a/a;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
