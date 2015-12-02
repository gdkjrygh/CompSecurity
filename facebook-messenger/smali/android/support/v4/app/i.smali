.class public Landroid/support/v4/app/i;
.super Landroid/app/Activity;
.source "FragmentActivity.java"


# instance fields
.field final a:Landroid/os/Handler;

.field final b:Landroid/support/v4/app/s;

.field c:Landroid/support/v4/app/s;

.field final d:Landroid/support/v4/app/o;

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v4/app/ai;",
            ">;"
        }
    .end annotation
.end field

.field n:Landroid/support/v4/app/ai;

.field o:Landroid/support/v4/app/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 70
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 81
    new-instance v0, Landroid/support/v4/app/j;

    invoke-direct {v0, p0}, Landroid/support/v4/app/j;-><init>(Landroid/support/v4/app/i;)V

    iput-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    .line 100
    new-instance v0, Landroid/support/v4/app/s;

    invoke-direct {v0}, Landroid/support/v4/app/s;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/i;->c:Landroid/support/v4/app/s;

    .line 102
    new-instance v0, Landroid/support/v4/app/k;

    invoke-direct {v0, p0}, Landroid/support/v4/app/k;-><init>(Landroid/support/v4/app/i;)V

    iput-object v0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/o;

    .line 131
    return-void
.end method

.method private static a(Landroid/view/View;)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v3, 0x56

    const/16 v1, 0x46

    const/16 v6, 0x2c

    const/16 v5, 0x20

    const/16 v2, 0x2e

    .line 690
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 691
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    const/16 v0, 0x7b

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 693
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 695
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 699
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 701
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 702
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x45

    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 703
    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 704
    invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x48

    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 705
    invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v3

    :goto_5
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 706
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x43

    :goto_6
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 707
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4c

    :goto_7
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 708
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 709
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_8
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 710
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v0, 0x53

    :goto_9
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 711
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v2, 0x50

    :cond_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 712
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 713
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 714
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 715
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 716
    const/16 v0, 0x2d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 717
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 718
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 719
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 720
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    .line 721
    const/4 v0, -0x1

    if-eq v1, v0, :cond_1

    .line 722
    const-string v0, " #"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 725
    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 728
    const/high16 v0, -0x1000000

    and-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1

    .line 736
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v0

    .line 739
    :goto_a
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 740
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    .line 741
    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 751
    :cond_1
    :goto_b
    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 696
    :sswitch_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 697
    :sswitch_1
    const/16 v0, 0x49

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 698
    :sswitch_2
    const/16 v0, 0x47

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 701
    goto/16 :goto_1

    :cond_3
    move v0, v2

    .line 702
    goto/16 :goto_2

    .line 703
    :cond_4
    const/16 v0, 0x44

    goto/16 :goto_3

    :cond_5
    move v0, v2

    .line 704
    goto/16 :goto_4

    :cond_6
    move v0, v2

    .line 705
    goto/16 :goto_5

    :cond_7
    move v0, v2

    .line 706
    goto/16 :goto_6

    :cond_8
    move v0, v2

    .line 707
    goto/16 :goto_7

    :cond_9
    move v1, v2

    .line 709
    goto/16 :goto_8

    :cond_a
    move v0, v2

    .line 710
    goto/16 :goto_9

    .line 730
    :sswitch_3
    :try_start_1
    const-string v0, "app"

    goto :goto_a

    .line 733
    :sswitch_4
    const-string v0, "android"
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    .line 747
    :catch_0
    move-exception v0

    goto :goto_b

    .line 695
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_2
    .end sparse-switch

    .line 728
    :sswitch_data_1
    .sparse-switch
        0x1000000 -> :sswitch_4
        0x7f000000 -> :sswitch_3
    .end sparse-switch
.end method

