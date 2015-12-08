.class Lorg/chromium/ui/picker/InputDialogContainer$1;
.super Ljava/lang/Object;
.source "InputDialogContainer.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


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

.field final synthetic val$adapter:Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;

.field final synthetic val$dialogType:I

.field final synthetic val$dialogValue:D

.field final synthetic val$max:D

.field final synthetic val$min:D

.field final synthetic val$step:D


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/InputDialogContainer;Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;IDDDD)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iput-object p2, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$adapter:Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;

    iput p3, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$dialogType:I

    iput-wide p4, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$dialogValue:D

    iput-wide p6, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$min:D

    iput-wide p8, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$max:D

    iput-wide p10, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$step:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 12
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 147
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$adapter:Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p3, v0, :cond_0

    .line 148
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->dismissDialog()V

    .line 149
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    iget v1, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$dialogType:I

    iget-wide v2, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$dialogValue:D

    iget-wide v4, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$min:D

    iget-wide v6, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$max:D

    iget-wide v8, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$step:D

    invoke-virtual/range {v0 .. v9}, Lorg/chromium/ui/picker/InputDialogContainer;->showPickerDialog(IDDDD)V

    .line 156
    :goto_0
    return-void

    .line 151
    :cond_0
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->val$adapter:Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;

    invoke-virtual {v0, p3}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/picker/DateTimeSuggestion;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/DateTimeSuggestion;->value()D

    move-result-wide v10

    .line 152
    .local v10, "suggestionValue":D
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    # getter for: Lorg/chromium/ui/picker/InputDialogContainer;->mInputActionDelegate:Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;
    invoke-static {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->access$000(Lorg/chromium/ui/picker/InputDialogContainer;)Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;

    move-result-object v0

    invoke-interface {v0, v10, v11}, Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;->replaceDateTime(D)V

    .line 153
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    invoke-virtual {v0}, Lorg/chromium/ui/picker/InputDialogContainer;->dismissDialog()V

    .line 154
    iget-object v0, p0, Lorg/chromium/ui/picker/InputDialogContainer$1;->this$0:Lorg/chromium/ui/picker/InputDialogContainer;

    const/4 v1, 0x1

    # setter for: Lorg/chromium/ui/picker/InputDialogContainer;->mDialogAlreadyDismissed:Z
    invoke-static {v0, v1}, Lorg/chromium/ui/picker/InputDialogContainer;->access$102(Lorg/chromium/ui/picker/InputDialogContainer;Z)Z

    goto :goto_0
.end method
