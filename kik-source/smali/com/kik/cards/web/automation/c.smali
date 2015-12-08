.class final Lcom/kik/cards/web/automation/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/automation/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/automation/a;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/kik/cards/web/automation/c;->a:Lcom/kik/cards/web/automation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 139
    iget-object v0, p0, Lcom/kik/cards/web/automation/c;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v0}, Lcom/kik/cards/web/automation/a;->e(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v0, p0, Lcom/kik/cards/web/automation/c;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v0}, Lcom/kik/cards/web/automation/a;->d(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v0, p0, Lcom/kik/cards/web/automation/c;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v0}, Lcom/kik/cards/web/automation/a;->f(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    return-void
.end method
