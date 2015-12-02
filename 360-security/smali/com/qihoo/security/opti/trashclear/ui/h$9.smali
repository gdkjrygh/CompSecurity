.class Lcom/qihoo/security/opti/trashclear/ui/h$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h;->onScroll(Landroid/widget/AbsListView;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 2605
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$9;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 2608
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$9;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$9;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 2609
    return-void
.end method
