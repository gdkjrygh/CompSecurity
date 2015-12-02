.class Lcom/facebook/orca/common/ui/widgets/text/c;
.super Ljava/lang/Object;
.source "MultilineEllipsizeTextView.java"


# instance fields
.field final a:Landroid/text/Layout;

.field final b:I


# direct methods
.method private constructor <init>(Landroid/text/Layout;I)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/text/c;->a:Landroid/text/Layout;

    .line 88
    iput p2, p0, Lcom/facebook/orca/common/ui/widgets/text/c;->b:I

    .line 89
    return-void
.end method

.method synthetic constructor <init>(Landroid/text/Layout;ILcom/facebook/orca/common/ui/widgets/text/b;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/widgets/text/c;-><init>(Landroid/text/Layout;I)V

    return-void
.end method
