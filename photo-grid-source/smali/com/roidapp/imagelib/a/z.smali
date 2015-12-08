.class public final Lcom/roidapp/imagelib/a/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;

.field private b:I


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/a/i;I)V
    .locals 1

    .prologue
    .line 1127
    iput-object p1, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1126
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/a/z;->b:I

    .line 1128
    iput p2, p0, Lcom/roidapp/imagelib/a/z;->b:I

    .line 1129
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1134
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0, v5}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Z)Z

    .line 1136
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->z(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->p(Lcom/roidapp/imagelib/a/i;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;I)[Ljava/lang/Integer;

    move-result-object v2

    .line 1137
    array-length v0, v2

    if-nez v0, :cond_0

    .line 1138
    const-string v0, "CameraPreivewFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1139
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1140
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The save length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1141
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0, v4}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Z)Z

    .line 1227
    :goto_0
    return-void

    .line 1145
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/a/z;->b:I

    array-length v3, v2

    if-lt v0, v3, :cond_1

    .line 1146
    const-string v0, "CameraPreivewFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1147
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1148
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1149
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0, v4}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Z)Z

    goto :goto_0

    .line 1155
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->A(Lcom/roidapp/imagelib/a/i;)I

    move-result v0

    if-ne v0, v5, :cond_3

    .line 1157
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->B(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    .line 1158
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->C(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v0

    .line 1170
    :goto_1
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->z(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/imagelib/a/z;->b:I

    aget-object v4, v2, v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget v5, p0, Lcom/roidapp/imagelib/a/z;->b:I

    aget-object v5, v2, v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v6, p0, Lcom/roidapp/imagelib/a/z;->b:I

    aget-object v2, v2, v6

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/2addr v2, v5

    invoke-static {v3, v4, v2}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 1172
    sget v2, Lcom/roidapp/imagelib/a/h;->c:I

    sget v4, Lcom/roidapp/imagelib/a/h;->a:I

    if-ne v2, v4, :cond_4

    .line 2202
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    invoke-static {v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 2203
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2204
    new-instance v5, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2205
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 2206
    const/high16 v6, -0x40800000    # -1.0f

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 2207
    const/4 v6, 0x0

    invoke-virtual {v4, v3, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2208
    if-eqz v2, :cond_2

    .line 2209
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 1175
    :cond_2
    :goto_2
    const-string v3, "CameraPreivewFragment"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "load bitmap size width="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ",height="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1189
    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/roidapp/imagelib/a/a;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1191
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 1221
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1225
    iget-object v1, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 1226
    iget-object v1, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1160
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    .line 1161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v4, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    .line 1162
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, ".PhotoGrid_"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ".jpg"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 1193
    :catch_0
    move-exception v0

    .line 1194
    :try_start_1
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1195
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1196
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1197
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1199
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x4

    iget v3, p0, Lcom/roidapp/imagelib/a/z;->b:I

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1200
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1221
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1202
    :catch_1
    move-exception v0

    .line 1203
    :try_start_2
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1204
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1205
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1206
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    .line 1208
    iget-object v0, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x4

    iget v3, p0, Lcom/roidapp/imagelib/a/z;->b:I

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1209
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1221
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1211
    :catch_2
    move-exception v0

    .line 1213
    :try_start_3
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1214
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1221
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1216
    :catch_3
    move-exception v0

    .line 1217
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1218
    iget-object v2, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/z;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1221
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1221
    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1222
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    :cond_4
    move-object v2, v3

    goto/16 :goto_2
.end method
