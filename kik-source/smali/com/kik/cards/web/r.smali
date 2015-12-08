.class final Lcom/kik/cards/web/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/p;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/p;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/kik/cards/web/r;->a:Lcom/kik/cards/web/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 305
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid history Item on fail. target was: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kik/cards/web/r;->a:Lcom/kik/cards/web/p;

    iget-object v2, v2, Lcom/kik/cards/web/p;->a:Lcom/kik/cards/web/o;

    iget-object v2, v2, Lcom/kik/cards/web/o;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 306
    return-void
.end method
