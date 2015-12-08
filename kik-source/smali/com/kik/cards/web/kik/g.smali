.class final Lcom/kik/cards/web/kik/g;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/kik/f;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/kik/f;)V
    .locals 0

    .prologue
    .line 330
    iput-object p1, p0, Lcom/kik/cards/web/kik/g;->a:Lcom/kik/cards/web/kik/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Lcom/kik/cards/web/kik/g;->a:Lcom/kik/cards/web/kik/f;

    iget-object v0, v0, Lcom/kik/cards/web/kik/f;->d:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->b(Lcom/kik/cards/web/kik/KikPlugin;)Z

    .line 335
    iget-object v0, p0, Lcom/kik/cards/web/kik/g;->a:Lcom/kik/cards/web/kik/f;

    iget-object v0, v0, Lcom/kik/cards/web/kik/f;->c:Lcom/kik/cards/web/plugin/a;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/kik/cards/web/kik/g;->a:Lcom/kik/cards/web/kik/f;

    iget-object v0, v0, Lcom/kik/cards/web/kik/f;->c:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 338
    :cond_0
    return-void
.end method
