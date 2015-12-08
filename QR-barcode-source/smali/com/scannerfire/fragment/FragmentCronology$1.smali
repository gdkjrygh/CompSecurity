.class Lcom/scannerfire/fragment/FragmentCronology$1;
.super Ljava/lang/Object;
.source "FragmentCronology.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/fragment/FragmentCronology;->updateList(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/fragment/FragmentCronology;

.field private final synthetic val$array:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/scannerfire/fragment/FragmentCronology;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    iput-object p2, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->val$array:Ljava/util/ArrayList;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arg3"    # J
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
    .line 104
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    iget-object v1, v1, Lcom/scannerfire/fragment/FragmentCronology;->startA:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 105
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    iget-object v1, v1, Lcom/scannerfire/fragment/FragmentCronology;->startA:Landroid/app/Activity;

    const-string v2, "vibrator"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    .line 106
    .local v0, "vib":Landroid/os/Vibrator;
    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 108
    .end local v0    # "vib":Landroid/os/Vibrator;
    :cond_0
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    iget-object v2, v1, Lcom/scannerfire/fragment/FragmentCronology;->startA:Landroid/app/Activity;

    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->val$array:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/model/QRModel;

    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    iget-object v3, v3, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-static {v2, v1, p2, p3, v3}, Lcom/scannerfire/utils/Utils;->createQuickMenu(Landroid/app/Activity;Lcom/scannerfire/model/QRModel;Landroid/view/View;ILcom/scannerfire/model/CustomListAdapter;)Lcom/QRBS/QuickAction/QuickActionPopup;

    .line 113
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    invoke-virtual {v1}, Lcom/scannerfire/fragment/FragmentCronology;->clearCronology()V

    .line 115
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->this$0:Lcom/scannerfire/fragment/FragmentCronology;

    invoke-virtual {v2}, Lcom/scannerfire/fragment/FragmentCronology;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f09002a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology$1;->val$array:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/model/QRModel;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 117
    return-void
.end method
