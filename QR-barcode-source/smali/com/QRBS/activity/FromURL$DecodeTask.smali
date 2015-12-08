.class Lcom/QRBS/activity/FromURL$DecodeTask;
.super Landroid/os/AsyncTask;
.source "FromURL.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/FromURL;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DecodeTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/FromURL;


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/FromURL;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/FromURL;Lcom/QRBS/activity/FromURL$DecodeTask;)V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/QRBS/activity/FromURL$DecodeTask;-><init>(Lcom/QRBS/activity/FromURL;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/FromURL$DecodeTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 122
    iget-object v4, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    iget-object v5, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->editUrl:Landroid/widget/EditText;
    invoke-static {v5}, Lcom/QRBS/activity/FromURL;->access$0(Lcom/QRBS/activity/FromURL;)Landroid/widget/EditText;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/FromURL;->getCorrectUrl(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v2

    .line 127
    .local v2, "s":Ljava/lang/String;
    :try_start_0
    iget-object v4, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;
    invoke-static {v4}, Lcom/QRBS/activity/FromURL;->access$1(Lcom/QRBS/activity/FromURL;)Lcom/scannerfire/utils/Utils;

    move-result-object v4

    iget-object v5, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v5}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/scannerfire/utils/Utils;->checkConnectivity(Landroid/app/Activity;)Z
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    if-nez v4, :cond_0

    .line 129
    const-string v4, "noConn"

    .line 151
    :goto_0
    return-object v4

    .line 132
    :cond_0
    :try_start_1
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    const-string v5, "Content-Type"

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    .line 142
    .local v3, "s1":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 144
    const-string v4, "noImage"

    goto :goto_0

    .line 134
    .end local v3    # "s1":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 136
    .local v1, "malformedurlexception":Ljava/net/MalformedURLException;
    const-string v4, "problem"

    goto :goto_0

    .line 138
    .end local v1    # "malformedurlexception":Ljava/net/MalformedURLException;
    :catch_1
    move-exception v0

    .line 140
    .local v0, "ioexception":Ljava/io/IOException;
    const-string v4, "problem"

    goto :goto_0

    .line 146
    .end local v0    # "ioexception":Ljava/io/IOException;
    .restart local v3    # "s1":Ljava/lang/String;
    :cond_1
    const-string v4, "image/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 148
    const-string v4, "noImage"

    goto :goto_0

    .line 150
    :cond_2
    iget-object v4, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    invoke-virtual {v4, v2}, Lcom/QRBS/activity/FromURL;->getBitmapFromURL(Ljava/lang/String;)Landroid/net/Uri;

    .line 151
    const-string v4, "OK"

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/FromURL$DecodeTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    const/16 v2, 0x7e8

    .line 156
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$1(Lcom/QRBS/activity/FromURL;)Lcom/scannerfire/utils/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scannerfire/utils/Utils;->clearScreen()V

    .line 157
    const-string v0, "OK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 159
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->qrImage:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$3(Lcom/QRBS/activity/FromURL;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;
    invoke-static {v1}, Lcom/QRBS/activity/FromURL;->access$4(Lcom/QRBS/activity/FromURL;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 160
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$4(Lcom/QRBS/activity/FromURL;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-gt v0, v2, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$4(Lcom/QRBS/activity/FromURL;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-le v0, v2, :cond_1

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    const v2, 0x7f08010e

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;
    invoke-static {v1}, Lcom/QRBS/activity/FromURL;->access$4(Lcom/QRBS/activity/FromURL;)Landroid/graphics/Bitmap;

    move-result-object v1

    # invokes: Lcom/QRBS/activity/FromURL;->decodeBitmap(Landroid/graphics/Bitmap;)V
    invoke-static {v0, v1}, Lcom/QRBS/activity/FromURL;->access$5(Lcom/QRBS/activity/FromURL;Landroid/graphics/Bitmap;)V

    .line 181
    :cond_2
    :goto_0
    return-void

    .line 165
    :cond_3
    const-string v0, "noImage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 167
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    const v2, 0x7f08010f

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_4
    const-string v0, "noConn"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 172
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    const v2, 0x7f0800ff

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_5
    const-string v0, "problem"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    iget-object v0, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v0}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/FromURL$DecodeTask;->this$0:Lcom/QRBS/activity/FromURL;

    const v2, 0x7f080110

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method
