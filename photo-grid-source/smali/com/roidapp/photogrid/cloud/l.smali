.class public Lcom/roidapp/photogrid/cloud/l;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1428
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 1429
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 1463
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 1464
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1465
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    if-eqz v1, :cond_0

    .line 1466
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    .line 1467
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1468
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#PhotoGrid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .line 1469
    :goto_0
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1470
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-string v4, "clipboard"

    invoke-virtual {v1, v4}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 1471
    invoke-virtual {v1, v2}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 1480
    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 1481
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "path"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1482
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "mime"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1484
    :goto_2
    if-nez v2, :cond_5

    .line 1485
    iget-object v2, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    move-object v3, v2

    .line 1486
    :goto_3
    if-nez v1, :cond_1

    .line 1487
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    .line 1489
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "#PhotoGrid"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-static {v0, v3, v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1492
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->dismiss()V

    .line 1493
    return-void

    .line 1473
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-string v4, "clipboard"

    invoke-virtual {v1, v4}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/ClipboardManager;

    .line 1474
    invoke-virtual {v1, v2}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1489
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v3, v2

    goto :goto_3

    :cond_6
    move-object v1, v3

    move-object v2, v3

    goto :goto_2

    :cond_7
    move-object v2, v1

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1433
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 1434
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 1435
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    .line 1436
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    .line 1437
    :cond_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 1442
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1443
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/l;->setShowsDialog(Z)V

    .line 1444
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    .line 1458
    :goto_0
    return-object v0

    .line 1446
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030025

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1448
    const v0, 0x7f0d00d9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    .line 1449
    const v0, 0x7f0d00d8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1451
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "#photogrid"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1452
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 1454
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1456
    const v0, 0x7f0d00da

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1458
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/l;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 1453
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/l;->b:Landroid/widget/CheckBox;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1
.end method
