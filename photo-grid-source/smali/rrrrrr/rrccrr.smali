.class public Lrrrrrr/rrccrr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "ValidateURL"

.field public static b044A044Aъ044A044A044A:I = 0x2

.field public static b044Aъъ044A044A044A:I = 0x18

.field public static bъ044Aъ044A044A044A:I = 0x1


# instance fields
.field private b:Ljava/net/URL;

.field public final synthetic b0425Х0425ХХ0425:Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lrrrrrr/rrccrr;->b0425Х0425ХХ0425:Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;

    :goto_0
    goto/32 :goto_0
.end method

.method private a(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lrrrrrr/rrccrr;->b0425Х0425ХХ0425:Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;

    invoke-static {v0, p1}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bллл043B043Bл(Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;I)I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static bъъ044A044A044A044A()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lrrrrrr/rrccrr;->b:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const-string v1, "HEAD"
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Lrrrrrr/rrccrr;->b044Aъъ044A044A044A:I

    sget v3, Lrrrrrr/rrccrr;->bъ044Aъ044A044A044A:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lrrrrrr/rrccrr;->b044A044Aъ044A044A044A:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    sput v4, Lrrrrrr/rrccrr;->b044Aъъ044A044A044A:I

    invoke-static {}, Lrrrrrr/rrccrr;->bъъ044A044A044A044A()I

    move-result v2

    sput v2, Lrrrrrr/rrccrr;->bъ044Aъ044A044A044A:I

    :pswitch_0
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    :try_start_2
    invoke-direct {p0, v0}, Lrrrrrr/rrccrr;->a(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :try_start_3
    const-string v1, "ValidateURL"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v0, 0x1f4

    :try_start_4
    invoke-direct {p0, v0}, Lrrrrrr/rrccrr;->a(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0

    :catchall_0
    move-exception v0

    const/16 v1, 0x1f4

    :try_start_5
    invoke-direct {p0, v1}, Lrrrrrr/rrccrr;->a(I)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_2
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
