.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;)V
    .locals 0

    .prologue
    .line 582
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v5, 0x0

    .line 586
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 654
    :cond_0
    :goto_0
    return-void

    .line 589
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v0

    if-ne v0, v9, :cond_0

    .line 592
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;->start()V

    .line 600
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 601
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v1, v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v1

    .line 602
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v2, v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v2

    .line 604
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v3, v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3, v5}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 605
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v3, v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarView;

    move-result-object v3

    new-instance v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$2;

    invoke-direct {v4, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$2;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;)V

    const-wide/16 v6, 0xa

    invoke-virtual {v3, v4, v6, v7}, Lcom/qihoo/security/malware/widget/RadarView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 612
    const/16 v3, 0x36b6

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v4, v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v4

    invoke-static {v3, v4}, Lcom/qihoo/security/support/b;->b(II)V

    .line 615
    aget v3, v0, v10

    if-lez v3, :cond_3

    .line 618
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v3, v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v3

    .line 619
    aget v3, v3, v8

    if-lez v3, :cond_2

    .line 620
    const/16 v3, 0x36cd

    invoke-static {v3}, Lcom/qihoo/security/support/b;->c(I)V

    .line 624
    :cond_2
    const/16 v3, 0x36b7

    invoke-static {v3}, Lcom/qihoo/security/support/b;->c(I)V

    .line 626
    :cond_3
    const/16 v3, 0x36b9

    aget v4, v0, v10

    invoke-static {v3, v4}, Lcom/qihoo/security/support/b;->b(II)V

    .line 629
    aget v3, v0, v8

    if-lez v3, :cond_4

    .line 630
    const/16 v3, 0x36bb

    invoke-static {v3}, Lcom/qihoo/security/support/b;->c(I)V

    .line 632
    :cond_4
    const/16 v3, 0x36bd

    aget v4, v0, v8

    invoke-static {v3, v4}, Lcom/qihoo/security/support/b;->b(II)V

    .line 635
    aget v3, v1, v5

    if-lez v3, :cond_5

    .line 636
    const/16 v3, 0x36be

    invoke-static {v3}, Lcom/qihoo/security/support/b;->c(I)V

    .line 638
    :cond_5
    const/16 v3, 0x36c0

    aget v1, v1, v5

    invoke-static {v3, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 641
    if-lez v2, :cond_6

    .line 642
    const/16 v1, 0x36c1

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 646
    :cond_6
    aget v1, v0, v9

    if-lez v1, :cond_7

    .line 647
    const/16 v1, 0x36c5

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 648
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v1, v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 649
    const/16 v1, 0x36c8

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 652
    :cond_7
    const/16 v1, 0x36c7

    aget v0, v0, v9

    invoke-static {v1, v0}, Lcom/qihoo/security/support/b;->b(II)V

    goto/16 :goto_0
.end method
