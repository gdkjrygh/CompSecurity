.class public Lcom/facebook/widget/text/SimpleVariableTextLayoutView;
.super Lcom/facebook/widget/text/m;
.source "SimpleVariableTextLayoutView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/text/m",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/widget/text/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 28
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/text/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    new-instance v0, Lcom/facebook/widget/text/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/widget/text/h;-><init>(Lcom/facebook/widget/text/g;)V

    iput-object v0, p0, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;->a:Lcom/facebook/widget/text/h;

    .line 38
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;->a:Lcom/facebook/widget/text/h;

    return-object v0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/widget/text/SimpleVariableTextLayoutView;->setData(Ljava/lang/Object;)V

    .line 52
    return-void
.end method
