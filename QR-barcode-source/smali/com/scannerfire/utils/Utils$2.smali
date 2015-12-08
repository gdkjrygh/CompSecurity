.class Lcom/scannerfire/utils/Utils$2;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/utils/Utils;->createQuickMenu(Landroid/app/Activity;Lcom/scannerfire/model/QRModel;Landroid/view/View;ILcom/scannerfire/model/CustomListAdapter;)Lcom/QRBS/QuickAction/QuickActionPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

.field private final synthetic val$mode:Lcom/scannerfire/utils/Utils$MODE;

.field private final synthetic val$parsed:Lcom/google/zxing/client/result/ParsedResult;

.field private final synthetic val$position:I

.field private final synthetic val$result:Lcom/google/zxing/Result;

.field private final synthetic val$ru:Lcom/scannerfire/utils/ResultUtils;

.field private final synthetic val$startA:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/google/zxing/Result;Lcom/scannerfire/utils/ResultUtils;Lcom/google/zxing/client/result/ParsedResult;Lcom/scannerfire/utils/Utils$MODE;Lcom/scannerfire/model/CustomListAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    iput-object p2, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    iput-object p3, p0, Lcom/scannerfire/utils/Utils$2;->val$ru:Lcom/scannerfire/utils/ResultUtils;

    iput-object p4, p0, Lcom/scannerfire/utils/Utils$2;->val$parsed:Lcom/google/zxing/client/result/ParsedResult;

    iput-object p5, p0, Lcom/scannerfire/utils/Utils$2;->val$mode:Lcom/scannerfire/utils/Utils$MODE;

    iput-object p6, p0, Lcom/scannerfire/utils/Utils$2;->val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    iput p7, p0, Lcom/scannerfire/utils/Utils$2;->val$position:I

    .line 583
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/QRBS/QuickAction/QuickActionPopup;II)V
    .locals 12
    .param p1, "source"    # Lcom/QRBS/QuickAction/QuickActionPopup;
    .param p2, "pos"    # I
    .param p3, "actionId"    # I

    .prologue
    .line 590
    packed-switch p3, :pswitch_data_0

    .line 650
    :goto_0
    return-void

    .line 594
    :pswitch_0
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-direct {v2, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 595
    .local v2, "build":Landroid/app/AlertDialog$Builder;
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f080142

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 596
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f08015a

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 597
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0800b8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 598
    new-instance v8, Lcom/scannerfire/utils/Utils$2$1;

    iget-object v9, p0, Lcom/scannerfire/utils/Utils$2;->val$arrayAdapter:Lcom/scannerfire/model/CustomListAdapter;

    iget v10, p0, Lcom/scannerfire/utils/Utils$2;->val$position:I

    invoke-direct {v8, p0, v9, v10}, Lcom/scannerfire/utils/Utils$2$1;-><init>(Lcom/scannerfire/utils/Utils$2;Lcom/scannerfire/model/CustomListAdapter;I)V

    .line 597
    invoke-virtual {v2, v7, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 606
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0800b7

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 607
    new-instance v8, Lcom/scannerfire/utils/Utils$2$2;

    invoke-direct {v8, p0}, Lcom/scannerfire/utils/Utils$2$2;-><init>(Lcom/scannerfire/utils/Utils$2;)V

    .line 606
    invoke-virtual {v2, v7, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 615
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 616
    .local v0, "alert":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 629
    .end local v0    # "alert":Landroid/app/AlertDialog;
    .end local v2    # "build":Landroid/app/AlertDialog$Builder;
    :pswitch_1
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-static {v7}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v1

    .line 630
    .local v1, "b":Landroid/os/Bundle;
    new-instance v4, Landroid/content/Intent;

    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    const-class v8, Lcom/QRBS/activity/Visualizza;

    invoke-direct {v4, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 631
    .local v4, "i":Landroid/content/Intent;
    const-string v7, "bundle"

    invoke-virtual {v4, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 632
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 636
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v4    # "i":Landroid/content/Intent;
    :pswitch_2
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$ru:Lcom/scannerfire/utils/ResultUtils;

    iget-object v8, p0, Lcom/scannerfire/utils/Utils$2;->val$parsed:Lcom/google/zxing/client/result/ParsedResult;

    invoke-virtual {v8}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-virtual {v9}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-virtual {v10}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-virtual {v7, v8, v9, v10, v11}, Lcom/scannerfire/utils/ResultUtils;->makeAction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/zxing/Result;)V

    goto/16 :goto_0

    .line 642
    :pswitch_3
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$mode:Lcom/scannerfire/utils/Utils$MODE;

    iget-object v8, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-static {v7, v8}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v5

    .line 643
    .local v5, "s":Ljava/lang/String;
    new-instance v3, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-direct {v3, v7}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 644
    .local v3, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-virtual {v7}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7, v5}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 647
    .end local v3    # "eu":Lcom/scannerfire/utils/EncodeUtils;
    .end local v5    # "s":Ljava/lang/String;
    :pswitch_4
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$mode:Lcom/scannerfire/utils/Utils$MODE;

    iget-object v8, p0, Lcom/scannerfire/utils/Utils$2;->val$result:Lcom/google/zxing/Result;

    invoke-static {v7, v8}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v6

    .line 648
    .local v6, "s1":Ljava/lang/String;
    iget-object v7, p0, Lcom/scannerfire/utils/Utils$2;->val$startA:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v6}, Lcom/scannerfire/utils/Utils;->copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 590
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
