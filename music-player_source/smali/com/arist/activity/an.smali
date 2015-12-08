.class final Lcom/arist/activity/an;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/activity/am;


# direct methods
.method constructor <init>(Lcom/arist/activity/am;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/an;->a:Lcom/arist/activity/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/an;->a:Lcom/arist/activity/am;

    invoke-static {v0}, Lcom/arist/activity/am;->a(Lcom/arist/activity/am;)Lcom/arist/activity/WelcomeActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/WelcomeActivity;->a(Lcom/arist/activity/WelcomeActivity;)V

    return-void
.end method
