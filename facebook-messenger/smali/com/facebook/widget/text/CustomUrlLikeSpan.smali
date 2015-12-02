.class public Lcom/facebook/widget/text/CustomUrlLikeSpan;
.super Landroid/text/style/URLSpan;
.source "CustomUrlLikeSpan.java"


# instance fields
.field private a:Lcom/facebook/widget/text/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    const-string v0, "about:blank"

    invoke-direct {p0, v0}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/text/f;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a:Lcom/facebook/widget/text/f;

    .line 33
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a:Lcom/facebook/widget/text/f;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a:Lcom/facebook/widget/text/f;

    invoke-virtual {v0}, Lcom/facebook/widget/text/f;->a()V

    .line 40
    :cond_0
    return-void
.end method
