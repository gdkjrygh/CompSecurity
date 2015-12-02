.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1740
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;->a:Landroid/view/View;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 1744
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;->a:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1745
    return-void
.end method
