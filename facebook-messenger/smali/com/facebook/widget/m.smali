.class Lcom/facebook/widget/m;
.super Ljava/lang/Object;
.source "RadioButtonWithSubtitle.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/RadioButtonWithSubtitle;


# direct methods
.method constructor <init>(Lcom/facebook/widget/RadioButtonWithSubtitle;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/widget/m;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/widget/m;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-static {v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->a(Lcom/facebook/widget/RadioButtonWithSubtitle;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 62
    return-void
.end method
