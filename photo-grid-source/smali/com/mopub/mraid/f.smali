.class final Lcom/mopub/mraid/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mraid/af;


# instance fields
.field final synthetic a:Lcom/mopub/mraid/MraidJavascriptCommand;

.field final synthetic b:Lcom/mopub/mraid/MraidBridge;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mraid/MraidJavascriptCommand;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Lcom/mopub/mraid/f;->b:Lcom/mopub/mraid/MraidBridge;

    iput-object p2, p0, Lcom/mopub/mraid/f;->a:Lcom/mopub/mraid/MraidJavascriptCommand;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Lcom/mopub/mraid/h;)V
    .locals 3

    .prologue
    .line 428
    iget-object v0, p0, Lcom/mopub/mraid/f;->b:Lcom/mopub/mraid/MraidBridge;

    iget-object v1, p0, Lcom/mopub/mraid/f;->a:Lcom/mopub/mraid/MraidJavascriptCommand;

    invoke-virtual {p1}, Lcom/mopub/mraid/h;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/mopub/mraid/MraidBridge;->a(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V

    .line 429
    return-void
.end method
