.class Lcom/QRBS/activity/ManualInsert$4;
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
    iput-object p1, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3
    .param p1, "compoundbutton"    # Landroid/widget/CompoundButton;
    .param p2, "flag"    # Z

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 155
    if-eqz p2, :cond_0

    .line 157
    invoke-virtual {p1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 158
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$6(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 159
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$1(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 160
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->two:Landroid/widget/CheckBox;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$0(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 161
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->image:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$3(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f02009d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 162
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 163
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 164
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 165
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const v1, 0x7f08011d

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 174
    :goto_0
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 170
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 171
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 172
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert$4;->this$0:Lcom/QRBS/activity/ManualInsert;

    # getter for: Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;
    invoke-static {v0}, Lcom/QRBS/activity/ManualInsert;->access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;

    move-result-object v0

    const v1, 0x7f08011c

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    goto :goto_0
.end method
