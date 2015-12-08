.class Lcom/scannerfire/utils/Utils$2$1;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/utils/Utils$2;->onItemClick(Lcom/QRBS/QuickAction/QuickActionPopup;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/scannerfire/utils/Utils$2;

.field private final synthetic val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

.field private final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/scannerfire/utils/Utils$2;Lcom/scannerfire/model/CustomListAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/utils/Utils$2$1;->this$1:Lcom/scannerfire/utils/Utils$2;

    iput-object p2, p0, Lcom/scannerfire/utils/Utils$2$1;->val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    iput p3, p0, Lcom/scannerfire/utils/Utils$2$1;->val$position:I

    .line 598
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 601
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$2$1;->val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    iget v1, p0, Lcom/scannerfire/utils/Utils$2$1;->val$position:I

    invoke-virtual {v0, v1}, Lcom/scannerfire/model/CustomListAdapter;->remove(I)V

    .line 602
    iget-object v0, p0, Lcom/scannerfire/utils/Utils$2$1;->val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0}, Lcom/scannerfire/model/CustomListAdapter;->notifyDataSetChanged()V

    .line 603
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 604
    return-void
.end method
