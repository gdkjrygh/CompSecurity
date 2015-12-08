.class final Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;
.super Landroid/os/AsyncTask;
.source "UrlImageViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;JLcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$completion:Ljava/lang/Runnable;

.field final synthetic val$filename:Ljava/lang/String;

.field final synthetic val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;


# direct methods
.method constructor <init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 645
    iput-object p1, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iput-object p2, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$filename:Ljava/lang/String;

    iput-object p3, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$completion:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 645
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    const/4 v2, 0x0

    .line 648
    iget-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$loader:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;

    iget-object v1, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$filename:Ljava/lang/String;

    invoke-virtual {v0, v2, v2, v1}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;->onDownloadComplete(Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;Ljava/io/InputStream;Ljava/lang/String;)V

    .line 649
    return-object v2
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 645
    check-cast p1, Ljava/lang/Void;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 653
    iget-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$3;->val$completion:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 654
    return-void
.end method
