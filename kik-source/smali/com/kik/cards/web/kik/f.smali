.class final Lcom/kik/cards/web/kik/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/kik/KikMessageParcelable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/plugin/a;

.field final synthetic d:Lcom/kik/cards/web/kik/KikPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/kik/KikPlugin;Lcom/kik/cards/web/kik/KikMessageParcelable;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 319
    iput-object p1, p0, Lcom/kik/cards/web/kik/f;->d:Lcom/kik/cards/web/kik/KikPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/kik/f;->a:Lcom/kik/cards/web/kik/KikMessageParcelable;

    iput-object p3, p0, Lcom/kik/cards/web/kik/f;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/kik/cards/web/kik/f;->c:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 319
    check-cast p1, Lcom/kik/cards/web/av$a;

    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->a:Lcom/kik/cards/web/kik/KikMessageParcelable;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kik/cards/web/kik/KikMessageParcelable;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->a:Lcom/kik/cards/web/kik/KikMessageParcelable;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/kik/f;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kik/cards/web/kik/KikMessageParcelable;->k:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->d:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lcom/kik/cards/web/kik/KikPlugin;)Lcom/kik/cards/web/kik/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/kik/f;->a:Lcom/kik/cards/web/kik/KikMessageParcelable;

    invoke-interface {v0, v1}, Lcom/kik/cards/web/kik/h;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/kik/g;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/kik/g;-><init>(Lcom/kik/cards/web/kik/f;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 346
    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->d:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->b(Lcom/kik/cards/web/kik/KikPlugin;)Z

    .line 348
    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->c:Lcom/kik/cards/web/plugin/a;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/kik/cards/web/kik/f;->c:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 351
    :cond_0
    return-void
.end method
