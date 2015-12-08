.class Lcom/facebook/internal/WebDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/WebDialog;


# direct methods
.method constructor <init>(Lcom/facebook/internal/WebDialog;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/internal/WebDialog$1;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/internal/WebDialog$1;->this$0:Lcom/facebook/internal/WebDialog;

    invoke-virtual {v0}, Lcom/facebook/internal/WebDialog;->cancel()V

    .line 227
    return-void
.end method
