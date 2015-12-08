.class public Lkik/android/chat/activity/KikCropActivity;
.super Lkik/android/chat/activity/KikActivityBase;
.source "SourceFile"


# instance fields
.field private a:Lkik/android/widget/KikCropView;

.field private e:Z

.field private f:Ljava/io/File;

.field private g:Ljava/io/File;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lkik/android/chat/activity/KikActivityBase;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/activity/KikCropActivity;->e:Z

    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikCropActivity;)V
    .locals 4

    .prologue
    const v2, 0x7f090134

    const/4 v1, 0x1

    .line 23
    iget-boolean v0, p0, Lkik/android/chat/activity/KikCropActivity;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->finish()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-boolean v1, p0, Lkik/android/chat/activity/KikCropActivity;->e:Z

    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    invoke-virtual {v0}, Lkik/android/widget/KikCropView;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lkik/android/chat/activity/KikCropActivity;->g:Ljava/io/File;

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x50

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    const/4 v2, -0x1

    invoke-virtual {p0, v2}, Lkik/android/chat/activity/KikCropActivity;->setResult(I)V

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->finish()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    const v0, 0x7f090134

    const/4 v2, 0x1

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_0

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_4

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_4
    :goto_3
    throw v0

    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/chat/activity/KikCropActivity;)Lkik/android/widget/KikCropView;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    return-object v0
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 161
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikActivityBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 162
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const v4, 0x7f090062

    const/4 v3, 0x1

    .line 36
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikActivityBase;->onCreate(Landroid/os/Bundle;)V

    .line 37
    const v0, 0x7f03000b

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->setContentView(I)V

    .line 39
    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/e;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    .line 40
    invoke-static {v0, p0}, Lkik/android/util/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->f:Ljava/io/File;

    .line 41
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "output"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lkik/android/chat/activity/KikCropActivity;->g:Ljava/io/File;

    .line 42
    const v0, 0x7f0e005b

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/KikCropView;

    iput-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    .line 44
    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->f:Ljava/io/File;

    if-nez v0, :cond_1

    .line 46
    invoke-virtual {p0, v4}, Lkik/android/chat/activity/KikCropActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 47
    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->finish()V

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 51
    :cond_1
    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    iget-object v1, p0, Lkik/android/chat/activity/KikCropActivity;->f:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/KikCropView;->a(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    invoke-virtual {v0}, Lkik/android/widget/KikCropView;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 54
    invoke-virtual {p0, v4}, Lkik/android/chat/activity/KikCropActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 55
    invoke-virtual {p0}, Lkik/android/chat/activity/KikCropActivity;->finish()V

    goto :goto_0

    .line 59
    :cond_2
    const v0, 0x7f0e005a

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 60
    new-instance v1, Lkik/android/chat/activity/ac;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/ac;-><init>(Lkik/android/chat/activity/KikCropActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    const v0, 0x7f0e0013

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 70
    new-instance v1, Lkik/android/chat/activity/ad;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/ad;-><init>(Lkik/android/chat/activity/KikCropActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    const v0, 0x7f0e0057

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lkik/android/chat/activity/ae;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/ae;-><init>(Lkik/android/chat/activity/KikCropActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    const v0, 0x7f0e0058

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lkik/android/chat/activity/af;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/af;-><init>(Lkik/android/chat/activity/KikCropActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    const v0, 0x7f0e001d

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    new-instance v1, Lkik/android/chat/activity/ag;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/ag;-><init>(Lkik/android/chat/activity/KikCropActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    :cond_3
    const v0, 0x7f0e0078

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 109
    if-eqz v0, :cond_0

    .line 110
    const v1, 0x7f09022b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 167
    invoke-super {p0}, Lkik/android/chat/activity/KikActivityBase;->onDestroy()V

    .line 168
    iget-object v0, p0, Lkik/android/chat/activity/KikCropActivity;->a:Lkik/android/widget/KikCropView;

    invoke-virtual {v0}, Lkik/android/widget/KikCropView;->e()V

    .line 169
    return-void
.end method
