.class Lcom/facebook/ui/d/b;
.super Ljava/lang/Object;
.source "ErrorDialogBuilder.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/ui/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/d/a;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/ui/d/b;->a:Lcom/facebook/ui/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 116
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 117
    iget-object v0, p0, Lcom/facebook/ui/d/b;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/ui/d/a;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/facebook/ui/d/b;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/ui/d/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/d/b;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->b(Lcom/facebook/ui/d/a;)Landroid/support/v4/app/DialogFragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Lcom/facebook/ui/d/b;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->b(Lcom/facebook/ui/d/a;)Landroid/support/v4/app/DialogFragment;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/DialogFragment;->a()V

    .line 123
    :cond_1
    return-void
.end method
