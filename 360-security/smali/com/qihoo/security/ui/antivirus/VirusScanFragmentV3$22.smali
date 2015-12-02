.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/widget/RadarProgressBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)V
    .locals 0

    .prologue
    .line 2560
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    const v4, 0x7f0c0134

    const v3, 0x7f0c0132

    const v2, 0x7f0c0131

    .line 2577
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->a:I

    packed-switch v0, :pswitch_data_0

    .line 2618
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ac(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2619
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 2620
    const/4 v1, 0x5

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2621
    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->a:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 2622
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2624
    :cond_0
    return-void

    .line 2579
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v2, 0x7f0c0135

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 2584
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v2, 0x7f0c0136

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 2589
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v2, 0x7f0c0133

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 2594
    :pswitch_3
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 2599
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 2604
    :pswitch_5
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 2609
    :pswitch_6
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 2577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public a(F)V
    .locals 4

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    .line 2564
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    mul-float v2, p1, v3

    float-to-int v2, v2

    div-int/lit16 v2, v2, 0x168

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 2565
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    mul-float v1, p1, v3

    float-to-int v1, v1

    div-int/lit16 v1, v1, 0x168

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 2566
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    const/16 v1, 0x62

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2567
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;J)J

    .line 2569
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[F

    move-result-object v1

    const/4 v2, 0x4

    aget v1, v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 2570
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0137

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;

    .line 2572
    :cond_1
    return-void
.end method
