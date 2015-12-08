.class public Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
.super Landroid/app/Activity;
.source "CameraActivity.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field private static final ASPECT_TOLERANCE:D = 0.1

.field private static final COMMA_PATTERN:Ljava/util/regex/Pattern;

.field public static final ERROR_BAD_SURFACE_VIEW:I = -0xbba

.field public static final ERROR_CAMERA:I = -0xbbb

.field private static final TAG:Ljava/lang/String; = "CameraActivity"

.field private static final TARGET_HEIGHT:I = 0x4b0

.field private static final TARGET_WIDTH:I = 0x640

.field private static final TEN_DESIRED_ZOOM:I = 0x1b

.field private static mOuterRL:Landroid/widget/RelativeLayout;


# instance fields
.field private callBackId:Ljava/lang/String;

.field private camera:Landroid/hardware/Camera;

.field private compressedImage:[B

.field private controlInflater:Landroid/view/LayoutInflater;

.field private hasAutoFocus:Z

.field private label:Ljava/lang/String;

.field private lastFocused:J

.field private mAutoFocusImage:Landroid/view/View$OnClickListener;

.field private mLabel:Landroid/widget/TextView;

.field private mOverlayTake:Landroid/view/View;

.field private mOverlayUseRetake:Landroid/view/View;

.field private mRetake:Landroid/widget/Button;

.field private mRetakePictureAction:Landroid/view/View$OnClickListener;

.field private mTakePicture:Landroid/widget/ImageButton;

.field private mTakePictureAction:Landroid/view/View$OnClickListener;

.field private mUsePicture:Landroid/widget/Button;

.field private mUsePictureAction:Landroid/view/View$OnClickListener;

.field private mUseRetakeLayout:Landroid/widget/LinearLayout;

.field private rawCallback:Landroid/hardware/Camera$PictureCallback;

.field private surfaceHolder:Landroid/view/SurfaceHolder;

.field private surfaceView:Landroid/view/SurfaceView;

.field private takingPicture:Z

.field private viewControl:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 76
    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->COMMA_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 46
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 56
    iput-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->controlInflater:Landroid/view/LayoutInflater;

    .line 65
    iput-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->callBackId:Ljava/lang/String;

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->label:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    .line 70
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->hasAutoFocus:Z

    .line 73
    iput-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->viewControl:Landroid/view/View;

    .line 157
    new-instance v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$1;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePictureAction:Landroid/view/View$OnClickListener;

    .line 180
    new-instance v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$2;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mRetakePictureAction:Landroid/view/View$OnClickListener;

    .line 204
    new-instance v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$3;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mAutoFocusImage:Landroid/view/View$OnClickListener;

    .line 244
    new-instance v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$4;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUsePictureAction:Landroid/view/View$OnClickListener;

    .line 258
    new-instance v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->rawCallback:Landroid/hardware/Camera$PictureCallback;

    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->sendTimerReset()V

    return-void
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/ImageButton;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayUseRetake:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayTake:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->label:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/TextView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mLabel:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
    .param p1, "x1"    # Z

    .prologue
    .line 46
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    return p1
.end method

.method static synthetic access$1500(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->callBackId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
    .param p1, "x1"    # [B
    .param p2, "x2"    # I
    .param p3, "x3"    # I
    .param p4, "x4"    # Landroid/graphics/BitmapFactory$Options;

    .prologue
    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1700(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[B)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
    .param p1, "x1"    # [B

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressImage([B)V

    return-void
.end method

.method static synthetic access$200(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    return-object v0
.end method

.method static synthetic access$300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Z
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->hasAutoFocus:Z

    return v0
.end method

.method static synthetic access$400(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)J
    .locals 2
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-wide v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J

    return-wide v0
.end method

.method static synthetic access$402(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;J)J
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
    .param p1, "x1"    # J

    .prologue
    .line 46
    iput-wide p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->lastFocused:J

    return-wide p1
.end method

.method static synthetic access$500(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/hardware/Camera$PictureCallback;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->rawCallback:Landroid/hardware/Camera$PictureCallback;

    return-object v0
.end method

.method static synthetic access$600()Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOuterRL:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$700(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/SurfaceView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceView:Landroid/view/SurfaceView;

    return-object v0
.end method

.method static synthetic access$800(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)[B
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B

    return-object v0
.end method

.method static synthetic access$802(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[B)[B
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
    .param p1, "x1"    # [B

    .prologue
    .line 46
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B

    return-object p1
.end method

.method static synthetic access$900(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/LinearLayout;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUseRetakeLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private compressImage([B)V
    .locals 5
    .param p1, "data"    # [B

    .prologue
    .line 451
    const-string v3, "CameraActivity"

    const-string v4, "Compress Image"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 455
    .local v0, "baos":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 457
    .local v2, "opts":Landroid/graphics/BitmapFactory$Options;
    const/16 v3, 0x4000

    new-array v3, v3, [B

    iput-object v3, v2, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 462
    const/4 v3, 0x0

    array-length v4, p1

    invoke-direct {p0, p1, v3, v4, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 463
    .local v1, "bmp":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_0

    .line 465
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x1e

    invoke-virtual {v1, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 466
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 481
    .end local v1    # "bmp":Landroid/graphics/Bitmap;
    .end local v2    # "opts":Landroid/graphics/BitmapFactory$Options;
    :goto_0
    return-void

    .line 473
    :catch_0
    move-exception v3

    .line 476
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 477
    :catch_1
    move-exception v3

    goto :goto_0

    .line 475
    :catchall_0
    move-exception v3

    .line 476
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 479
    :goto_1
    throw v3

    .line 477
    .restart local v1    # "bmp":Landroid/graphics/Bitmap;
    .restart local v2    # "opts":Landroid/graphics/BitmapFactory$Options;
    :catch_2
    move-exception v3

    goto :goto_0

    .end local v1    # "bmp":Landroid/graphics/Bitmap;
    .end local v2    # "opts":Landroid/graphics/BitmapFactory$Options;
    :catch_3
    move-exception v4

    goto :goto_1
.end method

.method private decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 4
    .param p1, "data"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .param p4, "opts"    # Landroid/graphics/BitmapFactory$Options;

    .prologue
    .line 324
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 339
    :goto_0
    return-object v1

    .line 326
    :catch_0
    move-exception v0

    .line 328
    .local v0, "oome":Ljava/lang/OutOfMemoryError;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09014c

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09014e

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "OK"

    new-instance v3, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$6;

    invoke-direct {v3, p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$6;-><init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 339
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private doFinishWithError(I)V
    .locals 4
    .param p1, "errorCode"    # I

    .prologue
    const/4 v3, 0x0

    .line 234
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 235
    .local v0, "imageIntent":Landroid/content/Intent;
    const-string v1, "callbackId"

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->callBackId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    const-string v1, "errorCode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 237
    invoke-virtual {p0, v3, v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setResult(ILandroid/content/Intent;)V

    .line 239
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressedImage:[B

    .line 240
    iput-boolean v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    .line 241
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->finish()V

    .line 242
    return-void
.end method

.method private static findBestMotZoomValue(Ljava/lang/CharSequence;I)I
    .locals 14
    .param p0, "stringValues"    # Ljava/lang/CharSequence;
    .param p1, "tenDesiredZoom"    # I

    .prologue
    .line 586
    const/4 v5, 0x0

    .line 587
    .local v5, "tenBestValue":I
    sget-object v7, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->COMMA_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v7, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v4, v0, v1

    .line 588
    .local v4, "stringValue":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 591
    :try_start_0
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v8

    .line 596
    .local v8, "value":D
    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    mul-double/2addr v10, v8

    double-to-int v6, v10

    .line 597
    .local v6, "tenValue":I
    int-to-double v10, p1

    sub-double/2addr v10, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    move-result-wide v10

    sub-int v7, p1, v5

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    int-to-double v12, v7

    cmpg-double v7, v10, v12

    if-gez v7, :cond_0

    .line 598
    move v5, v6

    .line 587
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 593
    .end local v6    # "tenValue":I
    .end local v8    # "value":D
    :catch_0
    move-exception v3

    .line 602
    .end local v4    # "stringValue":Ljava/lang/String;
    .end local p1    # "tenDesiredZoom":I
    :goto_1
    return p1

    .restart local p1    # "tenDesiredZoom":I
    :cond_1
    move p1, v5

    goto :goto_1
.end method

.method private getOptimalSize(Ljava/util/List;IILandroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;
    .locals 16
    .param p2, "w"    # I
    .param p3, "h"    # I
    .param p4, "preferredSize"    # Landroid/hardware/Camera$Size;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/hardware/Camera$Size;",
            ">;II",
            "Landroid/hardware/Camera$Size;",
            ")",
            "Landroid/hardware/Camera$Size;"
        }
    .end annotation

    .prologue
    .line 623
    .local p1, "sizes":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    if-nez p1, :cond_1

    .line 624
    const/16 p4, 0x0

    .line 658
    .end local p4    # "preferredSize":Landroid/hardware/Camera$Size;
    :cond_0
    :goto_0
    return-object p4

    .line 627
    .restart local p4    # "preferredSize":Landroid/hardware/Camera$Size;
    :cond_1
    if-eqz p4, :cond_2

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 631
    :cond_2
    move/from16 v0, p2

    int-to-double v12, v0

    move/from16 v0, p3

    int-to-double v14, v0

    div-double v10, v12, v14

    .line 633
    .local v10, "targetRatio":D
    const/4 v3, 0x0

    .line 634
    .local v3, "optimalSize":Landroid/hardware/Camera$Size;
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 637
    .local v4, "minDiff":D
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/hardware/Camera$Size;

    .line 638
    .local v8, "size":Landroid/hardware/Camera$Size;
    const-string v9, "CameraActivity"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Preview supported w: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget v13, v8, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " h: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget v13, v8, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    int-to-double v12, v9

    iget v9, v8, Landroid/hardware/Camera$Size;->height:I

    int-to-double v14, v9

    div-double v6, v12, v14

    .line 640
    .local v6, "ratio":D
    sub-double v12, v6, v10

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    move-result-wide v12

    const-wide v14, 0x3fb999999999999aL    # 0.1

    cmpl-double v9, v12, v14

    if-gtz v9, :cond_3

    .line 643
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    sub-int v9, v9, p2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    int-to-double v12, v9

    cmpg-double v9, v12, v4

    if-gez v9, :cond_3

    .line 644
    move-object v3, v8

    .line 645
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    sub-int v9, v9, p2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    int-to-double v4, v9

    goto :goto_1

    .line 650
    .end local v6    # "ratio":D
    .end local v8    # "size":Landroid/hardware/Camera$Size;
    :cond_4
    if-nez v3, :cond_6

    .line 651
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/hardware/Camera$Size;

    .line 652
    .restart local v8    # "size":Landroid/hardware/Camera$Size;
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    sub-int v9, v9, p2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    int-to-double v12, v9

    cmpg-double v9, v12, v4

    if-gez v9, :cond_5

    .line 653
    move-object v3, v8

    .line 654
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    sub-int v9, v9, p2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    int-to-double v4, v9

    goto :goto_2

    .end local v8    # "size":Landroid/hardware/Camera$Size;
    :cond_6
    move-object/from16 p4, v3

    .line 658
    goto/16 :goto_0
.end method

.method private sendTimerReset()V
    .locals 3

    .prologue
    .line 662
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 664
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "opCode"

    const/16 v2, 0x840

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 666
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 667
    return-void
.end method

.method private setFlash(Landroid/hardware/Camera$Parameters;)V
    .locals 2
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;

    .prologue
    .line 487
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Behold II"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    const-string v0, "flash-value"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 494
    :goto_0
    const-string v0, "flash-mode"

    const-string v1, "off"

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    return-void

    .line 490
    :cond_0
    const-string v0, "flash-value"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private setZoom(Landroid/hardware/Camera$Parameters;)V
    .locals 28
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;

    .prologue
    .line 498
    const-string v22, "zoom-supported"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 499
    .local v21, "zoomSupportedString":Ljava/lang/String;
    if-eqz v21, :cond_1

    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v22

    if-nez v22, :cond_1

    .line 583
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    const/16 v16, 0x1b

    .line 506
    .local v16, "tenDesiredZoom":I
    const-string v22, "max-zoom"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 507
    .local v7, "maxZoomString":Ljava/lang/String;
    if-eqz v7, :cond_2

    .line 509
    const-wide/high16 v22, 0x4024000000000000L    # 10.0

    :try_start_0
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v24

    mul-double v22, v22, v24

    move-wide/from16 v0, v22

    double-to-int v0, v0

    move/from16 v17, v0

    .line 510
    .local v17, "tenMaxZoom":I
    move/from16 v0, v16

    move/from16 v1, v17

    if-le v0, v1, :cond_2

    .line 511
    move/from16 v16, v17

    .line 518
    .end local v17    # "tenMaxZoom":I
    :cond_2
    :goto_1
    const-string v22, "taking-picture-zoom-max"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 519
    .local v15, "takingPictureZoomMaxString":Ljava/lang/String;
    if-eqz v15, :cond_3

    .line 521
    :try_start_1
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v17

    .line 522
    .restart local v17    # "tenMaxZoom":I
    move/from16 v0, v16

    move/from16 v1, v17

    if-le v0, v1, :cond_3

    .line 523
    move/from16 v16, v17

    .line 531
    .end local v17    # "tenMaxZoom":I
    :cond_3
    :goto_2
    const-string v22, "mot-zoom-values"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 532
    .local v12, "motZoomValuesString":Ljava/lang/String;
    if-eqz v12, :cond_4

    .line 533
    move/from16 v0, v16

    invoke-static {v12, v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findBestMotZoomValue(Ljava/lang/CharSequence;I)I

    move-result v16

    .line 536
    :cond_4
    const-string v22, "mot-zoom-step"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 537
    .local v10, "motZoomStepString":Ljava/lang/String;
    if-eqz v10, :cond_8

    .line 538
    const-string v22, "mot-continuous-zoom-step-values"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 539
    .local v11, "motZoomStepVal":Ljava/lang/String;
    if-eqz v11, :cond_7

    .line 541
    const-string v22, "CameraActivity"

    move-object/from16 v0, v22

    invoke-static {v0, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    move-object/from16 v20, v11

    .line 544
    .local v20, "zoom":Ljava/lang/String;
    const-string v22, ","

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 546
    .local v14, "steps":[Ljava/lang/String;
    array-length v0, v14

    move/from16 v22, v0

    if-lez v22, :cond_6

    .line 547
    const-wide v22, 0x7fefffffffffffffL    # Double.MAX_VALUE

    invoke-static/range {v22 .. v23}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v20

    .line 548
    move-object v4, v14

    .local v4, "arr$":[Ljava/lang/String;
    array-length v6, v4

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_3
    if-ge v5, v6, :cond_6

    aget-object v19, v4, v5

    .line 549
    .local v19, "val":Ljava/lang/String;
    invoke-static/range {v19 .. v19}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v22

    invoke-static/range {v20 .. v20}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v24

    cmpg-double v22, v22, v24

    if-gez v22, :cond_5

    .line 550
    move-object/from16 v20, v19

    .line 548
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 513
    .end local v4    # "arr$":[Ljava/lang/String;
    .end local v5    # "i$":I
    .end local v6    # "len$":I
    .end local v10    # "motZoomStepString":Ljava/lang/String;
    .end local v11    # "motZoomStepVal":Ljava/lang/String;
    .end local v12    # "motZoomValuesString":Ljava/lang/String;
    .end local v14    # "steps":[Ljava/lang/String;
    .end local v15    # "takingPictureZoomMaxString":Ljava/lang/String;
    .end local v19    # "val":Ljava/lang/String;
    .end local v20    # "zoom":Ljava/lang/String;
    :catch_0
    move-exception v13

    .line 514
    .local v13, "nfe":Ljava/lang/NumberFormatException;
    const-string v22, "CameraActivity"

    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    const-string v24, "Bad max-zoom: "

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 526
    .end local v13    # "nfe":Ljava/lang/NumberFormatException;
    .restart local v15    # "takingPictureZoomMaxString":Ljava/lang/String;
    :catch_1
    move-exception v13

    .line 527
    .restart local v13    # "nfe":Ljava/lang/NumberFormatException;
    const-string v22, "CameraActivity"

    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    const-string v24, "Bad taking-picture-zoom-max: "

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Lcom/EnterpriseMobileBanking/Utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 555
    .end local v13    # "nfe":Ljava/lang/NumberFormatException;
    .restart local v10    # "motZoomStepString":Ljava/lang/String;
    .restart local v11    # "motZoomStepVal":Ljava/lang/String;
    .restart local v12    # "motZoomValuesString":Ljava/lang/String;
    .restart local v14    # "steps":[Ljava/lang/String;
    .restart local v20    # "zoom":Ljava/lang/String;
    :cond_6
    move-object/from16 v0, v20

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_7

    .line 556
    move-object/from16 v10, v20

    .line 557
    const-string v22, "mot-zoom-step"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    .end local v14    # "steps":[Ljava/lang/String;
    .end local v20    # "zoom":Ljava/lang/String;
    :cond_7
    :try_start_2
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 562
    .local v8, "motZoomStep":D
    const-wide/high16 v22, 0x4024000000000000L    # 10.0

    mul-double v22, v22, v8

    move-wide/from16 v0, v22

    double-to-int v0, v0

    move/from16 v18, v0

    .line 563
    .local v18, "tenZoomStep":I
    const/16 v22, 0x1

    move/from16 v0, v18

    move/from16 v1, v22

    if-le v0, v1, :cond_8

    .line 564
    rem-int v22, v16, v18
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    sub-int v16, v16, v22

    .line 574
    .end local v8    # "motZoomStep":D
    .end local v11    # "motZoomStepVal":Ljava/lang/String;
    .end local v18    # "tenZoomStep":I
    :cond_8
    :goto_4
    if-nez v7, :cond_9

    if-eqz v12, :cond_a

    .line 575
    :cond_9
    const-string v22, "zoom"

    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v24, v0

    const-wide/high16 v26, 0x4024000000000000L    # 10.0

    div-double v24, v24, v26

    invoke-static/range {v24 .. v25}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v0, v1, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    :cond_a
    if-eqz v15, :cond_0

    .line 581
    const-string v22, "taking-picture-zoom"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 567
    .restart local v11    # "motZoomStepVal":Ljava/lang/String;
    :catch_2
    move-exception v22

    goto :goto_4
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v3, 0x400

    const/4 v2, 0x0

    const/4 v4, -0x1

    .line 87
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 88
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->requestWindowFeature(I)Z

    .line 89
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 90
    const v1, 0x7f030004

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setContentView(I)V

    .line 91
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setRequestedOrientation(I)V

    .line 93
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/Window;->setFormat(I)V

    .line 94
    const v1, 0x7f08002f

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/SurfaceView;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceView:Landroid/view/SurfaceView;

    .line 95
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 96
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 97
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceHolder:Landroid/view/SurfaceHolder;

    const/4 v2, 0x3

    invoke-interface {v1, v2}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 99
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->controlInflater:Landroid/view/LayoutInflater;

    .line 100
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->controlInflater:Landroid/view/LayoutInflater;

    const v2, 0x7f030007

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->viewControl:Landroid/view/View;

    .line 101
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 103
    .local v0, "layoutParamsControl":Landroid/view/ViewGroup$LayoutParams;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->viewControl:Landroid/view/View;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mAutoFocusImage:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->viewControl:Landroid/view/View;

    invoke-virtual {p0, v1, v0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    const v1, 0x7f080053

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUseRetakeLayout:Landroid/widget/LinearLayout;

    .line 108
    const v1, 0x7f080051

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;

    .line 109
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePictureAction:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    const v1, 0x7f080055

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUsePicture:Landroid/widget/Button;

    .line 112
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUsePicture:Landroid/widget/Button;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUsePictureAction:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    const v1, 0x7f080054

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mRetake:Landroid/widget/Button;

    .line 115
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mRetake:Landroid/widget/Button;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mRetakePictureAction:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "callbackId"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->callBackId:Ljava/lang/String;

    .line 118
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "label"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->label:Ljava/lang/String;

    .line 120
    const v1, 0x7f080050

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mLabel:Landroid/widget/TextView;

    .line 121
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mLabel:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->label:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    const v1, 0x7f080052

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayTake:Landroid/view/View;

    .line 124
    const v1, 0x7f080056

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayUseRetake:Landroid/view/View;

    .line 125
    const v1, 0x7f08004f

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    sput-object v1, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOuterRL:Landroid/widget/RelativeLayout;

    .line 126
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 7
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 130
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    if-nez v3, :cond_0

    const/16 v3, 0x1b

    if-eq p1, v3, :cond_0

    const/16 v3, 0x50

    if-ne p1, v3, :cond_4

    :cond_0
    move v0, v2

    .line 132
    .local v0, "handled":Z
    :goto_0
    const-string v3, "CameraActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got keycode: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    if-eqz v0, :cond_1

    .line 135
    sparse-switch p1, :sswitch_data_0

    .line 153
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    return v1

    .end local v0    # "handled":Z
    :cond_4
    move v0, v1

    .line 130
    goto :goto_0

    .line 137
    .restart local v0    # "handled":Z
    :sswitch_0
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;

    invoke-virtual {v3}, Landroid/widget/ImageButton;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 138
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    .line 139
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePictureAction:Landroid/view/View$OnClickListener;

    invoke-interface {v3, v6}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_1

    .line 143
    :sswitch_1
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->takingPicture:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;

    invoke-virtual {v3}, Landroid/widget/ImageButton;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 144
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mAutoFocusImage:Landroid/view/View$OnClickListener;

    invoke-interface {v3, v6}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_1

    .line 135
    nop

    :sswitch_data_0
    .sparse-switch
        0x1b -> :sswitch_0
        0x50 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 610
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 611
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 612
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    .line 614
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 615
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 619
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 620
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 11
    .param p1, "holder"    # Landroid/view/SurfaceHolder;
    .param p2, "format"    # I
    .param p3, "width"    # I
    .param p4, "height"    # I

    .prologue
    .line 346
    const-string v4, "CameraActivity"

    const-string v5, "SurfaceChanged()"

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    if-eqz v4, :cond_0

    .line 349
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 355
    .local v2, "parameters":Landroid/hardware/Camera$Parameters;
    :try_start_0
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x640

    const/16 v6, 0x4b0

    new-instance v7, Landroid/hardware/Camera$Size;

    iget-object v8, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v9, 0x640

    const/16 v10, 0x4b0

    invoke-direct {v7, v8, v9, v10}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    invoke-direct {p0, v4, v5, v6, v7}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getOptimalSize(Ljava/util/List;IILandroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;

    move-result-object v1

    .line 358
    .local v1, "optimalPictureSize":Landroid/hardware/Camera$Size;
    const/16 v4, 0x100

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    .line 359
    iget v4, v1, Landroid/hardware/Camera$Size;->width:I

    iget v5, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v4, v5}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 360
    const/16 v4, 0x64

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    .line 361
    const-string v4, "auto"

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 362
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/hardware/Camera$Parameters;->setJpegThumbnailSize(II)V

    .line 363
    const-string v4, "gps-latitude"

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->remove(Ljava/lang/String;)V

    .line 364
    const-string v4, "gps-longitude"

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->remove(Ljava/lang/String;)V

    .line 365
    const-string v4, "gps-altitude"

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->remove(Ljava/lang/String;)V

    .line 366
    const-string v4, "gps-timestamp"

    invoke-virtual {v2, v4}, Landroid/hardware/Camera$Parameters;->remove(Ljava/lang/String;)V

    .line 368
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 373
    :try_start_1
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 374
    invoke-direct {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setFlash(Landroid/hardware/Camera$Parameters;)V

    .line 375
    invoke-direct {p0, v2}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->setZoom(Landroid/hardware/Camera$Parameters;)V

    .line 376
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 390
    .end local v1    # "optimalPictureSize":Landroid/hardware/Camera$Size;
    :goto_0
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->startPreview()V

    .line 392
    .end local v2    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_0
    return-void

    .line 378
    .restart local v1    # "optimalPictureSize":Landroid/hardware/Camera$Size;
    .restart local v2    # "parameters":Landroid/hardware/Camera$Parameters;
    :catch_0
    move-exception v0

    .line 381
    .local v0, "e":Ljava/lang/RuntimeException;
    :try_start_2
    const-string v4, "CameraActivity"

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 384
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .end local v1    # "optimalPictureSize":Landroid/hardware/Camera$Size;
    :catch_1
    move-exception v3

    .line 387
    .local v3, "re":Ljava/lang/RuntimeException;
    const-string v4, "CameraActivity"

    invoke-virtual {v3}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 7
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 396
    const-string v3, "CameraActivity"

    const-string v4, "SurfaceCreated()"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v3

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    .line 402
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v3, :cond_1

    .line 404
    :try_start_1
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v3}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 405
    .local v2, "parameters":Landroid/hardware/Camera$Parameters;
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v3

    const/16 v4, 0x640

    const/16 v5, 0x4b0

    const/4 v6, 0x0

    invoke-direct {p0, v3, v4, v5, v6}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getOptimalSize(Ljava/util/List;IILandroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;

    move-result-object v1

    .line 406
    .local v1, "optimalPreviewSize":Landroid/hardware/Camera$Size;
    if-eqz v1, :cond_0

    .line 408
    const-string v3, "CameraActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Set Preview Size width: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v1, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " height: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    iget v3, v1, Landroid/hardware/Camera$Size;->width:I

    iget v4, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v3, v4}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 410
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v3, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 413
    :cond_0
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v3, v4}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 423
    .end local v1    # "optimalPreviewSize":Landroid/hardware/Camera$Size;
    .end local v2    # "parameters":Landroid/hardware/Camera$Parameters;
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.hardware.camera.autofocus"

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 424
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->hasAutoFocus:Z

    .line 431
    :cond_2
    :goto_1
    return-void

    .line 415
    :catch_0
    move-exception v0

    .line 417
    .local v0, "e":Ljava/io/IOException;
    const-string v3, "CameraActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in surfaceChanged(): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    const/16 v3, -0xbba

    invoke-direct {p0, v3}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->doFinishWithError(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 426
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 427
    .local v0, "e":Ljava/lang/Exception;
    const-string v3, "CameraActivity"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    const/16 v3, -0xbbb

    invoke-direct {p0, v3}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->doFinishWithError(I)V

    goto :goto_1
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 435
    const-string v0, "CameraActivity"

    const-string v1, "SurfaceDestroyed()"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 439
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 440
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->camera:Landroid/hardware/Camera;

    .line 443
    :cond_0
    return-void
.end method
