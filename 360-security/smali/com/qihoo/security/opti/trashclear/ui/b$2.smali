.class Lcom/qihoo/security/opti/trashclear/ui/b$2;
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
    .line 162
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/b$2;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b$2;->a:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->dismiss()V

    .line 167
    return-void
.end method
