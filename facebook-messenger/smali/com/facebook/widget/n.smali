.class Lcom/facebook/widget/n;
.super Ljava/lang/Object;
.source "RadioButtonWithSubtitle.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/RadioButtonWithSubtitle;


# direct methods
.method constructor <init>(Lcom/facebook/widget/RadioButtonWithSubtitle;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/widget/n;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/widget/n;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-static {v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->b(Lcom/facebook/widget/RadioButtonWithSubtitle;)Lcom/facebook/widget/o;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/widget/n;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-static {v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->b(Lcom/facebook/widget/RadioButtonWithSubtitle;)Lcom/facebook/widget/o;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/n;->a:Lcom/facebook/widget/RadioButtonWithSubtitle;

    invoke-interface {v0, v1, p2}, Lcom/facebook/widget/o;->a(Lcom/facebook/widget/RadioButtonWithSubtitle;Z)V

    .line 71
    :cond_0
    return-void
.end method
