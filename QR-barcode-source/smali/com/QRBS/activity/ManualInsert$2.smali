.class Lcom/QRBS/activity/ManualInsert$2;
.super Ljava/lang/Object;
.source "ManualInsert.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/ManualInsert;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/ManualInsert;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/ManualInsert;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5
    .param p1, "compoundbutton"    # Landroid/widget/CompoundButton;
    .param p2, "flag"    # Z

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 95
    if-eqz p2, :cond_0

    .line 97
    invoke-virtual {p1, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 98
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$6(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 99
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$1(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 100
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->four:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$2(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 101
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->image:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$3(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0200a0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 102
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->filters:[Landroid/text/InputFilter;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$4(Lcom/QRBS/activity/ManualInsert;)[Landroid/text/InputFilter;

    move-result-object v0

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v1, v0, v3

    .line 103
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->filters:[Landroid/text/InputFilter;
    invoke-static {v1}, Lcom/QRBS/activity/ManualInsert;->access$4(Lcom/QRBS/activity/ManualInsert;)[Landroid/text/InputFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 104
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 105
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 106
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 107
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const v1, 0x7f08011d

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 116
    :goto_0
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 112
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 113
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 114
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 115
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$2;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const v1, 0x7f08011c

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    goto :goto_0
.end method
