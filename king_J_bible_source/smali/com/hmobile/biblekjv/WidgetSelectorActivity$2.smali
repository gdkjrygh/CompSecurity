.class Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;
.super Ljava/lang/Object;
.source "WidgetSelectorActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/WidgetSelectorActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemSelectedListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arg3"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 120
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iput p3, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    .line 121
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget v2, v2, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 122
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 126
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    return-void
.end method
