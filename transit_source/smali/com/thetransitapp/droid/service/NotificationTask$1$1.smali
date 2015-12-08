.class Lcom/thetransitapp/droid/service/NotificationTask$1$1;
.super Ljava/lang/Object;
.source "NotificationTask.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/service/NotificationTask$1;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

.field private final synthetic val$alertDialog:Landroid/app/AlertDialog;

.field private final synthetic val$emailPattern:Ljava/util/regex/Pattern;

.field private final synthetic val$input:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/service/NotificationTask$1;Landroid/widget/EditText;Ljava/util/regex/Pattern;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    iput-object p2, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$input:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$emailPattern:Ljava/util/regex/Pattern;

    iput-object p4, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$alertDialog:Landroid/app/AlertDialog;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 73
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;
    invoke-static {v1}, Lcom/thetransitapp/droid/service/NotificationTask$1;->access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$input:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/thetransitapp/droid/service/NotificationTask;->access$2(Lcom/thetransitapp/droid/service/NotificationTask;Ljava/lang/String;)V

    .line 75
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$emailPattern:Ljava/util/regex/Pattern;

    iget-object v2, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;
    invoke-static {v2}, Lcom/thetransitapp/droid/service/NotificationTask$1;->access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;

    move-result-object v2

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask;->email:Ljava/lang/String;
    invoke-static {v2}, Lcom/thetransitapp/droid/service/NotificationTask;->access$3(Lcom/thetransitapp/droid/service/NotificationTask;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;
    invoke-static {v1}, Lcom/thetransitapp/droid/service/NotificationTask$1;->access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/service/NotificationTask;->execute()V

    .line 77
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    .line 84
    :goto_0
    return-void

    .line 79
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->val$input:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->selectAll()V

    .line 81
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;
    invoke-static {v1}, Lcom/thetransitapp/droid/service/NotificationTask$1;->access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/service/NotificationTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0a0099

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 82
    .local v0, "message":Ljava/lang/String;
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1$1;->this$1:Lcom/thetransitapp/droid/service/NotificationTask$1;

    # getter for: Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;
    invoke-static {v1}, Lcom/thetransitapp/droid/service/NotificationTask$1;->access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/service/NotificationTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
