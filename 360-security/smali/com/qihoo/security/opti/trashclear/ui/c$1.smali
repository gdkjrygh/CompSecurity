.class Lcom/qihoo/security/opti/trashclear/ui/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/c;->e()V
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
    .line 159
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$1;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 163
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$1;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$1;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$1;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/c$a;->a(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$1;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->dismiss()V

    .line 167
    :cond_0
    return-void
.end method
