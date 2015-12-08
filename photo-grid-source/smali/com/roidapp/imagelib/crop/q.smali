.class public final Lcom/roidapp/imagelib/crop/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/imagelib/crop/j;

.field private c:I

.field private d:I

.field private e:Lcom/roidapp/imagelib/crop/p;

.field private f:Landroid/graphics/Bitmap$CompressFormat;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/crop/j;IILandroid/graphics/Bitmap$CompressFormat;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 910
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 904
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    .line 905
    iput v1, p0, Lcom/roidapp/imagelib/crop/q;->c:I

    .line 906
    iput v1, p0, Lcom/roidapp/imagelib/crop/q;->d:I

    .line 911
    iput p2, p0, Lcom/roidapp/imagelib/crop/q;->c:I

    .line 912
    iput p3, p0, Lcom/roidapp/imagelib/crop/q;->d:I

    .line 913
    iput-object p4, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    .line 914
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 919
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 920
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "activity is finish"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 997
    :goto_0
    return-void

    .line 925
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    .line 926
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    .line 928
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    if-ne v0, v1, :cond_3

    .line 929
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".PhotoGrid_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 937
    :goto_1
    new-instance v1, Lcom/roidapp/imagelib/crop/p;

    invoke-direct {v1}, Lcom/roidapp/imagelib/crop/p;-><init>()V

    iput-object v1, p0, Lcom/roidapp/imagelib/crop/q;->e:Lcom/roidapp/imagelib/crop/p;

    .line 939
    :try_start_0
    iget v1, p0, Lcom/roidapp/imagelib/crop/q;->c:I

    if-nez v1, :cond_4

    .line 940
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->k(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/a;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v3}, Lcom/roidapp/imagelib/crop/j;->b(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/roidapp/imagelib/crop/a;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 941
    :try_start_1
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v3}, Lcom/roidapp/imagelib/crop/j;->k(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/a;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-eqz v3, :cond_1

    .line 942
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v3}, Lcom/roidapp/imagelib/crop/j;->b(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 943
    :cond_1
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v3}, Lcom/roidapp/imagelib/crop/j;->d(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 944
    const/16 v3, 0xc8

    const/16 v4, 0xc8

    const/4 v5, 0x0

    invoke-static {v1, v3, v4, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 946
    :cond_2
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v3, v0, v4}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v3

    .line 949
    iget v0, p0, Lcom/roidapp/imagelib/crop/q;->d:I

    if-ne v0, v7, :cond_7

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->i(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->j(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->d(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 950
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ".PhotoGrid_filterCrop_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".png"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 951
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->j(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/bi;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 952
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, v1, v2, v4}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v2

    move-object v1, v3

    .line 978
    :goto_2
    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 980
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 981
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 985
    iget v0, p0, Lcom/roidapp/imagelib/crop/q;->d:I

    if-ne v0, v7, :cond_6

    .line 986
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->e:Lcom/roidapp/imagelib/crop/p;

    iput-object v1, v0, Lcom/roidapp/imagelib/crop/p;->b:Landroid/net/Uri;

    .line 987
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->i(Lcom/roidapp/imagelib/crop/j;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 988
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->e:Lcom/roidapp/imagelib/crop/p;

    iput-object v2, v0, Lcom/roidapp/imagelib/crop/p;->a:Landroid/net/Uri;

    .line 991
    :goto_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/q;->e:Lcom/roidapp/imagelib/crop/p;

    invoke-static {v0, v1, v6, v6, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 992
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 932
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".PhotoGrid_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 956
    :cond_4
    :try_start_3
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v1, v3, v0, v4}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v1

    .line 958
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, ".PhotoGrid_filterCrop_"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ".png"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 959
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v3}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/q;->f:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v3, v4, v0, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    move-object v8, v2

    move-object v2, v0

    move-object v0, v8

    goto/16 :goto_2

    .line 962
    :catch_0
    move-exception v0

    .line 963
    :goto_4
    :try_start_4
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 964
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 965
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    invoke-static {v1, v0, v3}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 966
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 978
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 980
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 981
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 968
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 970
    :goto_5
    :try_start_5
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 971
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 978
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 980
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 981
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 973
    :catch_2
    move-exception v0

    move-object v1, v2

    .line 974
    :goto_6
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 975
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/q;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 978
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 980
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 981
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 978
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_7
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 979
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 980
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 981
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    .line 990
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->e:Lcom/roidapp/imagelib/crop/p;

    iput-object v1, v0, Lcom/roidapp/imagelib/crop/p;->a:Landroid/net/Uri;

    goto/16 :goto_3

    .line 994
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v0}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x4

    invoke-static {v0, v2, v6, v6, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 995
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/q;->b:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 978
    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v1, v2

    goto :goto_7

    .line 973
    :catch_3
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_6

    .line 968
    :catch_5
    move-exception v0

    goto/16 :goto_5

    :catch_6
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto/16 :goto_5

    .line 962
    :catch_7
    move-exception v0

    move-object v2, v1

    goto/16 :goto_4

    :catch_8
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto/16 :goto_4

    :cond_7
    move-object v0, v1

    move-object v1, v3

    goto/16 :goto_2
.end method
