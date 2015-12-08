.class final Lkik/android/f/a/q;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Ljava/lang/String;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 638
    iput-object p1, p0, Lkik/android/f/a/q;->c:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/q;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 4

    .prologue
    .line 642
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 644
    :try_start_0
    new-instance v1, Lorg/apache/http/client/methods/HttpHead;

    iget-object v2, p0, Lkik/android/f/a/q;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/apache/http/client/methods/HttpHead;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 645
    const-string v1, "content-length"

    invoke-interface {v0, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 646
    if-eqz v0, :cond_0

    .line 647
    iget-object v1, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 666
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 651
    :cond_0
    iget-object v0, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    .line 654
    :catch_0
    move-exception v0

    .line 655
    iget-object v1, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 657
    :catch_1
    move-exception v0

    .line 658
    iget-object v1, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 660
    :catch_2
    move-exception v0

    .line 661
    iget-object v1, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 663
    :catch_3
    move-exception v0

    .line 664
    iget-object v1, p0, Lkik/android/f/a/q;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 638
    invoke-direct {p0}, Lkik/android/f/a/q;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
