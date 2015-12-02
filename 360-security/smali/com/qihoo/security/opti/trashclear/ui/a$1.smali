.class Lcom/qihoo/security/opti/trashclear/ui/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/a;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 585
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/a$1;->b:Lcom/qihoo/security/opti/trashclear/ui/a;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/a$1;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 588
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a$1;->b:Lcom/qihoo/security/opti/trashclear/ui/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(Lcom/qihoo/security/opti/trashclear/ui/a;)Lcom/qihoo/security/opti/trashclear/ui/a$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 589
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a$1;->b:Lcom/qihoo/security/opti/trashclear/ui/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(Lcom/qihoo/security/opti/trashclear/ui/a;)Lcom/qihoo/security/opti/trashclear/ui/a$c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a$1;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/a$c;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 591
    :cond_0
    return-void
.end method
