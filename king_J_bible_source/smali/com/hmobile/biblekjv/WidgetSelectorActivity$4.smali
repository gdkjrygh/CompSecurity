.class Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;
.super Ljava/lang/Object;
.source "WidgetSelectorActivity.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/WidgetSelectorActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5
    .param p1, "buttonView"    # Landroid/widget/CompoundButton;
    .param p2, "isChecked"    # Z

    .prologue
    const/4 v4, -0x1

    const/high16 v3, -0x1000000

    .line 145
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iput-boolean p2, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    .line 146
    if-eqz p2, :cond_0

    .line 147
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    # getter for: Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->access$1(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 148
    const v2, 0x7f07006e

    .line 147
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    # getter for: Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->access$2(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0200ae

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 150
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtBookInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    :goto_0
    return-void

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    # getter for: Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->access$1(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 155
    const v2, 0x7f07006f

    .line 154
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    # getter for: Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;
    invoke-static {v0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->access$2(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0200b0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 157
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;->this$0:Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtBookInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method
