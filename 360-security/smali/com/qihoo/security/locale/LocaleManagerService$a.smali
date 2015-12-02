.class final Lcom/qihoo/security/locale/LocaleManagerService$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/LocaleManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/LocaleManagerService;

.field private b:Z

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/locale/LocaleManagerService;)V
    .locals 0

    .prologue
    .line 739
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/locale/LocaleManagerService;Lcom/qihoo/security/locale/LocaleManagerService$1;)V
    .locals 0

    .prologue
    .line 739
    invoke-direct {p0, p1}, Lcom/qihoo/security/locale/LocaleManagerService$a;-><init>(Lcom/qihoo/security/locale/LocaleManagerService;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .prologue
    const/4 v2, 0x5

    const/4 v6, 0x0

    .line 758
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 912
    :goto_0
    return-void

    .line 760
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 761
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/locale/b;

    .line 762
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 765
    :try_start_0
    iget-boolean v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->c:Z

    iget-boolean v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->b:Z

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->f:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/locale/b;->a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 766
    invoke-interface {v0}, Lcom/qihoo/security/locale/b;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_8

    .line 769
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto :goto_0

    .line 774
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/locale/b;

    invoke-virtual {v1, v0}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    goto :goto_0

    .line 783
    :pswitch_2
    :try_start_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 784
    const/4 v1, 0x0

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->c:Z

    .line 785
    const/4 v1, 0x1

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->b:Z

    .line 786
    const/4 v1, 0x2

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->d:Ljava/lang/String;

    .line 787
    const/4 v1, 0x3

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->e:Ljava/lang/String;

    .line 788
    const/4 v1, 0x4

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->f:Ljava/lang/String;

    .line 789
    iget-boolean v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->c:Z

    iget-boolean v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->b:Z

    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 793
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 803
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v8

    move v7, v6

    .line 809
    :goto_2
    if-ge v7, v8, :cond_0

    .line 810
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    iget-boolean v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->c:Z

    iget-boolean v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->b:Z

    iget-object v3, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->f:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/locale/b;->a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 809
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    .line 813
    :catch_1
    move-exception v0

    .line 818
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 821
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    .line 823
    :goto_3
    if-ge v6, v1, :cond_1

    .line 824
    :try_start_3
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    invoke-interface {v0}, Lcom/qihoo/security/locale/b;->a()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 823
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 826
    :catch_2
    move-exception v0

    .line 831
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 836
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    .line 838
    :try_start_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 839
    :goto_4
    if-ge v6, v2, :cond_2

    .line 840
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/b;

    invoke-interface {v1, v0}, Lcom/qihoo/security/locale/b;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 839
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 842
    :catch_3
    move-exception v0

    .line 847
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 852
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    .line 854
    :goto_5
    if-ge v6, v1, :cond_3

    .line 855
    :try_start_5
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    invoke-interface {v0}, Lcom/qihoo/security/locale/b;->c()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_4

    .line 854
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 857
    :catch_4
    move-exception v0

    .line 862
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 867
    :pswitch_6
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v1

    .line 869
    :goto_6
    if-ge v6, v1, :cond_4

    .line 870
    :try_start_6
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    invoke-interface {v0}, Lcom/qihoo/security/locale/b;->b()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_5

    .line 869
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 872
    :catch_5
    move-exception v0

    .line 877
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 882
    :pswitch_7
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    move v1, v6

    .line 884
    :goto_7
    if-ge v1, v2, :cond_5

    .line 885
    :try_start_7
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/b;

    invoke-interface {v0}, Lcom/qihoo/security/locale/b;->d()V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_6

    .line 884
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_7

    .line 887
    :catch_6
    move-exception v0

    .line 892
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->h(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    goto/16 :goto_0

    .line 902
    :pswitch_8
    :try_start_8
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    goto/16 :goto_0

    .line 903
    :catch_7
    move-exception v0

    .line 904
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$a;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 767
    :catch_8
    move-exception v0

    goto/16 :goto_1

    .line 758
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
