.class final Lcom/arist/view/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/view/e;

.field private final synthetic b:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/arist/view/e;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/view/g;->a:Lcom/arist/view/e;

    iput-object p2, p0, Lcom/arist/view/g;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-wide/16 v0, 0x0

    iget-object v2, p0, Lcom/arist/view/g;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "0"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    iget-object v2, p0, Lcom/arist/view/g;->a:Lcom/arist/view/e;

    invoke-virtual {v2}, Lcom/arist/view/e;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f09004d

    invoke-static {v2, v3, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    sget-object v2, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v2, v0, v1}, Lcom/arist/c/f;->a(J)V

    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/arist/c/a;->s:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "sleep_time"

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-object v0, p0, Lcom/arist/view/g;->a:Lcom/arist/view/e;

    invoke-static {v0}, Lcom/arist/view/e;->a(Lcom/arist/view/e;)Lcom/arist/activity/MainActivity;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_1
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/arist/view/g;->a:Lcom/arist/view/e;

    invoke-static {v2}, Lcom/arist/view/e;->a(Lcom/arist/view/e;)Lcom/arist/activity/MainActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/view/g;->a:Lcom/arist/view/e;

    invoke-static {v3}, Lcom/arist/view/e;->a(Lcom/arist/view/e;)Lcom/arist/activity/MainActivity;

    move-result-object v3

    const v4, 0x7f09004e

    invoke-virtual {v3, v4}, Lcom/arist/activity/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v7, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
