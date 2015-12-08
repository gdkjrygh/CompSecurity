.class public final Lcom/roidapp/imagelib/filter/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/imagelib/filter/aj;

.field private c:Z

.field private d:I

.field private final e:Lcom/roidapp/imagelib/filter/aq;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/filter/aj;ILcom/roidapp/imagelib/filter/aq;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1103
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1098
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aw;->c:Z

    .line 1099
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    .line 1100
    iput v1, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    .line 1104
    iput-object p3, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    .line 1105
    invoke-interface {p3}, Lcom/roidapp/imagelib/filter/aq;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/filter/aw;->c:Z

    .line 1106
    iput p2, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    .line 1110
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/aj;->h(Lcom/roidapp/imagelib/filter/aj;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1111
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/aj;->h(Lcom/roidapp/imagelib/filter/aj;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    move-result-object v0

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->deleteImage()V

    .line 1112
    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1116
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Z)Z

    .line 1118
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1119
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "activity is finish"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1228
    :goto_0
    return-void

    .line 1124
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->a()[Ljava/lang/Integer;

    move-result-object v5

    .line 1125
    array-length v0, v5

    if-nez v0, :cond_1

    .line 1126
    const-string v0, "ImageEditGLESFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1127
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1128
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/Exception;

    const-string v3, "The save length array is 0."

    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1129
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Z)Z

    goto :goto_0

    .line 1133
    :cond_1
    iget v0, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    array-length v3, v5

    if-lt v0, v3, :cond_2

    .line 1134
    const-string v0, "ImageEditGLESFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1135
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditGLSFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1136
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v3, "Out Of Memory"

    invoke-direct {v1, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1137
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Z)Z

    goto :goto_0

    .line 1142
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->b()Z

    move-result v6

    .line 1146
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    .line 1148
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aw;->c:Z

    if-nez v0, :cond_3

    .line 1149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    .line 1152
    :cond_3
    new-instance v0, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v3, v3, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1153
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1154
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->i:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aw;->c:Z

    if-nez v0, :cond_4

    .line 1155
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->i:Ljava/lang/String;

    .line 1156
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1157
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1165
    :goto_1
    const-string v3, "ImageEditGLESFragment"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Save file name "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1168
    const/4 v3, 0x0

    .line 1172
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    iget v7, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    aget-object v7, v5, v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v4, v7}, Lcom/roidapp/imagelib/filter/aq;->a(I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 1173
    if-nez v3, :cond_8

    :try_start_1
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "load src bitmap failed!"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1193
    :catch_0
    move-exception v0

    move-object v1, v3

    .line 1194
    :goto_2
    :try_start_2
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1195
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1196
    const-string v2, "ImageEditGLESFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Meet OOM, side length="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    aget-object v4, v5, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1197
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1199
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x400

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v2, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1200
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1201
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v2}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1220
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1159
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aw;->c:Z

    if-eqz v0, :cond_6

    .line 1160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "PhotoGrid_"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v6, :cond_5

    const-string v0, ".png"

    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_5
    const-string v0, ".jpg"

    goto :goto_3

    .line 1162
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, ".PhotoGrid_"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v6, :cond_7

    const-string v0, ".png"

    :goto_4
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_7
    const-string v0, ".jpg"

    goto :goto_4

    .line 1174
    :cond_8
    :try_start_3
    const-string v4, "ImageEditGLESFragment"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "load bitmap size width="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ",height="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1175
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v7, 0x1

    invoke-virtual {v3, v4, v7}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 1176
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1179
    :try_start_4
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/aj;->i(Lcom/roidapp/imagelib/filter/aj;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1180
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v3}, Lcom/roidapp/imagelib/filter/aj;->e(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v3

    .line 1182
    :goto_5
    :try_start_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 1183
    const-string v4, "ImageEditGLESFragment"

    const-string v7, "process end, start to save."

    invoke-static {v4, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1184
    if-eqz v6, :cond_9

    .line 1185
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v3, v4, v0, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v0

    move-object v4, v0

    .line 1191
    :goto_6
    const-string v0, "ImageEditGLESFragment"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "save bitmap size width="

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, ",height="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1192
    const-string v0, "ImageEditGLESFragment"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "save to "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, ", save time="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    sub-long v8, v10, v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1220
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1225
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v3

    const/16 v5, 0x401

    if-eqz v6, :cond_a

    move v0, v1

    :goto_7
    invoke-static {v3, v5, v2, v0, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 1226
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1188
    :cond_9
    :try_start_6
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v3, v4, v0, v7}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    move-object v4, v0

    goto :goto_6

    .line 1203
    :catch_1
    move-exception v0

    .line 1204
    :goto_8
    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 1205
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1220
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1207
    :catch_2
    move-exception v0

    .line 1208
    :goto_9
    :try_start_8
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1209
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1210
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 1211
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x400

    const/4 v2, 0x0

    iget v4, p0, Lcom/roidapp/imagelib/filter/aw;->d:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v1, v2, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1212
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aw;->e:Lcom/roidapp/imagelib/filter/aq;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1213
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1220
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1215
    :catch_3
    move-exception v0

    .line 1216
    :goto_a
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1217
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aw;->b:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aw;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1220
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1220
    :catchall_0
    move-exception v0

    :goto_b
    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1221
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    :cond_a
    move v0, v2

    .line 1225
    goto :goto_7

    .line 1220
    :catchall_1
    move-exception v0

    move-object v3, v4

    goto :goto_b

    :catchall_2
    move-exception v0

    move-object v3, v1

    goto :goto_b

    .line 1215
    :catch_4
    move-exception v0

    move-object v3, v4

    goto :goto_a

    .line 1207
    :catch_5
    move-exception v0

    move-object v3, v4

    goto :goto_9

    .line 1203
    :catch_6
    move-exception v0

    move-object v3, v4

    goto :goto_8

    .line 1193
    :catch_7
    move-exception v0

    move-object v1, v3

    goto/16 :goto_2

    :catch_8
    move-exception v0

    move-object v1, v4

    goto/16 :goto_2

    :cond_b
    move-object v3, v4

    goto/16 :goto_5
.end method
