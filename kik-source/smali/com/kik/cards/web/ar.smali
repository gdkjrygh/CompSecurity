.class final Lcom/kik/cards/web/ar;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/aq;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/aq;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/kik/cards/web/ar;->a:Lcom/kik/cards/web/aq;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 70
    check-cast p2, Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/kik/cards/web/ar;->a:Lcom/kik/cards/web/aq;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/aq;->setNetworkAvailable(Z)V

    return-void
.end method
