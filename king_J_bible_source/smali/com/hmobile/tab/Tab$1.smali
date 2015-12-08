.class Lcom/hmobile/tab/Tab$1;
.super Ljava/lang/Object;
.source "Tab.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/tab/Tab;->bindListenersforSample()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/tab/Tab;


# direct methods
.method constructor <init>(Lcom/hmobile/tab/Tab;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v3, 0x0

    .line 120
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$1(Lcom/hmobile/tab/Tab;)Landroid/app/Dialog;

    move-result-object v0

    if-nez v0, :cond_1

    .line 121
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Intent or Dialog not set for \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->tabTag:Ljava/lang/String;
    invoke-static {v2}, Lcom/hmobile/tab/Tab;->access$3(Lcom/hmobile/tab/Tab;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 152
    :cond_0
    :goto_0
    return-void

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$1(Lcom/hmobile/tab/Tab;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 127
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " Only ONE can be set Intent or Dialog for \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    iget-object v2, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->tabTag:Ljava/lang/String;
    invoke-static {v2}, Lcom/hmobile/tab/Tab;->access$3(Lcom/hmobile/tab/Tab;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 129
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 131
    :cond_2
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 132
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->requestCode:I
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$4(Lcom/hmobile/tab/Tab;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 133
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v1}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->requestCode:I
    invoke-static {v2}, Lcom/hmobile/tab/Tab;->access$4(Lcom/hmobile/tab/Tab;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 135
    :cond_3
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v1}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    .line 140
    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    .line 140
    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;
    invoke-static {v1}, Lcom/hmobile/tab/Tab;->access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 142
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainBookActivity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_0

    .line 146
    :cond_4
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$1(Lcom/hmobile/tab/Tab;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/hmobile/tab/Tab$1;->this$0:Lcom/hmobile/tab/Tab;

    # getter for: Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;
    invoke-static {v0}, Lcom/hmobile/tab/Tab;->access$1(Lcom/hmobile/tab/Tab;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    goto/16 :goto_0
.end method