.method private a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 756
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 757
    if-nez p3, :cond_1

    .line 758
    const-string v0, "null"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 774
    :cond_0
    return-void

    .line 761
    :cond_1
    invoke-static {p3}, Landroid/support/v4/app/i;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 762
    instance-of v0, p3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 765
    check-cast p3, Landroid/view/ViewGroup;

    .line 766
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 767
    if-lez v1, :cond_0

    .line 770
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 771
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 772
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, v2, p2, v3}, Landroid/support/v4/app/i;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 771
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private h()Landroid/support/v4/app/p;
    .locals 1

    .prologue
    .line 916
    iget-object v0, p0, Landroid/support/v4/app/i;->o:Landroid/support/v4/app/n;

    if-nez v0, :cond_0

    .line 917
    new-instance v0, Landroid/support/v4/app/n;

    invoke-direct {v0, p0}, Landroid/support/v4/app/n;-><init>(Landroid/support/v4/app/i;)V

    iput-object v0, p0, Landroid/support/v4/app/i;->o:Landroid/support/v4/app/n;

    .line 920
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/i;->o:Landroid/support/v4/app/n;

    return-object v0
.end method


# virtual methods
.method a(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 879
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->c(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;
    .locals 2

    .prologue
    .line 899
    iget-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 900
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    .line 902
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/ai;

    .line 903
    if-nez v0, :cond_2

    .line 904
    if-eqz p3, :cond_1

    .line 905
    new-instance v0, Landroid/support/v4/app/ai;

    invoke-direct {p0}, Landroid/support/v4/app/i;->h()Landroid/support/v4/app/p;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Landroid/support/v4/app/ai;-><init>(Ljava/lang/String;Landroid/support/v4/app/p;Z)V

    .line 906
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    :cond_1
    :goto_0
    return-object v0

    .line 909
    :cond_2
    invoke-direct {p0}, Landroid/support/v4/app/i;->h()Landroid/support/v4/app/p;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ai;->a(Landroid/support/v4/app/p;)V

    goto :goto_0
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 815
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    .locals 2

    .prologue
    const/4 v0, -0x1

    const/high16 v1, -0x10000

    .line 842
    if-ne p3, v0, :cond_0

    .line 843
    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 854
    :goto_0
    return-void

    .line 846
    :cond_0
    and-int v0, p3, v1

    if-eqz v0, :cond_1

    .line 847
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for requestCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 849
    :cond_1
    invoke-virtual {p0, p1}, Landroid/support/v4/app/i;->b(Landroid/support/v4/app/Fragment;)I

    move-result v0

    .line 850
    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 851
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for fragment ID"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 853
    :cond_2
    shl-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    and-int/2addr v1, p3

    add-int/2addr v0, v1

    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public a(Landroid/support/v4/app/q;)V
    .locals 0

    .prologue
    .line 144
    check-cast p1, Landroid/support/v4/app/s;

    iput-object p1, p0, Landroid/support/v4/app/i;->c:Landroid/support/v4/app/s;

    .line 145
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 858
    iget-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 859
    iget-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/ai;

    .line 860
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/app/ai;->g:Z

    if-nez v1, :cond_0

    .line 861
    invoke-virtual {v0}, Landroid/support/v4/app/ai;->h()V

    .line 862
    iget-object v0, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    :cond_0
    return-void
.end method

.method a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 777
    iget-boolean v0, p0, Landroid/support/v4/app/i;->h:Z

    if-nez v0, :cond_0

    .line 778
    iput-boolean v1, p0, Landroid/support/v4/app/i;->h:Z

    .line 779
    iput-boolean p1, p0, Landroid/support/v4/app/i;->i:Z

    .line 780
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 781
    invoke-virtual {p0}, Landroid/support/v4/app/i;->e()V

    .line 783
    :cond_0
    return-void
.end method

.method b(Landroid/support/v4/app/Fragment;)I
    .locals 2

    .prologue
    .line 873
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/s;->b(I)I

    .line 874
    iget v0, p1, Landroid/support/v4/app/Fragment;->p:I

    return v0
.end method

.method protected b()V
    .locals 1

    .prologue
    .line 472
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->p()V

    .line 473
    return-void
.end method

.method public b_()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Landroid/support/v4/app/i;->c:Landroid/support/v4/app/s;

    return-object v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 640
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 643
    invoke-static {p0}, Landroid/support/v4/app/a;->a(Landroid/app/Activity;)V

    .line 650
    :goto_0
    return-void

    .line 649
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/i;->j:Z

    goto :goto_0
.end method

.method public d_()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 621
    const/4 v0, 0x0

    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 663
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 667
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 668
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 669
    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 670
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 671
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 672
    iget-boolean v1, p0, Landroid/support/v4/app/i;->e:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, "mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 673
    iget-boolean v1, p0, Landroid/support/v4/app/i;->f:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 674
    iget-boolean v1, p0, Landroid/support/v4/app/i;->g:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mReallyStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 675
    iget-boolean v1, p0, Landroid/support/v4/app/i;->h:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 676
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoadersStarted="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 677
    iget-boolean v0, p0, Landroid/support/v4/app/i;->l:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 678
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_1

    .line 679
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 680
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 681
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 682
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/ai;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 684
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/app/s;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 685
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "View Hierarchy:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 686
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v4/app/i;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v0, p3, v1}, Landroid/support/v4/app/i;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 687
    return-void
.end method

.method e()V
    .locals 1

    .prologue
    .line 793
    iget-boolean v0, p0, Landroid/support/v4/app/i;->l:Z

    if-eqz v0, :cond_0

    .line 794
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/i;->l:Z

    .line 795
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_0

    .line 796
    iget-boolean v0, p0, Landroid/support/v4/app/i;->i:Z

    if-nez v0, :cond_1

    .line 797
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->c()V

    .line 804
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->s()V

    .line 805
    return-void

    .line 799
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->d()V

    goto :goto_0
.end method

.method public f()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 822
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    return-object v0
.end method

.method public g()Landroid/support/v4/app/ag;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 890
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_0

    .line 891
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    .line 895
    :goto_0
    return-object v0

    .line 893
    :cond_0
    iput-boolean v2, p0, Landroid/support/v4/app/i;->k:Z

    .line 894
    const/4 v0, 0x0

    iget-boolean v1, p0, Landroid/support/v4/app/i;->l:Z

    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/i;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    .line 895
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 160
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 161
    shr-int/lit8 v0, p1, 0x10

    .line 162
    if-eqz v0, :cond_2

    .line 163
    if-gez v0, :cond_0

    .line 164
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Activity result fragment index out of range: 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    :goto_0
    return-void

    .line 168
    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/v4/app/i;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 169
    if-nez v0, :cond_1

    .line 170
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Activity result no fragment exists for index: 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 173
    :cond_1
    const v1, 0xffff

    and-int/2addr v1, p1

    invoke-virtual {v0, v1, p2, p3}, Landroid/support/v4/app/Fragment;->a(IILandroid/content/Intent;)V

    goto :goto_0

    .line 178
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    invoke-virtual {p0}, Landroid/support/v4/app/i;->finish()V

    .line 189
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 196
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 197
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->a(Landroid/content/res/Configuration;)V

    .line 198
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 205
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-direct {p0}, Landroid/support/v4/app/i;->h()Landroid/support/v4/app/p;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/o;

    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/p;Landroid/support/v4/app/o;Landroid/support/v4/app/Fragment;)V

    .line 207
    invoke-virtual {p0}, Landroid/support/v4/app/i;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 208
    invoke-virtual {p0}, Landroid/support/v4/app/i;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 211
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 213
    invoke-virtual {p0}, Landroid/support/v4/app/i;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/m;

    .line 215
    if-eqz v0, :cond_1

    .line 216
    iget-object v2, v0, Landroid/support/v4/app/m;->e:Ljava/util/HashMap;

    iput-object v2, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    .line 218
    :cond_1
    if-eqz p1, :cond_2

    .line 219
    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    .line 220
    iget-object v3, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroid/support/v4/app/m;->d:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v3, v2, v0}, Landroid/support/v4/app/s;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 222
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->m()V

    .line 223
    return-void

    :cond_3
    move-object v0, v1

    .line 220
    goto :goto_0
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 3

    .prologue
    .line 230
    if-nez p1, :cond_1

    .line 231
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 232
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {p0}, Landroid/support/v4/app/i;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/s;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 233
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 241
    :goto_0
    return v0

    .line 239
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 241
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v9, 0x1

    const/4 v6, -0x1

    .line 249
    const-string v0, "fragment"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 329
    :goto_0
    return-object v0

    .line 253
    :cond_0
    const-string v0, "class"

    invoke-interface {p3, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 254
    sget-object v2, Landroid/support/v4/app/l;->a:[I

    invoke-virtual {p2, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 255
    if-nez v0, :cond_1

    .line 256
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 258
    :cond_1
    invoke-virtual {v3, v9, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 259
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 260
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 263
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v3

    .line 264
    :goto_1
    if-ne v3, v6, :cond_3

    if-ne v2, v6, :cond_3

    if-nez v7, :cond_3

    .line 265
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    move v3, v6

    .line 263
    goto :goto_1

    .line 274
    :cond_3
    iget-object v4, p0, Landroid/support/v4/app/i;->c:Landroid/support/v4/app/s;

    if-eqz v4, :cond_8

    iget-object v4, p0, Landroid/support/v4/app/i;->c:Landroid/support/v4/app/s;

    move-object v5, v4

    .line 277
    :goto_2
    if-eq v2, v6, :cond_4

    invoke-virtual {v5, v2}, Landroid/support/v4/app/s;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 278
    :cond_4
    if-nez v1, :cond_5

    if-eqz v7, :cond_5

    .line 279
    invoke-virtual {v5, v7}, Landroid/support/v4/app/s;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 281
    :cond_5
    if-nez v1, :cond_6

    if-eq v3, v6, :cond_6

    .line 282
    invoke-virtual {v5, v3}, Landroid/support/v4/app/s;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 285
    :cond_6
    sget-boolean v4, Landroid/support/v4/app/s;->a:Z

    if-eqz v4, :cond_7

    const-string v4, "FragmentActivity"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "onCreateView: id=0x"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " fname="

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " existing="

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 288
    :cond_7
    if-nez v1, :cond_a

    .line 289
    invoke-static {p0, v0}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 290
    iput-boolean v9, v4, Landroid/support/v4/app/Fragment;->y:Z

    .line 291
    if-eqz v2, :cond_9

    move v1, v2

    :goto_3
    iput v1, v4, Landroid/support/v4/app/Fragment;->G:I

    .line 292
    iput v3, v4, Landroid/support/v4/app/Fragment;->H:I

    .line 293
    iput-object v7, v4, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    .line 294
    iput-boolean v9, v4, Landroid/support/v4/app/Fragment;->z:Z

    .line 295
    iput-object v5, v4, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    .line 296
    iget-object v1, v4, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {v4, p0, p3, v1}, Landroid/support/v4/app/Fragment;->a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 297
    invoke-virtual {v5, v4, v9}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;Z)V

    move-object v1, v4

    .line 319
    :goto_4
    iget-object v3, v1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-nez v3, :cond_d

    .line 320
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " did not create a view."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 274
    :cond_8
    iget-object v4, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    move-object v5, v4

    goto/16 :goto_2

    :cond_9
    move v1, v3

    .line 291
    goto :goto_3

    .line 299
    :cond_a
    iget-boolean v4, v1, Landroid/support/v4/app/Fragment;->z:Z

    if-eqz v4, :cond_b

    .line 302
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": Duplicate id 0x"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ", tag "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ", or parent id 0x"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " with another fragment for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 309
    :cond_b
    iput-boolean v9, v1, Landroid/support/v4/app/Fragment;->z:Z

    .line 313
    iget-boolean v3, v1, Landroid/support/v4/app/Fragment;->M:Z

    if-nez v3, :cond_c

    .line 314
    iget-object v3, v1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {v1, p0, p3, v3}, Landroid/support/v4/app/Fragment;->a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 316
    :cond_c
    invoke-virtual {v5, v1}, Landroid/support/v4/app/s;->b(Landroid/support/v4/app/Fragment;)V

    goto/16 :goto_4

    .line 323
    :cond_d
    if-eqz v2, :cond_e

    .line 324
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 326
    :cond_e
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_f

    .line 327
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 329
    :cond_f
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 337
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 339
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v4/app/i;->a(Z)V

    .line 341
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->u()V

    .line 342
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->h()V

    .line 345
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 352
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 357
    invoke-virtual {p0}, Landroid/support/v4/app/i;->onBackPressed()V

    .line 358
    const/4 v0, 0x1

    .line 361
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 369
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 370
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->v()V

    .line 371
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 378
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    const/4 v0, 0x1

    .line 390
    :goto_0
    return v0

    .line 382
    :cond_0
    sparse-switch p1, :sswitch_data_0

    .line 390
    const/4 v0, 0x0

    goto :goto_0

    .line 384
    :sswitch_0
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/s;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 387
    :sswitch_1
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/s;->b(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 382
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 433
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 434
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 435
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .prologue
    .line 399
    packed-switch p1, :pswitch_data_0

    .line 404
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 405
    return-void

    .line 401
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/s;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 399
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 412
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 413
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/i;->f:Z

    .line 414
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 416
    invoke-virtual {p0}, Landroid/support/v4/app/i;->b()V

    .line 418
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->q()V

    .line 419
    return-void
.end method

.method protected onPostResume()V
    .locals 2

    .prologue
    .line 459
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 460
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 461
    invoke-virtual {p0}, Landroid/support/v4/app/i;->b()V

    .line 462
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 463
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 480
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    .line 481
    iget-boolean v1, p0, Landroid/support/v4/app/i;->j:Z

    if-eqz v1, :cond_0

    .line 482
    iput-boolean v0, p0, Landroid/support/v4/app/i;->j:Z

    .line 483
    invoke-interface {p3}, Landroid/view/Menu;->clear()V

    .line 484
    invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/i;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 486
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    .line 487
    iget-object v2, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v2, p3}, Landroid/support/v4/app/s;->a(Landroid/view/Menu;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 488
    if-eqz v1, :cond_1

    invoke-interface {p3}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    .line 490
    :cond_1
    :goto_0
    return v0

    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 448
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 449
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 450
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/i;->f:Z

    .line 451
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 452
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 500
    iget-boolean v1, p0, Landroid/support/v4/app/i;->g:Z

    if-eqz v1, :cond_0

    .line 501
    invoke-virtual {p0, v2}, Landroid/support/v4/app/i;->a(Z)V

    .line 504
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/app/i;->d_()Ljava/lang/Object;

    move-result-object v4

    .line 506
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v1}, Landroid/support/v4/app/s;->j()Ljava/util/ArrayList;

    move-result-object v5

    .line 508
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    if-eqz v1, :cond_3

    .line 511
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    new-array v6, v1, [Landroid/support/v4/app/ai;

    .line 512
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 513
    if-eqz v6, :cond_3

    move v1, v0

    .line 514
    :goto_0
    array-length v7, v6

    if-ge v0, v7, :cond_2

    .line 515
    aget-object v7, v6, v0

    .line 516
    iget-boolean v8, v7, Landroid/support/v4/app/ai;->g:Z

    if-eqz v8, :cond_1

    move v1, v2

    .line 514
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 519
    :cond_1
    invoke-virtual {v7}, Landroid/support/v4/app/ai;->h()V

    .line 520
    iget-object v8, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    iget-object v7, v7, Landroid/support/v4/app/ai;->d:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    move v0, v1

    .line 525
    :cond_3
    if-nez v5, :cond_4

    if-nez v0, :cond_4

    if-nez v4, :cond_4

    move-object v0, v3

    .line 535
    :goto_2
    return-object v0

    .line 529
    :cond_4
    new-instance v0, Landroid/support/v4/app/m;

    invoke-direct {v0}, Landroid/support/v4/app/m;-><init>()V

    .line 530
    iput-object v3, v0, Landroid/support/v4/app/m;->a:Ljava/lang/Object;

    .line 531
    iput-object v4, v0, Landroid/support/v4/app/m;->b:Ljava/lang/Object;

    .line 532
    iput-object v3, v0, Landroid/support/v4/app/m;->c:Ljava/util/HashMap;

    .line 533
    iput-object v5, v0, Landroid/support/v4/app/m;->d:Ljava/util/ArrayList;

    .line 534
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    iput-object v1, v0, Landroid/support/v4/app/m;->e:Ljava/util/HashMap;

    goto :goto_2
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 543
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 544
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->k()Landroid/os/Parcelable;

    move-result-object v0

    .line 545
    if-eqz v0, :cond_0

    .line 546
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 548
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v0, 0x0

    .line 556
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 558
    iput-boolean v0, p0, Landroid/support/v4/app/i;->g:Z

    .line 559
    iput-boolean v0, p0, Landroid/support/v4/app/i;->h:Z

    .line 560
    iget-object v1, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 562
    iget-boolean v1, p0, Landroid/support/v4/app/i;->e:Z

    if-nez v1, :cond_0

    .line 563
    iput-boolean v3, p0, Landroid/support/v4/app/i;->e:Z

    .line 564
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v1}, Landroid/support/v4/app/s;->n()V

    .line 567
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v1}, Landroid/support/v4/app/s;->l()V

    .line 568
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v1}, Landroid/support/v4/app/s;->h()Z

    .line 570
    iget-boolean v1, p0, Landroid/support/v4/app/i;->l:Z

    if-nez v1, :cond_2

    .line 571
    iput-boolean v3, p0, Landroid/support/v4/app/i;->l:Z

    .line 572
    iget-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v1, :cond_3

    .line 573
    iget-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-virtual {v1}, Landroid/support/v4/app/ai;->b()V

    .line 581
    :cond_1
    :goto_0
    iput-boolean v3, p0, Landroid/support/v4/app/i;->k:Z

    .line 585
    :cond_2
    iget-object v1, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v1}, Landroid/support/v4/app/s;->o()V

    .line 586
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    if-eqz v1, :cond_4

    .line 587
    iget-object v1, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    new-array v1, v1, [Landroid/support/v4/app/ai;

    .line 588
    iget-object v2, p0, Landroid/support/v4/app/i;->m:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 589
    if-eqz v1, :cond_4

    .line 590
    :goto_1
    array-length v2, v1

    if-ge v0, v2, :cond_4

    .line 591
    aget-object v2, v1, v0

    .line 592
    invoke-virtual {v2}, Landroid/support/v4/app/ai;->e()V

    .line 593
    invoke-virtual {v2}, Landroid/support/v4/app/ai;->g()V

    .line 590
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 574
    :cond_3
    iget-boolean v1, p0, Landroid/support/v4/app/i;->k:Z

    if-nez v1, :cond_1

    .line 575
    const/4 v1, 0x0

    iget-boolean v2, p0, Landroid/support/v4/app/i;->l:Z

    invoke-virtual {p0, v1, v2, v0}, Landroid/support/v4/app/i;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    .line 577
    iget-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    iget-boolean v1, v1, Landroid/support/v4/app/ai;->f:Z

    if-nez v1, :cond_1

    .line 578
    iget-object v1, p0, Landroid/support/v4/app/i;->n:Landroid/support/v4/app/ai;

    invoke-virtual {v1}, Landroid/support/v4/app/ai;->b()V

    goto :goto_0

    .line 597
    :cond_4
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 604
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 606
    iput-boolean v1, p0, Landroid/support/v4/app/i;->g:Z

    .line 607
    iget-object v0, p0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 609
    iget-object v0, p0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->r()V

    .line 610
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 2

    .prologue
    .line 831
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/high16 v0, -0x10000

    and-int/2addr v0, p2

    if-eqz v0, :cond_0

    .line 832
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for requestCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 834
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 835
    return-void
.end method
