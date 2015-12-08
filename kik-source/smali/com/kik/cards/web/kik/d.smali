.class final Lcom/kik/cards/web/kik/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/plugin/a;

.field final synthetic c:Lcom/kik/cards/web/kik/KikPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/kik/KikPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/kik/cards/web/kik/d;->c:Lcom/kik/cards/web/kik/KikPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/kik/d;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/kik/d;->b:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 113
    check-cast p1, Lkik/a/d/k;

    iget-object v0, p0, Lcom/kik/cards/web/kik/d;->c:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lcom/kik/cards/web/kik/KikPlugin;)Lcom/kik/cards/web/kik/h;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/kik/d;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/kik/cards/web/kik/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kik/cards/web/kik/d;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 124
    iget-object v0, p0, Lcom/kik/cards/web/kik/d;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x194

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 125
    return-void
.end method
