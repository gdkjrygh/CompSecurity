.class final Lcom/arist/model/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/a/b;

.field private final synthetic b:Landroid/widget/EditText;

.field private final synthetic c:Landroid/content/Context;

.field private final synthetic d:Lcom/arist/b/c;

.field private final synthetic e:Landroid/widget/BaseAdapter;

.field private final synthetic f:Lcom/arist/view/a;


# direct methods
.method constructor <init>(Lcom/arist/model/a/b;Landroid/widget/EditText;Landroid/content/Context;Lcom/arist/b/c;Landroid/widget/BaseAdapter;Lcom/arist/view/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/a/d;->a:Lcom/arist/model/a/b;

    iput-object p2, p0, Lcom/arist/model/a/d;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/arist/model/a/d;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/arist/model/a/d;->d:Lcom/arist/b/c;

    iput-object p5, p0, Lcom/arist/model/a/d;->e:Landroid/widget/BaseAdapter;

    iput-object p6, p0, Lcom/arist/model/a/d;->f:Lcom/arist/view/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/arist/model/a/d;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/arist/model/a/d;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/arist/model/a/d;->c:Landroid/content/Context;

    const v2, 0x7f0900a4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/arist/model/a/d;->d:Lcom/arist/b/c;

    invoke-virtual {v1}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/arist/model/a/d;->d:Lcom/arist/b/c;

    invoke-virtual {v1, v0}, Lcom/arist/b/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/model/a/d;->a:Lcom/arist/model/a/b;

    invoke-static {v0}, Lcom/arist/model/a/b;->a(Lcom/arist/model/a/b;)Lcom/arist/model/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/a/d;->d:Lcom/arist/b/c;

    invoke-virtual {v0, v1}, Lcom/arist/model/b/d;->d(Lcom/arist/b/c;)V

    iget-object v0, p0, Lcom/arist/model/a/d;->e:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/arist/model/a/d;->f:Lcom/arist/view/a;

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    goto :goto_0
.end method
