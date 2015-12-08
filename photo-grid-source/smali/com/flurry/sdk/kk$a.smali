.class Lcom/flurry/sdk/kk$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/kk;


# direct methods
.method private constructor <init>(Lcom/flurry/sdk/kk;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/flurry/sdk/kk$a;->a:Lcom/flurry/sdk/kk;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/flurry/sdk/kk;Lcom/flurry/sdk/kk$1;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/flurry/sdk/kk$a;-><init>(Lcom/flurry/sdk/kk;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 55
    const/4 v0, 0x3

    invoke-static {}, Lcom/flurry/sdk/kk;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "HttpRequest timed out. Cancelling."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/flurry/sdk/kk$a;->a:Lcom/flurry/sdk/kk;

    invoke-static {v0}, Lcom/flurry/sdk/kk;->a(Lcom/flurry/sdk/kk;)Lcom/flurry/sdk/kl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/kl;->k()V

    .line 58
    return-void
.end method
