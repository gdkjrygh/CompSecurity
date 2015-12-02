.class public Lcom/qihoo/security/ui/b/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final a:Landroid/view/animation/AccelerateInterpolator;

.field public static final b:Landroid/view/animation/DecelerateInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/c;->a:Landroid/view/animation/AccelerateInterpolator;

    .line 8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/b/c;->b:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method
