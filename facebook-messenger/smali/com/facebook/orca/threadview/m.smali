.class Lcom/facebook/orca/threadview/m;
.super Ljava/lang/Object;
.source "MessageItemView.java"

# interfaces
.implements Lcom/facebook/widget/text/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/orca/threadview/m;->a:Lcom/facebook/orca/threadview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/style/URLSpan;Landroid/widget/TextView;)Z
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/orca/threadview/m;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/threadview/m;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/r;->a(Landroid/text/style/URLSpan;)Z

    move-result v0

    .line 182
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
