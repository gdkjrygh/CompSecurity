.class final Lkik/android/widget/cq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/android/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/CheckBox;

.field final synthetic d:Lkik/a/e/i;

.field final synthetic e:Ljava/util/Vector;

.field final synthetic f:Lkik/a/d/k;

.field final synthetic g:Lkik/android/widget/cp;


# direct methods
.method constructor <init>(Lkik/android/widget/cp;Lcom/kik/android/a;Ljava/lang/String;Landroid/widget/CheckBox;Lkik/a/e/i;Ljava/util/Vector;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lkik/android/widget/cq;->g:Lkik/android/widget/cp;

    iput-object p2, p0, Lkik/android/widget/cq;->a:Lcom/kik/android/a;

    iput-object p3, p0, Lkik/android/widget/cq;->b:Ljava/lang/String;

    iput-object p4, p0, Lkik/android/widget/cq;->c:Landroid/widget/CheckBox;

    iput-object p5, p0, Lkik/android/widget/cq;->d:Lkik/a/e/i;

    iput-object p6, p0, Lkik/android/widget/cq;->e:Ljava/util/Vector;

    iput-object p7, p0, Lkik/android/widget/cq;->f:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/widget/cq;->a:Lcom/kik/android/a;

    const-string v1, "Report Spam Clicked"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    .line 36
    const-string v0, "Screen"

    iget-object v2, p0, Lkik/android/widget/cq;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 37
    const/4 v0, -0x2

    if-ne p2, v0, :cond_0

    .line 38
    const-string v0, "Button Tapped"

    const-string v2, "Cancel"

    invoke-virtual {v1, v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 39
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 45
    :goto_0
    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 46
    return-void

    .line 42
    :cond_0
    const-string v2, "Button Tapped"

    iget-object v0, p0, Lkik/android/widget/cq;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Report With History"

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 43
    iget-object v2, p0, Lkik/android/widget/cq;->d:Lkik/a/e/i;

    iget-object v0, p0, Lkik/android/widget/cq;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/cq;->e:Ljava/util/Vector;

    :goto_2
    iget-object v3, p0, Lkik/android/widget/cq;->f:Lkik/a/d/k;

    invoke-interface {v2, v0, v3}, Lkik/a/e/i;->a(Ljava/util/Vector;Lkik/a/d/k;)V

    goto :goto_0

    .line 42
    :cond_1
    const-string v0, "Report"

    goto :goto_1

    .line 43
    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method
