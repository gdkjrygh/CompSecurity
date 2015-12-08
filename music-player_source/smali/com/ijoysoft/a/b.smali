.class final Lcom/ijoysoft/a/b;
.super Lcom/google/android/gms/ads/a;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Lcom/google/android/gms/ads/AdView;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/b;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/b;->b:Lcom/google/android/gms/ads/AdView;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/a;->a(I)V

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :goto_0
    iget-object v1, p0, Lcom/ijoysoft/a/b;->a:Lcom/ijoysoft/a/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "loadBannerAD:onAdFailedToLoad:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ijoysoft/a/a;->a(Lcom/ijoysoft/a/a;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "CODE_INTERNAL_ERROR"

    goto :goto_0

    :pswitch_1
    const-string v0, "CODE_INVALID_REQUEST"

    goto :goto_0

    :pswitch_2
    const-string v0, "CODE_NETWORK_ERROR"

    goto :goto_0

    :pswitch_3
    const-string v0, "CODE_NO_FILL"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/ijoysoft/a/b;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/b;->b:Lcom/google/android/gms/ads/AdView;

    invoke-static {v0, v1}, Lcom/ijoysoft/a/a;->a(Lcom/ijoysoft/a/a;Lcom/google/android/gms/ads/AdView;)V

    return-void
.end method
