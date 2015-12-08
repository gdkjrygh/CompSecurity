.class final Lcom/kik/cards/web/usermedia/g;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/usermedia/PhotoPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/usermedia/g;->a:Lcom/kik/cards/web/plugin/a;

    iput-object p3, p0, Lcom/kik/cards/web/usermedia/g;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 517
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/g;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x191

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 518
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->e(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Z

    .line 519
    return-void
.end method

.method public final c()V
    .locals 7

    .prologue
    .line 489
    new-instance v6, Lcom/kik/cards/web/usermedia/b;

    iget-object v0, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090148

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0902ba

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0901b4

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v0, v1, v2}, Lcom/kik/cards/web/usermedia/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->c(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Lcom/kik/cards/web/usermedia/j;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/kik/cards/web/usermedia/j;->a(Lcom/kik/cards/web/usermedia/b;)V

    .line 491
    new-instance v0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;

    iget-object v1, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    iget-object v2, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/usermedia/g;->a:Lcom/kik/cards/web/plugin/a;

    iget-object v4, p0, Lcom/kik/cards/web/usermedia/g;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v5}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->d(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;-><init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Landroid/content/Context;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    iget-object v1, p0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Lcom/kik/m/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kik/m/q;->a(Ljava/util/concurrent/Callable;)Lcom/kik/g/p;

    move-result-object v0

    .line 493
    new-instance v1, Lcom/kik/cards/web/usermedia/h;

    invoke-direct {v1, p0, v6}, Lcom/kik/cards/web/usermedia/h;-><init>(Lcom/kik/cards/web/usermedia/g;Lcom/kik/cards/web/usermedia/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 509
    return-void
.end method
