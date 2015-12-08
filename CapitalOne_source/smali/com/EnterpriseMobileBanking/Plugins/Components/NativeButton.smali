.class public Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;
.super Ljava/lang/Object;
.source "NativeButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# static fields
.field protected static lastButton:Landroid/view/View;

.field protected static params:Landroid/widget/LinearLayout$LayoutParams;

.field protected static touchedButton:Landroid/view/View;


# instance fields
.field protected action:Ljava/lang/String;

.field protected appLink:Lorg/apache/cordova/DroidGap;

.field protected button:Landroid/view/View;

.field private caption:Ljava/lang/String;

.field protected ignoreTillUp:Z

.field protected imgName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 22
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->params:Landroid/widget/LinearLayout$LayoutParams;

    .line 30
    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 32
    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->touchedButton:Landroid/view/View;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->appLink:Lorg/apache/cordova/DroidGap;

    .line 24
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    .line 26
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    .line 28
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->caption:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    .line 40
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/DroidGap;Landroid/view/ViewGroup;)V
    .locals 5
    .param p1, "dg"    # Lorg/apache/cordova/DroidGap;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v4, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->appLink:Lorg/apache/cordova/DroidGap;

    .line 24
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    .line 26
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    .line 28
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    .line 34
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->caption:Ljava/lang/String;

    .line 36
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    .line 43
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->appLink:Lorg/apache/cordova/DroidGap;

    .line 45
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->params:Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 47
    invoke-virtual {p1}, Lorg/apache/cordova/DroidGap;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 48
    .local v0, "context":Landroid/content/Context;
    const-string v2, "layout_inflater"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 50
    .local v1, "inflater":Landroid/view/LayoutInflater;
    const v2, 0x7f030019

    invoke-virtual {v1, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    .line 51
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->params:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p2, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    if-nez v2, :cond_0

    .line 54
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    sput-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 55
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 58
    :cond_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 61
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/DroidGap;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "dg"    # Lorg/apache/cordova/DroidGap;
    .param p2, "parent"    # Landroid/view/ViewGroup;
    .param p3, "action"    # Ljava/lang/String;
    .param p4, "icon"    # Ljava/lang/String;
    .param p5, "caption"    # Ljava/lang/String;

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;-><init>(Lorg/apache/cordova/DroidGap;Landroid/view/ViewGroup;)V

    .line 66
    invoke-virtual {p0, p3}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->updateAction(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0, p4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->updateImage(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0, p5}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->updateCaption(Ljava/lang/String;)V

    .line 69
    return-void
.end method

.method public static clearHighlight()V
    .locals 2

    .prologue
    .line 227
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 228
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 229
    .local v0, "lb":Landroid/view/View;
    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$6;

    invoke-direct {v1, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$6;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 238
    const/4 v1, 0x0

    sput-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 240
    :cond_0
    return-void
.end method

.method public static setTouchedAsPressed()V
    .locals 2

    .prologue
    .line 72
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->touchedButton:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 73
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->touchedButton:Landroid/view/View;

    .line 74
    .local v0, "lastTouched":Landroid/view/View;
    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;

    invoke-direct {v1, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$1;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 83
    :cond_0
    return-void
.end method


# virtual methods
.method protected deselectButton()V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$7;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 258
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    if-ne v0, v1, :cond_0

    .line 259
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 261
    :cond_0
    return-void
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getCaption()Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public isNavigationButton()Z
    .locals 1

    .prologue
    .line 243
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 87
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 88
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 93
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    if-eq v0, v1, :cond_2

    .line 95
    const-string v0, "NB"

    const-string v1, "Clearing lastButton"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 97
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 101
    :cond_2
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 102
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 104
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 106
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 114
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    goto :goto_0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 120
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 121
    const-string v0, "quickNavJSI.setPreventClick( Ext.Msg.isVisible() );"

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 122
    sput-object p1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->touchedButton:Landroid/view/View;

    .line 152
    :cond_0
    :goto_0
    return v3

    .line 124
    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->touchedButton:Landroid/view/View;

    .line 125
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->preventClick()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    if-nez v0, :cond_5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eq v0, v3, :cond_5

    .line 128
    const-string v0, "NB"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -- ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    cmpg-float v0, v0, v5

    if-ltz v0, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    cmpg-float v0, v0, v5

    if-ltz v0, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 135
    :cond_2
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setPressed(Z)V

    .line 136
    iput-boolean v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    .line 149
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    goto/16 :goto_0

    .line 138
    :cond_4
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setPressed(Z)V

    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 141
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    if-nez v0, :cond_6

    .line 142
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->onClick(Landroid/view/View;)V

    .line 144
    :cond_6
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setPressed(Z)V

    .line 145
    const-string v0, "NB"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no longer ignoring -- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iput-boolean v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->ignoreTillUp:Z

    goto :goto_1
.end method

.method protected postInvalidate()V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 265
    return-void
.end method

.method public setActive()V
    .locals 2

    .prologue
    .line 196
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    if-eq v0, v1, :cond_0

    .line 197
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->clearHighlight()V

    .line 198
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    .line 199
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->lastButton:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 200
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->setOnState(Z)V

    .line 202
    :cond_0
    return-void
.end method

.method public setOnState(Z)V
    .locals 2
    .param p1, "on"    # Z

    .prologue
    .line 216
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;

    invoke-direct {v1, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$5;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 224
    return-void
.end method

.method public setPressed(Z)V
    .locals 2
    .param p1, "on"    # Z

    .prologue
    .line 206
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;

    invoke-direct {v1, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$4;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 213
    return-void
.end method

.method public updateAction(Ljava/lang/String;)V
    .locals 0
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    .line 192
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->action:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public updateCaption(Ljava/lang/String;)V
    .locals 0
    .param p1, "caption"    # Ljava/lang/String;

    .prologue
    .line 188
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->caption:Ljava/lang/String;

    .line 189
    return-void
.end method

.method public updateImage(Ljava/lang/String;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 156
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->updateImage(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    return-void
.end method

.method public updateImage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "hotSpotName"    # Ljava/lang/String;

    .prologue
    .line 160
    const-string v1, "NB"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Image: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const/4 v0, 0x0

    .line 162
    .local v0, "isValidImage":Z
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->imgName:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 177
    :cond_0
    if-eqz v0, :cond_1

    .line 178
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->button:Landroid/view/View;

    new-instance v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$3;

    invoke-direct {v2, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 185
    :cond_1
    return-void
.end method
