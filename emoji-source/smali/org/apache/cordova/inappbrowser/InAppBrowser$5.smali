.class Lorg/apache/cordova/inappbrowser/InAppBrowser$5;
.super Ljava/lang/Object;
.source "InAppBrowser.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/inappbrowser/InAppBrowser;->showWebPage(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

.field final synthetic val$thatWebView:Lorg/apache/cordova/CordovaWebView;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/inappbrowser/InAppBrowser;Ljava/lang/String;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/inappbrowser/InAppBrowser;

    .prologue
    .line 442
    iput-object p1, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    iput-object p2, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$thatWebView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private dpToPixels(I)I
    .locals 4
    .param p1, "dipValue"    # I

    .prologue
    .line 449
    const/4 v1, 0x1

    int-to-float v2, p1

    iget-object v3, p0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    iget-object v3, v3, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 451
    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 449
    invoke-static {v1, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v0, v1

    .line 454
    .local v0, "value":I
    return v0
.end method


# virtual methods
.method public run()V
    .locals 30
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 460
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    new-instance v27, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    const v29, 0x1030006

    invoke-direct/range {v27 .. v29}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;-><init>(Landroid/content/Context;I)V

    # setter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$002(Lorg/apache/cordova/inappbrowser/InAppBrowser;Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    .line 461
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->getWindow()Landroid/view/Window;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v26

    const v27, 0x1030002

    move/from16 v0, v27

    move-object/from16 v1, v26

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    const/16 v27, 0x1

    invoke-virtual/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->requestWindowFeature(I)Z

    .line 463
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    const/16 v27, 0x1

    invoke-virtual/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->setCancelable(Z)V

    .line 464
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v27, v0

    # invokes: Lorg/apache/cordova/inappbrowser/InAppBrowser;->getInAppBrowser()Lorg/apache/cordova/inappbrowser/InAppBrowser;
    invoke-static/range {v27 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$200(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->setInAppBroswer(Lorg/apache/cordova/inappbrowser/InAppBrowser;)V

    .line 467
    new-instance v22, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 468
    .local v22, "main":Landroid/widget/LinearLayout;
    const/16 v26, 0x1

    move-object/from16 v0, v22

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 471
    new-instance v25, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    invoke-direct/range {v25 .. v26}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 473
    .local v25, "toolbar":Landroid/widget/RelativeLayout;
    const v26, -0x333334

    invoke-virtual/range {v25 .. v26}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 474
    new-instance v26, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v27, -0x1

    const/16 v28, 0x2c

    move-object/from16 v0, p0

    move/from16 v1, v28

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->dpToPixels(I)I

    move-result v28

    invoke-direct/range {v26 .. v28}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual/range {v25 .. v26}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    const/16 v26, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->dpToPixels(I)I

    move-result v26

    const/16 v27, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->dpToPixels(I)I

    move-result v27

    const/16 v28, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v28

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->dpToPixels(I)I

    move-result v28

    const/16 v29, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v29

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->dpToPixels(I)I

    move-result v29

    invoke-virtual/range {v25 .. v29}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 476
    const/16 v26, 0x3

    invoke-virtual/range {v25 .. v26}, Landroid/widget/RelativeLayout;->setHorizontalGravity(I)V

    .line 477
    const/16 v26, 0x30

    invoke-virtual/range {v25 .. v26}, Landroid/widget/RelativeLayout;->setVerticalGravity(I)V

    .line 480
    new-instance v3, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-direct {v3, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 481
    .local v3, "actionButtonContainer":Landroid/widget/RelativeLayout;
    new-instance v26, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v27, -0x2

    const/16 v28, -0x2

    invoke-direct/range {v26 .. v28}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v26

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 482
    const/16 v26, 0x3

    move/from16 v0, v26

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setHorizontalGravity(I)V

    .line 483
    const/16 v26, 0x10

    move/from16 v0, v26

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVerticalGravity(I)V

    .line 484
    const/16 v26, 0x1

    move/from16 v0, v26

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setId(I)V

    .line 487
    new-instance v6, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-direct {v6, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 488
    .local v6, "back":Landroid/widget/Button;
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v26, -0x2

    const/16 v27, -0x1

    move/from16 v0, v26

    move/from16 v1, v27

    invoke-direct {v8, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 489
    .local v8, "backLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v26, 0x5

    move/from16 v0, v26

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 490
    invoke-virtual {v6, v8}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 491
    const-string v26, "Back Button"

    move-object/from16 v0, v26

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 492
    const/16 v26, 0x2

    move/from16 v0, v26

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setId(I)V

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 494
    .local v4, "activityRes":Landroid/content/res/Resources;
    const-string v26, "ic_action_previous_item"

    const-string v27, "drawable"

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    .line 495
    .local v9, "backResId":I
    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 496
    .local v7, "backIcon":Landroid/graphics/drawable/Drawable;
    sget v26, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v27, 0x10

    move/from16 v0, v26

    move/from16 v1, v27

    if-ge v0, v1, :cond_4

    .line 498
    invoke-virtual {v6, v7}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 504
    :goto_0
    new-instance v26, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$1;-><init>(Lorg/apache/cordova/inappbrowser/InAppBrowser$5;)V

    move-object/from16 v0, v26

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 511
    new-instance v17, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    move-object/from16 v0, v17

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 512
    .local v17, "forward":Landroid/widget/Button;
    new-instance v18, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v26, -0x2

    const/16 v27, -0x1

    move-object/from16 v0, v18

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 513
    .local v18, "forwardLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v26, 0x1

    const/16 v27, 0x2

    move-object/from16 v0, v18

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 514
    invoke-virtual/range {v17 .. v18}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 515
    const-string v26, "Forward Button"

    move-object/from16 v0, v17

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 516
    const/16 v26, 0x3

    move-object/from16 v0, v17

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setId(I)V

    .line 517
    const-string v26, "ic_action_next_item"

    const-string v27, "drawable"

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v20

    .line 518
    .local v20, "fwdResId":I
    move/from16 v0, v20

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v19

    .line 519
    .local v19, "fwdIcon":Landroid/graphics/drawable/Drawable;
    sget v26, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v27, 0x10

    move/from16 v0, v26

    move/from16 v1, v27

    if-ge v0, v1, :cond_5

    .line 521
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 527
    :goto_1
    new-instance v26, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$2;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$2;-><init>(Lorg/apache/cordova/inappbrowser/InAppBrowser$5;)V

    move-object/from16 v0, v17

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 534
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    new-instance v27, Landroid/widget/EditText;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    invoke-direct/range {v27 .. v28}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    # setter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$502(Lorg/apache/cordova/inappbrowser/InAppBrowser;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 535
    new-instance v24, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v26, -0x1

    const/16 v27, -0x1

    move-object/from16 v0, v24

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 536
    .local v24, "textLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v26, 0x1

    const/16 v27, 0x1

    move-object/from16 v0, v24

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 537
    const/16 v26, 0x0

    const/16 v27, 0x5

    move-object/from16 v0, v24

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 538
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 539
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    const/16 v27, 0x4

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setId(I)V

    .line 540
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    const/16 v27, 0x1

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 541
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$url:Ljava/lang/String;

    move-object/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 542
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    const/16 v27, 0x10

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setInputType(I)V

    .line 543
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    const/16 v27, 0x2

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 544
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    const/16 v27, 0x0

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setInputType(I)V

    .line 545
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    new-instance v27, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;

    move-object/from16 v0, v27

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$3;-><init>(Lorg/apache/cordova/inappbrowser/InAppBrowser$5;)V

    invoke-virtual/range {v26 .. v27}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 557
    new-instance v11, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-direct {v11, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 558
    .local v11, "close":Landroid/widget/Button;
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v26, -0x2

    const/16 v27, -0x1

    move/from16 v0, v26

    move/from16 v1, v27

    invoke-direct {v13, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 559
    .local v13, "closeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v26, 0xb

    move/from16 v0, v26

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 560
    invoke-virtual {v11, v13}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 561
    const-string v26, "Close Button"

    move-object/from16 v0, v17

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 562
    const/16 v26, 0x5

    move/from16 v0, v26

    invoke-virtual {v11, v0}, Landroid/widget/Button;->setId(I)V

    .line 563
    const-string v26, "ic_action_remove"

    const-string v27, "drawable"

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v14

    .line 564
    .local v14, "closeResId":I
    invoke-virtual {v4, v14}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    .line 565
    .local v12, "closeIcon":Landroid/graphics/drawable/Drawable;
    sget v26, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v27, 0x10

    move/from16 v0, v26

    move/from16 v1, v27

    if-ge v0, v1, :cond_6

    .line 567
    invoke-virtual {v11, v12}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 573
    :goto_2
    new-instance v26, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$4;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowser$5$4;-><init>(Lorg/apache/cordova/inappbrowser/InAppBrowser$5;)V

    move-object/from16 v0, v26

    invoke-virtual {v11, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 580
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    new-instance v27, Landroid/webkit/WebView;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v28, v0

    invoke-interface/range {v28 .. v28}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v28

    invoke-direct/range {v27 .. v28}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    # setter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v27}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$102(Lorg/apache/cordova/inappbrowser/InAppBrowser;Landroid/webkit/WebView;)Landroid/webkit/WebView;

    .line 581
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    new-instance v27, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v28, -0x1

    const/16 v29, -0x1

    invoke-direct/range {v27 .. v29}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 582
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    new-instance v27, Lorg/apache/cordova/inappbrowser/InAppChromeClient;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$thatWebView:Lorg/apache/cordova/CordovaWebView;

    move-object/from16 v28, v0

    invoke-direct/range {v27 .. v28}, Lorg/apache/cordova/inappbrowser/InAppChromeClient;-><init>(Lorg/apache/cordova/CordovaWebView;)V

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 583
    new-instance v10, Lorg/apache/cordova/inappbrowser/InAppBrowser$InAppBrowserClient;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$thatWebView:Lorg/apache/cordova/CordovaWebView;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v28, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v28 .. v28}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-direct {v10, v0, v1, v2}, Lorg/apache/cordova/inappbrowser/InAppBrowser$InAppBrowserClient;-><init>(Lorg/apache/cordova/inappbrowser/InAppBrowser;Lorg/apache/cordova/CordovaWebView;Landroid/widget/EditText;)V

    .line 584
    .local v10, "client":Landroid/webkit/WebViewClient;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v10}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v23

    .line 586
    .local v23, "settings":Landroid/webkit/WebSettings;
    const/16 v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 587
    const/16 v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 588
    const/16 v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 589
    sget-object v26, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 592
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 593
    .local v5, "appSettings":Landroid/os/Bundle;
    if-nez v5, :cond_7

    const/16 v16, 0x1

    .line 594
    .local v16, "enableDatabase":Z
    :goto_3
    if-eqz v16, :cond_0

    .line 595
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser;->cordova:Lorg/apache/cordova/CordovaInterface;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v26

    const-string v27, "inAppBrowserDB"

    const/16 v28, 0x0

    invoke-virtual/range {v26 .. v28}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v15

    .line 596
    .local v15, "databasePath":Ljava/lang/String;
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 597
    const/16 v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 599
    .end local v15    # "databasePath":Ljava/lang/String;
    :cond_0
    const/16 v26, 0x1

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 601
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->clearAllCache:Z
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$700(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Z

    move-result v26

    if-eqz v26, :cond_8

    .line 602
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/CookieManager;->removeAllCookie()V

    .line 607
    :cond_1
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->val$url:Ljava/lang/String;

    move-object/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 608
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    const/16 v27, 0x6

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebView;->setId(I)V

    .line 609
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v26

    const/16 v27, 0x1

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 610
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v26

    const/16 v27, 0x1

    invoke-virtual/range {v26 .. v27}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 611
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/WebView;->requestFocus()Z

    .line 612
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/WebView;->requestFocusFromTouch()Z

    .line 615
    invoke-virtual {v3, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 616
    move-object/from16 v0, v17

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 619
    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 620
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$500(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 621
    move-object/from16 v0, v25

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # invokes: Lorg/apache/cordova/inappbrowser/InAppBrowser;->getShowLocationBar()Z
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$900(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Z

    move-result v26

    if-eqz v26, :cond_2

    .line 626
    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 630
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$100(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v26

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 632
    new-instance v21, Landroid/view/WindowManager$LayoutParams;

    invoke-direct/range {v21 .. v21}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 633
    .local v21, "lp":Landroid/view/WindowManager$LayoutParams;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->getWindow()Landroid/view/Window;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v26

    move-object/from16 v0, v21

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 634
    const/16 v26, -0x1

    move/from16 v0, v26

    move-object/from16 v1, v21

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 635
    const/16 v26, -0x1

    move/from16 v0, v26

    move-object/from16 v1, v21

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->setContentView(Landroid/view/View;)V

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->show()V

    .line 639
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->getWindow()Landroid/view/Window;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 642
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->openWindowHidden:Z
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$1000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Z

    move-result v26

    if-eqz v26, :cond_3

    .line 643
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->dialog:Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$000(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowserDialog;->hide()V

    .line 645
    :cond_3
    return-void

    .line 502
    .end local v5    # "appSettings":Landroid/os/Bundle;
    .end local v10    # "client":Landroid/webkit/WebViewClient;
    .end local v11    # "close":Landroid/widget/Button;
    .end local v12    # "closeIcon":Landroid/graphics/drawable/Drawable;
    .end local v13    # "closeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .end local v14    # "closeResId":I
    .end local v16    # "enableDatabase":Z
    .end local v17    # "forward":Landroid/widget/Button;
    .end local v18    # "forwardLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .end local v19    # "fwdIcon":Landroid/graphics/drawable/Drawable;
    .end local v20    # "fwdResId":I
    .end local v21    # "lp":Landroid/view/WindowManager$LayoutParams;
    .end local v23    # "settings":Landroid/webkit/WebSettings;
    .end local v24    # "textLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_4
    invoke-virtual {v6, v7}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 525
    .restart local v17    # "forward":Landroid/widget/Button;
    .restart local v18    # "forwardLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .restart local v19    # "fwdIcon":Landroid/graphics/drawable/Drawable;
    .restart local v20    # "fwdResId":I
    :cond_5
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_1

    .line 571
    .restart local v11    # "close":Landroid/widget/Button;
    .restart local v12    # "closeIcon":Landroid/graphics/drawable/Drawable;
    .restart local v13    # "closeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    .restart local v14    # "closeResId":I
    .restart local v24    # "textLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_6
    invoke-virtual {v11, v12}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 593
    .restart local v5    # "appSettings":Landroid/os/Bundle;
    .restart local v10    # "client":Landroid/webkit/WebViewClient;
    .restart local v23    # "settings":Landroid/webkit/WebSettings;
    :cond_7
    const-string v26, "InAppBrowserStorageEnabled"

    const/16 v27, 0x1

    move-object/from16 v0, v26

    move/from16 v1, v27

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v16

    goto/16 :goto_3

    .line 603
    .restart local v16    # "enableDatabase":Z
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/inappbrowser/InAppBrowser$5;->this$0:Lorg/apache/cordova/inappbrowser/InAppBrowser;

    move-object/from16 v26, v0

    # getter for: Lorg/apache/cordova/inappbrowser/InAppBrowser;->clearSessionCache:Z
    invoke-static/range {v26 .. v26}, Lorg/apache/cordova/inappbrowser/InAppBrowser;->access$800(Lorg/apache/cordova/inappbrowser/InAppBrowser;)Z

    move-result v26

    if-eqz v26, :cond_1

    .line 604
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    goto/16 :goto_4
.end method
