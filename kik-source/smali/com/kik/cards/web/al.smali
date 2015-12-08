.class final Lcom/kik/cards/web/al;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 387
    iput-object p1, p0, Lcom/kik/cards/web/al;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 387
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/kik/cards/web/al;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {p2}, Lcom/kik/cards/web/bf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/kik/cards/web/al;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->h(Lcom/kik/cards/web/CardsWebViewFragment;)V

    return-void
.end method
