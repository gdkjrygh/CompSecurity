.class final Lcom/kik/cards/web/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 433
    iput-object p1, p0, Lcom/kik/cards/web/d;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 433
    check-cast p2, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/kik/cards/web/d;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lcom/kik/cards/web/CardsWebViewFragment;I)V

    return-void
.end method
