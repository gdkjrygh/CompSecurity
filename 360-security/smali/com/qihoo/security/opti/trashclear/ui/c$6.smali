.class Lcom/qihoo/security/opti/trashclear/ui/c$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 423
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 427
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-boolean v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    if-nez v0, :cond_1

    .line 429
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0239

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 435
    :cond_0
    :goto_0
    return-void

    .line 431
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/c$a;->a(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    .line 432
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$6;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->dismiss()V

    goto :goto_0
.end method
