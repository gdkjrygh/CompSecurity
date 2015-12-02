.class Lcom/facebook/orca/common/ui/widgets/g;
.super Lcom/a/a/c;
.source "SlidingOutSuggestionViewBase.java"


# instance fields
.field final synthetic a:Lcom/facebook/widget/animatablelistview/a;

.field final synthetic b:Lcom/facebook/orca/common/ui/widgets/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/widgets/f;Lcom/facebook/widget/animatablelistview/a;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/g;->b:Lcom/facebook/orca/common/ui/widgets/f;

    iput-object p2, p0, Lcom/facebook/orca/common/ui/widgets/g;->a:Lcom/facebook/widget/animatablelistview/a;

    invoke-direct {p0}, Lcom/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/g;->b:Lcom/facebook/orca/common/ui/widgets/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/widgets/f;->a(Lcom/facebook/orca/common/ui/widgets/f;Z)Z

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/g;->b:Lcom/facebook/orca/common/ui/widgets/f;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/widgets/f;->a(Lcom/facebook/orca/common/ui/widgets/f;)Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/g;->a:Lcom/facebook/widget/animatablelistview/a;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->setAnimationOffset(F)V

    .line 118
    return-void
.end method
