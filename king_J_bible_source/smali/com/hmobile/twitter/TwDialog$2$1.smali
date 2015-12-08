.class Lcom/hmobile/twitter/TwDialog$2$1;
.super Ljava/lang/Object;
.source "TwDialog.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/twitter/TwDialog$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/twitter/TwDialog$2;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/TwDialog$2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/TwDialog$2$1;->this$1:Lcom/hmobile/twitter/TwDialog$2;

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$2$1;->this$1:Lcom/hmobile/twitter/TwDialog$2;

    # getter for: Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog$2;->access$0(Lcom/hmobile/twitter/TwDialog$2;)Lcom/hmobile/twitter/TwDialog;

    move-result-object v0

    # getter for: Lcom/hmobile/twitter/TwDialog;->mSpinner:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog;->access$2(Lcom/hmobile/twitter/TwDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 184
    iget-object v0, p0, Lcom/hmobile/twitter/TwDialog$2$1;->this$1:Lcom/hmobile/twitter/TwDialog$2;

    # getter for: Lcom/hmobile/twitter/TwDialog$2;->this$0:Lcom/hmobile/twitter/TwDialog;
    invoke-static {v0}, Lcom/hmobile/twitter/TwDialog$2;->access$0(Lcom/hmobile/twitter/TwDialog$2;)Lcom/hmobile/twitter/TwDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/hmobile/twitter/TwDialog;->dismiss()V

    .line 185
    return-void
.end method
