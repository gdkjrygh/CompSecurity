.class Lorg/chromium/ui/picker/InputDialogContainer$2;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/picker/InputDialogContainer;->showSuggestionDialog(IDDDD[Lorg/chromium/ui/picker/DateTimeSuggestion;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/picker/InputDialogContainer;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$2;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 178
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$2;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->dismissDialog()V

    .line 179
    return-void
.end method
