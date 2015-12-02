.class Lcom/facebook/widget/i;
.super Ljava/lang/Object;
.source "HorizontalOrVerticalViewGroup.java"


# instance fields
.field public final a:I

.field public final b:I

.field final synthetic c:Lcom/facebook/widget/HorizontalOrVerticalViewGroup;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/HorizontalOrVerticalViewGroup;II)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/widget/i;->c:Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p2, p0, Lcom/facebook/widget/i;->a:I

    .line 50
    iput p3, p0, Lcom/facebook/widget/i;->b:I

    .line 51
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 54
    const-string v0, "x"

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    iget v1, p0, Lcom/facebook/widget/i;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/facebook/widget/i;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
