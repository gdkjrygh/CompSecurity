.class public Lcom/hmobile/biblekjv/WidgetSelectorActivity;
.super Landroid/app/Activity;
.source "WidgetSelectorActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final PREFS_NAME:Ljava/lang/String; = "MyPrefsFile"


# instance fields
.field FromApp:Z

.field appWidgetId:I

.field btnCancel:Landroid/widget/Button;

.field btnReset:Landroid/widget/Button;

.field btnSave:Landroid/widget/Button;

.field chkLowLight:Landroid/widget/CheckBox;

.field duration:I

.field editor:Landroid/content/SharedPreferences$Editor;

.field f_size:[I

.field fontStyle:[Ljava/lang/String;

.field font_size:I

.field private hours:[Ljava/lang/String;

.field isLowLight:Z

.field private rlwidget:Landroid/widget/RelativeLayout;

.field settings:Landroid/content/SharedPreferences;

.field spnFontSize:Landroid/widget/Spinner;

.field spnFontStyle:Landroid/widget/Spinner;

.field spnWidgetUpdateDuration:Landroid/widget/Spinner;

.field style:I

.field txtBookInfo:Landroid/widget/TextView;

.field private txtLowLighthint:Landroid/widget/TextView;

.field txtVerse:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 33
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 43
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->f_size:[I

    .line 45
    const/16 v0, 0x10

    iput v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    .line 46
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    .line 47
    iput v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    .line 48
    const/4 v0, 0x3

    iput v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->duration:I

    .line 52
    iput v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->appWidgetId:I

    .line 53
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->FromApp:Z

    .line 33
    return-void

    .line 43
    :array_0
    .array-data 4
        0xc
        0xe
        0x10
        0x12
    .end array-data
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->hours:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;

    return-object v0
.end method


# virtual methods
.method public Reset()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 207
    iput v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    .line 208
    const/16 v0, 0x10

    iput v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    .line 209
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    .line 211
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "widget_font_style"

    iget v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 212
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "widget_font_size"

    iget v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 213
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "widget_low_light"

    iget-boolean v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 214
    iget-object v0, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 215
    return-void
.end method

.method public getSettings()V
    .locals 10

    .prologue
    const/4 v9, -0x1

    const/high16 v8, -0x1000000

    .line 166
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_font_style"

    iget v7, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    iput v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    .line 167
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_font_size"

    const/16 v7, 0x10

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    iput v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    .line 168
    const/4 v2, 0x0

    .line 169
    .local v2, "fontsize_id":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->f_size:[I

    array-length v5, v5

    if-lt v3, v5, :cond_0

    .line 175
    :goto_1
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontSize:Landroid/widget/Spinner;

    invoke-virtual {v5, v2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 176
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontStyle:Landroid/widget/Spinner;

    iget v6, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    invoke-virtual {v5, v6}, Landroid/widget/Spinner;->setSelection(I)V

    .line 177
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_low_light"

    const/4 v7, 0x0

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    iput-boolean v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    .line 178
    iget-boolean v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    if-eqz v5, :cond_2

    .line 179
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 180
    const v7, 0x7f07006e

    .line 179
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;

    const v6, 0x7f0200ae

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 182
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 183
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtBookInfo:Landroid/widget/TextView;

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    :goto_2
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_update_duration"

    const/4 v7, 0x3

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 194
    .local v1, "dur":I
    const/4 v4, 0x0

    .line 195
    .local v4, "position":I
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0d0004

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 196
    .local v0, "arr":[Ljava/lang/String;
    const/4 v3, 0x0

    :goto_3
    array-length v5, v0

    if-lt v3, v5, :cond_3

    .line 201
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnWidgetUpdateDuration:Landroid/widget/Spinner;

    invoke-virtual {v5, v4}, Landroid/widget/Spinner;->setSelection(I)V

    .line 203
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->chkLowLight:Landroid/widget/CheckBox;

    iget-boolean v6, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    invoke-virtual {v5, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 204
    return-void

    .line 170
    .end local v0    # "arr":[Ljava/lang/String;
    .end local v1    # "dur":I
    .end local v4    # "position":I
    :cond_0
    iget v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    iget-object v6, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->f_size:[I

    aget v6, v6, v3

    if-ne v5, v6, :cond_1

    .line 171
    move v2, v3

    .line 172
    goto :goto_1

    .line 169
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 186
    :cond_2
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 187
    const v7, 0x7f07006f

    .line 186
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;

    const v6, 0x7f0200b0

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 189
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 190
    iget-object v5, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtBookInfo:Landroid/widget/TextView;

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 197
    .restart local v0    # "arr":[Ljava/lang/String;
    .restart local v1    # "dur":I
    .restart local v4    # "position":I
    :cond_3
    aget-object v5, v0, v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 198
    move v4, v3

    .line 196
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3
.end method

.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v13, 0xea60

    const/4 v1, 0x0

    .line 220
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnSave:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 221
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "widget_font_style"

    iget v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->style:I

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 222
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "widget_font_size"

    iget v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->font_size:I

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 223
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "widget_update_duration"

    iget v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->duration:I

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 224
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "widget_low_light"

    iget-boolean v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->isLowLight:Z

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 225
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 229
    iget v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->appWidgetId:I

    if-eqz v2, :cond_0

    .line 230
    move-object v8, p0

    .line 232
    .local v8, "context":Landroid/content/Context;
    invoke-static {v8}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v7

    .line 233
    .local v7, "appWidgetManager":Landroid/appwidget/AppWidgetManager;
    new-instance v11, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 234
    const v3, 0x7f030037

    .line 233
    invoke-direct {v11, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 235
    .local v11, "view":Landroid/widget/RemoteViews;
    invoke-static {v11, v8, v7}, Lcom/hmobile/biblekjv/HolyBibleWidget;->updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V

    .line 236
    new-instance v12, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 237
    const v3, 0x7f030038

    .line 236
    invoke-direct {v12, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 238
    .local v12, "viewsmall":Landroid/widget/RemoteViews;
    invoke-static {v12, v8, v7}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V

    .line 239
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 240
    .local v10, "resultValue":Landroid/content/Intent;
    const-string v2, "appWidgetId"

    .line 241
    iget v3, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->appWidgetId:I

    .line 240
    invoke-virtual {v10, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 242
    const/4 v2, -0x1

    invoke-virtual {p0, v2, v10}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 245
    .end local v7    # "appWidgetManager":Landroid/appwidget/AppWidgetManager;
    .end local v8    # "context":Landroid/content/Context;
    .end local v10    # "resultValue":Landroid/content/Intent;
    .end local v11    # "view":Landroid/widget/RemoteViews;
    .end local v12    # "viewsmall":Landroid/widget/RemoteViews;
    :cond_0
    const-wide/16 v2, 0xc8

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 251
    :goto_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 252
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 253
    const-class v5, Lcom/hmobile/biblekjv/WidgetUpdateService;

    .line 252
    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 254
    const/high16 v4, 0x8000000

    .line 250
    invoke-static {v2, v1, v3, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 256
    .local v6, "widgetUpdateService":Landroid/app/PendingIntent;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getApplicationContext()Landroid/content/Context;

    const-string v2, "alarm"

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 257
    .local v0, "am":Landroid/app/AlarmManager;
    invoke-virtual {v0, v6}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 258
    const-string v2, "Starting Service for update widget."

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 259
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    iget v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->duration:I

    mul-int/2addr v4, v13

    int-to-long v4, v4

    add-long/2addr v2, v4

    iget v4, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->duration:I

    mul-int/2addr v4, v13

    int-to-long v4, v4

    .line 259
    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    .line 261
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->finish()V

    .line 269
    .end local v0    # "am":Landroid/app/AlarmManager;
    .end local v6    # "widgetUpdateService":Landroid/app/PendingIntent;
    :cond_1
    :goto_1
    return-void

    .line 246
    :catch_0
    move-exception v9

    .line 247
    .local v9, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v9}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 262
    .end local v9    # "e":Ljava/lang/InterruptedException;
    :cond_2
    iget-object v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnCancel:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 263
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->finish()V

    goto :goto_1

    .line 265
    :cond_3
    iget-object v1, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnReset:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 266
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->Reset()V

    .line 267
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getSettings()V

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 58
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    const v2, 0x7f030039

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->setContentView(I)V

    .line 61
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 62
    .local v1, "launchIntent":Landroid/content/Intent;
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 63
    .local v0, "extras":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 64
    const-string v2, "appWidgetId"

    .line 65
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->appWidgetId:I

    .line 66
    const-string v2, "FromApp"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->FromApp:Z

    .line 69
    :cond_0
    iget v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->appWidgetId:I

    if-nez v2, :cond_1

    .line 70
    iget-boolean v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->FromApp:Z

    if-nez v2, :cond_1

    .line 71
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->finish()V

    .line 73
    :cond_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    .line 79
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->editor:Landroid/content/SharedPreferences$Editor;

    .line 80
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 81
    const v3, 0x7f0d0002

    .line 80
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->fontStyle:[Ljava/lang/String;

    .line 83
    const v2, 0x7f0e0141

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontSize:Landroid/widget/Spinner;

    .line 84
    const v2, 0x7f0e0143

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontStyle:Landroid/widget/Spinner;

    .line 85
    const v2, 0x7f0e0146

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnWidgetUpdateDuration:Landroid/widget/Spinner;

    .line 86
    const v2, 0x7f0e0116

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->chkLowLight:Landroid/widget/CheckBox;

    .line 87
    const v2, 0x7f0e0115

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtLowLighthint:Landroid/widget/TextView;

    .line 88
    const v2, 0x7f0e0139

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->rlwidget:Landroid/widget/RelativeLayout;

    .line 90
    const v2, 0x7f0e00ac

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    .line 91
    const v2, 0x7f0e013c

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtBookInfo:Landroid/widget/TextView;

    .line 93
    const v2, 0x7f0e013e

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnSave:Landroid/widget/Button;

    .line 94
    const v2, 0x7f0e0092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnCancel:Landroid/widget/Button;

    .line 95
    const v2, 0x7f0e013f

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnReset:Landroid/widget/Button;

    .line 97
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnSave:Landroid/widget/Button;

    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnCancel:Landroid/widget/Button;

    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->btnReset:Landroid/widget/Button;

    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->txtVerse:Landroid/widget/TextView;

    const v3, 0x7f0700b4

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getSettings()V

    .line 102
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0004

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->hours:[Ljava/lang/String;

    .line 104
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontSize:Landroid/widget/Spinner;

    new-instance v3, Lcom/hmobile/biblekjv/WidgetSelectorActivity$1;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity$1;-><init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 116
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnFontStyle:Landroid/widget/Spinner;

    new-instance v3, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity$2;-><init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 128
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->spnWidgetUpdateDuration:Landroid/widget/Spinner;

    new-instance v3, Lcom/hmobile/biblekjv/WidgetSelectorActivity$3;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity$3;-><init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 140
    iget-object v2, p0, Lcom/hmobile/biblekjv/WidgetSelectorActivity;->chkLowLight:Landroid/widget/CheckBox;

    new-instance v3, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/WidgetSelectorActivity$4;-><init>(Lcom/hmobile/biblekjv/WidgetSelectorActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 163
    return-void
.end method
