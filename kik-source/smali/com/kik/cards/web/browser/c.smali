.class final Lcom/kik/cards/web/browser/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lcom/kik/cards/web/browser/WebHistoryPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/browser/WebHistoryPlugin;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/kik/cards/web/browser/c;->b:Lcom/kik/cards/web/browser/WebHistoryPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/browser/c;->a:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/kik/cards/web/browser/c;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/kik/cards/web/browser/c;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x1f4

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 98
    return-void
.end method
