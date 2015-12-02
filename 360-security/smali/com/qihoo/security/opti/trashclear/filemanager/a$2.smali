.class Lcom/qihoo/security/opti/trashclear/filemanager/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/LinearLayout;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;Landroid/widget/LinearLayout;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;->a:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    .line 119
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    if-le v1, v2, :cond_0

    .line 120
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    sub-int v0, v1, v0

    .line 121
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/View;->scrollBy(II)V

    .line 123
    :cond_0
    return-void
.end method
