.class Lcom/worklight/androidgap/plugin/BusyIndicator$1;
.super Ljava/lang/Object;
.source "BusyIndicator.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/androidgap/plugin/BusyIndicator;->show(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

.field private final synthetic val$ctx:Lorg/apache/cordova/api/CordovaInterface;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/worklight/androidgap/plugin/BusyIndicator;Lorg/apache/cordova/api/CordovaInterface;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    iput-object p2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->val$ctx:Lorg/apache/cordova/api/CordovaInterface;

    iput-object p3, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->val$text:Ljava/lang/String;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 42
    iget-object v1, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    new-instance v2, Landroid/app/ProgressDialog;

    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->val$ctx:Lorg/apache/cordova/api/CordovaInterface;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$0(Lcom/worklight/androidgap/plugin/BusyIndicator;Landroid/app/ProgressDialog;)V

    .line 43
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    # getter for: Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 44
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    # getter for: Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 45
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    # getter for: Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 46
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    # getter for: Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->val$text:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator$1;->this$0:Lcom/worklight/androidgap/plugin/BusyIndicator;

    # getter for: Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 48
    return-void
.end method
