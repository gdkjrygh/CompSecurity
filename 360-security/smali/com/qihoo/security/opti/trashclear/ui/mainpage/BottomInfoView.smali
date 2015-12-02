.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;
.super Landroid/widget/FrameLayout;
.source "360Security"


# instance fields
.field a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

.field b:Z

.field private c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->b:Z

    .line 39
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->c()V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->b:Z

    .line 34
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->c()V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->b:Z

    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->c()V

    .line 30
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f030036

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->c:Landroid/view/View;

    .line 44
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->c:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;-><init>(Landroid/view/ViewGroup;)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

    .line 45
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b()V

    .line 51
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c()V

    .line 57
    return-void
.end method
