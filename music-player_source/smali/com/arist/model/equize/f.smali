.class final Lcom/arist/model/equize/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;

.field private final synthetic b:Landroid/widget/EditText;

.field private final synthetic c:Lcom/arist/b/a;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;Landroid/widget/EditText;Lcom/arist/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/f;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/f;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/arist/model/equize/f;->c:Lcom/arist/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/f;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/f;->a:Lcom/arist/model/equize/a;

    const v1, 0x7f0900a4

    invoke-static {v0, v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;I)V

    :goto_0
    return-void

    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v1, p0, Lcom/arist/model/equize/f;->c:Lcom/arist/b/a;

    iput-object v0, v1, Lcom/arist/b/a;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/arist/model/equize/f;->a:Lcom/arist/model/equize/a;

    invoke-static {v0}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;)Lcom/arist/model/equize/j;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/equize/f;->c:Lcom/arist/b/a;

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/j;->b(Lcom/arist/b/a;)V

    iget-object v0, p0, Lcom/arist/model/equize/f;->a:Lcom/arist/model/equize/a;

    const v1, 0x7f0900a0

    invoke-static {v0, v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;I)V

    goto :goto_0
.end method
