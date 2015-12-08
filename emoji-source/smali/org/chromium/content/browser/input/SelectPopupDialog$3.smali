.class Lorg/chromium/content/browser/input/SelectPopupDialog$3;
.super Ljava/lang/Object;
.source "SelectPopupDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/input/SelectPopupDialog;-><init>(Lorg/chromium/content/browser/ContentViewCore;Ljava/util/List;Z[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/input/SelectPopupDialog;

.field final synthetic val$listView:Landroid/widget/ListView;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/input/SelectPopupDialog;Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lorg/chromium/content/browser/input/SelectPopupDialog$3;->this$0:Lorg/chromium/content/browser/input/SelectPopupDialog;

    iput-object p2, p0, Lorg/chromium/content/browser/input/SelectPopupDialog$3;->val$listView:Landroid/widget/ListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .param p2, "v"    # Landroid/view/View;
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
    .line 82
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog$3;->this$0:Lorg/chromium/content/browser/input/SelectPopupDialog;

    iget-object v1, p0, Lorg/chromium/content/browser/input/SelectPopupDialog$3;->val$listView:Landroid/widget/ListView;

    # invokes: Lorg/chromium/content/browser/input/SelectPopupDialog;->getSelectedIndices(Landroid/widget/ListView;)[I
    invoke-static {v1}, Lorg/chromium/content/browser/input/SelectPopupDialog;->access$000(Landroid/widget/ListView;)[I

    move-result-object v1

    # invokes: Lorg/chromium/content/browser/input/SelectPopupDialog;->notifySelection([I)V
    invoke-static {v0, v1}, Lorg/chromium/content/browser/input/SelectPopupDialog;->access$100(Lorg/chromium/content/browser/input/SelectPopupDialog;[I)V

    .line 83
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog$3;->this$0:Lorg/chromium/content/browser/input/SelectPopupDialog;

    # getter for: Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;
    invoke-static {v0}, Lorg/chromium/content/browser/input/SelectPopupDialog;->access$200(Lorg/chromium/content/browser/input/SelectPopupDialog;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 84
    return-void
.end method
