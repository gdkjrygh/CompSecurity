.class public Lcom/scannerfire/fragment/FragmentCronology;
.super Lcom/actionbarsherlock/app/SherlockFragment;
.source "FragmentCronology.java"


# static fields
.field protected static final CODE_ACTION:I = 0x2

.field protected static final CODE_DELETE:I = 0x1

.field protected static final CODE_SEE:I = 0x0

.field protected static final CODE_SHARE:I = 0x3


# instance fields
.field arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

.field db:Lcom/scannerfire/db/DbAdapter;

.field private list:Landroid/widget/ListView;

.field qrArray:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;"
        }
    .end annotation
.end field

.field startA:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragment;-><init>()V

    return-void
.end method

.method static newInstance(I)Lcom/scannerfire/fragment/FragmentCronology;
    .locals 1
    .param p0, "num"    # I

    .prologue
    .line 41
    new-instance v0, Lcom/scannerfire/fragment/FragmentCronology;

    invoke-direct {v0}, Lcom/scannerfire/fragment/FragmentCronology;-><init>()V

    .line 42
    .local v0, "f":Lcom/scannerfire/fragment/FragmentCronology;
    return-object v0
.end method


# virtual methods
.method public clearCronology()V
    .locals 4

    .prologue
    .line 145
    const/4 v0, 0x0

    .local v0, "j":I
    :goto_0
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 147
    return-void

    .line 146
    :cond_0
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, -0x1

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 145
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public deleteRecord(I)V
    .locals 2
    .param p1, "pos"    # I

    .prologue
    .line 132
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    if-nez v0, :cond_0

    const-string v0, ""

    const-string v1, "array null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0, p1}, Lcom/scannerfire/model/CustomListAdapter;->remove(I)V

    .line 134
    return-void
.end method

.method public getAdapter()Lcom/scannerfire/model/CustomListAdapter;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 47
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreate(Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentCronology;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->startA:Landroid/app/Activity;

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/scannerfire/fragment/FragmentCronology;->setHasOptionsMenu(Z)V

    .line 50
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 56
    const-string v2, ""

    const-string v3, "ON CREATE VIEW"

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    const v2, 0x7f030027

    const/4 v3, 0x0

    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 59
    .local v1, "v":Landroid/view/View;
    const v2, 0x7f0d008f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ListView;

    iput-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    .line 60
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setTextFilterEnabled(Z)V

    .line 61
    new-instance v2, Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentCronology;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    .line 63
    :try_start_0
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->getValues()Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    .line 70
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentCronology;->updateList(Ljava/util/ArrayList;)V

    .line 71
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 72
    :goto_0
    return-object v1

    .line 65
    :catch_0
    move-exception v0

    .line 66
    .local v0, "e":Landroid/database/SQLException;
    invoke-static {v0}, Lcom/splunk/mint/Mint;->logException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 4

    .prologue
    .line 77
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockFragment;->onResume()V

    .line 78
    new-instance v2, Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentCronology;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    .line 79
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 80
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->getValues()Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    .line 81
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 82
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentCronology;->updateList(Ljava/util/ArrayList;)V

    .line 84
    :cond_0
    invoke-static {}, Lcom/scannerfire/utils/Utils;->getLastElem()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 85
    const/4 v1, -0x1

    .line 86
    .local v1, "index":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_2

    .line 88
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 91
    .end local v0    # "i":I
    .end local v1    # "index":I
    :cond_1
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->db:Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 94
    return-void

    .line 87
    .restart local v0    # "i":I
    .restart local v1    # "index":I
    :cond_2
    iget-object v2, p0, Lcom/scannerfire/fragment/FragmentCronology;->qrArray:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scannerfire/model/QRModel;

    invoke-virtual {v2}, Lcom/scannerfire/model/QRModel;->getId()I

    move-result v2

    invoke-static {}, Lcom/scannerfire/utils/Utils;->getLastElem()I

    move-result v3

    if-ne v2, v3, :cond_3

    move v1, v0

    .line 86
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public updateList()V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0}, Lcom/scannerfire/model/CustomListAdapter;->notifyDataSetChanged()V

    .line 138
    return-void
.end method

.method public updateList(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 97
    .local p1, "array":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    new-instance v0, Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentCronology;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f030039

    invoke-direct {v0, v1, v2, p1}, Lcom/scannerfire/model/CustomListAdapter;-><init>(Landroid/app/Activity;ILjava/util/ArrayList;)V

    iput-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    .line 98
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 99
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    new-instance v1, Lcom/scannerfire/fragment/FragmentCronology$1;

    invoke-direct {v1, p0, p1}, Lcom/scannerfire/fragment/FragmentCronology$1;-><init>(Lcom/scannerfire/fragment/FragmentCronology;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 119
    return-void
.end method

.method public updateList(Ljava/util/ArrayList;Landroid/app/Activity;)V
    .locals 2
    .param p2, "a"    # Landroid/app/Activity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 123
    .local p1, "array":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    new-instance v0, Lcom/scannerfire/model/CustomListAdapter;

    const v1, 0x7f030039

    invoke-direct {v0, p2, v1, p1}, Lcom/scannerfire/model/CustomListAdapter;-><init>(Landroid/app/Activity;ILjava/util/ArrayList;)V

    iput-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    .line 124
    const v0, 0x7f0d008f

    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    .line 125
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/scannerfire/fragment/FragmentCronology;->list:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentCronology;->arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 127
    :cond_0
    return-void
.end method
