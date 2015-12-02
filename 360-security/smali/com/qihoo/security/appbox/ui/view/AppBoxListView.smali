.class public Lcom/qihoo/security/appbox/ui/view/AppBoxListView;
.super Landroid/widget/ListView;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/appbox/ui/view/AppBoxListView$a;
    }
.end annotation


# instance fields
.field protected final a:I

.field protected final b:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/appbox/ui/view/AppBoxListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/appbox/ui/view/AppBoxListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 45
    invoke-static {v0}, Landroid/support/v4/view/z;->a(Landroid/view/ViewConfiguration;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/appbox/ui/view/AppBoxListView;->a:I

    .line 46
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/qihoo/security/appbox/ui/view/AppBoxListView$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/appbox/ui/view/AppBoxListView$a;-><init>(Lcom/qihoo/security/appbox/ui/view/AppBoxListView;)V

    invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/view/AppBoxListView;->b:Landroid/view/GestureDetector;

    .line 47
    return-void
.end method
