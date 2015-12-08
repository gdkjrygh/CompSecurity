.class public Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
.super Ljava/lang/Object;
.source "XWalkLaunchScreenManager.java"

# interfaces
.implements Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;
.implements Landroid/content/DialogInterface$OnShowListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Lorg/xwalk/core/internal/PageLoadListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;,
        Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
    }
.end annotation


# static fields
.field private static final BORDER_MODE_REPEAT:Ljava/lang/String; = "repeat"

.field private static final BORDER_MODE_ROUND:Ljava/lang/String; = "round"

.field private static final BORDER_MODE_STRETCH:Ljava/lang/String; = "stretch"

.field private static mIntentFilterStr:Ljava/lang/String;


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mCurrentOrientation:I

.field private mCustomHideLaunchScreen:Z

.field private mFirstFrameReceived:Z

.field private mLaunchScreenDialog:Landroid/app/Dialog;

.field private mLaunchScreenReadyWhenReceiver:Landroid/content/BroadcastReceiver;

.field private mLibContext:Landroid/content/Context;

.field private mOrientationListener:Landroid/view/OrientationEventListener;

.field private mPageLoadFinished:Z

.field private mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

.field private mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "xwView"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 89
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLibContext:Landroid/content/Context;

    .line 90
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hideLaunchScreen"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mIntentFilterStr:Ljava/lang/String;

    .line 92
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Activity;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/app/Dialog;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$1000(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->hideLaunchScreenWhenReady()V

    return-void
.end method

.method static synthetic access$102(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
    .param p1, "x1"    # Landroid/app/Dialog;

    .prologue
    .line 50
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;

    return-object p1
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLibContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V

    return-void
.end method

.method static synthetic access$400(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Ljava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getLaunchScreenLayout(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Landroid/view/OrientationEventListener;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;

    return-object v0
.end method

.method static synthetic access$502(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Landroid/view/OrientationEventListener;)Landroid/view/OrientationEventListener;
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
    .param p1, "x1"    # Landroid/view/OrientationEventListener;

    .prologue
    .line 50
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;

    return-object p1
.end method

.method static synthetic access$600(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)I
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCurrentOrientation:I

    return v0
.end method

.method static synthetic access$700(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    return-object v0
.end method

.method static synthetic access$800(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;

    .prologue
    .line 50
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->registerBroadcastReceiver()V

    return-void
.end method

.method static synthetic access$902(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
    .param p1, "x1"    # Z

    .prologue
    .line 50
    iput-boolean p1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCustomHideLaunchScreen:Z

    return p1
.end method

.method public static getHideLaunchScreenFilterStr()Ljava/lang/String;
    .locals 1

    .prologue
    .line 183
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mIntentFilterStr:Ljava/lang/String;

    return-object v0
.end method

.method private getLaunchScreenLayout(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 7
    .param p1, "imageBorderList"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 204
    const-string v2, ";"

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 206
    .local v0, "borders":[Ljava/lang/String;
    array-length v2, v0

    if-ge v2, v4, :cond_0

    const-string v2, ""

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    .line 235
    :goto_0
    return-object v2

    .line 207
    :cond_0
    invoke-virtual {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getScreenOrientation()I

    move-result v1

    .line 208
    .local v1, "orientation":I
    iput v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCurrentOrientation:I

    .line 209
    array-length v2, v0

    if-lt v2, v5, :cond_3

    if-ne v1, v5, :cond_3

    .line 210
    aget-object v2, v0, v4

    const-string v3, "empty"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 213
    const-string v2, ""

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 214
    :cond_1
    aget-object v2, v0, v4

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 217
    aget-object v2, v0, v6

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 219
    :cond_2
    aget-object v2, v0, v4

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 221
    :cond_3
    array-length v2, v0

    const/4 v3, 0x3

    if-ne v2, v3, :cond_6

    if-ne v1, v4, :cond_6

    .line 222
    aget-object v2, v0, v5

    const-string v3, "empty"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 225
    const-string v2, ""

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 226
    :cond_4
    aget-object v2, v0, v5

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 229
    aget-object v2, v0, v6

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 231
    :cond_5
    aget-object v2, v0, v5

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0

    .line 235
    :cond_6
    aget-object v2, v0, v6

    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;

    move-result-object v2

    goto :goto_0
.end method

.method private getStatusBarHeight()I
    .locals 5

    .prologue
    .line 314
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "status_bar_height"

    const-string v3, "dimen"

    const-string v4, "android"

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 316
    .local v0, "resourceId":I
    if-lez v0, :cond_0

    .line 317
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 320
    :goto_0
    return v1

    :cond_0
    const/16 v1, 0x19

    goto :goto_0
.end method

.method private getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;
    .locals 16
    .param p1, "img"    # Landroid/graphics/Bitmap;
    .param p2, "x"    # I
    .param p3, "y"    # I
    .param p4, "width"    # I
    .param p5, "height"    # I
    .param p6, "mode"    # Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    .param p7, "maxWidth"    # I
    .param p8, "maxHeight"    # I

    .prologue
    .line 272
    if-nez p1, :cond_0

    const/4 v10, 0x0

    .line 310
    :goto_0
    return-object v10

    .line 274
    :cond_0
    if-lez p4, :cond_1

    if-gtz p5, :cond_2

    :cond_1
    const/4 v10, 0x0

    goto :goto_0

    .line 277
    :cond_2
    new-instance v3, Landroid/graphics/Rect;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    invoke-direct {v3, v12, v13, v14, v15}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 278
    .local v3, "imgRect":Landroid/graphics/Rect;
    new-instance v11, Landroid/graphics/Rect;

    add-int v12, p2, p4

    add-int v13, p3, p5

    move/from16 v0, p2

    move/from16 v1, p3

    invoke-direct {v11, v0, v1, v12, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 279
    .local v11, "subRect":Landroid/graphics/Rect;
    invoke-virtual {v3, v11}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v12

    if-nez v12, :cond_3

    const/4 v10, 0x0

    goto :goto_0

    .line 281
    :cond_3
    invoke-static/range {p1 .. p5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 282
    .local v9, "subImage":Landroid/graphics/Bitmap;
    new-instance v10, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v12, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-direct {v10, v12}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 284
    .local v10, "subImageView":Landroid/widget/ImageView;
    sget-object v12, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->ROUND:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, p6

    if-ne v0, v12, :cond_6

    .line 285
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 286
    .local v7, "originW":I
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 287
    .local v6, "originH":I
    move v5, v7

    .line 288
    .local v5, "newW":I
    move v4, v6

    .line 290
    .local v4, "newH":I
    if-lez p7, :cond_4

    move-object/from16 v0, p0

    move/from16 v1, p7

    invoke-direct {v0, v1, v7}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSuitableSize(II)I

    move-result v5

    .line 291
    :cond_4
    if-lez p8, :cond_5

    move-object/from16 v0, p0

    move/from16 v1, p8

    invoke-direct {v0, v1, v6}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSuitableSize(II)I

    move-result v4

    .line 293
    :cond_5
    const/4 v12, 0x1

    invoke-static {v9, v5, v4, v12}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 295
    .local v8, "resizedBitmap":Landroid/graphics/Bitmap;
    move-object v9, v8

    .line 296
    sget-object p6, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 298
    .end local v4    # "newH":I
    .end local v5    # "newW":I
    .end local v6    # "originH":I
    .end local v7    # "originW":I
    .end local v8    # "resizedBitmap":Landroid/graphics/Bitmap;
    :cond_6
    sget-object v12, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, p6

    if-ne v0, v12, :cond_7

    .line 299
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    move-object/from16 v0, p0

    iget-object v12, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v12}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-direct {v2, v12, v9}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 300
    .local v2, "drawable":Landroid/graphics/drawable/BitmapDrawable;
    sget-object v12, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v13, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-virtual {v2, v12, v13}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeXY(Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 301
    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 302
    sget-object v12, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto/16 :goto_0

    .line 303
    .end local v2    # "drawable":Landroid/graphics/drawable/BitmapDrawable;
    :cond_7
    sget-object v12, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, p6

    if-ne v0, v12, :cond_8

    .line 304
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 305
    sget-object v12, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto/16 :goto_0

    .line 307
    :cond_8
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0
.end method

.method private getSuitableSize(II)I
    .locals 4
    .param p1, "maxSize"    # I
    .param p2, "divider"    # I

    .prologue
    .line 239
    move v0, p2

    .line 240
    .local v0, "finalSize":I
    int-to-float v1, p2

    .line 241
    .local v1, "minMod":F
    :goto_0
    const/4 v3, 0x1

    if-le p2, v3, :cond_0

    .line 242
    rem-int v2, p1, p2

    .line 244
    .local v2, "mod":I
    if-nez v2, :cond_1

    .line 245
    move v0, p2

    .line 255
    .end local v2    # "mod":I
    :cond_0
    return v0

    .line 250
    .restart local v2    # "mod":I
    :cond_1
    int-to-float v3, v2

    cmpg-float v3, v3, v1

    if-gez v3, :cond_2

    .line 251
    int-to-float v1, v2

    .line 252
    move v0, p2

    .line 241
    :cond_2
    add-int/lit8 p2, p2, -0x1

    goto :goto_0
.end method

.method private hideLaunchScreenWhenReady()V
    .locals 2

    .prologue
    .line 565
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mFirstFrameReceived:Z

    if-nez v0, :cond_1

    .line 577
    :cond_0
    :goto_0
    return-void

    .line 566
    :cond_1
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v0, v1, :cond_2

    .line 567
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V

    goto :goto_0

    .line 568
    :cond_2
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->USER_INTERACTIVE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v0, v1, :cond_3

    .line 571
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V

    goto :goto_0

    .line 572
    :cond_3
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->COMPLETE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v0, v1, :cond_4

    .line 573
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mPageLoadFinished:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V

    goto :goto_0

    .line 574
    :cond_4
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v0, v1, :cond_0

    .line 575
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mCustomHideLaunchScreen:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->performHideLaunchScreen()V

    goto :goto_0
.end method

.method private parseImageBorder(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 50
    .param p1, "imageBorder"    # Ljava/lang/String;

    .prologue
    .line 324
    const/4 v8, 0x0

    .line 325
    .local v8, "topBorder":I
    const/16 v20, 0x0

    .line 326
    .local v20, "rightBorder":I
    const/4 v7, 0x0

    .line 327
    .local v7, "leftBorder":I
    const/16 v33, 0x0

    .line 328
    .local v33, "bottomBorder":I
    sget-object v15, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 329
    .local v15, "horizontalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    sget-object v27, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 331
    .local v27, "verticalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    const-string v3, "empty"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p1, ""

    .line 334
    :cond_0
    const-string v3, " "

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v43

    .line 335
    .local v43, "items":[Ljava/lang/String;
    new-instance v37, Ljava/util/ArrayList;

    invoke-direct/range {v37 .. v37}, Ljava/util/ArrayList;-><init>()V

    .line 336
    .local v37, "borders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v45, Ljava/util/ArrayList;

    invoke-direct/range {v45 .. v45}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .local v45, "modes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;>;"
    const/16 v40, 0x0

    .local v40, "i":I
    :goto_0
    move-object/from16 v0, v43

    array-length v3, v0

    move/from16 v0, v40

    if-ge v0, v3, :cond_5

    .line 338
    aget-object v42, v43, v40

    .line 339
    .local v42, "item":Ljava/lang/String;
    const-string v3, "px"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 340
    const-string v3, "px"

    const-string v5, ""

    move-object/from16 v0, v42

    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    :cond_1
    :goto_1
    add-int/lit8 v40, v40, 0x1

    goto :goto_0

    .line 341
    :cond_2
    const-string v3, "repeat"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 342
    sget-object v3, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 343
    :cond_3
    const-string v3, "stretch"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 344
    sget-object v3, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 345
    :cond_4
    const-string v3, "round"

    move-object/from16 v0, v42

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 346
    sget-object v3, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->ROUND:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 351
    .end local v42    # "item":Ljava/lang/String;
    :cond_5
    :try_start_0
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_9

    .line 352
    const/4 v3, 0x0

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v33

    move/from16 v7, v33

    move/from16 v20, v33

    move/from16 v8, v33

    .line 372
    :cond_6
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v44

    .line 373
    .local v44, "matrix":Landroid/util/DisplayMetrics;
    const/4 v3, 0x1

    int-to-float v5, v8

    move-object/from16 v0, v44

    invoke-static {v3, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v8, v3

    .line 375
    const/4 v3, 0x1

    move/from16 v0, v20

    int-to-float v5, v0

    move-object/from16 v0, v44

    invoke-static {v3, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v0, v3

    move/from16 v20, v0

    .line 377
    const/4 v3, 0x1

    int-to-float v5, v7

    move-object/from16 v0, v44

    invoke-static {v3, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v7, v3

    .line 379
    const/4 v3, 0x1

    move/from16 v0, v33

    int-to-float v5, v0

    move-object/from16 v0, v44

    invoke-static {v3, v5, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v0, v3

    move/from16 v33, v0

    .line 383
    invoke-virtual/range {v45 .. v45}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_c

    .line 384
    const/4 v3, 0x0

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v27

    .end local v27    # "verticalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    check-cast v27, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .restart local v27    # "verticalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    move-object/from16 v15, v27

    .line 391
    :cond_7
    :goto_3
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v5, "launchscreen_img"

    const-string v6, "drawable"

    move-object/from16 v0, p0

    iget-object v9, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v9}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v5, v6, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v41

    .line 393
    .local v41, "imgResId":I
    if-nez v41, :cond_d

    const/16 v47, 0x0

    .line 549
    :cond_8
    :goto_4
    return-object v47

    .line 354
    .end local v41    # "imgResId":I
    .end local v44    # "matrix":Landroid/util/DisplayMetrics;
    :cond_9
    :try_start_1
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_a

    .line 355
    const/4 v3, 0x0

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v33

    move/from16 v8, v33

    .line 356
    const/4 v3, 0x1

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move/from16 v20, v7

    goto/16 :goto_2

    .line 357
    :cond_a
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x3

    if-ne v3, v5, :cond_b

    .line 358
    const/4 v3, 0x1

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move/from16 v20, v7

    .line 359
    const/4 v3, 0x0

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 360
    const/4 v3, 0x2

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v33

    goto/16 :goto_2

    .line 361
    :cond_b
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x4

    if-ne v3, v5, :cond_6

    .line 362
    const/4 v3, 0x0

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 363
    const/4 v3, 0x1

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v20

    .line 364
    const/4 v3, 0x2

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 365
    const/4 v3, 0x3

    move-object/from16 v0, v37

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v33

    goto/16 :goto_2

    .line 367
    :catch_0
    move-exception v39

    .line 368
    .local v39, "e":Ljava/lang/NumberFormatException;
    const/16 v33, 0x0

    move/from16 v7, v33

    move/from16 v20, v33

    move/from16 v8, v33

    goto/16 :goto_2

    .line 385
    .end local v39    # "e":Ljava/lang/NumberFormatException;
    .restart local v44    # "matrix":Landroid/util/DisplayMetrics;
    :cond_c
    invoke-virtual/range {v45 .. v45}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_7

    .line 386
    const/4 v3, 0x0

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    .end local v15    # "horizontalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    check-cast v15, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 387
    .restart local v15    # "horizontalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    const/4 v3, 0x1

    move-object/from16 v0, v45

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v27

    .end local v27    # "verticalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    check-cast v27, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .restart local v27    # "verticalMode":Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    goto/16 :goto_3

    .line 394
    .restart local v41    # "imgResId":I
    :cond_d
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    move/from16 v0, v41

    invoke-static {v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 395
    .local v4, "img":Landroid/graphics/Bitmap;
    if-nez v4, :cond_e

    const/16 v47, 0x0

    goto/16 :goto_4

    .line 397
    :cond_e
    new-instance v47, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    move-object/from16 v0, v47

    invoke-direct {v0, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 398
    .local v47, "root":Landroid/widget/RelativeLayout;
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x1

    invoke-direct {v3, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v47

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 405
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_f

    .line 406
    new-instance v49, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    move-object/from16 v0, v49

    invoke-direct {v0, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 407
    .local v49, "subImageView":Landroid/widget/ImageView;
    move-object/from16 v0, v49

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 408
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 411
    .local v46, "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xd

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 412
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_4

    .line 419
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    .end local v49    # "subImageView":Landroid/widget/ImageView;
    :cond_f
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v38

    .line 420
    .local v38, "display":Landroid/view/Display;
    new-instance v48, Landroid/graphics/Point;

    invoke-direct/range {v48 .. v48}, Landroid/graphics/Point;-><init>()V

    .line 421
    .local v48, "size":Landroid/graphics/Point;
    move-object/from16 v0, v38

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 424
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v3, v3, 0x400

    if-nez v3, :cond_10

    .line 426
    move-object/from16 v0, v48

    iget v3, v0, Landroid/graphics/Point;->y:I

    invoke-direct/range {p0 .. p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getStatusBarHeight()I

    move-result v5

    sub-int/2addr v3, v5

    move-object/from16 v0, v48

    iput v3, v0, Landroid/graphics/Point;->y:I

    .line 430
    :cond_10
    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v9, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p0

    invoke-direct/range {v3 .. v11}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 431
    .restart local v49    # "subImageView":Landroid/widget/ImageView;
    if-eqz v49, :cond_11

    .line 432
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 435
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0x9

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 436
    const/16 v3, 0xa

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 437
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 441
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_11
    const/4 v12, 0x0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int/2addr v3, v7

    sub-int v13, v3, v20

    move-object/from16 v0, v48

    iget v3, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v7

    sub-int v16, v3, v20

    const/16 v17, 0x0

    move-object/from16 v9, p0

    move-object v10, v4

    move v11, v7

    move v14, v8

    invoke-direct/range {v9 .. v17}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 443
    if-eqz v49, :cond_12

    .line 444
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 447
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xa

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 448
    const/16 v3, 0xe

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 449
    move-object/from16 v0, v46

    iput v7, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 450
    move/from16 v0, v20

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 451
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 455
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_12
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int v18, v3, v20

    const/16 v19, 0x0

    sget-object v22, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, v4

    move/from16 v21, v8

    invoke-direct/range {v16 .. v24}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 457
    if-eqz v49, :cond_13

    .line 458
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 461
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xb

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 462
    const/16 v3, 0xa

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 463
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 467
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_13
    const/16 v23, 0x0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v3, v8

    sub-int v26, v3, v33

    const/16 v28, 0x0

    move-object/from16 v0, v48

    iget v3, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v3, v8

    sub-int v29, v3, v33

    move-object/from16 v21, p0

    move-object/from16 v22, v4

    move/from16 v24, v8

    move/from16 v25, v7

    invoke-direct/range {v21 .. v29}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 469
    if-eqz v49, :cond_14

    .line 470
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 473
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0x9

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 474
    const/16 v3, 0xd

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 475
    move-object/from16 v0, v46

    iput v8, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 476
    move/from16 v0, v33

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 477
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 481
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_14
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int/2addr v3, v7

    sub-int v9, v3, v20

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v3, v8

    sub-int v10, v3, v33

    sget-object v11, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v5, p0

    move-object v6, v4

    invoke-direct/range {v5 .. v13}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 483
    if-eqz v49, :cond_15

    .line 484
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    move-object/from16 v0, v49

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 485
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 488
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    move-object/from16 v0, v46

    iput v7, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 489
    move-object/from16 v0, v46

    iput v8, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 490
    move/from16 v0, v20

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 491
    move/from16 v0, v33

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 492
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 496
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_15
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int v18, v3, v20

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int/2addr v3, v8

    sub-int v21, v3, v33

    const/16 v23, 0x0

    move-object/from16 v0, v48

    iget v3, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v3, v8

    sub-int v24, v3, v33

    move-object/from16 v16, p0

    move-object/from16 v17, v4

    move/from16 v19, v8

    move-object/from16 v22, v27

    invoke-direct/range {v16 .. v24}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 499
    if-eqz v49, :cond_16

    .line 500
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 503
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xd

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 504
    const/16 v3, 0xb

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 505
    move-object/from16 v0, v46

    iput v8, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 506
    move/from16 v0, v33

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 507
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 511
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_16
    const/16 v30, 0x0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int v31, v3, v33

    sget-object v34, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v28, p0

    move-object/from16 v29, v4

    move/from16 v32, v7

    invoke-direct/range {v28 .. v36}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 513
    if-eqz v49, :cond_17

    .line 514
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 517
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0x9

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 518
    const/16 v3, 0xc

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 519
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 523
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_17
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int v31, v3, v33

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int/2addr v3, v7

    sub-int v32, v3, v20

    move-object/from16 v0, v48

    iget v3, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v7

    sub-int v35, v3, v20

    const/16 v36, 0x0

    move-object/from16 v28, p0

    move-object/from16 v29, v4

    move/from16 v30, v7

    move-object/from16 v34, v15

    invoke-direct/range {v28 .. v36}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 526
    if-eqz v49, :cond_18

    .line 527
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 530
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xe

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 531
    const/16 v3, 0xc

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 532
    move-object/from16 v0, v46

    iput v7, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 533
    move/from16 v0, v20

    move-object/from16 v1, v46

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 534
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 538
    .end local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_18
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    sub-int v18, v3, v20

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sub-int v19, v3, v33

    sget-object v22, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, v4

    move/from16 v21, v33

    invoke-direct/range {v16 .. v24}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->getSubImageView(Landroid/graphics/Bitmap;IIIILorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;II)Landroid/widget/ImageView;

    move-result-object v49

    .line 541
    if-eqz v49, :cond_8

    .line 542
    new-instance v46, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    move-object/from16 v0, v46

    invoke-direct {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 545
    .restart local v46    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v3, 0xb

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 546
    const/16 v3, 0xc

    const/4 v5, -0x1

    move-object/from16 v0, v46

    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 547
    move-object/from16 v0, v47

    move-object/from16 v1, v49

    move-object/from16 v2, v46

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_4
.end method

.method private performHideLaunchScreen()V
    .locals 2

    .prologue
    .line 580
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 581
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenDialog:Landroid/app/Dialog;

    .line 582
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    if-ne v0, v1, :cond_0

    .line 583
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenReadyWhenReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 585
    :cond_0
    return-void
.end method

.method private registerBroadcastReceiver()V
    .locals 3

    .prologue
    .line 553
    new-instance v0, Landroid/content/IntentFilter;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mIntentFilterStr:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 554
    .local v0, "intentFilter":Landroid/content/IntentFilter;
    new-instance v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;

    invoke-direct {v1, p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$2;-><init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;)V

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenReadyWhenReceiver:Landroid/content/BroadcastReceiver;

    .line 561
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mLaunchScreenReadyWhenReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 562
    return-void
.end method

.method private setReadyWhen(Ljava/lang/String;)V
    .locals 1
    .param p1, "readyWhen"    # Ljava/lang/String;

    .prologue
    .line 588
    const-string v0, "first-paint"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    .line 599
    :goto_0
    return-void

    .line 590
    :cond_0
    const-string v0, "user-interactive"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 591
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->USER_INTERACTIVE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    goto :goto_0

    .line 592
    :cond_1
    const-string v0, "complete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 593
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->COMPLETE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    goto :goto_0

    .line 594
    :cond_2
    const-string v0, "custom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 595
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    goto :goto_0

    .line 597
    :cond_3
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mReadyWhen:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    goto :goto_0
.end method


# virtual methods
.method public displayLaunchScreen(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "readyWhen"    # Ljava/lang/String;
    .param p2, "imageBorderList"    # Ljava/lang/String;

    .prologue
    .line 95
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    if-nez v1, :cond_0

    .line 156
    :goto_0
    return-void

    .line 96
    :cond_0
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->setReadyWhen(Ljava/lang/String;)V

    .line 98
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;

    invoke-direct {v0, p0, p2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$1;-><init>(Lorg/xwalk/core/internal/XWalkLaunchScreenManager;Ljava/lang/String;)V

    .line 155
    .local v0, "runnable":Ljava/lang/Runnable;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public getScreenOrientation()I
    .locals 5

    .prologue
    .line 189
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 190
    .local v0, "display":Landroid/view/Display;
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 191
    .local v2, "size":Landroid/graphics/Point;
    invoke-virtual {v0, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 193
    iget v3, v2, Landroid/graphics/Point;->x:I

    iget v4, v2, Landroid/graphics/Point;->y:I

    if-ge v3, v4, :cond_0

    .line 194
    const/4 v1, 0x1

    .line 198
    .local v1, "orientation":I
    :goto_0
    return v1

    .line 196
    .end local v1    # "orientation":I
    :cond_0
    const/4 v1, 0x2

    .restart local v1    # "orientation":I
    goto :goto_0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 172
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mOrientationListener:Landroid/view/OrientationEventListener;

    .line 174
    return-void
.end method

.method public onFirstFrameReceived()V
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mFirstFrameReceived:Z

    .line 161
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->hideLaunchScreenWhenReady()V

    .line 162
    return-void
.end method

.method public onPageFinished(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 178
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mPageLoadFinished:Z

    .line 179
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->hideLaunchScreenWhenReady()V

    .line 180
    return-void
.end method

.method public onShow(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 166
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 167
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->mFirstFrameReceived:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager;->hideLaunchScreenWhenReady()V

    .line 168
    :cond_0
    return-void
.end method
