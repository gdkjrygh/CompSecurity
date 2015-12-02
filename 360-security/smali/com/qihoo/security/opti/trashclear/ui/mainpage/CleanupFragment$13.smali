.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(JLcom/nineoldandroids/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nineoldandroids/a/b;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/nineoldandroids/a/b;)V
    .locals 0

    .prologue
    .line 2748
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->a:Lcom/nineoldandroids/a/b;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 2751
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->setVisibility(I)V

    .line 2752
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->clearAnimation()V

    .line 2754
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->a:Lcom/nineoldandroids/a/b;

    if-eqz v0, :cond_0

    .line 2755
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;->a:Lcom/nineoldandroids/a/b;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/b;->b(Lcom/nineoldandroids/a/a;)V

    .line 2757
    :cond_0
    return-void
.end method
