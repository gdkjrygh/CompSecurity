.class final Lcom/arist/activity/am;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/arist/activity/WelcomeActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/WelcomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/am;->a:Lcom/arist/activity/WelcomeActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/am;)Lcom/arist/activity/WelcomeActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/am;->a:Lcom/arist/activity/WelcomeActivity;

    return-object v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/an;

    invoke-direct {v1, p0}, Lcom/arist/activity/an;-><init>(Lcom/arist/activity/am;)V

    invoke-virtual {v0, v1}, Lcom/ijoysoft/a/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method
