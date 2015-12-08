.class final Lcom/arist/activity/ab;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ab;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/arist/activity/ab;->a:Lcom/arist/activity/MainActivity;

    const-class v2, Lcom/arist/activity/AddToListActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/arist/activity/ab;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v2}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arist/a/a;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    const-string v2, "playlist_id"

    invoke-virtual {v0}, Lcom/arist/b/c;->d()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "playlist_name"

    invoke-virtual {v0}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/arist/activity/ab;->a:Lcom/arist/activity/MainActivity;

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Lcom/arist/activity/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
