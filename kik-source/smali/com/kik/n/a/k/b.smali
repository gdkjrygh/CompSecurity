.class final Lcom/kik/n/a/k/b;
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
    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/n/a/k/b;->a:Ljava/util/HashMap;

    .line 235
    iget-object v0, p0, Lcom/kik/n/a/k/b;->a:Ljava/util/HashMap;

    const-string v1, "enterKeySend"

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    iget-object v0, p0, Lcom/kik/n/a/k/b;->a:Ljava/util/HashMap;

    const-string v1, "bubbleColor"

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 159
    new-instance v0, Lcom/kik/n/a/k/a;

    invoke-direct {v0}, Lcom/kik/n/a/k/a;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/b/a/k;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 159
    check-cast p2, Lcom/kik/n/a/k/a;

    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    invoke-interface {p1, v0, p0}, Lcom/b/a/k;->a(ILcom/b/a/u;)V

    :goto_1
    invoke-interface {p1, p0}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    goto :goto_0

    :sswitch_0
    invoke-interface {p1}, Lcom/b/a/k;->d()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/k/a;->b:Ljava/lang/Boolean;

    goto :goto_1

    :sswitch_1
    invoke-interface {p1}, Lcom/b/a/k;->f()I

    move-result v0

    invoke-static {v0}, Lcom/kik/n/a/k/a$a;->a(I)Lcom/kik/n/a/k/a$a;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/n/a/k/a;->c:Lcom/kik/n/a/k/a$a;

    goto :goto_1

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0xa -> :sswitch_0
        0xb -> :sswitch_1
    .end sparse-switch
.end method

.method public final synthetic a(Lcom/b/a/o;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 159
    check-cast p2, Lcom/kik/n/a/k/a;

    iget-object v0, p2, Lcom/kik/n/a/k/a;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    iget-object v1, p2, Lcom/kik/n/a/k/a;->b:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(IZZ)V

    :cond_0
    iget-object v0, p2, Lcom/kik/n/a/k/a;->c:Lcom/kik/n/a/k/a$a;

    if-eqz v0, :cond_1

    const/16 v0, 0xb

    iget-object v1, p2, Lcom/kik/n/a/k/a;->c:Lcom/kik/n/a/k/a$a;

    iget v1, v1, Lcom/kik/n/a/k/a$a;->w:I

    invoke-interface {p1, v0, v1, v2}, Lcom/b/a/o;->a(IIZ)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x1

    return v0
.end method
