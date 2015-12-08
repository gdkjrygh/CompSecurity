.class public Lcom/hmobile/biblekjv/SettingsActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field about:Z

.field audio_speed:[F

.field chkLowLight:Landroid/widget/CheckBox;

.field chkNavigationFade:Landroid/widget/CheckBox;

.field chkOnOffNotification:Landroid/widget/CheckBox;

.field editor:Landroid/content/SharedPreferences$Editor;

.field f_size:[I

.field fontStyle:[Ljava/lang/String;

.field llInner:Landroid/widget/LinearLayout;

.field llSetting:Landroid/widget/LinearLayout;

.field llWidget:Landroid/widget/LinearLayout;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private rlAboutBar:Landroid/widget/RelativeLayout;

.field private rlAlertTime:Landroid/widget/RelativeLayout;

.field private rlEmailUpdates:Landroid/widget/RelativeLayout;

.field private rlFeedback:Landroid/widget/RelativeLayout;

.field private rlFontStyle:Landroid/widget/RelativeLayout;

.field private rlMoreApps:Landroid/widget/RelativeLayout;

.field private rlPrivacy:Landroid/widget/RelativeLayout;

.field private rlRate:Landroid/widget/RelativeLayout;

.field private rlSettingBar:Landroid/widget/RelativeLayout;

.field private rlTerms:Landroid/widget/RelativeLayout;

.field private rlWebsite:Landroid/widget/RelativeLayout;

.field private rlWidgetBar:Landroid/widget/RelativeLayout;

.field private seekAudioPitch:Landroid/widget/SeekBar;

.field setting:Z

.field settings:Landroid/content/SharedPreferences;

.field speechPitch:I

.field private speechSpeed:F

.field spnAudioSpeed:Landroid/widget/Spinner;

.field spnFontSize:Landroid/widget/Spinner;

.field spnFontStyle:Landroid/widget/Spinner;

.field private tabView:Lcom/hmobile/tab/TabView;

.field time1:Landroid/app/TimePickerDialog$OnTimeSetListener;

.field private txtAlertTimeLabel:Landroid/widget/TextView;

.field private txtAlertTimeValue:Landroid/widget/TextView;

.field private txtLowLighthint:Landroid/widget/TextView;

.field private txtNavigationLabel:Landroid/widget/TextView;

.field widget:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 47
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 62
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechSpeed:F

    .line 63
    const/16 v0, 0xa

    iput v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechPitch:I

    .line 70
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->f_size:[I

    .line 71
    const/4 v0, 0x5

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->audio_speed:[F

    .line 72
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SettingsActivity;->about:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SettingsActivity;->setting:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SettingsActivity;->widget:Z

    .line 474
    new-instance v0, Lcom/hmobile/biblekjv/SettingsActivity$1;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/SettingsActivity$1;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->time1:Landroid/app/TimePickerDialog$OnTimeSetListener;

    .line 47
    return-void

    .line 70
    :array_0
    .array-data 4
        0xc
        0xe
        0x12
        0x16
    .end array-data

    .line 71
    :array_1
    .array-data 4
        0x3f000000    # 0.5f
        0x3f333333    # 0.7f
        0x3f800000    # 1.0f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/SettingsActivity;II)V
    .locals 0

    .prologue
    .line 511
    invoke-direct {p0, p1, p2}, Lcom/hmobile/biblekjv/SettingsActivity;->setTime(II)V

    return-void
.end method

.method static synthetic access$1(Lcom/hmobile/biblekjv/SettingsActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtLowLighthint:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/SettingsActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtNavigationLabel:Landroid/widget/TextView;

    return-object v0
.end method

.method private setTime(II)V
    .locals 6
    .param p1, "h"    # I
    .param p2, "m"    # I

    .prologue
    const/16 v5, 0xc

    const/16 v4, 0xa

    .line 513
    if-ge p1, v4, :cond_1

    .line 514
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "0"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 518
    .local v0, "hour":Ljava/lang/String;
    :goto_0
    if-ge p2, v4, :cond_2

    .line 519
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ":0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 523
    .local v1, "time":Ljava/lang/String;
    :goto_1
    if-lt p1, v5, :cond_3

    .line 524
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeValue:Landroid/widget/TextView;

    const-string v3, "PM"

    invoke-virtual {p0, v2, v1, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->ConvertDate24To12Hour(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    :cond_0
    :goto_2
    return-void

    .line 516
    .end local v0    # "hour":Ljava/lang/String;
    .end local v1    # "time":Ljava/lang/String;
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "hour":Ljava/lang/String;
    goto :goto_0

    .line 521
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .restart local v1    # "time":Ljava/lang/String;
    goto :goto_1

    .line 525
    :cond_3
    if-ge p1, v5, :cond_0

    .line 526
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeValue:Landroid/widget/TextView;

    const-string v3, "AM"

    invoke-virtual {p0, v2, v1, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->ConvertDate24To12Hour(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2
.end method


# virtual methods
.method public ConvertDate24To12Hour(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "txt"    # Landroid/widget/TextView;
    .param p2, "time"    # Ljava/lang/String;
    .param p3, "am"    # Ljava/lang/String;

    .prologue
    .line 535
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "HH:mm"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 538
    .local v2, "sdf":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v2, p2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 539
    .local v0, "dateObj":Ljava/util/Date;
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "hh:mm"

    invoke-direct {v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 540
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 539
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 544
    .end local v0    # "dateObj":Ljava/util/Date;
    :goto_0
    return-void

    .line 541
    :catch_0
    move-exception v1

    .line 542
    .local v1, "e":Ljava/text/ParseException;
    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 9
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v8, 0x1

    .line 453
    const/16 v5, 0x3e9

    if-ne p1, v5, :cond_0

    .line 454
    const-string v5, "RESPONSE_CODE"

    const/4 v6, 0x0

    invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 455
    .local v3, "responseCode":I
    const-string v5, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 456
    .local v2, "purchaseData":Ljava/lang/String;
    const/4 v5, -0x1

    if-ne p2, v5, :cond_0

    .line 458
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 459
    .local v1, "jo":Lorg/json/JSONObject;
    const-string v5, "productId"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 460
    .local v4, "sku":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 461
    new-instance v6, Ljava/lang/StringBuilder;

    const v7, 0x7f0700c8

    invoke-virtual {p0, v7}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    .line 460
    invoke-static {v5, v6, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    .line 462
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 463
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->hideAdView()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    .end local v1    # "jo":Lorg/json/JSONObject;
    .end local v2    # "purchaseData":Ljava/lang/String;
    .end local v3    # "responseCode":I
    .end local v4    # "sku":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 464
    .restart local v2    # "purchaseData":Ljava/lang/String;
    .restart local v3    # "responseCode":I
    :catch_0
    move-exception v0

    .line 465
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 466
    const v6, 0x7f0700c9

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 465
    invoke-static {v5, v6, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    .line 467
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 468
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 19
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 322
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlSettingBar:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_2

    .line 323
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->setting:Z

    if-eqz v2, :cond_1

    .line 324
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->llSetting:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 325
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->setting:Z

    .line 449
    :cond_0
    :goto_0
    return-void

    .line 327
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->llSetting:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 328
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->setting:Z

    goto :goto_0

    .line 330
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAboutBar:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_4

    .line 331
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->about:Z

    if-eqz v2, :cond_3

    .line 332
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->llInner:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 333
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->about:Z

    goto :goto_0

    .line 335
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->llInner:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->about:Z

    goto :goto_0

    .line 338
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWidgetBar:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_5

    .line 346
    new-instance v12, Landroid/content/Intent;

    .line 347
    const-class v2, Lcom/hmobile/biblekjv/WidgetSelectorActivity;

    .line 346
    move-object/from16 v0, p0

    invoke-direct {v12, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 348
    .local v12, "i":Landroid/content/Intent;
    const-string v2, "FromApp"

    const/4 v3, 0x1

    invoke-virtual {v12, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 349
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 350
    .end local v12    # "i":Landroid/content/Intent;
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlRate:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_6

    .line 351
    new-instance v13, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v13, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 352
    .local v13, "intent":Landroid/content/Intent;
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "market://details?id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 353
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 354
    .end local v13    # "intent":Landroid/content/Intent;
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlTerms:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_7

    .line 355
    new-instance v2, Landroid/content/Intent;

    .line 356
    const-class v3, Lcom/hmobile/biblekjv/TermsOfUseActivity;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 355
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 357
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlPrivacy:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_8

    .line 358
    new-instance v2, Landroid/content/Intent;

    .line 359
    const-class v3, Lcom/hmobile/biblekjv/PrivacyPolicyActivity;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 358
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 360
    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlEmailUpdates:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_9

    .line 361
    new-instance v13, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v13, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 363
    .restart local v13    # "intent":Landroid/content/Intent;
    const v2, 0x7f07008c

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 362
    invoke-virtual {v13, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 364
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 365
    .end local v13    # "intent":Landroid/content/Intent;
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWebsite:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_a

    .line 366
    new-instance v13, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v13, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 367
    .restart local v13    # "intent":Landroid/content/Intent;
    const v2, 0x7f07008e

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 368
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 369
    .end local v13    # "intent":Landroid/content/Intent;
    :cond_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlFeedback:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_b

    .line 374
    const/16 v16, 0x0

    .line 376
    .local v16, "pInfo":Landroid/content/pm/PackageInfo;
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v16

    .line 380
    :goto_1
    move-object/from16 v0, v16

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    move-object/from16 v18, v0

    .line 381
    .local v18, "version":Ljava/lang/String;
    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 382
    .local v9, "androidOS":Ljava/lang/String;
    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 384
    .local v14, "model":Ljava/lang/String;
    new-instance v13, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v13, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 385
    .restart local v13    # "intent":Landroid/content/Intent;
    const-string v2, "text/html"

    invoke-virtual {v13, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 386
    const-string v2, "android.intent.extra.EMAIL"

    .line 387
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "support@h-mobile.net"

    aput-object v5, v3, v4

    .line 386
    invoke-virtual {v13, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 388
    const-string v2, "android.intent.extra.SUBJECT"

    .line 389
    const-string v3, "King James Bible Free v1.4.9.2"

    .line 388
    invoke-virtual {v13, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 390
    const-string v2, "android.intent.extra.TEXT"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\n\n\n Phone Model : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 391
    const-string v4, "\n Android OS : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n App Version: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 392
    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 390
    invoke-virtual {v13, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 393
    const-string v2, "Send Email"

    invoke-static {v13, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 377
    .end local v9    # "androidOS":Ljava/lang/String;
    .end local v13    # "intent":Landroid/content/Intent;
    .end local v14    # "model":Ljava/lang/String;
    .end local v18    # "version":Ljava/lang/String;
    :catch_0
    move-exception v11

    .line 378
    .local v11, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-virtual {v11}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_1

    .line 394
    .end local v11    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    .end local v16    # "pInfo":Landroid/content/pm/PackageInfo;
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlMoreApps:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_c

    .line 395
    new-instance v13, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v13, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 396
    .restart local v13    # "intent":Landroid/content/Intent;
    const v2, 0x7f070090

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 397
    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lcom/hmobile/biblekjv/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 398
    .end local v13    # "intent":Landroid/content/Intent;
    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_f

    .line 399
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 400
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 401
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeLabel:Landroid/widget/TextView;

    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 402
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 403
    .local v10, "cal":Ljava/util/Calendar;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeValue:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 404
    new-instance v1, Landroid/app/TimePickerDialog;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/SettingsActivity;->time1:Landroid/app/TimePickerDialog$OnTimeSetListener;

    .line 405
    const/16 v2, 0xb

    invoke-virtual {v10, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 406
    const/16 v2, 0xc

    invoke-virtual {v10, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v6, 0x0

    move-object/from16 v2, p0

    .line 404
    invoke-direct/range {v1 .. v6}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 406
    invoke-virtual {v1}, Landroid/app/TimePickerDialog;->show()V

    goto/16 :goto_0

    .line 408
    .end local v10    # "cal":Ljava/util/Calendar;
    :cond_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 409
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeLabel:Landroid/widget/TextView;

    const v3, -0x333334

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 410
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeValue:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 411
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "is_notification"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 412
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 413
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 414
    const/4 v3, 0x0

    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/hmobile/common/MyDailyQuoteReceiver;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 415
    const/high16 v5, 0x20000000

    .line 413
    invoke-static {v2, v3, v4, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    if-eqz v2, :cond_e

    const/4 v7, 0x1

    .line 416
    .local v7, "alarmUp":Z
    :goto_2
    if-eqz v7, :cond_0

    .line 417
    new-instance v15, Landroid/content/Intent;

    .line 418
    const-class v2, Lcom/hmobile/common/MyDailyQuoteReceiver;

    .line 417
    move-object/from16 v0, p0

    invoke-direct {v15, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 420
    .local v15, "myIntent":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 421
    const/high16 v3, 0x10000000

    .line 419
    move-object/from16 v0, p0

    invoke-static {v0, v2, v15, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v17

    .line 422
    .local v17, "pendingIntent":Landroid/app/PendingIntent;
    const-string v2, "alarm"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/app/AlarmManager;

    .line 423
    .local v8, "am":Landroid/app/AlarmManager;
    move-object/from16 v0, v17

    invoke-virtual {v8, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    goto/16 :goto_0

    .line 413
    .end local v7    # "alarmUp":Z
    .end local v8    # "am":Landroid/app/AlarmManager;
    .end local v15    # "myIntent":Landroid/content/Intent;
    .end local v17    # "pendingIntent":Landroid/app/PendingIntent;
    :cond_e
    const/4 v7, 0x0

    goto :goto_2

    .line 427
    :cond_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_0

    .line 428
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 430
    .restart local v10    # "cal":Ljava/util/Calendar;
    new-instance v1, Landroid/app/TimePickerDialog;

    .line 431
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/SettingsActivity;->time1:Landroid/app/TimePickerDialog$OnTimeSetListener;

    .line 432
    const/16 v2, 0xb

    invoke-virtual {v10, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/16 v2, 0xc

    invoke-virtual {v10, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 433
    const/4 v6, 0x0

    move-object/from16 v2, p0

    .line 430
    invoke-direct/range {v1 .. v6}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 434
    .local v1, "dialog":Landroid/app/TimePickerDialog;
    const v2, 0x7f0700e3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/TimePickerDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 435
    invoke-virtual {v1}, Landroid/app/TimePickerDialog;->show()V

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 79
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    new-instance v2, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v2, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 81
    .local v2, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v3, "main"

    invoke-virtual {v2, v3}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 82
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v4, 0x7f03002e

    invoke-virtual {v3, v4}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 83
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->tabView:Lcom/hmobile/tab/TabView;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->setContentView(Landroid/view/View;)V

    .line 85
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 86
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 87
    const v4, 0x7f070092

    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v3

    .line 86
    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 88
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v4, "/SettingsActivity"

    invoke-virtual {v3, v4}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->addQuickActionMenu()V

    .line 91
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->menuDialogDisplay()V

    .line 93
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    .line 94
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    .line 95
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 96
    const v4, 0x7f0d0005

    .line 95
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->fontStyle:[Ljava/lang/String;

    .line 98
    const v3, 0x7f0e00d6

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlFontStyle:Landroid/widget/RelativeLayout;

    .line 99
    const v3, 0x7f0e00fc

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlSettingBar:Landroid/widget/RelativeLayout;

    .line 100
    const v3, 0x7f0e011b

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWidgetBar:Landroid/widget/RelativeLayout;

    .line 101
    const v3, 0x7f0e0110

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->seekAudioPitch:Landroid/widget/SeekBar;

    .line 103
    const v3, 0x7f0e00d5

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontSize:Landroid/widget/Spinner;

    .line 104
    const v3, 0x7f0e00d8

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontStyle:Landroid/widget/Spinner;

    .line 105
    const v3, 0x7f0e0025

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnAudioSpeed:Landroid/widget/Spinner;

    .line 106
    const v3, 0x7f0e00db

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAboutBar:Landroid/widget/RelativeLayout;

    .line 107
    const v3, 0x7f0e0093

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlRate:Landroid/widget/RelativeLayout;

    .line 108
    const v3, 0x7f0e00e9

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlTerms:Landroid/widget/RelativeLayout;

    .line 109
    const v3, 0x7f0e00ed

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlPrivacy:Landroid/widget/RelativeLayout;

    .line 110
    const v3, 0x7f0e00e5

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlMoreApps:Landroid/widget/RelativeLayout;

    .line 112
    const v3, 0x7f0e00f1

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlEmailUpdates:Landroid/widget/RelativeLayout;

    .line 113
    const v3, 0x7f0e00a5

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWebsite:Landroid/widget/RelativeLayout;

    .line 114
    const v3, 0x7f0e00f8

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlFeedback:Landroid/widget/RelativeLayout;

    .line 115
    const v3, 0x7f0e0104

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    .line 117
    const v3, 0x7f0e00de

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->llInner:Landroid/widget/LinearLayout;

    .line 118
    const v3, 0x7f0e00ff

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->llSetting:Landroid/widget/LinearLayout;

    .line 119
    const v3, 0x7f0e011e

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->llWidget:Landroid/widget/LinearLayout;

    .line 120
    const v3, 0x7f0e0116

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkLowLight:Landroid/widget/CheckBox;

    .line 121
    const v3, 0x7f0e011a

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkNavigationFade:Landroid/widget/CheckBox;

    .line 122
    const v3, 0x7f0e0119

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtNavigationLabel:Landroid/widget/TextView;

    .line 123
    const v3, 0x7f0e0115

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtLowLighthint:Landroid/widget/TextView;

    .line 124
    const v3, 0x7f0e0105

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeLabel:Landroid/widget/TextView;

    .line 125
    const v3, 0x7f0e0106

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeValue:Landroid/widget/TextView;

    .line 126
    const v3, 0x7f0e0102

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    .line 128
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlFontStyle:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlSettingBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAboutBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlRate:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlTerms:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlPrivacy:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWidgetBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlMoreApps:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlEmailUpdates:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlWebsite:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlFeedback:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    invoke-virtual {v3, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "is_notification"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 148
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    invoke-virtual {v3, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 149
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v5}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 150
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeLabel:Landroid/widget/TextView;

    const/high16 v4, -0x1000000

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "notification_hour"

    const/16 v5, 0x8

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 152
    .local v0, "h":I
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "notification_min"

    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 153
    .local v1, "m":I
    invoke-direct {p0, v0, v1}, Lcom/hmobile/biblekjv/SettingsActivity;->setTime(II)V

    .line 161
    .end local v0    # "h":I
    .end local v1    # "m":I
    :goto_0
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontSize:Landroid/widget/Spinner;

    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$2;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$2;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 177
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontStyle:Landroid/widget/Spinner;

    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$3;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$3;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 195
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnAudioSpeed:Landroid/widget/Spinner;

    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$4;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$4;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 210
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkLowLight:Landroid/widget/CheckBox;

    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$5;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$5;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 226
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->seekAudioPitch:Landroid/widget/SeekBar;

    .line 227
    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$6;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$6;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 243
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkNavigationFade:Landroid/widget/CheckBox;

    .line 244
    new-instance v4, Lcom/hmobile/biblekjv/SettingsActivity$7;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/SettingsActivity$7;-><init>(Lcom/hmobile/biblekjv/SettingsActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 264
    sget-boolean v3, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v3, :cond_1

    .line 265
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->addAdView()V

    .line 269
    :goto_1
    return-void

    .line 156
    :cond_0
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkOnOffNotification:Landroid/widget/CheckBox;

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 157
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->rlAlertTime:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v6}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 158
    iget-object v3, p0, Lcom/hmobile/biblekjv/SettingsActivity;->txtAlertTimeLabel:Landroid/widget/TextView;

    const v4, -0x333334

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SettingsActivity;->hideAdView()V

    goto :goto_1
.end method

.method protected onResume()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    .line 273
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "font_style"

    .line 274
    const-string v9, "robotoregular.ttf"

    .line 273
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 275
    .local v6, "stylename":Ljava/lang/String;
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "font_size"

    const/16 v9, 0x12

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 278
    .local v0, "fontsize":I
    const/4 v1, 0x0

    .line 279
    .local v1, "fontsize_id":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->f_size:[I

    array-length v7, v7

    if-lt v3, v7, :cond_0

    .line 285
    :goto_1
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontSize:Landroid/widget/Spinner;

    invoke-virtual {v7, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 287
    const/4 v2, 0x0

    .line 288
    .local v2, "fontstyle_id":I
    const/4 v3, 0x0

    :goto_2
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->fontStyle:[Ljava/lang/String;

    array-length v7, v7

    if-lt v3, v7, :cond_2

    .line 296
    :goto_3
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnFontStyle:Landroid/widget/Spinner;

    invoke-virtual {v7, v2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 299
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "low_light"

    invoke-interface {v7, v8, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 300
    .local v4, "isLowLight":Z
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkLowLight:Landroid/widget/CheckBox;

    invoke-virtual {v7, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 301
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "navigation_fade"

    invoke-interface {v7, v8, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 303
    .local v5, "navigation_fade":Z
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->chkNavigationFade:Landroid/widget/CheckBox;

    invoke-virtual {v7, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 305
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 307
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "speech_speed"

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v7

    iput v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechSpeed:F

    .line 308
    const/4 v3, 0x0

    :goto_4
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->audio_speed:[F

    array-length v7, v7

    if-lt v3, v7, :cond_4

    .line 315
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->settings:Landroid/content/SharedPreferences;

    const-string v8, "speech_pitch"

    const/16 v9, 0xa

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    iput v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechPitch:I

    .line 316
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->seekAudioPitch:Landroid/widget/SeekBar;

    iget v8, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechPitch:I

    invoke-virtual {v7, v8}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 317
    return-void

    .line 280
    .end local v2    # "fontstyle_id":I
    .end local v4    # "isLowLight":Z
    .end local v5    # "navigation_fade":Z
    :cond_0
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->f_size:[I

    aget v7, v7, v3

    if-ne v0, v7, :cond_1

    .line 281
    move v1, v3

    .line 282
    goto :goto_1

    .line 279
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 289
    .restart local v2    # "fontstyle_id":I
    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    iget-object v8, p0, Lcom/hmobile/biblekjv/SettingsActivity;->fontStyle:[Ljava/lang/String;

    aget-object v8, v8, v3

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 290
    const-string v9, "-"

    const-string v10, ""

    .line 289
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    const-string v8, ".ttf"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 289
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    .line 291
    if-eqz v7, :cond_3

    .line 292
    move v2, v3

    .line 293
    goto :goto_3

    .line 288
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    .line 309
    .restart local v4    # "isLowLight":Z
    .restart local v5    # "navigation_fade":Z
    :cond_4
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->audio_speed:[F

    aget v7, v7, v3

    iget v8, p0, Lcom/hmobile/biblekjv/SettingsActivity;->speechSpeed:F

    cmpl-float v7, v7, v8

    if-nez v7, :cond_5

    .line 310
    iget-object v7, p0, Lcom/hmobile/biblekjv/SettingsActivity;->spnAudioSpeed:Landroid/widget/Spinner;

    invoke-virtual {v7, v3}, Landroid/widget/Spinner;->setSelection(I)V

    .line 308
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4
.end method

.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 0
    .param p1, "view"    # Landroid/widget/TimePicker;
    .param p2, "hourOfDay"    # I
    .param p3, "minute"    # I

    .prologue
    .line 549
    return-void
.end method
