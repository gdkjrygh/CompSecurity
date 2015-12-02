.class Lcom/facebook/widget/text/i;
.super Ljava/lang/Object;
.source "SimpleVariableTextLayoutView.java"


# instance fields
.field final a:Landroid/text/TextPaint;

.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/text/TextPaint;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/TextPaint;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/widget/text/i;->a:Landroid/text/TextPaint;

    .line 60
    iput-object p2, p0, Lcom/facebook/widget/text/i;->b:Ljava/util/List;

    .line 61
    return-void
.end method
