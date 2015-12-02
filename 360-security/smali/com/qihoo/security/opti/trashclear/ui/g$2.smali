.class final Lcom/qihoo/security/opti/trashclear/ui/g$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

.field final synthetic e:Lcom/qihoo/security/dialog/j;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/dialog/j;)V
    .locals 0

    .prologue
    .line 322
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iput-object p5, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->e:Lcom/qihoo/security/dialog/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 325
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->b:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->d:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-static {v1, v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 326
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->e:Lcom/qihoo/security/dialog/j;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/j;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/g$2;->e:Lcom/qihoo/security/dialog/j;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/j;->dismiss()V

    .line 329
    :cond_0
    return-void
.end method
