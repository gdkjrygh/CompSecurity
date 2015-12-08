.class public Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;
.super Landroid/widget/LinearLayout;
.source "LinearLayoutSoftKeyboardDetect.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "SoftKeyboardDetect"


# instance fields
.field private app:Lorg/apache/cordova/CordovaActivity;

.field private oldHeight:I

.field private oldWidth:I

.field private screenHeight:I

.field private screenWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 34
    iput v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    .line 35
    iput v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldWidth:I

    .line 36
    iput v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenWidth:I

    .line 37
    iput v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenHeight:I

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    .line 42
    iput p2, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenWidth:I

    .line 43
    iput p3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenHeight:I

    .line 44
    check-cast p1, Lorg/apache/cordova/CordovaActivity;

    .end local p1    # "context":Landroid/content/Context;
    iput-object p1, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    .line 45
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 9
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 59
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 61
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "We are in our onMeasure method"

    invoke-static {v3, v4}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 68
    .local v0, "height":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 69
    .local v2, "width":I
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Old Height = %d"

    new-array v5, v8, [Ljava/lang/Object;

    iget v6, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Height = %d"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Old Width = %d"

    new-array v5, v8, [Ljava/lang/Object;

    iget v6, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldWidth:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Width = %d"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    if-eqz v3, :cond_0

    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    if-ne v3, v0, :cond_2

    .line 77
    :cond_0
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Ignore this event"

    invoke-static {v3, v4}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    :cond_1
    :goto_0
    iput v0, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    .line 102
    iput v2, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldWidth:I

    .line 103
    return-void

    .line 80
    :cond_2
    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenHeight:I

    if-ne v3, v2, :cond_3

    .line 82
    iget v1, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenHeight:I

    .line 83
    .local v1, "tmp_var":I
    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenWidth:I

    iput v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenHeight:I

    .line 84
    iput v1, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->screenWidth:I

    .line 85
    const-string v3, "SoftKeyboardDetect"

    const-string v4, "Orientation Change"

    invoke-static {v3, v4}, Lorg/apache/cordova/LOG;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 89
    .end local v1    # "tmp_var":I
    :cond_3
    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    if-le v0, v3, :cond_4

    .line 90
    iget-object v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    if-eqz v3, :cond_1

    .line 91
    iget-object v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    iget-object v3, v3, Lorg/apache/cordova/CordovaActivity;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.fireDocumentEvent(\'hidekeyboard\');"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :cond_4
    iget v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->oldHeight:I

    if-ge v0, v3, :cond_1

    .line 96
    iget-object v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    if-eqz v3, :cond_1

    .line 97
    iget-object v3, p0, Lorg/apache/cordova/LinearLayoutSoftKeyboardDetect;->app:Lorg/apache/cordova/CordovaActivity;

    iget-object v3, v3, Lorg/apache/cordova/CordovaActivity;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v4, "cordova.fireDocumentEvent(\'showkeyboard\');"

    invoke-virtual {v3, v4}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0
.end method
