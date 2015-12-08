.class Lcom/scannerfire/model/CustomListAdapter$1;
.super Ljava/lang/Object;
.source "CustomListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/model/CustomListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/model/CustomListAdapter;

.field private final synthetic val$model:Lcom/scannerfire/model/QRModel;

.field private final synthetic val$position:I

.field private final synthetic val$row:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/scannerfire/model/CustomListAdapter;Lcom/scannerfire/model/QRModel;Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iput-object p2, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$model:Lcom/scannerfire/model/QRModel;

    iput-object p3, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$row:Landroid/view/View;

    iput p4, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$position:I

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 97
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v1, v1, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v1, v1, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    const-string v2, "vibrator"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    .line 99
    .local v0, "vib":Landroid/os/Vibrator;
    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 102
    .end local v0    # "vib":Landroid/os/Vibrator;
    :cond_0
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v1, v1, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$model:Lcom/scannerfire/model/QRModel;

    iget-object v3, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$row:Landroid/view/View;

    iget v4, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$position:I

    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    invoke-static {v1, v2, v3, v4, v5}, Lcom/scannerfire/utils/Utils;->createQuickMenu(Landroid/app/Activity;Lcom/scannerfire/model/QRModel;Landroid/view/View;ILcom/scannerfire/model/CustomListAdapter;)Lcom/QRBS/QuickAction/QuickActionPopup;

    .line 103
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v1, v1, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    check-cast v1, Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/fragment/FragmentCronology;

    invoke-virtual {v1}, Lcom/scannerfire/fragment/FragmentCronology;->clearCronology()V

    .line 104
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    iget-object v2, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v2, v2, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f09002a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 105
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter$1;->this$0:Lcom/scannerfire/model/CustomListAdapter;

    iget-object v1, v1, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    iget v2, p0, Lcom/scannerfire/model/CustomListAdapter$1;->val$position:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/model/QRModel;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 107
    return-void
.end method
