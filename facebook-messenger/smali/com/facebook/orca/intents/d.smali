.class Lcom/facebook/orca/intents/d;
.super Ljava/lang/Object;
.source "IntentHandlerService.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/orca/intents/IntentHandlerService;


# direct methods
.method constructor <init>(Lcom/facebook/orca/intents/IntentHandlerService;I)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/orca/intents/d;->b:Lcom/facebook/orca/intents/IntentHandlerService;

    iput p2, p0, Lcom/facebook/orca/intents/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/intents/d;->b:Lcom/facebook/orca/intents/IntentHandlerService;

    iget v1, p0, Lcom/facebook/orca/intents/d;->a:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/intents/IntentHandlerService;->stopSelf(I)V

    .line 40
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 36
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/intents/d;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/intents/d;->b:Lcom/facebook/orca/intents/IntentHandlerService;

    iget v1, p0, Lcom/facebook/orca/intents/d;->a:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/intents/IntentHandlerService;->stopSelf(I)V

    .line 45
    return-void
.end method
