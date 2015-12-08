.class public Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;
.super Landroid/app/Activity;
.source "MiSnapPreviewActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;,
        Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;
    }
.end annotation


# static fields
.field public static final RETAKE_RESPONSE_CODE:I = 0x845fed

.field public static final TAG:Ljava/lang/String; = "MiSnapPreviewActivity"

.field public static final USE_RESPONSE_CODE:I = 0x631198


# instance fields
.field private outerLayout:Landroid/widget/RelativeLayout;

.field private retakeButton:Landroid/widget/Button;

.field private useButton:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 30
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->outerLayout:Landroid/widget/RelativeLayout;

    .line 31
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->useButton:Landroid/widget/Button;

    .line 32
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->retakeButton:Landroid/widget/Button;

    .line 153
    return-void
.end method

.method static synthetic access$200(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->finishRetakeOrBackPressed()V

    return-void
.end method

.method private decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 4
    .param p1, "data"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .param p4, "opts"    # Landroid/graphics/BitmapFactory$Options;

    .prologue
    .line 114
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 129
    :goto_0
    return-object v1

    .line 116
    :catch_0
    move-exception v0

    .line 118
    .local v0, "oome":Ljava/lang/OutOfMemoryError;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09014c

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09014e

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "OK"

    new-instance v3, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;

    invoke-direct {v3, p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;-><init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 129
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private finishRetakeOrBackPressed()V
    .locals 2

    .prologue
    .line 95
    const v0, 0x845fed

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->setResult(ILandroid/content/Intent;)V

    .line 96
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->finish()V

    .line 97
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->finishRetakeOrBackPressed()V

    .line 88
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v7, 0x0

    const/16 v5, 0x400

    const/4 v6, 0x0

    .line 40
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    const/4 v4, 0x1

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->requestWindowFeature(I)Z

    .line 42
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v5, v5}, Landroid/view/Window;->setFlags(II)V

    .line 43
    const v4, 0x7f03001b

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->setContentView(I)V

    .line 44
    invoke-virtual {p0, v6}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->setRequestedOrientation(I)V

    .line 46
    const v4, 0x7f0800b7

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->outerLayout:Landroid/widget/RelativeLayout;

    .line 47
    const v4, 0x7f0800bb

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->useButton:Landroid/widget/Button;

    .line 48
    const v4, 0x7f0800ba

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->retakeButton:Landroid/widget/Button;

    .line 50
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->useButton:Landroid/widget/Button;

    new-instance v5, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;

    invoke-direct {v5, p0, v7}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;-><init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->retakeButton:Landroid/widget/Button;

    new-instance v5, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;

    invoke-direct {v5, p0, v7}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;-><init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "com.miteksystems.misnap.PICTURE"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v3

    .line 54
    .local v3, "rawImageData":[B
    if-eqz v3, :cond_0

    .line 57
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 59
    .local v2, "opts":Landroid/graphics/BitmapFactory$Options;
    const/16 v4, 0x4000

    new-array v4, v4, [B

    iput-object v4, v2, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 60
    array-length v4, v3

    invoke-direct {p0, v3, v6, v4, v2}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 61
    .local v0, "background":Landroid/graphics/Bitmap;
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 62
    .local v1, "backgroundDrawable":Landroid/graphics/drawable/Drawable;
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->outerLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .end local v0    # "background":Landroid/graphics/Bitmap;
    .end local v1    # "backgroundDrawable":Landroid/graphics/drawable/Drawable;
    .end local v2    # "opts":Landroid/graphics/BitmapFactory$Options;
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 73
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 75
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-nez v1, :cond_0

    .line 76
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 77
    .local v0, "timeout":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 79
    .end local v0    # "timeout":Landroid/content/Intent;
    :cond_0
    return-void
.end method
