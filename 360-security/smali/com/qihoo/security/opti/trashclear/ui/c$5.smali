.class Lcom/qihoo/security/opti/trashclear/ui/c$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/c;->i()V
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
    .line 399
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$5;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$5;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$5;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/c$a;->b()V

    .line 406
    :cond_0
    return-void
.end method
