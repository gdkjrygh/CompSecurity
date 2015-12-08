.class Lcom/QRBS/activity/CreateCalendar$10;
.super Ljava/lang/Object;
.source "CreateCalendar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateCalendar;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateCalendar;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 106
    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v0, v0, Lcom/QRBS/activity/CreateCalendar;->flag:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v0, v0, Lcom/QRBS/activity/CreateCalendar;->flag:[Z

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v0, v0, Lcom/QRBS/activity/CreateCalendar;->flag:[Z

    const/4 v1, 0x2

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v0, v0, Lcom/QRBS/activity/CreateCalendar;->flag:[Z

    const/4 v1, 0x3

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    # invokes: Lcom/QRBS/activity/CreateCalendar;->controlEdit()Z
    invoke-static {v0}, Lcom/QRBS/activity/CreateCalendar;->access$4(Lcom/QRBS/activity/CreateCalendar;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    new-instance v7, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    invoke-direct {v7, v0}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 110
    .local v7, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->what:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v0, v1}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v2, v2, Lcom/QRBS/activity/CreateCalendar;->where:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v1, v2}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 112
    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v3, v3, Lcom/QRBS/activity/CreateCalendar;->des:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v2, v3}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 113
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v4, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v4, v4, Lcom/QRBS/activity/CreateCalendar;->date:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v3, v4}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 114
    iget-object v4, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v5, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v5, v5, Lcom/QRBS/activity/CreateCalendar;->time:Landroid/widget/Button;

    invoke-virtual {v5}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v4, v5}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 115
    iget-object v5, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v6, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v6, v6, Lcom/QRBS/activity/CreateCalendar;->date2:Landroid/widget/Button;

    invoke-virtual {v6}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v5, v6}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 116
    iget-object v6, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v10, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v10, v10, Lcom/QRBS/activity/CreateCalendar;->time2:Landroid/widget/Button;

    invoke-virtual {v10}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v10

    # invokes: Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v6, v10}, Lcom/QRBS/activity/CreateCalendar;->access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 109
    invoke-static/range {v0 .. v6}, Lcom/scannerfire/utils/EncodeUtils;->createCalendarString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 117
    .local v9, "s":Ljava/lang/String;
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->what:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->date:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->time:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->date2:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->time2:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->where:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, v1, Lcom/QRBS/activity/CreateCalendar;->des:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 122
    .local v8, "label":Ljava/lang/String;
    invoke-virtual {v7, v9, v8}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .end local v7    # "eu":Lcom/scannerfire/utils/EncodeUtils;
    .end local v8    # "label":Ljava/lang/String;
    .end local v9    # "s":Ljava/lang/String;
    :goto_0
    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$10;->this$0:Lcom/QRBS/activity/CreateCalendar;

    const v2, 0x7f0800fc

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/CreateCalendar;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method
