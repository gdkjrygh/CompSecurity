.class public Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;
.super Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;
.source "NavigationButton.java"


# static fields
.field private static final MOVE_THRESHOLD:I


# instance fields
.field private isMenu:Z

.field private navigation:Ljava/lang/String;

.field private xDown:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/16 v0, 0xf

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->getHeightWidthDPI(I)I

    move-result v0

    sput v0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->MOVE_THRESHOLD:I

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/DroidGap;Landroid/view/ViewGroup;)V
    .locals 4
    .param p1, "dg"    # Lorg/apache/cordova/DroidGap;
    .param p2, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;-><init>()V

    .line 22
    const-string v2, ""

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->navigation:Ljava/lang/String;

    .line 24
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    .line 26
    const/4 v2, 0x0

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    .line 31
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->appLink:Lorg/apache/cordova/DroidGap;

    .line 33
    sget-object v2, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->params:Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 34
    invoke-virtual {p1}, Lorg/apache/cordova/DroidGap;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 35
    .local v0, "context":Landroid/content/Context;
    const-string v2, "layout_inflater"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 36
    .local v1, "inflater":Landroid/view/LayoutInflater;
    const v2, 0x7f030019

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    .line 37
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    sget-object v3, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->params:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p2, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 41
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->deselectButton()V

    .line 42
    return-void
.end method


# virtual methods
.method public isMenuVisible()Z
    .locals 1

    .prologue
    .line 195
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    return v0
.end method

.method public isNavigationButton()Z
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "NavB"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->action:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->action:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->appLink:Lorg/apache/cordova/DroidGap;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/cordova/DroidGap;->sendJavascript(Ljava/lang/String;)V

    .line 57
    :cond_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    .line 59
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->deselectButton()V

    .line 65
    :goto_0
    return-void

    .line 61
    :cond_1
    const-string v0, "Nav"

    const-string v1, "Am no longer a menu"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-super {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->onClick(Landroid/view/View;)V

    goto :goto_0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x1

    .line 81
    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    if-eqz v1, :cond_c

    .line 82
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 83
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    .line 84
    const-string v1, "quickNavJSI.setPreventClick( Ext.Msg.isVisible() );"

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 85
    sput-object p1, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->touchedButton:Landroid/view/View;

    .line 131
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    const/4 v1, 0x0

    sput-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->touchedButton:Landroid/view/View;

    .line 88
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;->preventClick()Z

    move-result v1

    if-nez v1, :cond_0

    .line 91
    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    if-nez v1, :cond_a

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eq v1, v0, :cond_a

    .line 92
    const-string v1, "NavB"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " -- ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    cmpg-float v1, v1, v5

    if-ltz v1, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-gtz v1, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    sget v3, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->MOVE_THRESHOLD:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    .line 95
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 97
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 99
    :cond_3
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->setOnState(Z)V

    .line 100
    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    goto/16 :goto_0

    .line 102
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    sget v3, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->MOVE_THRESHOLD:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    cmpl-float v1, v1, v2

    if-gtz v1, :cond_5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    sget v3, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->MOVE_THRESHOLD:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    cmpg-float v1, v1, v2

    if-gez v1, :cond_8

    .line 103
    :cond_5
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->navigation:Ljava/lang/String;

    const v2, 0x7f09010b

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->navigation:Ljava/lang/String;

    const v2, 0x7f09010c

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 105
    :cond_6
    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    goto/16 :goto_0

    .line 106
    :cond_7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 107
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->setOnState(Z)V

    .line 108
    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    goto/16 :goto_0

    .line 111
    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_9

    .line 112
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->setOnState(Z)V

    .line 113
    iput v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    goto/16 :goto_0

    .line 115
    :cond_9
    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->setOnState(Z)V

    goto/16 :goto_0

    .line 117
    :cond_a
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 118
    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    if-nez v1, :cond_b

    .line 119
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->onClick(Landroid/view/View;)V

    .line 121
    :cond_b
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->deselectButton()V

    .line 122
    const-string v1, "NB"

    const-string v2, "no longer ignoring"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iput-boolean v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->ignoreTillUp:Z

    .line 124
    iput v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->xDown:F

    goto/16 :goto_0

    .line 131
    :cond_c
    invoke-super {p0, p1, p2}, Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public setAsIconButton()V
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    .line 75
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->updateIconButton()V

    .line 76
    return-void
.end method

.method public setAsMenuButton()V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    .line 69
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->navigation:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->updateNavText(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->deselectButton()V

    .line 71
    return-void
.end method

.method public updateIconButton()V
    .locals 2

    .prologue
    .line 164
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton$2;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 187
    :cond_0
    return-void
.end method

.method public updateNavText(Ljava/lang/String;)V
    .locals 2
    .param p1, "caption"    # Ljava/lang/String;

    .prologue
    .line 136
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->navigation:Ljava/lang/String;

    .line 137
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->isMenu:Z

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;->button:Landroid/view/View;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton$1;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/NavigationButton;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 161
    :cond_0
    return-void
.end method
