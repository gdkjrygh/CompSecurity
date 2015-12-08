.class final Lcom/arist/service/q;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/service/RestartPlayerServiceReceiver;

.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/arist/service/RestartPlayerServiceReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/q;->a:Lcom/arist/service/RestartPlayerServiceReceiver;

    iput-object p2, p0, Lcom/arist/service/q;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/arist/service/q;->c:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    sget-boolean v0, Lcom/arist/service/MusicPlayService;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/q;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/arist/service/q;->c:Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/arist/c/j;->a(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
