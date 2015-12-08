.class final Lcom/arist/activity/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private final synthetic b:Landroid/app/Dialog;

.field private final synthetic c:Landroid/widget/EditText;

.field private final synthetic d:Landroid/widget/EditText;

.field private final synthetic e:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    iput-object p2, p0, Lcom/arist/activity/p;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lcom/arist/activity/p;->c:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/arist/activity/p;->d:Landroid/widget/EditText;

    iput-object p5, p0, Lcom/arist/activity/p;->e:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/p;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    iget-object v0, v0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    iget-object v1, p0, Lcom/arist/activity/p;->c:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/b;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    iget-object v0, v0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    iget-object v1, p0, Lcom/arist/activity/p;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/b;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    iget-object v0, v0, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    iget-object v1, p0, Lcom/arist/activity/p;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/b;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->m(Lcom/arist/activity/MainActivity;)Lcom/arist/model/b/c;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    iget-object v1, v1, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v0, v1}, Lcom/arist/model/b/c;->a(Lcom/arist/b/b;)I

    iget-object v0, p0, Lcom/arist/activity/p;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    return-void
.end method
