.class public Lorg/chromium/ui/UiUtils;
.super Ljava/lang/Object;
.source "UiUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;
    }
.end annotation


# static fields
.field private static final KEYBOARD_DETECT_BOTTOM_THRESHOLD_DP:F = 100.0f

.field private static final TAG:Ljava/lang/String; = "UiUtils"

.field private static sKeyboardShowingDelegate:Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public static generateScaledScreenshot(Landroid/view/View;ILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 22
    .param p0, "currentView"    # Landroid/view/View;
    .param p1, "maximumDimension"    # I
    .param p2, "bitmapConfig"    # Landroid/graphics/Bitmap$Config;

    .prologue
    .line 156
    const/16 v16, 0x0

    .line 157
    .local v16, "screenshot":Landroid/graphics/Bitmap;
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v4

    .line 159
    .local v4, "drawingCacheEnabled":Z
    const/16 v17, 0x1

    :try_start_0
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-static {v0, v1}, Lorg/chromium/ui/UiUtils;->prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V

    .line 160
    if-nez v4, :cond_0

    const/16 v17, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 163
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v8

    .line 164
    .local v8, "originalBitmap":Landroid/graphics/Bitmap;
    if-eqz v8, :cond_5

    .line 165
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v17

    move/from16 v0, v17

    int-to-double v10, v0

    .line 166
    .local v10, "originalHeight":D
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v17

    move/from16 v0, v17

    int-to-double v12, v0

    .line 167
    .local v12, "originalWidth":D
    double-to-int v7, v12

    .line 168
    .local v7, "newWidth":I
    double-to-int v6, v10

    .line 169
    .local v6, "newHeight":I
    if-lez p1, :cond_1

    .line 170
    move/from16 v0, p1

    int-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v20

    div-double v14, v18, v20

    .line 171
    .local v14, "scale":D
    mul-double v18, v12, v14

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->round(D)J

    move-result-wide v18

    move-wide/from16 v0, v18

    long-to-int v7, v0

    .line 172
    mul-double v18, v10, v14

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->round(D)J

    move-result-wide v18

    move-wide/from16 v0, v18

    long-to-int v6, v0

    .line 174
    .end local v14    # "scale":D
    :cond_1
    const/16 v17, 0x1

    move/from16 v0, v17

    invoke-static {v8, v7, v6, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 176
    .local v9, "scaledScreenshot":Landroid/graphics/Bitmap;
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_4

    .line 177
    const/16 v17, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v17

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v16

    .line 178
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    const/4 v9, 0x0

    .line 203
    .end local v6    # "newHeight":I
    .end local v7    # "newWidth":I
    .end local v9    # "scaledScreenshot":Landroid/graphics/Bitmap;
    .end local v10    # "originalHeight":D
    .end local v12    # "originalWidth":D
    :cond_2
    :goto_0
    if-nez v4, :cond_3

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 204
    :cond_3
    const/16 v17, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-static {v0, v1}, Lorg/chromium/ui/UiUtils;->prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V

    .line 206
    .end local v8    # "originalBitmap":Landroid/graphics/Bitmap;
    :goto_1
    return-object v16

    .line 181
    .restart local v6    # "newHeight":I
    .restart local v7    # "newWidth":I
    .restart local v8    # "originalBitmap":Landroid/graphics/Bitmap;
    .restart local v9    # "scaledScreenshot":Landroid/graphics/Bitmap;
    .restart local v10    # "originalHeight":D
    .restart local v12    # "originalWidth":D
    :cond_4
    move-object/from16 v16, v9

    goto :goto_0

    .line 183
    .end local v6    # "newHeight":I
    .end local v7    # "newWidth":I
    .end local v9    # "scaledScreenshot":Landroid/graphics/Bitmap;
    .end local v10    # "originalHeight":D
    .end local v12    # "originalWidth":D
    :cond_5
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v17

    if-lez v17, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    if-lez v17, :cond_2

    .line 184
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v17

    move/from16 v0, v17

    int-to-double v10, v0

    .line 185
    .restart local v10    # "originalHeight":D
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    move/from16 v0, v17

    int-to-double v12, v0

    .line 186
    .restart local v12    # "originalWidth":D
    double-to-int v7, v12

    .line 187
    .restart local v7    # "newWidth":I
    double-to-int v6, v10

    .line 188
    .restart local v6    # "newHeight":I
    if-lez p1, :cond_6

    .line 189
    move/from16 v0, p1

    int-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v20

    div-double v14, v18, v20

    .line 190
    .restart local v14    # "scale":D
    mul-double v18, v12, v14

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->round(D)J

    move-result-wide v18

    move-wide/from16 v0, v18

    long-to-int v7, v0

    .line 191
    mul-double v18, v10, v14

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->round(D)J

    move-result-wide v18

    move-wide/from16 v0, v18

    long-to-int v6, v0

    .line 193
    .end local v14    # "scale":D
    :cond_6
    move-object/from16 v0, p2

    invoke-static {v7, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 194
    .local v2, "bitmap":Landroid/graphics/Bitmap;
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 195
    .local v3, "canvas":Landroid/graphics/Canvas;
    int-to-double v0, v7

    move-wide/from16 v18, v0

    div-double v18, v18, v12

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    int-to-double v0, v6

    move-wide/from16 v18, v0

    div-double v18, v18, v10

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v3, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 197
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    move-object/from16 v16, v2

    goto :goto_0

    .line 200
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v3    # "canvas":Landroid/graphics/Canvas;
    .end local v6    # "newHeight":I
    .end local v7    # "newWidth":I
    .end local v8    # "originalBitmap":Landroid/graphics/Bitmap;
    .end local v10    # "originalHeight":D
    .end local v12    # "originalWidth":D
    :catch_0
    move-exception v5

    .line 201
    .local v5, "e":Ljava/lang/OutOfMemoryError;
    :try_start_2
    const-string v17, "UiUtils"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "Unable to capture screenshot and scale it down."

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    if-nez v4, :cond_7

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 204
    :cond_7
    const/16 v17, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-static {v0, v1}, Lorg/chromium/ui/UiUtils;->prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V

    goto/16 :goto_1

    .line 203
    .end local v5    # "e":Ljava/lang/OutOfMemoryError;
    :catchall_0
    move-exception v17

    if-nez v4, :cond_8

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 204
    :cond_8
    const/16 v18, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lorg/chromium/ui/UiUtils;->prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V

    throw v17
.end method

.method public static hideKeyboard(Landroid/view/View;)Z
    .locals 3
    .param p0, "view"    # Landroid/view/View;

    .prologue
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 79
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    move-result v1

    return v1
.end method

.method public static insertAfter(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)I
    .locals 1
    .param p0, "container"    # Landroid/view/ViewGroup;
    .param p1, "newView"    # Landroid/view/View;
    .param p2, "existingView"    # Landroid/view/View;

    .prologue
    .line 124
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/chromium/ui/UiUtils;->insertView(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Z)I

    move-result v0

    return v0
.end method

.method public static insertBefore(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)I
    .locals 1
    .param p0, "container"    # Landroid/view/ViewGroup;
    .param p1, "newView"    # Landroid/view/View;
    .param p2, "existingView"    # Landroid/view/View;

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/chromium/ui/UiUtils;->insertView(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Z)I

    move-result v0

    return v0
.end method

.method private static insertView(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Z)I
    .locals 2
    .param p0, "container"    # Landroid/view/ViewGroup;
    .param p1, "newView"    # Landroid/view/View;
    .param p2, "existingView"    # Landroid/view/View;
    .param p3, "after"    # Z

    .prologue
    .line 130
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 131
    .local v0, "index":I
    if-ltz v0, :cond_0

    move v1, v0

    .line 140
    :goto_0
    return v1

    .line 134
    :cond_0
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 135
    if-gez v0, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    .line 138
    :cond_1
    if-eqz p3, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 139
    :cond_2
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    move v1, v0

    .line 140
    goto :goto_0
.end method

.method public static isKeyboardShowing(Landroid/content/Context;Landroid/view/View;)Z
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x0

    .line 90
    sget-object v5, Lorg/chromium/ui/UiUtils;->sKeyboardShowingDelegate:Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;

    if-eqz v5, :cond_1

    sget-object v5, Lorg/chromium/ui/UiUtils;->sKeyboardShowingDelegate:Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;

    invoke-interface {v5, p0, p1}, Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;->disableKeyboardCheck(Landroid/content/Context;Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 102
    :cond_0
    :goto_0
    return v4

    .line 95
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    .line 96
    .local v3, "rootView":Landroid/view/View;
    if-eqz v3, :cond_0

    .line 97
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 98
    .local v0, "appRect":Landroid/graphics/Rect;
    invoke-virtual {v3, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 100
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v2, v5, Landroid/util/DisplayMetrics;->density:F

    .line 101
    .local v2, "density":F
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    int-to-float v5, v5

    div-float v1, v5, v2

    .line 102
    .local v1, "bottomMarginDp":F
    const/high16 v5, 0x42c80000    # 100.0f

    cmpl-float v5, v1, v5

    if-lez v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0
.end method

.method private static prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V
    .locals 3
    .param p0, "view"    # Landroid/view/View;
    .param p1, "takingScreenshot"    # Z

    .prologue
    .line 210
    instance-of v2, p0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, p0

    .line 211
    check-cast v1, Landroid/view/ViewGroup;

    .line 212
    .local v1, "viewGroup":Landroid/view/ViewGroup;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 213
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, Lorg/chromium/ui/UiUtils;->prepareViewHierarchyForScreenshot(Landroid/view/View;Z)V

    .line 212
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 215
    .end local v0    # "i":I
    .end local v1    # "viewGroup":Landroid/view/ViewGroup;
    :cond_0
    instance-of v2, p0, Landroid/view/SurfaceView;

    if-eqz v2, :cond_1

    .line 216
    if-nez p1, :cond_2

    const/4 v2, 0x1

    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 218
    :cond_1
    return-void

    .line 216
    :cond_2
    const/4 v2, 0x0

    goto :goto_1
.end method

.method public static setKeyboardShowingDelegate(Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;)V
    .locals 0
    .param p0, "delegate"    # Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;

    .prologue
    .line 55
    sput-object p0, Lorg/chromium/ui/UiUtils;->sKeyboardShowingDelegate:Lorg/chromium/ui/UiUtils$KeyboardShowingDelegate;

    .line 56
    return-void
.end method

.method public static showKeyboard(Landroid/view/View;)V
    .locals 3
    .param p0, "view"    # Landroid/view/View;

    .prologue
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 67
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 68
    return-void
.end method
