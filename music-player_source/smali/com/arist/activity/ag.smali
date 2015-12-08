.class final Lcom/arist/activity/ag;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ag;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    const/4 v1, 0x4

    sget v0, Lcom/arist/activity/MyApplication;->i:I

    if-eq v0, v1, :cond_0

    sput v1, Lcom/arist/activity/MyApplication;->i:I

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0, v1}, Lcom/arist/c/f;->c(I)V

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/ag;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->a()I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->f:I

    iget-object v0, p0, Lcom/arist/activity/ag;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->b()I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->g:I

    iget-object v0, p0, Lcom/arist/activity/ag;->a:Lcom/arist/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
