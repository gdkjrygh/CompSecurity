.class final Lcom/kik/cards/web/usermedia/h;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/usermedia/b;

.field final synthetic b:Lcom/kik/cards/web/usermedia/g;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/usermedia/g;Lcom/kik/cards/web/usermedia/b;)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/h;->b:Lcom/kik/cards/web/usermedia/g;

    iput-object p2, p0, Lcom/kik/cards/web/usermedia/h;->a:Lcom/kik/cards/web/usermedia/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 504
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/h;->a:Lcom/kik/cards/web/usermedia/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/usermedia/b;->a(Ljava/lang/Throwable;)V

    .line 505
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/h;->b:Lcom/kik/cards/web/usermedia/g;

    iget-object v0, v0, Lcom/kik/cards/web/usermedia/g;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 506
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/h;->b:Lcom/kik/cards/web/usermedia/g;

    iget-object v0, v0, Lcom/kik/cards/web/usermedia/g;->c:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->e(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Z

    .line 507
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 498
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/h;->a:Lcom/kik/cards/web/usermedia/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/usermedia/b;->a(Ljava/lang/Object;)V

    .line 499
    return-void
.end method
