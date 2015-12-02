.class Lcom/qihoo/security/opti/trashclear/ui/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/b;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/b;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/b$1;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b$1;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/b;->d:Lcom/qihoo/security/opti/trashclear/ui/b$a;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b$1;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/b;->d:Lcom/qihoo/security/opti/trashclear/ui/b$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/b$1;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/b$a;->a(Lcom/qihoo/security/opti/trashclear/ui/b;)V

    .line 151
    :cond_0
    return-void
.end method
