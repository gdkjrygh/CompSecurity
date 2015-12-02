.class public Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;
.super Lcom/facebook/widget/text/m;
.source "RowReceiptTextView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/text/m",
        "<",
        "Lcom/facebook/orca/common/ui/widgets/text/e;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/orca/common/ui/widgets/text/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->b()V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->b()V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->b()V

    .line 63
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 67
    const-class v1, Lcom/facebook/orca/common/ui/widgets/text/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/f;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->a:Lcom/facebook/orca/common/ui/widgets/text/f;

    .line 68
    return-void
.end method


# virtual methods
.method protected getVariableTextLayoutComputer()Lcom/facebook/widget/text/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/widget/text/l",
            "<",
            "Lcom/facebook/orca/common/ui/widgets/text/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->a:Lcom/facebook/orca/common/ui/widgets/text/f;

    return-object v0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 76
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-direct {v0, p1}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 77
    return-void
.end method
