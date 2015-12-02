.class Lcom/facebook/orca/threadview/aa;
.super Ljava/lang/Object;
.source "ReceiptItemView.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/orca/k/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/Coordinates;

.field final synthetic b:Lcom/facebook/orca/threadview/ReceiptItemView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ReceiptItemView;Lcom/facebook/location/Coordinates;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    iput-object p2, p0, Lcom/facebook/orca/threadview/aa;->a:Lcom/facebook/location/Coordinates;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/k/d;)V
    .locals 3

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Lcom/facebook/orca/threadview/ReceiptItemView;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/orca/common/ui/a/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/k/d;->a()Lcom/facebook/location/g;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/k/d;->b()Lcom/facebook/location/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/location/g;Lcom/facebook/location/g;)Ljava/lang/String;

    move-result-object v0

    .line 137
    if-eqz v0, :cond_0

    .line 138
    iget-object v1, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ReceiptItemView;->b(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-direct {v2, v0}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 140
    iget-object v1, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ReceiptItemView;->c(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/location/c;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/threadview/aa;->a:Lcom/facebook/location/Coordinates;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/location/c;->a(Lcom/facebook/location/Coordinates;Ljava/lang/String;)V

    .line 142
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 129
    check-cast p1, Lcom/facebook/orca/k/d;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/aa;->a(Lcom/facebook/orca/k/d;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/threadview/aa;->b:Lcom/facebook/orca/threadview/ReceiptItemView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Lcom/facebook/orca/threadview/ReceiptItemView;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 147
    return-void
.end method
