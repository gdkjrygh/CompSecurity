.class Lcom/hmobile/biblekjv/HolyBibleApplication$getAllLikeShareData;
.super Landroid/os/AsyncTask;
.source "HolyBibleApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/HolyBibleApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "getAllLikeShareData"
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
.field final synthetic this$0:Lcom/hmobile/biblekjv/HolyBibleApplication;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/HolyBibleApplication;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/hmobile/biblekjv/HolyBibleApplication$getAllLikeShareData;->this$0:Lcom/hmobile/biblekjv/HolyBibleApplication;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/HolyBibleApplication$getAllLikeShareData;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1
    .param p1, "arg0"    # [Ljava/lang/Void;

    .prologue
    .line 217
    const/4 v0, 0x0

    return-object v0
.end method
