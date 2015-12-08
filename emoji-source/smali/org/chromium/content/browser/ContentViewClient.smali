.class public Lorg/chromium/content/browser/ContentViewClient;
.super Ljava/lang/Object;
.source "ContentViewClient.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ContentViewClient"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static shouldPropagateKey(I)Z
    .locals 1
    .param p0, "keyCode"    # I

    .prologue
    .line 196
    const/16 v0, 0x52

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/16 v0, 0x1a

    if-eq p0, v0, :cond_0

    const/16 v0, 0x4f

    if-eq p0, v0, :cond_0

    const/16 v0, 0x1b

    if-eq p0, v0, :cond_0

    const/16 v0, 0x50

    if-eq p0, v0, :cond_0

    const/16 v0, 0x19

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa4

    if-eq p0, v0, :cond_0

    const/16 v0, 0x18

    if-ne p0, v0, :cond_1

    .line 208
    :cond_0
    const/4 v0, 0x0

    .line 210
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public doesPerformWebSearch()Z
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    return v0
.end method

.method public getContentVideoViewClient()Lorg/chromium/content/browser/ContentVideoViewClient;
    .locals 1

    .prologue
    .line 173
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSelectActionModeCallback(Landroid/content/Context;Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;Z)Landroid/view/ActionMode$Callback;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "actionHandler"    # Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;
    .param p3, "incognito"    # Z

    .prologue
    .line 91
    new-instance v0, Lorg/chromium/content/browser/SelectActionModeCallback;

    invoke-direct {v0, p1, p2, p3}, Lorg/chromium/content/browser/SelectActionModeCallback;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;Z)V

    return-object v0
.end method

.method public onBackgroundColorChanged(I)V
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 42
    return-void
.end method

.method public onContextualActionBarHidden()V
    .locals 0

    .prologue
    .line 104
    return-void
.end method

.method public onContextualActionBarShown()V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method public onImeEvent()V
    .locals 0

    .prologue
    .line 75
    return-void
.end method

.method public onImeStateChangeRequested(Z)V
    .locals 0
    .param p1, "requestShow"    # Z

    .prologue
    .line 84
    return-void
.end method

.method public onOffsetsForFullscreenChanged(FFF)V
    .locals 0
    .param p1, "topControlsOffsetYPix"    # F
    .param p2, "contentOffsetYPix"    # F
    .param p3, "overdrawBottomHeightPix"    # F

    .prologue
    .line 52
    return-void
.end method

.method public onSelectionChanged(Ljava/lang/String;)V
    .locals 0
    .param p1, "selection"    # Ljava/lang/String;

    .prologue
    .line 130
    return-void
.end method

.method public onSelectionEvent(I)V
    .locals 0
    .param p1, "eventType"    # I

    .prologue
    .line 139
    return-void
.end method

.method public onSelectionEvent(IFF)V
    .locals 0
    .param p1, "eventType"    # I
    .param p2, "posXPix"    # F
    .param p3, "posYPix"    # F

    .prologue
    .line 149
    invoke-virtual {p0, p1}, Lorg/chromium/content/browser/ContentViewClient;->onSelectionEvent(I)V

    .line 150
    return-void
.end method

.method public onStartContentIntent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intentUrl"    # Ljava/lang/String;

    .prologue
    .line 159
    const/4 v2, 0x1

    :try_start_0
    invoke-static {p2, v2}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 166
    .local v1, "intent":Landroid/content/Intent;
    :try_start_1
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 170
    .end local v1    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 160
    :catch_0
    move-exception v0

    .line 161
    .local v0, "ex":Ljava/net/URISyntaxException;
    const-string v2, "ContentViewClient"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Bad URI "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 167
    .end local v0    # "ex":Ljava/net/URISyntaxException;
    .restart local v1    # "intent":Landroid/content/Intent;
    :catch_1
    move-exception v0

    .line 168
    .local v0, "ex":Landroid/content/ActivityNotFoundException;
    const-string v2, "ContentViewClient"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No application can handle "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public onUpdateTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 35
    return-void
.end method

.method public performWebSearch(Ljava/lang/String;)V
    .locals 0
    .param p1, "searchQuery"    # Ljava/lang/String;

    .prologue
    .line 112
    return-void
.end method

.method public shouldBlockMediaRequest(Ljava/lang/String;)Z
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 182
    const/4 v0, 0x0

    return v0
.end method

.method public shouldOverrideKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x1

    .line 55
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 57
    .local v0, "keyCode":I
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewClient;->shouldPropagateKey(I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 67
    :cond_0
    :goto_0
    return v1

    .line 60
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x3d

    if-eq v0, v2, :cond_0

    const/16 v2, 0x33

    if-eq v0, v2, :cond_0

    const/16 v2, 0x86

    if-eq v0, v2, :cond_0

    .line 67
    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method
