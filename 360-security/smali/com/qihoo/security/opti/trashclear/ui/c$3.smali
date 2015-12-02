.class Lcom/qihoo/security/opti/trashclear/ui/c$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 347
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    .line 348
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    if-eqz v0, :cond_0

    .line 349
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-boolean v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v2, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    .line 350
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-boolean v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    if-nez v0, :cond_2

    .line 351
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/c;->o:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080077

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Lcom/qihoo/security/opti/trashclear/ui/c;I)V

    .line 357
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c0238

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 358
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Lcom/qihoo/security/opti/trashclear/ui/c;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    invoke-interface {v0, v2, v1, v3, p1}, Lcom/qihoo/security/opti/trashclear/ui/c$a;->a(Lcom/qihoo/security/opti/trashclear/ui/c;ZLcom/qihoo/security/opti/trashclear/ui/i;Landroid/view/View;)V

    .line 360
    :cond_0
    return-void

    .line 349
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 353
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/c$3;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/c;->o:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080025

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-static {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Lcom/qihoo/security/opti/trashclear/ui/c;I)V

    goto :goto_1
.end method
