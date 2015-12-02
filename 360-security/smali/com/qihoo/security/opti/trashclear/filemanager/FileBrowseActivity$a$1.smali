.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/d;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;Lcom/qihoo/security/opti/trashclear/filemanager/d;)V
    .locals 0

    .prologue
    .line 584
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 589
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 590
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/d;

    iput-boolean p2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->g:Z

    .line 591
    if-eqz p2, :cond_1

    .line 592
    const v0, 0x7f02006c

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    .line 598
    :cond_0
    :goto_0
    return-void

    .line 594
    :cond_1
    const v0, 0x7f02006d

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    goto :goto_0
.end method
