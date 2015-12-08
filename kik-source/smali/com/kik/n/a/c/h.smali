.class final Lcom/kik/n/a/c/h;
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
    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/n/a/c/h;->a:Ljava/util/HashMap;

    .line 232
    iget-object v0, p0, Lcom/kik/n/a/c/h;->a:Ljava/util/HashMap;

    const-string v1, "name"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    iget-object v0, p0, Lcom/kik/n/a/c/h;->a:Ljava/util/HashMap;

    const-string v1, "value"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 154
    new-instance v0, Lcom/kik/n/a/c/g;

    invoke-direct {v0}, Lcom/kik/n/a/c/g;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 154
    check-cast p2, Lcom/kik/n/a/c/g;

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
    invoke-interface {p1}, Lcom/b/a/k;->f()I

    move-result v0

    invoke-static {v0}, Lcom/kik/n/a/c/g$a;->a(I)Lcom/kik/n/a/c/g$a;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/g;->b:Lcom/kik/n/a/c/g$a;

    goto :goto_1

    :pswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->f()I

    move-result v0

    invoke-static {v0}, Lcom/kik/n/a/c/g$b;->a(I)Lcom/kik/n/a/c/g$b;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/c/g;->c:Lcom/kik/n/a/c/g$b;

    goto :goto_1

    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final bridge synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 154
    check-cast p2, Lcom/kik/n/a/c/g;

    iget-object v0, p2, Lcom/kik/n/a/c/g;->b:Lcom/kik/n/a/c/g$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p2, Lcom/kik/n/a/c/g;->b:Lcom/kik/n/a/c/g$a;

    iget v1, v1, Lcom/kik/n/a/c/g$a;->c:I

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(IIZ)V

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/c/g;->c:Lcom/kik/n/a/c/g$b;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p2, Lcom/kik/n/a/c/g;->c:Lcom/kik/n/a/c/g$b;

    iget v1, v1, Lcom/kik/n/a/c/g$b;->d:I

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(IIZ)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x1

    return v0
.end method
