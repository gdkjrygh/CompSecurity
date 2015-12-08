.class final Lcom/kik/cards/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/KikCardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/KikCardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Lcom/kik/cards/i;->a:Lcom/kik/cards/KikCardsWebViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/kik/cards/i;->a:Lcom/kik/cards/KikCardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lcom/kik/cards/KikCardsWebViewFragment;)V

    .line 247
    return-void
.end method
