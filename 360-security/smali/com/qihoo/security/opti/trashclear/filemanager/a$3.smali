.class Lcom/qihoo/security/opti/trashclear/filemanager/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/a;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$3;->a:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
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
    .line 166
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a$3;->a:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 167
    return-void
.end method
