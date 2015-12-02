.class Lcom/qihoo/security/opti/trashclear/ui/c$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;Z)V
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
    .line 375
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c$4;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$4;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    if-eqz v0, :cond_0

    .line 380
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$4;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/c$a;->a()V

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c$4;->a:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->dismiss()V

    .line 383
    return-void
.end method
