.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/v5/AveDBUpdateService$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

.field private b:Z


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    const-wide/16 v6, 0x0

    .line 62
    if-nez p1, :cond_0

    .line 84
    :goto_0
    return-void

    .line 65
    :cond_0
    const-string/jumbo v0, "current"

    invoke-virtual {p1, v0, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 66
    const-string/jumbo v0, "total"

    invoke-virtual {p1, v0, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 67
    const/4 v0, 0x0

    .line 68
    cmp-long v1, v4, v6

    if-lez v1, :cond_1

    cmp-long v1, v2, v4

    if-gtz v1, :cond_1

    .line 69
    long-to-float v0, v2

    long-to-float v1, v4

    div-float/2addr v0, v1

    .line 71
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->a(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/ProgressView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/ProgressView;->setProgress(F)V

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->b(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeNoFraction(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->c(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeNoFraction(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v9, [I

    const v2, 0x7f0c014f

    aput v2, v1, v8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v9, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$1;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;)V

    aput-object v2, v1, v8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->b:Z

    .line 89
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const v1, 0x7f0c01b4

    const/4 v4, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x0

    .line 93
    if-nez p1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 119
    :goto_0
    return-void

    .line 96
    :cond_0
    const-string/jumbo v0, "errorResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 97
    packed-switch v0, :pswitch_data_0

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 105
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->f(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->g(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->h(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v4, [I

    const v2, 0x7f0c014e

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$2;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;)V

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 99
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const v1, 0x7f0c01b3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 97
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 123
    if-nez p1, :cond_0

    .line 140
    :goto_0
    return-void

    .line 126
    :cond_0
    const-string/jumbo v0, "data_file_path"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_2

    .line 128
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "avedb_e.zip"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 129
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 131
    :try_start_0
    invoke-static {v1}, Lcom/qihoo360/common/utils/FileUtil;->forceDelete(Ljava/io/File;)V

    .line 132
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyFile(Ljava/io/File;Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "avedb_e.zip"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/common/utils/FileUtil;->setFileTimestamp(Landroid/content/Context;Ljava/lang/String;J)V

    .line 139
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->b:Z

    goto :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->a(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/ProgressView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/widget/ProgressView;->a(FI)V

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->b(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->c(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->f(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->h(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->g(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 150
    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/16 v2, 0x8

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 154
    if-nez p1, :cond_0

    .line 185
    :goto_0
    return-void

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->f(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->g(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    const-string/jumbo v0, "data_file_version"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->b:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const v1, 0x7f0c01b2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->h(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 176
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v6, [I

    const v2, 0x7f0c014e

    aput v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    new-array v1, v6, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$3;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$3;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;)V

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 166
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v2, "key_virus_scan_strict_version"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->j(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    .line 168
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->k(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v2, v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c01a9

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(Ljava/lang/String;)V

    .line 170
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    const v2, 0x7f0c01b1

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 171
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v2, v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c01b5

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->h(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_1
.end method
