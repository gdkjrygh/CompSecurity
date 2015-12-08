.class final Lcom/arist/activity/af;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    iget-object v0, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/arist/a/a;->c(I)Lcom/arist/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/a/a;->a()I

    move-result v1

    sput v1, Lcom/arist/activity/MyApplication;->f:I

    iget-object v1, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/a/a;->b()I

    move-result v1

    sput v1, Lcom/arist/activity/MyApplication;->g:I

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    sput v0, Lcom/arist/activity/MyApplication;->h:I

    iget-object v0, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    const-string v0, "MainActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    sget v2, Lcom/arist/activity/MyApplication;->f:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "-----"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/arist/activity/MyApplication;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "---"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/arist/activity/MyApplication;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/activity/af;->a:Lcom/arist/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
