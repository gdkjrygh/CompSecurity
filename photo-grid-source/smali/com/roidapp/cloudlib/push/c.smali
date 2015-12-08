.class final Lcom/roidapp/cloudlib/push/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/roidapp/cloudlib/push/c;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 140
    const/4 v0, 0x0

    .line 143
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/push/c;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/gcm/a;->a(Landroid/content/Context;)Lcom/google/android/gms/gcm/a;

    move-result-object v1

    .line 145
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "140769328112"

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/gcm/a;->a([Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 152
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 153
    iget-object v1, p0, Lcom/roidapp/cloudlib/push/c;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/push/a;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 154
    iget-object v1, p0, Lcom/roidapp/cloudlib/push/c;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/push/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 156
    :cond_0
    return-void

    .line 148
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 150
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/SecurityException;->printStackTrace()V

    goto :goto_0
.end method
