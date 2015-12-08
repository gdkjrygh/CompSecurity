.class public Lcom/arist/activity/ScanMusicActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Lcom/arist/model/scan/d;


# instance fields
.field private a:Lcom/arist/model/skin/ColorTextView;

.field private b:Landroid/widget/TextView;

.field private c:Lcom/arist/model/scan/MusicScanProgressView;

.field private d:Lcom/arist/model/skin/ColorCheckBox;

.field private e:Lcom/arist/model/skin/ColorProgressBar;

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/ScanMusicActivity;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/activity/ScanMusicActivity;->g:Z

    return-void
.end method

.method private b()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/activity/ScanMusicActivity;->g:Z

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09006f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004b

    new-instance v2, Lcom/arist/activity/ak;

    invoke-direct {v2, p0}, Lcom/arist/activity/ak;-><init>(Lcom/arist/activity/ScanMusicActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/al;

    invoke-direct {v1, p0}, Lcom/arist/activity/al;-><init>(Lcom/arist/activity/ScanMusicActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->b(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->finish()V

    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 5

    const v2, 0x7f090105

    const/4 v4, 0x0

    const/4 v1, 0x4

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->b()V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    const v1, 0x7f09006d

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorTextView;->setText(I)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->a()V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0, v2}, Lcom/arist/model/skin/ColorTextView;->setText(I)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->c()V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v4}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    if-eqz p2, :cond_1

    iget-object v1, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const v2, 0x7f090107

    invoke-virtual {p0, v2}, Lcom/arist/activity/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v4}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :pswitch_3
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->c()V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const v1, 0x7f090108

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0, v2}, Lcom/arist/model/skin/ColorTextView;->setText(I)V

    goto/16 :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    invoke-virtual {v0}, Lcom/arist/model/scan/MusicScanProgressView;->c()V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const v1, 0x7f09009d

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/arist/activity/ScanMusicActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    const v1, 0x7f09006b

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorTextView;->setText(I)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public handleBackClicked(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->onBackPressed()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/arist/activity/ScanMusicActivity;->b()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->finish()V

    goto :goto_0
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0, p2}, Lcom/arist/c/f;->a(Z)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->b(Landroid/content/Context;)V

    :goto_0
    return-void

    :sswitch_0
    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/scan/MediaScanService;->a(Landroid/content/Context;)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/arist/activity/ScanMusicActivity;->onBackPressed()V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f030006

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->setContentView(I)V

    if-nez p1, :cond_1

    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->c()V

    :goto_0
    const v0, 0x7f06003f

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f06003e

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorTextView;

    iput-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    const v0, 0x7f06003d

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/scan/MusicScanProgressView;

    iput-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->c:Lcom/arist/model/scan/MusicScanProgressView;

    const v0, 0x7f060040

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorProgressBar;

    iput-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->e:Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->setVisibility(I)V

    const v0, 0x7f060041

    invoke-virtual {p0, v0}, Lcom/arist/activity/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorCheckBox;

    iput-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->d:Lcom/arist/model/skin/ColorCheckBox;

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->d:Lcom/arist/model/skin/ColorCheckBox;

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorCheckBox;->a(Z)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->d:Lcom/arist/model/skin/ColorCheckBox;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorCheckBox;->a(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arist/activity/ScanMusicActivity;->a:Lcom/arist/model/skin/ColorTextView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorTextView;->a()V

    invoke-static {p0}, Lcom/arist/model/scan/MediaScanService;->a(Lcom/arist/model/scan/d;)V

    invoke-static {}, Lcom/arist/model/scan/MediaScanService;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/arist/activity/ScanMusicActivity;->a(ILjava/lang/Object;)V

    iget-boolean v0, p0, Lcom/arist/activity/ScanMusicActivity;->g:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/arist/activity/ScanMusicActivity;->b()V

    :cond_0
    return-void

    :cond_1
    const-string v0, "showExitDialog"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/arist/activity/ScanMusicActivity;->g:Z

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 0

    invoke-static {p0}, Lcom/arist/model/scan/MediaScanService;->b(Lcom/arist/model/scan/d;)V

    invoke-super {p0}, Lcom/arist/activity/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "showExitDialog"

    iget-boolean v1, p0, Lcom/arist/activity/ScanMusicActivity;->g:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
