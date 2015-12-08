.class final Lcom/roidapp/cloudlib/upload/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;Ljava/lang/String;Landroid/widget/ImageView;Z)V
    .locals 1

    .prologue
    .line 240
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/m;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    const/16 v0, 0xf0

    iput v0, p0, Lcom/roidapp/cloudlib/upload/m;->e:I

    .line 241
    iput-object p2, p0, Lcom/roidapp/cloudlib/upload/m;->b:Ljava/lang/String;

    .line 242
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/upload/m;->c:Z

    .line 243
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/m;->d:Ljava/lang/ref/WeakReference;

    .line 244
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/upload/m;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/m;->d:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 250
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/upload/m;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/m;->b:Ljava/lang/String;

    const/16 v1, 0xf0

    const/16 v2, 0xf0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 253
    :goto_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/m;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->c:Landroid/os/Handler;

    new-instance v2, Lcom/roidapp/cloudlib/upload/n;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/cloudlib/upload/n;-><init>(Lcom/roidapp/cloudlib/upload/m;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 271
    :goto_1
    return-void

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/m;->b:Ljava/lang/String;

    const/16 v1, 0xf0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/c;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 266
    :catch_0
    move-exception v0

    .line 267
    const-string v1, "UploadManagerActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "decode "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/cloudlib/upload/m;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " as thumbnail meet OOM."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/m;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/upload/c;->g()V

    .line 269
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1
.end method
