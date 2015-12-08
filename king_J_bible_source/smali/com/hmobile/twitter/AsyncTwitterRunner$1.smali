.class Lcom/hmobile/twitter/AsyncTwitterRunner$1;
.super Ljava/lang/Thread;
.source "AsyncTwitterRunner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/twitter/AsyncTwitterRunner;->logout(Landroid/content/Context;Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/twitter/AsyncTwitterRunner;

.field private final synthetic val$context:Landroid/content/Context;

.field private final synthetic val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;


# direct methods
.method constructor <init>(Lcom/hmobile/twitter/AsyncTwitterRunner;Landroid/content/Context;Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->this$0:Lcom/hmobile/twitter/AsyncTwitterRunner;

    iput-object p2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    .line 71
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 75
    :try_start_0
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->this$0:Lcom/hmobile/twitter/AsyncTwitterRunner;

    iget-object v2, v2, Lcom/hmobile/twitter/AsyncTwitterRunner;->tw:Lcom/hmobile/twitter/Twitter;

    iget-object v3, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/hmobile/twitter/Twitter;->logout(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 76
    .local v1, "response":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "false"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 77
    :cond_0
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    new-instance v3, Lcom/hmobile/twitter/TwitterError;

    .line 78
    const-string v4, "auth.expireSession failed"

    invoke-direct {v3, v4}, Lcom/hmobile/twitter/TwitterError;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-interface {v2, v3}, Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;->onTwitterError(Lcom/hmobile/twitter/TwitterError;)V

    .line 89
    .end local v1    # "response":Ljava/lang/String;
    :goto_0
    return-void

    .line 81
    .restart local v1    # "response":Ljava/lang/String;
    :cond_1
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    invoke-interface {v2, v1}, Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;->onComplete(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 82
    .end local v1    # "response":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 83
    .local v0, "e":Ljava/io/FileNotFoundException;
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    invoke-interface {v2, v0}, Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;)V

    goto :goto_0

    .line 84
    .end local v0    # "e":Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v0

    .line 85
    .local v0, "e":Ljava/net/MalformedURLException;
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    invoke-interface {v2, v0}, Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;)V

    goto :goto_0

    .line 86
    .end local v0    # "e":Ljava/net/MalformedURLException;
    :catch_2
    move-exception v0

    .line 87
    .local v0, "e":Ljava/io/IOException;
    iget-object v2, p0, Lcom/hmobile/twitter/AsyncTwitterRunner$1;->val$listener:Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;

    invoke-interface {v2, v0}, Lcom/hmobile/twitter/AsyncTwitterRunner$RequestListener;->onIOException(Ljava/io/IOException;)V

    goto :goto_0
.end method
