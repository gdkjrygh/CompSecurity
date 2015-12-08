.class Lorg/apache/cordova/InAppBrowser$1;
.super Ljava/lang/Object;
.source "InAppBrowser.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/InAppBrowser;->showWebPage(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/InAppBrowser;

.field final synthetic val$thatWebView:Lorg/apache/cordova/CordovaWebView;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/InAppBrowser;Ljava/lang/String;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0

    .prologue
    .line 284
    iput-object p1, p0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iput-object p2, p0, Lorg/apache/cordova/InAppBrowser$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lorg/apache/cordova/InAppBrowser$1;->val$thatWebView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private dpToPixels(I)I
    .locals 4
    .param p1, "dipValue"    # I

    .prologue
    .line 291
    const/4 v1, 0x1

    int-to-float v2, p1

    iget-object v3, p0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v3, v3, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v1, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v0, v1

    .line 296
    .local v0, "value":I
    return v0
.end method


# virtual methods
.method public run()V
    .locals 19

    .prologue
    .line 301
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    new-instance v16, Landroid/app/Dialog;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v17

    const v18, 0x1030006

    invoke-direct/range {v16 .. v18}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    # setter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static/range {v15 .. v16}, Lorg/apache/cordova/InAppBrowser;->access$002(Lorg/apache/cordova/InAppBrowser;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 302
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    invoke-virtual {v15}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v15

    invoke-virtual {v15}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v15

    const v16, 0x1030002

    move/from16 v0, v16

    iput v0, v15, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 303
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 304
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 305
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    new-instance v16, Lorg/apache/cordova/InAppBrowser$1$1;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1$1;-><init>(Lorg/apache/cordova/InAppBrowser$1;)V

    invoke-virtual/range {v15 .. v16}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 319
    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v11, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 320
    .local v11, "main":Landroid/widget/LinearLayout;
    const/4 v15, 0x1

    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 323
    new-instance v14, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v14, v15}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 324
    .local v14, "toolbar":Landroid/widget/RelativeLayout;
    new-instance v15, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v16, -0x1

    const/16 v17, 0x2c

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1;->dpToPixels(I)I

    move-result v17

    invoke-direct/range {v15 .. v17}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v14, v15}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    const/4 v15, 0x2

    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lorg/apache/cordova/InAppBrowser$1;->dpToPixels(I)I

    move-result v15

    const/16 v16, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1;->dpToPixels(I)I

    move-result v16

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1;->dpToPixels(I)I

    move-result v17

    const/16 v18, 0x2

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1;->dpToPixels(I)I

    move-result v18

    invoke-virtual/range {v14 .. v18}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 326
    const/4 v15, 0x3

    invoke-virtual {v14, v15}, Landroid/widget/RelativeLayout;->setHorizontalGravity(I)V

    .line 327
    const/16 v15, 0x30

    invoke-virtual {v14, v15}, Landroid/widget/RelativeLayout;->setVerticalGravity(I)V

    .line 330
    new-instance v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v2, v15}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 331
    .local v2, "actionButtonContainer":Landroid/widget/RelativeLayout;
    new-instance v15, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v16, -0x2

    const/16 v17, -0x2

    invoke-direct/range {v15 .. v17}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v15}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 332
    const/4 v15, 0x3

    invoke-virtual {v2, v15}, Landroid/widget/RelativeLayout;->setHorizontalGravity(I)V

    .line 333
    const/16 v15, 0x10

    invoke-virtual {v2, v15}, Landroid/widget/RelativeLayout;->setVerticalGravity(I)V

    .line 334
    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Landroid/widget/RelativeLayout;->setId(I)V

    .line 337
    new-instance v3, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v3, v15}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 338
    .local v3, "back":Landroid/widget/Button;
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v15, -0x2

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-direct {v4, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 339
    .local v4, "backLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/4 v15, 0x5

    invoke-virtual {v4, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 340
    invoke-virtual {v3, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 341
    const-string v15, "Back Button"

    invoke-virtual {v3, v15}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 342
    const/4 v15, 0x2

    invoke-virtual {v3, v15}, Landroid/widget/Button;->setId(I)V

    .line 343
    const-string v15, "<"

    invoke-virtual {v3, v15}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 344
    new-instance v15, Lorg/apache/cordova/InAppBrowser$1$2;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lorg/apache/cordova/InAppBrowser$1$2;-><init>(Lorg/apache/cordova/InAppBrowser$1;)V

    invoke-virtual {v3, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 351
    new-instance v8, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v8, v15}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 352
    .local v8, "forward":Landroid/widget/Button;
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v15, -0x2

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-direct {v9, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 353
    .local v9, "forwardLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/4 v15, 0x1

    const/16 v16, 0x2

    move/from16 v0, v16

    invoke-virtual {v9, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 354
    invoke-virtual {v8, v9}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 355
    const-string v15, "Forward Button"

    invoke-virtual {v8, v15}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 356
    const/4 v15, 0x3

    invoke-virtual {v8, v15}, Landroid/widget/Button;->setId(I)V

    .line 357
    const-string v15, ">"

    invoke-virtual {v8, v15}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 358
    new-instance v15, Lorg/apache/cordova/InAppBrowser$1$3;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lorg/apache/cordova/InAppBrowser$1$3;-><init>(Lorg/apache/cordova/InAppBrowser$1;)V

    invoke-virtual {v8, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    new-instance v16, Landroid/widget/EditText;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v17

    invoke-direct/range {v16 .. v17}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    # setter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v15 .. v16}, Lorg/apache/cordova/InAppBrowser;->access$402(Lorg/apache/cordova/InAppBrowser;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 366
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v15, -0x1

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-direct {v13, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 367
    .local v13, "textLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/4 v15, 0x1

    const/16 v16, 0x1

    move/from16 v0, v16

    invoke-virtual {v13, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 368
    const/4 v15, 0x0

    const/16 v16, 0x5

    move/from16 v0, v16

    invoke-virtual {v13, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 369
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    invoke-virtual {v15, v13}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 370
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    const/16 v16, 0x4

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setId(I)V

    .line 371
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 372
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->val$url:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 373
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    const/16 v16, 0x10

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setInputType(I)V

    .line 374
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    const/16 v16, 0x2

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 375
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    const/16 v16, 0x0

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setInputType(I)V

    .line 376
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    new-instance v16, Lorg/apache/cordova/InAppBrowser$1$4;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/apache/cordova/InAppBrowser$1$4;-><init>(Lorg/apache/cordova/InAppBrowser$1;)V

    invoke-virtual/range {v15 .. v16}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 388
    new-instance v6, Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    iget-object v15, v15, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v15}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v15

    invoke-direct {v6, v15}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 389
    .local v6, "close":Landroid/widget/Button;
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v15, -0x2

    const/16 v16, -0x1

    move/from16 v0, v16

    invoke-direct {v7, v15, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 390
    .local v7, "closeLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v15, 0xb

    invoke-virtual {v7, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 391
    invoke-virtual {v6, v7}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 392
    const-string v15, "Close Button"

    invoke-virtual {v8, v15}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 393
    const/4 v15, 0x5

    invoke-virtual {v6, v15}, Landroid/widget/Button;->setId(I)V

    .line 394
    const-string v15, "Done"

    invoke-virtual {v6, v15}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 395
    new-instance v15, Lorg/apache/cordova/InAppBrowser$1$5;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lorg/apache/cordova/InAppBrowser$1$5;-><init>(Lorg/apache/cordova/InAppBrowser$1;)V

    invoke-virtual {v6, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 402
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    new-instance v16, Landroid/webkit/WebView;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v17

    invoke-direct/range {v16 .. v17}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    # setter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static/range {v15 .. v16}, Lorg/apache/cordova/InAppBrowser;->access$702(Lorg/apache/cordova/InAppBrowser;Landroid/webkit/WebView;)Landroid/webkit/WebView;

    .line 403
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    new-instance v16, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v17, -0x1

    const/16 v18, -0x1

    invoke-direct/range {v16 .. v18}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 404
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    new-instance v16, Landroid/webkit/WebChromeClient;

    invoke-direct/range {v16 .. v16}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 405
    new-instance v5, Lorg/apache/cordova/InAppBrowser$InAppBrowserClient;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->val$thatWebView:Lorg/apache/cordova/CordovaWebView;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    move-object/from16 v17, v0

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static/range {v17 .. v17}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-direct {v5, v15, v0, v1}, Lorg/apache/cordova/InAppBrowser$InAppBrowserClient;-><init>(Lorg/apache/cordova/InAppBrowser;Lorg/apache/cordova/CordovaWebView;Landroid/widget/EditText;)V

    .line 406
    .local v5, "client":Landroid/webkit/WebViewClient;
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 407
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v12

    .line 408
    .local v12, "settings":Landroid/webkit/WebSettings;
    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 409
    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 410
    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 416
    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Landroid/webkit/WebSettings;->setPluginsEnabled(Z)V

    .line 417
    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 418
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/cordova/InAppBrowser$1;->val$url:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 419
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    const/16 v16, 0x6

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebView;->setId(I)V

    .line 420
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v15

    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 421
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v15

    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 422
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15}, Landroid/webkit/WebView;->requestFocus()Z

    .line 423
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v15}, Landroid/webkit/WebView;->requestFocusFromTouch()Z

    .line 426
    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 427
    invoke-virtual {v2, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 430
    invoke-virtual {v14, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 431
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->edittext:Landroid/widget/EditText;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$400(Lorg/apache/cordova/InAppBrowser;)Landroid/widget/EditText;

    move-result-object v15

    invoke-virtual {v14, v15}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 432
    invoke-virtual {v14, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 435
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # invokes: Lorg/apache/cordova/InAppBrowser;->getShowLocationBar()Z
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$800(Lorg/apache/cordova/InAppBrowser;)Z

    move-result v15

    if-eqz v15, :cond_0

    .line 437
    invoke-virtual {v11, v14}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 441
    :cond_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->inAppWebView:Landroid/webkit/WebView;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$700(Lorg/apache/cordova/InAppBrowser;)Landroid/webkit/WebView;

    move-result-object v15

    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 443
    new-instance v10, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v10}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 444
    .local v10, "lp":Landroid/view/WindowManager$LayoutParams;
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    invoke-virtual {v15}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v15

    invoke-virtual {v15}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v15

    invoke-virtual {v10, v15}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 445
    const/4 v15, -0x1

    iput v15, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 446
    const/4 v15, -0x1

    iput v15, v10, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 448
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    invoke-virtual {v15, v11}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 449
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    invoke-virtual {v15}, Landroid/app/Dialog;->show()V

    .line 450
    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/apache/cordova/InAppBrowser$1;->this$0:Lorg/apache/cordova/InAppBrowser;

    # getter for: Lorg/apache/cordova/InAppBrowser;->dialog:Landroid/app/Dialog;
    invoke-static {v15}, Lorg/apache/cordova/InAppBrowser;->access$000(Lorg/apache/cordova/InAppBrowser;)Landroid/app/Dialog;

    move-result-object v15

    invoke-virtual {v15}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v15

    invoke-virtual {v15, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 451
    return-void
.end method
