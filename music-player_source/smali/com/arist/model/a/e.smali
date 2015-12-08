.class final Lcom/arist/model/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/a/b;

.field private final synthetic b:Landroid/widget/EditText;

.field private final synthetic c:Ljava/lang/Runnable;

.field private final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/arist/model/a/b;Landroid/widget/EditText;Ljava/lang/Runnable;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/a/e;->a:Lcom/arist/model/a/b;

    iput-object p2, p0, Lcom/arist/model/a/e;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/arist/model/a/e;->c:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/arist/model/a/e;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/a/e;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/arist/model/a/e;->a:Lcom/arist/model/a/b;

    invoke-static {v2}, Lcom/arist/model/a/b;->a(Lcom/arist/model/a/b;)Lcom/arist/model/b/d;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/arist/model/b/d;->a(Ljava/lang/String;)Lcom/arist/b/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/arist/model/a/e;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/a/e;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/arist/model/a/e;->d:Landroid/content/Context;

    const v2, 0x7f0900a4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
